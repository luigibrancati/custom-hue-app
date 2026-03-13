package com.cloudwebrtc.webrtc.video.camera;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.view.Display;
import android.view.WindowManager;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class DeviceOrientationManager {
    private static final IntentFilter orientationIntentFilter = new IntentFilter("android.intent.action.CONFIGURATION_CHANGED");
    private final Activity activity;
    private BroadcastReceiver broadcastReceiver;
    private PlatformChannel.DeviceOrientation lastOrientation;
    private final int sensorOrientation;

    public DeviceOrientationManager(Activity activity, int i10) {
        this.activity = activity;
        this.sensorOrientation = i10;
    }

    public static DeviceOrientationManager create(Activity activity, int i10) {
        return new DeviceOrientationManager(activity, i10);
    }

    public PlatformChannel.DeviceOrientation calculateSensorOrientation(int i10) {
        int i11 = i10 + 45;
        if (getDeviceDefaultOrientation() == 2) {
            i11 = i10 + 135;
        }
        return new PlatformChannel.DeviceOrientation[]{PlatformChannel.DeviceOrientation.PORTRAIT_UP, PlatformChannel.DeviceOrientation.LANDSCAPE_LEFT, PlatformChannel.DeviceOrientation.PORTRAIT_DOWN, PlatformChannel.DeviceOrientation.LANDSCAPE_RIGHT}[(i11 % 360) / 90];
    }

    public int getDeviceDefaultOrientation() {
        Configuration configuration = this.activity.getResources().getConfiguration();
        int rotation = getDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    public Display getDisplay() {
        return ((WindowManager) this.activity.getSystemService("window")).getDefaultDisplay();
    }

    public PlatformChannel.DeviceOrientation getLastUIOrientation() {
        return this.lastOrientation;
    }

    public PlatformChannel.DeviceOrientation getUIOrientation() {
        int rotation = getDisplay().getRotation();
        int i10 = this.activity.getResources().getConfiguration().orientation;
        return i10 != 1 ? i10 != 2 ? PlatformChannel.DeviceOrientation.PORTRAIT_UP : (rotation == 0 || rotation == 1) ? PlatformChannel.DeviceOrientation.LANDSCAPE_LEFT : PlatformChannel.DeviceOrientation.LANDSCAPE_RIGHT : (rotation == 0 || rotation == 1) ? PlatformChannel.DeviceOrientation.PORTRAIT_UP : PlatformChannel.DeviceOrientation.PORTRAIT_DOWN;
    }

    public void handleUIOrientationChange() {
        PlatformChannel.DeviceOrientation uIOrientation = getUIOrientation();
        handleOrientationChange(uIOrientation, this.lastOrientation);
        this.lastOrientation = uIOrientation;
    }

    public void start() {
        if (this.broadcastReceiver != null) {
            return;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.cloudwebrtc.webrtc.video.camera.DeviceOrientationManager.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                DeviceOrientationManager.this.handleUIOrientationChange();
            }
        };
        this.broadcastReceiver = broadcastReceiver;
        this.activity.registerReceiver(broadcastReceiver, orientationIntentFilter);
        this.broadcastReceiver.onReceive(this.activity, null);
    }

    public void stop() {
        BroadcastReceiver broadcastReceiver = this.broadcastReceiver;
        if (broadcastReceiver == null) {
            return;
        }
        this.activity.unregisterReceiver(broadcastReceiver);
        this.broadcastReceiver = null;
    }

    public static void handleOrientationChange(PlatformChannel.DeviceOrientation deviceOrientation, PlatformChannel.DeviceOrientation deviceOrientation2) {
    }
}
