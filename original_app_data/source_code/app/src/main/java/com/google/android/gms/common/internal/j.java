package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.a;
import java.util.Objects;
import s6.C5783b;
import v6.AbstractC6056k;
import v6.D;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends D {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f29103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a f29104h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, int i10, IBinder iBinder, Bundle bundle) {
        super(aVar, i10, bundle);
        Objects.requireNonNull(aVar);
        this.f29104h = aVar;
        this.f29103g = iBinder;
    }

    @Override // v6.D
    public final boolean e() {
        try {
            IBinder iBinder = this.f29103g;
            AbstractC6056k.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            a aVar = this.f29104h;
            if (!aVar.D().equals(interfaceDescriptor)) {
                String strD = aVar.D();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strD).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(strD);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface iInterfaceR = aVar.r(this.f29103g);
            if (iInterfaceR == null || !(aVar.X(2, 4, iInterfaceR) || aVar.X(3, 4, iInterfaceR))) {
                return false;
            }
            aVar.g0(null);
            a.InterfaceC0356a interfaceC0356aD0 = aVar.d0();
            Bundle bundleW = aVar.w();
            if (interfaceC0356aD0 == null) {
                return true;
            }
            aVar.d0().K(bundleW);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // v6.D
    public final void f(C5783b c5783b) {
        a aVar = this.f29104h;
        if (aVar.e0() != null) {
            aVar.e0().D(c5783b);
        }
        aVar.K(c5783b);
    }
}
