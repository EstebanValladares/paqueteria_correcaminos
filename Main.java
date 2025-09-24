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
import modules.Bill.Bill;
import modules.Bill.PropertiesBill;
import modules.Bill.EnvioBill;


public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Registration reg = null; // Variable para guardar los datos del usuario

        while (continuar) {

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
            if(opcionRegex == 1){
                //Localización de paquetes
                PropertiesInput propInput = new PropertiesInput();
                EnviosCaracteristicas prop = propInput.capturarEnvio();

                System.out.println("----- Características del paquete -----");
                System.out.println("Estado: " + prop.getEstado());
                System.out.println("Tamaño: " + prop.getTamanio());
                System.out.println("Peso: " + prop.getPeso());
                System.out.println("CP Destino: " + prop.getCp_destino());
                System.out.println("CP Destinatario: " + prop.getCp_destinatario());
            }else{
                //Reporte de registros de los usuarios
                if (reg != null) {
                    //mostrar datos de los usuarios registrados
                    System.out.println("----- Datos de registro del usuario -----");
                    System.out.println("Nombre: " + reg.getNombre());
                    System.out.println("Correo: " + reg.getGmail());
                    System.out.println("Código de Cliente: " + reg.getCodigo());
                } else {
                    System.out.println("No hay datos de usuario registrados.");
                }
            }
        //datos de registro para el usuario
        }else{
            //formulario de registro de cliente
            RegistrationInput regInput = new RegistrationInput();
            reg = regInput.capturarDatos();

            //menu de paquetes
            Envios envio = new Envios();
            int opcionPaquete = envio.menuPaquetes();
            System.out.println("Opción seleccionada: " + (opcionPaquete == 1 ? " - Sobre" : opcionPaquete == 2 ? " - Paquete" : opcionPaquete == 3 ? " - Caja" : " - Contenedor"));

            //registro de caracteristicas del paquete
            PropertiesInput propInput = new PropertiesInput();
            EnviosCaracteristicas prop = propInput.capturarEnvio();

            //datos del ticket
            Ticket ticket = new Ticket(codigoCliente, codigoEnvio, fecha.toString(), hora.toString());
            ticket.mostrarTicket();

            //menu de factura
            Bill bill = new Bill();
            int opcionFactura = bill.menuFactura();

            //registro de RFC para la factura
            PropertiesBill propBill = new PropertiesBill();
            EnvioBill propB = propBill.capturarRFC();

            // mostrar documento de la factura
            new modules.DocumentBill.DocumentBill().mostrarDatos(reg, prop, propB);
        }
        // Preguntar si desea continuar
        System.out.println("¿Desea realizar otra operación? (s/n): ");
        String respuesta = sc.nextLine();
        if (!respuesta.equalsIgnoreCase("s")) {
            continuar = false;
        }
    }
    sc.close();
    }
}
