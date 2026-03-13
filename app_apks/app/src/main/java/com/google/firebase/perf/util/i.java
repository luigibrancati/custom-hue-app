package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f31860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f31861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeUnit f31862c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31863a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f31863a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31863a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31863a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(long j10, long j11, TimeUnit timeUnit) {
        this.f31860a = j10;
        this.f31861b = j11;
        this.f31862c = timeUnit;
    }

    public double a() {
        int i10 = a.f31863a[this.f31862c.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? this.f31860a / this.f31862c.toSeconds(this.f31861b) : (this.f31860a / this.f31861b) * TimeUnit.SECONDS.toMillis(1L) : (this.f31860a / this.f31861b) * TimeUnit.SECONDS.toMicros(1L) : (this.f31860a / this.f31861b) * TimeUnit.SECONDS.toNanos(1L);
    }
}
