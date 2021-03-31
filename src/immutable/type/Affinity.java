package immutable.type;

public enum Affinity {
    IMMUNE("Immunisé", 0.0),
    WEAK("Faible", 2.0),
    RESISTANT("Résistant", 0.5),
    NEUTRAL("Neutre", 1.0);

    private double coefficient;
    private String name;

    private Affinity(String name, double coefficient) {
        this.name = name;
        this.coefficient = coefficient;
    }
}
