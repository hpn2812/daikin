package com.example.daikin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridSmallAdapter extends BaseAdapter {
    private Context context;
    private int mylayout;
    private List<GridModel> gridModelList;

    public GridSmallAdapter(Context context, int mylayout, List<GridModel> gridModelList) {
        this.context = context;
        this.mylayout = mylayout;
        this.gridModelList = gridModelList;
    }

    @Override
    public int getCount() {
        return gridModelList.size();
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
        convertView = layoutInflater.inflate(R.layout.dong_grid_view,null);
        TextView textView= convertView.findViewById(R.id.txtndGrid);
        ImageView imageView=convertView.findViewById(R.id.imgDongGrid);
        GridModel gridModel= gridModelList.get(position);
        textView.setText(gridModel.getNoiDung());
        imageView.setImageResource(gridModel.getHinhAnh());
        return convertView;
    }
}
