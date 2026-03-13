package L;

import L.InterfaceC1099g0;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: L.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1095e0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8038i = InterfaceC1099g0.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8039j = InterfaceC1099g0.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8040k = InterfaceC1099g0.a.a("camerax.core.captureConfig.resolvedFrameRate", Range.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1099g0 f8042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f8045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k1 f8047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC1133y f8048h;

    /* JADX INFO: renamed from: L.e0$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(s1 s1Var, a aVar);
    }

    public C1095e0(List list, InterfaceC1099g0 interfaceC1099g0, int i10, boolean z10, List list2, boolean z11, k1 k1Var, InterfaceC1133y interfaceC1133y) {
        this.f8041a = list;
        this.f8042b = interfaceC1099g0;
        this.f8043c = i10;
        this.f8045e = Collections.unmodifiableList(list2);
        this.f8046f = z11;
        this.f8047g = k1Var;
        this.f8048h = interfaceC1133y;
        this.f8044d = z10;
    }

    public static C1095e0 b() {
        return new a().h();
    }

    public List c() {
        return this.f8045e;
    }

    public InterfaceC1133y d() {
        return this.f8048h;
    }

    public Range e() {
        Range range = (Range) this.f8042b.c(f8040k, e1.f8057a);
        Objects.requireNonNull(range);
        return range;
    }

    public int f() {
        Object objD = this.f8047g.d("CAPTURE_CONFIG_ID_KEY");
        if (objD == null) {
            return -1;
        }
        return ((Integer) objD).intValue();
    }

    public InterfaceC1099g0 g() {
        return this.f8042b;
    }

    public int h() {
        Integer num = (Integer) this.f8042b.c(s1.f8182H, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public List i() {
        return Collections.unmodifiableList(this.f8041a);
    }

    public k1 j() {
        return this.f8047g;
    }

    public int k() {
        return this.f8043c;
    }

    public int l() {
        Integer num = (Integer) this.f8042b.c(s1.f8183I, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public boolean m() {
        return this.f8046f;
    }

    /* JADX INFO: renamed from: L.e0$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f8049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public L0 f8050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f8052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List f8053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f8054f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public O0 f8055g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public InterfaceC1133y f8056h;

        public a() {
            this.f8049a = new HashSet();
            this.f8050b = M0.g0();
            this.f8051c = -1;
            this.f8052d = false;
            this.f8053e = new ArrayList();
            this.f8054f = false;
            this.f8055g = O0.g();
        }

        public static a i(s1 s1Var) {
            b bVarP = s1Var.P(null);
            if (bVarP != null) {
                a aVar = new a();
                bVarP.a(s1Var, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + s1Var.s(s1Var.toString()));
        }

        public static a j(C1095e0 c1095e0) {
            return new a(c1095e0);
        }

        public void a(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                c((AbstractC1114o) it.next());
            }
        }

        public void b(k1 k1Var) {
            this.f8055g.f(k1Var);
        }

        public void c(AbstractC1114o abstractC1114o) {
            if (this.f8053e.contains(abstractC1114o)) {
                return;
            }
            this.f8053e.add(abstractC1114o);
        }

        public void d(InterfaceC1099g0.a aVar, Object obj) {
            this.f8050b.H(aVar, obj);
        }

        public void e(InterfaceC1099g0 interfaceC1099g0) {
            for (InterfaceC1099g0.a aVar : interfaceC1099g0.b()) {
                Object objC = this.f8050b.c(aVar, null);
                Object objA = interfaceC1099g0.a(aVar);
                if (objC instanceof K0) {
                    ((K0) objC).a(((K0) objA).c());
                } else {
                    if (objA instanceof K0) {
                        objA = ((K0) objA).clone();
                    }
                    this.f8050b.Y(aVar, interfaceC1099g0.f(aVar), objA);
                }
            }
        }

        public void f(AbstractC1109l0 abstractC1109l0) {
            this.f8049a.add(abstractC1109l0);
        }

        public void g(String str, Object obj) {
            this.f8055g.i(str, obj);
        }

        public C1095e0 h() {
            return new C1095e0(new ArrayList(this.f8049a), R0.f0(this.f8050b), this.f8051c, this.f8052d, new ArrayList(this.f8053e), this.f8054f, k1.c(this.f8055g), this.f8056h);
        }

        public Range k() {
            return (Range) this.f8050b.c(C1095e0.f8040k, e1.f8057a);
        }

        public Set l() {
            return this.f8049a;
        }

        public int m() {
            return this.f8051c;
        }

        public void n(InterfaceC1133y interfaceC1133y) {
            this.f8056h = interfaceC1133y;
        }

        public void o(Range range) {
            d(C1095e0.f8040k, range);
        }

        public void p(int i10) {
            this.f8055g.i("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i10));
        }

        public void q(InterfaceC1099g0 interfaceC1099g0) {
            this.f8050b = M0.h0(interfaceC1099g0);
        }

        public void r(boolean z10) {
            this.f8052d = z10;
        }

        public void s(int i10) {
            if (i10 != 0) {
                d(s1.f8182H, Integer.valueOf(i10));
            }
        }

        public void t(int i10) {
            this.f8051c = i10;
        }

        public void u(boolean z10) {
            this.f8054f = z10;
        }

        public void v(int i10) {
            if (i10 != 0) {
                d(s1.f8183I, Integer.valueOf(i10));
            }
        }

        public a(C1095e0 c1095e0) {
            HashSet hashSet = new HashSet();
            this.f8049a = hashSet;
            this.f8050b = M0.g0();
            this.f8051c = -1;
            this.f8052d = false;
            this.f8053e = new ArrayList();
            this.f8054f = false;
            this.f8055g = O0.g();
            hashSet.addAll(c1095e0.f8041a);
            this.f8050b = M0.h0(c1095e0.f8042b);
            this.f8051c = c1095e0.f8043c;
            this.f8053e.addAll(c1095e0.c());
            this.f8054f = c1095e0.m();
            this.f8055g = O0.h(c1095e0.j());
            this.f8052d = c1095e0.f8044d;
        }
    }
}
