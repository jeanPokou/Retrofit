package com.jeanpokou.retrofit.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.jeanpokou.retrofit.R;
import com.jeanpokou.retrofit.api.model.GitHubRepo;

import java.util.List;

public class GitHubRepoAdapter extends ArrayAdapter<GitHubRepo> {
    private Context context;
    private List<GitHubRepo> values;
    public GitHubRepoAdapter(@NonNull Context context, List<GitHubRepo>values) {
        super(context, R.layout.list_item_pagination,values);
        this.context = context;
        this.values = values;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item_pagination,parent,false);
        }

        TextView textView = (TextView) convertView.findViewById(R.id.list_item_pagination_text);
        GitHubRepo item = values.get(position);
        textView.setText(item.getName());
        return  convertView;
    }
}