package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Dog> dogList = new ArrayList<Dog>();
    private MyAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initDogList();

    }

    private void initDogList() {

        dogList.add(new Dog("dog1" , R.drawable.dog1));
        dogList.add(new Dog("dog2" , R.drawable.dog2));
        dogList.add(new Dog("dog3" , R.drawable.dog3));
        dogList.add(new Dog("dog4" , R.drawable.dog4));
        dogList.add(new Dog("dog5" , R.drawable.dog5));
        dogList.add(new Dog("dog6" , R.drawable.dog6));
        dogList.add(new Dog("dog7" , R.drawable.dog7));
        dogList.add(new Dog("dog8" , R.drawable.dog8));
        dogList.add(new Dog("dog9" , R.drawable.dog9));
        dogList.add(new Dog("dog10" , R.drawable.dog10));
    }


    private void initViews() {

        recyclerView = (RecyclerView)findViewById(R.id.RecyclerView);
       // LinearLayoutManager manager  = new LinearLayoutManager(this);
       // manager.setOrientation(LinearLayoutManager.HORIZONTAL);


         GridLayoutManager manager = new GridLayoutManager(this,2);

        //StaggeredGridLayoutManager manger = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        mAdapter = new MyAdapter(dogList);
        recyclerView.setAdapter(mAdapter);


    }
}
