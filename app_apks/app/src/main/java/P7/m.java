package P7;

import P7.m;
import Z7.AbstractC2594d;
import Z7.C2601k;
import Z7.C2603m;
import Z7.G;
import Z7.InterfaceC2599i;
import Z7.M;
import Z7.N;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.AbstractC3661h;
import com.google.crypto.tink.shaded.protobuf.C3669p;
import e8.C3952C;
import e8.C3953D;
import e8.I;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements InterfaceC2599i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2603m f13141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f13142c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13143a;

        static {
            int[] iArr = new int[e8.z.values().length];
            f13143a = iArr;
            try {
                iArr[e8.z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13143a[e8.z.DESTROYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13143a[e8.z.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f13144a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public GeneralSecurityException f13145b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C2603m f13146c = C2603m.f20377b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f13147d = false;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f13148a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public i f13149b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final g f13150c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final v f13151d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public C0168b f13152e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public b f13153f;

            public /* synthetic */ a(v vVar, a aVar) {
                this(vVar);
            }

            public a i() {
                b bVar = this.f13153f;
                if (bVar != null) {
                    bVar.e();
                }
                this.f13148a = true;
                return this;
            }

            public a j() {
                this.f13152e = C0168b.e();
                return this;
            }

            public a(v vVar) {
                this.f13149b = i.f13132b;
                this.f13152e = null;
                this.f13153f = null;
                this.f13150c = null;
                this.f13151d = vVar;
            }
        }

        /* JADX INFO: renamed from: P7.m$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class C0168b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0168b f13154b = new C0168b();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f13155a = 0;

            public static C0168b e() {
                return f13154b;
            }

            public final int d() {
                return this.f13155a;
            }
        }

        public static void d(List list) throws GeneralSecurityException {
            for (int i10 = 0; i10 < list.size() - 1; i10++) {
                if (((a) list.get(i10)).f13152e == C0168b.f13154b && ((a) list.get(i10 + 1)).f13152e != C0168b.f13154b) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
        }

        public static int f(a aVar, Set set) throws GeneralSecurityException {
            if (aVar.f13152e != null) {
                return aVar.f13152e == C0168b.f13154b ? g(set) : aVar.f13152e.d();
            }
            throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
        }

        public static int g(Set set) {
            int iF = 0;
            while (true) {
                if (iF != 0 && !set.contains(Integer.valueOf(iF))) {
                    return iF;
                }
                iF = N.f();
            }
        }

        public b b(a aVar) {
            if (aVar.f13153f != null) {
                throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
            }
            if (aVar.f13148a) {
                e();
            }
            aVar.f13153f = this;
            this.f13144a.add(aVar);
            return this;
        }

        public m c() throws GeneralSecurityException {
            c cVar;
            if (this.f13145b != null) {
                throw new GeneralSecurityException("Cannot build keyset due to error in original", this.f13145b);
            }
            if (this.f13147d) {
                throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
            }
            this.f13147d = true;
            ArrayList arrayList = new ArrayList(this.f13144a.size());
            d(this.f13144a);
            HashSet hashSet = new HashSet();
            a aVar = null;
            Integer numValueOf = null;
            for (a aVar2 : this.f13144a) {
                if (aVar2.f13149b == null) {
                    throw new GeneralSecurityException("Key Status not set.");
                }
                int iF = f(aVar2, hashSet);
                if (hashSet.contains(Integer.valueOf(iF))) {
                    throw new GeneralSecurityException("Id " + iF + " is used twice in the keyset");
                }
                hashSet.add(Integer.valueOf(iF));
                if (aVar2.f13150c != null) {
                    m.I(aVar2.f13150c, iF);
                    cVar = new c(aVar2.f13150c, m.E(aVar2.f13149b), iF, aVar2.f13148a, false, c.f13156h, null);
                } else {
                    cVar = new c(Z7.q.f().c(aVar2.f13151d, aVar2.f13151d.a() ? Integer.valueOf(iF) : null), m.E(aVar2.f13149b), iF, aVar2.f13148a, false, c.f13156h, null);
                }
                if (aVar2.f13148a) {
                    if (numValueOf != null) {
                        throw new GeneralSecurityException("Two primaries were set");
                    }
                    numValueOf = Integer.valueOf(iF);
                    if (aVar2.f13149b != i.f13132b) {
                        throw new GeneralSecurityException("Primary key is not enabled");
                    }
                }
                arrayList.add(cVar);
            }
            if (numValueOf != null) {
                return m.h(new m(arrayList, this.f13146c, aVar));
            }
            throw new GeneralSecurityException("No primary was set");
        }

        public final void e() {
            Iterator it = this.f13144a.iterator();
            while (it.hasNext()) {
                ((a) it.next()).f13148a = false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements InterfaceC2599i.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f13156h = new a() { // from class: P7.n
            @Override // P7.m.c.a
            public final void a(m.c cVar) {
                m.c.a(cVar);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f13157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e8.z f13158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i f13159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f13160d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f13161e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f13162f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final a f13163g;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public interface a {
            void a(c cVar);
        }

        public /* synthetic */ c(g gVar, e8.z zVar, int i10, boolean z10, boolean z11, a aVar, a aVar2) {
            this(gVar, zVar, i10, z10, z11, aVar);
        }

        @Override // Z7.InterfaceC2599i.a
        public int getId() {
            return this.f13160d;
        }

        @Override // Z7.InterfaceC2599i.a
        public g getKey() {
            this.f13163g.a(this);
            return this.f13157a;
        }

        @Override // Z7.InterfaceC2599i.a
        public i getStatus() {
            return this.f13159c;
        }

        public boolean h() {
            return this.f13161e;
        }

        public c(g gVar, e8.z zVar, int i10, boolean z10, boolean z11, a aVar) {
            this.f13157a = gVar;
            this.f13158b = zVar;
            this.f13159c = m.C(zVar);
            this.f13160d = i10;
            this.f13161e = z10;
            this.f13162f = z11;
            this.f13163g = aVar;
        }

        public static /* synthetic */ void a(c cVar) {
        }
    }

    public /* synthetic */ m(List list, C2603m c2603m, a aVar) {
        this(list, c2603m);
    }

    public static boolean A(e8.z zVar) {
        int i10 = a.f13143a[zVar.ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    public static b B() {
        return new b();
    }

    public static i C(e8.z zVar) {
        int i10 = a.f13143a[zVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i.f13133c : i.f13134d : i.f13132b;
    }

    public static final m D(p pVar, P7.a aVar, byte[] bArr) throws GeneralSecurityException {
        e8.t tVarA = pVar.a();
        i(tVarA);
        return o(l(tVarA, aVar, bArr));
    }

    public static e8.z E(i iVar) {
        if (i.f13132b.equals(iVar)) {
            return e8.z.ENABLED;
        }
        if (i.f13133c.equals(iVar)) {
            return e8.z.DISABLED;
        }
        if (i.f13134d.equals(iVar)) {
            return e8.z.DESTROYED;
        }
        throw new IllegalStateException("Unknown key status");
    }

    public static g F(C3952C.c cVar) {
        return Z7.x.c().g(H(cVar), f.a());
    }

    public static C3952C.c G(int i10, e8.z zVar, G g10) {
        return (C3952C.c) C3952C.c.Y().t(e8.y.W().u(g10.f()).v(g10.g()).t(g10.d())).w(zVar).u(i10).v(g10.e()).i();
    }

    public static G H(C3952C.c cVar) {
        return G.b(cVar.T().U(), cVar.T().V(), cVar.T().T(), cVar.V(), cVar.V() == I.RAW ? null : Integer.valueOf(cVar.U()));
    }

    public static void I(g gVar, int i10) throws GeneralSecurityException {
        Integer numA = gVar.a();
        if (numA != null && numA.intValue() != i10) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
    }

    public static void J(List list) throws GeneralSecurityException {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (hashSet.contains(Integer.valueOf(cVar.getId()))) {
                throw new GeneralSecurityException("KeyID " + cVar.getId() + " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
            hashSet.add(Integer.valueOf(cVar.getId()));
            if (cVar.h()) {
                z10 = true;
            }
        }
        if (!z10) {
            throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
        }
    }

    public static m h(final m mVar) {
        final C2603m c2603m = mVar.f13141b;
        if (c2603m.a()) {
            return mVar;
        }
        c.a aVar = new c.a() { // from class: P7.l
            @Override // P7.m.c.a
            public final void a(m.c cVar) {
                Z7.s.b().a().a(this.f13138a, c2603m, "keyset_handle", "get_key").b(cVar.getId());
            }
        };
        ArrayList arrayList = new ArrayList(mVar.f13140a.size());
        for (c cVar : mVar.f13140a) {
            arrayList.add(new c(cVar.f13157a, cVar.f13158b, cVar.f13160d, cVar.f13161e, cVar.f13162f, aVar, null));
        }
        return new m(arrayList, c2603m, mVar);
    }

    public static void i(e8.t tVar) throws GeneralSecurityException {
        if (tVar == null || tVar.R().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void j(C3952C c3952c) throws GeneralSecurityException {
        if (c3952c == null || c3952c.U() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static C3952C.c k(g gVar, e8.z zVar, int i10) throws GeneralSecurityException {
        G g10 = (G) Z7.x.c().n(gVar, G.class, f.a());
        I(gVar, i10);
        return G(i10, zVar, g10);
    }

    public static C3952C l(e8.t tVar, P7.a aVar, byte[] bArr) throws GeneralSecurityException {
        try {
            C3952C c3952cZ = C3952C.Z(aVar.b(tVar.R().y(), bArr), C3669p.b());
            j(c3952cZ);
            return c3952cZ;
        } catch (A unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static e8.t m(C3952C c3952c, P7.a aVar, byte[] bArr) {
        return (e8.t) e8.t.S().t(AbstractC3661h.h(aVar.a(c3952c.g(), bArr))).u(z.b(c3952c)).i();
    }

    public static final m o(C3952C c3952c) throws GeneralSecurityException {
        j(c3952c);
        return new m(t(c3952c), C2603m.f20377b);
    }

    public static b.a p(v vVar) {
        return new b.a(vVar, null);
    }

    public static final m q(j jVar) {
        return r(jVar.d());
    }

    public static final m r(v vVar) {
        return B().b(p(vVar).j().i()).c();
    }

    public static List t(C3952C c3952c) throws GeneralSecurityException {
        g c2601k;
        boolean z10;
        ArrayList arrayList = new ArrayList(c3952c.U());
        for (C3952C.c cVar : c3952c.V()) {
            int iU = cVar.U();
            try {
                c2601k = F(cVar);
                z10 = false;
            } catch (GeneralSecurityException e10) {
                if (T7.a.f16256a.getValue()) {
                    throw e10;
                }
                c2601k = new C2601k(H(cVar), f.a());
                z10 = true;
            }
            if (T7.a.f16256a.getValue() && !A(cVar.W())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            arrayList.add(new c(c2601k, cVar.W(), iU, iU == c3952c.W(), z10, c.f13156h, null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void K(q qVar, P7.a aVar, byte[] bArr) {
        qVar.b(m(u(), aVar, bArr));
    }

    public final c n(int i10) {
        c cVar = (c) this.f13140a.get(i10);
        if (!A(cVar.f13158b)) {
            throw new IllegalStateException("Keyset-Entry at position " + i10 + " has wrong status");
        }
        if (!cVar.f13162f) {
            return (c) this.f13140a.get(i10);
        }
        throw new IllegalStateException("Keyset-Entry at position " + i10 + " didn't parse correctly");
    }

    @Override // Z7.InterfaceC2599i
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public c a(int i10) {
        if (i10 >= 0 && i10 < size()) {
            return n(i10);
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + " for keyset of size " + size());
    }

    @Override // Z7.InterfaceC2599i
    public int size() {
        return this.f13140a.size();
    }

    public String toString() {
        return v().toString();
    }

    public C3952C u() {
        try {
            C3952C.b bVarX = C3952C.X();
            for (c cVar : this.f13140a) {
                bVarX.t(k(cVar.getKey(), cVar.f13158b, cVar.getId()));
                if (cVar.h()) {
                    bVarX.u(cVar.getId());
                }
            }
            return (C3952C) bVarX.i();
        } catch (GeneralSecurityException e10) {
            throw new M(e10);
        }
    }

    public C3953D v() {
        return z.b(u());
    }

    @Override // Z7.InterfaceC2599i
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public c b() {
        for (c cVar : this.f13140a) {
            if (cVar != null && cVar.h()) {
                if (cVar.getStatus() == i.f13132b) {
                    return cVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public Object x(d dVar, Class cls) throws GeneralSecurityException {
        if (dVar instanceof AbstractC2594d) {
            return y((AbstractC2594d) dVar, cls);
        }
        throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
    }

    public final Object y(AbstractC2594d abstractC2594d, Class cls) throws GeneralSecurityException {
        C3952C c3952cU = z().u();
        z.d(c3952cU);
        for (int i10 = 0; i10 < size(); i10++) {
            if (((c) this.f13140a.get(i10)).f13162f || !A(((c) this.f13140a.get(i10)).f13158b)) {
                throw new GeneralSecurityException("Key parsing of key with index " + i10 + " and type_url " + c3952cU.T(i10).T().U() + " failed, unable to get primitive");
            }
        }
        return abstractC2594d.a(z(), this.f13141b, cls);
    }

    public final m z() {
        m mVar = this.f13142c;
        return mVar == null ? this : mVar;
    }

    public m(List list, C2603m c2603m) throws GeneralSecurityException {
        this.f13140a = list;
        this.f13141b = c2603m;
        if (T7.a.f16256a.getValue()) {
            J(list);
        }
        this.f13142c = null;
    }

    public m(List list, C2603m c2603m, m mVar) {
        this.f13140a = list;
        this.f13141b = c2603m;
        this.f13142c = mVar;
    }
}
