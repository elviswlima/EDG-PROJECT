package br.com.edg.project.service;

import br.com.edg.project.model.Cep;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * @author Danilo
 */
public class CepService {

    public CepService() {
        // Empty constructor
    }

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
