package ge;

import fc.C4042y;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class A0 extends AbstractC4248m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f35633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35634b;

    public /* synthetic */ A0(byte[] bArr, AbstractC4854k abstractC4854k) {
        this(bArr);
    }

    @Override // ge.AbstractC4248m0
    public /* bridge */ /* synthetic */ Object a() {
        return C4042y.c(f());
    }

    @Override // ge.AbstractC4248m0
    public void b(int i10) {
        if (C4042y.r(this.f35633a) < i10) {
            byte[] bArr = this.f35633a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, Bc.k.e(i10, C4042y.r(bArr) * 2));
            AbstractC4862t.d(bArrCopyOf, "copyOf(...)");
            this.f35633a = C4042y.e(bArrCopyOf);
        }
    }

    @Override // ge.AbstractC4248m0
    public int d() {
        return this.f35634b;
    }

    public final void e(byte b10) {
        AbstractC4248m0.c(this, 0, 1, null);
        byte[] bArr = this.f35633a;
        int iD = d();
        this.f35634b = iD + 1;
        C4042y.w(bArr, iD, b10);
    }

    public byte[] f() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f35633a, d());
        AbstractC4862t.d(bArrCopyOf, "copyOf(...)");
        return C4042y.e(bArrCopyOf);
    }

    public A0(byte[] bufferWithData) {
        AbstractC4862t.e(bufferWithData, "bufferWithData");
        this.f35633a = bufferWithData;
        this.f35634b = C4042y.r(bufferWithData);
        b(10);
    }
}
