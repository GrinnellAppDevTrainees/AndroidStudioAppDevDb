package com.grinnellappdev.hinchmanowusu.activity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MenuItem;

import com.grinnellappdev.hinchmanowusu.appdevdirectory.R;
import com.grinnellappdev.hinchmanowusu.info.androidhive.tabsswipe.adapter.AboutTabsPagerAdapter;
import com.grinnellappdev.hinchmanowusu.info.androidhive.tabsswipe.adapter.ActivityFeedTabsPagerAdapter;

/**
 * Created by Amanda Hinchman-Dominguez on 1/13/2015.
 * Activity Feed activity
 */
@SuppressLint("NewApi")
public class ActivityFeedActivity  extends FragmentActivity implements ActionBar.TabListener{
    private ViewPager viewPager;
    private ActivityFeedTabsPagerAdapter mAdapter;
    private ActionBar actionBar;
    public TwitterFeedFragment twitFeed;
    public ActivityFeedFragment actFeed;

    // Tab titles
    private String[] tabs = { "Activity Feed", "Twitter Feed" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_activity);

        // Initialization
        viewPager = (ViewPager) findViewById(R.id.pager);
        actionBar = getActionBar();
        mAdapter = new ActivityFeedTabsPagerAdapter(getSupportFragmentManager());
        twitFeed = new TwitterFeedFragment();
        actFeed = new ActivityFeedFragment();

        AndroidNetworkUtility androidNetworkUtility = new AndroidNetworkUtility();
        if (androidNetworkUtility.isConnected(this)) {
            new TwitterAsyncTask().execute(twitFeed.twitterScreenName, this);
        } else {
            Log.v("Twitter Feed", "Network not Available!");
        }

        viewPager.setAdapter(mAdapter);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Adding Tabs
        for (String tab_name : tabs) {
            actionBar.addTab(actionBar.newTab().setText(tab_name)
                    .setTabListener(this));
        }

        /**
         * on swiping the viewpager make respective tab selected
         * */
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                // on changing the page
                // make respected tab selected
                actionBar.setSelectedNavigationItem(position);
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                super.onOptionsItemSelected(item);
        }
        return true;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }
    public class ActivityFeedTabsPagerAdapter extends FragmentPagerAdapter {
        public ActivityFeedTabsPagerAdapter (FragmentManager fm) {
            super(fm);
        }

        public Fragment getItem(int index) {
            switch (index) {
                case 0:
                    // MissionStatement ListFragment activity
                    return twitFeed;
                case 1:
                    // Funding ListFragment activity
                    return actFeed;
            }
            return null;
        }

        public int getCount() {
            // get item count for the number of tabs
            return 2;
        }
    }
}
