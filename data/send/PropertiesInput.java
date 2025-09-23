package data.send;

import java.util.Properties;
import java.util.Scanner;

public class PropertiesInput {
    public EnviosCaracteristicas  capturarEnvio()
{
        Scanner sc = new Scanner(System.in);
        Properties properties = new Properties();

        System.out.println("Estado del paquete:");
        String estadoPaquete = sc.nextLine();

        System.out.println("tamaño del paquete:");
        String tamPaquete = sc.nextLine();

        System.out.println("Peso del paquete:");
        String pesoPaquete = sc.nextLine();

        System.out.println("codigo postal del destino:");
        String cp_destino = sc.nextLine();

        System.out.println("codigo postal del destinatario:");
        String cp_destinatario = sc.nextLine();

        return new EnviosCaracteristicas(estadoPaquete, tamPaquete, pesoPaquete, cp_destino, cp_destinatario);
}}
