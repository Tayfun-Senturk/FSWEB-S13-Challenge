package org.example;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro>0?giro:0;
        this.developerNames = developerNames;
    }
    public void addEmployee(int index,String name){
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Hatalı index.");
            return;
        }
        if (developerNames[index] != null) {
            System.out.println("Bu index dolu.");
        } else {
            developerNames[index] = name;
            System.out.println("Developer eklendi: " + name);
        }
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }
}
