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
public class EntertainmentFragment extends Fragment {
    public EntertainmentFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment BlankFragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static EntertainmentFragment newInstance() {
        return new EntertainmentFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate( R.layout.list, container, false );
        final ArrayList<Location> locations = new ArrayList<>();

        locations.add( new Location(  R.drawable.africano ,getString(R.string.entertainment_africano) ));
        locations.add( new Location(  R.drawable.cinema_amir ,getString(R.string.entertainment_amir) ));
        locations.add( new Location(  R.drawable.anfoushi ,getString(R.string.entertainment_anfoushi) ));
        locations.add( new Location(  R.drawable.carrefour ,getString(R.string.entertainment_carrefour) ));
        locations.add( new Location(  R.drawable.florence_mega_mall ,getString(R.string.entertainment_florence) ));
        locations.add( new Location(  R.drawable.green_plaza ,getString(R.string.entertainment_greenplaza) ));
        locations.add( new Location(  R.drawable.orouba ,getString(R.string.entertainment_orouba) ));
        locations.add( new Location(  R.drawable.san_sefano_mall ,getString(R.string.entertainment_sanstefano) ));

        LocationAdapter adapter = new LocationAdapter( getActivity(), locations );

        ListView listView = rootView.findViewById( R.id.list );

        listView.setAdapter( adapter );

        return rootView;
    }
}
