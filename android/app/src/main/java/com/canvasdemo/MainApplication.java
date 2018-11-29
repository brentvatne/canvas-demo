package com.canvasdemo;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import expo.adapters.react.ModuleRegistryAdapter;
import expo.adapters.react.ReactModuleRegistryProvider;
import expo.adapters.react.ReactAdapterPackage;
import expo.core.ModuleRegistryProvider;
import expo.core.interfaces.Package;
import expo.modules.filesystem.FileSystemPackage;
import expo.modules.constants.ConstantsPackage;
import expo.modules.gl.GLPackage;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {
   private final ReactModuleRegistryProvider mModuleRegistryProvider = new ReactModuleRegistryProvider(Arrays.<Package>asList(
     new ReactAdapterPackage(),
     new GLPackage(),
     new ConstantsPackage(),
     new FileSystemPackage()
  ));

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
          new ModuleRegistryAdapter(mModuleRegistryProvider)
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
