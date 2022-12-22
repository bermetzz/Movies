package com.example.movies;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MovieViewHolder extends RecyclerView.ViewHolder {

     ImageView moviePoster;
     TextView title;
     TextView description;
     TextView mark;
     CardView cardView;

    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);
        moviePoster = itemView.findViewById(R.id.poster);
        title = itemView.findViewById(R.id.title);
        description = itemView.findViewById(R.id.description);
        mark = itemView.findViewById(R.id.mark);
        cardView = itemView.findViewById(R.id.cardViewCard);
    }

    public void bind (int image, String t, String d, String m){
        moviePoster.setImageResource(image);
        title.setText(t);
        description.setText(d);
        mark.setText(m);
    }
}
