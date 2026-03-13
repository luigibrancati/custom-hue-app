package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4212A extends AbstractC4248m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f35631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35632b;

    public C4212A(float[] bufferWithData) {
        AbstractC4862t.e(bufferWithData, "bufferWithData");
        this.f35631a = bufferWithData;
        this.f35632b = bufferWithData.length;
        b(10);
    }

    @Override // ge.AbstractC4248m0
    public void b(int i10) {
        float[] fArr = this.f35631a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Bc.k.e(i10, fArr.length * 2));
            AbstractC4862t.d(fArrCopyOf, "copyOf(...)");
            this.f35631a = fArrCopyOf;
        }
    }

    @Override // ge.AbstractC4248m0
    public int d() {
        return this.f35632b;
    }

    public final void e(float f10) {
        AbstractC4248m0.c(this, 0, 1, null);
        float[] fArr = this.f35631a;
        int iD = d();
        this.f35632b = iD + 1;
        fArr[iD] = f10;
    }

    @Override // ge.AbstractC4248m0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f35631a, d());
        AbstractC4862t.d(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }
}
