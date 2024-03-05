package DevDojoMaratone.Javacore.HAssociacoes.teste;

import DevDojoMaratone.Javacore.HAssociacoes.domain.City;
import DevDojoMaratone.Javacore.HAssociacoes.domain.State;

public class CityStateTeste01 {
    public static void main(String[] args) {
        City city = new City("Campina Grande");

        City [] cities = {city};

        State state = new State("Paraíba",cities);


        state.setCities(cities);

        state.impress();

    }
}
