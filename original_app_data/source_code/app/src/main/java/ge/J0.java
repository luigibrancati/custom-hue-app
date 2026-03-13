package ge;

import fc.C4013F;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class J0 extends AbstractC4248m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f35660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35661b;

    public /* synthetic */ J0(short[] sArr, AbstractC4854k abstractC4854k) {
        this(sArr);
    }

    @Override // ge.AbstractC4248m0
    public /* bridge */ /* synthetic */ Object a() {
        return C4013F.c(f());
    }

    @Override // ge.AbstractC4248m0
    public void b(int i10) {
        if (C4013F.r(this.f35660a) < i10) {
            short[] sArr = this.f35660a;
            short[] sArrCopyOf = Arrays.copyOf(sArr, Bc.k.e(i10, C4013F.r(sArr) * 2));
            AbstractC4862t.d(sArrCopyOf, "copyOf(...)");
            this.f35660a = C4013F.e(sArrCopyOf);
        }
    }

    @Override // ge.AbstractC4248m0
    public int d() {
        return this.f35661b;
    }

    public final void e(short s10) {
        AbstractC4248m0.c(this, 0, 1, null);
        short[] sArr = this.f35660a;
        int iD = d();
        this.f35661b = iD + 1;
        C4013F.w(sArr, iD, s10);
    }

    public short[] f() {
        short[] sArrCopyOf = Arrays.copyOf(this.f35660a, d());
        AbstractC4862t.d(sArrCopyOf, "copyOf(...)");
        return C4013F.e(sArrCopyOf);
    }

    public J0(short[] bufferWithData) {
        AbstractC4862t.e(bufferWithData, "bufferWithData");
        this.f35660a = bufferWithData;
        this.f35661b = C4013F.r(bufferWithData);
        b(10);
    }
}
