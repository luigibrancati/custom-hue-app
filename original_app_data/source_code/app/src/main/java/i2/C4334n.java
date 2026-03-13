package i2;

import D1.InterfaceC0749g;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i2.O;
import java.io.EOFException;

/* JADX INFO: renamed from: i2.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4334n implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f37030a = new byte[RecognitionOptions.AZTEC];

    @Override // i2.O
    public int c(InterfaceC0749g interfaceC0749g, int i10, boolean z10, int i11) throws EOFException {
        int i12 = interfaceC0749g.read(this.f37030a, 0, Math.min(this.f37030a.length, i10));
        if (i12 != -1) {
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // i2.O
    public void g(G1.C c10, int i10, int i11) {
        c10.b0(i10);
    }

    @Override // i2.O
    public void e(D1.o oVar) {
    }

    @Override // i2.O
    public void d(long j10, int i10, int i11, int i12, O.a aVar) {
    }
}
