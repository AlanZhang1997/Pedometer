package com.greenlihui.pedometer.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.greenlihui.pedometer.R;

/**
 * 状态 Fragment
 */

public class StatusFragment extends Fragment {
    private View contentView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView = inflater.inflate(R.layout.fragment_status, container, false);

        return contentView;
    }
}
