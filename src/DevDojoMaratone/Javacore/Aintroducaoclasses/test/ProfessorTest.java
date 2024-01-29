package DevDojoMaratone.Javacore.Aintroducaoclasses.test;

import DevDojoMaratone.Javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nomeprofessor = "Kakashi";
        professor.idadeProfessor = 30;
        professor.sexoProfessor = 'M';

        System.out.println("name :" +professor.nomeprofessor + " Sex :" + professor.sexoProfessor + " age :" + professor.idadeProfessor);

    }
}
