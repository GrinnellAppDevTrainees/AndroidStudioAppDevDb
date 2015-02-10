package com.grinnellappdev.hinchmanowusu.about;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grinnellappdev.hinchmanowusu.appdevdirectory.R;

/**
 * Created by Amanda Hinchman-Dominguez on 1/21/2015.
 *
 * Intended to display the mission statement.  A static page.
 */
public class MissionStatementFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mission_statement, container, false);

        return rootView;
    } // onCreateView
}


