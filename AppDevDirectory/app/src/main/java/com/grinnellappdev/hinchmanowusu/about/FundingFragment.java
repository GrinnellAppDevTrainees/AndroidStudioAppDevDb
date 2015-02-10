package com.grinnellappdev.hinchmanowusu.about;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.grinnellappdev.hinchmanowusu.appdevdirectory.R;

/**
 * Created by Amanda Hinchman-Dominguez on 1/15/2015.
 *
 * Page intended for potential donations to AppDev
 */
public class FundingFragment extends Fragment {

    ImageButton button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_funding, container, false);

        return rootView;

        //addListenerOnButton();
    } // onCreateView

    public void addListenerOnButton() {

        button = (ImageButton) getView().findViewById(R.id.paypalButton);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.paypal.com"));
                startActivity(browserIntent);

            }

        });

    } // addListenerOnButton
}

