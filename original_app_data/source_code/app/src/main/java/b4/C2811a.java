package b4;

import gc.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.T;

/* JADX INFO: renamed from: b4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2811a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0328a f25253a = new C0328a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f25254b = new HashMap();

    /* JADX INFO: renamed from: b4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0328a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f25255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f25256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C0328a f25257c = this;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C0328a f25258d = this;

        public C0328a(Object obj) {
            this.f25255a = obj;
        }

        public final void a(Object obj) {
            List arrayList = this.f25256b;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f25256b = arrayList;
            }
            arrayList.add(obj);
        }

        public final Object b() {
            return this.f25255a;
        }

        public final C0328a c() {
            return this.f25258d;
        }

        public final C0328a d() {
            return this.f25257c;
        }

        public final int e() {
            List list = this.f25256b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public final Object f() {
            List list = this.f25256b;
            if (list == null) {
                return null;
            }
            return y.L(list);
        }

        public final void g(C0328a c0328a) {
            AbstractC4862t.e(c0328a, "<set-?>");
            this.f25258d = c0328a;
        }

        public final void h(C0328a c0328a) {
            AbstractC4862t.e(c0328a, "<set-?>");
            this.f25257c = c0328a;
        }
    }

    public final void a(C0328a c0328a) {
        c0328a.c().h(c0328a);
        c0328a.d().g(c0328a);
    }

    public final void b(C0328a c0328a) {
        e(c0328a);
        c0328a.h(this.f25253a);
        c0328a.g(this.f25253a.c());
        a(c0328a);
    }

    public final void c(C0328a c0328a) {
        e(c0328a);
        c0328a.h(this.f25253a.d());
        c0328a.g(this.f25253a);
        a(c0328a);
    }

    public final void d(Object obj, Object obj2) {
        HashMap map = this.f25254b;
        Object obj3 = map.get(obj);
        Object obj4 = obj3;
        if (obj3 == null) {
            C0328a c0328a = new C0328a(obj);
            c(c0328a);
            map.put(obj, c0328a);
            obj4 = c0328a;
        }
        ((C0328a) obj4).a(obj2);
    }

    public final void e(C0328a c0328a) {
        c0328a.d().g(c0328a.c());
        c0328a.c().h(c0328a.d());
    }

    public final Object f() {
        for (C0328a c0328aD = this.f25253a.d(); !AbstractC4862t.a(c0328aD, this.f25253a); c0328aD = c0328aD.d()) {
            Object objF = c0328aD.f();
            if (objF != null) {
                return objF;
            }
            e(c0328aD);
            HashMap map = this.f25254b;
            Object objB = c0328aD.b();
            if (map == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            }
            T.c(map).remove(objB);
        }
        return null;
    }

    public final Object g(Object obj) {
        HashMap map = this.f25254b;
        Object c0328a = map.get(obj);
        if (c0328a == null) {
            c0328a = new C0328a(obj);
            map.put(obj, c0328a);
        }
        C0328a c0328a2 = (C0328a) c0328a;
        b(c0328a2);
        return c0328a2.f();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LinkedMultimap( ");
        C0328a c0328aC = this.f25253a.c();
        while (!AbstractC4862t.a(c0328aC, this.f25253a)) {
            sb2.append('{');
            sb2.append(c0328aC.b());
            sb2.append(':');
            sb2.append(c0328aC.e());
            sb2.append('}');
            c0328aC = c0328aC.c();
            if (!AbstractC4862t.a(c0328aC, this.f25253a)) {
                sb2.append(", ");
            }
        }
        sb2.append(" )");
        String string = sb2.toString();
        AbstractC4862t.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
