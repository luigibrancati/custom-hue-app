package U6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.maps.zzay;
import v6.AbstractC6056k;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K extends AbstractC6157a {
    public static final Parcelable.Creator<K> CREATOR = new V();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L6.r f16652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public L f16653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f16655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f16657f;

    public K() {
        this.f16654c = true;
        this.f16656e = true;
        this.f16657f = 0.0f;
    }

    public K d(boolean z10) {
        this.f16656e = z10;
        return this;
    }

    public boolean e() {
        return this.f16656e;
    }

    public float f() {
        return this.f16657f;
    }

    public float h() {
        return this.f16655d;
    }

    public boolean k() {
        return this.f16654c;
    }

    public K l(L l10) {
        this.f16653b = (L) AbstractC6056k.m(l10, "tileProvider must not be null.");
        this.f16652a = new U(this, l10);
        return this;
    }

    public K n(float f10) {
        boolean z10 = false;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        AbstractC6056k.b(z10, "Transparency must be in the range [0..1]");
        this.f16657f = f10;
        return this;
    }

    public K r(boolean z10) {
        this.f16654c = z10;
        return this;
    }

    public K t(float f10) {
        this.f16655d = f10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        L6.r rVar = this.f16652a;
        w6.c.m(parcel, 2, rVar == null ? null : rVar.asBinder(), false);
        w6.c.c(parcel, 3, k());
        w6.c.j(parcel, 4, h());
        w6.c.c(parcel, 5, e());
        w6.c.j(parcel, 6, f());
        w6.c.b(parcel, iA);
    }

    public K(IBinder iBinder, boolean z10, float f10, boolean z11, float f11) {
        this.f16654c = true;
        this.f16656e = true;
        this.f16657f = 0.0f;
        L6.r rVarZzc = zzay.zzc(iBinder);
        this.f16652a = rVarZzc;
        this.f16653b = rVarZzc == null ? null : new T(this);
        this.f16654c = z10;
        this.f16655d = f10;
        this.f16656e = z11;
        this.f16657f = f11;
    }
}
