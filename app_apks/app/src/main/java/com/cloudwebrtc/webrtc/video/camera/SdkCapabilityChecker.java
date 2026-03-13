package com.cloudwebrtc.webrtc.video.camera;

import android.annotation.SuppressLint;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class SdkCapabilityChecker {

    @SuppressLint({"AnnotateVersionCheck"})
    public static int SDK_VERSION = Build.VERSION.SDK_INT;

    public static boolean supportsDistortionCorrection() {
        return SDK_VERSION >= 28;
    }

    public static boolean supportsEglRecordableAndroid() {
        return SDK_VERSION >= 26;
    }

    public static boolean supportsEncoderProfiles() {
        return SDK_VERSION >= 31;
    }

    public static boolean supportsMarshmallowNoiseReductionModes() {
        return SDK_VERSION >= 23;
    }

    public static boolean supportsSessionConfiguration() {
        return SDK_VERSION >= 28;
    }

    public static boolean supportsVideoPause() {
        return SDK_VERSION >= 24;
    }

    public static boolean supportsZoomRatio() {
        return SDK_VERSION >= 30;
    }
}
