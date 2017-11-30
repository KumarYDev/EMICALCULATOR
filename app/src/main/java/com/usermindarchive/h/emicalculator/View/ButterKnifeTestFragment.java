package com.usermindarchive.h.emicalculator.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.usermindarchive.h.emicalculator.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by HERO on 10/5/2017.
 */

public class ButterKnifeTestFragment extends Fragment {
    @BindView(R.id.amount)
    EditText amount;
    @BindView(R.id.rate)
    EditText rate;
    @BindView(R.id.month)
    EditText month;
    @BindView(R.id.solve)
    Button solve;
    @BindView(R.id.result)
    TextView result;
    Unbinder bind;

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        bind.unbind();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup v= (ViewGroup) inflater.inflate(R.layout.emilay,container,false);
        bind= ButterKnife.bind(this,v);

        return v;
    }


    @OnClick(R.id.solve)
    public void solve(){
Log.e("Buttertest","Butter knife working");
        solve.setText("Working");

        }

}
