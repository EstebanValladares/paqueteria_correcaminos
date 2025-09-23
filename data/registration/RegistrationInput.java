package data.registration;

import java.util.Properties;
import java.util.Scanner;   

public class RegistrationInput {
    public Registration capturarDatos(){
        Scanner sc = new Scanner(System.in);
        Properties properties = new Properties();
        
        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese su correo electrónico:");
        String gmail = sc.nextLine();
        
        System.out.println("Ingrese su código de cliente:");
        String codigo = sc.nextLine();
        
        return new Registration(nombre, gmail, codigo);
    }
}
