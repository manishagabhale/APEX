package com.example.apex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class ExamActivity extends AppCompatActivity {

    ViewPager viewPager;
    //ViewPager num_view_pager;
    ArrayList<ExamModel> examModels;
    ArrayList<QuestionModel> questionModels;

    ExamAdapter examAdapter;

    Button save_next;

    RecyclerView mRecyclerView;

    List<QuestionModel> exampleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);

        viewPager = findViewById(R.id.question_vp);
        save_next = findViewById(R.id.btn_save_next);
        //num_view_pager = findViewById(R.id.que_view_pager);

        loadData();
    //    loadQuestionNumber();


        exampleList = new ArrayList<>();

        exampleList.add(new QuestionModel("1"));
        exampleList.add(new QuestionModel("2"));
        exampleList.add(new QuestionModel("3"));
        exampleList.add(new QuestionModel("4"));
        exampleList.add(new QuestionModel("5"));
        exampleList.add(new QuestionModel("6"));


        mRecyclerView = findViewById(R.id.que_view_pager);
        LinearLayoutManager manager1 = new LinearLayoutManager(this);
        manager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(manager1);


        QuestionAdapter adapter1 = new QuestionAdapter(this,exampleList);
        mRecyclerView.setAdapter(adapter1);



  }
//
//    private void loadQuestionNumber() {
//        questionModels = new ArrayList<>();
//
//        questionModels.add(new QuestionModel(
//                "1"));
//        questionModels.add(new QuestionModel(
//                "2"));
//
//        numAdapter = new NumAdapter(this,questionModels);
//        num_view_pager.setAdapter(numAdapter);
//    }

    private void loadData() {
        examModels = new ArrayList<>();

        examModels.add(new ExamModel(
                "Question 1",
                "option1",
                "option2",
                "option3",
                "option4"
        ));
        examModels.add(new ExamModel(
                "choose correct answer",
                "option1",
                "option2",
                "option3",
                "option4"
        ));

        examAdapter = new ExamAdapter(this,examModels);
        viewPager.setAdapter(examAdapter);


    }
}