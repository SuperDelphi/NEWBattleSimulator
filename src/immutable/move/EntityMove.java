/*
 * Copyright (c) DelphiStudio
 */

package immutable.move;

public class EntityMove {
    private Move move;
    private int currentPM;
    private Double currentAccuracy;

    public EntityMove(Move move) {
        this.move = move;
        this.currentPM = move.getMaxPM();
        this.currentAccuracy = (double) move.getBaseAccuracy();
    }

    // TODO Refaire ça
    public int getDamages() {
        return move.getBasePower();
    }
}
