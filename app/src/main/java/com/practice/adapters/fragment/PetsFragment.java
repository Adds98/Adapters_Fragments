package com.practice.adapters.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.practice.adapters.R;
import com.practice.adapters.adapter.CategoryAdapter;
import com.practice.adapters.model.Category;
import com.practice.adapters.model.mock.MockCategory;

public class PetsFragment extends Fragment {

    RecyclerView category;
    CategoryAdapter categoryAdapter;
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

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        setup();
        events();
    }

    private void events() {
        categoryAdapter.setCategoryPet(((category, position) -> {
            //Filtrar los resultado de Mascotas por Categoría
            Toast.makeText(getContext(), category.getName(), Toast.LENGTH_SHORT).show();
        }));
    }

    private void init(View  view) {
        category = view.findViewById(R.id.recycler_category_pet);
    }

    private void setup() {
        loadCategory();
    }

    private void loadCategory() {
        categoryAdapter = new CategoryAdapter(MockCategory.getCategories());
        category.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
    }
}