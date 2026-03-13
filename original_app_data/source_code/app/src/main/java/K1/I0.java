package K1;

import G1.AbstractC0853a;
import a2.InterfaceC2611D;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2611D.b f6874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f6883j;

    public I0(InterfaceC2611D.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        AbstractC0853a.a(!z14 || z12);
        AbstractC0853a.a(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        AbstractC0853a.a(z15);
        this.f6874a = bVar;
        this.f6875b = j10;
        this.f6876c = j11;
        this.f6877d = j12;
        this.f6878e = j13;
        this.f6879f = z10;
        this.f6880g = z11;
        this.f6881h = z12;
        this.f6882i = z13;
        this.f6883j = z14;
    }

    public I0 a(long j10) {
        return j10 == this.f6876c ? this : new I0(this.f6874a, this.f6875b, j10, this.f6877d, this.f6878e, this.f6879f, this.f6880g, this.f6881h, this.f6882i, this.f6883j);
    }

    public I0 b(long j10) {
        return j10 == this.f6875b ? this : new I0(this.f6874a, j10, this.f6876c, this.f6877d, this.f6878e, this.f6879f, this.f6880g, this.f6881h, this.f6882i, this.f6883j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && I0.class == obj.getClass()) {
            I0 i02 = (I0) obj;
            if (this.f6875b == i02.f6875b && this.f6876c == i02.f6876c && this.f6877d == i02.f6877d && this.f6878e == i02.f6878e && this.f6879f == i02.f6879f && this.f6880g == i02.f6880g && this.f6881h == i02.f6881h && this.f6882i == i02.f6882i && this.f6883j == i02.f6883j && Objects.equals(this.f6874a, i02.f6874a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f6874a.hashCode()) * 31) + ((int) this.f6875b)) * 31) + ((int) this.f6876c)) * 31) + ((int) this.f6877d)) * 31) + ((int) this.f6878e)) * 31) + (this.f6879f ? 1 : 0)) * 31) + (this.f6880g ? 1 : 0)) * 31) + (this.f6881h ? 1 : 0)) * 31) + (this.f6882i ? 1 : 0)) * 31) + (this.f6883j ? 1 : 0);
    }
}
