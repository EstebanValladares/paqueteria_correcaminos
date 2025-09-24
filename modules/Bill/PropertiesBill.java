package modules.Bill;

import java.util.Properties;
import java.util.Scanner;

public class PropertiesBill {
    public EnvioBill capturarRFC(){
        Scanner sc = new Scanner(System.in);
        Properties properties = new Properties();

        System.out.println("Ingrese su RFC para la factura:");
        String rfc = sc.nextLine();

        return new EnvioBill(rfc);
    }
}
