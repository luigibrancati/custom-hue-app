package qd;

import Cd.E;
import Cd.F;
import Cd.M;
import Cd.a0;
import Cd.e0;
import Cd.k0;
import Cd.m0;
import Cd.u0;
import Lc.G;
import Lc.InterfaceC1180h;
import fc.C4029l;
import fc.C4032o;
import fc.InterfaceC4028k;
import gc.C4179C;
import gc.C4205s;
import gc.C4206t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements e0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f43446f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f43448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f43449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M f43450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4028k f43451e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: qd.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum EnumC0582a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43452a;

            static {
                int[] iArr = new int[EnumC0582a.values().length];
                try {
                    iArr[EnumC0582a.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0582a.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f43452a = iArr;
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final M a(Collection collection, EnumC0582a enumC0582a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                M m10 = (M) it.next();
                next = n.f43446f.c((M) next, m10, enumC0582a);
            }
            return (M) next;
        }

        public final M b(Collection types) {
            AbstractC4862t.e(types, "types");
            return a(types, EnumC0582a.INTERSECTION_TYPE);
        }

        public final M c(M m10, M m11, EnumC0582a enumC0582a) {
            if (m10 != null && m11 != null) {
                e0 e0VarN0 = m10.N0();
                e0 e0VarN02 = m11.N0();
                boolean z10 = e0VarN0 instanceof n;
                if (z10 && (e0VarN02 instanceof n)) {
                    return e((n) e0VarN0, (n) e0VarN02, enumC0582a);
                }
                if (z10) {
                    return d((n) e0VarN0, m11);
                }
                if (e0VarN02 instanceof n) {
                    return d((n) e0VarN02, m10);
                }
            }
            return null;
        }

        public final M d(n nVar, M m10) {
            if (nVar.e().contains(m10)) {
                return m10;
            }
            return null;
        }

        public final M e(n nVar, n nVar2, EnumC0582a enumC0582a) {
            Set setM0;
            int i10 = b.f43452a[enumC0582a.ordinal()];
            if (i10 == 1) {
                setM0 = C4179C.m0(nVar.e(), nVar2.e());
            } else {
                if (i10 != 2) {
                    throw new C4032o();
                }
                setM0 = C4179C.a1(nVar.e(), nVar2.e());
            }
            return F.e(a0.f1311b.h(), new n(nVar.f43447a, nVar.f43448b, setM0, null), false);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            M mP = n.this.n().x().p();
            AbstractC4862t.d(mP, "builtIns.comparable.defaultType");
            List listQ = C4206t.q(m0.f(mP, C4205s.d(new k0(u0.IN_VARIANCE, n.this.f43450d)), null, 2, null));
            if (!n.this.g()) {
                listQ.add(n.this.n().L());
            }
            return listQ;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f43454a = new c();

        public c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(E it) {
            AbstractC4862t.e(it, "it");
            return it.toString();
        }
    }

    public /* synthetic */ n(long j10, G g10, Set set, AbstractC4854k abstractC4854k) {
        this(j10, g10, set);
    }

    private final List f() {
        return (List) this.f43451e.getValue();
    }

    public final Set e() {
        return this.f43449c;
    }

    public final boolean g() {
        Collection collectionA = s.a(this.f43448b);
        if (collectionA != null && collectionA.isEmpty()) {
            return true;
        }
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            if (this.f43449c.contains((E) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // Cd.e0
    public List getParameters() {
        return C4206t.k();
    }

    public final String h() {
        return '[' + C4179C.q0(this.f43449c, ",", null, null, 0, null, c.f43454a, 30, null) + ']';
    }

    @Override // Cd.e0
    public Ic.g n() {
        return this.f43448b.n();
    }

    @Override // Cd.e0
    public Collection o() {
        return f();
    }

    @Override // Cd.e0
    public e0 p(Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // Cd.e0
    public InterfaceC1180h q() {
        return null;
    }

    @Override // Cd.e0
    public boolean r() {
        return false;
    }

    public String toString() {
        return "IntegerLiteralType" + h();
    }

    public n(long j10, G g10, Set set) {
        this.f43450d = F.e(a0.f1311b.h(), this, false);
        this.f43451e = C4029l.b(new b());
        this.f43447a = j10;
        this.f43448b = g10;
        this.f43449c = set;
    }
}
