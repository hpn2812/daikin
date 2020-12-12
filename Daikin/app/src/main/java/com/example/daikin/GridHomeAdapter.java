package com.example.daikin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridHomeAdapter extends BaseAdapter {
    private Context context;
    private int mylayout;
    private List<GridHomeModel> gridHomeModelList;

    public GridHomeAdapter(Context context, int mylayout, List<GridHomeModel> gridHomeModelList) {
        this.context = context;
        this.mylayout = mylayout;
        this.gridHomeModelList = gridHomeModelList;
    }

    @Override
    public int getCount() {
        return gridHomeModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.dong_grid_nd,null);
        TextView textView= convertView.findViewById(R.id.txtndGridnd);
        ImageView imageView=convertView.findViewById(R.id.imgDongGridnd);
        TextView txtTime=convertView.findViewById(R.id.txtndtime);
        GridHomeModel gridHomeModel= gridHomeModelList.get(position);
        textView.setText(gridHomeModel.getNoiDung());
        imageView.setImageResource(gridHomeModel.getHinhAnh());
        txtTime.setText(gridHomeModel.getTime());
        return convertView;

    }
}
