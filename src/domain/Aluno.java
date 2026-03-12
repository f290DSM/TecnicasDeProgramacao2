package domain;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    public List<String> conhecimentos = new ArrayList<>();

    public void assimilarConhecimento(String conhecimento) {
        this.conhecimentos.add(conhecimento);
    }
}
