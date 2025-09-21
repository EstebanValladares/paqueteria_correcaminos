import modules.User.Usuarios;

public class Main {
    public static void main(String[] args) {
        //validador de opciones
        Usuarios user = new Usuarios();
        int opcion = user.menuInicio();
        System.out.println("Opción seleccionada: " + (opcion == 1 ? "Cliente" : "Administrador"));
    }

}
