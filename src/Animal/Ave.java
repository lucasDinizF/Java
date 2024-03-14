package Animal;


import java.util.Objects;

public class Ave extends Vertebrado{

    @Override
    public String comparacaoVertebrado(String A, String B, String C) {
        if (Objects.equals(A, "vertebrado") && (Objects.equals(B, "ave") && (Objects.equals(C, "carnivoro")))){
            return "aguia";

        } else if (Objects.equals(A, "vertebrado") && (Objects.equals(B, "ave") && (Objects.equals(C, "onivoro")))){
            return "pomba";

        }
        return "animal";
    }

}
