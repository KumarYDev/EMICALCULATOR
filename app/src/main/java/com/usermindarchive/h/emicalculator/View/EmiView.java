package com.usermindarchive.h.emicalculator.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.usermindarchive.h.emicalculator.Presenter.Presenter;
import com.usermindarchive.h.emicalculator.Presenter.PresenterInterface;
import com.usermindarchive.h.emicalculator.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by HERO on 10/5/2017.
 */

public class EmiView extends Fragment implements ViewInterface {
    @BindView(R.id.amount) EditText amount;
    @BindView(R.id.rate) EditText rate;
    @BindView(R.id.month) EditText month;
    @BindView(R.id.solve) Button solve;
    @BindView(R.id.result)
    TextView result;

    PresenterInterface presenterInterface;
    Unbinder bind;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup v= (ViewGroup) inflater.inflate(R.layout.emilay,container,false);
        bind=ButterKnife.bind(this,v);
        presenterInterface=new Presenter();
        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        bind.unbind();
    }

    @OnClick(R.id.solve)
    public void solve(View view){
        if(check(amount)&&check(month)&&check(rate)) {
            presenterInterface.getvalues(
                    Integer.parseInt(amount.getText().toString())
                    ,Double.parseDouble(rate.getText().toString())
                    ,Integer.parseInt(month.getText().toString()));
result.setText(presenterInterface.sendResult());

        }
    }

//    Cheacking Data is entered or not
    public boolean check(EditText v){
        if (v.getText().toString().isEmpty()) {
            v.setError("Enter the Data");
            return false;
        }
        else
            return true;
    }

    @Override
    public void resultupdate(String str) {

    }
}
