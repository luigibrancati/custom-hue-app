package X6;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.Objects;

/* JADX INFO: renamed from: X6.d4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2369d4 implements O7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2482r6 f18779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R4 f18780b;

    public C2369d4(R4 r42, C2482r6 c2482r6) {
        this.f18779a = c2482r6;
        Objects.requireNonNull(r42);
        this.f18780b = r42;
    }

    @Override // O7.b
    public final void a(Throwable th) {
        R4 r42 = this.f18780b;
        r42.h();
        r42.Z(false);
        C2416j3 c2416j3 = r42.f18400a;
        int iD0 = (c2416j3.w().H(null, AbstractC2383f2.f18858U0) ? r42.d0(th) : 2) - 1;
        if (iD0 == 0) {
            c2416j3.a().r().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", C2542z2.x(r42.f18400a.L().q()), C2542z2.x(th.toString()));
            r42.b0(1);
            r42.w0().add(this.f18779a);
            return;
        }
        if (iD0 != 1) {
            c2416j3.a().o().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", C2542z2.x(r42.f18400a.L().q()), th);
            b();
            r42.b0(1);
            r42.x0();
            return;
        }
        r42.w0().add(this.f18779a);
        if (r42.a0() > ((Integer) AbstractC2383f2.f18928x0.b(null)).intValue()) {
            r42.b0(1);
            c2416j3.a().r().c("registerTriggerAsync failed. May try later. App ID, throwable", C2542z2.x(r42.f18400a.L().q()), C2542z2.x(th.toString()));
        } else {
            c2416j3.a().r().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", C2542z2.x(r42.f18400a.L().q()), C2542z2.x(String.valueOf(r42.a0())), C2542z2.x(th.toString()));
            r42.V(r42.a0());
            int iA0 = r42.a0();
            r42.b0(iA0 + iA0);
        }
    }

    public final void b() {
        C2416j3 c2416j3 = this.f18780b.f18400a;
        SparseArray sparseArrayR = c2416j3.x().r();
        C2482r6 c2482r6 = this.f18779a;
        sparseArrayR.put(c2482r6.f19194c, Long.valueOf(c2482r6.f19193b));
        N2 n2X = c2416j3.x();
        int[] iArr = new int[sparseArrayR.size()];
        long[] jArr = new long[sparseArrayR.size()];
        for (int i10 = 0; i10 < sparseArrayR.size(); i10++) {
            iArr[i10] = sparseArrayR.keyAt(i10);
            jArr[i10] = ((Long) sparseArrayR.valueAt(i10)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        n2X.f18434o.b(bundle);
    }

    @Override // O7.b
    public final void onSuccess(Object obj) {
        R4 r42 = this.f18780b;
        r42.h();
        b();
        r42.Z(false);
        r42.b0(1);
        r42.f18400a.a().v().b("Successfully registered trigger URI", this.f18779a.f19192a);
        r42.x0();
    }
}
