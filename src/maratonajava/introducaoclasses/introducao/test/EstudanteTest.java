package maratonajava.introducaoclasses.introducao.test;

import maratonajava.introducaoclasses.introducao.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args){
        Estudante estudante = new Estudante();

        estudante.nome = "Matheus";
        estudante.idade = 22;
        estudante.sexo = 'M';

        System.out.println("Nome: " + estudante.nome + " Idade: " + estudante.idade + " Sexo: " + estudante.sexo);
    }
}
