package com.example.android.uwemlivesore;
import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Loads a list of earthquakes by using an AsyncTask to perform the
 * network request to the given URL.
 */
public class UwemlivescoreLoader extends AsyncTaskLoader<List<Uwemlivescore>> {

    /**
     * Tag for log messages
     */
    private static final String LOG_TAG = UwemlivescoreLoader.class.getName();

    /**
     * Query URL
     */
    private String mUrl;

    /**
     * Constructs a new {@link UwemlivescoreLoader}.
     *
     * @param context of the activity
     * @param url     to load data from
     */
    public UwemlivescoreLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<Uwemlivescore> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<Uwemlivescore> uwemlivescores = QueryUtils.fetchEarthquakeData(mUrl);
        return uwemlivescores;
    }
}