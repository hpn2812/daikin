package com.example.daikin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class PhuKien extends AppCompatActivity {
    GridView grdView;
    ArrayList<PhuKienModel> gridPhuKienModels;
   PhuKienAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phu_kien);
        anhxa();
        adapter= new PhuKienAdapter(this,R.layout.dong_linh_kien,gridPhuKienModels);
        grdView.setAdapter(adapter);
    }

    private void anhxa() {
        grdView=findViewById(R.id.gridLinhKien);
        gridPhuKienModels=new ArrayList<>();
        gridPhuKienModels.add(new PhuKienModel(R.drawable.cale,"Cà lê lực Tone TSP55-26"));
        gridPhuKienModels.add(new PhuKienModel(R.drawable.dugcu,"Đồng hồ áp  suất ga (R12,R22,R502)"));
        gridPhuKienModels.add(new PhuKienModel(R.drawable.dayga,"Dây ga chống phỏng"));
        gridPhuKienModels.add(new PhuKienModel(R.drawable.maybom,"Bơm chân không một cấp"));
        gridPhuKienModels.add(new PhuKienModel(R.drawable.vannap,"Van nạp ga Tasco"));
    }
}