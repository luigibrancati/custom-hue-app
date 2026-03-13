package com.google.ar.core;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.annotations.UsedByNative;
import com.google.ar.core.exceptions.ResourceExhaustedException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@UsedByNative("arcoreapk.cc")
final class ArCoreApkJniAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31081a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f31082b;

    static {
        HashMap map = new HashMap();
        f31082b = map;
        map.put(IllegalArgumentException.class, Integer.valueOf(ah.ERROR_INVALID_ARGUMENT.f31154G));
        map.put(ResourceExhaustedException.class, Integer.valueOf(ah.ERROR_RESOURCE_EXHAUSTED.f31154G));
        map.put(UnavailableArcoreNotInstalledException.class, Integer.valueOf(ah.UNAVAILABLE_ARCORE_NOT_INSTALLED.f31154G));
        map.put(UnavailableDeviceNotCompatibleException.class, Integer.valueOf(ah.UNAVAILABLE_DEVICE_NOT_COMPATIBLE.f31154G));
        map.put(UnavailableApkTooOldException.class, Integer.valueOf(ah.UNAVAILABLE_APK_TOO_OLD.f31154G));
        map.put(UnavailableSdkTooOldException.class, Integer.valueOf(ah.UNAVAILABLE_SDK_TOO_OLD.f31154G));
        map.put(UnavailableUserDeclinedInstallationException.class, Integer.valueOf(ah.UNAVAILABLE_USER_DECLINED_INSTALLATION.f31154G));
    }

    private ArCoreApkJniAdapter() {
    }

    private static int b(Throwable th) {
        Log.e("ARCore-ArCoreApkJniAdap", "Exception details:", th);
        Map map = f31082b;
        Class<?> cls = th.getClass();
        return map.containsKey(cls) ? ((Integer) map.get(cls)).intValue() : ah.ERROR_FATAL.f31154G;
    }

    @UsedByNative("arcoreapk.cc")
    public static int checkAvailability(Context context) {
        try {
            return ArCoreApk.getInstance().checkAvailability(context).nativeCode;
        } catch (Throwable th) {
            b(th);
            return ArCoreApk.Availability.UNKNOWN_ERROR.nativeCode;
        }
    }

    @UsedByNative("arcoreapk.cc")
    public static void checkAvailabilityAsync(Context context, final long j10, final long j11) {
        final Consumer<ArCoreApk.Availability> consumer = new Consumer() { // from class: com.google.ar.core.m
            @Override // java.util.function.Consumer
            public final /* synthetic */ void accept(Object obj) {
                ArCoreApkJniAdapter.nativeInvokeAvailabilityCallback(j10, j11, ((ArCoreApk.Availability) obj).nativeCode);
            }
        };
        try {
            ArCoreApk.getInstance().checkAvailabilityAsync(context, consumer);
        } catch (Throwable th) {
            b(th);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.ar.core.l
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i10 = ArCoreApkJniAdapter.f31081a;
                    consumer.accept(ArCoreApk.Availability.UNKNOWN_ERROR);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeInvokeAvailabilityCallback(long j10, long j11, int i10);

    @UsedByNative("arcoreapk.cc")
    public static int requestInstall(Activity activity, boolean z10, int[] iArr) {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z10).nativeCode;
            return ah.SUCCESS.f31154G;
        } catch (Throwable th) {
            return b(th);
        }
    }

    @UsedByNative("arcoreapk.cc")
    public static int requestInstallCustom(Activity activity, boolean z10, int i10, int i11, int[] iArr) {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z10, ArCoreApk.InstallBehavior.forNumber(i10), ArCoreApk.UserMessageType.forNumber(i11)).nativeCode;
            return ah.SUCCESS.f31154G;
        } catch (Throwable th) {
            return b(th);
        }
    }
}
