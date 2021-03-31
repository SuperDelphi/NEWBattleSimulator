package immutable.entity;

import immutable.type.TypeSet;

public class Species {
    private int id;
    private String name;
    private TypeSet typeSet;

    private int HP;
    private int ATK;
    private int DEF;
    private int SPA;
    private int SPD;
    private int SPE;

    public Species(int id, String name, TypeSet typeSet) {
        this.id = id;
        this.name = name;
        this.typeSet = typeSet;
    }

    public Species(int id, String name, TypeSet typeSet, int HP, int ATK, int DEF, int SPA, int SPD, int SPE) {
        this.id = id;
        this.name = name;
        this.typeSet = typeSet;
        setStats(HP, ATK, DEF, SPA, SPD, SPE);
    }

    public void setStats(int HP, int ATK, int DEF, int SPA, int SPD, int SPE) {
        this.HP = HP;
        this.ATK = ATK;
        this.DEF = DEF;
        this.SPA = SPA;
        this.SPD = SPD;
        this.SPE = SPE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeSet getTypeSet() {
        return typeSet;
    }

    public void setTypeSet(TypeSet typeSet) {
        this.typeSet = typeSet;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }

    public int getSPA() {
        return SPA;
    }

    public void setSPA(int SPA) {
        this.SPA = SPA;
    }

    public int getSPD() {
        return SPD;
    }

    public void setSPD(int SPD) {
        this.SPD = SPD;
    }

    public int getSPE() {
        return SPE;
    }

    public void setSPE(int SPE) {
        this.SPE = SPE;
    }

    @Override
    public String toString() {
        return "Species{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeSet=" + typeSet +
                ", HP=" + HP +
                ", ATK=" + ATK +
                ", DEF=" + DEF +
                ", SPA=" + SPA +
                ", SPD=" + SPD +
                ", SPE=" + SPE +
                '}';
    }
}
