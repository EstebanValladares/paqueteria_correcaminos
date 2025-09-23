    package data.ticket;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Ticket {
    protected String codigo_envio;
    protected String codigo_cliente;
    protected String fecha_envio;
    protected String hora;

    public Ticket(String codigo_envio, String codigo_cliente, String fecha_envio, String hora) {
        this.codigo_envio = codigo_envio;
        this.codigo_cliente = codigo_cliente;
        this.fecha_envio = fecha_envio;
        this.hora = hora;
    }
    public String getCodigo_envio() {
        return codigo_envio;
    }
    public String getCodigo_cliente() {
        return codigo_cliente;
    }
    public String getFecha_envio() {
        return fecha_envio;
    }
    public String getHora() {
        return hora;
    }

    public void mostrarTicket() {
        System.out.println("----- TICKET DE ENVIO -----");
        System.out.println("Codigo envio: " + codigo_envio);
        System.out.println("Codigo cliente: " + codigo_cliente);
        System.out.println("Fecha envio: " + fecha_envio);
        System.out.println("Hora envio: " + hora);
        System.out.println("---------------------------");
    }
}
