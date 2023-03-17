package com.example.ws;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.ws.adapter.newsA;
import com.example.ws.models.news;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class analize extends AppCompatActivity {

    private newsA mAdapter;
    //строки
    private List<news>  mNewsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analize);

        ListView lvNews = findViewById(R.id.listNews);
        mAdapter = new newsA(analize.this, mNewsList);
        lvNews.setAdapter(mAdapter);

        new GetHoles().execute();
    }

    private class GetHoles extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... voids) {
            try {
                URL url = new URL("https://medic.madskill.ru/api/news");

                HttpURLConnection connection = (HttpURLConnection)url.openConnection();

                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                StringBuilder result = new StringBuilder();
                String line = "";

                while((line = reader.readLine()) != null);
                {
                    result.append(line);
                }
                return result.toString();

            }catch (Exception ex){
                return null;
            }
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            try {
                JSONArray tempArray = new JSONArray(s);
                for (int i=0; i<tempArray.length(); i++){
                    JSONObject newsJson = tempArray.getJSONObject(i);
                    news tempNews = new news(
                            newsJson.getInt("id"),
                            newsJson.getString("name"),
                            newsJson.toString(Integer.parseInt("description")),
                            newsJson.getString("price"),
                            newsJson.getString("image")
                    );
                    mNewsList.add(tempNews);
                    mAdapter.notifyDataSetChanged();
                }

            }catch (Exception ex){

            }
        }
    }

}
