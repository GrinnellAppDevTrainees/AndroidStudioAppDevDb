package com.grinnellappdev.hinchmanowusu.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.grinnellappdev.hinchmanowusu.appdevdirectory.R;

/**
 * Created by Amanda Hinchman-Dominguez on 1/28/2015.
 *
 * Page intended to receive Twitter api involved with AppDev
 */
public class TwitterFeedFragment extends Fragment {

    public final static String twitterScreenName = "Grinnell_AppDev";
    final static String TAG = "Twitter Feed";
    public ListView twitterlist;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_twitter_feed, container, false);
        twitterlist = (ListView) rootView.findViewById(R.id.twitterListView);

        return rootView;

        //addListenerOnButton();
    } // onCreateView

}
