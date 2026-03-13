package e3;

import java.io.IOException;
import k3.InterfaceC4792b;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4877c;

/* JADX INFO: renamed from: e3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3927a implements InterfaceC4792b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4877c f33670a;

    public C3927a(InterfaceC4877c db2) {
        AbstractC4862t.e(db2, "db");
        this.f33670a = db2;
    }

    public final InterfaceC4877c a() {
        return this.f33670a;
    }

    @Override // k3.InterfaceC4792b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC3931e a1(String sql) {
        AbstractC4862t.e(sql, "sql");
        return AbstractC3931e.f33682d.a(this.f33670a, sql);
    }

    @Override // k3.InterfaceC4792b, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f33670a.close();
    }
}
