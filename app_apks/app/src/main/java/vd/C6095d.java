package vd;

import gc.C4179C;
import gc.C4206t;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: vd.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6095d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f45975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f45976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f45977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f45978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f45979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f45980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f45981j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f45982k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f45983l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f45984m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f45985n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C6095d f45986o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C6095d f45987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C6095d f45988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C6095d f45989r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C6095d f45990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C6095d f45991t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C6095d f45992u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C6095d f45993v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C6095d f45994w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C6095d f45995x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final List f45996y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final List f45997z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f45998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45999b;

    /* JADX INFO: renamed from: vd.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: vd.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0629a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f46000a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f46001b;

            public C0629a(int i10, String name) {
                AbstractC4862t.e(name, "name");
                this.f46000a = i10;
                this.f46001b = name;
            }

            public final int a() {
                return this.f46000a;
            }

            public final String b() {
                return this.f46001b;
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final int b() {
            return C6095d.f45982k;
        }

        public final int c() {
            return C6095d.f45983l;
        }

        public final int d() {
            return C6095d.f45980i;
        }

        public final int e() {
            return C6095d.f45976e;
        }

        public final int f() {
            return C6095d.f45979h;
        }

        public final int g() {
            return C6095d.f45977f;
        }

        public final int h() {
            return C6095d.f45978g;
        }

        public final int i() {
            return C6095d.f45981j;
        }

        public final int j() {
            int i10 = C6095d.f45975d;
            C6095d.f45975d <<= 1;
            return i10;
        }

        public a() {
        }
    }

    static {
        a.C0629a c0629a;
        a.C0629a c0629a2;
        a aVar = new a(null);
        f45974c = aVar;
        f45975d = 1;
        int iJ = aVar.j();
        f45976e = iJ;
        int iJ2 = aVar.j();
        f45977f = iJ2;
        int iJ3 = aVar.j();
        f45978g = iJ3;
        int iJ4 = aVar.j();
        f45979h = iJ4;
        int iJ5 = aVar.j();
        f45980i = iJ5;
        int iJ6 = aVar.j();
        f45981j = iJ6;
        int iJ7 = aVar.j() - 1;
        f45982k = iJ7;
        int i10 = iJ | iJ2 | iJ3;
        f45983l = i10;
        int i11 = iJ2 | iJ5 | iJ6;
        f45984m = i11;
        int i12 = iJ5 | iJ6;
        f45985n = i12;
        int i13 = 2;
        f45986o = new C6095d(iJ7, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f45987p = new C6095d(i12, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f45988q = new C6095d(iJ, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f45989r = new C6095d(iJ2, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f45990s = new C6095d(iJ3, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f45991t = new C6095d(i10, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f45992u = new C6095d(iJ4, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f45993v = new C6095d(iJ5, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f45994w = new C6095d(iJ6, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f45995x = new C6095d(i11, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        Field[] fields = C6095d.class.getFields();
        AbstractC4862t.d(fields, "T::class.java.fields");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            C6095d c6095d = obj instanceof C6095d ? (C6095d) obj : null;
            if (c6095d != null) {
                int i14 = c6095d.f45999b;
                String name = field2.getName();
                AbstractC4862t.d(name, "field.name");
                c0629a2 = new a.C0629a(i14, name);
            } else {
                c0629a2 = null;
            }
            if (c0629a2 != null) {
                arrayList2.add(c0629a2);
            }
        }
        f45996y = arrayList2;
        Field[] fields2 = C6095d.class.getFields();
        AbstractC4862t.d(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (AbstractC4862t.a(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                AbstractC4862t.d(name2, "field.name");
                c0629a = new a.C0629a(iIntValue, name2);
            } else {
                c0629a = null;
            }
            if (c0629a != null) {
                arrayList5.add(c0629a);
            }
        }
        f45997z = arrayList5;
    }

    public C6095d(int i10, List excludes) {
        AbstractC4862t.e(excludes, "excludes");
        this.f45998a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i10 &= ~((AbstractC6094c) it.next()).a();
        }
        this.f45999b = i10;
    }

    public final boolean a(int i10) {
        return (this.f45999b & i10) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC4862t.a(C6095d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC4862t.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C6095d c6095d = (C6095d) obj;
        return AbstractC4862t.a(this.f45998a, c6095d.f45998a) && this.f45999b == c6095d.f45999b;
    }

    public int hashCode() {
        return (this.f45998a.hashCode() * 31) + this.f45999b;
    }

    public final List l() {
        return this.f45998a;
    }

    public final int m() {
        return this.f45999b;
    }

    public final C6095d n(int i10) {
        int i11 = i10 & this.f45999b;
        if (i11 == 0) {
            return null;
        }
        return new C6095d(i11, this.f45998a);
    }

    public String toString() {
        Object next;
        Iterator it = f45996y.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((a.C0629a) next).a() == this.f45999b) {
                break;
            }
        }
        a.C0629a c0629a = (a.C0629a) next;
        String strB = c0629a != null ? c0629a.b() : null;
        if (strB == null) {
            List<a.C0629a> list = f45997z;
            ArrayList arrayList = new ArrayList();
            for (a.C0629a c0629a2 : list) {
                String strB2 = a(c0629a2.a()) ? c0629a2.b() : null;
                if (strB2 != null) {
                    arrayList.add(strB2);
                }
            }
            strB = C4179C.q0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strB + ", " + this.f45998a + ')';
    }

    public /* synthetic */ C6095d(int i10, List list, int i11, AbstractC4854k abstractC4854k) {
        this(i10, (i11 & 2) != 0 ? C4206t.k() : list);
    }
}
