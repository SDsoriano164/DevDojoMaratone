package DevDojoMaratone.Javacore.Bintroducaometodos.teste;

import DevDojoMaratone.Javacore.Bintroducaometodos.dominio.TestandoConceitos;
import DevDojoMaratone.Javacore.Bintroducaometodos.dominio.TestandoConceitosPassagemPorReferencia;


public class TestandoConceitosteste01 {

    public static void main(String[] args) {

                            // ex1
        String nome = " Pedro ";
        TestandoConceitos retornos01 = new TestandoConceitos();
        // passagem por valor ( valores ja setados no metodo)
        int resultado = retornos01.multiplicacaoEx1(5,6);

        System.out.println(resultado + 5 + nome);
        System.out.println(retornos01.multiplicacaoEx1(6,8));
        System.out.println(retornos01.multiplicacaoEx1(3,7));

                        // ex2
        TestandoConceitos retornos02 = new TestandoConceitos();

        // nao retorna valor
        retornos02.multiplicacaoEx2(4,3);

        TestandoConceitosPassagemPorReferencia professor = new TestandoConceitosPassagemPorReferencia();
        professor.nomeprofessor = "Mestre Splinter";
        professor.sexoProfessor = 'M';
        professor.idadeProfessor = 19;

        professor.imprimir();



    }

}
