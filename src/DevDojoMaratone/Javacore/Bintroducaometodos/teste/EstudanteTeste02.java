package DevDojoMaratone.Javacore.Bintroducaometodos.teste;

import DevDojoMaratone.Javacore.Bintroducaometodos.dominio.Estudante;
import DevDojoMaratone.Javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();   // estudante 01 referencia de objeto em memoria // Classe Estudante
        Estudante estudante02 = new Estudante();   // estudante 02 referencia de objeto em memoria // Casse Estudante


        // Classe no dominio para imprimir o estudante
        // importanto a classe

        estudante01.nome = "Myamoto Musashi";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Hinata";
        estudante02.idade = 21;
        estudante02.sexo = 'F';


        estudante01.imprime();
        estudante02.imprime();
    }
}
