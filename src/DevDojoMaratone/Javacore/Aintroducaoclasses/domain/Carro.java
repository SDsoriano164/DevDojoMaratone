package DevDojoMaratone.Javacore.Aintroducaoclasses.domain;




public class Carro {

    private String nome;
    // visão geral

    private int [] produção;
    private String fabricante;

    //modelo
    private String classe;
    private String Carroceria;
    private String designer;

    // ficha técnica
    private String motor;

    private String transmissão;



    //Dimensões

    private int tanque;

    private int consumo;


    private int [] valores;


    private int maior = 0;

    private boolean ligado;


    public void init(String nome, String Fabricante,int []produção, String classe, String carroceria, String designer, String motor, String transmissão ,int tanque, int consumo,int []valores){
     this.nome = nome;
     this.fabricante = Fabricante;
     this.produção = produção;
     this.classe = classe;
     this.Carroceria = carroceria;
     this.designer = designer;
     this.motor = motor;
     this.transmissão = transmissão;
     this.tanque = tanque;
     this.consumo = consumo;
     this.valores = valores;
    }

    public void exibirInformações(){
        System.out.println("Nome do carro : " + this.nome);
        System.out.println("Fabricante : " + this.fabricante);
        System.out.println("classe : "+ this.classe);
        System.out.println("carroceria :"+ this.Carroceria);
        System.out.println("Designer: "+ this.designer);
        System.out.println("motor :" + motor);
        System.out.println("transmissão :"+ transmissão);
        System.out.println("tanque :" + tanque);
        System.out.println("consumo :" + consumo);

        System.out.println("Anos de produções");
        for (int ano :produção){
            System.out.print(ano + "/ ");
        }

        System.out.println("\nValores : ");
        for (int valor : valores){
            System.out.println("R$" +valor);
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

    // ações
    public void setligar (){
        this.ligado = true;
    }

    public void setDesligar (){
        this.ligado = false;
    }

    public boolean getLigadoOuDesligado (){
        if ( ligado == true){
            System.out.println("O carro está ligado");
        }else{
            System.out.println("O carro esta desligado");
        }
        return ligado;
    }





    }


