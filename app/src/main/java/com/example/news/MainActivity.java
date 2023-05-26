package com.example.news;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem mhome;
    PagerAdapter pagerAdapter;
    Toolbar mtoolbar;
    String api="c36f30fe760f4d8b8b4e271b92ac3a46";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mhome=findViewById(R.id.home);
        ViewPager viewPager=findViewById(R.id.fragmentContainer);
        tabLayout=findViewById(R.id.include);


        pagerAdapter=new PagerAdapter(getSupportFragmentManager(),1);
        viewPager.setAdapter(pagerAdapter);
        // uses internt permission .viewholder and the part.HTLM

    }
}