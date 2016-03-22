package layout;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.edu.udea.compumovil.gr02.bonustabs.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmento3 extends Fragment {


    public Fragmento3() {
        // Required empty public constructor
        Log.d("@@@","AAAAA");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("@@@", "AAAAA");
        return inflater.inflate(R.layout.fragment_fragmento3, container, false);
    }

}
