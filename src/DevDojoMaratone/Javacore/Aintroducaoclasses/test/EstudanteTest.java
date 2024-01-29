package DevDojoMaratone.Javacore.Aintroducaoclasses.test;

import DevDojoMaratone.Javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {        //classe criada com void main para rodar os testes

        // Variavel de referencia
        // Classe estudante         nome do objeto         // criando objeto na classe
            Estudante                estudante      =          new Estudante();      // é usado new para inicializar a variavel pois agora se trata de objetos

        estudante.nome = "Sun Jinwoo";
        estudante.sexo = 'M';
        estudante.idade = 25;

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }
}
