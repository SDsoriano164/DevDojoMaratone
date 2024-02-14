package DevDojoMaratone.Javacore.Aintroducaoclasses.ExerciciosDomain;

import DevDojoMaratone.Javacore.Aintroducaoclasses.domain.Carro;

public class CarroTestePrivates {
    public static void main(String[] args) {
        // Crie uma instância da classe Carro
        Carro carro = new Carro();

        // Inicialize o carro com valores
        int[] producao = {2003,2012}; // Exemplo de anos de produção
        int[] valores = {15000, 18000, 20000}; // Exemplo de valores

        carro.init("Mazda Rx8", "Mazda", producao, "Carro espotivo", "Cupê de 4 portas", "Ikuo Maeda", "V8", "Automático", 60, 12, valores);

        // Exiba informações sobre o carro
        carro.exibirInformações();

        // Encontre e exiba o valor mais alto entre o array de valores
        int maiorValor = carro.maiorValor();
        System.out.println("Maior valor: R$" + maiorValor);

        carro.setligar();
        carro.getLigadoOuDesligado();
        carro.setDesligar();
        carro.getLigadoOuDesligado();
    }
}
