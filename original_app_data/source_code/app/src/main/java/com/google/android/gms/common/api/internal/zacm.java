package com.google.android.gms.common.api.internal;

import Y6.d;
import Y6.e;
import Z6.j;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.signin.internal.zac;
import java.util.Set;
import s6.C5783b;
import t6.AbstractC5847e;
import t6.C5843a;
import u6.InterfaceC5939V;
import u6.RunnableC5937T;
import u6.RunnableC5938U;
import v6.AbstractC6056k;
import v6.C6048c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class zacm extends zac implements AbstractC5847e.a, AbstractC5847e.b {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C5843a.AbstractC0606a f29031y = d.f19798c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f29033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5843a.AbstractC0606a f29034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f29035d;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C6048c f29036v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e f29037w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InterfaceC5939V f29038x;

    public zacm(Context context, Handler handler, C6048c c6048c) {
        C5843a.AbstractC0606a abstractC0606a = f29031y;
        this.f29032a = context;
        this.f29033b = handler;
        this.f29036v = (C6048c) AbstractC6056k.m(c6048c, "ClientSettings must not be null");
        this.f29035d = c6048c.e();
        this.f29034c = abstractC0606a;
    }

    @Override // u6.InterfaceC5964k
    public final void D(C5783b c5783b) {
        this.f29038x.S(c5783b);
    }

    public final void J6(InterfaceC5939V interfaceC5939V) {
        e eVar = this.f29037w;
        if (eVar != null) {
            eVar.k();
        }
        C6048c c6048c = this.f29036v;
        c6048c.i(Integer.valueOf(System.identityHashCode(this)));
        C5843a.AbstractC0606a abstractC0606a = this.f29034c;
        Context context = this.f29032a;
        Handler handler = this.f29033b;
        this.f29037w = (e) abstractC0606a.a(context, handler.getLooper(), c6048c, c6048c.g(), this, this);
        this.f29038x = interfaceC5939V;
        Set set = this.f29035d;
        if (set == null || set.isEmpty()) {
            handler.post(new RunnableC5937T(this));
        } else {
            this.f29037w.f();
        }
    }

    @Override // u6.InterfaceC5950d
    public final void K(Bundle bundle) {
        this.f29037w.g(this);
    }

    public final void K6() {
        e eVar = this.f29037w;
        if (eVar != null) {
            eVar.k();
        }
    }

    public final /* synthetic */ void L6(j jVar) {
        C5783b c5783bD = jVar.d();
        if (c5783bD.l()) {
            f fVar = (f) AbstractC6056k.l(jVar.e());
            C5783b c5783bE = fVar.e();
            if (!c5783bE.l()) {
                String strValueOf = String.valueOf(c5783bE);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                this.f29038x.S(c5783bE);
                this.f29037w.k();
                return;
            }
            this.f29038x.T(fVar.d(), this.f29035d);
        } else {
            this.f29038x.S(c5783bD);
        }
        this.f29037w.k();
    }

    public final /* synthetic */ InterfaceC5939V M6() {
        return this.f29038x;
    }

    @Override // u6.InterfaceC5950d
    public final void X(int i10) {
        this.f29038x.R(i10);
    }

    @Override // com.google.android.gms.signin.internal.zac, Z6.d
    public final void b5(j jVar) {
        this.f29033b.post(new RunnableC5938U(this, jVar));
    }
}
