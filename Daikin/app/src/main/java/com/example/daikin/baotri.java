package com.example.daikin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class baotri extends AppCompatActivity {
    GridView grdView;
    ArrayList<GridBaoTriModel> gridBaoTriModels;
    GridBaoTriAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baotri);
        anhxa();
        adapter= new GridBaoTriAdapter(this,R.layout.dong_grid_baotri,gridBaoTriModels);

        grdView.setAdapter(adapter);
    }
    private void anhxa() {

        grdView=findViewById(R.id.gridbt);
        gridBaoTriModels=new ArrayList<>();
        gridBaoTriModels.add(new GridBaoTriModel(R.drawable.iconbaotri,"Bảo trì tiêu chuẩn"));
        gridBaoTriModels.add(new GridBaoTriModel(R.drawable.iconsuachua,"Kháng khuẩn sinh học"));
        gridBaoTriModels.add(new GridBaoTriModel(R.drawable.iconeshop,"Chống vi khuẩn và nấm móc"));
        gridBaoTriModels.add(new GridBaoTriModel(R.drawable.iconphukien,"Bảo trì toàn diện"));
        gridBaoTriModels.add(new GridBaoTriModel(R.drawable.iconzalous,"Sạch dầu mỡ"));


    }
}