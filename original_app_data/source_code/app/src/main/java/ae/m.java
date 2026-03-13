package ae;

import Wd.B;
import java.util.concurrent.atomic.AtomicReferenceArray;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends B {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f21257e;

    public m(long j10, m mVar, int i10) {
        super(j10, mVar, i10);
        this.f21257e = new AtomicReferenceArray(l.f21256f);
    }

    @Override // Wd.B
    public int r() {
        return l.f21256f;
    }

    @Override // Wd.B
    public void s(int i10, Throwable th, InterfaceC4992i interfaceC4992i) {
        v().set(i10, l.f21255e);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f17897c + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.f21257e;
    }
}
