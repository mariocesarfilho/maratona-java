package maratonajava.introducaoclasses.introducao.exercicios.ex01.test;

import maratonajava.introducaoclasses.introducao.exercicios.ex01.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.marca = "Mitsubishi";
        carro01.modelo = "Lancer";
        carro01.ano = 2010;

        carro02.marca = "Toyota";
        carro02.modelo = "SW4";
        carro02.ano = 2025;

        System.out.println("Carro 01 - Marca: " + carro01.marca + " Modelo: " + carro01.modelo + " Ano: " + carro01.ano);
        System.out.println("Carro 02 - Marca: " + carro02.marca + " Modelo: " + carro02.modelo + " Ano: " + carro02.ano);
    }
}
