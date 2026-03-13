package com.braze.requests.util;

import android.os.SystemClock;
import com.braze.support.BrazeLogger;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import zc.AbstractC6558c;
import zc.AbstractC6559d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f28340g = (int) TimeUnit.SECONDS.toMillis(45);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC6558c f28345e = AbstractC6559d.a(SystemClock.uptimeMillis());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28346f;

    public b(int i10, int i11, int i12, int i13) {
        this.f28341a = i10;
        this.f28342b = i11;
        this.f28343c = i12;
        this.f28344d = i13;
    }

    public final int a(final int i10) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: q5.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.util.b.a(this.f43263a);
            }
        }, 7, (Object) null);
        AbstractC6558c random = this.f28345e;
        int i11 = this.f28346f * this.f28344d;
        AbstractC4862t.e(random, "random");
        final int iMin = Math.min(i10, i11) + random.d(Math.abs(i10 - i11) + 1);
        this.f28346f = Math.max(this.f28343c, Math.min(this.f28341a, iMin));
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: q5.b
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.util.b.a(this.f43264a, i10, iMin);
            }
        }, 7, (Object) null);
        return this.f28346f;
    }

    public final String toString() {
        int i10 = this.f28341a;
        int i11 = this.f28342b;
        int i12 = this.f28343c;
        int i13 = this.f28344d;
        AbstractC6558c abstractC6558c = this.f28345e;
        int i14 = this.f28346f;
        return "ExponentialBackoffStateProvider(maxSleepDurationMs=" + i10 + ", defaultNormalFlushIntervalMs=" + i11 + ", minSleepDurationMs=" + i12 + ", scaleFactor=" + i13 + ", randomSleepDurationGenerator=" + abstractC6558c + ", lastSleepDurationMs=" + i14 + ", isBackingOff=" + (i14 != 0) + ")";
    }

    public static final String a(b bVar) {
        return "Computing new sleep delay. Previous sleep delay: " + bVar.f28346f;
    }

    public static final String a(b bVar, int i10, int i11) {
        return "New sleep duration: " + bVar.f28346f + " ms. Default sleep duration: " + i10 + " ms. Max sleep: " + bVar.f28341a + " ms. Min sleep: " + bVar.f28343c + " ms. Scale factor: " + bVar.f28344d + " randomValueBetweenSleepIntervals: " + i11;
    }
}
