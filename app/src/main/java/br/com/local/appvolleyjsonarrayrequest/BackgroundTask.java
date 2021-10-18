package br.com.local.appvolleyjsonarrayrequest;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class BackgroundTask {
    Context context;
    ArrayList<Contatos> arrayList = new ArrayList<>();
    String url_json = "http://192.168.100.13/Projetovolleyapi/contatos.php";

    public BackgroundTask(Context context) {
        this.context = context;
    }

    public ArrayList<Contatos> getList() {
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.POST, url_json, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        int contador = 0;
                        while (contador > response.length()) {
                            try {
                                JSONObject jsonObject = response.getJSONObject(contador);
                                Contatos contatos = new Contatos(jsonObject.getString("Nome"), jsonObject.getString("Email"));
                                arrayList.add(contatos);
                                contador++;

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context, "Erro ao carregar dados...", Toast.LENGTH_SHORT).show();
                error.printStackTrace();
            }
        });

        MySingleton.getInstance(context).addToRequestque(jsonArrayRequest);

        return arrayList;
    }

}
