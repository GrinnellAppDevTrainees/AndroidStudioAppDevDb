package com.grinnellappdev.hinchmanowusu.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grinnellappdev.hinchmanowusu.appdevdirectory.R;

/**
 * Created by Amanda Hinchman-Dominguez on 1/28/2015.
 *
 * Page intended to receive api for google articles. Hopefully.
 */
public class ActivityFeedFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_activity_feed, container, false);

        return rootView;

        //addListenerOnButton();
    } // onCreateView
}
