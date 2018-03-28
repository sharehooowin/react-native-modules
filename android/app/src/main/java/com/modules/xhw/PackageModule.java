package com.modules.xhw;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.modules.util.PackageUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 我的原生模块
public class PackageModule extends ReactContextBaseJavaModule {

    // 构造函数
    public PackageModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    /**
     * ReactContextBaseJavaModule要求派生类实现getName方法。
     * reuturn:String
     * 这个函数用于返回一个字符串名字，这个名字在JavaScript端标记这个模块。
     * 这里我们把这个模块叫做PackageModule，这样就可以在JavaScript中通过React.NativeModules.PackageModule访问到这个模块。
     */
    @Override
    public String getName() {
        return "PackageModule";
    }

    /**
     * 要导出一个方法给JavaScript使用，Java方法需要使用注解@ReactMethod。
     * 方法的返回类型必须为void。
     * 根据包名判断是否安装
     */
    @ReactMethod
    public void isInstalled(String packageName,Promise promise){
       promise.resolve(PackageUtil.isInstalled(getReactApplicationContext(), packageName));
    }



}