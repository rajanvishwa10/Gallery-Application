package com.android.galleryapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    ViewPager viewPager;
    List<String> list;
    ViewpagerAdapter viewPagerImageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        viewPager = findViewById(R.id.viewpager);

        list = new ArrayList<>();
        list = getIntent().getStringArrayListExtra("list");

        viewPagerImageAdapter = new ViewpagerAdapter(list);
        viewPager.setAdapter(viewPagerImageAdapter);

        viewPager.setCurrentItem(getIntent().getIntExtra("pos",0));
    }

}