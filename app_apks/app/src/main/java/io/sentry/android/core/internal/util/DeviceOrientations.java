package io.sentry.android.core.internal.util;

import io.sentry.protocol.Device;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class DeviceOrientations {
    private DeviceOrientations() {
    }

    public static Device.DeviceOrientation getOrientation(int i10) {
        if (i10 == 1) {
            return Device.DeviceOrientation.PORTRAIT;
        }
        if (i10 != 2) {
            return null;
        }
        return Device.DeviceOrientation.LANDSCAPE;
    }
}
