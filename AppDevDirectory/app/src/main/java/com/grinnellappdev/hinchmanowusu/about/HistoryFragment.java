package com.grinnellappdev.hinchmanowusu.about;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grinnellappdev.hinchmanowusu.appdevdirectory.R;

/**
 * Created by Amanda Hinchman-Dominguez on 1/15/2015.
 *
 * Page intended to inform on the history of AppDev. A static page.
 */
public class HistoryFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_history, container, false);

        return rootView;
    } // onCreateView
}
