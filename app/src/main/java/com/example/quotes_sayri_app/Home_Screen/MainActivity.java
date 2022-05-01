package com.example.quotes_sayri_app.Home_Screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.quotes_sayri_app.Controller.My_Rv_Adpter;
import com.example.quotes_sayri_app.Model.Model_class;
import com.example.quotes_sayri_app.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_view;

  public static String[]  name = {"Love", "Friendship", " Birthday ", "Attitude","Love", "Friendship", " Birthday ", "Attitude","Love", "Friendship", " Birthday ", "Attitude",};
    int[] img = {R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
    };
    List<Model_class> l1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blinding();

        recycleviewadpter();
    }

    private void blinding() {
        rv_view = findViewById(R.id.rv_view);
    }

    void recycleviewadpter() {

        for(int i=0;i< name.length;i++)
        {
            Model_class model_class=new Model_class(name[i],img[i]);
            l1.add(model_class);
        }

        My_Rv_Adpter adpter = new My_Rv_Adpter(MainActivity.this,l1);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,3);
        rv_view.setLayoutManager(layoutManager);
        rv_view.setAdapter(adpter);

    }

}