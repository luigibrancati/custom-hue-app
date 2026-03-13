package ge;

import fc.C4010C;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class G0 extends AbstractC4248m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f35650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35651b;

    public /* synthetic */ G0(long[] jArr, AbstractC4854k abstractC4854k) {
        this(jArr);
    }

    @Override // ge.AbstractC4248m0
    public /* bridge */ /* synthetic */ Object a() {
        return C4010C.c(f());
    }

    @Override // ge.AbstractC4248m0
    public void b(int i10) {
        if (C4010C.r(this.f35650a) < i10) {
            long[] jArr = this.f35650a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, Bc.k.e(i10, C4010C.r(jArr) * 2));
            AbstractC4862t.d(jArrCopyOf, "copyOf(...)");
            this.f35650a = C4010C.e(jArrCopyOf);
        }
    }

    @Override // ge.AbstractC4248m0
    public int d() {
        return this.f35651b;
    }

    public final void e(long j10) {
        AbstractC4248m0.c(this, 0, 1, null);
        long[] jArr = this.f35650a;
        int iD = d();
        this.f35651b = iD + 1;
        C4010C.w(jArr, iD, j10);
    }

    public long[] f() {
        long[] jArrCopyOf = Arrays.copyOf(this.f35650a, d());
        AbstractC4862t.d(jArrCopyOf, "copyOf(...)");
        return C4010C.e(jArrCopyOf);
    }

    public G0(long[] bufferWithData) {
        AbstractC4862t.e(bufferWithData, "bufferWithData");
        this.f35650a = bufferWithData;
        this.f35651b = C4010C.r(bufferWithData);
        b(10);
    }
}
