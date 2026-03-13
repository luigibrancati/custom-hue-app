package K6;

import R6.InterfaceC2069d;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class O extends AbstractC6157a implements InterfaceC2069d {
    public static final Parcelable.Creator<O> CREATOR = new P();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f7517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f7518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f7519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f7520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7523i;

    public O(String str, int i10, short s10, double d10, double d11, float f10, long j10, int i11, int i12) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: ".concat(String.valueOf(str)));
        }
        if (f10 <= 0.0f) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(f10).length() + 16);
            sb2.append("invalid radius: ");
            sb2.append(f10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d10 > 90.0d || d10 < -90.0d) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(d10).length() + 18);
            sb3.append("invalid latitude: ");
            sb3.append(d10);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (d11 > 180.0d || d11 < -180.0d) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(d11).length() + 19);
            sb4.append("invalid longitude: ");
            sb4.append(d11);
            throw new IllegalArgumentException(sb4.toString());
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(i10).length() + 35);
            sb5.append("No supported transition specified: ");
            sb5.append(i10);
            throw new IllegalArgumentException(sb5.toString());
        }
        this.f7517c = s10;
        this.f7515a = str;
        this.f7518d = d10;
        this.f7519e = d11;
        this.f7520f = f10;
        this.f7516b = j10;
        this.f7521g = i13;
        this.f7522h = i11;
        this.f7523i = i12;
    }

    @Override // R6.InterfaceC2069d
    public final String c() {
        return this.f7515a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof O) {
            O o10 = (O) obj;
            if (this.f7520f == o10.f7520f && this.f7518d == o10.f7518d && this.f7519e == o10.f7519e && this.f7517c == o10.f7517c && this.f7521g == o10.f7521g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f7518d);
        long j10 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f7519e);
        return ((((((((((int) j10) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f7520f)) * 31) + this.f7517c) * 31) + this.f7521g;
    }

    public final String toString() {
        short s10 = this.f7517c;
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s10 != -1 ? s10 != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID", this.f7515a.replaceAll("\\p{C}", "?"), Integer.valueOf(this.f7521g), Double.valueOf(this.f7518d), Double.valueOf(this.f7519e), Float.valueOf(this.f7520f), Integer.valueOf(this.f7522h / 1000), Integer.valueOf(this.f7523i), Long.valueOf(this.f7516b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7515a;
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 1, str, false);
        w6.c.s(parcel, 2, this.f7516b);
        w6.c.v(parcel, 3, this.f7517c);
        w6.c.h(parcel, 4, this.f7518d);
        w6.c.h(parcel, 5, this.f7519e);
        w6.c.j(parcel, 6, this.f7520f);
        w6.c.n(parcel, 7, this.f7521g);
        w6.c.n(parcel, 8, this.f7522h);
        w6.c.n(parcel, 9, this.f7523i);
        w6.c.b(parcel, iA);
    }
}
