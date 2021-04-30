package com.android.galleryapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new GridLayoutManager(this,  3);
        recyclerView.setLayoutManager(linearLayoutManager);
        list = new ArrayList<>();

        list.add("https://www.writeups.org/wp-content/uploads/Red-Power-Ranger-Jason-Lee-Scott.jpg");
        list.add("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5b8d2b12-21e8-4931-8a6d-fb9ecdd60383/dc8rxdd-b8bec7b1-2c06-4c01-a293-44467fdd23e7.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzViOGQyYjEyLTIxZTgtNDkzMS04YTZkLWZiOWVjZGQ2MDM4M1wvZGM4cnhkZC1iOGJlYzdiMS0yYzA2LTRjMDEtYTI5My00NDQ2N2ZkZDIzZTcucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.CyCWl8vQRFy5YeJUvgdKy8jwsRWVYiAhAknpS2O3BzE");
        list.add("https://static.wikia.nocookie.net/justanothercrossoverfightingshow/images/1/1b/Mmpr-white.png/revision/latest?cb=20160717114719");
        list.add("https://static.wikia.nocookie.net/powerrangers/images/f/f0/Prz-green.png/revision/latest/scale-to-width-down/250?cb=20140122025604");
        list.add("https://www.seekpng.com/png/detail/290-2908123_legacy-mmpr-yellow-ranger-metallic-power-rangers-mighty.png");
        list.add("https://www.writeups.org/wp-content/uploads/Red-Power-Ranger-Jason-Lee-Scott.jpg");
        list.add("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5b8d2b12-21e8-4931-8a6d-fb9ecdd60383/dc8rxdd-b8bec7b1-2c06-4c01-a293-44467fdd23e7.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzViOGQyYjEyLTIxZTgtNDkzMS04YTZkLWZiOWVjZGQ2MDM4M1wvZGM4cnhkZC1iOGJlYzdiMS0yYzA2LTRjMDEtYTI5My00NDQ2N2ZkZDIzZTcucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.CyCWl8vQRFy5YeJUvgdKy8jwsRWVYiAhAknpS2O3BzE");
        list.add("https://static.wikia.nocookie.net/justanothercrossoverfightingshow/images/1/1b/Mmpr-white.png/revision/latest?cb=20160717114719");
        list.add("https://static.wikia.nocookie.net/powerrangers/images/f/f0/Prz-green.png/revision/latest/scale-to-width-down/250?cb=20140122025604");
        list.add("https://www.seekpng.com/png/detail/290-2908123_legacy-mmpr-yellow-ranger-metallic-power-rangers-mighty.png");

//
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, list);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

}