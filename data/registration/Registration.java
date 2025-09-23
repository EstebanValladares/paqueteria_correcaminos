package data.registration;
  
public class Registration {
    protected String nombre;
    protected String gmail;
    protected String codigo;
    
    public Registration(String nombre, String gmail, String codigo) {
        this.nombre = nombre;
        this.gmail = gmail;
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getGmail() {
        return gmail;
    }
    public String getCodigo() {
        return codigo;
    }
}
