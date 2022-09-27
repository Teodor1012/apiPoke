package com.example.apipoke;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class PokemonApi {
    void getPokemons(){

        String url = "https://pokeapi.co/api/v2/pokemon/";

        try{

            String result = HttpUtils.get(url);

            JSONObject jsonResult = new JSONObject(result);

            JSONArray results = jsonResult.getJSONArray("results");

            ArrayList<Pokemon> pokemons = new ArrayList<>();

            for (int i = 0; i < result.length(); i++) {

                JSONObject pokemonJson = results.getJSONObject(i);

                Pokemon pokemon1 = new Pokemon();

                pokemon1.setName(pokemonJson.getString("name"));
                pokemon1.setDetailsUrl(pokemonJson.getString("url"));

                pokemons.add(Pokemon);


            }

            Log.e("XXX Pokemons XXX", result);
        }catch (IOException e){
            e.printStackTrace();
        }



    }



}

