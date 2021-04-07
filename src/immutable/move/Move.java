/*
 * Copyright (c) DelphiStudio
 */

package immutable.move;

import immutable.type.Type;

public class Move {
    private String name;
    private Type type;
    private int basePower, baseAccuracy;
    private int maxPM;
    private int priority;
    private final boolean isAccuracyMutable;

    public Move(String name, Type type, int basePower, int baseAccuracy, int maxPM, int priority, boolean isAccuracyMutable) {
        this.name = name;
        this.type = type;
        this.basePower = basePower;
        this.baseAccuracy = baseAccuracy;
        this.maxPM = maxPM;
        this.priority = priority;
        this.isAccuracyMutable = isAccuracyMutable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAccuracyMutable() {
        return isAccuracyMutable;
    }

    public int getMaxPM() {
        return maxPM;
    }

    public void setMaxPM(int maxPM) {
        this.maxPM = maxPM;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getBasePower() {
        return basePower;
    }

    public void setBasePower(int basePower) {
        this.basePower = basePower;
    }

    public int getBaseAccuracy() {
        return baseAccuracy;
    }

    public void setBaseAccuracy(int baseAccuracy) {
        this.baseAccuracy = baseAccuracy;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
