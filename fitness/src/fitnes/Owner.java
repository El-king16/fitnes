package fitnes;

public class Owner {
        private String Name;
        private String surName;
        private int year;

    public Owner(String name, String surName, int year) {
        Name = name;
        this.surName = surName;
        this.year = year;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
