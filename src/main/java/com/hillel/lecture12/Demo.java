package com.hillel.lecture12;

public class Demo {
    private int id;
    private int code;
    private String message;

    public static void main(String[] args) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Demo demo = (Demo) o;

        if (id != demo.id) {
            return false;
        }
        return code == demo.code;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + code;
        result = 31 * result + message.hashCode();
        return result;
    }
}
