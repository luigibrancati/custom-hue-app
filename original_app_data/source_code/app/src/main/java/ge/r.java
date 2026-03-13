package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends AbstractC4248m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f35738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35739b;

    public r(double[] bufferWithData) {
        AbstractC4862t.e(bufferWithData, "bufferWithData");
        this.f35738a = bufferWithData;
        this.f35739b = bufferWithData.length;
        b(10);
    }

    @Override // ge.AbstractC4248m0
    public void b(int i10) {
        double[] dArr = this.f35738a;
        if (dArr.length < i10) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, Bc.k.e(i10, dArr.length * 2));
            AbstractC4862t.d(dArrCopyOf, "copyOf(...)");
            this.f35738a = dArrCopyOf;
        }
    }

    @Override // ge.AbstractC4248m0
    public int d() {
        return this.f35739b;
    }

    public final void e(double d10) {
        AbstractC4248m0.c(this, 0, 1, null);
        double[] dArr = this.f35738a;
        int iD = d();
        this.f35739b = iD + 1;
        dArr[iD] = d10;
    }

    @Override // ge.AbstractC4248m0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f35738a, d());
        AbstractC4862t.d(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }
}
