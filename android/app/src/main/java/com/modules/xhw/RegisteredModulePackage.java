package com.modules.xhw;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * 在JAVA这边注册所有你编写的原生模块。
 * 我们需要在应用的Package类的createNativeModules方法中添加这些模块。
 * 如果模块没有被注册，就无法在JavaScript中被访问到。
 */
public class RegisteredModulePackage implements ReactPackage{

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {

        List<NativeModule> modules = new ArrayList<>();

        // 这里添加要要注册的模块
        modules.add(new MineModule(reactContext));
        modules.add(new PackageModule(reactContext));

        return modules;
    }


    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}