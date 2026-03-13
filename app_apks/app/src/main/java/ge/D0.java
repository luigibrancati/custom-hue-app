package ge;

import fc.C4008A;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class D0 extends AbstractC4248m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f35641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35642b;

    public /* synthetic */ D0(int[] iArr, AbstractC4854k abstractC4854k) {
        this(iArr);
    }

    @Override // ge.AbstractC4248m0
    public /* bridge */ /* synthetic */ Object a() {
        return C4008A.c(f());
    }

    @Override // ge.AbstractC4248m0
    public void b(int i10) {
        if (C4008A.r(this.f35641a) < i10) {
            int[] iArr = this.f35641a;
            int[] iArrCopyOf = Arrays.copyOf(iArr, Bc.k.e(i10, C4008A.r(iArr) * 2));
            AbstractC4862t.d(iArrCopyOf, "copyOf(...)");
            this.f35641a = C4008A.e(iArrCopyOf);
        }
    }

    @Override // ge.AbstractC4248m0
    public int d() {
        return this.f35642b;
    }

    public final void e(int i10) {
        AbstractC4248m0.c(this, 0, 1, null);
        int[] iArr = this.f35641a;
        int iD = d();
        this.f35642b = iD + 1;
        C4008A.w(iArr, iD, i10);
    }

    public int[] f() {
        int[] iArrCopyOf = Arrays.copyOf(this.f35641a, d());
        AbstractC4862t.d(iArrCopyOf, "copyOf(...)");
        return C4008A.e(iArrCopyOf);
    }

    public D0(int[] bufferWithData) {
        AbstractC4862t.e(bufferWithData, "bufferWithData");
        this.f35641a = bufferWithData;
        this.f35642b = C4008A.r(bufferWithData);
        b(10);
    }
}
