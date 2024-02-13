package com.example.netclanexplorer.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.netclanexplorer.R;
import com.example.netclanexplorer.adapter.PersonalAdapter;
import com.example.netclanexplorer.model.PersonalItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersonalFragment extends Fragment {
    RecyclerView recyclerView;
    PersonalAdapter personalAdapter;
    public PersonalFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_personal, container, false);

         recyclerView = view.findViewById(R.id.recyclerPersonal);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        List<PersonalItem> dataList = new ArrayList<>();
        dataList.add(new PersonalItem("John Doe", "City, Country", "5 km", "#Traveler", "AB", "Hello, community!"));
        dataList.add(new PersonalItem("Jane Smith", "Another City", "10 km", "#Foodie", "AB", "Greetings!"));
        dataList.add(new PersonalItem("Alice Wonderland", "Wonderland City", "15 km", "#Adventurer", "AB", "Hello from Wonderland!"));
        dataList.add(new PersonalItem("Bob Explorer", "Explorer City", "8 km", "#Explorer", "AB", "Greetings, fellow explorers!"));
        dataList.add(new PersonalItem("Charlie Foodie", "Foodie City", "12 km", "#FoodLover", "AB", "Food is life!"));
        dataList.add(new PersonalItem("David Traveler", "Travel City", "20 km", "#Wanderlust", "AB", "Wander often, wonder always."));
        dataList.add(new PersonalItem("Eva Nomad", "Nomad City", "25 km", "#NomadLife", "AB", "Living the nomad dream!"));
        dataList.add(new PersonalItem("Frank Adventurer", "Adventure City", "18 km", "#AdventureTime", "AB", "Adventure awaits!"));
        dataList.add(new PersonalItem("Grace Explorer", "Explorer City", "8 km", "#Explorer", "AB", "Let's explore together!"));
        dataList.add(new PersonalItem("Henry Foodie", "Foodie City", "12 km", "#FoodLover", "AB", "Foodie for life."));
        dataList.add(new PersonalItem("Isabel Traveler", "Travel City", "20 km", "#Wanderlust", "AB", "Wandering and wondering."));
        dataList.add(new PersonalItem("Jack Nomad", "Nomad City", "25 km", "#NomadLife", "AB", "Nomadic soul."));

        personalAdapter = new PersonalAdapter(dataList,getActivity());
        recyclerView.setAdapter(personalAdapter);

return view;
    }
}