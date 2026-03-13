package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class O extends AbstractC4248m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f35672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35673b;

    public O(long[] bufferWithData) {
        AbstractC4862t.e(bufferWithData, "bufferWithData");
        this.f35672a = bufferWithData;
        this.f35673b = bufferWithData.length;
        b(10);
    }

    @Override // ge.AbstractC4248m0
    public void b(int i10) {
        long[] jArr = this.f35672a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Bc.k.e(i10, jArr.length * 2));
            AbstractC4862t.d(jArrCopyOf, "copyOf(...)");
            this.f35672a = jArrCopyOf;
        }
    }

    @Override // ge.AbstractC4248m0
    public int d() {
        return this.f35673b;
    }

    public final void e(long j10) {
        AbstractC4248m0.c(this, 0, 1, null);
        long[] jArr = this.f35672a;
        int iD = d();
        this.f35673b = iD + 1;
        jArr[iD] = j10;
    }

    @Override // ge.AbstractC4248m0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f35672a, d());
        AbstractC4862t.d(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }
}
