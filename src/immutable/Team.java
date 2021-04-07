/*
 * Copyright (c) DelphiStudio
 */

package immutable;

import immutable.entity.Entity;

import java.util.ArrayList;

public class Team {
    private String trainerName = "Anonyme";
    private ArrayList<Entity> pokemons;
    private Entity activePokemon;

    public Team(String trainerName, ArrayList<Entity> pokemons) {
        this.trainerName = trainerName;
        this.pokemons = pokemons;
        this.activePokemon = pokemons.get(0);
    }

    public Entity getActivePokemon() {
        return activePokemon;
    }

    public void setActivePokemon(int num) {
        this.activePokemon = pokemons.get(num);
    }

    public Entity getPokemon(int num) {
        return pokemons.get(num);
    }

    public ArrayList<Entity> getPokemons() {
        return this.pokemons;
    }

    public String getTrainerName() {
        return this.trainerName;
    }

    public int getSize() {
        return pokemons.size();
    }

    public boolean isKO() {
        boolean res = true;
        int i = 0;

        while (i < pokemons.size() && res) {
            if (!pokemons.get(i).isKO()) {
                res = false;
            }
        }

        return res;
    }

    @Override
    public String toString() {
        return "Team{" +
                "pokemons=" + pokemons +
                '}';
    }
}
