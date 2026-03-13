package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class J4 extends C3334v4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f29243b = Logger.getLogger(J4.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f29244c = AbstractC3194f6.f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K4 f29245a;

    public /* synthetic */ J4(byte[] bArr) {
    }

    public static int G(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int a(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int b(String str) {
        int length;
        try {
            length = AbstractC3221i6.b(str);
        } catch (C3212h6 unused) {
            length = str.getBytes(AbstractC3211h5.f29486a).length;
        }
        return G(length) + length;
    }

    public static int c(C5 c52) {
        int iA = c52.a();
        return G(iA) + iA;
    }

    public static int d(C5 c52, N5 n52) {
        int iC = ((AbstractC3282p4) c52).c(n52);
        return G(iC) + iC;
    }

    public static int g(int i10, C5 c52, N5 n52) {
        int iG = G(i10 << 3);
        return iG + iG + ((AbstractC3282p4) c52).c(n52);
    }

    public abstract void A(int i10);

    public abstract void B(long j10);

    public abstract void C(long j10);

    public abstract void D(byte[] bArr, int i10, int i11);

    public abstract void E(String str);

    public abstract int F();

    public final void e() {
        if (F() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void f(String str, C3212h6 c3212h6) throws I4 {
        f29243b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c3212h6);
        byte[] bytes = str.getBytes(AbstractC3211h5.f29486a);
        try {
            int length = bytes.length;
            z(length);
            D(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new I4(e10);
        }
    }

    public abstract void i(int i10, int i11);

    public abstract void j(int i10, int i11);

    public abstract void k(int i10, int i11);

    public abstract void l(int i10, int i11);

    public abstract void m(int i10, long j10);

    public abstract void n(int i10, long j10);

    public abstract void o(int i10, boolean z10);

    public abstract void p(int i10, String str);

    public abstract void q(int i10, E4 e42);

    public abstract void r(E4 e42);

    public abstract void s(byte[] bArr, int i10, int i11);

    public abstract void t(int i10, C5 c52, N5 n52);

    public abstract void u(int i10, C5 c52);

    public abstract void v(int i10, E4 e42);

    public abstract void w(C5 c52);

    public abstract void x(byte b10);

    public abstract void y(int i10);

    public abstract void z(int i10);
}
