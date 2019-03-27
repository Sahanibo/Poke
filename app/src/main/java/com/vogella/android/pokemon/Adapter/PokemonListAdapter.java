package com.vogella.android.pokemon.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.vogella.android.pokemon.Model.Pokemon;
import com.vogella.android.pokemon.PokemonList;
import com.vogella.android.pokemon.R;

import java.util.List;


public class PokemonListAdapter extends RecyclerView.Adapter<PokemonListAdapter.MyViewHolder> {

    Context context;
    List<Pokemon> pokemonList;

    public PokemonListAdapter(Context context, List<Pokemon> pokemonList) {
        this.context = context;
        this.pokemonList = pokemonList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(context).inflate(R.layout.pokemon_list_item,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //Load image
        Glide.with(context).load(pokemonList.get(position).getImg()).into(holder.pokemon_image);
        //Set name
        holder.pokemon_name.setText(pokemonList.get(position).getName());


    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView pokemon_image;
        TextView pokemon_name;
        public MyViewHolder(View itemView){
            super(itemView);

            pokemon_image= (ImageView)itemView.findViewById(R.id.pokemon_image);
            pokemon_name= (TextView)itemView.findViewById(R.id.txt_pokemon_name);

        }

    }
}
