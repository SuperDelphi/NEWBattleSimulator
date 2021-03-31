package immutable.type;

import java.util.ArrayList;

public class Type {
    private String name;

    private ArrayList<Type> weaknesses = new ArrayList<>();
    private ArrayList<Type> resistances = new ArrayList<>();
    private ArrayList<Type> immunities = new ArrayList<>();

    public Type(String name) {
        this.name = name;
    }

    public Type(String name, ArrayList<Type> weaknesses, ArrayList<Type> resistances, ArrayList<Type> immunities) {
        this.name = name;
        this.immunities = immunities;
        this.resistances = resistances;
        this.weaknesses = weaknesses;
    }

    public ArrayList<Type> getWeaknesses() {
        return weaknesses;
    }

    public ArrayList<Type> getResistances() {
        return resistances;
    }

    public ArrayList<Type> getImmunities() {
        return immunities;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeaknesses(ArrayList<Type> weaknesses) {
        this.weaknesses = weaknesses;
    }

    public void setResistances(ArrayList<Type> resistances) {
        this.resistances = resistances;
    }

    public void setImmunities(ArrayList<Type> immunities) {
        this.immunities = immunities;
    }

    public boolean isImmuneTo(Type type) {
        return getImmunities().contains(type);
    }

    public boolean isWeakTo(Type type) {
        return getWeaknesses().contains(type);
    }

    public boolean isResistantTo(Type type) {
        return getResistances().contains(type);
    }

    public boolean isNeutralTo(Type type) {
        return !isImmuneTo(type) && !isResistantTo(type) && !isWeakTo(type);
    }

    public Affinity getAffinityTo(Type type) {
        if (isImmuneTo(type)) {
            return Affinity.IMMUNE;
        } else if (isResistantTo(type)) {
            return Affinity.RESISTANT;
        } else if (isWeakTo(type)) {
            return Affinity.WEAK;
        } else {
            return Affinity.NEUTRAL;
        }
    }

    @Override
    public String toString() {
        StringBuilder formattedWeaknesses = new StringBuilder();
        StringBuilder formattedResistances = new StringBuilder();
        StringBuilder formattedImmunities = new StringBuilder();

        for (int i = 0; i < weaknesses.size(); i++) {
            formattedWeaknesses.append(weaknesses.get(i).getName()).append(i == weaknesses.size() - 1 ? "" : ", ");
        }

        for (int i = 0; i < resistances.size(); i++) {
            formattedResistances.append(resistances.get(i).getName()).append(i == resistances.size() - 1 ? "" : ", ");
        }

        for (int i = 0; i < immunities.size(); i++) {
            formattedImmunities.append(immunities.get(i).getName()).append(i == immunities.size() - 1 ? "" : ", ");
        }

        return "Type " + name + " :\n"
                + "--------------------\n"
                + "Faiblesses : " +  formattedWeaknesses + "\n"
                + "Résistances: " + formattedResistances + "\n"
                + "Immunités : " + formattedImmunities;
    }
}
