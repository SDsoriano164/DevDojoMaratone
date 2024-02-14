package DevDojoMaratone.Javacore.Aintroducaoclasses.domain;




public class Carro {

    // atributos da classe
    private String nome;
    private String modelo;
    private int  ano;

    private int [] valores;


    private int maior = 0;


    public void setNome(String nome){
        this.nome = nome;

    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setValores (int [] valores){
        this.valores = valores;
    }

    public void exibirInformações(){
        System.out.println(this.nome);
        System.out.println(this.ano);
        System.out.println(this.modelo);

        System.out.println("Valores");
        for (int valor : valores){
            System.out.println(valor);
        }
    }
    public int maiorValor(){
        for (int i = 0; i <valores.length ; i++) {
            if (valores[i] > maior){
                maior = valores[i];
            }
        }
        return this.maior;
    }




    }


