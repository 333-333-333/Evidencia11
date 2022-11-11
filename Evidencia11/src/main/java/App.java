import Modelo.Trabajador;
import Utilidades.Utilidades;

public class App {

    public static void launcher() {
        Trabajador test = new Trabajador("Nombre",
                "Apellido",
                "Rut",
                "Isapre",
                "AFP");
        menu(test);
    }

    private static void menu (Trabajador trabajador) {
        mostrarMenu();
        seleccionarOpcion(trabajador);
    }

    private static void mostrarMenu () {
        System.out.println("Selecciona una opción:\n" +
                           "\n" +
                           "[1] Editar Nombre;\n" +
                           "[2] Editar Apellido;\n" +
                           "[3] Editar RUT;\n" +
                           "[4] Editar Isapre;\n" +
                           "[5] Editar AFP;\n" +
                           "[6] Mostrar trabajador;\n" +
                           "[7] Salir.\n" +
                           "\n");
    }

    private static void seleccionarOpcion(Trabajador trabajador) {
        boolean quedarse = true;
        switch (Utilidades.validarIntervalo(1, 7)) {
            case 1 -> editarNombre(trabajador);
            case 2 -> editarApellido(trabajador);
            case 3 -> editarRUT(trabajador);
            case 4 -> editarIsapre(trabajador);
            case 5 -> editarAFP(trabajador);
            case 6 -> System.out.println(trabajador.toString());
            case 7 -> quedarse = false;
        }
        if (quedarse) {
            menu(trabajador);
        }
    }

    private static void editarNombre(Trabajador trabajador) {
        System.out.println("Inserte el nombre.");
        trabajador.setNombre(Utilidades.validarString());
    }

    private static void editarApellido(Trabajador trabajador) {
        System.out.println("Inserte el apellido.");
        trabajador.setApellido(Utilidades.validarString());
    }

    private static void editarRUT(Trabajador trabajador) {
        System.out.println("Inserte el RUT.");
        trabajador.setRut(Utilidades.validarString());
    }

    private static void editarIsapre(Trabajador trabajador) {
        System.out.println("Inserte la Isapre.");
        trabajador.setIsapre(Utilidades.validarString());
    }

    private static void editarAFP(Trabajador trabajador) {
        System.out.println("Inserte la AFP.");
        trabajador.setAFP(Utilidades.validarString());
    }


}
