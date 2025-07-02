package com.repaso.e1;

public class Ordenador {
    private String model;
    private int inchesScreen;
    private String oS;
    private double RAM;
    private double price;

    public Ordenador(String model, int inchesScreen, String oS, double RAM, double price) {
        this.model = model;
        this.inchesScreen = inchesScreen;
        this.oS = oS;
        this.RAM = RAM;
        this.price = price;
    }

    //GETTERS AND SETTERS
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getInchesScreen() {
        return inchesScreen;
    }

    public void setInchesScreen(int inchesScreen) {
        this.inchesScreen = inchesScreen;
    }

    public double getRAM() {
        return RAM;
    }

    public void setRAM(double RAM) {
        this.RAM = RAM;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    VISUALIZADOR


    @Override
    public String toString() {
        return "Ordenador" + '\n' +
                "model: " + model + '\n' +
                "pantalla: " + inchesScreen + '\n' +
                "RAM: " + RAM + '\n' +
                "price: " + price + '\n' +
                "________________________";
    }
}
