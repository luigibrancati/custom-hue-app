package L1;

import D1.D;
import G1.AbstractC0853a;
import L1.A0;
import L1.InterfaceC1139b;
import a2.InterfaceC2611D;
import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements A0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final J7.t f8404i = new J7.t() { // from class: L1.s0
        @Override // J7.t
        public final Object get() {
            return t0.m();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Random f8405j = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D.c f8406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D.b f8407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f8408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J7.t f8409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public A0.a f8410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D1.D f8411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f8412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8413h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f8416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceC2611D.b f8417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f8418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f8419f;

        public a(String str, int i10, InterfaceC2611D.b bVar) {
            this.f8414a = str;
            this.f8415b = i10;
            this.f8416c = bVar == null ? -1L : bVar.f20525d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f8417d = bVar;
        }

        public boolean i(int i10, InterfaceC2611D.b bVar) {
            if (bVar == null) {
                return i10 == this.f8415b;
            }
            InterfaceC2611D.b bVar2 = this.f8417d;
            return bVar2 == null ? !bVar.b() && bVar.f20525d == this.f8416c : bVar.f20525d == bVar2.f20525d && bVar.f20523b == bVar2.f20523b && bVar.f20524c == bVar2.f20524c;
        }

        public boolean j(InterfaceC1139b.a aVar) {
            InterfaceC2611D.b bVar = aVar.f8309d;
            if (bVar == null) {
                return this.f8415b != aVar.f8308c;
            }
            long j10 = this.f8416c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f20525d > j10) {
                return true;
            }
            if (this.f8417d == null) {
                return false;
            }
            int iB = aVar.f8307b.b(bVar.f20522a);
            int iB2 = aVar.f8307b.b(this.f8417d.f20522a);
            InterfaceC2611D.b bVar2 = aVar.f8309d;
            if (bVar2.f20525d < this.f8417d.f20525d || iB < iB2) {
                return false;
            }
            if (iB > iB2) {
                return true;
            }
            if (!bVar2.b()) {
                int i10 = aVar.f8309d.f20526e;
                return i10 == -1 || i10 > this.f8417d.f20523b;
            }
            InterfaceC2611D.b bVar3 = aVar.f8309d;
            int i11 = bVar3.f20523b;
            int i12 = bVar3.f20524c;
            InterfaceC2611D.b bVar4 = this.f8417d;
            int i13 = bVar4.f20523b;
            return i11 > i13 || (i11 == i13 && i12 > bVar4.f20524c);
        }

        public void k(int i10, InterfaceC2611D.b bVar) {
            if (this.f8416c != -1 || i10 != this.f8415b || bVar == null || bVar.f20525d < t0.this.n()) {
                return;
            }
            this.f8416c = bVar.f20525d;
        }

        public final int l(D1.D d10, D1.D d11, int i10) {
            if (i10 >= d10.p()) {
                if (i10 < d11.p()) {
                    return i10;
                }
                return -1;
            }
            d10.n(i10, t0.this.f8406a);
            for (int i11 = t0.this.f8406a.f1486n; i11 <= t0.this.f8406a.f1487o; i11++) {
                int iB = d11.b(d10.m(i11));
                if (iB != -1) {
                    return d11.f(iB, t0.this.f8407b).f1452c;
                }
            }
            return -1;
        }

        public boolean m(D1.D d10, D1.D d11) {
            int iL = l(d10, d11, this.f8415b);
            this.f8415b = iL;
            if (iL == -1) {
                return false;
            }
            InterfaceC2611D.b bVar = this.f8417d;
            return bVar == null || d11.b(bVar.f20522a) != -1;
        }
    }

    public t0() {
        this(f8404i);
    }

    public static String m() {
        byte[] bArr = new byte[12];
        f8405j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // L1.A0
    public synchronized void a(InterfaceC1139b.a aVar) {
        AbstractC0853a.e(this.f8410e);
        if (aVar.f8307b.q()) {
            return;
        }
        InterfaceC2611D.b bVar = aVar.f8309d;
        if (bVar != null) {
            if (bVar.f20525d < n()) {
                return;
            }
            a aVar2 = (a) this.f8408c.get(this.f8412g);
            if (aVar2 != null && aVar2.f8416c == -1 && aVar2.f8415b != aVar.f8308c) {
                return;
            }
        }
        a aVarO = o(aVar.f8308c, aVar.f8309d);
        if (this.f8412g == null) {
            this.f8412g = aVarO.f8414a;
        }
        InterfaceC2611D.b bVar2 = aVar.f8309d;
        if (bVar2 != null && bVar2.b()) {
            InterfaceC2611D.b bVar3 = aVar.f8309d;
            InterfaceC2611D.b bVar4 = new InterfaceC2611D.b(bVar3.f20522a, bVar3.f20525d, bVar3.f20523b);
            a aVarO2 = o(aVar.f8308c, bVar4);
            if (!aVarO2.f8418e) {
                aVarO2.f8418e = true;
                aVar.f8307b.h(aVar.f8309d.f20522a, this.f8407b);
                this.f8410e.T(new InterfaceC1139b.a(aVar.f8306a, aVar.f8307b, aVar.f8308c, bVar4, Math.max(0L, G1.M.o1(this.f8407b.f(aVar.f8309d.f20523b)) + this.f8407b.m()), aVar.f8311f, aVar.f8312g, aVar.f8313h, aVar.f8314i, aVar.f8315j), aVarO2.f8414a);
            }
        }
        if (!aVarO.f8418e) {
            aVarO.f8418e = true;
            this.f8410e.T(aVar, aVarO.f8414a);
        }
        if (aVarO.f8414a.equals(this.f8412g) && !aVarO.f8419f) {
            aVarO.f8419f = true;
            this.f8410e.v0(aVar, aVarO.f8414a);
        }
    }

    @Override // L1.A0
    public synchronized String b() {
        return this.f8412g;
    }

    @Override // L1.A0
    public synchronized void c(InterfaceC1139b.a aVar) {
        try {
            AbstractC0853a.e(this.f8410e);
            D1.D d10 = this.f8411f;
            this.f8411f = aVar.f8307b;
            Iterator it = this.f8408c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (!aVar2.m(d10, this.f8411f) || aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f8418e) {
                        if (aVar2.f8414a.equals(this.f8412g)) {
                            l(aVar2);
                        }
                        this.f8410e.b(aVar, aVar2.f8414a, false);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // L1.A0
    public synchronized void d(InterfaceC1139b.a aVar) {
        A0.a aVar2;
        try {
            String str = this.f8412g;
            if (str != null) {
                l((a) AbstractC0853a.e((a) this.f8408c.get(str)));
            }
            Iterator it = this.f8408c.values().iterator();
            while (it.hasNext()) {
                a aVar3 = (a) it.next();
                it.remove();
                if (aVar3.f8418e && (aVar2 = this.f8410e) != null) {
                    aVar2.b(aVar, aVar3.f8414a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // L1.A0
    public void e(A0.a aVar) {
        this.f8410e = aVar;
    }

    @Override // L1.A0
    public synchronized String f(D1.D d10, InterfaceC2611D.b bVar) {
        return o(d10.h(bVar.f20522a, this.f8407b).f1452c, bVar).f8414a;
    }

    @Override // L1.A0
    public synchronized void g(InterfaceC1139b.a aVar, int i10) {
        try {
            AbstractC0853a.e(this.f8410e);
            boolean z10 = i10 == 0;
            Iterator it = this.f8408c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f8418e) {
                        boolean zEquals = aVar2.f8414a.equals(this.f8412g);
                        boolean z11 = z10 && zEquals && aVar2.f8419f;
                        if (zEquals) {
                            l(aVar2);
                        }
                        this.f8410e.b(aVar, aVar2.f8414a, z11);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void l(a aVar) {
        if (aVar.f8416c != -1) {
            this.f8413h = aVar.f8416c;
        }
        this.f8412g = null;
    }

    public final long n() {
        a aVar = (a) this.f8408c.get(this.f8412g);
        return (aVar == null || aVar.f8416c == -1) ? this.f8413h + 1 : aVar.f8416c;
    }

    public final a o(int i10, InterfaceC2611D.b bVar) {
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f8408c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long j11 = aVar2.f8416c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) G1.M.i(aVar)).f8417d != null && aVar2.f8417d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) this.f8409d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f8408c.put(str, aVar3);
        return aVar3;
    }

    public final void p(InterfaceC1139b.a aVar) {
        if (aVar.f8307b.q()) {
            String str = this.f8412g;
            if (str != null) {
                l((a) AbstractC0853a.e((a) this.f8408c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = (a) this.f8408c.get(this.f8412g);
        a aVarO = o(aVar.f8308c, aVar.f8309d);
        this.f8412g = aVarO.f8414a;
        a(aVar);
        InterfaceC2611D.b bVar = aVar.f8309d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f8416c == aVar.f8309d.f20525d && aVar2.f8417d != null && aVar2.f8417d.f20523b == aVar.f8309d.f20523b && aVar2.f8417d.f20524c == aVar.f8309d.f20524c) {
            return;
        }
        InterfaceC2611D.b bVar2 = aVar.f8309d;
        this.f8410e.D(aVar, o(aVar.f8308c, new InterfaceC2611D.b(bVar2.f20522a, bVar2.f20525d)).f8414a, aVarO.f8414a);
    }

    public t0(J7.t tVar) {
        this.f8409d = tVar;
        this.f8406a = new D.c();
        this.f8407b = new D.b();
        this.f8408c = new HashMap();
        this.f8411f = D1.D.f1441a;
        this.f8413h = -1L;
    }
}
