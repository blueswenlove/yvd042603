package com.example.yvtc.yvd042603;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {

    String params1;
    public FragmentB() {
        // Required empty public constructor
    }

    public void setArguments(String param1)
    {
        this.params1 = param1;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_b, container, false);
        TextView tv = (TextView) v.findViewById(R.id.textViewB);
        tv.setText(params1);
        return v;
    }

}
