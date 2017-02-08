package com.example.root.recyclerviewexample.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.root.recyclerviewexample.R;
import com.example.root.recyclerviewexample.model.Student;

/**
 * Created by root on 24/1/17.
 */

public class StudentHolder extends RecyclerView.ViewHolder {

    private TextView mName,mAge,mDept;

    public StudentHolder(View itemView) {
        super(itemView);
        mName = (TextView) itemView.findViewById(R.id.name);
        mAge = (TextView) itemView.findViewById(R.id.age);
        mDept = (TextView) itemView.findViewById(R.id.dept);
    }

    public void bindData(Student student){
        if(null != student){
            mName.setText(student.getmName());
            mDept.setText(student.getmDept());
            mAge.setText(""+student.getMage());
        }
    }
}
