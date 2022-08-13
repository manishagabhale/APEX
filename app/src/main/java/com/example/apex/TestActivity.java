package com.example.apex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    List<TestModel> exampleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        exampleList = new ArrayList<>();


        exampleList.add(new TestModel("Pharmaceutics Subject wise Exam","125", "180","3"));
        exampleList.add(new TestModel("AEROSOLS", "50", "45","3"));
        exampleList.add(new TestModel("Pharmaceutics Subject wise Exam","125", "180","3"));
        exampleList.add(new TestModel("AEROSOLS", "50", "45","3"));

        mRecyclerView = findViewById(R.id.test_rv);
        LinearLayoutManager manager1 = new LinearLayoutManager(this);
        //manager1.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manager1);


        TestAdapter adapter1 = new TestAdapter(this,exampleList);
        mRecyclerView.setAdapter(adapter1);

    }
}