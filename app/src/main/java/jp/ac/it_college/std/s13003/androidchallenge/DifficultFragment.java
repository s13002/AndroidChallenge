package jp.ac.it_college.std.s13003.androidchallenge;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by s13002 on 14/08/12.
 */
public class DifficultFragment extends Fragment implements View.OnClickListener{
    public static DifficultFragment newInstance() {
        DifficultFragment fragment = new DifficultFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View begin = inflater.inflate(R.layout.fragment_difficulty, container, false);
        begin.findViewById(R.id.imageButton).setOnClickListener(this);
        begin.findViewById(R.id.imageButton2).setOnClickListener(this);
        begin.findViewById(R.id.imageButton3).setOnClickListener(this);
        return begin;
    }

    @Override
    public void onClick(View view) {

    }
}
