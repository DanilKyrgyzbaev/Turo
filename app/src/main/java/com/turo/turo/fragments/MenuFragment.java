package com.turo.turo.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.turo.turo.AnouncementActivity;
import com.turo.turo.R;


public class MenuFragment extends Fragment {

    private Button floatingActionButton;

    public static MenuFragment newInstance () {
        return new MenuFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    private void initView() {

        floatingActionButton = getActivity().findViewById(R.id.my_anouncements_button_add);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addAnnounceIntant = new Intent(getActivity(), AnouncementActivity.class);
                startActivity(addAnnounceIntant);
            }
        });


    }

}
