package md;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import md.AbstractC5047a;
import md.h;
import md.j;
import md.p;
import md.y;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends AbstractC5047a implements Serializable {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40329a;

        static {
            int[] iArr = new int[y.c.values().length];
            f40329a = iArr;
            try {
                iArr[y.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40329a[y.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b extends AbstractC5047a.AbstractC0530a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC5050d f40330a = AbstractC5050d.f40294a;

        public final AbstractC5050d j() {
            return this.f40330a;
        }

        public abstract b m(i iVar);

        public final b n(AbstractC5050d abstractC5050d) {
            this.f40330a = abstractC5050d;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c extends b implements q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h f40331b = h.g();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f40332c;

        public final h p() {
            this.f40331b.q();
            this.f40332c = false;
            return this.f40331b;
        }

        public final void q() {
            if (this.f40332c) {
                return;
            }
            this.f40331b = this.f40331b.clone();
            this.f40332c = true;
        }

        public final void r(d dVar) {
            q();
            this.f40331b.r(dVar.f40333b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e implements h.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j.b f40338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f40339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final y.b f40340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f40341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f40342e;

        public e(j.b bVar, int i10, y.b bVar2, boolean z10, boolean z11) {
            this.f40338a = bVar;
            this.f40339b = i10;
            this.f40340c = bVar2;
            this.f40341d = z10;
            this.f40342e = z11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return this.f40339b - eVar.f40339b;
        }

        public j.b b() {
            return this.f40338a;
        }

        @Override // md.h.b
        public boolean f() {
            return this.f40341d;
        }

        @Override // md.h.b
        public y.b g() {
            return this.f40340c;
        }

        @Override // md.h.b
        public int getNumber() {
            return this.f40339b;
        }

        @Override // md.h.b
        public boolean h() {
            return this.f40342e;
        }

        @Override // md.h.b
        public y.c k() {
            return this.f40340c.a();
        }

        @Override // md.h.b
        public p.a o(p.a aVar, p pVar) {
            return ((b) aVar).m((i) pVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f40343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f40344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p f40345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e f40346d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Class f40347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Method f40348f;

        public f(p pVar, Object obj, p pVar2, e eVar, Class cls) {
            if (pVar == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eVar.g() == y.b.MESSAGE && pVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f40343a = pVar;
            this.f40344b = obj;
            this.f40345c = pVar2;
            this.f40346d = eVar;
            this.f40347e = cls;
            if (j.a.class.isAssignableFrom(cls)) {
                this.f40348f = i.e(cls, "valueOf", Integer.TYPE);
            } else {
                this.f40348f = null;
            }
        }

        public Object a(Object obj) {
            if (!this.f40346d.f()) {
                return e(obj);
            }
            if (this.f40346d.k() != y.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(e(it.next()));
            }
            return arrayList;
        }

        public p b() {
            return this.f40343a;
        }

        public p c() {
            return this.f40345c;
        }

        public int d() {
            return this.f40346d.getNumber();
        }

        public Object e(Object obj) {
            return this.f40346d.k() == y.c.ENUM ? i.f(this.f40348f, null, (Integer) obj) : obj;
        }

        public Object f(Object obj) {
            return this.f40346d.k() == y.c.ENUM ? Integer.valueOf(((j.a) obj).getNumber()) : obj;
        }
    }

    public i() {
    }

    public static Method e(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(strValueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    public static Object f(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static f h(p pVar, p pVar2, j.b bVar, int i10, y.b bVar2, boolean z10, Class cls) {
        return new f(pVar, Collections.EMPTY_LIST, pVar2, new e(bVar, i10, bVar2, true, z10), cls);
    }

    public static f i(p pVar, Object obj, p pVar2, j.b bVar, int i10, y.b bVar2, Class cls) {
        return new f(pVar, obj, pVar2, new e(bVar, i10, bVar2, false, false), cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean k(md.h r5, md.p r6, md.C5051e r7, md.C5052f r8, md.C5053g r9, int r10) throws md.k {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: md.i.k(md.h, md.p, md.e, md.f, md.g, int):boolean");
    }

    public boolean j(C5051e c5051e, C5052f c5052f, C5053g c5053g, int i10) {
        return c5051e.O(i10, c5052f);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class d extends i implements q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f40333b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator f40334a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Map.Entry f40335b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f40336c;

            public /* synthetic */ a(d dVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(int i10, C5052f c5052f) {
                while (true) {
                    Map.Entry entry = this.f40335b;
                    if (entry == null || ((e) entry.getKey()).getNumber() >= i10) {
                        return;
                    }
                    e eVar = (e) this.f40335b.getKey();
                    if (this.f40336c && eVar.k() == y.c.MESSAGE && !eVar.f()) {
                        c5052f.e0(eVar.getNumber(), (p) this.f40335b.getValue());
                    } else {
                        h.z(eVar, this.f40335b.getValue(), c5052f);
                    }
                    if (this.f40334a.hasNext()) {
                        this.f40335b = (Map.Entry) this.f40334a.next();
                    } else {
                        this.f40335b = null;
                    }
                }
            }

            public a(boolean z10) {
                Iterator itP = d.this.f40333b.p();
                this.f40334a = itP;
                if (itP.hasNext()) {
                    this.f40335b = (Map.Entry) itP.next();
                }
                this.f40336c = z10;
            }
        }

        public d() {
            this.f40333b = h.t();
        }

        @Override // md.i
        public void g() {
            this.f40333b.q();
        }

        @Override // md.i
        public boolean j(C5051e c5051e, C5052f c5052f, C5053g c5053g, int i10) {
            return i.k(this.f40333b, getDefaultInstanceForType(), c5051e, c5052f, c5053g, i10);
        }

        public boolean m() {
            return this.f40333b.n();
        }

        public int n() {
            return this.f40333b.k();
        }

        public final Object o(f fVar) {
            t(fVar);
            Object objH = this.f40333b.h(fVar.f40346d);
            return objH == null ? fVar.f40344b : fVar.a(objH);
        }

        public final Object p(f fVar, int i10) {
            t(fVar);
            return fVar.e(this.f40333b.i(fVar.f40346d, i10));
        }

        public final int q(f fVar) {
            t(fVar);
            return this.f40333b.j(fVar.f40346d);
        }

        public final boolean r(f fVar) {
            t(fVar);
            return this.f40333b.m(fVar.f40346d);
        }

        public a s() {
            return new a(this, false, null);
        }

        public final void t(f fVar) {
            if (fVar.b() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public d(c cVar) {
            this.f40333b = cVar.p();
        }
    }

    public i(b bVar) {
    }

    public void g() {
    }
}
