package user;

import Price.PriceComfort;

public class BusinessUser implements User {
    private String name;
    private String surname;
    private int ID;
    private PriceComfort price;

    public BusinessUser(String name, String surname, int ID) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Imie: " + getName() + "\n" + " Nazwisko: " + getSurname() + "\n" + " ID: " + getID();
    }
}
