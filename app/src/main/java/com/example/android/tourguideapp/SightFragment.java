package com.example.android.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SightFragment extends Fragment {
    public SightFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment BlankFragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static SightFragment newInstance() {
        return new SightFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate( R.layout.list, container, false );
        final ArrayList<Location> locations = new ArrayList<>();

        locations.add( new Location(  R.drawable.abouelabbas ,getString(R.string.sight_abouelabbas) ));
        locations.add( new Location(  R.drawable.bibleotecha ,getString(R.string.sight_bibleotecha) ));
        locations.add( new Location(  R.drawable.greeco_roman ,getString(R.string.sight_greecoroman) ));
        locations.add( new Location(  R.drawable.montaza ,getString(R.string.sight_montaza) ));
        locations.add( new Location(  R.drawable.qaitebay ,getString(R.string.sight_qaitbay) ));
        locations.add( new Location(  R.drawable.raml_station ,getString(R.string.sight_raml) ));
        locations.add( new Location(  R.drawable.stanley ,getString(R.string.sight_stanley) ));

        LocationAdapter adapter = new LocationAdapter( getActivity(), locations );

        ListView listView = rootView.findViewById( R.id.list );

        listView.setAdapter( adapter );

        return rootView;
    }
}
