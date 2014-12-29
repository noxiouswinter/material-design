package com.jinais.test.materialdemo.app;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jkader on 12/28/14.
 */
class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i) {
            case 0: fragment = new TabAFragment();
                break;
            case 1: fragment = new TabBFragment();
                break;
            case 2: fragment = new TabCFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title  = null;
        switch (position) {
            case 0: title = "Tab1";
                break;
            case 1: title = "Tab2";
                break;
            case 2: title = "Tab3";
                break;
        }
        return title;
    }
}
