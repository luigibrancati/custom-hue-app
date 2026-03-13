package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class O implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f22749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f22750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2708n f22752d;

    public O(g0 g0Var, AbstractC2708n abstractC2708n, K k10) {
        this.f22750b = g0Var;
        this.f22751c = abstractC2708n.e(k10);
        this.f22752d = abstractC2708n;
        this.f22749a = k10;
    }

    private int i(g0 g0Var, Object obj) {
        return g0Var.i(g0Var.g(obj));
    }

    private void j(g0 g0Var, AbstractC2708n abstractC2708n, Object obj, Y y10, C2707m c2707m) throws Throwable {
        g0 g0Var2;
        O o10;
        AbstractC2708n abstractC2708n2;
        Y y11;
        C2707m c2707m2;
        Object objF = g0Var.f(obj);
        C2711q c2711qD = abstractC2708n.d(obj);
        while (y10.z() != Integer.MAX_VALUE) {
            try {
                o10 = this;
                g0Var2 = g0Var;
                abstractC2708n2 = abstractC2708n;
                y11 = y10;
                c2707m2 = c2707m;
            } catch (Throwable th) {
                th = th;
                g0Var2 = g0Var;
            }
            try {
                if (!o10.l(y11, c2707m2, abstractC2708n2, c2711qD, g0Var2, objF)) {
                    g0Var2.o(obj, objF);
                    return;
                }
                this = o10;
                y10 = y11;
                c2707m = c2707m2;
                abstractC2708n = abstractC2708n2;
                g0Var = g0Var2;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                g0Var2.o(obj, objF);
                throw th3;
            }
        }
        g0Var.o(obj, objF);
    }

    public static O k(g0 g0Var, AbstractC2708n abstractC2708n, K k10) {
        return new O(g0Var, abstractC2708n, k10);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void a(Object obj, Object obj2) {
        b0.F(this.f22750b, obj, obj2);
        if (this.f22751c) {
            b0.D(this.f22752d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void b(Object obj) {
        this.f22750b.j(obj);
        this.f22752d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final boolean c(Object obj) {
        return this.f22752d.c(obj).m();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int d(Object obj) {
        int i10 = i(this.f22750b, obj);
        return this.f22751c ? i10 + this.f22752d.c(obj).g() : i10;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int e(Object obj) {
        int iHashCode = this.f22750b.g(obj).hashCode();
        return this.f22751c ? (iHashCode * 53) + this.f22752d.c(obj).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public boolean f(Object obj, Object obj2) {
        if (!this.f22750b.g(obj).equals(this.f22750b.g(obj2))) {
            return false;
        }
        if (this.f22751c) {
            return this.f22752d.c(obj).equals(this.f22752d.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void g(Object obj, Y y10, C2707m c2707m) throws Throwable {
        j(this.f22750b, this.f22752d, obj, y10, c2707m);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void h(Object obj, m0 m0Var) {
        Iterator itP = this.f22752d.c(obj).p();
        if (itP.hasNext()) {
            android.support.v4.media.session.a.a(((Map.Entry) itP.next()).getKey());
            throw null;
        }
        m(this.f22750b, obj, m0Var);
    }

    public final boolean l(Y y10, C2707m c2707m, AbstractC2708n abstractC2708n, C2711q c2711q, g0 g0Var, Object obj) throws C2715v {
        int tag = y10.getTag();
        int iG = 0;
        if (tag != l0.f22882a) {
            if (l0.b(tag) != 2) {
                return y10.C();
            }
            Object objB = abstractC2708n.b(c2707m, this.f22749a, l0.a(tag));
            if (objB == null) {
                return g0Var.m(obj, y10, 0);
            }
            abstractC2708n.h(y10, objB, c2707m, c2711q);
            return true;
        }
        Object objB2 = null;
        AbstractC2700f abstractC2700fN = null;
        while (y10.z() != Integer.MAX_VALUE) {
            int tag2 = y10.getTag();
            if (tag2 == l0.f22884c) {
                iG = y10.g();
                objB2 = abstractC2708n.b(c2707m, this.f22749a, iG);
            } else if (tag2 == l0.f22885d) {
                if (objB2 != null) {
                    abstractC2708n.h(y10, objB2, c2707m, c2711q);
                } else {
                    abstractC2700fN = y10.n();
                }
            } else if (!y10.C()) {
                break;
            }
        }
        if (y10.getTag() != l0.f22883b) {
            throw C2715v.b();
        }
        if (abstractC2700fN != null) {
            if (objB2 != null) {
                abstractC2708n.i(abstractC2700fN, objB2, c2707m, c2711q);
            } else {
                g0Var.d(obj, iG, abstractC2700fN);
            }
        }
        return true;
    }

    public final void m(g0 g0Var, Object obj, m0 m0Var) {
        g0Var.s(g0Var.g(obj), m0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public Object newInstance() {
        K k10 = this.f22749a;
        return k10 instanceof AbstractC2713t ? ((AbstractC2713t) k10).F() : k10.newBuilderForType().buildPartial();
    }
}
