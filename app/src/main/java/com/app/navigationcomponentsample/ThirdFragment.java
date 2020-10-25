package com.app.navigationcomponentsample;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ThirdFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController navController = Navigation.findNavController(view);
        Button button = view.findViewById(R.id.endGame);
        button.setOnClickListener(view1 -> {
            //Nav Options will help to pop up all previous opened fragments
            NavOptions navOptions = new NavOptions.Builder().setPopUpTo(R.id.firstFragment, true).build();
            navController.navigate(R.id.action_thirdFragment_to_firstFragment, null, navOptions);
        });
    }
}