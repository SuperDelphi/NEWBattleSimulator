package stattled;

import immutable.type.Type;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Types {
    public static Type
            BUG,
            DARK,
            DRAGON,
            ELECTRIC,
            FAIRY,
            FIGHTING,
            FIRE,
            FLYING,
            GHOST,
            GRASS,
            GROUND,
            ICE,
            NORMAL,
            POISON,
            PSYCHIC,
            ROCK,
            STEEL,
            WATER;

    public static void instantiate() {
        // Actual Pokémon types

        BUG = new Type("Insecte");
        DARK = new Type("Ténèbres");
        DRAGON = new Type("Dragon");
        ELECTRIC = new Type("Électrik");
        FAIRY = new Type("Fée");
        FIGHTING = new Type("Combat");
        FIRE = new Type("Feu");
        FLYING = new Type("Vol");
        GHOST = new Type("Spectre");
        GRASS = new Type("Plante");
        GROUND = new Type("Sol");
        ICE = new Type("Glace");
        NORMAL = new Type("Normal");
        POISON = new Type("Poison");
        PSYCHIC = new Type("Psy");
        ROCK = new Type("Roche");
        STEEL = new Type("Acier");
        WATER = new Type("Eau");

        // BUG type
        ArrayList<Type> bugWeaknesses = new ArrayList<>();
        bugWeaknesses.add(FIRE);
        bugWeaknesses.add(ROCK);
        bugWeaknesses.add(FLYING);
        BUG.setWeaknesses(bugWeaknesses);
        ArrayList<Type> bugResistances = new ArrayList<>();
        bugResistances.add(FIGHTING);
        bugResistances.add(GRASS);
        bugResistances.add(GROUND);
        BUG.setResistances(bugResistances);

        // DARK type
        ArrayList<Type> darkWeaknesses = new ArrayList<>();
        darkWeaknesses.add(FIGHTING);
        darkWeaknesses.add(FAIRY);
        darkWeaknesses.add(BUG);
        DARK.setWeaknesses(darkWeaknesses);
        ArrayList<Type> darkResistances = new ArrayList<>();
        darkResistances.add(GHOST);
        darkResistances.add(DARK);
        DARK.setResistances(darkResistances);
        ArrayList<Type> darkImmunities = new ArrayList<>();
        darkImmunities.add(PSYCHIC);
        DARK.setImmunities(darkImmunities);

        // DRAGON type
        ArrayList<Type> dragonWeaknesses = new ArrayList<>();
        dragonWeaknesses.add(DRAGON);
        dragonWeaknesses.add(FAIRY);
        dragonWeaknesses.add(ICE);
        DRAGON.setWeaknesses(dragonWeaknesses);
        ArrayList<Type> dragonResistances = new ArrayList<>();
        dragonResistances.add(WATER);
        dragonResistances.add(ELECTRIC);
        dragonResistances.add(FIRE);
        dragonResistances.add(GRASS);
        DRAGON.setResistances(dragonResistances);

        // ELECTRIC type
        ArrayList<Type> eletricWeaknesses = new ArrayList<>();
        eletricWeaknesses.add(GROUND);
        ELECTRIC.setWeaknesses(eletricWeaknesses);
        ArrayList<Type> electricResistances = new ArrayList<>();
        electricResistances.add(STEEL);
        electricResistances.add(ELECTRIC);
        electricResistances.add(FLYING);
        ELECTRIC.setResistances(electricResistances);

        // FAIRY type
        ArrayList<Type> fairyWeaknesses = new ArrayList<>();
        fairyWeaknesses.add(STEEL);
        fairyWeaknesses.add(POISON);
        FAIRY.setWeaknesses(fairyWeaknesses);
        ArrayList<Type> fairyResistances = new ArrayList<>();
        fairyResistances.add(FIGHTING);
        fairyResistances.add(BUG);
        fairyResistances.add(DARK);
        FAIRY.setResistances(fairyResistances);
        ArrayList<Type> fairyImmunities = new ArrayList<>();
        fairyImmunities.add(DRAGON);
        FAIRY.setImmunities(fairyImmunities);

        // FIGHTING type
        ArrayList<Type> fightingWeaknesses = new ArrayList<>();
        fightingWeaknesses.add(FAIRY);
        fightingWeaknesses.add(PSYCHIC);
        fightingWeaknesses.add(FLYING);
        FIGHTING.setWeaknesses(fightingWeaknesses);
        ArrayList<Type> fightingResistances = new ArrayList<>();
        fightingResistances.add(BUG);
        fightingResistances.add(ROCK);
        fightingResistances.add(DARK);
        FIGHTING.setResistances(fightingResistances);

        // FIRE type
        ArrayList<Type> fireWeaknesses = new ArrayList<>();
        fireWeaknesses.add(WATER);
        fireWeaknesses.add(ROCK);
        fireWeaknesses.add(GROUND);
        FIRE.setWeaknesses(fireWeaknesses);
        ArrayList<Type> fireResistances = new ArrayList<>();
        fireResistances.add(STEEL);
        fireResistances.add(FAIRY);
        fireResistances.add(FIRE);
        fireResistances.add(ICE);
        fireResistances.add(BUG);
        fireResistances.add(GRASS);
        FIRE.setResistances(fireResistances);

        // FLYING type
        ArrayList<Type> flyingWeaknesses = new ArrayList<>();
        flyingWeaknesses.add(ELECTRIC);
        flyingWeaknesses.add(ICE);
        flyingWeaknesses.add(ROCK);
        FLYING.setWeaknesses(flyingWeaknesses);
        ArrayList<Type> flyingResistances = new ArrayList<>();
        flyingResistances.add(FIGHTING);
        flyingResistances.add(BUG);
        flyingResistances.add(GRASS);
        FLYING.setResistances(flyingResistances);
        ArrayList<Type> flyingImmunities = new ArrayList<>();
        flyingImmunities.add(GROUND);
        FLYING.setImmunities(flyingImmunities);

        // GHOST type
        ArrayList<Type> ghostWeaknesses = new ArrayList<>();
        ghostWeaknesses.add(GHOST);
        ghostWeaknesses.add(DARK);
        GHOST.setWeaknesses(ghostWeaknesses);
        ArrayList<Type> ghostResistances = new ArrayList<>();
        ghostResistances.add(BUG);
        ghostResistances.add(POISON);
        GHOST.setResistances(ghostResistances);
        ArrayList<Type> ghostImmunities = new ArrayList<>();
        ghostImmunities.add(FIGHTING);
        ghostImmunities.add(NORMAL);
        GHOST.setImmunities(ghostImmunities);

        // GRASS type
        ArrayList<Type> grassWeaknesses = new ArrayList<>();
        grassWeaknesses.add(FIRE);
        grassWeaknesses.add(ICE);
        grassWeaknesses.add(BUG);
        grassWeaknesses.add(POISON);
        grassWeaknesses.add(FLYING);
        GRASS.setWeaknesses(grassWeaknesses);
        ArrayList<Type> grassResistances = new ArrayList<>();
        grassResistances.add(WATER);
        grassResistances.add(ELECTRIC);
        grassResistances.add(GRASS);
        grassResistances.add(GROUND);
        GRASS.setResistances(grassResistances);

        // GROUND type
        ArrayList<Type> groundWeaknesses = new ArrayList<>();
        groundWeaknesses.add(WATER);
        groundWeaknesses.add(ICE);
        groundWeaknesses.add(GRASS);
        GROUND.setWeaknesses(groundWeaknesses);
        ArrayList<Type> groundResistances = new ArrayList<>();
        groundResistances.add(POISON);
        groundResistances.add(ROCK);
        GROUND.setResistances(groundResistances);
        ArrayList<Type> groundImmunities = new ArrayList<>();
        groundImmunities.add(ELECTRIC);
        GROUND.setImmunities(groundImmunities);

        // ICE type
        ArrayList<Type> iceWeaknesses = new ArrayList<>();
        iceWeaknesses.add(STEEL);
        iceWeaknesses.add(FIGHTING);
        iceWeaknesses.add(FIRE);
        iceWeaknesses.add(ROCK);
        ICE.setWeaknesses(iceWeaknesses);
        ArrayList<Type> iceResistances = new ArrayList<>();
        iceResistances.add(ICE);
        ICE.setResistances(iceResistances);

        // NORMAL type
        ArrayList<Type> normalWeaknesses = new ArrayList<>();
        normalWeaknesses.add(FIGHTING);
        NORMAL.setWeaknesses(normalWeaknesses);
        ArrayList<Type> normalImmunities = new ArrayList<>();
        normalImmunities.add(GHOST);
        NORMAL.setImmunities(normalImmunities);

        // POISON type
        ArrayList<Type> poisonWeaknesses = new ArrayList<>();
        poisonWeaknesses.add(PSYCHIC);
        poisonWeaknesses.add(GROUND);
        POISON.setWeaknesses(poisonWeaknesses);
        ArrayList<Type> poisonResistances = new ArrayList<>();
        poisonResistances.add(FIGHTING);
        poisonResistances.add(FAIRY);
        poisonResistances.add(BUG);
        poisonResistances.add(GRASS);
        poisonResistances.add(POISON);
        POISON.setResistances(poisonResistances);

        // PSYCHIC type
        ArrayList<Type> psychicWeaknesses = new ArrayList<>();
        psychicWeaknesses.add(BUG);
        psychicWeaknesses.add(GHOST);
        psychicWeaknesses.add(DARK);
        PSYCHIC.setWeaknesses(psychicWeaknesses);
        ArrayList<Type> psychicResistances = new ArrayList<>();
        psychicResistances.add(FIGHTING);
        psychicResistances.add(PSYCHIC);
        PSYCHIC.setResistances(psychicResistances);

        // ROCK type
        ArrayList<Type> rockWeaknesses = new ArrayList<>();
        rockWeaknesses.add(STEEL);
        rockWeaknesses.add(FIGHTING);
        rockWeaknesses.add(WATER);
        rockWeaknesses.add(GRASS);
        rockWeaknesses.add(GROUND);
        ROCK.setWeaknesses(rockWeaknesses);
        ArrayList<Type> rockResistances = new ArrayList<>();
        rockResistances.add(FIRE);
        rockResistances.add(NORMAL);
        rockResistances.add(POISON);
        rockResistances.add(FLYING);
        ROCK.setResistances(rockResistances);

        // STEEL type
        ArrayList<Type> steelWeaknesses = new ArrayList<>();
        steelWeaknesses.add(FIGHTING);
        steelWeaknesses.add(FIRE);
        steelWeaknesses.add(GROUND);
        STEEL.setWeaknesses(steelWeaknesses);
        ArrayList<Type> steelResistances = new ArrayList<>();
        steelResistances.add(STEEL);
        steelResistances.add(DRAGON);
        steelResistances.add(FAIRY);
        steelResistances.add(ICE);
        steelResistances.add(BUG);
        steelResistances.add(NORMAL);
        steelResistances.add(GRASS);
        steelResistances.add(PSYCHIC);
        steelResistances.add(ROCK);
        steelResistances.add(FLYING);
        STEEL.setResistances(steelResistances);
        ArrayList<Type> steelImmunities = new ArrayList<>();
        steelImmunities.add(POISON);
        STEEL.setImmunities(steelImmunities);

        // WATER type
        ArrayList<Type> waterWeaknesses = new ArrayList<>();
        waterWeaknesses.add(ELECTRIC);
        waterWeaknesses.add(GRASS);
        WATER.setWeaknesses(waterWeaknesses);
        ArrayList<Type> waterResistances = new ArrayList<>();
        waterResistances.add(STEEL);
        waterResistances.add(WATER);
        waterResistances.add(FIRE);
        waterResistances.add(ICE);
        WATER.setResistances(waterResistances);
    }

    public static Type get(String name) throws IllegalAccessException {
        Field[] types = Types.class.getFields();
        Type res = null;

        for (Field field : types) {
            if (field.getType() == Type.class && field.getName().equalsIgnoreCase(name)) {
                res = (Type)field.get(null);
            }
        }

        return res;
    }
}
