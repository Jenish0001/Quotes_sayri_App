package com.example.quotes_sayri_app.Controller;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quotes_sayri_app.Model.Model_class;
import com.example.quotes_sayri_app.R;
import com.example.quotes_sayri_app.Sayri;

import java.util.ArrayList;
import java.util.List;


public class My_Rv_Adpter1 extends RecyclerView.Adapter<My_Rv_Adpter1.ViewData> {
    Activity activity;
    List<Model_class> l2 = new ArrayList<>();

    public My_Rv_Adpter1(Sayri sayri, List<Model_class> l2) {


        activity = sayri;
        this.l2 = l2;
    }


    @NonNull
    @Override
    public My_Rv_Adpter1.ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.item2, parent, false);

        return new ViewData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewData holder, int position) {

        holder.txt_item2.setText(l2.get(position).getName());

    }


    @Override
    public int getItemCount() {
        return l2.size();
    }

    public class ViewData extends RecyclerView.ViewHolder {

        private final CardView card_sayri;
        private final TextView txt_item2;

        public ViewData(@NonNull View itemView) {

            super(itemView);

            card_sayri = itemView.findViewById(R.id.card_sayri);
            txt_item2 = itemView.findViewById(R.id.txt_item2);

        }
    }
}
