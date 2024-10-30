import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ClienteHttp {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese moneda (ejemplo: ARS, BOB, BRL, CLP, COP, USD):");
        String moneda = scanner.nextLine().toUpperCase();

        // URL de la API
        String direccion = "https://v6.exchangerate-api.com/v6/99667fdb7a28d7b45074802f/latest/USD";

        // Realizar la solicitud HTTP
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Parsear el JSON usando Gson
        Gson gson = new Gson();
        JsonObject jsonResponse = gson.fromJson(response.body(), JsonObject.class);

        // Imprimir la respuesta completa (opcional, para depuración)
        System.out.println("Respuesta JSON completa: " + response.body());

        // Obtener los rates (tasas de cambio)
        JsonObject rates = jsonResponse.getAsJsonObject("conversion_rates");

        // Verificar si la moneda ingresada está en la respuesta y mostrar su valor
        if (rates != null && rates.has(moneda)) {
            double tasaCambio = rates.get(moneda).getAsDouble();
            System.out.println("La tasa de cambio para " + moneda + " es: " + tasaCambio);
        } else {
            System.out.println("Moneda no encontrada en la lista de tasas de cambio.");
        }
    }
}
