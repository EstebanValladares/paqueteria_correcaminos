import modules.User.Usuarios;
import modules.regex.Regex;
import data.registration.Registration;
import data.registration.RegistrationInput;
import data.send.Envios;
import data.send.EnviosCaracteristicas;
import data.send.PropertiesInput;
import data.ticket.Ticket;
//numeros aleatorios
import modules.Random.GenNumero;
//para saber la hora en que se hizo el envio
import java.time.LocalTime;
import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {


        //variables de fecha y hora
        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();

        // Generar 5 números aleatorios entre 0 y 99
        int[] numeros = GenNumero.generarNumerosAleatorios(5, 100);

        // Usar uno de esos números como código de envío, por ejemplo
        String codigoEnvio = "Codigo_envio" + numeros[0];
        String codigoCliente = "Codigo_cliente" + numeros[1];


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
            //formulario de registro de cliente
            RegistrationInput regInput = new RegistrationInput();
            Registration reg = regInput.capturarDatos();

            /*
            System.out.println("Datos capturados:");
            System.out.println("Nombre: " + reg.getNombre());
            System.out.println("Correo Electrónico: " + reg.getGmail());
            System.out.println("Código de Cliente: " + reg.getCodigo());
             */

            //menu de paquetes
            Envios envio = new Envios();
            int opcionPaquete = envio.menuPaquetes();
            System.out.println("Opción seleccionada: " + (opcionPaquete == 1 ? " - Sobre" : opcionPaquete == 2 ? " - Paquete" : opcionPaquete == 3 ? " - Caja" : " - Contenedor"));
            
            //registro de caracteristicas del paquete
            PropertiesInput propInput = new PropertiesInput();
            EnviosCaracteristicas prop = propInput.capturarEnvio();
            
            //datos del ticket
            Ticket ticket = new Ticket(codigoCliente, codigoEnvio, fecha.toString(), hora.toString());
        }

    }
}
