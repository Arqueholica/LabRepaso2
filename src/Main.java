import com.repaso.e1.Ordenador;
import com.repaso.e2.Bicycle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("---ORDENADORES---");

        Ordenador pc = new Ordenador("MAG Infinite", 24, "Windows", 16.00, 749.07 );
        Ordenador mac = new Ordenador(" Pro Apple M4", 16, "macOS", 120, 1200.98);
        Ordenador lin = new Ordenador("ThinkStation P2", 0, "Linux", 32, 980.57 );

        System.out.println(pc);
        System.out.println(mac);
        System.out.println(lin);

        System.out.println("Solo dos caracterísiticas: " + pc.getModel() + " " + pc.getPrice());

        lin.setPrice(6547);
        System.out.println("Cambio de precio " + lin.getPrice());
        System.out.println(lin);

//-----------------------------------------------------------------------------------------------------

        System.out.println("\n");
        System.out.println("---BICICLETAS---");

        Bicycle bike1 = new Bicycle("Decathlon", "Paseo", 3, true);
        Bicycle bike2 = new Bicycle("Decathlon", "Mountain Bike");

        System.out.println(bike1);
        System.out.println(bike2);

        bike1.setBrand("Decathlon");
        System.out.println(bike1.getBrand());
        System.out.println("\n");

        ArrayList<Object> bicis = new ArrayList<>();

        bicis.add(bike1);
        bicis.add(bike2);

        System.out.println("Este es el arrayList de las bicis: " + '\n'  + bicis);

//        JUGAR
        System.out.println("\n" + "USO DE MÉTODOS PROPIOS" + "\n");
        bike1.claxon();
        bike2.move();


    }
}