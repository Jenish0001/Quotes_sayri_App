package com.example.quotes_sayri_app.Controller;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quotes_sayri_app.Home_Screen.MainActivity;
import com.example.quotes_sayri_app.Model.Model_class;
import com.example.quotes_sayri_app.R;
import com.example.quotes_sayri_app.Home_Screen.Sayri;

import java.util.ArrayList;
import java.util.List;

public class My_Rv_Adpter extends RecyclerView.Adapter<My_Rv_Adpter.ViewData> {

    Activity activity;
    String[] name;
    int[] imge; List<Model_class> l1 = new ArrayList<>();

    public My_Rv_Adpter(MainActivity mainActivity, List<Model_class> l1) {
        activity = mainActivity;
        this.name = name;
        this.l1 = l1;
        this.imge = imge;

    }

    @NonNull
    @Override
    public ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(activity).inflate(R.layout.item, parent, false);
        return new ViewData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewData holder, int position) {
        String title=l1.get(position).getName();

        holder.txt_item.setText(l1.get(position).getName());
        holder.image_item.setImageResource(l1.get(position).getImg());
        holder.set_icon.setImageResource(l1.get(position).getSet_img());

        holder.card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(activity, Sayri.class);
                intent.putExtra("n1",title);
                activity.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return l1.size();
    }

    class ViewData extends RecyclerView.ViewHolder {

        private final TextView txt_item;
        private final ImageView image_item;
        private final CardView card_view;
        private final ImageView set_icon;

        public ViewData(@NonNull View itemView) {

            super(itemView);

            txt_item = itemView.findViewById(R.id.txt_item);
            image_item = itemView.findViewById(R.id.image_item);
            card_view = itemView.findViewById(R.id.card_view);
            set_icon=itemView.findViewById(R.id.set_icon);

        }
    }

}



