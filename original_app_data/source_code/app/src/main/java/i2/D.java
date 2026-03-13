package i2;

import java.io.EOFException;
import w2.h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G1.C f36853a = new G1.C(10);

    public D1.u a(InterfaceC4337q interfaceC4337q, h.a aVar) throws Throwable {
        D1.u uVarE = null;
        int i10 = 0;
        while (true) {
            try {
                interfaceC4337q.s(this.f36853a.f(), 0, 10);
                this.f36853a.a0(0);
                if (this.f36853a.O() != 4801587) {
                    break;
                }
                this.f36853a.b0(3);
                int iK = this.f36853a.K();
                int i11 = iK + 10;
                if (uVarE == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f36853a.f(), 0, bArr, 0, 10);
                    interfaceC4337q.s(bArr, 10, iK);
                    uVarE = new w2.h(aVar).e(bArr, i11);
                } else {
                    interfaceC4337q.o(iK);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        interfaceC4337q.i();
        interfaceC4337q.o(i10);
        return uVarE;
    }
}
