package com.app.navigationcomponentsample;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
public class FirstFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController navController = Navigation.findNavController(view);
        Button button = view.findViewById(R.id.start);
        button.setOnClickListener(view1 -> {
            navController.navigate(R.id.action_firstFragment_to_secondFragment);
        });

        Button toEnd = view.findViewById(R.id.toEnd);
        toEnd.setOnClickListener(view1 -> {
            navController.navigate(R.id.action_firstFragment_to_thirdFragment);
        });
    }
}