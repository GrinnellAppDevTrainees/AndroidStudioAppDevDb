package com.grinnellappdev.hinchmanowusu.mainactivity;

/**
 * Created by Amanda Hinchman-Dominguez on 1/13/2015.
 * Main activity for the directory app.
 */

import com.grinnellappdev.hinchmanowusu.about.AboutActivity;
import com.grinnellappdev.hinchmanowusu.activity.ActivityFeedActivity;
import com.grinnellappdev.hinchmanowusu.appdevdirectory.R;
import com.grinnellappdev.hinchmanowusu.directory.DirectoryActivity;
import com.grinnellappdev.hinchmanowusu.services.ServicesActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        /*Get button ID's*/
        Button directoryButton = (Button) findViewById(R.id.directoryButton);
        Button aboutButton = (Button) findViewById(R.id.aboutButton);
        Button servicesButton = (Button) findViewById(R.id.servicesButton);
        Button activityFeedButton = (Button) findViewById(R.id.activityButton);

    /* clicking the directoryButton changes HomeActivity to DirectoryActivity */
        directoryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DirectoryActivity.class);

                startActivity(intent);
            }
        });
    /* clicking the directoryButton changes HomeActivity to AboutActivity */
        aboutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AboutActivity.class);

                startActivity(intent);
            }
        });
        /* clicking the directoryButton changes HomeActivity to ServicesActivity */
        servicesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ServicesActivity.class);

                startActivity(intent);
            }
        });
        /* clicking the directoryButton changes HomeActivity to ActivityFeedActivity */
        activityFeedButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ActivityFeedActivity.class);


                startActivity(intent);
            }
        });

    }
}
