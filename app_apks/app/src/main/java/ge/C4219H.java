package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.H, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4219H extends AbstractC4248m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f35652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35653b;

    public C4219H(int[] bufferWithData) {
        AbstractC4862t.e(bufferWithData, "bufferWithData");
        this.f35652a = bufferWithData;
        this.f35653b = bufferWithData.length;
        b(10);
    }

    @Override // ge.AbstractC4248m0
    public void b(int i10) {
        int[] iArr = this.f35652a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Bc.k.e(i10, iArr.length * 2));
            AbstractC4862t.d(iArrCopyOf, "copyOf(...)");
            this.f35652a = iArrCopyOf;
        }
    }

    @Override // ge.AbstractC4248m0
    public int d() {
        return this.f35653b;
    }

    public final void e(int i10) {
        AbstractC4248m0.c(this, 0, 1, null);
        int[] iArr = this.f35652a;
        int iD = d();
        this.f35653b = iD + 1;
        iArr[iD] = i10;
    }

    @Override // ge.AbstractC4248m0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f35652a, d());
        AbstractC4862t.d(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }
}
