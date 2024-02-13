package DevDojoMaratone.Javacore.Aintroducaoclasses.ExerciciosDomain;

public class Lampada {
    public String marca;
    public byte potência;

    public short potênciaIndandesenteEquivalente;

    public String CorClara;

    public int tensão;

    public String [] tipos;
    public Boolean TipoAbajur;
    private boolean ligada;



    public void setligar (){
        this.ligada = true;
    }

    public void setDesligar (){
        this.ligada = false;
    }

    public void getLigada (){
        if (ligada == true){
            System.out.println("A lampada está ligada ");
        }else{
            System.out.println(" A lampada está desligada");
        }

    }


    public void Sobre(){
        System.out.println("°16 Milhões de Cores e Ajuste de Brilho: Envolva sua casa em uma atmosfera aconchegante escolhendo a cor e a intensidade da sua lâmpada Tapo para cada momento do dia.");
        System.out.println("°Aplicativo Tapo: Controle as cores e intensidade da sua iluminação pelo Smartphone de qualquer lugar");
        System.out.println("°Compatível com Alexa e Assistente Google: Use o comando de voz para gerenciar e controlar seu dispositivos inteligente Tapo");
        System.out.println("°Fácil Instalação: Com o aplicativo Tapo, você instala e configura sua lâmpada inteligente em poucas etapas. Não é necessário HUB");


    }
}
