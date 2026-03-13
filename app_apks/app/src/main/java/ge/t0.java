package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends AbstractC4248m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f35746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35747b;

    public t0(short[] bufferWithData) {
        AbstractC4862t.e(bufferWithData, "bufferWithData");
        this.f35746a = bufferWithData;
        this.f35747b = bufferWithData.length;
        b(10);
    }

    @Override // ge.AbstractC4248m0
    public void b(int i10) {
        short[] sArr = this.f35746a;
        if (sArr.length < i10) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, Bc.k.e(i10, sArr.length * 2));
            AbstractC4862t.d(sArrCopyOf, "copyOf(...)");
            this.f35746a = sArrCopyOf;
        }
    }

    @Override // ge.AbstractC4248m0
    public int d() {
        return this.f35747b;
    }

    public final void e(short s10) {
        AbstractC4248m0.c(this, 0, 1, null);
        short[] sArr = this.f35746a;
        int iD = d();
        this.f35747b = iD + 1;
        sArr[iD] = s10;
    }

    @Override // ge.AbstractC4248m0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f35746a, d());
        AbstractC4862t.d(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }
}
