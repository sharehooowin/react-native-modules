package com.modules.xhw;

import android.widget.Toast;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

// 我的原生模块
public class MineModule extends ReactContextBaseJavaModule {

    // 构造函数
    public MineModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    /**
     * ReactContextBaseJavaModule要求派生类实现getName方法。
     * reuturn:String
     * 这个函数用于返回一个字符串名字，这个名字在JavaScript端标记这个模块。
     * 这里我们把这个模块叫做MineModule，这样就可以在JavaScript中通过React.NativeModules.MineModule访问到这个模块。
     */
    @Override
    public String getName() {
        return "MineModule";
    }

    /**
     * 要导出一个方法给JavaScript使用，Java方法需要使用注解@ReactMethod。
     * 方法的返回类型必须为void。
     */
    @ReactMethod
    public void showMessage(String message, int duration) {
        Toast.makeText(getReactApplicationContext(), message, duration).show();
    }

}