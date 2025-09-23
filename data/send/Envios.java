package data.send;

import java.util.Scanner;
 
public class Envios {
    public int menuPaquetes(){
        Scanner opUser = new Scanner(System.in);
        int option = -1;

        while (true) {
            System.out.println("Por favor seleccione una opcion: \n");
            System.out.println("1) Sobre");
            System.out.println("2) Paquete");
            System.out.println("3) Caja");
            System.out.println("4) Contenedor");
            if(opUser.hasNextInt()){
                option = opUser.nextInt();
                if(option == 1 || option == 2 || option == 3 || option == 4){
                    return option;
                }
            } else {
                System.out.println("Opcion no valida, intente de nuevo\n");
                opUser.next();
            }
        }
    }
}
