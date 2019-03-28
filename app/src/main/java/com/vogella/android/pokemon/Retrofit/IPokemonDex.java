package com.vogella.android.pokemon.Retrofit;


import com.vogella.android.pokemon.Model.Pokedex;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface
IPokemonDex {

    @GET("pokedex.json")
    Observable<Pokedex> getListPokemon();

}
