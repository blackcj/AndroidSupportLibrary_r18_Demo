package com.cb.androidsupportlibrarydemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cblack on 8/1/13.
 */
public class DefaultFragment extends Fragment {

    /**
     *
     */
    public static DefaultFragment create() {
        DefaultFragment f = new DefaultFragment();
        return f;
    }

    /**
     *
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_default, container, false);

        return v;
    }
}
