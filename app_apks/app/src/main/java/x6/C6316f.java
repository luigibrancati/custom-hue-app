package x6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import s6.C5785d;
import u6.InterfaceC5950d;
import u6.InterfaceC5964k;
import v6.C6048c;
import v6.r;

/* JADX INFO: renamed from: x6.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6316f extends com.google.android.gms.common.internal.c {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final r f47483K;

    public C6316f(Context context, Looper looper, C6048c c6048c, r rVar, InterfaceC5950d interfaceC5950d, InterfaceC5964k interfaceC5964k) {
        super(context, looper, 270, c6048c, interfaceC5950d, interfaceC5964k);
        this.f47483K = rVar;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean H() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.a, t6.C5843a.f
    public final int m() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C6311a ? (C6311a) iInterfaceQueryLocalInterface : new C6311a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final C5785d[] u() {
        return H6.c.f5323b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle z() {
        return this.f47483K.b();
    }
}
