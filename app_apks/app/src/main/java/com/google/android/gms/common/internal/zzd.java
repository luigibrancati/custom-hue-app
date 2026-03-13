package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import v6.AbstractC6056k;
import v6.N;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class zzd extends zzz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f29106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29107b;

    public zzd(a aVar, int i10) {
        this.f29106a = aVar;
        this.f29107b = i10;
    }

    @Override // v6.InterfaceC6052g
    public final void P(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // v6.InterfaceC6052g
    public final void a2(int i10, IBinder iBinder, Bundle bundle) {
        AbstractC6056k.m(this.f29106a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f29106a.M(i10, iBinder, bundle, this.f29107b);
        this.f29106a = null;
    }

    @Override // v6.InterfaceC6052g
    public final void a6(int i10, IBinder iBinder, N n10) {
        a aVar = this.f29106a;
        AbstractC6056k.m(aVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC6056k.l(n10);
        aVar.V(n10);
        a2(i10, iBinder, n10.f45793a);
    }
}
