package Rc;

import bd.InterfaceC2909a;
import gc.C4206t;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends p implements bd.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kd.c f15099a;

    public w(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        this.f15099a = fqName;
    }

    @Override // bd.InterfaceC2912d
    public boolean D() {
        return false;
    }

    @Override // bd.u
    public Collection F(vc.l nameFilter) {
        AbstractC4862t.e(nameFilter, "nameFilter");
        return C4206t.k();
    }

    @Override // bd.u
    public kd.c e() {
        return this.f15099a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof w) && AbstractC4862t.a(e(), ((w) obj).e());
    }

    public int hashCode() {
        return e().hashCode();
    }

    @Override // bd.InterfaceC2912d
    public InterfaceC2909a j(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        return null;
    }

    public String toString() {
        return w.class.getName() + ": " + e();
    }

    @Override // bd.u
    public Collection u() {
        return C4206t.k();
    }

    @Override // bd.InterfaceC2912d
    public List getAnnotations() {
        return C4206t.k();
    }
}
