package com.example.ankitkumar.expensecalculator.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ankitkumar.expensecalculator.Model.FirstPage;
import com.example.ankitkumar.expensecalculator.R;

import java.util.ArrayList;

public class MainAdapter extends BaseAdapter {

    Context context;
    ArrayList<FirstPage> arrayList;
    LayoutInflater mlayoutInflater;



    public MainAdapter(Context context, ArrayList<FirstPage> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        mlayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);



    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        FirstPage firstpage = new FirstPage();

        convertView= mlayoutInflater.inflate(R.layout.firstpage_layout,parent,false);

        ImageView imageview= (ImageView)convertView.findViewById(R.id.imageView);
        TextView textview = (TextView)convertView.findViewById(R.id.textView);

        imageview.setImageResource(arrayList.get(position).getImage());
        textview.setText(arrayList.get(position).getName());


        imageview.setScaleType(ImageView.ScaleType.CENTER_CROP);

        return convertView;
    }
}
