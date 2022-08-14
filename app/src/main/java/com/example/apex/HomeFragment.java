package com.example.apex;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {


    RecyclerView mRecyclerView;

    List<TestModel> exampleList;
    ViewPager viewPager;
    ArrayList<ExamModel> examModels;
    ExamAdapter examAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_home, container, false);

        viewPager = view.findViewById(R.id.question_day_vp);

        exampleList = new ArrayList<>();

        question();

        exampleList.add(new TestModel("Pharmaceutics Subject wise Exam","125", "180","3"));

        mRecyclerView = view.findViewById(R.id.quiz_rv);
        LinearLayoutManager manager1 = new LinearLayoutManager(getContext());
        //manager1.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manager1);


        TestAdapter adapter1 = new TestAdapter(getContext(),exampleList);
        mRecyclerView.setAdapter(adapter1);

        return  view;
    }

    private void question() {
        examModels = new ArrayList<>();

        examModels.add(new ExamModel(
                "choose correct answer",
                "option1",
                "option2",
                "option3",
                "option4"
        ));

        examAdapter = new ExamAdapter(getContext(),examModels);
        viewPager.setAdapter(examAdapter);

    }
}