package com.shohagapp.quicknote.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shohagapp.quicknote.R;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.viewHolder> {

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        TextView nTitle, nDescription;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nTitle =itemView.findViewById(R.id.titleTV);
            nDescription =itemView.findViewById(R.id.descTV);
        }
    }
}