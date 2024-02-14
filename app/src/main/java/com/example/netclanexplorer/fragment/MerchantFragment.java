package com.example.netclanexplorer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.netclanexplorer.R;
import com.example.netclanexplorer.adapter.BusinessAdapter;
import com.example.netclanexplorer.adapter.MerchantAdapter;
import com.example.netclanexplorer.model.PersonalItem;

import java.util.ArrayList;
import java.util.List;

public class MerchantFragment extends Fragment {
    RecyclerView recyclerView;
    MerchantAdapter merchantAdapter;
    public MerchantFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_merchant, container, false);
        recyclerView = view.findViewById(R.id.recyclerMerchant);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        List<PersonalItem> dataList = new ArrayList<>();
        dataList.add(new PersonalItem("John Doe", "City, Country", "5 km", "Traveler | Foodie | Foodie", "Hello, community!"));
        dataList.add(new PersonalItem("Jane Smith", "Another City", "10 km", "Foodie | Foodie | Adventurer", "Greetings!"));
        dataList.add(new PersonalItem("Alice Wonderland", "Wonderland City", "15 km", "Adventurer | Adventurer | Foodie", "Hello from Wonderland!"));
        dataList.add(new PersonalItem("Bob Explorer", "Explorer City", "8 km", "Explorer | Foodie | Foodie", "Greetings, fellow explorers!"));
        dataList.add(new PersonalItem("Charlie Foodie", "Foodie City", "12 km", "FoodLover | Foodie | Adventurer", "Food is life!"));
        dataList.add(new PersonalItem("David Traveler", "Travel City", "20 km", "Wanderlust | Foodie | Foodie", "Wander often, wonder always."));
        dataList.add(new PersonalItem("Eva Nomad", "Nomad City", "25 km", "NomadLife | Foodie | Foodie", "Living the nomad dream!"));
        dataList.add(new PersonalItem("Frank Adventurer", "Adventure City", "18 km", "AdventureTime | Foodie | Adventurer", "Adventure awaits!"));
        dataList.add(new PersonalItem("Grace Explorer", "Explorer City", "8 km", "Explorer | Foodie | Foodie", "Let's explore together!"));
        dataList.add(new PersonalItem("Henry Foodie", "Foodie City", "12 km", "FoodLover | Foodie | Adventurer", "Foodie for life."));
        dataList.add(new PersonalItem("Isabel Traveler", "Travel City", "20 km", "Wanderlust | Adventurer | Foodie", "Wandering and wondering."));
        dataList.add(new PersonalItem("Jack Nomad", "Nomad City", "25 km", "NomadLife | Foodie | Adventurer", "Nomadic soul."));
        merchantAdapter = new MerchantAdapter(getActivity(), dataList);
        recyclerView.setAdapter(merchantAdapter);
        return view;
    }
}