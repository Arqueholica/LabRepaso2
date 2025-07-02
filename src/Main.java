import com.repaso.e1.Ordenador;
import com.repaso.e2.Bicycle;

public class Main {
    public static void main(String[] args) {

        System.out.println("---ORDENADORES---");

        Ordenador pc = new Ordenador("MAG Infinite", 24, "Windows", 16.00, 749.00 );
        Ordenador mac = new Ordenador(" Pro Apple M4", 16, "macOS", 120, 1200);

        System.out.println(pc);
        System.out.println(mac);



        System.out.println("---BICICLETAS---");

        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle("Decathlon", "Mountain Bike");

        System.out.println(bike2);

        bike1.setBrand("Decathlon");
        System.out.println(bike1.getBrand());


//        bike1.claxon();
//        bike2.move();


    }
}