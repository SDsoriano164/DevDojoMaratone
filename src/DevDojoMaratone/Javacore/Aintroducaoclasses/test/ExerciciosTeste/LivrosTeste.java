package DevDojoMaratone.Javacore.Aintroducaoclasses.test.ExerciciosTeste;

import DevDojoMaratone.Javacore.Aintroducaoclasses.ExerciciosDomain.Livros;

public class LivrosTeste {
    public static void main(String[] args) {
        Livros livros = new Livros();

        livros.Autor = "P.J. Deitel";
        livros.nomeLivro = "Java®: Como Programar";
        livros.editora = "Pearson Universidades; 10ª edição (24 junho 2016)";
        livros.numeroPaginas = 987;
        livros.idioma= " Português";

        livros.categoria = new String[1];
        livros.categoria[0] = "Programação";

        System.out.println(livros.Autor);
        System.out.println(livros.nomeLivro);
        System.out.println(livros.editora);
        System.out.println(livros.numeroPaginas);

        for(String livro: livros.categoria) {
            System.out.println(livro);
        }


    }
}
