package com.google.firebase.perf.util;

import io.sentry.SentryOptions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k {
    long numBytes;
    public static final k TERABYTES = new a("TERABYTES", 0, 1099511627776L);
    public static final k GIGABYTES = new k("GIGABYTES", 1, 1073741824) { // from class: com.google.firebase.perf.util.k.b
        {
            a aVar = null;
        }
    };
    public static final k MEGABYTES = new k("MEGABYTES", 2, SentryOptions.MAX_EVENT_SIZE_BYTES) { // from class: com.google.firebase.perf.util.k.c
        {
            a aVar = null;
        }
    };
    public static final k KILOBYTES = new k("KILOBYTES", 3, 1024) { // from class: com.google.firebase.perf.util.k.d
        {
            a aVar = null;
        }
    };
    public static final k BYTES = new k("BYTES", 4, 1) { // from class: com.google.firebase.perf.util.k.e
        {
            a aVar = null;
        }
    };
    private static final /* synthetic */ k[] $VALUES = a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a extends k {
        public a(String str, int i10, long j10) {
            super(str, i10, j10, null);
        }
    }

    public /* synthetic */ k(String str, int i10, long j10, a aVar) {
        this(str, i10, j10);
    }

    public static /* synthetic */ k[] a() {
        return new k[]{TERABYTES, GIGABYTES, MEGABYTES, KILOBYTES, BYTES};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public long b(long j10) {
        return (j10 * this.numBytes) / KILOBYTES.numBytes;
    }

    public k(String str, int i10, long j10) {
        this.numBytes = j10;
    }
}
