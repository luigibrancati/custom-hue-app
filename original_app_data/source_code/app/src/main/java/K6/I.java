package K6;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I extends AbstractC6157a {
    public static final Parcelable.Creator<I> CREATOR = new J();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f7503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f7504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f7505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7506e;

    public I(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.f7502a = i10;
        this.f7503b = iBinder;
        this.f7504c = iBinder2;
        this.f7505d = pendingIntent;
        this.f7506e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [R6.K, android.os.IBinder] */
    public static I d(IInterface iInterface, R6.K k10, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new I(2, iInterface, k10, null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static I e(q0 q0Var) {
        return new I(4, null, q0Var, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f7502a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, i11);
        w6.c.m(parcel, 2, this.f7503b, false);
        w6.c.m(parcel, 3, this.f7504c, false);
        w6.c.u(parcel, 4, this.f7505d, i10, false);
        w6.c.w(parcel, 6, this.f7506e, false);
        w6.c.b(parcel, iA);
    }
}
