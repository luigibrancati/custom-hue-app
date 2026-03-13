package Ad;

import Mc.g;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.M;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Mc.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f328b = {M.g(new E(M.b(a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bd.i f329a;

    public a(Bd.n storageManager, InterfaceC6082a compute) {
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(compute, "compute");
        this.f329a = storageManager.f(compute);
    }

    private final List c() {
        return (List) Bd.m.a(this.f329a, this, f328b[0]);
    }

    @Override // Mc.g
    public boolean K(kd.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // Mc.g
    public boolean isEmpty() {
        return c().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return c().iterator();
    }

    @Override // Mc.g
    public Mc.c j(kd.c cVar) {
        return g.b.a(this, cVar);
    }
}
