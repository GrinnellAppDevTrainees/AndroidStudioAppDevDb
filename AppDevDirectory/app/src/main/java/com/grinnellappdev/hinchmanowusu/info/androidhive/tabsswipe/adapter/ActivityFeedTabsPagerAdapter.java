package com.grinnellappdev.hinchmanowusu.info.androidhive.tabsswipe.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

import com.grinnellappdev.hinchmanowusu.about.FundingFragment;
import com.grinnellappdev.hinchmanowusu.about.HistoryFragment;
import com.grinnellappdev.hinchmanowusu.about.MissionStatementFragment;
import com.grinnellappdev.hinchmanowusu.activity.ActivityFeedFragment;
import com.grinnellappdev.hinchmanowusu.activity.TwitterFeedFragment;

/**
 * Created by Amanda Hinchman-Dominguez on 1/28/2015.
 */
public class ActivityFeedTabsPagerAdapter extends FragmentPagerAdapter {
    public ActivityFeedTabsPagerAdapter (FragmentManager fm) {
        super(fm);
    }

    public Fragment getItem(int index) {
        switch (index) {
            case 0:
                // MissionStatement ListFragment activity
                return new ActivityFeedFragment();
            case 1:
                // Funding ListFragment activity
                return new TwitterFeedFragment();
        }
        return null;
    }

    public int getCount() {
        // get item count for the number of tabs
        return 2;
    }
}
