package com.example.nikhil3000.gemselections.Pukhraj;

import android.app.Fragment;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.nikhil3000.gemselections.R;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by anonymous on 30/6/17.
 */

public class BangkokPukhraj extends Fragment {

    private ImageView img;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_pukhraj_bangkok, container, false);
        img = (ImageView)view.findViewById(R.id.img_bangkok_pukhraj);
        try{
            InputStream is = getActivity().getAssets().open("images/Pukhraj/bangkok-pukhraj.jpeg");
            img.setImageBitmap(BitmapFactory.decodeStream(is));
        }catch (IOException e){
            e.printStackTrace();
        }
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}