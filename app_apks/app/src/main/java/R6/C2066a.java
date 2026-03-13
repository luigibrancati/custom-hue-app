package R6;

import K6.W;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v6.AbstractC6055j;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: R6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C2066a extends AbstractC6157a {
    public static final Parcelable.Creator<C2066a> CREATOR = new D();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f14784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte f14788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f14789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f14790g;

    public C2066a(float[] fArr, float f10, float f11, long j10, byte b10, float f12, float f13) {
        n(fArr);
        W.a(f10 >= 0.0f && f10 < 360.0f);
        W.a(f11 >= 0.0f && f11 <= 180.0f);
        W.a(f13 >= 0.0f && f13 <= 180.0f);
        W.a(j10 >= 0);
        this.f14784a = fArr;
        this.f14785b = f10;
        this.f14786c = f11;
        this.f14789f = f12;
        this.f14790g = f13;
        this.f14787d = j10;
        this.f14788e = (byte) (((byte) (((byte) (b10 | 16)) | 4)) | 8);
    }

    public static void n(float[] fArr) {
        W.b(fArr != null && fArr.length == 4, "Input attitude array should be of length 4.");
        W.b((Float.isNaN(fArr[0]) || Float.isNaN(fArr[1]) || Float.isNaN(fArr[2]) || Float.isNaN(fArr[3])) ? false : true, "Input attitude cannot contain NaNs.");
    }

    public float[] d() {
        return (float[]) this.f14784a.clone();
    }

    public float e() {
        return this.f14790g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2066a)) {
            return false;
        }
        C2066a c2066a = (C2066a) obj;
        return Float.compare(this.f14785b, c2066a.f14785b) == 0 && Float.compare(this.f14786c, c2066a.f14786c) == 0 && (zza() == c2066a.zza() && (!zza() || Float.compare(this.f14789f, c2066a.f14789f) == 0)) && (l() == c2066a.l() && (!l() || Float.compare(e(), c2066a.e()) == 0)) && this.f14787d == c2066a.f14787d && Arrays.equals(this.f14784a, c2066a.f14784a);
    }

    public long f() {
        return this.f14787d;
    }

    public float h() {
        return this.f14785b;
    }

    public int hashCode() {
        return AbstractC6055j.b(Float.valueOf(this.f14785b), Float.valueOf(this.f14786c), Float.valueOf(this.f14790g), Long.valueOf(this.f14787d), this.f14784a, Byte.valueOf(this.f14788e));
    }

    public float k() {
        return this.f14786c;
    }

    public boolean l() {
        return (this.f14788e & 64) != 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceOrientation[");
        sb2.append("attitude=");
        sb2.append(Arrays.toString(this.f14784a));
        sb2.append(", headingDegrees=");
        sb2.append(this.f14785b);
        sb2.append(", headingErrorDegrees=");
        sb2.append(this.f14786c);
        if (l()) {
            sb2.append(", conservativeHeadingErrorDegrees=");
            sb2.append(this.f14790g);
        }
        sb2.append(", elapsedRealtimeNs=");
        sb2.append(this.f14787d);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.k(parcel, 1, d(), false);
        w6.c.j(parcel, 4, h());
        w6.c.j(parcel, 5, k());
        w6.c.s(parcel, 6, f());
        w6.c.f(parcel, 7, this.f14788e);
        w6.c.j(parcel, 8, this.f14789f);
        w6.c.j(parcel, 9, e());
        w6.c.b(parcel, iA);
    }

    public final boolean zza() {
        return (this.f14788e & 32) != 0;
    }
}
