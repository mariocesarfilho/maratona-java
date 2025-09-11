package maratonajava.introducaoclasses.metodos.test;

import maratonajava.introducaoclasses.metodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args){

        Calculadora calc = new Calculadora();


        //calc.soma();
        //calc.subtracao(10.8,3.0);
        //Metodo com argumentos
        //calc.multiplicacao(10,40);
        //Metodo com retorno
        //calc.divisao(10,5);

        System.out.println(calc.divisao(10,0));
        System.out.println(calc.subtracao(10,2));
    }
}
