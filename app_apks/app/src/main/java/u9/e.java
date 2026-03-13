package u9;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import w9.F;
import w9.y;
import x9.AbstractC6341m;
import x9.AbstractC6344p;
import x9.C6329a;
import x9.C6330b;
import x9.C6331c;
import x9.C6333e;
import x9.C6337i;
import x9.C6338j;
import x9.C6339k;
import x9.C6340l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final u9.d f45414A = u9.d.f45409d;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f45415B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final u9.c f45416C = u9.b.IDENTITY;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final v f45417D = u.DOUBLE;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final v f45418E = u.LAZILY_PARSED_NUMBER;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final t f45419z = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f45420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f45421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w9.u f45422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C6333e f45423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f45424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w9.v f45425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u9.c f45426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f45427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f45428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f45429j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f45430k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f45431l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u9.d f45432m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f45433n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f45434o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f45435p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f45436q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f45437r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f45438s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f45439t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List f45440u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f45441v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v f45442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v f45443x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List f45444y;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends w {
        public a() {
        }

        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Double c(C9.a aVar) throws IOException {
            if (aVar.C() != C9.b.NULL) {
                return Double.valueOf(aVar.nextDouble());
            }
            aVar.nextNull();
            return null;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.C();
                return;
            }
            double dDoubleValue = number.doubleValue();
            e.d(dDoubleValue);
            cVar.k0(dDoubleValue);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends w {
        public b() {
        }

        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Float c(C9.a aVar) throws IOException {
            if (aVar.C() != C9.b.NULL) {
                return Float.valueOf((float) aVar.nextDouble());
            }
            aVar.nextNull();
            return null;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.C();
                return;
            }
            float fFloatValue = number.floatValue();
            e.d(fFloatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(fFloatValue);
            }
            cVar.x0(number);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Number c(C9.a aVar) throws IOException {
            if (aVar.C() != C9.b.NULL) {
                return Long.valueOf(aVar.nextLong());
            }
            aVar.nextNull();
            return null;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.C();
            } else {
                cVar.C0(number.toString());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w f45447a;

        public d(w wVar) {
            this.f45447a = wVar;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public AtomicLong c(C9.a aVar) {
            return new AtomicLong(((Number) this.f45447a.c(aVar)).longValue());
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, AtomicLong atomicLong) {
            this.f45447a.e(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: renamed from: u9.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0620e extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w f45448a;

        public C0620e(w wVar) {
            this.f45448a = wVar;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray c(C9.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.beginArray();
            while (aVar.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.f45448a.c(aVar)).longValue()));
            }
            aVar.endArray();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.d();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f45448a.e(cVar, Long.valueOf(atomicLongArray.get(i10)));
            }
            cVar.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f extends AbstractC6341m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public w f45449a = null;

        private w g() {
            w wVar = this.f45449a;
            if (wVar != null) {
                return wVar;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // u9.w
        public Object c(C9.a aVar) {
            return g().c(aVar);
        }

        @Override // u9.w
        public void e(C9.c cVar, Object obj) {
            g().e(cVar, obj);
        }

        @Override // x9.AbstractC6341m
        public w f() {
            return g();
        }

        public void h(w wVar) {
            if (this.f45449a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f45449a = wVar;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        w9.v vVar = w9.v.f46425g;
        u9.c cVar = f45416C;
        Map map = Collections.EMPTY_MAP;
        u9.d dVar = f45414A;
        t tVar = f45419z;
        r rVar = r.DEFAULT;
        String str = f45415B;
        List list = Collections.EMPTY_LIST;
        this(vVar, cVar, map, false, false, false, true, dVar, tVar, false, true, rVar, str, 2, 2, list, list, list, f45417D, f45418E, list);
    }

    public static void a(Object obj, C9.a aVar) {
        if (obj != null) {
            try {
                if (aVar.C() == C9.b.END_DOCUMENT) {
                } else {
                    throw new q("JSON document was not fully consumed.");
                }
            } catch (C9.d e10) {
                throw new q(e10);
            } catch (IOException e11) {
                throw new k(e11);
            }
        }
    }

    public static w b(w wVar) {
        return new d(wVar).b();
    }

    public static w c(w wVar) {
        return new C0620e(wVar).b();
    }

    public static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static w n(r rVar) {
        return rVar == r.DEFAULT ? AbstractC6344p.f48068t : new c();
    }

    public final w e(boolean z10) {
        return z10 ? AbstractC6344p.f48070v : new a();
    }

    public final w f(boolean z10) {
        return z10 ? AbstractC6344p.f48069u : new b();
    }

    public Object g(C9.a aVar, B9.a aVar2) {
        boolean z10;
        t tVarI = aVar.i();
        t tVar = this.f45433n;
        if (tVar != null) {
            aVar.K(tVar);
        } else if (aVar.i() == t.LEGACY_STRICT) {
            aVar.K(t.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        aVar.C();
                        z10 = false;
                    } catch (AssertionError e10) {
                        throw new AssertionError("AssertionError (GSON 2.12.0): " + e10.getMessage(), e10);
                    } catch (IllegalStateException e11) {
                        throw new q(e11);
                    }
                } catch (IOException e12) {
                    throw new q(e12);
                }
            } catch (EOFException e13) {
                e = e13;
                z10 = true;
            }
            try {
                return k(aVar2).c(aVar);
            } catch (EOFException e14) {
                e = e14;
                if (!z10) {
                    throw new q(e);
                }
                aVar.K(tVarI);
                return null;
            }
        } finally {
            aVar.K(tVarI);
        }
    }

    public Object h(Reader reader, B9.a aVar) {
        C9.a aVarO = o(reader);
        Object objG = g(aVarO, aVar);
        a(objG, aVarO);
        return objG;
    }

    public Object i(String str, B9.a aVar) {
        if (str == null) {
            return null;
        }
        return h(new StringReader(str), aVar);
    }

    public Object j(String str, Type type) {
        return i(str, B9.a.b(type));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r2.h(r4);
        r0.put(r7, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u9.w k(B9.a r7) {
        /*
            r6 = this;
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap r0 = r6.f45421b
            java.lang.Object r0 = r0.get(r7)
            u9.w r0 = (u9.w) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.ThreadLocal r0 = r6.f45420a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L26
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal r1 = r6.f45420a
            r1.set(r0)
            r1 = 1
            goto L30
        L26:
            java.lang.Object r1 = r0.get(r7)
            u9.w r1 = (u9.w) r1
            if (r1 == 0) goto L2f
            return r1
        L2f:
            r1 = 0
        L30:
            u9.e$f r2 = new u9.e$f     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L58
            java.util.List r3 = r6.f45424e     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L58
            r4 = 0
        L3f:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L5a
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L58
            u9.x r4 = (u9.x) r4     // Catch: java.lang.Throwable -> L58
            u9.w r4 = r4.create(r6, r7)     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L3f
            r2.h(r4)     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r7 = move-exception
            goto L82
        L5a:
            if (r1 == 0) goto L61
            java.lang.ThreadLocal r2 = r6.f45420a
            r2.remove()
        L61:
            if (r4 == 0) goto L6b
            if (r1 == 0) goto L6a
            java.util.concurrent.ConcurrentMap r6 = r6.f45421b
            r6.putAll(r0)
        L6a:
            return r4
        L6b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GSON (2.12.0) cannot handle "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L82:
            if (r1 == 0) goto L89
            java.lang.ThreadLocal r6 = r6.f45420a
            r6.remove()
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.e.k(B9.a):u9.w");
    }

    public w l(Class cls) {
        return k(B9.a.a(cls));
    }

    public w m(x xVar, B9.a aVar) {
        Objects.requireNonNull(xVar, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        if (this.f45423d.d(aVar, xVar)) {
            xVar = this.f45423d;
        }
        boolean z10 = false;
        for (x xVar2 : this.f45424e) {
            if (z10) {
                w wVarCreate = xVar2.create(this, aVar);
                if (wVarCreate != null) {
                    return wVarCreate;
                }
            } else if (xVar2 == xVar) {
                z10 = true;
            }
        }
        if (!z10) {
            return k(aVar);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
    }

    public C9.a o(Reader reader) {
        C9.a aVar = new C9.a(reader);
        t tVar = this.f45433n;
        if (tVar == null) {
            tVar = t.LEGACY_STRICT;
        }
        aVar.K(tVar);
        return aVar;
    }

    public C9.c p(Writer writer) throws IOException {
        if (this.f45430k) {
            writer.write(")]}'\n");
        }
        C9.c cVar = new C9.c(writer);
        cVar.K(this.f45432m);
        cVar.S(this.f45431l);
        t tVar = this.f45433n;
        if (tVar == null) {
            tVar = t.LEGACY_STRICT;
        }
        cVar.a0(tVar);
        cVar.Y(this.f45428i);
        return cVar;
    }

    public String q(Object obj) {
        return obj == null ? s(l.f45471a) : r(obj, obj.getClass());
    }

    public String r(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        u(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public String s(j jVar) {
        StringWriter stringWriter = new StringWriter();
        w(jVar, stringWriter);
        return stringWriter.toString();
    }

    public void t(Object obj, Type type, C9.c cVar) {
        w wVarK = k(B9.a.b(type));
        t tVarK = cVar.k();
        t tVar = this.f45433n;
        if (tVar != null) {
            cVar.a0(tVar);
        } else if (cVar.k() == t.LEGACY_STRICT) {
            cVar.a0(t.LENIENT);
        }
        boolean zM = cVar.m();
        boolean zJ = cVar.j();
        cVar.S(this.f45431l);
        cVar.Y(this.f45428i);
        try {
            try {
                try {
                    wVarK.e(cVar, obj);
                } catch (IOException e10) {
                    throw new k(e10);
                }
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.12.0): " + e11.getMessage(), e11);
            }
        } finally {
            cVar.a0(tVarK);
            cVar.S(zM);
            cVar.Y(zJ);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f45428i + ",factories:" + this.f45424e + ",instanceCreators:" + this.f45422c + "}";
    }

    public void u(Object obj, Type type, Appendable appendable) {
        try {
            t(obj, type, p(F.c(appendable)));
        } catch (IOException e10) {
            throw new k(e10);
        }
    }

    public void v(j jVar, C9.c cVar) {
        t tVarK = cVar.k();
        boolean zM = cVar.m();
        boolean zJ = cVar.j();
        cVar.S(this.f45431l);
        cVar.Y(this.f45428i);
        t tVar = this.f45433n;
        if (tVar != null) {
            cVar.a0(tVar);
        } else if (cVar.k() == t.LEGACY_STRICT) {
            cVar.a0(t.LENIENT);
        }
        try {
            try {
                F.b(jVar, cVar);
            } catch (IOException e10) {
                throw new k(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.12.0): " + e11.getMessage(), e11);
            }
        } finally {
            cVar.a0(tVarK);
            cVar.S(zM);
            cVar.Y(zJ);
        }
    }

    public void w(j jVar, Appendable appendable) {
        try {
            v(jVar, p(F.c(appendable)));
        } catch (IOException e10) {
            throw new k(e10);
        }
    }

    public e(w9.v vVar, u9.c cVar, Map map, boolean z10, boolean z11, boolean z12, boolean z13, u9.d dVar, t tVar, boolean z14, boolean z15, r rVar, String str, int i10, int i11, List list, List list2, List list3, v vVar2, v vVar3, List list4) {
        this.f45420a = new ThreadLocal();
        this.f45421b = new ConcurrentHashMap();
        this.f45425f = vVar;
        this.f45426g = cVar;
        this.f45427h = map;
        w9.u uVar = new w9.u(map, z15, list4);
        this.f45422c = uVar;
        this.f45428i = z10;
        this.f45429j = z11;
        this.f45430k = z12;
        this.f45431l = z13;
        this.f45432m = dVar;
        this.f45433n = tVar;
        this.f45434o = z14;
        this.f45435p = z15;
        this.f45439t = rVar;
        this.f45436q = str;
        this.f45437r = i10;
        this.f45438s = i11;
        this.f45440u = list;
        this.f45441v = list2;
        this.f45442w = vVar2;
        this.f45443x = vVar3;
        this.f45444y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC6344p.f48047W);
        arrayList.add(C6339k.f(vVar2));
        arrayList.add(vVar);
        arrayList.addAll(list3);
        arrayList.add(AbstractC6344p.f48027C);
        arrayList.add(AbstractC6344p.f48061m);
        arrayList.add(AbstractC6344p.f48055g);
        arrayList.add(AbstractC6344p.f48057i);
        arrayList.add(AbstractC6344p.f48059k);
        w wVarN = n(rVar);
        arrayList.add(AbstractC6344p.b(Long.TYPE, Long.class, wVarN));
        arrayList.add(AbstractC6344p.b(Double.TYPE, Double.class, e(z14)));
        arrayList.add(AbstractC6344p.b(Float.TYPE, Float.class, f(z14)));
        arrayList.add(C6338j.f(vVar3));
        arrayList.add(AbstractC6344p.f48063o);
        arrayList.add(AbstractC6344p.f48065q);
        arrayList.add(AbstractC6344p.c(AtomicLong.class, b(wVarN)));
        arrayList.add(AbstractC6344p.c(AtomicLongArray.class, c(wVarN)));
        arrayList.add(AbstractC6344p.f48067s);
        arrayList.add(AbstractC6344p.f48072x);
        arrayList.add(AbstractC6344p.f48029E);
        arrayList.add(AbstractC6344p.f48031G);
        arrayList.add(AbstractC6344p.c(BigDecimal.class, AbstractC6344p.f48074z));
        arrayList.add(AbstractC6344p.c(BigInteger.class, AbstractC6344p.f48025A));
        arrayList.add(AbstractC6344p.c(y.class, AbstractC6344p.f48026B));
        arrayList.add(AbstractC6344p.f48033I);
        arrayList.add(AbstractC6344p.f48035K);
        arrayList.add(AbstractC6344p.f48039O);
        arrayList.add(AbstractC6344p.f48041Q);
        arrayList.add(AbstractC6344p.f48045U);
        arrayList.add(AbstractC6344p.f48037M);
        arrayList.add(AbstractC6344p.f48052d);
        arrayList.add(C6331c.f47943c);
        arrayList.add(AbstractC6344p.f48043S);
        if (A9.d.f255a) {
            arrayList.add(A9.d.f259e);
            arrayList.add(A9.d.f258d);
            arrayList.add(A9.d.f260f);
        }
        arrayList.add(C6329a.f47937c);
        arrayList.add(AbstractC6344p.f48050b);
        arrayList.add(new C6330b(uVar));
        arrayList.add(new C6337i(uVar, z11));
        C6333e c6333e = new C6333e(uVar);
        this.f45423d = c6333e;
        arrayList.add(c6333e);
        arrayList.add(AbstractC6344p.f48048X);
        arrayList.add(new C6340l(uVar, cVar, vVar, c6333e, list4));
        this.f45424e = Collections.unmodifiableList(arrayList);
    }
}
