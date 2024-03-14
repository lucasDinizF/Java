package Animal;

import java.util.Objects;

public class Anelideo extends Invertebrado{

    @Override
    public String comparacaoInvertebrado(String A, String B, String C) {
        if (Objects.equals(A, "invertebrado") && (Objects.equals(B, "anelideo") && (Objects.equals(C, "hematofago")))){
            return "sanguessuga";

        } else if (Objects.equals(A, "invertebrado") && (Objects.equals(B, "anelideo") && (Objects.equals(C, "onivoro")))) {
            return "minhoca";

        }
        return "animal";
    }

}
