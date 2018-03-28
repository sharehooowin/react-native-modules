package com.modules.util;

import android.content.Context;
import android.content.pm.PackageManager; //安卓包管理类

public class PackageUtil {

    public static boolean isInstalled(Context context, String packageName){

        boolean isInstalled = false;
        PackageManager packageManager = context.getPackageManager();
        try{
            packageManager.getPackageInfo(packageName , PackageManager.GET_ACTIVITIES);
            isInstalled = true;
        }catch(PackageManager.NameNotFoundException e) {
            isInstalled = false;
        }

        return isInstalled;
    }
}

