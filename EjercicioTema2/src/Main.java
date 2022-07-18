import java.util.Scanner;

public class Main {
    public static void main (String [ ] args) {

        double precio = 10000;
        double precioConIVA = incluirIva(precio);
        System.out.println(precioConIVA);

    }

    public static double incluirIva( double precio){
        double ivaArg = 1.21d;
        double precioConIVA = precio * ivaArg;
        return precioConIVA;
    }
}
