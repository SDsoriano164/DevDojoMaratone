package DevDojoMaratone.Javacore.Aintroducaoclasses.test.ExerciciosTeste;

import DevDojoMaratone.Javacore.Aintroducaoclasses.ExerciciosDomain.LivroLivraria;

public class LivroLivrariaTeste {
    public static void main(String[] args) {
        LivroLivraria livros = new LivroLivraria();


        livros.Autor = "P.J. Deitel";
        livros.nomeLivro = "Java®: Como Programar";
        livros.editora = "Pearson Universidades; 10ª edição (24 junho 2016)";
        livros.numeroPaginas = 987;
        livros.idioma= " Português";

        livros.categoria = new String[1];
        livros.categoria[0] = "Programação";
        livros.preco = 68;
        livros.ISBN10 = 1231512314;
        livros.ISBN13 = 1831536714;

        System.out.println("Autor : " +livros.Autor);
        System.out.println("Nome do Livro :" + livros.nomeLivro);
        System.out.println("Editora : " + livros.editora);
        System.out.println("Numero de paginas :"+ livros.numeroPaginas);
        System.out.println("Preço : " + livros.preco);




        for(String livro: livros.categoria) {
            System.out.println("Categoria : " + livro);

    }

    }
}
