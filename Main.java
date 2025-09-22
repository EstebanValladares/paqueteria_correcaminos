import modules.User.Usuarios;
import modules.regex.Regex;
import data.registration.Registration;
import data.registration.RegistrationInput;

public class Main {
    public static void main(String[] args) {
        //validador de opciones
        Usuarios user = new Usuarios();
        Regex regex = new Regex();


        int opcion = user.menuInicio();
        System.out.println("Opción seleccionada: " + (opcion == 1 ? "Cliente" : "Administrador"));
        
        //validador de administrador
        if(opcion == 2){
            int opcionRegex = regex.menuRegex();
            System.out.println("Opción seleccionada: " + (opcionRegex == 1 ? " - Localización" : opcionRegex == 2 ? " - Reporte" : " - Acceso denegado"));
        //datos de registro para el usuario
        }else{
            RegistrationInput regInput = new RegistrationInput();
            Registration reg = regInput.capturarDatos();
            System.out.println("Datos capturados:");
            System.out.println("Nombre: " + reg.getNombre());
            System.out.println("Correo Electrónico: " + reg.getGmail());
            System.out.println("Código de Cliente: " + reg.getCodigo());
        }

    }
}
