package com.practice.adapters.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.practice.adapters.R;


public class RegisterPetFragment extends Fragment {
    public RegisterPetFragment() {
        // Required empty public constructor
    }

    public static RegisterPetFragment newInstance(String param1, String param2) {
        RegisterPetFragment fragment = new RegisterPetFragment();
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
        return inflater.inflate(R.layout.fragment_register_pet, container, false);
    }
}