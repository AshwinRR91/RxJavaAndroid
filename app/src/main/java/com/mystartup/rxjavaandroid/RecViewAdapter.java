package com.mystartup.rxjavaandroid;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;


public class RecViewAdapter extends RecyclerView.Adapter<RecViewAdapter.ViewHold> {

    private final List<String> list = new ArrayList<>();
    private ViewHold viewHold;
    @NonNull
    @Override
    public ViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.contents_of_recycler_view,parent,false);
        viewHold = new ViewHold(view);
        return viewHold;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHold holder, int position) {
        holder.contentText.setText(list.get(position));
        Log.i("position"+ position,list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void addStringsToAdapter(String str){
        list.add(str);
        notifyItemInserted(list.size()-1);
    }



    public class ViewHold extends RecyclerView.ViewHolder{
        TextView contentText;
        public ViewHold(@NonNull View itemView) {
            super(itemView);
            contentText = itemView.findViewById(R.id.content_text);
            }
    }

}
