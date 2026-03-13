package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4233f extends AbstractC4248m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f35700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35701b;

    public C4233f(boolean[] bufferWithData) {
        AbstractC4862t.e(bufferWithData, "bufferWithData");
        this.f35700a = bufferWithData;
        this.f35701b = bufferWithData.length;
        b(10);
    }

    @Override // ge.AbstractC4248m0
    public void b(int i10) {
        boolean[] zArr = this.f35700a;
        if (zArr.length < i10) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, Bc.k.e(i10, zArr.length * 2));
            AbstractC4862t.d(zArrCopyOf, "copyOf(...)");
            this.f35700a = zArrCopyOf;
        }
    }

    @Override // ge.AbstractC4248m0
    public int d() {
        return this.f35701b;
    }

    public final void e(boolean z10) {
        AbstractC4248m0.c(this, 0, 1, null);
        boolean[] zArr = this.f35700a;
        int iD = d();
        this.f35701b = iD + 1;
        zArr[iD] = z10;
    }

    @Override // ge.AbstractC4248m0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f35700a, d());
        AbstractC4862t.d(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }
}
