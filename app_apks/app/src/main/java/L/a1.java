package L;

import E.AbstractC0807p0;
import L.C1095e0;
import L.C1106k;
import L.a1;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List f7979j = Arrays.asList(1, 5, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f7981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f7982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f7983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f7984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f7985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1095e0 f7986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InputConfiguration f7988i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public d f7994f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public InputConfiguration f7995g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public f f7997i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f7989a = new LinkedHashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C1095e0.a f7990b = new C1095e0.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f7991c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f7992d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f7993e = new ArrayList();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7996h = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends a {
        public static b q(s1 s1Var, Size size) {
            e eVarE = s1Var.E(null);
            if (eVarE != null) {
                b bVar = new b();
                eVarE.a(size, s1Var, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + s1Var.s(s1Var.toString()));
        }

        public b a(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AbstractC1114o abstractC1114o = (AbstractC1114o) it.next();
                this.f7990b.c(abstractC1114o);
                if (!this.f7993e.contains(abstractC1114o)) {
                    this.f7993e.add(abstractC1114o);
                }
            }
            return this;
        }

        public b b(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                f((CameraDevice.StateCallback) it.next());
            }
            return this;
        }

        public b c(Collection collection) {
            this.f7990b.a(collection);
            return this;
        }

        public b d(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k((CameraCaptureSession.StateCallback) it.next());
            }
            return this;
        }

        public b e(AbstractC1114o abstractC1114o) {
            this.f7990b.c(abstractC1114o);
            if (!this.f7993e.contains(abstractC1114o)) {
                this.f7993e.add(abstractC1114o);
            }
            return this;
        }

        public b f(CameraDevice.StateCallback stateCallback) {
            if (this.f7991c.contains(stateCallback)) {
                return this;
            }
            this.f7991c.add(stateCallback);
            return this;
        }

        public b g(InterfaceC1099g0 interfaceC1099g0) {
            this.f7990b.e(interfaceC1099g0);
            return this;
        }

        public b h(AbstractC1109l0 abstractC1109l0) {
            return i(abstractC1109l0, E.J.f2794d);
        }

        public b i(AbstractC1109l0 abstractC1109l0, E.J j10) {
            this.f7989a.add(f.a(abstractC1109l0).b(j10).a());
            return this;
        }

        public b j(AbstractC1114o abstractC1114o) {
            this.f7990b.c(abstractC1114o);
            return this;
        }

        public b k(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f7992d.contains(stateCallback)) {
                return this;
            }
            this.f7992d.add(stateCallback);
            return this;
        }

        public b l(AbstractC1109l0 abstractC1109l0) {
            return m(abstractC1109l0, E.J.f2794d);
        }

        public b m(AbstractC1109l0 abstractC1109l0, E.J j10) {
            return n(abstractC1109l0, j10, null, -1);
        }

        public b n(AbstractC1109l0 abstractC1109l0, E.J j10, String str, int i10) {
            this.f7989a.add(f.a(abstractC1109l0).d(str).b(j10).c(i10).a());
            this.f7990b.f(abstractC1109l0);
            return this;
        }

        public b o(String str, Object obj) {
            this.f7990b.g(str, obj);
            return this;
        }

        public a1 p() {
            return new a1(new ArrayList(this.f7989a), new ArrayList(this.f7991c), new ArrayList(this.f7992d), new ArrayList(this.f7993e), this.f7990b.h(), this.f7994f, this.f7995g, this.f7996h, this.f7997i);
        }

        public b r(d dVar) {
            this.f7994f = dVar;
            return this;
        }

        public b s(Range range) {
            this.f7990b.o(range);
            return this;
        }

        public b t(InterfaceC1099g0 interfaceC1099g0) {
            this.f7990b.q(interfaceC1099g0);
            return this;
        }

        public b u(InputConfiguration inputConfiguration) {
            this.f7995g = inputConfiguration;
            return this;
        }

        public b v(AbstractC1109l0 abstractC1109l0) {
            this.f7997i = f.a(abstractC1109l0).a();
            return this;
        }

        public b w(int i10) {
            if (i10 != 0) {
                this.f7990b.s(i10);
            }
            return this;
        }

        public b x(int i10) {
            this.f7996h = i10;
            return this;
        }

        public b y(int i10) {
            this.f7990b.t(i10);
            return this;
        }

        public b z(int i10) {
            if (i10 != 0) {
                this.f7990b.v(i10);
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f7998a = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f7999b;

        public c(d dVar) {
            this.f7999b = dVar;
        }

        @Override // L.a1.d
        public void a(a1 a1Var, g gVar) {
            if (this.f7998a.get()) {
                return;
            }
            this.f7999b.a(a1Var, gVar);
        }

        public void b() {
            this.f7998a.set(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        void a(a1 a1Var, g gVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface e {
        void a(Size size, s1 s1Var, b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class f {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static abstract class a {
            public abstract f a();

            public abstract a b(E.J j10);

            public abstract a c(int i10);

            public abstract a d(String str);

            public abstract a e(List list);

            public abstract a f(int i10);
        }

        public static a a(AbstractC1109l0 abstractC1109l0) {
            return new C1106k.b().g(abstractC1109l0).e(Collections.EMPTY_LIST).d(null).c(-1).f(-1).b(E.J.f2794d);
        }

        public abstract E.J b();

        public abstract int c();

        public abstract String d();

        public abstract List e();

        public abstract AbstractC1109l0 f();

        public abstract int g();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum g {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final S.g f8000j = new S.g();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f8001k = true;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public StringBuilder f8002l = new StringBuilder();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f8003m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public List f8004n = new ArrayList();

        public static /* synthetic */ void a(h hVar, a1 a1Var, g gVar) {
            Iterator it = hVar.f8004n.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(a1Var, gVar);
            }
        }

        public void b(a1 a1Var) {
            C1095e0 c1095e0K = a1Var.k();
            if (c1095e0K.k() != -1) {
                this.f8003m = true;
                this.f7990b.t(a1.f(c1095e0K.k(), this.f7990b.m()));
            }
            g(c1095e0K.e());
            h(c1095e0K.h());
            i(c1095e0K.l());
            this.f7990b.b(a1Var.k().j());
            this.f7991c.addAll(a1Var.c());
            this.f7992d.addAll(a1Var.l());
            this.f7990b.a(a1Var.j());
            this.f7993e.addAll(a1Var.n());
            if (a1Var.d() != null) {
                this.f8004n.add(a1Var.d());
            }
            if (a1Var.h() != null) {
                this.f7995g = a1Var.h();
            }
            this.f7989a.addAll(a1Var.i());
            this.f7990b.l().addAll(c1095e0K.i());
            if (!e().containsAll(this.f7990b.l())) {
                AbstractC0807p0.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f8001k = false;
                this.f8002l.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
            }
            if (a1Var.m() != this.f7996h && a1Var.m() != 0 && this.f7996h != 0) {
                AbstractC0807p0.a("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
                this.f8001k = false;
                this.f8002l.append("Invalid configuration due to that two non-default session types are set");
            } else if (a1Var.m() != 0) {
                this.f7996h = a1Var.m();
            }
            if (a1Var.f7981b != null) {
                if (this.f7997i == a1Var.f7981b || this.f7997i == null) {
                    this.f7997i = a1Var.f7981b;
                } else {
                    AbstractC0807p0.a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.f8001k = false;
                    this.f8002l.append("Invalid configuration due to that two different postview output configs are set");
                }
            }
            this.f7990b.e(c1095e0K.g());
        }

        public a1 c() {
            if (!this.f8001k) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f7989a);
            this.f8000j.c(arrayList);
            if (this.f7996h == 1) {
                new P.g().e(arrayList, this.f7990b);
            }
            return new a1(arrayList, new ArrayList(this.f7991c), new ArrayList(this.f7992d), new ArrayList(this.f7993e), this.f7990b.h(), !this.f8004n.isEmpty() ? new d() { // from class: L.b1
                @Override // L.a1.d
                public final void a(a1 a1Var, a1.g gVar) {
                    a1.h.a(this.f8012a, a1Var, gVar);
                }
            } : null, this.f7995g, this.f7996h, this.f7997i);
        }

        public String d() {
            return !this.f8003m ? "Template is not set" : this.f8002l.toString();
        }

        public final List e() {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.f7989a) {
                arrayList.add(fVar.f());
                Iterator it = fVar.e().iterator();
                while (it.hasNext()) {
                    arrayList.add((AbstractC1109l0) it.next());
                }
            }
            return arrayList;
        }

        public boolean f() {
            return this.f8003m && this.f8001k;
        }

        public final void g(Range range) {
            Range range2 = e1.f8057a;
            if (range.equals(range2)) {
                return;
            }
            if (this.f7990b.k().equals(range2)) {
                this.f7990b.o(range);
                return;
            }
            if (this.f7990b.k().equals(range)) {
                return;
            }
            this.f8001k = false;
            String str = "Different ExpectedFrameRateRange values; current = " + this.f7990b.k() + ", new = " + range;
            AbstractC0807p0.c("ValidatingBuilder", str);
            this.f8002l.append(str);
        }

        public final void h(int i10) {
            if (i10 != 0) {
                this.f7990b.s(i10);
            }
        }

        public final void i(int i10) {
            if (i10 != 0) {
                this.f7990b.v(i10);
            }
        }
    }

    public a1(List list, List list2, List list3, List list4, C1095e0 c1095e0, d dVar, InputConfiguration inputConfiguration, int i10, f fVar) {
        this.f7980a = list;
        this.f7982c = Collections.unmodifiableList(list2);
        this.f7983d = Collections.unmodifiableList(list3);
        this.f7984e = Collections.unmodifiableList(list4);
        this.f7985f = dVar;
        this.f7986g = c1095e0;
        this.f7988i = inputConfiguration;
        this.f7987h = i10;
        this.f7981b = fVar;
    }

    public static a1 b() {
        return new a1(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new C1095e0.a().h(), null, null, 0, null);
    }

    public static int f(int i10, int i11) {
        List list = f7979j;
        return list.indexOf(Integer.valueOf(i10)) >= list.indexOf(Integer.valueOf(i11)) ? i10 : i11;
    }

    public List c() {
        return this.f7982c;
    }

    public d d() {
        return this.f7985f;
    }

    public Range e() {
        return this.f7986g.e();
    }

    public InterfaceC1099g0 g() {
        return this.f7986g.g();
    }

    public InputConfiguration h() {
        return this.f7988i;
    }

    public List i() {
        return this.f7980a;
    }

    public List j() {
        return this.f7986g.c();
    }

    public C1095e0 k() {
        return this.f7986g;
    }

    public List l() {
        return this.f7983d;
    }

    public int m() {
        return this.f7987h;
    }

    public List n() {
        return this.f7984e;
    }

    public List o() {
        ArrayList arrayList = new ArrayList();
        for (f fVar : this.f7980a) {
            arrayList.add(fVar.f());
            Iterator it = fVar.e().iterator();
            while (it.hasNext()) {
                arrayList.add((AbstractC1109l0) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int p() {
        return this.f7986g.k();
    }
}
