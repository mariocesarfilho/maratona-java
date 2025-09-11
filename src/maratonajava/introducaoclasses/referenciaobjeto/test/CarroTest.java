package maratonajava.introducaoclasses.referenciaobjeto.test;

import maratonajava.introducaoclasses.referenciaobjeto.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Hyundai";
        carro1.modelo = "Azzira";
        carro1.ano = 1990;

        carro2.marca = "Chevrolet";
        carro2.modelo = "Chevet";
        carro2.ano = 1989;


        //Carro1 está fazendo referencia para o mesmo objeto que o carro2 está fazendo
        carro1 = carro2;


        System.out.println("Carro1: " + carro1.marca + " Modelo: " + carro1.modelo + " Ano de Fabricação: " + carro1.ano);
        System.out.println("Carro2: " + carro2.marca + " Modelo: " + carro2.modelo + " Ano de Fabricação: " + carro1.ano);

    }
}
