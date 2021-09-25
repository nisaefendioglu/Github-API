package com.nisaefendioglu.github;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RepoAdapter extends RecyclerView.Adapter<RepoAdapter.RepoHolder> {

    List<Repo> repoList = new ArrayList<>();
    LayoutInflater layoutInflater;

    public RepoAdapter(Activity activity, List<Repo> repoList) {
        this.layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        this.repoList = repoList;
    }

    @NonNull
    @Override
    public RepoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.row_layout, null);
        RepoHolder repoHolder = new RepoHolder(view);
        return repoHolder;
    }

    @Override
    public int getItemCount() {
        return repoList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull RepoHolder holder, int position) {

        Repo repo = repoList.get(position);
        holder.nameTextView.setText(repo.getName());
        holder.descriptionTextView.setText(repo.getDescription());

    }

    class RepoHolder extends RecyclerView.ViewHolder {

        TextView nameTextView, descriptionTextView;

        public RepoHolder(@NonNull View itemView) {
            super(itemView);

            nameTextView = itemView.findViewById(R.id.name);
            descriptionTextView = itemView.findViewById(R.id.description);

        }
    }

}
