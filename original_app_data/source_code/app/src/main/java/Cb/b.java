package Cb;

import Pd.a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final double a(long j10, Long l10) {
        return 1.0d / c(j10, l10);
    }

    public static final long b(long j10, Long l10) {
        a.C0170a c0170a = Pd.a.f13294b;
        return Pd.c.t(j10 - (l10 != null ? l10.longValue() : 0L), Pd.d.NANOSECONDS);
    }

    public static final double c(long j10, Long l10) {
        return Pd.a.R(b(j10, l10), Pd.d.SECONDS);
    }
}
