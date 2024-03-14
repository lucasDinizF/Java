package Animal;

import java.util.Objects;

public class Inseto extends Invertebrado{

    @Override
    public String comparacaoInvertebrado(String A, String B, String C) {
        if (Objects.equals(A, "invertebrado") && (Objects.equals(B, "inseto") && (Objects.equals(C, "hematofago")))){
            return "pulga";

        } else if (Objects.equals(A, "invertebrado") && (Objects.equals(B, "inseto") && (Objects.equals(C, "herbivoro")))) {
            return "lagarta";

        }
        return "animal";

    }
}
