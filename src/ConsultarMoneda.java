import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class ConsultarMoneda {
    private static final String token = "";

    private final HttpClient client = HttpClient.newHttpClient();
    private final Gson gson = new Gson();

    private final Map<String, Map<String,Double>> cache = new HashMap<>();

    public Map<String,Double> tasaCambio(String base_code){
        if (cache.containsKey(base_code)){
            return cache.get(base_code);
        }

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(token+base_code))
                .build();
        try {
            HttpResponse<String> res = client.
                    send(request,HttpResponse.BodyHandlers.ofString());
            Moneda moneda = gson.fromJson(res.body(),Moneda.class);
            cache.put(base_code,moneda.conversion_rates());
            return moneda.conversion_rates();
        }catch (IOException|InterruptedException e){
            throw new RuntimeException("Error obteniendo tasas de cambio");
        }
    }
}
