package com.sumit.viewpager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
      private TabLayout tabLayout;
      private ViewPager2 viewPager2;
      String Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        setAdapter();
    }

    private void setAdapter() {
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), getLifecycle());
        viewPager2.setAdapter(pagerAdapter);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText("Fragment - " + position);
            }
        }).attach();
    }

    private void initview() {
      tabLayout = findViewById(R.id.tabLayout);
      viewPager2 = findViewById(R.id.viewPager);
    }
    public void setData(String name){
        this.Name = Name;

    }
    public String getData(){
        return  Name;
    }
}