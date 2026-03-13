package K6;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.zzv;
import com.google.android.gms.location.zzy;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M extends AbstractC6157a {
    public static final Parcelable.Creator<M> CREATOR = new N();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f7509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final R6.M f7510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R6.K f7511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PendingIntent f7512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l0 f7513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7514g;

    public M(int i10, K k10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.f7508a = i10;
        this.f7509b = k10;
        l0 k0Var = null;
        this.f7510c = iBinder != null ? zzy.zzb(iBinder) : null;
        this.f7512e = pendingIntent;
        this.f7511d = iBinder2 != null ? zzv.zzb(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            k0Var = iInterfaceQueryLocalInterface instanceof l0 ? (l0) iInterfaceQueryLocalInterface : new k0(iBinder3);
        }
        this.f7513f = k0Var;
        this.f7514g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f7508a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, i11);
        w6.c.u(parcel, 2, this.f7509b, i10, false);
        R6.M m10 = this.f7510c;
        w6.c.m(parcel, 3, m10 == null ? null : m10.asBinder(), false);
        w6.c.u(parcel, 4, this.f7512e, i10, false);
        R6.K k10 = this.f7511d;
        w6.c.m(parcel, 5, k10 == null ? null : k10.asBinder(), false);
        l0 l0Var = this.f7513f;
        w6.c.m(parcel, 6, l0Var != null ? l0Var.asBinder() : null, false);
        w6.c.w(parcel, 8, this.f7514g, false);
        w6.c.b(parcel, iA);
    }
}
