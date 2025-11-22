import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static final Map<Integer,String[]> opciones = Map.of(
            1, new String[]{"USD", "ARS"},
            2, new String[]{"ARS", "USD"},
            3, new String[]{"USD", "BRL"},
            4, new String[]{"BRL", "USD"},
            5, new String[]{"USD", "COP"},
            6, new String[]{"COP", "USD"}
    );

    static final int opcionSalida = 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsultarMoneda consultor = new ConsultarMoneda();
        ConvertirMoneda convertor = new ConvertirMoneda(consultor);

        boolean seguir = true;

        while (seguir){
            menu();
            int opcion = sc.nextInt();

            if(opcion==opcionSalida){
                seguir = false;
            }

            if(!opciones.containsKey(opcion)){
                System.out.println("Opción inválida");
            }

            String inicio = opciones.get(opcion)[0];
            String fin = opciones.get(opcion)[1];

            System.out.println("Ingrese el valor que desea convertir:");
            double cantidad = sc.nextDouble();

            double res = convertor.convertir(inicio,fin,cantidad);

            System.out.printf("El valor %.2f [%s] corresponde a %.2f [%s]%n",
                    cantidad, inicio, res, fin);
        }
    }

    static void menu(){
        System.out.print(
                        """
                        ****************************************
                        \s
                        Sea bienvenido/a al conversor de Moneda =]
                       \s
                        1) Dólar =>> Peso argentino
                        2) Peso argentino =>> Dólar
                        3) Dólar =>> Real brasileño
                        4) Real brasileño =>> Dólar
                        5) Dólar =>> Peso Colombiano
                        6) Peso colombiano =>> Dólar
                        7) Salir
                        Elija una opción válida:
                        ****************************************
                       \s"""
                );
    }

}