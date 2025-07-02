package com.repaso.e2;

import java.util.Scanner;

public class Bicycle {
    private String brand;
    private String model;
    private int gears;
    private boolean frontBrake;

    Scanner scanner = new Scanner(System.in);

//CONSTRUCTORES

    public Bicycle() {
    }

    public Bicycle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Bicycle(String brand, String model, int gears, boolean frontBrake) {
        this.brand = brand;
        this.model = model;
        this.gears = gears;
        this.frontBrake = frontBrake;
    }

    //    GETTERS & SETTERS

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isFrontBrake() {
        return frontBrake;
    }

    public void setFrontBrake(boolean frontBrake) {
        this.frontBrake = frontBrake;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

//    MÉTODOS

    public void claxon(){
        int claxon = 0;
        System.out.println("Pulsa 1 para que suene el claxon");

        claxon = scanner.nextInt();
        if(claxon == 1){
            System.out.println("PIIIIIII");
        }else{
            System.out.println("Eso no es un pitido ni es ná");
        }
        scanner.nextLine();

    }

    public void move(){
        String move;
        String keepGoing;

        System.out.println("¿Iniciar recorrido? Y/N");
        keepGoing = scanner.nextLine();

        if(keepGoing.equalsIgnoreCase("y")) {
            do{
        System.out.println("¿Hacia dónde quieres ir? w/a/s/d");
        move = scanner.nextLine();

             switch (move){
             case "w":
              System.out.println("Una posición hacia adelante");
              break;
             case "a":
              System.out.println("Una posición hacia la izquierda");
              break;
              case "s":
              System.out.println("Una posición hacia atrás");
              break;
              case "d":
              System.out.println("Una posición hacia la derecha");
              break;
              default:
              System.out.println("La cadena está rota y no se puede avanzar");
             }
                System.out.println("¿Seguir? Y/N");
                keepGoing = scanner.nextLine();
                if(keepGoing.equalsIgnoreCase("n")){
                    System.out.println("Recorrido finalizado");
                }

        }while(keepGoing.equalsIgnoreCase("y"));

        } else if (keepGoing.equalsIgnoreCase("n")) {
            System.out.println("Otro día mejor");

        }


    }



//    VISORES

    @Override
    public String toString() {
        return "BICYCLE" +  '\n' +
                "brand: " + brand + '\n' +
                "model: " + model + '\n' +
                "freno delantero: " + frontBrake + '\n' +
                "_____________________________" + '\n';
    }
}
