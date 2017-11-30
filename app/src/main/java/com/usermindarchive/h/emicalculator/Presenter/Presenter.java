package com.usermindarchive.h.emicalculator.Presenter;

import android.util.Log;

import com.usermindarchive.h.emicalculator.Model.Model;
import com.usermindarchive.h.emicalculator.Model.ModelInterface;
import com.usermindarchive.h.emicalculator.View.EmiView;
import com.usermindarchive.h.emicalculator.View.ViewInterface;

/**
 * Created by HERO on 10/5/2017.
 */

public class Presenter implements PresenterInterface {
    ModelInterface modelInterface;
    ViewInterface viewInterface;

    public Presenter() {
        this.modelInterface=new Model();
        this.viewInterface=new EmiView();
    }

    @Override
    public void getvalues(int a, Double r, int m) {
        Log.e("Presenter DATA",a
                +"\n"+r
                +"\n"+m);
        modelInterface.getvalues(a,r,m);

    }

    @Override
    public String sendResult() {
        return modelInterface.sendResult();
    }
}
