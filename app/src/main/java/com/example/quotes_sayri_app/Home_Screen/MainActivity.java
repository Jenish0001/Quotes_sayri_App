package com.example.quotes_sayri_app.Home_Screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

import com.example.quotes_sayri_app.Controller.My_Rv_Adpter;
import com.example.quotes_sayri_app.Model.Model_class;
import com.example.quotes_sayri_app.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_view;

    String[] name = {"Love", "Friendship", " Birthday ", "Attitude", "Alone", "Failure", " God ", "Power", "Experience", "Leadership", " Science ", "Sports",};


    int[] img = {R.drawable.imge1,
            R.drawable.image12,
            R.drawable.imge3,
            R.drawable.imge4,
            R.drawable.imge5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image9,
            R.drawable.imge1,
            R.drawable.imag10,
            R.drawable.img11,
            R.drawable.imge1,
    };
    int[] set_img={
            R.drawable.love1,
            R.drawable.friend,
            R.drawable.birthday,
            R.drawable.attitude,
            R.drawable.alone,
            R.drawable.faliure,
            R.drawable.god,
            R.drawable.power,
            R.drawable.experience,
            R.drawable.leadership,
            R.drawable.science,
            R.drawable.cycling,


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

        for (int i = 0; i < name.length; i++) {
            Model_class model_class = new Model_class(name[i], img[i],set_img[i]);
            l1.add(model_class);
        }

        My_Rv_Adpter adpter = new My_Rv_Adpter(MainActivity.this, l1);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        rv_view.setLayoutManager(layoutManager);
        rv_view.setAdapter(adpter);

    }

}