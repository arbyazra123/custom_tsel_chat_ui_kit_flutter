package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;

import io.flutter.embedding.engine.FlutterEngine;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  private static final String TAG = "GeneratedPluginRegistrant";
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    try {
      flutterEngine.getPlugins().add(new com.qq.qcloud.tencent_im_sdk_plugin.tencent_im_sdk_plugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin tencent_cloud_chat_sdk, com.qq.qcloud.tencent_im_sdk_plugin.tencent_im_sdk_plugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.tencent.cloud.uikit.core.TUICorePlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin tencent_cloud_uikit_core, com.tencent.cloud.uikit.core.TUICorePlugin", e);
    }
  }
}