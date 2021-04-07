/*
 * Copyright (c) DelphiStudio
 */

package immutable.battle;import immutable.Team;
import immutable.entity.Entity;

import java.util.Scanner;

public class BattleContext {
    private Team team1, team2;
    private static BattleContext battleContext;
    private int round;

    private BattleContext(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public static BattleContext getBattleContext(Team team1, Team team2) {
        if (battleContext == null) {
            return battleContext = new BattleContext(team1, team2);
        } else {
            return battleContext;
        }
    }

    public void start() {
        reset();
        setActivePokemon(team1, 0);
        setActivePokemon(team2, 0);
        loop();
    }

    public void loop() {
        Scanner sc = new Scanner(System.in);

        while (!team1.isKO() && !team2.isKO()) { // Tant que les deux équipes ont des Pokémons non KOs
            displayContext();
//            sc.nextLine();
            // TEST
            team1.getActivePokemon().useMove(0, this);
        }
    }

    public void reset() {
        this.round = 0;
    }

    public Entity getEnemy(Entity from) {
        if (team1.getPokemons().contains(from)) {
            return team2.getActivePokemon();
        } else {
            return team1.getActivePokemon();
        }
    }

    // Méthodes d'affichage

    public void setActivePokemon(Team team, int num) {
        team.setActivePokemon(num);
        System.out.println(team.getTrainerName() + " envoie " + team.getActivePokemon().getName() + " au combat !");
    }

    public void displayContext() {
        System.out.println(
                "----------------------------------------------------------------------\n"
                + team1.getActivePokemon().getFullName() + " [" + team1.getTrainerName() + "]"
                + "                   "
                + team2.getActivePokemon().getFullName() + " [" + team2.getTrainerName() + "]\n"
                + team1.getActivePokemon().getCurrentHP() + "/" + team1.getActivePokemon().getMaxHP()
                + "                   "
                + team2.getActivePokemon().getCurrentHP() + "/" + team2.getActivePokemon().getMaxHP()
                + "\n----------------------------------------------------------------------"
        );
    }

    @Override
    public String toString() {
        return "- Contexte de combat -\n"
                + team1.toString() + "\n"
                + team2.toString();
    }
}