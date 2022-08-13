package com.example.apex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class ExamAdapter extends PagerAdapter {
    Context context;
    ArrayList<ExamModel> model;

    public ExamAdapter(Context context, ArrayList<ExamModel> model) {
        this.context = context;
        this.model = model;
    }

    @Override
    public int getCount() {
        return model.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull  View view, @NonNull  Object object) {
        return view== object;
    }

    @NonNull

    @Override
    public Object instantiateItem(@NonNull  ViewGroup container, int position) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_item_question,container,false);
        TextView questiontv = view.findViewById(R.id.txt_questions);
        TextView option1tv = view.findViewById(R.id.txt_option1);
        TextView option2tv = view.findViewById(R.id.txt_option2);
        TextView option3tv = view.findViewById(R.id.txt_option3);
        TextView option4tv = view.findViewById(R.id.txt_option4);

        ExamModel examModel = model.get(position);
        String question = examModel.getQuestion();
        String option1 = examModel.getOption1();
        String option2 = examModel.getOption2();
        String option3 = examModel.getOption3();
        String option4 = examModel.getOption4();


        questiontv.setText(question);
        option1tv.setText(option1);
        option2tv.setText(option2);
        option3tv.setText(option3);
        option4tv.setText(option4);


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "slide", Toast.LENGTH_SHORT).show();
            }
        });

        container.addView(view,position);
        return view;
    }

    @Override
    public void destroyItem(@NonNull  ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
