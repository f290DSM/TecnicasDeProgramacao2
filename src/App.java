import domain.Curso;
import domain.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Professor p1 = new Professor();
        Curso dsm = new Curso();

        p1.ensinar(dsm);
    }
}
