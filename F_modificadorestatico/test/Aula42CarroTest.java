package estudo.javacore.F_modificadorestatico.test;

import estudo.javacore.F_modificadorestatico.classes.Aula42Carro;

public class Aula42CarroTest {
    public static void main (String[] args){
        Aula42Carro carro1 = new Aula42Carro("BMW", 280);
        Aula42Carro carro2 = new Aula42Carro("AUDI", 290);
        Aula42Carro carro3 = new Aula42Carro("MERCEDES", 310);

        carro1.imprimir();
        carro2.imprimir();
        carro3.imprimir();

        System.out.println("#####################");
        System.out.println("#####################");

        //carro1.setVelocidadeLimite(220);
        //Aula42Carro.velocidadeLimite = 220;
        Aula42Carro.setVelocidadeLimite(220);

        carro1.imprimir();
        carro2.imprimir();
        carro3.imprimir();
    }
}
