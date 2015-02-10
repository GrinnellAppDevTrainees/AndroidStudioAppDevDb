package com.grinnellappdev.hinchmanowusu.info.androidhive.tabsswipe.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

import com.grinnellappdev.hinchmanowusu.about.FundingFragment;
import com.grinnellappdev.hinchmanowusu.about.HistoryFragment;
import com.grinnellappdev.hinchmanowusu.about.MissionStatementFragment;

/**
 * Created by Amanda Hinchman-Dominguez on 1/15/2015.
 *
 */
public class AboutTabsPagerAdapter extends FragmentPagerAdapter{
    public AboutTabsPagerAdapter (FragmentManager fm) {
        super(fm);
    }

    public Fragment getItem(int index) {
        switch (index) {
            case 0:
                // MissionStatement ListFragment activity
                return new MissionStatementFragment();
            case 1:
                // Funding ListFragment activity
                return new FundingFragment();
            case 2:
                // History ListFragment activity
                return new HistoryFragment();
        }
        return null;
    }

    public int getCount() {
        // get item count for the number of tabs
        return 3;
    }
}

