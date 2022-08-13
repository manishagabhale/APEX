package com.example.apex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder> {
    private Context context;
    private List<QuestionModel> mExampleList;

    public QuestionAdapter(Context context, List<QuestionModel> mExampleList) {
        this.context = context;
        this.mExampleList = mExampleList;
    }

    @NonNull

    @Override
    public QuestionAdapter.QuestionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_item_question_no,parent,false);

        return new QuestionViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionAdapter.QuestionViewHolder holder, int position) {
        QuestionModel currentItem = mExampleList.get(position);

        holder.question_no.setText(currentItem.getQuestion_no());

    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public class QuestionViewHolder extends RecyclerView.ViewHolder {

        public TextView question_no;


        public QuestionViewHolder(@NonNull View itemView) {
            super(itemView);

            question_no = itemView.findViewById(R.id.txt_questions_num);

        }
    }

}

