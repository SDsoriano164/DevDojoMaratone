package DevDojoMaratone.Javacore.Bintroducaometodos.teste;

import DevDojoMaratone.Javacore.Bintroducaometodos.dominio.Estudante;
import DevDojoMaratone.Javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();   // estudante 01 referencia de objeto em memoria // Classe Estudante
        Estudante estudante02 = new Estudante();   // estudante 02 referencia de objeto em memoria // Casse Estudante


        // Classe no dominio para imprimir o estudante
        // importanto a classe

        ImpressoraEstudante impressora = new ImpressoraEstudante();


        estudante01.nome = "Myamoto Musashi";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Hinata";
        estudante02.idade = 21;
        estudante02.sexo = 'F';

        // chamada para o metodo

        //class    // metod  // argument
        impressora.imprime(estudante01); // passando o argumentos estudante 01 para o metodo executar e mostrar
        System.out.println("-----------");
        impressora.imprime(estudante02); // passando o argumento estudante02 para o metodo executar e mostrar




    }
}
