package com.grinnellappdev.hinchmanowusu.activity;

/**
 * Created by Amanda Hinchman-Dominguez on 1/28/2015.
 *
 * We need to make network calls using an AsyncTask.  This accesses
 * the custom Twitter API to authenticate and read Tweets.  Once
 * the tweets are read successfully then it forwards the content
 * to the Twitter Fragment
 *
 * Note: Will need access to the AppDev twitter account
 */
import android.app.Activity;
import android.app.ListActivity;
import android.text.method.LinkMovementMethod;
import android.widget.ArrayAdapter;
import android.os.AsyncTask;
import android.widget.ListView;
import android.widget.TextView;

import com.grinnellappdev.hinchmanowusu.appdevdirectory.R;

import java.util.ArrayList;

public class TwitterAsyncTask extends AsyncTask<Object, Void, ArrayList<TwitterTweet>> {
    ActivityFeedActivity callerActivity;

    final static String TWITTER_API_KEY = "h8OPPVzyuFxOjL9HZ2yhqnPeI";
    final static String TWITTER_API_SECRET = "IwY7jUPglqaOmBa2mzxjGhdOnL5fSBKJupVT2WbA7fP22xkERz";

    //calls in the background
    @Override
    protected ArrayList<TwitterTweet> doInBackground(Object... params) {
        ArrayList<TwitterTweet> twitterTweets = null;
        callerActivity = (ActivityFeedActivity) params[1];
        if (params.length > 0) {
            TwitterAPI twitterAPI = new TwitterAPI(TWITTER_API_KEY,TWITTER_API_SECRET);
            twitterTweets = twitterAPI.getTwitterTweets(params[0].toString());
        }
        return twitterTweets;
    }

   //calls in the foreground
  @Override
    protected void onPostExecute(ArrayList<TwitterTweet> twitterTweets) {
        ArrayAdapter<TwitterTweet> adapter =
                new ArrayAdapter<TwitterTweet>(callerActivity, R.layout.fragment_twitter_feed,
                        R.layout.list_text_view, twitterTweets);
        ListView list = callerActivity.twitFeed.twitterlist;
        list.setAdapter(adapter);
        list.setDividerHeight(0);
        //lv.setDivider(this.getResources().getDrawable(android.R.color.transparent));
    }
}