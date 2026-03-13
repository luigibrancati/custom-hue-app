package s6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: s6.E, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5775E extends AbstractC6157a {
    public static final Parcelable.Creator<C5775E> CREATOR = new C5776F();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractBinderC5802u f44128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f44130d;

    public C5775E(String str, AbstractBinderC5802u abstractBinderC5802u, boolean z10, boolean z11) {
        this.f44127a = str;
        this.f44128b = abstractBinderC5802u;
        this.f44129c = z10;
        this.f44130d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f44127a;
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 1, str, false);
        AbstractBinderC5802u abstractBinderC5802u = this.f44128b;
        if (abstractBinderC5802u == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abstractBinderC5802u = null;
        }
        w6.c.m(parcel, 2, abstractBinderC5802u, false);
        w6.c.c(parcel, 3, this.f44129c);
        w6.c.c(parcel, 4, this.f44130d);
        w6.c.b(parcel, iA);
    }

    public C5775E(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f44127a = str;
        BinderC5803v binderC5803v = null;
        if (iBinder != null) {
            try {
                IObjectWrapper iObjectWrapperC = zzw.zzg(iBinder).c();
                byte[] bArr = iObjectWrapperC == null ? null : (byte[]) ObjectWrapper.unwrap(iObjectWrapperC);
                if (bArr != null) {
                    binderC5803v = new BinderC5803v(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f44128b = binderC5803v;
        this.f44129c = z10;
        this.f44130d = z11;
    }
}
