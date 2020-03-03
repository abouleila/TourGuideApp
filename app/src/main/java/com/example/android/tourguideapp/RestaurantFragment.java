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
public class RestaurantFragment extends Fragment {
    public RestaurantFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment BlankFragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static RestaurantFragment newInstance() {
        return new RestaurantFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate( R.layout.list, container, false );
        final ArrayList<Location> locations = new ArrayList<>();

        locations.add( new Location(  R.drawable.hosny ,getString(R.string.restaurant_hosny) ));
        locations.add( new Location(  R.drawable.kadoura ,getString(R.string.restaurant_kadoura) ));

        LocationAdapter adapter = new LocationAdapter( getActivity(), locations );

        ListView listView = rootView.findViewById( R.id.list );

        listView.setAdapter( adapter );

        return rootView;
    }
}
