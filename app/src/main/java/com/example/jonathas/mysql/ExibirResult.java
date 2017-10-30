package com.example.jonathas.mysql;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ExibirResult extends AppCompatActivity {

    String JSON_STRING;
    JSONObject jsonObject;
    JSONArray jsonArray;
    ContatoAdapter contatoAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_exibir_result);
        listView = (ListView) findViewById(R.id.listView);

        contatoAdapter = new ContatoAdapter(this, R.layout.row_layout);
        listView.setAdapter(contatoAdapter);

        JSON_STRING = getIntent().getExtras().getString("JSON_STRING");

        try {
            jsonObject = new JSONObject(JSON_STRING);
            jsonArray = jsonObject.getJSONArray("server_response");

            int count = 0;
            String name, user_name, user_pass;

            while (count<jsonArray.length()) {
                JSONObject jo = jsonArray.getJSONObject(count);
                name = jo.getString("name");
                user_name = jo.getString("user_name");
                user_pass = jo.getString("user_pass");

                Contatos contatos = new Contatos(name, user_name, user_pass);
                contatoAdapter.add(contatos);

                count++;
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

}
