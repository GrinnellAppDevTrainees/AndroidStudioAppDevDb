package com.grinnellappdev.hinchmanowusu.info.androidhive.tabsswipe.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

import com.grinnellappdev.hinchmanowusu.directory.AlumniFragment;
import com.grinnellappdev.hinchmanowusu.directory.AndroidFragment;
import com.grinnellappdev.hinchmanowusu.directory.ResourceTeamFragment;
import com.grinnellappdev.hinchmanowusu.directory.TraineeFragment;
import com.grinnellappdev.hinchmanowusu.directory.iOSFragment;

/**
 * Created by username on 1/15/2015.
 */
public class DirectoryTabsPagerAdapter extends FragmentPagerAdapter {
    public DirectoryTabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public ListFragment getItem(int index) {

        switch (index) {
            case 0:
                // Android ListFragment activity
                return new AndroidFragment();
            case 1:
                // IOS ListFragment activity
                return new iOSFragment();
            case 2:
                // Trainee ListFragment activity
                return new TraineeFragment();
            case 3:
                // Trainee AlumniFragment activity
                return new AlumniFragment();
            case 4:
                // ResourceTeamFragment activity
                return new ResourceTeamFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 5;
    }
}
