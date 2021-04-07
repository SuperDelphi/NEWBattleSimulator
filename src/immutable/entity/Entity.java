package immutable.entity;

import immutable.Ability;
import immutable.battle.BattleContext;
import immutable.move.EntityMove;
import immutable.move.Move;
import immutable.status.NonVolatileStatus;
import immutable.status.VolatileStatus;

import java.util.ArrayList;

public class Entity {
    private String nickname;
    private Pokemon pokemon;
    private VolatileStatus volatileStatus;
    private NonVolatileStatus nonVolatileStatus;
    private int maxHP, currentHP;
    private ArrayList<EntityMove> moves;
    private Ability ability;

    public Entity(Pokemon pokemon) {
        this.pokemon = pokemon;
        this.maxHP = pokemon.getHP(); // TODO Changer cette instruction (pas correcte)
        this.currentHP = pokemon.getHP();
        this.moves = new ArrayList<>();
    }

    public Entity(Pokemon pokemon, Ability ability, ArrayList<EntityMove> moves) {
        this.pokemon = pokemon;
        this.moves = moves;
    }

    public void useMove(int num, BattleContext context) {
        EntityMove entityMove = moves.get(num);
        // TODO Refaire cette partie
        Entity enemy = context.getEnemy(this);
        enemy.setCurrentHP(Math.max(0, enemy.currentHP - entityMove.getDamages()));
    }

    public boolean isKO() {
        return currentHP == 0;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public String getName() {
        if (nickname == null) {
            return pokemon.getName();
        } else {
            return nickname;
        }
    }

    public String getNickname() {
        return nickname;
    }

    public String getFullName() {
        if (nickname != null) {
            return nickname + " (" + getPokemon().getName() + ")";
        } else {
            return getPokemon().getName();
        }
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Pokemon getSpecies() {
        return pokemon;
    }

    public void setSpecies(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public ArrayList<EntityMove> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<EntityMove> moves) {
        this.moves = moves;
    }

    public VolatileStatus getVolatileStatus() {
        return volatileStatus;
    }

    public void setVolatileStatus(VolatileStatus volatileStatus) {
        this.volatileStatus = volatileStatus;
    }

    public NonVolatileStatus getNonVolatileStatus() {
        return nonVolatileStatus;
    }

    public void setNonVolatileStatus(NonVolatileStatus nonVolatileStatus) {
        this.nonVolatileStatus = nonVolatileStatus;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    @Override
    public String toString() {
        StringBuilder formattedMoves = new StringBuilder();

        return pokemon + "\n"
                + "Nickname: " + nickname + "\n"
                + "Moves: " + formattedMoves;
    }
}
