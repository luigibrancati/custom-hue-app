package D1;

import G1.AbstractC0853a;
import G1.M;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f2116d = new y(1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f2117e = M.z0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f2118f = M.z0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2121c;

    public y(float f10) {
        this(f10, 1.0f);
    }

    public long a(long j10) {
        return j10 * ((long) this.f2121c);
    }

    public y b(float f10) {
        return new y(f10, this.f2120b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f2119a == yVar.f2119a && this.f2120b == yVar.f2120b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f2119a)) * 31) + Float.floatToRawIntBits(this.f2120b);
    }

    public String toString() {
        return M.G("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f2119a), Float.valueOf(this.f2120b));
    }

    public y(float f10, float f11) {
        AbstractC0853a.a(f10 > 0.0f);
        AbstractC0853a.a(f11 > 0.0f);
        this.f2119a = f10;
        this.f2120b = f11;
        this.f2121c = Math.round(f10 * 1000.0f);
    }
}
