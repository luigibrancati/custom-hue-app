package f8;

import c8.C3080a;
import c8.InterfaceC3082c;
import d8.C3838a;
import d8.C3839b;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m implements InterfaceC3082c {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements InterfaceC3082c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC3082c f34213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC3082c f34214b;

        @Override // c8.InterfaceC3082c
        public byte[] a(byte[] bArr, int i10) {
            return bArr.length <= 64 ? this.f34213a.a(bArr, i10) : this.f34214b.a(bArr, i10);
        }

        public b(InterfaceC3082c interfaceC3082c, InterfaceC3082c interfaceC3082c2) {
            this.f34213a = interfaceC3082c;
            this.f34214b = interfaceC3082c2;
        }
    }

    public static InterfaceC3082c b(C3080a c3080a) {
        InterfaceC3082c interfaceC3082cC = C3838a.c(c3080a);
        try {
            return new b(interfaceC3082cC, C3839b.b(c3080a));
        } catch (GeneralSecurityException unused) {
            return interfaceC3082cC;
        }
    }
}
