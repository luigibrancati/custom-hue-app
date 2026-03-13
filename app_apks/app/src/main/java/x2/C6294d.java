package x2;

import D1.u;

/* JADX INFO: renamed from: x2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6294d implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f47348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47349b;

    public C6294d(float f10, int i10) {
        this.f47348a = f10;
        this.f47349b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6294d.class == obj.getClass()) {
            C6294d c6294d = (C6294d) obj;
            if (this.f47348a == c6294d.f47348a && this.f47349b == c6294d.f47349b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + N7.d.a(this.f47348a)) * 31) + this.f47349b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f47348a + ", svcTemporalLayerCount=" + this.f47349b;
    }
}
