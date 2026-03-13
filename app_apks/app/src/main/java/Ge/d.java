package Ge;

import Fe.A;
import Fe.C0843e;
import Fe.C0846h;
import gc.C4179C;
import gc.y;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0846h f4731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0846h f4732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0846h f4733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0846h f4734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0846h f4735e;

    static {
        C0846h.a aVar = C0846h.f4117d;
        f4731a = aVar.d("/");
        f4732b = aVar.d("\\");
        f4733c = aVar.d("/\\");
        f4734d = aVar.d(".");
        f4735e = aVar.d("..");
    }

    public static final A j(A a10, A child, boolean z10) {
        AbstractC4862t.e(a10, "<this>");
        AbstractC4862t.e(child, "child");
        if (child.isAbsolute() || child.A() != null) {
            return child;
        }
        C0846h c0846hM = m(a10);
        if (c0846hM == null && (c0846hM = m(child)) == null) {
            c0846hM = s(A.f4049c);
        }
        C0843e c0843e = new C0843e();
        c0843e.U(a10.b());
        if (c0843e.size() > 0) {
            c0843e.U(c0846hM);
        }
        c0843e.U(child.b());
        return q(c0843e, z10);
    }

    public static final A k(String str, boolean z10) {
        AbstractC4862t.e(str, "<this>");
        return q(new C0843e().T(str), z10);
    }

    public static final int l(A a10) {
        int iF = C0846h.F(a10.b(), f4731a, 0, 2, null);
        return iF != -1 ? iF : C0846h.F(a10.b(), f4732b, 0, 2, null);
    }

    public static final C0846h m(A a10) {
        C0846h c0846hB = a10.b();
        C0846h c0846h = f4731a;
        if (C0846h.A(c0846hB, c0846h, 0, 2, null) != -1) {
            return c0846h;
        }
        C0846h c0846hB2 = a10.b();
        C0846h c0846h2 = f4732b;
        if (C0846h.A(c0846hB2, c0846h2, 0, 2, null) != -1) {
            return c0846h2;
        }
        return null;
    }

    public static final boolean n(A a10) {
        return a10.b().p(f4735e) && (a10.b().size() == 2 || a10.b().I(a10.b().size() + (-3), f4731a, 0, 1) || a10.b().I(a10.b().size() + (-3), f4732b, 0, 1));
    }

    public static final int o(A a10) {
        if (a10.b().size() == 0) {
            return -1;
        }
        if (a10.b().q(0) == 47) {
            return 1;
        }
        if (a10.b().q(0) == 92) {
            if (a10.b().size() <= 2 || a10.b().q(1) != 92) {
                return 1;
            }
            int iY = a10.b().y(f4732b, 2);
            return iY == -1 ? a10.b().size() : iY;
        }
        if (a10.b().size() > 2 && a10.b().q(1) == 58 && a10.b().q(2) == 92) {
            char cQ = (char) a10.b().q(0);
            if ('a' <= cQ && cQ < '{') {
                return 3;
            }
            if ('A' <= cQ && cQ < '[') {
                return 3;
            }
        }
        return -1;
    }

    public static final boolean p(C0843e c0843e, C0846h c0846h) {
        if (!AbstractC4862t.a(c0846h, f4732b) || c0843e.size() < 2 || c0843e.q(1L) != 58) {
            return false;
        }
        char cQ = (char) c0843e.q(0L);
        if ('a' > cQ || cQ >= '{') {
            return 'A' <= cQ && cQ < '[';
        }
        return true;
    }

    public static final A q(C0843e c0843e, boolean z10) throws EOFException {
        C0846h c0846h;
        C0846h c0846hQ0;
        AbstractC4862t.e(c0843e, "<this>");
        C0843e c0843e2 = new C0843e();
        C0846h c0846hR = null;
        int i10 = 0;
        while (true) {
            if (!c0843e.F(0L, f4731a)) {
                c0846h = f4732b;
                if (!c0843e.F(0L, c0846h)) {
                    break;
                }
            }
            byte b10 = c0843e.readByte();
            if (c0846hR == null) {
                c0846hR = r(b10);
            }
            i10++;
        }
        boolean z11 = i10 >= 2 && AbstractC4862t.a(c0846hR, c0846h);
        if (z11) {
            AbstractC4862t.b(c0846hR);
            c0843e2.U(c0846hR);
            c0843e2.U(c0846hR);
        } else if (i10 > 0) {
            AbstractC4862t.b(c0846hR);
            c0843e2.U(c0846hR);
        } else {
            long jC = c0843e.C(f4733c);
            if (c0846hR == null) {
                c0846hR = jC == -1 ? s(A.f4049c) : r(c0843e.q(jC));
            }
            if (p(c0843e, c0846hR)) {
                if (jC == 2) {
                    c0843e2.J(c0843e, 3L);
                } else {
                    c0843e2.J(c0843e, 2L);
                }
            }
        }
        boolean z12 = c0843e2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!c0843e.z0()) {
            long jC2 = c0843e.C(f4733c);
            if (jC2 == -1) {
                c0846hQ0 = c0843e.K();
            } else {
                c0846hQ0 = c0843e.q0(jC2);
                c0843e.readByte();
            }
            C0846h c0846h2 = f4735e;
            if (AbstractC4862t.a(c0846hQ0, c0846h2)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || AbstractC4862t.a(C4179C.s0(arrayList), c0846h2)))) {
                        arrayList.add(c0846hQ0);
                    } else if (!z11 || arrayList.size() != 1) {
                        y.L(arrayList);
                    }
                }
            } else if (!AbstractC4862t.a(c0846hQ0, f4734d) && !AbstractC4862t.a(c0846hQ0, C0846h.f4118e)) {
                arrayList.add(c0846hQ0);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                c0843e2.U(c0846hR);
            }
            c0843e2.U((C0846h) arrayList.get(i11));
        }
        if (c0843e2.size() == 0) {
            c0843e2.U(f4734d);
        }
        return new A(c0843e2.K());
    }

    public static final C0846h r(byte b10) {
        if (b10 == 47) {
            return f4731a;
        }
        if (b10 == 92) {
            return f4732b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b10));
    }

    public static final C0846h s(String str) {
        if (AbstractC4862t.a(str, "/")) {
            return f4731a;
        }
        if (AbstractC4862t.a(str, "\\")) {
            return f4732b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
