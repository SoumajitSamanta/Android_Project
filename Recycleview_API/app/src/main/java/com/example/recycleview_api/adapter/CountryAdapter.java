package com.example.recycleview_api.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview_api.R;
import com.example.recycleview_api.model.Countrymodel;


import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {
    private ArrayList<CountryAdapter> countries;

    public CountryAdapter(ArrayList<CountryAdapter> countries) {
        this.countries = countries;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
       View view = layoutInflater.inflate(R.layout.recycleview_item,parent,false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryAdapter.CountryViewHolder holder, int position) {
        
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
            holder.textView.setText(countries.get(position).getName());
    }

    @Override
    public int getItemCount() {

    }
}



class CountryViewHolder extends RecyclerView.ViewHolder{
    TextView textView;

    public CountryViewHolder(@NonNull View itemView){
        super(itemView);
        textView = itemView.findViewById(R.id.country_textView);
    }
}