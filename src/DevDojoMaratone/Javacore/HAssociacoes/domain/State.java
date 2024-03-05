package DevDojoMaratone.Javacore.HAssociacoes.domain;

public class State {
    private String nome;

    private City [] cities;

    public void impress(){
        System.out.println(getNome());
        City [] cities = getCities();
        if (cities != null){
            for (City city : cities){
                System.out.println(city.getNome());
            }
        }
    }



    public State(String nome, City[] cities) {
        this.nome = nome;
        this.cities = cities;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }
}
