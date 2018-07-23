package com.example.android.uwemlivesore;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


public class UwemlivescoreAdapter extends ArrayAdapter<Uwemlivescore> {


    public UwemlivescoreAdapter(Context context, List<Uwemlivescore> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.uwemlivescore_list_view, parent, false);
        }


        // Find the earthquake at the given position in the list of earthquakes
        Uwemlivescore currentUwemlivescore = getItem(position);

        // Find the TextView with view ID magnitude
        TextView leaguenameView = (TextView) listItemView.findViewById(R.id.league_name);

        // Format the magnitude to show 1 decimal place
        String leaguename = currentUwemlivescore.getLeaguename();

        // Display the magnitude of the current earthquake in that TextView
        leaguenameView.setText(leaguename);

        // Find the TextView with view ID magnitude
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);

        String time = currentUwemlivescore.getTime();

        timeView.setText(time);

        // Find the TextView with view ID magnitude
        TextView homenameView = (TextView) listItemView.findViewById(R.id.home_name);

        String homename = currentUwemlivescore.getHomename();

        homenameView.setText(homename);

        // Find the TextView with view ID magnitude
        TextView scoresView = (TextView) listItemView.findViewById(R.id.score);

        String scores = currentUwemlivescore.getScores();

        scoresView.setText(scores);


        // Find the TextView with view ID magnitude
        TextView awaynameView = (TextView) listItemView.findViewById(R.id.away_name);

        String awayname = currentUwemlivescore.getAwayname();

        awaynameView.setText(awayname);


        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }


}
