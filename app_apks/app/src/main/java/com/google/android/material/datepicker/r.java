package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicReference f30757a = new AtomicReference();

    public static long a(long j10) {
        Calendar calendarI = i();
        calendarI.setTimeInMillis(j10);
        return d(calendarI).getTimeInMillis();
    }

    public static DateFormat b(Locale locale) {
        return c("MMMEd", locale);
    }

    public static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(h());
        return instanceForSkeleton;
    }

    public static Calendar d(Calendar calendar) {
        Calendar calendarJ = j(calendar);
        Calendar calendarI = i();
        calendarI.set(calendarJ.get(1), calendarJ.get(2), calendarJ.get(5));
        return calendarI;
    }

    public static q e() {
        q qVar = (q) f30757a.get();
        return qVar == null ? q.c() : qVar;
    }

    public static TimeZone f() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar g() {
        Calendar calendarA = e().a();
        calendarA.set(11, 0);
        calendarA.set(12, 0);
        calendarA.set(13, 0);
        calendarA.set(14, 0);
        calendarA.setTimeZone(f());
        return calendarA;
    }

    public static android.icu.util.TimeZone h() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar i() {
        return j(null);
    }

    public static Calendar j(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(f());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    public static DateFormat k(Locale locale) {
        return c("yMMMEd", locale);
    }
}
