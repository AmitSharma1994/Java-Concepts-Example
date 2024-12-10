package com.javaeight.lamda;

public class BankList {
    private  int id;
    private String name;
    private String esblishmentyear;
    private  int income;

    public BankList(int id, String name, String esblishmentyear, int income) {
        this.id = id;
        this.name = name;
        this.esblishmentyear = esblishmentyear;
        this.income = income;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEsblishmentyear() {
        return esblishmentyear;
    }

    public void setEsblishmentyear(String esblishmentyear) {
        this.esblishmentyear = esblishmentyear;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public static void main(String[] args) {


    }
}
