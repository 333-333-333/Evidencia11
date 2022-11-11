package Utilidades;
import java.util.Objects;
import java.util.Scanner;

public class Utilidades {

    public static int validarIntervalo(int inferior, int superior) {
        Scanner input = new Scanner(System.in);
        try {
            int real = input.nextInt();
            if (!(real >= inferior && real <= superior)) {
                System.err.println("El número no está entre "
                                   + inferior + " y " + superior +".");
                return validarIntervalo(inferior, superior);
            }
            return real;
        } catch (Exception e) {
            System.err.println("No se ha ingresado un número.");
            input.nextLine();
            return validarIntervalo(inferior, superior);
        }
    }

    public static String validarString() {
        Scanner input = new Scanner(System.in);
        try {
            String retorno = input.nextLine();
            if (Objects.equals(retorno, "")) {
                System.err.println("El texto está vacío.");
                return validarString();
            }
            return retorno;
        } catch (Exception e) {
            System.err.println("No se ha ingresado texto.");
            return validarString();
        }
    }

}
