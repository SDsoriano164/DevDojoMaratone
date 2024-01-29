package DevDojoMaratone.Javacore.Aintroducaoclasses.test;

import DevDojoMaratone.Javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTeste02 { // classe de testes
    public static void main(String[] args) {
        new Estudante(); // criando espaço em memoria sem referência

        Estudante estudante = new Estudante(); // criando espaço em memoria com o objeto estudante
        Estudante estudante2 = new Estudante(); // Criando novo objeto em memoria na classe Estudante


        // sempre verificar as atribuições na classe principal pois tudo que estiver la vai ser impresso

        // porem você consegue alterar, mas sempre que ocorrer a chamada para a a classe vai ser referenciado a o que foi criado na classe principal.

        estudante.nome ="Zabuza"; // inicialização a referencia estudante.

        //estudante 1
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        //estudante 2
        // imprime valores padroes porque nao foram inizializadas as referencias
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);

    }

}
