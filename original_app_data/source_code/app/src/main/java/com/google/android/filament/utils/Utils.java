package com.google.android.filament.utils;

import com.google.android.filament.Filament;
import io.sentry.Session;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/google/android/filament/utils/Utils;", "", "<init>", "()V", "Lfc/H;", Session.JsonKeys.INIT, "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Utils {
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    public static final void init() {
        Filament.init();
        System.loadLibrary("filament-utils-jni");
    }
}
