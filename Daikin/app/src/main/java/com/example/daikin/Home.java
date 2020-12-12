package com.example.daikin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    GridView grdView1,grdView2;
    ArrayList<GridModel> gridModelArrayList;
    ArrayList<GridHomeModel> gridHomeModelArrayList;
    GridSmallAdapter adapter;
    GridHomeAdapter homeAdapter;
    ViewFlipper viewFlipper;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        grdView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                    startActivity(new Intent(Home.this,baotri.class));
//
//
//            }
//        });
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.btnbt);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.trangchu:
                        fragment = new Fragment();
                        break;
                    case R.id.donhang:
                        fragment = new FragmentDonHang();
                        break;
                    case R.id.thietbi:
                        fragment = new FragmentThietBi();
                        break;
                    case R.id.thongbao:
                        fragment = new FragmentThongBao();
                        break;
                    case R.id.taikhoan:
                        fragment = new FragmentAccount();
                        break;
                }

                fragmentTransaction.replace(R.id.hh,fragment);
                fragmentTransaction.commit();
                return true;
            }
        });

        int[] images={R.drawable.daikin1,R.drawable.daikin2,R.drawable.daikin3,R.drawable.daikin4};
        viewFlipper=findViewById(R.id.vfslide);
        for (int img:images ){
            flipperImage(img);
        }


        anhxa();
        anhxagridhome();

        adapter=new GridSmallAdapter(this,R.layout.dong_grid_view,gridModelArrayList);
        homeAdapter= new GridHomeAdapter(this,R.layout.dong_grid_nd,gridHomeModelArrayList);

        grdView1.setAdapter(adapter);
        grdView2.setAdapter(homeAdapter);


    }



    private  void flipperImage(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(4000);
        viewFlipper.setAutoStart(true);
        //animation
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }

    private void opentk() {
        Intent it= new Intent(this, FragmentAccount.class);
        startActivity(it);
    }

    private void anhxagridhome() {
        grdView2=findViewById(R.id.grdnd);
        gridHomeModelArrayList=new ArrayList<>();
        gridHomeModelArrayList.add(new GridHomeModel(R.drawable.daikin1,"Trải nghiệm dịch vụ bảo trì của DaiKin ","21:08 - 22/09/2020"));
        gridHomeModelArrayList.add(new GridHomeModel(R.drawable.daikin2,"Daikin Life","21:08 - 22/09/2020"));
        gridHomeModelArrayList.add(new GridHomeModel(R.drawable.daikin3,"E-Shop DaiKin","21:08 - 22/09/2020"));
        gridHomeModelArrayList.add(new GridHomeModel(R.drawable.daikin4,"Máy lạnh của Daikin","21:08 - 22/09/2020"));

    }

    private void anhxa() {

        grdView1=findViewById(R.id.grdhome);
        gridModelArrayList=new ArrayList<>();
        gridModelArrayList.add(new GridModel(R.drawable.iconbaotri,"Bảo trì"));
        gridModelArrayList.add(new GridModel(R.drawable.iconsuachua,"Sửa chữa"));
        gridModelArrayList.add(new GridModel(R.drawable.iconeshop,"E-Shop"));
        gridModelArrayList.add(new GridModel(R.drawable.iconphukien,"Phụ kiện"));
        gridModelArrayList.add(new GridModel(R.drawable.iconzalous,"Zalo Us"));
        grdView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    startActivity(new Intent(Home.this,baotri.class));
                }
                else if(position == 1){
                    startActivity(new Intent(Home.this,SuaChua.class));
                }
                else if(position == 3){
                    startActivity(new Intent(Home.this,PhuKien.class));
                }

            }
        });



    }
}