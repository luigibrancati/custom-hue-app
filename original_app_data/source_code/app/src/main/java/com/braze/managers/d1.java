package com.braze.managers;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f27851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f27853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f27854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f27855f;

    public /* synthetic */ d1() {
        this(false, null, null, 0L, 0L, 0L);
    }

    public final String a() {
        return this.f27852c;
    }

    public final Long b() {
        return this.f27851b;
    }

    public final long c() {
        return this.f27853d;
    }

    public final long d() {
        return this.f27854e;
    }

    public final long e() {
        return this.f27855f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.f27850a == d1Var.f27850a && AbstractC4862t.a(this.f27851b, d1Var.f27851b) && AbstractC4862t.a(this.f27852c, d1Var.f27852c) && this.f27853d == d1Var.f27853d && this.f27854e == d1Var.f27854e && this.f27855f == d1Var.f27855f;
    }

    public final boolean f() {
        return this.f27850a;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f27850a) * 31;
        Long l10 = this.f27851b;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.f27852c;
        return Long.hashCode(this.f27855f) + ((Long.hashCode(this.f27854e) + ((Long.hashCode(this.f27853d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Config(isEnabled=" + this.f27850a + ", sdkDebuggerExpirationTime=" + this.f27851b + ", sdkDebuggerAuthCode=" + this.f27852c + ", sdkDebuggerFlushIntervalBytes=" + this.f27853d + ", sdkDebuggerFlushIntervalSeconds=" + this.f27854e + ", sdkDebuggerMaxPayloadBytes=" + this.f27855f + ")";
    }

    public d1(boolean z10, Long l10, String str, long j10, long j11, long j12) {
        this.f27850a = z10;
        this.f27851b = l10;
        this.f27852c = str;
        this.f27853d = j10;
        this.f27854e = j11;
        this.f27855f = j12;
    }
}
