package L;

import E.AbstractC0807p0;
import L.a1;
import L.r1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f8167b = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        boolean a(b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a1 f8168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s1 f8169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e1 f8170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f8171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f8172e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f8173f = false;

        public b(a1 a1Var, s1 s1Var, e1 e1Var, List list) {
            this.f8168a = a1Var;
            this.f8169b = s1Var;
            this.f8170c = e1Var;
            this.f8171d = list;
        }

        public boolean a() {
            return this.f8173f;
        }

        public boolean b() {
            return this.f8172e;
        }

        public List c() {
            return this.f8171d;
        }

        public a1 d() {
            return this.f8168a;
        }

        public e1 e() {
            return this.f8170c;
        }

        public s1 f() {
            return this.f8169b;
        }

        public void g(boolean z10) {
            this.f8173f = z10;
        }

        public void h(boolean z10) {
            this.f8172e = z10;
        }

        public String toString() {
            return "UseCaseAttachInfo{mSessionConfig=" + this.f8168a + ", mUseCaseConfig=" + this.f8169b + ", mStreamSpec=" + this.f8170c + ", mCaptureTypes=" + this.f8171d + ", mAttached=" + this.f8172e + ", mActive=" + this.f8173f + '}';
        }
    }

    public r1(String str) {
        this.f8166a = str;
    }

    public static /* synthetic */ boolean a(b bVar) {
        return bVar.a() && bVar.b();
    }

    public a1.h e() {
        a1.h hVar = new a1.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f8167b.entrySet()) {
            b bVar = (b) entry.getValue();
            if (bVar.a() && bVar.b()) {
                String str = (String) entry.getKey();
                hVar.b(bVar.d());
                arrayList.add(str);
            }
        }
        AbstractC0807p0.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f8166a);
        return hVar;
    }

    public Collection f() {
        return Collections.unmodifiableCollection(l(new a() { // from class: L.q1
            @Override // L.r1.a
            public final boolean a(r1.b bVar) {
                return r1.a(bVar);
            }
        }));
    }

    public a1.h g() {
        a1.h hVar = new a1.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f8167b.entrySet()) {
            b bVar = (b) entry.getValue();
            if (bVar.b()) {
                hVar.b(bVar.d());
                arrayList.add((String) entry.getKey());
            }
        }
        AbstractC0807p0.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f8166a);
        return hVar;
    }

    public Collection h() {
        return Collections.unmodifiableCollection(l(new a() { // from class: L.o1
            @Override // L.r1.a
            public final boolean a(r1.b bVar) {
                return bVar.b();
            }
        }));
    }

    public Collection i() {
        return Collections.unmodifiableCollection(m(new a() { // from class: L.p1
            @Override // L.r1.a
            public final boolean a(r1.b bVar) {
                return bVar.b();
            }
        }));
    }

    public Collection j() {
        return Collections.unmodifiableCollection(n(new a() { // from class: L.n1
            @Override // L.r1.a
            public final boolean a(r1.b bVar) {
                return bVar.b();
            }
        }));
    }

    public final b k(String str, a1 a1Var, s1 s1Var, e1 e1Var, List list) {
        b bVar = (b) this.f8167b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(a1Var, s1Var, e1Var, list);
        this.f8167b.put(str, bVar2);
        return bVar2;
    }

    public final Collection l(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f8167b.entrySet()) {
            if (aVar == null || aVar.a((b) entry.getValue())) {
                arrayList.add(((b) entry.getValue()).d());
            }
        }
        return arrayList;
    }

    public final Collection m(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f8167b.entrySet()) {
            if (aVar == null || aVar.a((b) entry.getValue())) {
                arrayList.add(((b) entry.getValue()).f());
            }
        }
        return arrayList;
    }

    public final Collection n(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f8167b.entrySet()) {
            if (aVar == null || aVar.a((b) entry.getValue())) {
                arrayList.add((b) entry.getValue());
            }
        }
        return arrayList;
    }

    public boolean o(String str) {
        if (this.f8167b.containsKey(str)) {
            return ((b) this.f8167b.get(str)).b();
        }
        return false;
    }

    public void p(String str) {
        this.f8167b.remove(str);
    }

    public void q(String str, a1 a1Var, s1 s1Var, e1 e1Var, List list) {
        k(str, a1Var, s1Var, e1Var, list).g(true);
    }

    public void r(String str, a1 a1Var, s1 s1Var, e1 e1Var, List list) {
        k(str, a1Var, s1Var, e1Var, list).h(true);
        u(str, a1Var, s1Var, e1Var, list);
    }

    public void s(String str) {
        if (this.f8167b.containsKey(str)) {
            b bVar = (b) this.f8167b.get(str);
            bVar.h(false);
            if (bVar.a()) {
                return;
            }
            this.f8167b.remove(str);
        }
    }

    public void t(String str) {
        if (this.f8167b.containsKey(str)) {
            b bVar = (b) this.f8167b.get(str);
            bVar.g(false);
            if (bVar.b()) {
                return;
            }
            this.f8167b.remove(str);
        }
    }

    public void u(String str, a1 a1Var, s1 s1Var, e1 e1Var, List list) {
        if (this.f8167b.containsKey(str)) {
            b bVar = new b(a1Var, s1Var, e1Var, list);
            b bVar2 = (b) this.f8167b.get(str);
            bVar.h(bVar2.b());
            bVar.g(bVar2.a());
            this.f8167b.put(str, bVar);
        }
    }
}
