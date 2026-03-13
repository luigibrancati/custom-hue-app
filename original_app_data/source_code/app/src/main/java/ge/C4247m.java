package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4247m extends AbstractC4248m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f35727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35728b;

    public C4247m(char[] bufferWithData) {
        AbstractC4862t.e(bufferWithData, "bufferWithData");
        this.f35727a = bufferWithData;
        this.f35728b = bufferWithData.length;
        b(10);
    }

    @Override // ge.AbstractC4248m0
    public void b(int i10) {
        char[] cArr = this.f35727a;
        if (cArr.length < i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, Bc.k.e(i10, cArr.length * 2));
            AbstractC4862t.d(cArrCopyOf, "copyOf(...)");
            this.f35727a = cArrCopyOf;
        }
    }

    @Override // ge.AbstractC4248m0
    public int d() {
        return this.f35728b;
    }

    public final void e(char c10) {
        AbstractC4248m0.c(this, 0, 1, null);
        char[] cArr = this.f35727a;
        int iD = d();
        this.f35728b = iD + 1;
        cArr[iD] = c10;
    }

    @Override // ge.AbstractC4248m0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f35727a, d());
        AbstractC4862t.d(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }
}
