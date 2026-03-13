package J3;

import Q3.C1877w;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class B implements InterfaceC0917z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0917z f5945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5946c;

    public B(InterfaceC0917z delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.f5945b = delegate;
        this.f5946c = new Object();
    }

    @Override // J3.InterfaceC0917z
    public C0916y a(C1877w id2) {
        C0916y c0916yA;
        AbstractC4862t.e(id2, "id");
        synchronized (this.f5946c) {
            c0916yA = this.f5945b.a(id2);
        }
        return c0916yA;
    }

    @Override // J3.InterfaceC0917z
    public boolean c(C1877w id2) {
        boolean zC;
        AbstractC4862t.e(id2, "id");
        synchronized (this.f5946c) {
            zC = this.f5945b.c(id2);
        }
        return zC;
    }

    @Override // J3.InterfaceC0917z
    public C0916y d(C1877w id2) {
        C0916y c0916yD;
        AbstractC4862t.e(id2, "id");
        synchronized (this.f5946c) {
            c0916yD = this.f5945b.d(id2);
        }
        return c0916yD;
    }

    @Override // J3.InterfaceC0917z
    public List remove(String workSpecId) {
        List listRemove;
        AbstractC4862t.e(workSpecId, "workSpecId");
        synchronized (this.f5946c) {
            listRemove = this.f5945b.remove(workSpecId);
        }
        return listRemove;
    }
}
