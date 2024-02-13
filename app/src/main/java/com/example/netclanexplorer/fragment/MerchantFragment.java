package com.example.netclanexplorer.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.netclanexplorer.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MerchantFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MerchantFragment extends Fragment{
    public MerchantFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_merchant, container, false);
    }
}