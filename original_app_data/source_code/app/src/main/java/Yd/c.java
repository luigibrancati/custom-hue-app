package Yd;

import Rd.I;
import Wd.AbstractC2333m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f20054h = new c();

    public c() {
        super(j.f20066c, j.f20067d, j.f20068e, j.f20064a);
    }

    @Override // Rd.I
    public I C0(int i10, String str) {
        AbstractC2333m.a(i10);
        return i10 >= j.f20066c ? AbstractC2333m.b(this, str) : super.C0(i10, str);
    }

    @Override // Yd.f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // Rd.I
    public String toString() {
        return "Dispatchers.Default";
    }
}
