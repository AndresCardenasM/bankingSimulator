import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombreUsuario = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldo = 1599.99;

        System.out.println("******************************");
        System.out.println("Nombre del cliente: " + nombreUsuario);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: $" + saldo);
        System.out.println("******************************\n");

        String menu = """
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        int opcionUsuario = 0;
        Scanner lector = new Scanner(System.in);

        while (opcionUsuario != 9) {
            System.out.println(menu);
            opcionUsuario = (lector.nextInt());

            switch (opcionUsuario){
                case 1:
                    System.out.println("** El saldo en su cuenta a dia de hoy es: $" + saldo + " **\n");
                    break;
                case 2:
                    System.out.println("Cuanto dinero desea retirar?");
                    double valorRetirar = lector.nextDouble();
                    if (saldo < valorRetirar){
                        System.out.println("Lo sentimos, su saldo es menor a la cantidad que desea retirar");
                        break;
                    }
                    else if (saldo > valorRetirar) {
                        saldo = saldo - valorRetirar;
                        System.out.println("Su retiro por " + valorRetirar + " fue realizado con exito!");
                        System.out.println("** El nuevo saldo en su cuenta es de: $" + saldo + " **");
                        break;
                    }
                case 3:
                    System.out.println("Cuanto dinero desea depositar?");
                    double valorDepositar =  lector.nextDouble();
                    saldo += valorDepositar;
                    System.out.println("** El nuevo saldo en su cuenta es de: $" + saldo + " **");
                case 9:
                    System.out.println("Gracias por haber utilizado AndresBankingCO!");
                    break;
                default:
                    System.out.println("Porfavor ingrese una opcion valida \n");
            }
        }
    }
}