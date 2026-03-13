package ge;

import ee.l;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import gc.C4206t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: ge.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4240i0 implements ee.e, InterfaceC4245l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4215D f35711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f35714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List[] f35715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f35716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f35717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f35718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC4028k f35719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC4028k f35720k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC4028k f35721l;

    public C4240i0(String serialName, InterfaceC4215D interfaceC4215D, int i10) {
        AbstractC4862t.e(serialName, "serialName");
        this.f35710a = serialName;
        this.f35711b = interfaceC4215D;
        this.f35712c = i10;
        this.f35713d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f35714e = strArr;
        int i12 = this.f35712c;
        this.f35715f = new List[i12];
        this.f35717h = new boolean[i12];
        this.f35718i = gc.Q.i();
        EnumC4031n enumC4031n = EnumC4031n.PUBLICATION;
        this.f35719j = C4029l.a(enumC4031n, new InterfaceC6082a() { // from class: ge.f0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C4240i0.r(this.f35702a);
            }
        });
        this.f35720k = C4029l.a(enumC4031n, new InterfaceC6082a() { // from class: ge.g0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C4240i0.v(this.f35704a);
            }
        });
        this.f35721l = C4029l.a(enumC4031n, new InterfaceC6082a() { // from class: ge.h0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Integer.valueOf(C4240i0.n(this.f35707a));
            }
        });
    }

    public static final int n(C4240i0 c4240i0) {
        return AbstractC4244k0.b(c4240i0, c4240i0.t());
    }

    public static /* synthetic */ void p(C4240i0 c4240i0, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        c4240i0.o(str, z10);
    }

    public static final ce.b[] r(C4240i0 c4240i0) {
        ce.b[] bVarArrChildSerializers;
        InterfaceC4215D interfaceC4215D = c4240i0.f35711b;
        return (interfaceC4215D == null || (bVarArrChildSerializers = interfaceC4215D.childSerializers()) == null) ? AbstractC4246l0.f35726a : bVarArrChildSerializers;
    }

    private final int u() {
        return ((Number) this.f35721l.getValue()).intValue();
    }

    public static final ee.e[] v(C4240i0 c4240i0) {
        ArrayList arrayList;
        ce.b[] bVarArrA;
        InterfaceC4215D interfaceC4215D = c4240i0.f35711b;
        if (interfaceC4215D == null || (bVarArrA = interfaceC4215D.a()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(bVarArrA.length);
            for (ce.b bVar : bVarArrA) {
                arrayList.add(bVar.getDescriptor());
            }
        }
        return AbstractC4230d0.b(arrayList);
    }

    @Override // ge.InterfaceC4245l
    public Set a() {
        return this.f35718i.keySet();
    }

    @Override // ee.e
    public boolean b() {
        return super.b();
    }

    @Override // ee.e
    public int c(String name) {
        AbstractC4862t.e(name, "name");
        Integer num = (Integer) this.f35718i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // ee.e
    public final int d() {
        return this.f35712c;
    }

    @Override // ee.e
    public String e(int i10) {
        return this.f35714e[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4240i0)) {
            return false;
        }
        ee.e eVar = (ee.e) obj;
        if (!AbstractC4862t.a(i(), eVar.i()) || !Arrays.equals(t(), ((C4240i0) obj).t()) || d() != eVar.d()) {
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
    public ee.k f() {
        return l.a.f33971a;
    }

    @Override // ee.e
    public List g(int i10) {
        List list = this.f35715f[i10];
        return list == null ? C4206t.k() : list;
    }

    @Override // ee.e
    public List getAnnotations() {
        List list = this.f35716g;
        return list == null ? C4206t.k() : list;
    }

    @Override // ee.e
    public ee.e h(int i10) {
        return s()[i10].getDescriptor();
    }

    public int hashCode() {
        return u();
    }

    @Override // ee.e
    public String i() {
        return this.f35710a;
    }

    @Override // ee.e
    public boolean isInline() {
        return super.isInline();
    }

    @Override // ee.e
    public boolean j(int i10) {
        return this.f35717h[i10];
    }

    public final void o(String name, boolean z10) {
        AbstractC4862t.e(name, "name");
        String[] strArr = this.f35714e;
        int i10 = this.f35713d + 1;
        this.f35713d = i10;
        strArr[i10] = name;
        this.f35717h[i10] = z10;
        this.f35715f[i10] = null;
        if (i10 == this.f35712c - 1) {
            this.f35718i = q();
        }
    }

    public final Map q() {
        HashMap map = new HashMap();
        int length = this.f35714e.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(this.f35714e[i10], Integer.valueOf(i10));
        }
        return map;
    }

    public final ce.b[] s() {
        return (ce.b[]) this.f35719j.getValue();
    }

    public final ee.e[] t() {
        return (ee.e[]) this.f35720k.getValue();
    }

    public String toString() {
        return AbstractC4244k0.c(this);
    }

    public /* synthetic */ C4240i0(String str, InterfaceC4215D interfaceC4215D, int i10, int i11, AbstractC4854k abstractC4854k) {
        this(str, (i11 & 2) != 0 ? null : interfaceC4215D, i10);
    }
}
