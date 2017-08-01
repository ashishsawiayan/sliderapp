package com.ashish.slider;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by asawa on 23-07-2017.
 */

public class intromanager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context context;
    public intromanager(Context context)
    {
        this.context=context;
        pref=context.getSharedPreferences("first",0);
        editor =pref.edit();
    }
    public void setFirst(boolean isFirst)
    {
        editor.putBoolean("check",isFirst);
        editor.commit();
    }
    public boolean Check()
    {
        return pref.getBoolean("check",true);
    }
}
