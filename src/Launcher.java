import immutable.Team;
import immutable.battle.BattleContext;
import immutable.entity.Entity;
import immutable.entity.Pokemon;
import immutable.move.EntityMove;
import immutable.move.Move;
import stattled.Types;
import utility.JSONPokemonParser;

import java.util.ArrayList;
import java.util.List;

public class Launcher {
    public static void main(String[] args) {
        // IMPORTANT
        Types.instantiate();
        List<Pokemon> pokemons = new JSONPokemonParser().getPokemonsFrom("src/static/pokedex.json");

        // INSTANCIATIONS
        // Pokémons
        Entity tortank = new Entity(pokemons.get(9 - 1));
        Entity massko = new Entity(pokemons.get(253 - 1));
        massko.setNickname("bro");
        // Équipes
        ArrayList<Entity> pokemons1 = new ArrayList<>();
        pokemons1.add(tortank);
        ArrayList<Entity> pokemons2 = new ArrayList<>();
        pokemons2.add(massko);
        Team team1 = new Team("Aqhbd", pokemons1);
        Team team2 = new Team("Hornymaster8000", pokemons2);
        // Capacités
        Move m_hydrocanon = new Move("Hydrocanon", Types.WATER, 10, 80, 5, 0, false);
        Move m_laser_glace = new Move("Laser Glace", Types.ICE, 10, 100, 10, 0, false);
        Move m_lame_feuille = new Move("Lame Feuille", Types.GRASS, 10, 100, 15, 0, false);
        Move m_vive_attaque = new Move("Vive-Attaque", Types.NORMAL, 10, 100, 30, 1, false);
        ArrayList<EntityMove> tortank_moves = new ArrayList<>();
        tortank_moves.add(new EntityMove(m_hydrocanon)); tortank_moves.add(new EntityMove(m_laser_glace));
        tortank.setMoves(tortank_moves);
        ArrayList<EntityMove> massko_moves = new ArrayList<>();
        massko_moves.add(new EntityMove(m_lame_feuille)); tortank_moves.add(new EntityMove(m_vive_attaque));
        massko.setMoves(massko_moves);

        BattleContext battleContext = BattleContext.getBattleContext(team1, team2);

        // TESTS
        battleContext.start();
    }
}
