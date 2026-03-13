package Ke;

import Ke.a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f7866a;

    public static a.C0125a c(byte[] bArr) {
        return new a.C0125a(bArr);
    }

    public a b() {
        a aVar = this.f7866a;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("origin == null");
    }

    public b d(byte[] bArr) {
        return e(c(bArr));
    }

    public b e(a aVar) {
        this.f7866a = aVar;
        return (b) a();
    }
}
