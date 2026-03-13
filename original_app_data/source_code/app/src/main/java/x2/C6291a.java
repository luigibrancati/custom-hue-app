package x2;

import D1.u;
import N7.i;

/* JADX INFO: renamed from: x2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6291a implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47342e;

    public C6291a(long j10, long j11, long j12, long j13, long j14) {
        this.f47338a = j10;
        this.f47339b = j11;
        this.f47340c = j12;
        this.f47341d = j13;
        this.f47342e = j14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6291a.class == obj.getClass()) {
            C6291a c6291a = (C6291a) obj;
            if (this.f47338a == c6291a.f47338a && this.f47339b == c6291a.f47339b && this.f47340c == c6291a.f47340c && this.f47341d == c6291a.f47341d && this.f47342e == c6291a.f47342e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + i.c(this.f47338a)) * 31) + i.c(this.f47339b)) * 31) + i.c(this.f47340c)) * 31) + i.c(this.f47341d)) * 31) + i.c(this.f47342e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f47338a + ", photoSize=" + this.f47339b + ", photoPresentationTimestampUs=" + this.f47340c + ", videoStartPosition=" + this.f47341d + ", videoSize=" + this.f47342e;
    }
}
