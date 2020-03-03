package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        super( context, 0, locations );
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from( getContext() ).inflate( R.layout.item, parent, false );

        Location currentLocation = getItem( position );

        TextView descriptionTextView = listItemView.findViewById( R.id.description_text_view );
        descriptionTextView.setText( currentLocation.getDescription() );
        descriptionTextView.setVisibility( View.VISIBLE );


        ImageView imageView = listItemView.findViewById( R.id.image );
        imageView.setImageResource( currentLocation.getImageResourceId() );
        imageView.setVisibility( View.VISIBLE );

        return listItemView;
    }

}
