package com.rental.android.rental_apps.utils;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Ujang Wahyu on 04/01/2018.
 */
public class move extends Intent {

    public static void moveActivity(Context mContext,Class<?> activity){
        Intent i=new Intent(mContext,activity);
        mContext.startActivity(i);
    }


}
