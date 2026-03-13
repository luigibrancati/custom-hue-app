package ee;

import fc.AbstractC4040w;
import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4179C;
import gc.C4186J;
import gc.C4204q;
import gc.C4207u;
import gc.Q;
import ge.AbstractC4230d0;
import ge.AbstractC4244k0;
import ge.InterfaceC4245l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements e, InterfaceC4245l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f33952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f33954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f33955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f33956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e[] f33957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List[] f33958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f33959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f33960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e[] f33961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC4028k f33962l;

    public g(String serialName, k kind, int i10, List typeParameters, C3981a builder) {
        AbstractC4862t.e(serialName, "serialName");
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(typeParameters, "typeParameters");
        AbstractC4862t.e(builder, "builder");
        this.f33951a = serialName;
        this.f33952b = kind;
        this.f33953c = i10;
        this.f33954d = builder.c();
        this.f33955e = C4179C.T0(builder.f());
        String[] strArr = (String[]) builder.f().toArray(new String[0]);
        this.f33956f = strArr;
        this.f33957g = AbstractC4230d0.b(builder.e());
        this.f33958h = (List[]) builder.d().toArray(new List[0]);
        this.f33959i = C4179C.O0(builder.g());
        Iterable<C4186J> iterableC1 = C4204q.c1(strArr);
        ArrayList arrayList = new ArrayList(C4207u.v(iterableC1, 10));
        for (C4186J c4186j : iterableC1) {
            arrayList.add(AbstractC4040w.a(c4186j.d(), Integer.valueOf(c4186j.c())));
        }
        this.f33960j = Q.s(arrayList);
        this.f33961k = AbstractC4230d0.b(typeParameters);
        this.f33962l = C4029l.b(new InterfaceC6082a() { // from class: ee.f
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Integer.valueOf(g.l(this.f33950a));
            }
        });
    }

    public static final int l(g gVar) {
        return AbstractC4244k0.b(gVar, gVar.f33961k);
    }

    @Override // ge.InterfaceC4245l
    public Set a() {
        return this.f33955e;
    }

    @Override // ee.e
    public boolean b() {
        return super.b();
    }

    @Override // ee.e
    public int c(String name) {
        AbstractC4862t.e(name, "name");
        Integer num = (Integer) this.f33960j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // ee.e
    public int d() {
        return this.f33953c;
    }

    @Override // ee.e
    public String e(int i10) {
        return this.f33956f[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        e eVar = (e) obj;
        if (!AbstractC4862t.a(i(), eVar.i()) || !Arrays.equals(this.f33961k, ((g) obj).f33961k) || d() != eVar.d()) {
            return false;
        }
        int iD = d();
        for (int i10 = 0; i10 < iD; i10++) {
            if (!AbstractC4862t.a(h(i10).i(), eVar.h(i10).i()) || !AbstractC4862t.a(h(i10).f(), eVar.h(i10).f())) {
                return false;
            }
        }
        return true;
    }

    @Override // ee.e
    public k f() {
        return this.f33952b;
    }

    @Override // ee.e
    public List g(int i10) {
        return this.f33958h[i10];
    }

    @Override // ee.e
    public List getAnnotations() {
        return this.f33954d;
    }

    @Override // ee.e
    public e h(int i10) {
        return this.f33957g[i10];
    }

    public int hashCode() {
        return m();
    }

    @Override // ee.e
    public String i() {
        return this.f33951a;
    }

    @Override // ee.e
    public boolean isInline() {
        return super.isInline();
    }

    @Override // ee.e
    public boolean j(int i10) {
        return this.f33959i[i10];
    }

    public final int m() {
        return ((Number) this.f33962l.getValue()).intValue();
    }

    public String toString() {
        return AbstractC4244k0.c(this);
    }
}
