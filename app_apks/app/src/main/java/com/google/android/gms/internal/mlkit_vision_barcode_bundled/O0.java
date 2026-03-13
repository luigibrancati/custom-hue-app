package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class O0 extends C3484x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f29783b = Logger.getLogger(O0.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f29784c = AbstractC3481w2.C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public P0 f29785a;

    public /* synthetic */ O0(N0 n02) {
    }

    public static int A(J1 j12) {
        int iA = j12.a();
        return a(iA) + iA;
    }

    public static int B(J1 j12, InterfaceC3382c2 interfaceC3382c2) {
        int iC = ((AbstractC3454r0) j12).c(interfaceC3382c2);
        return a(iC) + iC;
    }

    public static int C(String str) {
        int length;
        try {
            length = C2.e(str);
        } catch (B2 unused) {
            length = str.getBytes(AbstractC3446p1.f29896a).length;
        }
        return a(length) + length;
    }

    public static int a(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int b(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int z(int i10, J1 j12, InterfaceC3382c2 interfaceC3382c2) {
        int iA = a(i10 << 3);
        return iA + iA + ((AbstractC3454r0) j12).c(interfaceC3382c2);
    }

    public final void c() {
        if (f() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void d(String str, B2 b22) throws M0 {
        f29783b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) b22);
        byte[] bytes = str.getBytes(AbstractC3446p1.f29896a);
        try {
            int length = bytes.length;
            w(length);
            p(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new M0(e10);
        }
    }

    public abstract int f();

    public abstract void g(byte b10);

    public abstract void h(int i10, boolean z10);

    public abstract void i(int i10, G0 g02);

    public abstract void j(int i10, int i11);

    public abstract void k(int i10);

    public abstract void l(int i10, long j10);

    public abstract void m(long j10);

    public abstract void n(int i10, int i11);

    public abstract void o(int i10);

    public abstract void p(byte[] bArr, int i10, int i11);

    public abstract void q(int i10, J1 j12, InterfaceC3382c2 interfaceC3382c2);

    public abstract void r(int i10, J1 j12);

    public abstract void s(int i10, G0 g02);

    public abstract void t(int i10, String str);

    public abstract void u(int i10, int i11);

    public abstract void v(int i10, int i11);

    public abstract void w(int i10);

    public abstract void x(int i10, long j10);

    public abstract void y(long j10);
}
