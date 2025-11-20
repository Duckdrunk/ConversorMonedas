import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        ConsultarMoneda consulta = new ConsultarMoneda();
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        while (opcion!=7){
            Menu();
            opcion=sc.nextInt();

            String inicio="";
            String fin;
            switch (opcion){
                case 1:
                    inicio="USD";
                    fin="ARS";
                    break;
                case 2:
                    inicio="ARS";
                    fin = "USD";
                    break;
                case 3:
                    inicio="USD";
                    fin = "BRL";
                    break;
                case 4:
                    inicio="BRL";
                    fin="USD";
                    break;
                case 5:
                    inicio="USD";
                    fin="COP";
                    break;
                case 6:
                    inicio="COP";
                    fin="USD";
                    break;
                default:
                    return;
            }
            double cantidad = sc.nextDouble();
            Moneda moneda = consulta.buscaMoneda(inicio);
            double cambio = moneda.conversion_rates().get(fin);
            System.out.println(cantidad*cambio);
        }
    }

    static void Menu(){
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