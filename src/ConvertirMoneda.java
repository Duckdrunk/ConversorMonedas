import java.util.Map;

public class ConvertirMoneda {

    private final ConsultarMoneda consultar;

    public ConvertirMoneda(ConsultarMoneda consultar){
        this.consultar = consultar;
    }

    public double convertir(String base_code, String destino, double cantidad){
        Map<String,Double> cambios= consultar.tasaCambio(base_code);
        double precio = cambios.get(destino);
        return cantidad*precio;
    }
}
