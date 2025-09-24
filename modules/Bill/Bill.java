package modules.Bill;

import java.util.Scanner;

public class Bill {
    public int menuFactura(){
        Scanner opUser = new Scanner(System.in);
        int option = -1;
        while (true) {
            System.out.println("¿Requiere factura?: \n");
            System.out.println("1) Si");
            System.out.println("2) No");
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
