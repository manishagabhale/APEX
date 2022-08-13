package com.example.apex;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ExampleViewHolder> {
    private Context context;
    private List<TestModel> mExampleList;

    public TestAdapter(Context context, List<TestModel> mExampleList) {
        this.context = context;
        this.mExampleList = mExampleList;
    }

    @NonNull

        @Override
        public TestAdapter.ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(context).inflate(R.layout.list_item_test,parent,false);

            return new ExampleViewHolder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull TestAdapter.ExampleViewHolder holder, int position) {
            TestModel currentItem = mExampleList.get(position);

            holder.title.setText(currentItem.getTitle());
            holder.no_of_question.setText(currentItem.getNo_of_question());
            holder.duration.setText(currentItem.getDuration());
            holder.max_attempt.setText(currentItem.getMax_attempt());


            holder.attempt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(context, OverviewActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);

                }
            });


        }

        @Override
        public int getItemCount() {
            return mExampleList.size();
        }

        public class ExampleViewHolder  extends RecyclerView.ViewHolder {


            public TextView title;
            public TextView no_of_question;
            public TextView duration;
            public TextView max_attempt;
            Button attempt;

            public ExampleViewHolder(@NonNull  View itemView) {
                super(itemView);
                title = itemView.findViewById(R.id.txt_exam_title);
                no_of_question = itemView.findViewById(R.id.txt_no_of_question);
                duration = itemView.findViewById(R.id.txt_duration);
                max_attempt =itemView.findViewById(R.id.txt_max_attempt);
                attempt = itemView.findViewById(R.id.btn_attempt);
            }
        }
    }

