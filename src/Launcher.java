import immutable.Ability;
import immutable.entity.Entity;
import immutable.entity.Species;
import immutable.type.TypeSet;
import stattled.Types;
import utility.JSONPokemonParser;

import java.util.ArrayList;
import java.util.List;

public class Launcher {
    public static void main(String[] args) {
//        Types.instantiate();

//        Tests
//        TypeSet typeSet = new TypeSet(Types.FIRE, Types.FIGHTING);
//        Species tronche = new Species(1, "Tronche", typeSet);
//        tronche.setStats(100, 90, 45, 40, 60, 78);
//        Entity tronche1 = new Entity(tronche);
//
//        System.out.println(tronche1);

        List<Species> pokemons = new JSONPokemonParser().getPokemonsFrom("src/static/poketest.json");
        System.out.println(pokemons.get(0).getTypeSet());
    }
}
