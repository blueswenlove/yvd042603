package com.example.yvtc.yvd042603;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {
    String str[] = {"AAA", "BBB", "CCC"};
    ListView lv;

    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_a, container, false);
        lv = (ListView) v.findViewById(R.id.listView);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, str);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // FragmentTransaction ft = getFragmentManager().beginTransaction();
                TextView tv = (TextView) getActivity().findViewById(R.id.textView);
                ImageView img = (ImageView) getActivity().findViewById(R.id.imageView2);
                switch (position)
                {
                    case 0:
                    case 1:
                        tv.setVisibility(View.VISIBLE);
                        img.setVisibility(View.GONE);
                        tv.setText(str[position]);

//                        FragmentB fb = new FragmentB();
//                        fb.setArguments(str[position]);
//                        ft.replace(R.id.layout_content, fb);


                        break;
                    case 2:
                        tv.setVisibility(View.GONE);
                        img.setVisibility(View.VISIBLE);
//                        ft.replace(R.id.layout_content, new FragmentC());
                        break;
                }
//                ft.commit();
            }
        });

    }
}
