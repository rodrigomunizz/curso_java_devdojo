package estudo.javacore.O_exception.test;

public class Aula67ErrorTest {
    public static void main(String[] args) {
        stackoverflowError();
    }

    public static void stackoverflowError(){
        stackoverflowError();
    }
}
