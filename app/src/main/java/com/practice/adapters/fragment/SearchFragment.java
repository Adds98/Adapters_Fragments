package com.practice.adapters.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.practice.adapters.R;
import com.practice.adapters.adapter.PetAdapter;
import com.practice.adapters.model.mock.MockPet;

public class SearchFragment extends Fragment {

    private SearchView searchView;
    private RecyclerView recyclerSearch;
    private PetAdapter petAdapter;

    public SearchFragment() {
        // Required empty public constructor
    }

    public static SearchFragment newInstance() {
        SearchFragment fragment = new SearchFragment();
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
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        setup();
        events();
    }

    private void events() {
        //Mediante estos listeners implemente la busqueda o filtrado de Mascotas
        //La lista de Mascotas se obtiene de MockPet.getPetList(context, cantidad)
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }

    private void setup() {
        loadPets();
    }

    private void loadPets() {
        petAdapter = new PetAdapter(getContext(), MockPet.getPetList(getContext(), 25));

        recyclerSearch.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void init(View view) {
        searchView = view.findViewById(R.id.searchView);
        recyclerSearch = view.findViewById(R.id.recyclerSearch);
    }
}