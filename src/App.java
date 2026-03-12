import java.util.Collections;

import domain.Curso;
import domain.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Professor p1 = new Professor(Collections.emptyList());
        Curso dsm = new Curso();
        dsm.nome = "Desenvolvimento de Software Multiplataforma";
        p1.ensinar(dsm);
    }
}
