package estudo.javacore.D_sobrecargaconstrutores.test;

import estudo.javacore.D_sobrecargaconstrutores.classes.Aula40Estudante;

//

public class Aula40EstudanteTest {
    public static void main(String[] args) {
        Aula40Estudante est = new Aula40Estudante("123456", "Rodrigo Muniz", new double[]{5, 7, 9}, "12/13/2019");
        est.imprime();


    }
}
