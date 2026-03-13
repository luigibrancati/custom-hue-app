package k2;

import G1.C;
import G1.M;
import G1.t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC4790a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f39235g;

    public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f39229a = i10;
        this.f39230b = i11;
        this.f39231c = i12;
        this.f39232d = i13;
        this.f39233e = i14;
        this.f39234f = i15;
        this.f39235g = i16;
    }

    public static d c(C c10) {
        int iY = c10.y();
        c10.b0(12);
        int iY2 = c10.y();
        int iY3 = c10.y();
        int iY4 = c10.y();
        c10.b0(4);
        int iY5 = c10.y();
        int iY6 = c10.y();
        c10.b0(4);
        return new d(iY, iY2, iY3, iY4, iY5, iY6, c10.y());
    }

    public long a() {
        return M.a1(this.f39233e, ((long) this.f39231c) * 1000000, this.f39232d);
    }

    public int b() {
        int i10 = this.f39229a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        t.h("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f39229a));
        return -1;
    }

    @Override // k2.InterfaceC4790a
    public int getType() {
        return 1752331379;
    }
}
