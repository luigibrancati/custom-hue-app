package com.braze.triggers.events;

import android.util.Base64;
import com.braze.models.k;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class i implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f28717d = BrazeLogger.getBrazeLogTag((Class<?>) i.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f28720c;

    public i() {
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.f28719b = jNowInMilliseconds;
        this.f28718a = jNowInMilliseconds / 1000;
    }

    public static String a(String str) {
        if (StringUtils.isNullOrBlank(str)) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0)).split("_")[0];
        } catch (Exception e10) {
            BrazeLogger.e(f28717d, "Unexpected error decoding Base64 encoded campaign Id " + str, e10);
            return null;
        }
    }

    public final k b() {
        return this.f28720c;
    }
}
