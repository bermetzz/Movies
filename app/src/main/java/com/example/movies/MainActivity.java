package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {
    ArrayList<MovieModel> moviesList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView moviesRecyclerView = findViewById(R.id.recycler_view);
        loadData();
        MovieAdapter adapter = new MovieAdapter(moviesList, this);
        moviesRecyclerView.setAdapter(adapter);
    }

    private void loadData() {
        moviesList.add(new MovieModel(R.drawable.img, "Interstellar", "Movie", "8.6"));
        moviesList.add(new MovieModel(R.drawable.img_3, "The Devil Wears Prada", "Movie", "6.9"));
        moviesList.add(new MovieModel(R.drawable.img_4, "Love, Rosie", "Movie", "7.7"));
        moviesList.add(new MovieModel(R.drawable.img_5, "Leon", "Movie", "8.7"));
        moviesList.add(new MovieModel(R.drawable.img_6, "When The Promised Flower Blooms", "Movie", "7.4"));
        moviesList.add(new MovieModel(R.drawable.img, "Interstellar", "Movie", "8.6"));
        moviesList.add(new MovieModel(R.drawable.img_3, "The Devil Wears Prada", "Movie", "6.9"));
        moviesList.add(new MovieModel(R.drawable.img_4, "Love, Rosie", "Movie", "7.7"));
        moviesList.add(new MovieModel(R.drawable.img_5, "Leon", "Movie", "8.7"));
        moviesList.add(new MovieModel(R.drawable.img_6, "When The Promised Flower Blooms", "Movie", "7.4"));
    }

    @Override
    public void onItemClick(MovieModel movieModel) {
        Intent intent = new Intent(MainActivity.this, DescriptionActivity.class);
        intent.putExtra("image", movieModel.image);
        intent.putExtra("title", movieModel.title);
        intent.putExtra("desc", movieModel.description);
        startActivity(intent);

    }
}