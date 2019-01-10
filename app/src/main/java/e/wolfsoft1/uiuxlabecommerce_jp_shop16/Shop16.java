package e.wolfsoft1.uiuxlabecommerce_jp_shop16;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.viewpagerindicator.LinePageIndicator;

import e.wolfsoft1.uiuxlabecommerce_jp_shop16.adapter.TabViewpagerAdapter16;
import e.wolfsoft1.uiuxlabecommerce_jp_shop16.adapter.ViewpagerAdapter_Shop16;
import e.wolfsoft1.uiuxlabecommerce_jp_shop16.adapter.WrapContentHeightViewPager;

public class Shop16 extends AppCompatActivity {

    ViewPager viewPager16;
    WrapContentHeightViewPager viewpager_tab16;
    LinePageIndicator indicator_line;
    TabLayout tabLayout16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop16);
        indicator_line = findViewById(R.id.indicator_line);
        viewPager16 = findViewById(R.id.viewPager16);
        tabLayout16 = findViewById(R.id.tabLayout16);
        viewpager_tab16 = findViewById(R.id.viewpager_tab16);

        ViewpagerAdapter_Shop16 viewpagerAdapterShop16 = new ViewpagerAdapter_Shop16(getSupportFragmentManager(), 3);
        viewPager16.setAdapter(viewpagerAdapterShop16);
        indicator_line.setViewPager(viewPager16);

        tabLayout16.addTab(tabLayout16.newTab().setText("Sweater"));
        tabLayout16.addTab(tabLayout16.newTab().setText("Jumper"));
        tabLayout16.addTab(tabLayout16.newTab().setText("Jackets"));

        TabViewpagerAdapter16 adapter = new TabViewpagerAdapter16(getSupportFragmentManager(), tabLayout16.getTabCount());
        viewpager_tab16.setAdapter(adapter);

        viewpager_tab16.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout16));

        tabLayout16.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager_tab16.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

}

