package domain;

import java.util.List;

public class Professor {

    private List<Aluno> alunos;

    public Professor(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void ensinar(Curso curso) {
        System.out.println("O professor está ensinando o curso: " 
        + curso.nome.toUpperCase());

        for (Aluno aluno : alunos) {
            for (String conhecimento : curso.getConhecimentos()) {
                aluno.assimilarConhecimento(conhecimento);
            }
        }  
    }

}