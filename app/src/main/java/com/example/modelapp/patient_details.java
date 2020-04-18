package com.example.modelapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class patient_details extends Fragment {
View v;
RecyclerView recyclerView;
List<Model_class> mlist;
    public patient_details() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_patient_details, container, false);
        recyclerView = v.findViewById(R.id.recyclerView);
        CustomAdapter customAdapter = new CustomAdapter(mlist,getContext());
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mlist = new ArrayList<>();
        mlist.add(new Model_class(R.drawable.stickman,"person name"));
        mlist.add(new Model_class(R.drawable.stickman,"person name"));
        mlist.add(new Model_class(R.drawable.stickman,"person name"));
        mlist.add(new Model_class(R.drawable.stickman,"person name"));
        mlist.add(new Model_class(R.drawable.stickman,"person name"));
        mlist.add(new Model_class(R.drawable.stickman,"person name"));
        mlist.add(new Model_class(R.drawable.stickman,"person name"));
        mlist.add(new Model_class(R.drawable.stickman,"person name"));
        mlist.add(new Model_class(R.drawable.stickman,"person name"));
        mlist.add(new Model_class(R.drawable.stickman,"person name"));
        mlist.add(new Model_class(R.drawable.stickman,"person name"));

    }
}
