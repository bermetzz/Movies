package com.example.movies;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {
    ArrayList<MovieModel> movieList;
    ItemClickListener clickListener;
//    public String[] mColors = {"#3F51B5","#FF9800","#009688","#673AB7"};
    public MovieAdapter(ArrayList<MovieModel> movieList, ItemClickListener clickListener) {
        this.movieList = movieList;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);
        CardView dc = view.findViewById(R.id.cardViewCard);
        Random rand = new Random();
        int red = rand.nextInt(255 - 1);
        int green = rand.nextInt(255 - 1);
        int blue = rand.nextInt(255 - 1);
        dc.setCardBackgroundColor(Color.rgb(red, green, blue));
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
//        holder.itemView.setBackgroundColor(Color.parseColor(mColors[position % 4]));
        holder.bind(movieList.get(position).image, movieList.get(position).title, movieList.get(position).description, movieList.get(position).mark);
        holder.cardView.setOnClickListener(view -> clickListener.onItemClick(movieList.get(position)));
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }
}
