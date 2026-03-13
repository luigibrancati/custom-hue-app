package vd;

import Lc.InterfaceC1180h;
import Lc.InterfaceC1181i;
import gc.C4204q;
import gc.C4206t;
import gc.U;
import gc.y;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vd.InterfaceC6099h;

/* JADX INFO: renamed from: vd.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6093b implements InterfaceC6099h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f45968d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC6099h[] f45970c;

    /* JADX INFO: renamed from: vd.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final InterfaceC6099h a(String debugName, Iterable scopes) {
            AbstractC4862t.e(debugName, "debugName");
            AbstractC4862t.e(scopes, "scopes");
            Md.e eVar = new Md.e();
            Iterator it = scopes.iterator();
            while (it.hasNext()) {
                InterfaceC6099h interfaceC6099h = (InterfaceC6099h) it.next();
                if (interfaceC6099h != InterfaceC6099h.b.f46015b) {
                    if (interfaceC6099h instanceof C6093b) {
                        y.D(eVar, ((C6093b) interfaceC6099h).f45970c);
                    } else {
                        eVar.add(interfaceC6099h);
                    }
                }
            }
            return b(debugName, eVar);
        }

        public final InterfaceC6099h b(String debugName, List scopes) {
            AbstractC4862t.e(debugName, "debugName");
            AbstractC4862t.e(scopes, "scopes");
            int size = scopes.size();
            return size != 0 ? size != 1 ? new C6093b(debugName, (InterfaceC6099h[]) scopes.toArray(new InterfaceC6099h[0]), null) : (InterfaceC6099h) scopes.get(0) : InterfaceC6099h.b.f46015b;
        }

        public a() {
        }
    }

    public /* synthetic */ C6093b(String str, InterfaceC6099h[] interfaceC6099hArr, AbstractC4854k abstractC4854k) {
        this(str, interfaceC6099hArr);
    }

    @Override // vd.InterfaceC6099h
    public Collection a(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        InterfaceC6099h[] interfaceC6099hArr = this.f45970c;
        int length = interfaceC6099hArr.length;
        if (length == 0) {
            return C4206t.k();
        }
        if (length == 1) {
            return interfaceC6099hArr[0].a(name, location);
        }
        Collection collectionA = null;
        for (InterfaceC6099h interfaceC6099h : interfaceC6099hArr) {
            collectionA = Ld.a.a(collectionA, interfaceC6099h.a(name, location));
        }
        return collectionA == null ? U.d() : collectionA;
    }

    @Override // vd.InterfaceC6099h
    public Set b() {
        InterfaceC6099h[] interfaceC6099hArr = this.f45970c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC6099h interfaceC6099h : interfaceC6099hArr) {
            y.C(linkedHashSet, interfaceC6099h.b());
        }
        return linkedHashSet;
    }

    @Override // vd.InterfaceC6099h
    public Collection c(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        InterfaceC6099h[] interfaceC6099hArr = this.f45970c;
        int length = interfaceC6099hArr.length;
        if (length == 0) {
            return C4206t.k();
        }
        if (length == 1) {
            return interfaceC6099hArr[0].c(name, location);
        }
        Collection collectionA = null;
        for (InterfaceC6099h interfaceC6099h : interfaceC6099hArr) {
            collectionA = Ld.a.a(collectionA, interfaceC6099h.c(name, location));
        }
        return collectionA == null ? U.d() : collectionA;
    }

    @Override // vd.InterfaceC6099h
    public Set d() {
        InterfaceC6099h[] interfaceC6099hArr = this.f45970c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC6099h interfaceC6099h : interfaceC6099hArr) {
            y.C(linkedHashSet, interfaceC6099h.d());
        }
        return linkedHashSet;
    }

    @Override // vd.InterfaceC6102k
    public InterfaceC1180h e(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        InterfaceC1180h interfaceC1180h = null;
        for (InterfaceC6099h interfaceC6099h : this.f45970c) {
            InterfaceC1180h interfaceC1180hE = interfaceC6099h.e(name, location);
            if (interfaceC1180hE != null) {
                if (!(interfaceC1180hE instanceof InterfaceC1181i) || !((InterfaceC1181i) interfaceC1180hE).k0()) {
                    return interfaceC1180hE;
                }
                if (interfaceC1180h == null) {
                    interfaceC1180h = interfaceC1180hE;
                }
            }
        }
        return interfaceC1180h;
    }

    @Override // vd.InterfaceC6102k
    public Collection f(C6095d kindFilter, vc.l nameFilter) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        AbstractC4862t.e(nameFilter, "nameFilter");
        InterfaceC6099h[] interfaceC6099hArr = this.f45970c;
        int length = interfaceC6099hArr.length;
        if (length == 0) {
            return C4206t.k();
        }
        if (length == 1) {
            return interfaceC6099hArr[0].f(kindFilter, nameFilter);
        }
        Collection collectionA = null;
        for (InterfaceC6099h interfaceC6099h : interfaceC6099hArr) {
            collectionA = Ld.a.a(collectionA, interfaceC6099h.f(kindFilter, nameFilter));
        }
        return collectionA == null ? U.d() : collectionA;
    }

    @Override // vd.InterfaceC6099h
    public Set g() {
        return AbstractC6101j.a(C4204q.I(this.f45970c));
    }

    public String toString() {
        return this.f45969b;
    }

    public C6093b(String str, InterfaceC6099h[] interfaceC6099hArr) {
        this.f45969b = str;
        this.f45970c = interfaceC6099hArr;
    }
}
