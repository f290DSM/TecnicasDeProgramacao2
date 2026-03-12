package domain;

public class Professor {

    public void ensinar(Curso curso) {
        System.out.println("O professor está ensinando o curso: " 
        + curso.nome.toUpperCase());
    }

}