import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    // Classe Cidade
    static class City {
        private final int x;
        private final int y;

        public City(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    // Serviço para resolver o problema do caixeiro viajante
    static class TSPService {

        // Calcula a distância total de uma rota
        public double calculateTotalDistance(List<City> route) {
            double totalDistance = 0;

            for (int i = 0; i < route.size() - 1; i++) {
                int dx = route.get(i + 1).getX() - route.get(i).getX();
                int dy = route.get(i + 1).getY() - route.get(i).getY();
                totalDistance += Math.sqrt(dx * dx + dy * dy);
            }

            // Retorna para a cidade de origem
            int dxFinal = route.get(0).getX() - route.get(route.size() - 1).getX();
            int dyFinal = route.get(0).getY() - route.get(route.size() - 1).getY();
            totalDistance += Math.sqrt(dxFinal * dxFinal + dyFinal * dyFinal);

            return totalDistance;
        }

        // Implementa o algoritmo de próxima permutação
        public boolean nextPermutation(List<City> route) {
            int n = route.size();
            int i = n - 2;

            while (i >= 0 && compare(route.get(i), route.get(i + 1)) >= 0) {
                i--;
            }

            if (i < 0) {
                return false;
            }

            int j = n - 1;
            while (compare(route.get(j), route.get(i)) <= 0) {
                j--;
            }

            Collections.swap(route, i, j);
            Collections.reverse(route.subList(i + 1, n));
            return true;
        }

        // Compara duas cidades para ordenação lexicográfica
        private int compare(City c1, City c2) {
            if (c1.getX() != c2.getX()) {
                return Integer.compare(c1.getX(), c2.getX());
            }
            return Integer.compare(c1.getY(), c2.getY());
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Inicializa as cidades
        List<City> cities = new ArrayList<>();
        cities.add(new City(0, 0));
        cities.add(new City(1, 2));
        cities.add(new City(3, 1));
        cities.add(new City(5, 3));
        cities.add(new City(2, 5));
        cities.add(new City(6, 6));
        cities.add(new City(7, 8));
        cities.add(new City(9, 9));
        cities.add(new City(4, 7));
        cities.add(new City(8, 2));

        TSPService tspService = new TSPService();

        // Inicializa variáveis para encontrar a melhor rota
        List<City> bestRoute = new ArrayList<>(cities);
        double shortestDistance = Double.MAX_VALUE;

        List<City> currentRoute = new ArrayList<>(cities);

        System.out.println("Cities:");
        for (City city : currentRoute) {
            System.out.println(city);
        }

        do {
            double currentDistance = tspService.calculateTotalDistance(currentRoute);
            if (currentDistance < shortestDistance) {
                shortestDistance = currentDistance;
                bestRoute = new ArrayList<>(currentRoute);
            }
        } while (tspService.nextPermutation(currentRoute));

        // Exibe os resultados
        System.out.println("\nBest route found:");
        for (City city : bestRoute) {
            System.out.println(city);
        }
        System.out.println("\nTotal distance: " + shortestDistance);

        // Exibe as distâncias entre as cidades
        System.out.println("\nRoute details:");
        double accumulatedDistance = 0;
        for (int i = 0; i < bestRoute.size() - 1; i++) {
            int dx = bestRoute.get(i + 1).getX() - bestRoute.get(i).getX();
            int dy = bestRoute.get(i + 1).getY() - bestRoute.get(i).getY();
            double distance = Math.sqrt(dx * dx + dy * dy);
            System.out.println("From " + bestRoute.get(i) + " to " + bestRoute.get(i + 1) +
                    " -> Distance: " + distance);
            accumulatedDistance += distance;
        }

        int dxFinal = bestRoute.get(0).getX() - bestRoute.get(bestRoute.size() - 1).getX();
        int dyFinal = bestRoute.get(0).getY() - bestRoute.get(bestRoute.size() - 1).getY();
        double finalDistance = Math.sqrt(dxFinal * dxFinal + dyFinal * dyFinal);
        System.out.println("From " + bestRoute.get(bestRoute.size() - 1) + " to " + bestRoute.get(0) +
                " -> Distance: " + finalDistance);
        accumulatedDistance += finalDistance;

        System.out.println("\nTotal accumulated distance: " + accumulatedDistance);
    }
}
