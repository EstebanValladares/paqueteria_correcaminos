package modules.DocumentBill;

import data.registration.Registration;
import data.send.EnviosCaracteristicas;
import modules.Bill.EnvioBill;

public class DocumentBill {
    public void mostrarDatos(Registration registro, EnviosCaracteristicas envio, EnvioBill factura) {
        System.out.println("----- Datos para la Factura -----");
        System.out.println("Datos de registro:");
        System.out.println("Nombre: " + registro.getNombre());
        System.out.println("Correo: " + registro.getGmail());
        System.out.println("Código de Cliente: " + registro.getCodigo());

        System.out.println("\nCaracterísticas del envío:");
        System.out.println("Estado: " + envio.getEstado());
        System.out.println("Tamaño: " + envio.getTamanio());
        System.out.println("Peso: " + envio.getPeso());
        System.out.println("CP Destino: " + envio.getCp_destino());
        System.out.println("CP Destinatario: " + envio.getCp_destinatario());

        System.out.println("\nDatos de la factura:");
        System.out.println("RFC: " + factura.getRfc());
        System.out.println("----------------------------------");
    }
}