import java.util.Scanner;

public class Cuenta {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String menu = """
                ***Elija una Opción ***
                1-Consultar Saldo
                2-Retirar
                3-Depositar
                9-salir
                """;
        String tipoDeCuenta = " ";
        String nombre = " ";
        double saldo = 1800.00;
        int opcion = 0;


        System.out.println(" Nombre del Cliente");
        nombre = dato.nextLine();
        System.out.println("Tipo de Cuenta");
        tipoDeCuenta = dato.nextLine();


        do {
            System.out.println("******************************************");
            System.out.println(" Nombre del Cliente :"+ nombre);
            System.out.println("Tipo de Cuenta : "+ tipoDeCuenta);
            System.out.println("Saldo Actual : "+ saldo);
            System.out.println("******************************************");

            System.out.println(menu);
            opcion  = dato.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Saldo Actual : "+ saldo);
                    break;
                case 2:
                    System.out.println(" Ingrese la cantidad a retirar : ");
                    double retirar = dato.nextDouble();
                    if (retirar > saldo){
                        System.out.println("Saldo insuficiente");
                        System.out.println(" Cantidad máxima a retirar = "+ saldo);
                        break;
                    }else {
                        System.out.println("Cantidad entregada = " + retirar);
                        saldo -= retirar;
                        System.out.println("Nuevo saldo = " + saldo);
                        }
                    break;
                case 3:
                    System.out.println(" Ingrese la cantidad a Depositar : ");
                    double depositar = dato.nextDouble();
                    saldo += depositar;
                    System.out.println("Nuevo saldo = " + saldo);
                    break;
            }
        }while (opcion != 9);




    }
}
