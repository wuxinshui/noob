package org.noob.thinking.lione;

public enum SingletonEnum {
    LI_ONE(1, "理想ONE"), LI_TWO(2, "理想TOW");


    private SingletonEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

    private int code;
    private String value;

    public int getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

}
