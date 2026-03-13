package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3638x2 extends C3549i2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f30264b = Logger.getLogger(AbstractC3638x2.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f30265c = P3.C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3644y2 f30266a;

    public /* synthetic */ AbstractC3638x2(AbstractC3632w2 abstractC3632w2) {
    }

    public static int A(String str) {
        int length;
        try {
            length = S3.c(str);
        } catch (R3 unused) {
            length = str.getBytes(T2.f30091a).length;
        }
        return B(length) + length;
    }

    public static int B(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int a(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int y(int i10, InterfaceC3568l3 interfaceC3568l3, InterfaceC3633w3 interfaceC3633w3) {
        int iB = B(i10 << 3);
        return iB + iB + ((AbstractC3507b2) interfaceC3568l3).b(interfaceC3633w3);
    }

    public static int z(InterfaceC3568l3 interfaceC3568l3, InterfaceC3633w3 interfaceC3633w3) {
        int iB = ((AbstractC3507b2) interfaceC3568l3).b(interfaceC3633w3);
        return B(iB) + iB;
    }

    public final void b() {
        if (e() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void c(String str, R3 r32) throws C3626v2 {
        f30264b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) r32);
        byte[] bytes = str.getBytes(T2.f30091a);
        try {
            int length = bytes.length;
            v(length);
            o(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new C3626v2(e10);
        }
    }

    public abstract int e();

    public abstract void f(byte b10);

    public abstract void g(int i10, boolean z10);

    public abstract void h(int i10, AbstractC3597q2 abstractC3597q2);

    public abstract void i(int i10, int i11);

    public abstract void j(int i10);

    public abstract void k(int i10, long j10);

    public abstract void l(long j10);

    public abstract void m(int i10, int i11);

    public abstract void n(int i10);

    public abstract void o(byte[] bArr, int i10, int i11);

    public abstract void p(int i10, InterfaceC3568l3 interfaceC3568l3, InterfaceC3633w3 interfaceC3633w3);

    public abstract void q(int i10, InterfaceC3568l3 interfaceC3568l3);

    public abstract void r(int i10, AbstractC3597q2 abstractC3597q2);

    public abstract void s(int i10, String str);

    public abstract void t(int i10, int i11);

    public abstract void u(int i10, int i11);

    public abstract void v(int i10);

    public abstract void w(int i10, long j10);

    public abstract void x(long j10);
}
