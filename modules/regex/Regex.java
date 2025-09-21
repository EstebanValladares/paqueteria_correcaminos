package modules.regex;

import java.util.Scanner;

public class Regex {

    public int menuRegex(){
        Scanner sc = new Scanner(System.in);
        Scanner opUser = new Scanner(System.in);
        int option = -1;
        String correcta = "admin123";

        System.out.println("Ingrese la contraseña de administrador:");
        String entrada = sc.nextLine();

        if(entrada.equals(correcta)){
            System.out.println("Acceso correcto");
            System.out.println("Seleccione una de las 2 opciones: ");
                System.out.println("1) Localizcion");
                System.out.println("2) Reporte");
            option = opUser.nextInt();
            return option;
        } else {
            System.out.println("Contraseña incorrecta. Acceso denegado.");
            return -1;
        }
    }
}
