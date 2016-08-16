package com.example.hwhong.newyorktimesclone;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by hwhong on 7/29/16.
 */
public class SwipeAdapter extends FragmentStatePagerAdapter {

    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragmentPop = new Popular();

        return fragmentPop;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
