package com.google.android.gms.measurement.internal;

import B6.o;
import X6.A3;
import X6.A6;
import X6.AbstractC2383f2;
import X6.B3;
import X6.C2344a3;
import X6.C2388g;
import X6.C2404i;
import X6.C2416j3;
import X6.C2460p;
import X6.C2486s2;
import X6.C2515w;
import X6.C2522w6;
import X6.C2526x2;
import X6.C2538y6;
import X6.C2542z2;
import X6.C3;
import X6.CallableC2424k3;
import X6.CallableC2472q3;
import X6.CallableC2479r3;
import X6.CallableC2487s3;
import X6.CallableC2495t3;
import X6.CallableC2527x3;
import X6.D;
import X6.D3;
import X6.G;
import X6.I;
import X6.InterfaceC2423k2;
import X6.InterfaceC2439m2;
import X6.R6;
import X6.RunnableC2432l3;
import X6.RunnableC2440m3;
import X6.RunnableC2448n3;
import X6.RunnableC2456o3;
import X6.RunnableC2464p3;
import X6.RunnableC2503u3;
import X6.RunnableC2511v3;
import X6.RunnableC2519w3;
import X6.RunnableC2535y3;
import X6.RunnableC2543z3;
import X6.T3;
import X6.U6;
import X6.V6;
import X6.W6;
import X6.Y6;
import X6.a7;
import X6.c7;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.C3151b;
import com.google.android.gms.internal.measurement.C3152b0;
import com.google.android.gms.internal.measurement.C3229j5;
import com.google.android.gms.internal.measurement.C3338w0;
import com.google.android.gms.internal.measurement.U2;
import com.google.android.gms.internal.measurement.X2;
import com.google.android.gms.internal.measurement.Y2;
import io.flutter.plugins.firebase.analytics.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s6.AbstractC5788g;
import s6.C5789h;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjd extends zzga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R6 f30373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f30374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30375c;

    public zzjd(R6 r62, String str) {
        AbstractC6056k.l(r62);
        this.f30373a = r62;
        this.f30375c = null;
    }

    @Override // X6.InterfaceC2407i2
    public final void B3(c7 c7Var) {
        String str = c7Var.f18743a;
        AbstractC6056k.f(str);
        Q6(str, false);
        T6(new RunnableC2511v3(this, c7Var));
    }

    @Override // X6.InterfaceC2407i2
    public final void D6(final c7 c7Var, final Bundle bundle, final InterfaceC2423k2 interfaceC2423k2) {
        P6(c7Var, false);
        final String str = (String) AbstractC6056k.l(c7Var.f18743a);
        this.f30373a.b().t(new Runnable() { // from class: X6.F3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f18297a.J6(c7Var, bundle, interfaceC2423k2, str);
            }
        });
    }

    @Override // X6.InterfaceC2407i2
    public final void E1(final c7 c7Var) {
        AbstractC6056k.f(c7Var.f18743a);
        AbstractC6056k.l(c7Var.f18761s);
        K(new Runnable() { // from class: X6.K3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f18386a.X(c7Var);
            }
        });
    }

    @Override // X6.InterfaceC2407i2
    public final void E3(c7 c7Var) {
        P6(c7Var, false);
        T6(new RunnableC2440m3(this, c7Var));
    }

    @Override // X6.InterfaceC2407i2
    public final byte[] E4(I i10, String str) {
        AbstractC6056k.f(str);
        AbstractC6056k.l(i10);
        Q6(str, true);
        R6 r62 = this.f30373a;
        C2526x2 c2526x2V = r62.a().v();
        C2486s2 c2486s2M0 = r62.M0();
        String str2 = i10.f18343a;
        c2526x2V.b("Log and bundle. event", c2486s2M0.a(str2));
        long jB = r62.e().b() / 1000000;
        try {
            byte[] bArr = (byte[]) r62.b().s(new A3(this, i10, str)).get();
            if (bArr == null) {
                r62.a().o().b("Log and bundle returned null. appId", C2542z2.x(str));
                bArr = new byte[0];
            }
            r62.a().v().d("Log and bundle processed. event, size, time_ms", r62.M0().a(str2), Integer.valueOf(bArr.length), Long.valueOf((r62.e().b() / 1000000) - jB));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            R6 r63 = this.f30373a;
            r63.a().o().d("Failed to log and bundle. appId, event, error", C2542z2.x(str), r63.M0().a(i10.f18343a), e10);
            return null;
        }
    }

    @Override // X6.InterfaceC2407i2
    public final C2460p G0(c7 c7Var) {
        P6(c7Var, false);
        AbstractC6056k.f(c7Var.f18743a);
        try {
            return (C2460p) this.f30373a.b().s(new CallableC2527x3(this, c7Var)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f30373a.a().o().c("Failed to get consent. appId", C2542z2.x(c7Var.f18743a), e10);
            return new C2460p(null);
        }
    }

    @Override // X6.InterfaceC2407i2
    public final void G3(final c7 c7Var, final C2388g c2388g) {
        P6(c7Var, false);
        T6(new Runnable() { // from class: X6.I3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f18354a.L6(c7Var, c2388g);
            }
        });
    }

    public final /* synthetic */ void I6(c7 c7Var) {
        R6 r62 = this.f30373a;
        r62.E();
        r62.Q0(c7Var);
    }

    public final /* synthetic */ void J6(c7 c7Var, Bundle bundle, InterfaceC2423k2 interfaceC2423k2, String str) {
        R6 r62 = this.f30373a;
        r62.E();
        try {
            interfaceC2423k2.n3(r62.q0(c7Var, bundle));
        } catch (RemoteException e10) {
            this.f30373a.a().o().c("Failed to return trigger URIs for app", str, e10);
        }
    }

    public final void K(Runnable runnable) {
        AbstractC6056k.l(runnable);
        R6 r62 = this.f30373a;
        if (r62.b().p()) {
            runnable.run();
        } else {
            r62.b().v(runnable);
        }
    }

    @Override // X6.InterfaceC2407i2
    public final List K0(c7 c7Var, boolean z10) {
        P6(c7Var, false);
        String str = c7Var.f18743a;
        AbstractC6056k.l(str);
        try {
            List<Y6> list = (List) this.f30373a.b().r(new CallableC2424k3(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (Y6 y62 : list) {
                if (z10 || !a7.N(y62.f18661c)) {
                    arrayList.add(new W6(y62));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f30373a.a().o().c("Failed to get user properties. appId", C2542z2.x(c7Var.f18743a), e10);
            return null;
        }
    }

    @Override // X6.InterfaceC2407i2
    public final List K1(c7 c7Var, Bundle bundle) {
        P6(c7Var, false);
        AbstractC6056k.l(c7Var.f18743a);
        R6 r62 = this.f30373a;
        if (!r62.B0().H(null, AbstractC2383f2.f18868Z0)) {
            try {
                return (List) this.f30373a.b().r(new D3(this, c7Var, bundle)).get();
            } catch (InterruptedException | ExecutionException e10) {
                this.f30373a.a().o().c("Failed to get trigger URIs. appId", C2542z2.x(c7Var.f18743a), e10);
                return Collections.EMPTY_LIST;
            }
        }
        try {
            return (List) r62.b().s(new C3(this, c7Var, bundle)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            this.f30373a.a().o().c("Failed to get trigger URIs. appId", C2542z2.x(c7Var.f18743a), e11);
            return Collections.EMPTY_LIST;
        }
    }

    public final /* synthetic */ void K6(String str, C2538y6 c2538y6, InterfaceC2439m2 interfaceC2439m2) {
        R6 r62 = this.f30373a;
        r62.E();
        r62.b().h();
        r62.O0();
        List<U6> listO = r62.F0().o(str, c2538y6, ((Integer) AbstractC2383f2.f18819B.b(null)).intValue());
        ArrayList arrayList = new ArrayList();
        for (U6 u62 : listO) {
            if (r62.t(str, u62.e())) {
                int i10 = u62.i();
                if (i10 > 0) {
                    if (i10 <= ((Integer) AbstractC2383f2.f18931z.b(null)).intValue()) {
                        if (r62.e().a() >= u62.h() + Math.min(((Long) AbstractC2383f2.f18927x.b(null)).longValue() * (1 << (i10 - 1)), ((Long) AbstractC2383f2.f18929y.b(null)).longValue())) {
                        }
                    }
                    r62.a().w().d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(u62.c()), Long.valueOf(u62.h()));
                }
                C2522w6 c2522w6B = u62.b();
                try {
                    U2 u22 = (U2) V6.W(X2.K(), c2522w6B.f19293b);
                    for (int i11 = 0; i11 < u22.A(); i11++) {
                        Y2 y22 = (Y2) u22.B(i11).q();
                        y22.n1(r62.e().a());
                        u22.C(i11, y22);
                    }
                    c2522w6B.f19293b = ((X2) u22.w()).b();
                    if (Log.isLoggable(r62.a().z(), 2)) {
                        c2522w6B.f19298g = r62.K0().K((X2) u22.w());
                    }
                    arrayList.add(c2522w6B);
                } catch (C3229j5 unused) {
                    r62.a().r().b("Failed to parse queued batch. appId", str);
                }
            } else {
                r62.a().w().d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(u62.c()), u62.e());
            }
        }
        A6 a62 = new A6(arrayList);
        try {
            interfaceC2439m2.B1(a62);
            this.f30373a.a().w().c("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(a62.f18156a.size()));
        } catch (RemoteException e10) {
            this.f30373a.a().o().c("[sgtm] Failed to return upload batches for app", str, e10);
        }
    }

    public final /* synthetic */ void L6(c7 c7Var, C2388g c2388g) {
        R6 r62 = this.f30373a;
        r62.E();
        r62.r0((String) AbstractC6056k.l(c7Var.f18743a), c2388g);
    }

    @Override // X6.InterfaceC2407i2
    public final void M4(I i10, c7 c7Var) {
        AbstractC6056k.l(i10);
        P6(c7Var, false);
        T6(new RunnableC2535y3(this, i10, c7Var));
    }

    public final /* synthetic */ void M6(Bundle bundle, String str, c7 c7Var) {
        R6 r62 = this.f30373a;
        boolean zH = r62.B0().H(null, AbstractC2383f2.f18862W0);
        if (bundle.isEmpty() && zH) {
            C2515w c2515wF0 = this.f30373a.F0();
            c2515wF0.h();
            c2515wF0.j();
            try {
                c2515wF0.u0().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e10) {
                c2515wF0.f18400a.a().o().b("Error clearing default event params", e10);
                return;
            }
        }
        C2515w c2515wF02 = r62.F0();
        c2515wF02.h();
        c2515wF02.j();
        byte[] bArrB = c2515wF02.f19261b.K0().J(new D(c2515wF02.f18400a, "", str, "dep", 0L, 0L, bundle)).b();
        C2416j3 c2416j3 = c2515wF02.f18400a;
        c2416j3.a().w().c("Saving default event parameters, appId, data size", str, Integer.valueOf(bArrB.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(Constants.PARAMETERS, bArrB);
        try {
            if (c2515wF02.u0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                c2416j3.a().o().b("Failed to insert default event parameters (got -1). appId", C2542z2.x(str));
            }
        } catch (SQLiteException e11) {
            c2515wF02.f18400a.a().o().c("Error storing default event parameters. appId", C2542z2.x(str), e11);
        }
        R6 r63 = this.f30373a;
        C2515w c2515wF03 = r63.F0();
        long j10 = c7Var.f18741D;
        if (c2515wF03.H(str, j10)) {
            r63.F0().I(str, Long.valueOf(j10), null, bundle);
        }
    }

    @Override // X6.InterfaceC2407i2
    public final void N0(c7 c7Var) {
        AbstractC6056k.f(c7Var.f18743a);
        AbstractC6056k.l(c7Var.f18761s);
        K(new RunnableC2519w3(this, c7Var));
    }

    public final /* synthetic */ R6 N6() {
        return this.f30373a;
    }

    public final void O6(I i10, c7 c7Var) {
        R6 r62 = this.f30373a;
        r62.E();
        r62.k(i10, c7Var);
    }

    public final void P6(c7 c7Var, boolean z10) {
        AbstractC6056k.l(c7Var);
        String str = c7Var.f18743a;
        AbstractC6056k.f(str);
        Q6(str, false);
        this.f30373a.N0().o(c7Var.f18744b);
    }

    @Override // X6.InterfaceC2407i2
    public final void Q4(C2404i c2404i, c7 c7Var) {
        AbstractC6056k.l(c2404i);
        AbstractC6056k.l(c2404i.f18979c);
        P6(c7Var, false);
        C2404i c2404i2 = new C2404i(c2404i);
        c2404i2.f18977a = c7Var.f18743a;
        T6(new RunnableC2456o3(this, c2404i2, c7Var));
    }

    public final void Q6(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            this.f30373a.a().o().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f30374b == null) {
                    boolean z11 = true;
                    if (!"com.google.android.gms".equals(this.f30375c)) {
                        R6 r62 = this.f30373a;
                        if (!o.a(r62.d(), Binder.getCallingUid()) && !C5789h.a(r62.d()).c(Binder.getCallingUid())) {
                            z11 = false;
                        }
                    }
                    this.f30374b = Boolean.valueOf(z11);
                }
                if (this.f30374b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                this.f30373a.a().o().b("Measurement Service called with invalid calling package. appId", C2542z2.x(str));
                throw e10;
            }
        }
        if (this.f30375c == null && AbstractC5788g.j(this.f30373a.d(), Binder.getCallingUid(), str)) {
            this.f30375c = str;
        }
        if (str.equals(this.f30375c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    public final void R6(I i10, c7 c7Var) {
        R6 r62 = this.f30373a;
        C2344a3 c2344a3D0 = r62.D0();
        String str = c7Var.f18743a;
        C3152b0 c3152b0 = TextUtils.isEmpty(str) ? null : (C3152b0) c2344a3D0.f18691j.d(str);
        if (c3152b0 == null) {
            this.f30373a.a().w().b("EES not loaded for", c7Var.f18743a);
            O6(i10, c7Var);
            return;
        }
        try {
            Map mapZ = r62.K0().Z(i10.f18344b.l(), true);
            String str2 = i10.f18343a;
            String strA = T3.a(str2);
            if (strA != null) {
                str2 = strA;
            }
            if (c3152b0.b(new C3151b(str2, i10.f18346d, mapZ))) {
                if (c3152b0.c()) {
                    R6 r63 = this.f30373a;
                    r63.a().w().b("EES edited event", i10.f18343a);
                    O6(r63.K0().m(c3152b0.e().c()), c7Var);
                } else {
                    O6(i10, c7Var);
                }
                if (c3152b0.d()) {
                    for (C3151b c3151b : c3152b0.e().f()) {
                        R6 r64 = this.f30373a;
                        r64.a().w().b("EES logging created event", c3151b.b());
                        O6(r64.K0().m(c3151b), c7Var);
                    }
                    return;
                }
                return;
            }
        } catch (C3338w0 unused) {
            this.f30373a.a().o().c("EES error. appId, eventName", c7Var.f18744b, i10.f18343a);
        }
        this.f30373a.a().w().b("EES was not applied to event", i10.f18343a);
        O6(i10, c7Var);
    }

    public final I S6(I i10, c7 c7Var) {
        G g10;
        if ("_cmp".equals(i10.f18343a) && (g10 = i10.f18344b) != null && g10.k() != 0) {
            String strH = g10.h("_cis");
            if ("referrer broadcast".equals(strH) || "referrer API".equals(strH)) {
                this.f30373a.a().u().b("Event has been filtered ", i10.toString());
                return new I("_cmpx", g10, i10.f18345c, i10.f18346d);
            }
        }
        return i10;
    }

    public final void T6(Runnable runnable) {
        AbstractC6056k.l(runnable);
        R6 r62 = this.f30373a;
        if (r62.b().p()) {
            runnable.run();
        } else {
            r62.b().t(runnable);
        }
    }

    @Override // X6.InterfaceC2407i2
    public final void V5(final c7 c7Var) {
        AbstractC6056k.f(c7Var.f18743a);
        AbstractC6056k.l(c7Var.f18761s);
        K(new Runnable() { // from class: X6.E3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f18236a.I6(c7Var);
            }
        });
    }

    @Override // X6.InterfaceC2407i2
    public final void W5(c7 c7Var) {
        P6(c7Var, false);
        T6(new RunnableC2503u3(this, c7Var));
    }

    public final /* synthetic */ void X(c7 c7Var) {
        R6 r62 = this.f30373a;
        r62.E();
        r62.P0(c7Var);
    }

    @Override // X6.InterfaceC2407i2
    public final void b2(c7 c7Var) {
        P6(c7Var, false);
        T6(new RunnableC2432l3(this, c7Var));
    }

    @Override // X6.InterfaceC2407i2
    public final void i0(I i10, String str, String str2) {
        AbstractC6056k.l(i10);
        AbstractC6056k.f(str);
        Q6(str, true);
        T6(new RunnableC2543z3(this, i10, str));
    }

    @Override // X6.InterfaceC2407i2
    public final void k0(final Bundle bundle, final c7 c7Var) {
        P6(c7Var, false);
        final String str = c7Var.f18743a;
        AbstractC6056k.l(str);
        T6(new Runnable() { // from class: X6.J3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f18368a.M6(bundle, str, c7Var);
            }
        });
    }

    @Override // X6.InterfaceC2407i2
    public final void k4(c7 c7Var, final C2538y6 c2538y6, final InterfaceC2439m2 interfaceC2439m2) {
        P6(c7Var, false);
        final String str = (String) AbstractC6056k.l(c7Var.f18743a);
        this.f30373a.b().t(new Runnable() { // from class: X6.G3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f18315a.K6(str, c2538y6, interfaceC2439m2);
            }
        });
    }

    @Override // X6.InterfaceC2407i2
    public final List l3(String str, String str2, boolean z10, c7 c7Var) {
        P6(c7Var, false);
        String str3 = c7Var.f18743a;
        AbstractC6056k.l(str3);
        try {
            List<Y6> list = (List) this.f30373a.b().r(new CallableC2472q3(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (Y6 y62 : list) {
                if (z10 || !a7.N(y62.f18661c)) {
                    arrayList.add(new W6(y62));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f30373a.a().o().c("Failed to query user properties. appId", C2542z2.x(c7Var.f18743a), e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // X6.InterfaceC2407i2
    public final void n4(long j10, String str, String str2, String str3) {
        T6(new RunnableC2448n3(this, str2, str3, str, j10));
    }

    @Override // X6.InterfaceC2407i2
    public final String o4(c7 c7Var) {
        P6(c7Var, false);
        return this.f30373a.p0(c7Var);
    }

    @Override // X6.InterfaceC2407i2
    public final List p0(String str, String str2, String str3, boolean z10) {
        Q6(str, true);
        try {
            List<Y6> list = (List) this.f30373a.b().r(new CallableC2479r3(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (Y6 y62 : list) {
                if (z10 || !a7.N(y62.f18661c)) {
                    arrayList.add(new W6(y62));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f30373a.a().o().c("Failed to get user properties as. appId", C2542z2.x(str), e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // X6.InterfaceC2407i2
    public final List p1(String str, String str2, String str3) {
        Q6(str, true);
        try {
            return (List) this.f30373a.b().r(new CallableC2495t3(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f30373a.a().o().b("Failed to get conditional user properties as", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // X6.InterfaceC2407i2
    public final void s2(C2404i c2404i) {
        AbstractC6056k.l(c2404i);
        AbstractC6056k.l(c2404i.f18979c);
        AbstractC6056k.f(c2404i.f18977a);
        Q6(c2404i.f18977a, true);
        T6(new RunnableC2464p3(this, new C2404i(c2404i)));
    }

    @Override // X6.InterfaceC2407i2
    public final List u4(String str, String str2, c7 c7Var) {
        P6(c7Var, false);
        String str3 = c7Var.f18743a;
        AbstractC6056k.l(str3);
        try {
            return (List) this.f30373a.b().r(new CallableC2487s3(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f30373a.a().o().b("Failed to get conditional user properties", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // X6.InterfaceC2407i2
    public final void z4(W6 w62, c7 c7Var) {
        AbstractC6056k.l(w62);
        P6(c7Var, false);
        T6(new B3(this, w62, c7Var));
    }
}
