import java.util.Map;

public class ConvertirMoneda {

    Map<String,Double> conversion_rates = null;

    double obtenerPrecio(String inicio, String fin){
        if (conversion_rates==null || conversion_rates.isEmpty()){
            ConsultarMoneda consulta = new ConsultarMoneda();
            conversion_rates = consulta.buscaMoneda(inicio).conversion_rates();
        }
        return conversion_rates.get(fin);
    }

}
