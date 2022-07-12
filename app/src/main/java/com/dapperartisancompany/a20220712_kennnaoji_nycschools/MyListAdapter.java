package com.dapperartisancompany.a20220712_kennnaoji_nycschools;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>{
    private List<Results> listdata;

    // RecyclerView recyclerView;
    public MyListAdapter(List<Results> listdata) {
        this.listdata = listdata;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.card_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Results myListData = listdata.get(position);
        holder.schoolName.setText(listdata.get(position).getName());
        holder.mathScoreView.setText("Math Score: " +listdata.get(position).getMathScore());
        holder.writingScoreView.setText("Writing Score: " +listdata.get(position).getReadingScore());
        holder.readingScoreView.setText("Reading Score: " +listdata.get(position).getWritingScore());
        holder.relativeLayout.setVisibility(myListData.isExpandable() ? View.VISIBLE : View.GONE);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            myListData.setExpandable(!myListData.isExpandable());
            notifyItemChanged(holder.getAdapterPosition());
            }
        });
    }


    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView schoolName, mathScoreView, writingScoreView, readingScoreView;
        public RelativeLayout relativeLayout;
        LinearLayout linearLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.schoolName = (TextView) itemView.findViewById(R.id.text_view_school_name);
            this.mathScoreView = (TextView) itemView.findViewById(R.id.math_score);
            this.writingScoreView = (TextView) itemView.findViewById(R.id.writing_score);
            this.readingScoreView = (TextView) itemView.findViewById(R.id.reading_score);

            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.expandable_view);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.whole_card_layout);
        }
    }
}
