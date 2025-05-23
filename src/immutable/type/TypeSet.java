package immutable.type;

import stattled.Types;

public class TypeSet {
    private Type firstType, secondType;

    public TypeSet(Type firstType) {
        this.firstType = firstType;
    }

    public TypeSet(Type firstType, Type secondType) {
        this.firstType = firstType;
        this.secondType = secondType;
    }

    public TypeSet(String firstTypeName) throws IllegalAccessException {
        this.firstType = Types.get(firstTypeName);
    }

    public TypeSet(String firstTypeName, String secondTypeName) throws IllegalAccessException {
        this.firstType = Types.get(firstTypeName);
        this.secondType = Types.get(secondTypeName);
    }

    public Type getFirstType() {
        return firstType;
    }

    public void setFirstType(Type firstType) {
        this.firstType = firstType;
    }

    public Type getSecondType() {
        return secondType;
    }

    public void setSecondType(Type secondType) {
        this.secondType = secondType;
    }

    @Override
    public String toString() {
        StringBuilder formattedTypes = new StringBuilder(firstType.getName());

        if (secondType != null) {
            formattedTypes.append(" / ").append(secondType.getName());
        }

        return "Types : " + formattedTypes;
    }
}
