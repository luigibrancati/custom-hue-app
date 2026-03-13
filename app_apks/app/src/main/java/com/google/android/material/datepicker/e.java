package com.google.android.material.datepicker;

import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static String a(long j10) {
        return b(j10, Locale.getDefault());
    }

    public static String b(long j10, Locale locale) {
        return r.b(locale).format(new Date(j10));
    }

    public static String c(long j10) {
        return DateUtils.formatDateTime(null, j10, 8228);
    }

    public static String d(long j10) {
        return e(j10, Locale.getDefault());
    }

    public static String e(long j10, Locale locale) {
        return r.k(locale).format(new Date(j10));
    }
}
