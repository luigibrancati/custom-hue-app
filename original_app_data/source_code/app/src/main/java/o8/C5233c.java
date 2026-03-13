package o8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: o8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5233c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f41244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f41245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f41248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f41249g;

    public static b c(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b d(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static b e(E e10) {
        return new b(e10, new E[0]);
    }

    public static b f(E e10, E... eArr) {
        return new b(e10, eArr);
    }

    public static C5233c l(final Object obj, Class cls) {
        return m(cls).f(new g() { // from class: o8.a
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return C5233c.b(obj, interfaceC5234d);
            }
        }).d();
    }

    public static b m(Class cls) {
        return c(cls).g();
    }

    public static C5233c q(final Object obj, Class cls, Class... clsArr) {
        return d(cls, clsArr).f(new g() { // from class: o8.b
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return C5233c.a(obj, interfaceC5234d);
            }
        }).d();
    }

    public Set g() {
        return this.f41245c;
    }

    public g h() {
        return this.f41248f;
    }

    public String i() {
        return this.f41243a;
    }

    public Set j() {
        return this.f41244b;
    }

    public Set k() {
        return this.f41249g;
    }

    public boolean n() {
        return this.f41246d == 1;
    }

    public boolean o() {
        return this.f41246d == 2;
    }

    public boolean p() {
        return this.f41247e == 0;
    }

    public C5233c r(g gVar) {
        return new C5233c(this.f41243a, this.f41244b, this.f41245c, this.f41246d, this.f41247e, gVar, this.f41249g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f41244b.toArray()) + ">{" + this.f41246d + ", type=" + this.f41247e + ", deps=" + Arrays.toString(this.f41245c.toArray()) + "}";
    }

    /* JADX INFO: renamed from: o8.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f41250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f41251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f41252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f41253d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f41254e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public g f41255f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Set f41256g;

        public b b(q qVar) {
            D.c(qVar, "Null dependency");
            j(qVar.c());
            this.f41252c.add(qVar);
            return this;
        }

        public b c() {
            return i(1);
        }

        public C5233c d() {
            D.d(this.f41255f != null, "Missing required property: factory.");
            return new C5233c(this.f41250a, new HashSet(this.f41251b), new HashSet(this.f41252c), this.f41253d, this.f41254e, this.f41255f, this.f41256g);
        }

        public b e() {
            return i(2);
        }

        public b f(g gVar) {
            this.f41255f = (g) D.c(gVar, "Null factory");
            return this;
        }

        public final b g() {
            this.f41254e = 1;
            return this;
        }

        public b h(String str) {
            this.f41250a = str;
            return this;
        }

        public final b i(int i10) {
            D.d(this.f41253d == 0, "Instantiation type has already been set.");
            this.f41253d = i10;
            return this;
        }

        public final void j(E e10) {
            D.a(!this.f41251b.contains(e10), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b(Class cls, Class... clsArr) {
            this.f41250a = null;
            HashSet hashSet = new HashSet();
            this.f41251b = hashSet;
            this.f41252c = new HashSet();
            this.f41253d = 0;
            this.f41254e = 0;
            this.f41256g = new HashSet();
            D.c(cls, "Null interface");
            hashSet.add(E.b(cls));
            for (Class cls2 : clsArr) {
                D.c(cls2, "Null interface");
                this.f41251b.add(E.b(cls2));
            }
        }

        public b(E e10, E... eArr) {
            this.f41250a = null;
            HashSet hashSet = new HashSet();
            this.f41251b = hashSet;
            this.f41252c = new HashSet();
            this.f41253d = 0;
            this.f41254e = 0;
            this.f41256g = new HashSet();
            D.c(e10, "Null interface");
            hashSet.add(e10);
            for (E e11 : eArr) {
                D.c(e11, "Null interface");
            }
            Collections.addAll(this.f41251b, eArr);
        }
    }

    public C5233c(String str, Set set, Set set2, int i10, int i11, g gVar, Set set3) {
        this.f41243a = str;
        this.f41244b = Collections.unmodifiableSet(set);
        this.f41245c = Collections.unmodifiableSet(set2);
        this.f41246d = i10;
        this.f41247e = i11;
        this.f41248f = gVar;
        this.f41249g = Collections.unmodifiableSet(set3);
    }

    public static /* synthetic */ Object a(Object obj, InterfaceC5234d interfaceC5234d) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, InterfaceC5234d interfaceC5234d) {
        return obj;
    }
}
