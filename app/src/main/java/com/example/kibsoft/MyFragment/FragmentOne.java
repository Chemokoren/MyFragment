package com.example.kibsoft.MyFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {


    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_one, container, false);

        final EditText userName = (EditText)view.findViewById(R.id.etName);
        EditText userAge = (EditText)view.findViewById(R.id.etAge);
        EditText userOccupation = (EditText)view.findViewById(R.id.etOccupation);
        TextView textView= (TextView)view.findViewById(R.id.tvDisplay);
        final Button bDisplay =view.findViewById(R.id.bTry);
        bDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bDisplay.setText("Hello");
                Toast.makeText(getContext(), "Anii: "+userName.getText().toString()+"", Toast.LENGTH_SHORT).show();
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

}
