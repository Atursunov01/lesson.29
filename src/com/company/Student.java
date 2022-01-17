package com.company;

public class Student {
    private int ID;
    private String familia;

    public Student(int ID, String familia) {
        this.ID = ID;
        this.familia = familia;
    }

    public Student() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    @Override
    public String toString() {
        return getID() + ", " + getFamilia();
    }
}
