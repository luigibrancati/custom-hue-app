package g0;

import h0.C4266b;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: g0.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4062j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f34799e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f34800f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C4062j f34801g = new C4062j(0, 0, new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4266b f34804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f34805d;

    /* JADX INFO: renamed from: g0.j$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C4062j a() {
            return C4062j.f34801g;
        }

        public a() {
        }
    }

    public C4062j(int i10, int i11, Object[] objArr, C4266b c4266b) {
        this.f34802a = i10;
        this.f34803b = i11;
        this.f34804c = c4266b;
        this.f34805d = objArr;
    }

    public final boolean b(Object obj) {
        Bc.d dVarN = Bc.k.n(Bc.k.p(0, this.f34805d.length), 2);
        int iC = dVarN.c();
        int iD = dVarN.d();
        int iE = dVarN.e();
        if ((iE > 0 && iC <= iD) || (iE < 0 && iD <= iC)) {
            while (!AbstractC4862t.a(obj, this.f34805d[iC])) {
                if (iC != iD) {
                    iC += iE;
                }
            }
            return true;
        }
        return false;
    }

    public final Object c(Object obj) {
        Bc.d dVarN = Bc.k.n(Bc.k.p(0, this.f34805d.length), 2);
        int iC = dVarN.c();
        int iD = dVarN.d();
        int iE = dVarN.e();
        if ((iE <= 0 || iC > iD) && (iE >= 0 || iD > iC)) {
            return null;
        }
        while (!AbstractC4862t.a(obj, k(iC))) {
            if (iC == iD) {
                return null;
            }
            iC += iE;
        }
        return n(iC);
    }

    public final boolean d(int i10, Object obj, int i11) {
        int iA = 1 << n.a(i10, i11);
        if (i(iA)) {
            return AbstractC4862t.a(obj, k(f(iA)));
        }
        if (!j(iA)) {
            return false;
        }
        C4062j c4062jL = l(m(iA));
        return i11 == 30 ? c4062jL.b(obj) : c4062jL.d(i10, obj, i11 + 5);
    }

    public final int e() {
        return Integer.bitCount(this.f34802a);
    }

    public final int f(int i10) {
        return Integer.bitCount(this.f34802a & (i10 - 1)) * 2;
    }

    public final Object g(int i10, Object obj, int i11) {
        int iA = 1 << n.a(i10, i11);
        if (i(iA)) {
            int iF = f(iA);
            if (AbstractC4862t.a(obj, k(iF))) {
                return n(iF);
            }
            return null;
        }
        if (!j(iA)) {
            return null;
        }
        C4062j c4062jL = l(m(iA));
        return i11 == 30 ? c4062jL.c(obj) : c4062jL.g(i10, obj, i11 + 5);
    }

    public final Object[] h() {
        return this.f34805d;
    }

    public final boolean i(int i10) {
        return (this.f34802a & i10) != 0;
    }

    public final boolean j(int i10) {
        return (this.f34803b & i10) != 0;
    }

    public final Object k(int i10) {
        return this.f34805d[i10];
    }

    public final C4062j l(int i10) {
        Object obj = this.f34805d[i10];
        AbstractC4862t.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C4062j) obj;
    }

    public final int m(int i10) {
        return (this.f34805d.length - 1) - Integer.bitCount(this.f34803b & (i10 - 1));
    }

    public final Object n(int i10) {
        return this.f34805d[i10 + 1];
    }

    public C4062j(int i10, int i11, Object[] objArr) {
        this(i10, i11, objArr, null);
    }
}
