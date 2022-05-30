package br.com.edg.project.service;

import br.com.edg.project.model.Cep;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Classe de busca de CEP do cliente
 * @author Danilo
 */
public class CepService {

    /**
     * Objeto para instaciação
     */
    public CepService() {
        // Empty constructor
    }

    /**
     * Método que realiza consulta na Via cep e retorna CEP desejado
     * 
     * @param cep número do cep
     * @return retorna o cep
     * @throws IOException parâmetros de entrada e sáida incorretos
     * @throws NullPointerException retorno ou variável nulas
     */
    public Cep consultaCep(String cep) throws IOException, NullPointerException {
        Cep cepRetorno = new Cep();
        try {
            ObjectMapper mapper = new ObjectMapper();
            OkHttpClient okHttpClient = new OkHttpClient();

            Request request = new Request.Builder()
                    .url("https://viacep.com.br/ws/" + cep + "/json/")
                    .build();

            Response response = okHttpClient.newCall(request).execute();

            if (response.body() != null) {
                cepRetorno = mapper.readValue(response.body().byteStream(), Cep.class);
            }

            return cepRetorno;
        } catch (JsonParseException e) {
            throw new IllegalArgumentException();
        }
    }

}
