package com.example.models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.restaurent.R;

import java.util.List;


public class DishAdapter extends BaseAdapter {
    private Context context;
    private List<Dish> dishes;

    public DishAdapter(Context context, List<Dish> dishes) {
        this.context = context;
        this.dishes = dishes;
    }

    @Override
    public int getCount() {
        return dishes.size();
    }

    @Override
    public Object getItem(int position) {
        return dishes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.menu_listv, parent, false);
        }

        Dish Dish = (Dish) getItem(position);

        TextView dishName = convertView.findViewById(R.id.dishName);
        TextView dishDescription = convertView.findViewById(R.id.dishDescription);
        TextView dishPrice = convertView.findViewById(R.id.dishPrice);

        dishName.setText(Dish.getName());
        dishDescription.setText(Dish.getDescription());
        dishPrice.setText(Dish.getPrice());

        return convertView;
    }
}