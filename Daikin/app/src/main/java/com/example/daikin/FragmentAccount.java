package com.example.daikin;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentAccount extends Fragment {
   Button btdangxuat;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.activity_account, container, false);

        btdangxuat = root.findViewById(R.id.btdangxuat);
        btdangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThoat();
            }
        });

        return root;
    }
    public void openThoat(){
        Intent intent=new Intent( FragmentAccount.this.getActivity(), MainActivity.class);
        startActivity(intent);
    }

}