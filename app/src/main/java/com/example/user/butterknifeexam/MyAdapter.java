package com.example.user.butterknifeexam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by user on 2017-09-12.
 */

public class MyAdapter extends BaseAdapter {
    private Context context;

    public MyAdapter(Context context){
        this.context = context;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        ViewHolder holder;
        LayoutInflater inflater = LayoutInflater.from(context);

        if(view != null){
            holder = (ViewHolder) view.getTag();
        }
        else{
            view = inflater.inflate(R.layout.whatever, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }

        holder.name.setText("John Doe");

        return view;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class ViewHolder{
        @BindView(R.id.title) TextView name;
        @BindView(R.id.job_title) TextView jobTitle;

        public ViewHolder(View view){
            ButterKnife.bind(this, view);
        }

    }

}
