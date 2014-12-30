package com.jinais.test.materialdemo.app;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import com.example.android.common.view.SlidingTabLayout;


public class TabsFixedActivity extends ActionBarActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs_fixed);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MyFragmentPagerAdapter(fragmentManager));

        Toolbar toolbar = (Toolbar) findViewById(R.id.tbMain);
        setSupportActionBar(toolbar);

        SlidingTabLayout slidingTabLayout = (SlidingTabLayout)findViewById(R.id.sliding_tabs);
        slidingTabLayout.setCustomTabView(R.layout.tab_indicator, android.R.id.text1);
        slidingTabLayout.setSelectedIndicatorColors(getResources().getColor(R.color.theme_accent_color));
        slidingTabLayout.setDistributeEvenly(true);
        slidingTabLayout.setViewPager(viewPager);



    }

}
