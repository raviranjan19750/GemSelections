package tech.iosd.gemselections.SemiPreciousGems;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import tech.iosd.gemselections.R;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by anonymous on 25/6/17.
 */

public class Beruj extends Fragment {

    private ImageView img;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beruj, container, false);
        img = (ImageView)view.findViewById(R.id.beruj_img);
        try {
            InputStream is = getActivity().getAssets().open("images/semi-precious-gems/Aquamarine.jpg");
            img.setImageBitmap(BitmapFactory.decodeStream(is));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
