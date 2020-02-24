package com.example.test;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class Fragment1 extends Fragment {
    ImageView image;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment1,container, false);
        Button btn = rootView.findViewById(R.id.btn);
        image = rootView.findViewById(R.id.image);
        btn.setOnClickListener(new View.OnClickListener() {
                @Override
            public void onClick(View v) {
                image.setBackgroundColor(Color.rgb(255, 0, 0));
            }
        });
        return rootView;
    }
}
