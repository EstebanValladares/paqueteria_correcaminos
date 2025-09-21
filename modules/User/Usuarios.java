package modules.User;
import java.util.Scanner;

public class Usuarios {

    public int menuInicio(){
        Scanner opUser = new Scanner(System.in);
        int option = -1;

        while (true) {
            System.out.println("Bienvenido al centro de paqueteria");
            System.out.println("Por favor seleccione una opcion: \n");
            System.out.println("1) Cliente");
            System.out.println("2) Administrador");
            if(opUser.hasNextInt()){
                option = opUser.nextInt();
                if(option == 1 || option == 2){
                    return option;
                }
            } else {
                System.out.println("Opcion no valida, intente de nuevo\n");
                opUser.next();
            }
        }
    }
}
