package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1.e f23419a = new z1.e();

    public final void a(String key, AutoCloseable closeable) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(closeable, "closeable");
        z1.e eVar = this.f23419a;
        if (eVar != null) {
            eVar.d(key, closeable);
        }
    }

    public final void b() {
        z1.e eVar = this.f23419a;
        if (eVar != null) {
            eVar.e();
        }
        d();
    }

    public final AutoCloseable c(String key) {
        AbstractC4862t.e(key, "key");
        z1.e eVar = this.f23419a;
        if (eVar != null) {
            return eVar.g(key);
        }
        return null;
    }

    public void d() {
    }
}
