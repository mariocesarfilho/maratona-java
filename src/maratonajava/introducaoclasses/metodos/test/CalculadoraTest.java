package maratonajava.introducaoclasses.metodos.test;

import maratonajava.introducaoclasses.metodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args){

        Calculadora calc = new Calculadora();


        calc.soma();
        calc.subtracao();
        //Metodo com argumentos
        calc.multiplicacao(10,40);

        System.out.println(calc);
    }
}
