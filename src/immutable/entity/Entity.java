package immutable.entity;

import immutable.Ability;
import immutable.Move;

import java.util.ArrayList;

public class Entity {
    private String nickname;
    private Species species;
    private ArrayList<Move> moves;
    private Ability ability;

    public Entity(Species species) {
        this.species = species;
        this.moves = new ArrayList<>();
    }

    public Entity(Species species, String nickname, Ability ability, ArrayList<Move> moves) {
        this.species = species;
        this.moves = moves;
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Move> moves) {
        this.moves = moves;
    }

    @Override
    public String toString() {
        StringBuilder formattedMoves = new StringBuilder();

        return species + "\n"
                + "Nickname: " + nickname + "\n"
                + "Moves: " + formattedMoves;
    }
}
