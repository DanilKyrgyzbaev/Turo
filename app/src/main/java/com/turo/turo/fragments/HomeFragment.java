package com.turo.turo.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.turo.turo.R;


public class HomeFragment extends Fragment {


    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

//  public static SearchFragment newInstance() {
//        return new SearchFragment();
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

}
