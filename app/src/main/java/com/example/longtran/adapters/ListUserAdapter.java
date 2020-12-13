package com.example.longtran.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.longtran.CrudActivity;
import com.example.longtran.entities.User;
import com.example.minhtruong.R;

import java.util.ArrayList;

public class ListUserAdapter extends BaseAdapter {
    private ArrayList<User> users;

    public ListUserAdapter(ArrayList<User> users) {
        this.users = users;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int i) {
        return users.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        System.out.println("123" + users);
        View viewUser;
        if (view == null) {
            viewUser = View.inflate(viewGroup.getContext(), R.layout.item_listview, null);
        } else viewUser = view;
        viewUser = View.inflate(viewGroup.getContext(), R.layout.item_listview, null);
        TextView tvName = viewUser.findViewById(R.id.tvName);
        TextView tvUsername = viewUser.findViewById(R.id.tvUsername);
        TextView tvId = viewUser.findViewById(R.id.tvId);
        tvName.setText("Name: " + users.get(i).getName());
        tvUsername.setText("UserN: " + users.get(i).getUsername());
        tvId.setText("Id: " + users.get(i).getId());

        return viewUser;
    }

}
