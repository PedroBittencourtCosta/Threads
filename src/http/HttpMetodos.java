package http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static java.lang.System.in;

public class HttpMetodos<T> {

    static String webService = "http://viacep.com.br/ws/";
    static int codigoSucesso = 200;

    public T buscaEnderecoPelo(String cep) throws Exception {
        String urlParaChamada = webService + cep + "/json";

        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));

            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = resposta.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return endereco;
        } catch (Exception e) {
            throw new Exception("ERRO: " + e);
        }
    }
}
