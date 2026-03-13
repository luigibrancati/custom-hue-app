package e3;

import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import vc.p;

/* JADX INFO: renamed from: e3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3928b implements d3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3929c f33671a;

    public C3928b(C3929c supportDriver) {
        AbstractC4862t.e(supportDriver, "supportDriver");
        this.f33671a = supportDriver;
    }

    @Override // d3.e
    public Object O0(boolean z10, p pVar, InterfaceC4988e interfaceC4988e) {
        return pVar.invoke(a(), interfaceC4988e);
    }

    public final C3930d a() {
        String databaseName = this.f33671a.b().getDatabaseName();
        if (databaseName == null) {
            databaseName = ":memory:";
        }
        return new C3930d(this.f33671a.a(databaseName));
    }

    public final C3929c b() {
        return this.f33671a;
    }

    @Override // d3.e, java.lang.AutoCloseable
    public void close() {
        this.f33671a.b().close();
    }
}
