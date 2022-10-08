package com.example.actv4customizedadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class NamesAdapter extends BaseAdapter
{
    private Context context;
    private int layout;
    private List<Info> info;

    public NamesAdapter(Context context, int layout, List<Info> info)
    {
        this.context = context;
        this.layout = layout;
        this.info = info;
    }

    @Override
    public int getCount() {return info.size();}

    @Override
    public Object getItem(int position) {return info.get(position);}

    @Override
    public long getItemId(int id) {return id;}

    @Override
    public View getView(int position, View view, ViewGroup viewGroup)
    {
      View v =view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        v = layoutInflater.inflate(R.layout.list_alumnos, null);
        String nombreActual = String.valueOf(info.get(position));
        TextView tvNombre = v.findViewById(R.id.tvNombre);
        tvNombre.setText(nombreActual);
        TextView tvApe = v.findViewById(R.id.tvApe);
        tvApe.setText(nombreActual);
        return v;

    }
}
