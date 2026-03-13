package com.braze.models.outgoing;

import com.braze.enums.DeviceKey;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f28082a;

    static {
        int[] iArr = new int[DeviceKey.values().length];
        try {
            iArr[DeviceKey.TIMEZONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeviceKey.CARRIER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeviceKey.ANDROID_VERSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DeviceKey.LOCALE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DeviceKey.BRAND.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DeviceKey.MODEL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DeviceKey.NOTIFICATIONS_ENABLED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[DeviceKey.IS_BACKGROUND_RESTRICTED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[DeviceKey.GOOGLE_ADVERTISING_ID.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[DeviceKey.AD_TRACKING_ENABLED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f28082a = iArr;
    }
}
