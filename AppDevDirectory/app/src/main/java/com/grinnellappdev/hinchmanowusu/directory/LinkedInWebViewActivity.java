package com.grinnellappdev.hinchmanowusu.directory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import com.grinnellappdev.hinchmanowusu.appdevdirectory.R;

/**
 * Created by Amanda Hinchman-Dominguez on 1/15/2015.
 *
 * Linked In web page connection, as implemented by Michael
 */
public class LinkedInWebViewActivity extends Activity {
    protected String mUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git_web_view);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        mUrl = bundle.getString("linkedurl");

        WebView webView = (WebView) findViewById(R.id.webView1);
        webView.loadUrl(mUrl);
    }

}
