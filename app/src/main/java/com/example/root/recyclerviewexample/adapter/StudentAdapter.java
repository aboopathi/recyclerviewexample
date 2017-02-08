package com.example.root.recyclerviewexample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.root.recyclerviewexample.R;
import com.example.root.recyclerviewexample.holder.StudentHolder;
import com.example.root.recyclerviewexample.model.Student;

import java.util.ArrayList;

/**
 * Created by root on 24/1/17.
 */

public class StudentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private ArrayList<Student> mStudents;

    public void setStudent(ArrayList<Student> students){
        this.mStudents = students;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student,parent,false);
        return new StudentHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Student student = getStudent(position);
        ((StudentHolder)holder).bindData(student);

    }

    private Student getStudent(int position) {
        return  null != mStudents && mStudents.size()>position ? mStudents.get(position) : null;

    }

    @Override
    public int getItemCount() {
        return null != mStudents ? mStudents.size() : 0;
    }
}
