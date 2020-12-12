package com.example.daikin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GridBaoTriAdapter extends BaseAdapter {
    private Context context;
    private int mylayout;
    private List<GridBaoTriModel> gridBaoTriModelList;

    public GridBaoTriAdapter(Context context, int mylayout, List<GridBaoTriModel> gridBaoTriModelList) {
        this.context = context;
        this.mylayout = mylayout;
        this.gridBaoTriModelList = gridBaoTriModelList;
    }

    @Override
    public int getCount() {
        return gridBaoTriModelList.size();
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
        convertView = layoutInflater.inflate(R.layout.dong_grid_baotri,null);
        TextView textView= convertView.findViewById(R.id.txtndGridbt);
        ImageView imageView=convertView.findViewById(R.id.imgDongGridbt);
        GridBaoTriModel gridBaoTriModel=gridBaoTriModelList.get(position);
        textView.setText(gridBaoTriModel.getNoiDung());
        imageView.setImageResource(gridBaoTriModel.getHinhAnh());
        return convertView;
    }
}
