package domain;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    public String nome;

    private List<String> conhecimentos = new ArrayList<>();

    public void adicionarConhecimento(String conhecimento) {
        this.conhecimentos.add(conhecimento);
    }

    public List<String> getConhecimentos() {
        return this.conhecimentos;
    }


}
