package b2;

import G1.t;
import a2.b0;
import b2.InterfaceC2796f;
import i2.C4334n;
import i2.O;

/* JADX INFO: renamed from: b2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2793c implements InterfaceC2796f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f24971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0[] f24972b;

    public C2793c(int[] iArr, b0[] b0VarArr) {
        this.f24971a = iArr;
        this.f24972b = b0VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f24972b.length];
        int i10 = 0;
        while (true) {
            b0[] b0VarArr = this.f24972b;
            if (i10 >= b0VarArr.length) {
                return iArr;
            }
            iArr[i10] = b0VarArr[i10].J();
            i10++;
        }
    }

    public void b(long j10) {
        for (b0 b0Var : this.f24972b) {
            b0Var.c0(j10);
        }
    }

    @Override // b2.InterfaceC2796f.b
    public O f(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f24971a;
            if (i12 >= iArr.length) {
                t.c("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new C4334n();
            }
            if (i11 == iArr[i12]) {
                return this.f24972b[i12];
            }
            i12++;
        }
    }
}
