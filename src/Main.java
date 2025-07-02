import com.repaso.e2.Bicycle;

public class Main {
    public static void main(String[] args) {

        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle("Decathlon", "Mountain Bike");

        System.out.println(bike2);

        bike1.setBrand("Decathlon");
        System.out.println(bike1.getBrand());


        bike1.claxon();
        bike2.move();


        System.out.println("Hello and welcome!");



    }
}