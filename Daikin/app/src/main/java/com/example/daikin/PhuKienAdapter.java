package com.example.daikin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PhuKienAdapter extends BaseAdapter {
    private Context context;
    private int mylayout;
    private List<PhuKienModel> gridPhuKienList;

    public PhuKienAdapter(Context context, int mylayout, List<PhuKienModel> gridPhuKienList) {
        this.context = context;
        this.mylayout = mylayout;
        this.gridPhuKienList = gridPhuKienList;
    }

    @Override
    public int getCount() {
        return gridPhuKienList.size();
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
        convertView = layoutInflater.inflate(R.layout.dong_linh_kien,null);
        TextView textView= convertView.findViewById(R.id.txtLinhKien);
        ImageView imageView=convertView.findViewById(R.id.imgLinhKien);
        PhuKienModel phuKienModel=gridPhuKienList.get(position);
        textView.setText(phuKienModel.getNoiDung());
        imageView.setImageResource(phuKienModel.getHinhAnh());
        return convertView;
    }
}
