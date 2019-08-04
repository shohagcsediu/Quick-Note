package com.shohagapp.quicknote.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shohagapp.quicknote.R;
import com.shohagapp.quicknote.model.Note;

import java.util.ArrayList;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.viewHolder> {

    private ArrayList<Note> mynote;

    public NoteAdapter(ArrayList<Note> myNote) {
        this.mynote = myNote;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Note current = mynote.get(position);

        holder.nTitle.setText(current.getmTitle());
        holder.nDescription.setText(current.getmDescription());
    }

    @Override
    public int getItemCount() {
        if(mynote.isEmpty()){
            return 0;
        }else {
            return mynote.size();
        }

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