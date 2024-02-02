package DevDojoMaratone.Javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {



    // metodo
    public void imprime (Estudante student){ // Variavel local estudante fazendo referencia a Classe estudante
        System.out.println(student.nome );    // pegando o endereço de memoria da classe Estudante
        System.out.println(student.idade);
        System.out.println(student.sexo);
    }
}
