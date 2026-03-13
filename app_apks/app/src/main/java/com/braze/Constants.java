package com.braze;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/braze/Constants;", "", "<init>", "()V", "", "isAmazonDevice", "Z", "()Z", "isAmazonDevice$annotations", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Constants {
    public static final Constants INSTANCE = new Constants();
    private static final boolean isAmazonDevice = AbstractC4862t.a("Amazon", Build.MANUFACTURER);

    private Constants() {
    }

    public static final boolean isAmazonDevice() {
        return isAmazonDevice;
    }
}
