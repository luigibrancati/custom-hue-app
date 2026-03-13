package i2;

import G1.AbstractC0853a;
import i2.O;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f36892a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f36895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36898g;

    public void a(O o10, O.a aVar) {
        if (this.f36894c > 0) {
            o10.d(this.f36895d, this.f36896e, this.f36897f, this.f36898g, aVar);
            this.f36894c = 0;
        }
    }

    public void b() {
        this.f36893b = false;
        this.f36894c = 0;
    }

    public void c(O o10, long j10, int i10, int i11, int i12, O.a aVar) {
        AbstractC0853a.h(this.f36898g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f36893b) {
            int i13 = this.f36894c;
            int i14 = i13 + 1;
            this.f36894c = i14;
            if (i13 == 0) {
                this.f36895d = j10;
                this.f36896e = i10;
                this.f36897f = 0;
            }
            this.f36897f += i11;
            this.f36898g = i12;
            if (i14 >= 16) {
                a(o10, aVar);
            }
        }
    }

    public void d(InterfaceC4337q interfaceC4337q) {
        if (this.f36893b) {
            return;
        }
        interfaceC4337q.s(this.f36892a, 0, 10);
        interfaceC4337q.i();
        if (AbstractC4322b.j(this.f36892a) == 0) {
            return;
        }
        this.f36893b = true;
    }
}
