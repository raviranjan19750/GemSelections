package tech.iosd.gemselections.Handicrafts;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by anonymous on 19/6/17.
 */

public class HandSpiGiftsFragment extends Fragment {

    private ImageView _1, _2, _3, _4, _5, _6, _7, _8, _9, _10;
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(tech.iosd.gemselections.R.layout.frag_hand_spi_gifts, container, false);
        _1 = (ImageView)view.findViewById(tech.iosd.gemselections.R.id.handspigift1);
        _2 = (ImageView)view.findViewById(tech.iosd.gemselections.R.id.handspigift2);
        _3 = (ImageView)view.findViewById(tech.iosd.gemselections.R.id.handspigift3);
        _4 = (ImageView)view.findViewById(tech.iosd.gemselections.R.id.handspigift4);
        _5 = (ImageView)view.findViewById(tech.iosd.gemselections.R.id.handspigift5);
        _6 = (ImageView)view.findViewById(tech.iosd.gemselections.R.id.handspigift6);
        _7 = (ImageView)view.findViewById(tech.iosd.gemselections.R.id.handspigift7);
        _8 = (ImageView)view.findViewById(tech.iosd.gemselections.R.id.handspigift8);
        _9 = (ImageView)view.findViewById(tech.iosd.gemselections.R.id.handspigift9);
        _10 = (ImageView)view.findViewById(tech.iosd.gemselections.R.id.handspigift10);
        return view;
    }

    private void loadImage() {
        InputStream is;

        try {
            is = getActivity().getAssets().open("images/hand-spi-gifts/Marble-Plate-HGI-01.jpg");
            _1.setImageBitmap(BitmapFactory.decodeStream(is));

            is = getActivity().getAssets().open("images/hand-spi-gifts/Marble-Plate-02.jpg");
            _2.setImageBitmap(BitmapFactory.decodeStream(is));

            is = getActivity().getAssets().open("images/hand-spi-gifts/Marble-Tile-HGI03.jpg");
            _3.setImageBitmap(BitmapFactory.decodeStream(is));

            is = getActivity().getAssets().open("images/hand-spi-gifts/Marble-Tile-HGI04.jpg");
            _4.setImageBitmap(BitmapFactory.decodeStream(is));

            is = getActivity().getAssets().open("images/hand-spi-gifts/Marble-Tile-HGI05.jpg");
            _5.setImageBitmap(BitmapFactory.decodeStream(is));

            is = getActivity().getAssets().open("images/hand-spi-gifts/Marble-Tile-HGI06.jpg");
            _6.setImageBitmap(BitmapFactory.decodeStream(is));

            is = getActivity().getAssets().open("images/hand-spi-gifts/Marble-Tile-HGI07.jpg");
            _7.setImageBitmap(BitmapFactory.decodeStream(is));

            is = getActivity().getAssets().open("images/hand-spi-gifts/Marble-Tile-HGI08.jpg");
            _8.setImageBitmap(BitmapFactory.decodeStream(is));

            is = getActivity().getAssets().open("images/hand-spi-gifts/Marble-Tile-HGI09.jpg");
            _9.setImageBitmap(BitmapFactory.decodeStream(is));

            is = getActivity().getAssets().open("images/hand-spi-gifts/Marble-Tile-HGI-10.jpg");
            _10.setImageBitmap(BitmapFactory.decodeStream(is));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadImage();
        getActivity().setTitle("Spiritual Gifts");
    }
}
