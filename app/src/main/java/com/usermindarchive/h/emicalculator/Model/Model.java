package com.usermindarchive.h.emicalculator.Model;

import android.util.Log;

/**
 * Created by HERO on 10/5/2017.
 */

public class Model implements ModelInterface {
    String result;
    @Override
    public void getvalues(int a, Double r, int m) {

//        Formula =[P x R x (1+R)^N]/[(1+R)^N-1]  rateper month= rate/1200

        double emi;
        double intmth=(a*r)
                /1200;
        Double rm=r/1200;
        Log.e("Model DATA",String.valueOf(intmth)
                );

//        emi=(intmth*Math.pow(1+(intmth/a),m))/(Math.pow(1+(intmth/a),m-1));
        emi=(a*rm*Math.pow(1+rm,m))/(Math.pow(1+rm,m)-1);
        Log.e("Model DATA",intmth

                +"\n"+emi);
        result=("Intrest per month="+Math.round(intmth)

                +"\n"+"EMI="+Math.round(emi));

    }

    @Override
    public String sendResult() {
        return result;
    }

}
