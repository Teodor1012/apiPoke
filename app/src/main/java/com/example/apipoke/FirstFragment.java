package com.example.apipoke;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.apipoke.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        ArrayList <String> items = new ArrayList<>();

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(

                getContext(),
                R.layout.lv_pokemon_row,
                R.id.txtListName,
                items
        );

        binding.listview1.setAdapter(adapter);




    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}