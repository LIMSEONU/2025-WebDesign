package com.example.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager;
    private ArtworkAdapter adapter;
    private List<Artwork> artworkList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);

        artworkList = new ArrayList<>();
        artworkList.add(new Artwork("2025 영화 베스트 작품 ( 야당 )", R.drawable.art1));
        artworkList.add(new Artwork("2024-25 뮤지컬 베스트 작품 ( 시지프스 )", R.drawable.art2));
        artworkList.add(new Artwork("2024 연극 베스트 작품 ( 맥베스 )", R.drawable.art3));

        adapter = new ArtworkAdapter(artworkList);
        viewPager.setAdapter(adapter);
    }
}
