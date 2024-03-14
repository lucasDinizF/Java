package Animal;

import java.util.Objects;

public class Mamifero extends Vertebrado{

    @Override
    public String comparacaoVertebrado(String A, String B, String C) {
        if (Objects.equals(A, "vertebrado") && (Objects.equals(B, "mamifero") && (Objects.equals(C, "onivoro")))){
            return "homem";

        } else if (Objects.equals(A, "vertebrado") && (Objects.equals(B, "mamifero") && (Objects.equals(C, "herbivoro")))) {
            return "vaca";

        }
        return "animal";

    }


}
