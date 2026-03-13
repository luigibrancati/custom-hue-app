package g8;

import P7.x;
import f8.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4160a f35534a;

    public b(C4160a c4160a) {
        this.f35534a = c4160a;
    }

    public static b a(byte[] bArr, x xVar) {
        if (xVar != null) {
            return new b(C4160a.a(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public static b b(int i10) {
        return new b(C4160a.a(p.a(i10)));
    }

    public int c() {
        return this.f35534a.c();
    }

    public byte[] d(x xVar) {
        if (xVar != null) {
            return this.f35534a.d();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
