package com.example.quotes_sayri_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.quotes_sayri_app.Controller.My_Rv_Adpter;
import com.example.quotes_sayri_app.Controller.My_Rv_Adpter1;
import com.example.quotes_sayri_app.Home_Screen.MainActivity;
import com.example.quotes_sayri_app.Model.Model_class;

import java.util.ArrayList;
import java.util.List;

public class Sayri extends AppCompatActivity {

    private RecyclerView rv_sayri;
    String[] name1 = {"hi","ji","k","hi","ji","k","hi","ji","k","hi","ji","k",};
    List<Model_class> l2 = new ArrayList<>();
    private TextView title_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayri);

        blinding();
        for (int i = 0; i < name1.length; i++) {
            Model_class model_class = new Model_class(name1[i]);
            l2.add(model_class);

        }


        My_Rv_Adpter1 adpter = new My_Rv_Adpter1(Sayri.this, l2);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rv_sayri.setLayoutManager(layoutManager);
        rv_sayri.setAdapter(adpter);


    }

    private void blinding() {
        rv_sayri = findViewById(R.id.rv_sayri);
        title_text=findViewById(R.id.title_text);
    }

}