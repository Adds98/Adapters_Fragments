package com.practice.adapters.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.practice.adapters.R;

public class PetsFragment extends Fragment {


    public PetsFragment() {
        // Required empty public constructor
    }

    public static PetsFragment newInstance(String param1, String param2) {
        PetsFragment fragment = new PetsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pets, container, false);
    }
}