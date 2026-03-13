package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f30754c = new q(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f30755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeZone f30756b;

    public q(Long l10, TimeZone timeZone) {
        this.f30755a = l10;
        this.f30756b = timeZone;
    }

    public static q c() {
        return f30754c;
    }

    public Calendar a() {
        return b(this.f30756b);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f30755a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
