package DevDojoMaratone.Javacore.Aintroducaoclasses.test.ExerciciosTeste;

import DevDojoMaratone.Javacore.Aintroducaoclasses.ExerciciosDomain.Biblioteca;

import java.util.Date;

public class LivroBibliotecaTeste {
    public static void main(String[] args) {
        Biblioteca livro = new Biblioteca();
        livro.Autor = "P.J. Deitel";
        livro.nomeLivro = "Java®: Como Programar";
        livro.editora = "Pearson Universidades; 10ª edição (24 junho 2016)";

        livro.emprestado = false;
        livro.dataEntrega = new Date();
        livro.livroEmprestadoA = " Pedro ";

        System.out.println("Nome livro : " + livro.Autor);
        System.out.println("Nome livro : " + livro.dataEntrega);
        System.out.println("Nome livro : " + livro.livroEmprestadoA);

        if (livro.emprestado) {
            System.out.println("Livro emprestado");
        } else {
            System.out.println("Livro não emprestado");
        }

        }

    }

