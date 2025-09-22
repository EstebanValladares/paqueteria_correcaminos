package data.send;

public class EnviosCaracteristicas {
    protected String estado;
    protected String tamanio;
    protected String peso;
    protected String cp_destino;
    protected String cp_destinatario;
    
    public EnviosCaracteristicas(String estado, String tamanio, String peso, String cp_destino, String cp_destinatario) {
        this.estado = estado;
        this.tamanio = tamanio;
        this.peso = peso;
        this.cp_destino = cp_destino;
        this.cp_destinatario = cp_destinatario;
    }
    public String getEstado() {
        return estado;
    }
    public String getTamanio() {
        return tamanio;
    }
    public String getPeso() {
        return peso;
    }
    public String getCp_destino() {
        return cp_destino;
    }
    public String getCp_destinatario() {
        return cp_destinatario;
    }
}
