package K;

import K.P;

/* JADX INFO: renamed from: K.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0963e extends P.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f6605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.d f6606b;

    public C0963e(Q q10, androidx.camera.core.d dVar) {
        if (q10 == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f6605a = q10;
        if (dVar == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f6606b = dVar;
    }

    @Override // K.P.b
    public androidx.camera.core.d a() {
        return this.f6606b;
    }

    @Override // K.P.b
    public Q b() {
        return this.f6605a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof P.b) {
            P.b bVar = (P.b) obj;
            if (this.f6605a.equals(bVar.b()) && this.f6606b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f6606b.hashCode() ^ ((this.f6605a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f6605a + ", imageProxy=" + this.f6606b + "}";
    }
}
