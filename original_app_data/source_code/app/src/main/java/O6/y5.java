package O6;

import java.io.UnsupportedEncodingException;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class y5 implements InterfaceC1739p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G3 f12062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public K4 f12063b = new K4();

    public y5(G3 g32, int i10) {
        this.f12062a = g32;
        K5.a();
    }

    public static InterfaceC1739p5 e(G3 g32) {
        return new y5(g32, 0);
    }

    @Override // O6.InterfaceC1739p5
    public final byte[] a(int i10, boolean z10) {
        this.f12063b.f(Boolean.valueOf(1 == (i10 ^ 1)));
        this.f12063b.e(Boolean.FALSE);
        this.f12062a.e(this.f12063b.m());
        try {
            K5.a();
            if (i10 == 0) {
                return new J8.d().j(N2.f11398a).k(true).i().b(this.f12062a.f()).getBytes("utf-8");
            }
            I3 i3F = this.f12062a.f();
            C1719n c1719n = new C1719n();
            N2.f11398a.a(c1719n);
            return c1719n.b().a(i3F);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    @Override // O6.InterfaceC1739p5
    public final String b() {
        N4 n4C = this.f12062a.f().c();
        return (n4C == null || AbstractC1680h2.b(n4C.k())) ? "NA" : (String) AbstractC6056k.l(n4C.k());
    }

    @Override // O6.InterfaceC1739p5
    public final InterfaceC1739p5 c(F3 f32) {
        this.f12062a.c(f32);
        return this;
    }

    @Override // O6.InterfaceC1739p5
    public final InterfaceC1739p5 d(K4 k42) {
        this.f12063b = k42;
        return this;
    }
}
