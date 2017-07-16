package com.greenlihui.pedometer.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.greenlihui.pedometer.R;

/**
 * Created by green on 2017/7/16.
 */

public class MeFragment extends Fragment {
    private View contentView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        contentView = inflater.inflate(R.layout.fragment_me, container, false);
        return contentView;
    }
}
