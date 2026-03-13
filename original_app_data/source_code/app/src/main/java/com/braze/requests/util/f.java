package com.braze.requests.util;

import Bc.k;
import android.content.SharedPreferences;
import com.braze.requests.util.f;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f28353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f28354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f28355e;

    public f(int i10, int i11, SharedPreferences storage) {
        AbstractC4862t.e(storage, "storage");
        this.f28351a = i10;
        this.f28352b = i11;
        this.f28353c = storage;
        this.f28354d = storage.getLong("last_call_at_ms", 0L);
        this.f28355e = storage.getFloat("current_token_count", k.e(this.f28351a, 1));
    }

    public final double a(long j10) {
        return Math.min((((j10 - this.f28354d) / ((double) k.e(this.f28352b, 1))) / ((double) 1000)) + this.f28355e, k.e(this.f28351a, 1));
    }

    public final long b() {
        double dA = a(DateTimeUtils.nowInMillisecondsSystemClock());
        this.f28355e = dA;
        this.f28353c.edit().putFloat("current_token_count", (float) dA).apply();
        double d10 = this.f28355e;
        if (d10 >= 1.0d) {
            return 0L;
        }
        return Math.max(0L, (long) ((((double) 1) - d10) * ((double) k.e(this.f28352b, 1)) * ((double) 1000)));
    }

    public final String toString() {
        return "(capacity=" + k.e(this.f28351a, 1) + ", refillRate=" + k.e(this.f28352b, 1) + ", lastCallAt='" + DateTimeUtils.formatDateFromMillis$default(this.f28354d, null, null, 3, null) + "', lastCallAt raw value='" + this.f28354d + "', currentTokenCount=" + a(DateTimeUtils.nowInMillisecondsSystemClock()) + ")";
    }

    public final void a() {
        long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        double dA = a(jNowInMillisecondsSystemClock);
        this.f28355e = dA;
        this.f28353c.edit().putFloat("current_token_count", (float) dA).apply();
        this.f28354d = jNowInMillisecondsSystemClock;
        this.f28353c.edit().putLong("last_call_at_ms", jNowInMillisecondsSystemClock).apply();
        double d10 = this.f28355e;
        if (d10 < 1.0d) {
            return;
        }
        double d11 = d10 - ((double) 1);
        this.f28355e = d11;
        this.f28353c.edit().putFloat("current_token_count", (float) d11).apply();
    }

    public static final String b(int i10, int i11) {
        return "TokenBucketRateLimiter updated with new capacity: " + i10 + " and refill rate: " + i11;
    }

    public final void a(final int i10, final int i11) {
        if (i10 < 1 || i11 < 1) {
            return;
        }
        if (this.f28351a == i10 && this.f28352b == i11) {
            return;
        }
        this.f28351a = i10;
        this.f28352b = i11;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: q5.c
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return f.b(i10, i11);
            }
        }, 6, (Object) null);
    }
}
