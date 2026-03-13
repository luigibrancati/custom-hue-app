package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4239i extends AbstractC4248m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f35708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35709b;

    public C4239i(byte[] bufferWithData) {
        AbstractC4862t.e(bufferWithData, "bufferWithData");
        this.f35708a = bufferWithData;
        this.f35709b = bufferWithData.length;
        b(10);
    }

    @Override // ge.AbstractC4248m0
    public void b(int i10) {
        byte[] bArr = this.f35708a;
        if (bArr.length < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, Bc.k.e(i10, bArr.length * 2));
            AbstractC4862t.d(bArrCopyOf, "copyOf(...)");
            this.f35708a = bArrCopyOf;
        }
    }

    @Override // ge.AbstractC4248m0
    public int d() {
        return this.f35709b;
    }

    public final void e(byte b10) {
        AbstractC4248m0.c(this, 0, 1, null);
        byte[] bArr = this.f35708a;
        int iD = d();
        this.f35709b = iD + 1;
        bArr[iD] = b10;
    }

    @Override // ge.AbstractC4248m0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f35708a, d());
        AbstractC4862t.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }
}
