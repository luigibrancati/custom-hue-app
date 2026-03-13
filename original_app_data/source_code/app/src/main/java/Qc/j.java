package Qc;

import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import yd.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f14271b = new j();

    @Override // yd.r
    public void a(InterfaceC1177e descriptor, List unresolvedSuperClasses) {
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }

    @Override // yd.r
    public void b(InterfaceC1174b descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }
}
