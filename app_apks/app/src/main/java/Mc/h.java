package Mc;

import Mc.g;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9438a;

    public h(List annotations) {
        AbstractC4862t.e(annotations, "annotations");
        this.f9438a = annotations;
    }

    @Override // Mc.g
    public boolean K(kd.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // Mc.g
    public boolean isEmpty() {
        return this.f9438a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f9438a.iterator();
    }

    @Override // Mc.g
    public c j(kd.c cVar) {
        return g.b.a(this, cVar);
    }

    public String toString() {
        return this.f9438a.toString();
    }
}
