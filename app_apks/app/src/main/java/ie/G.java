package ie;

import ce.InterfaceC3118a;
import ee.k;
import fc.C4025h;
import fe.AbstractC4045a;
import fe.InterfaceC4047c;
import fe.InterfaceC4049e;
import he.AbstractC4304b;
import je.AbstractC4771b;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class G extends AbstractC4045a implements he.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC4304b f37494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O f37495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC4379a f37496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC4771b f37497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f37499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final he.f f37500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f37501i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f37502a;

        public a(String str) {
            this.f37502a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37503a;

        static {
            int[] iArr = new int[O.values().length];
            try {
                iArr[O.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[O.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f37503a = iArr;
        }
    }

    public G(AbstractC4304b json, O mode, AbstractC4379a lexer, ee.e descriptor, a aVar) {
        AbstractC4862t.e(json, "json");
        AbstractC4862t.e(mode, "mode");
        AbstractC4862t.e(lexer, "lexer");
        AbstractC4862t.e(descriptor, "descriptor");
        this.f37494b = json;
        this.f37495c = mode;
        this.f37496d = lexer;
        this.f37497e = json.d();
        this.f37498f = -1;
        this.f37499g = aVar;
        he.f fVarC = json.c();
        this.f37500h = fVarC;
        this.f37501i = fVarC.j() ? null : new r(descriptor);
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    public String D() {
        return this.f37500h.q() ? this.f37496d.t() : this.f37496d.q();
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    public boolean F() {
        r rVar = this.f37501i;
        return ((rVar != null ? rVar.b() : false) || AbstractC4379a.O(this.f37496d, false, 1, null)) ? false : true;
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    public byte G() {
        long jN = this.f37496d.n();
        byte b10 = (byte) jN;
        if (jN == b10) {
            return b10;
        }
        AbstractC4379a.z(this.f37496d, "Failed to parse byte for input '" + jN + '\'', 0, null, 6, null);
        throw new C4025h();
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4047c
    public Object H(ee.e descriptor, int i10, InterfaceC3118a deserializer, Object obj) {
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(deserializer, "deserializer");
        boolean z10 = this.f37495c == O.MAP && (i10 & 1) == 0;
        if (z10) {
            this.f37496d.f37519b.d();
        }
        Object objH = super.H(descriptor, i10, deserializer, obj);
        if (z10) {
            this.f37496d.f37519b.f(objH);
        }
        return objH;
    }

    public final void L() {
        if (this.f37496d.F() != 4) {
            return;
        }
        AbstractC4379a.z(this.f37496d, "Unexpected leading comma", 0, null, 6, null);
        throw new C4025h();
    }

    public final boolean M(ee.e eVar, int i10) {
        String strG;
        AbstractC4304b abstractC4304b = this.f37494b;
        boolean zJ = eVar.j(i10);
        ee.e eVarH = eVar.h(i10);
        if (zJ && !eVarH.b() && this.f37496d.N(true)) {
            return true;
        }
        if (!AbstractC4862t.a(eVarH.f(), k.b.f33970a) || ((eVarH.b() && this.f37496d.N(false)) || (strG = this.f37496d.G(this.f37500h.q())) == null)) {
            return false;
        }
        int i11 = w.i(eVarH, abstractC4304b, strG);
        boolean z10 = !abstractC4304b.c().j() && eVarH.b();
        if (i11 == -3 && (zJ || z10)) {
            this.f37496d.q();
            return true;
        }
        return false;
    }

    public final int N() {
        boolean zM = this.f37496d.M();
        if (!this.f37496d.f()) {
            if (!zM || this.f37494b.c().d()) {
                return -1;
            }
            u.f(this.f37496d, "array");
            throw new C4025h();
        }
        int i10 = this.f37498f;
        if (i10 != -1 && !zM) {
            AbstractC4379a.z(this.f37496d, "Expected end of the array or comma", 0, null, 6, null);
            throw new C4025h();
        }
        int i11 = i10 + 1;
        this.f37498f = i11;
        return i11;
    }

    public final int O() {
        int i10;
        int i11 = this.f37498f;
        boolean zM = false;
        boolean z10 = i11 % 2 != 0;
        if (!z10) {
            this.f37496d.m(':');
        } else if (i11 != -1) {
            zM = this.f37496d.M();
        }
        if (!this.f37496d.f()) {
            if (!zM || this.f37494b.c().d()) {
                return -1;
            }
            u.g(this.f37496d, null, 1, null);
            throw new C4025h();
        }
        if (!z10) {
            i10 = 1;
        } else if (this.f37498f == -1) {
            AbstractC4379a abstractC4379a = this.f37496d;
            int i12 = abstractC4379a.f37518a;
            if (zM) {
                AbstractC4379a.z(abstractC4379a, "Unexpected leading comma", i12, null, 4, null);
                throw new C4025h();
            }
            i10 = 1;
        } else {
            AbstractC4379a abstractC4379a2 = this.f37496d;
            i10 = 1;
            int i13 = abstractC4379a2.f37518a;
            if (!zM) {
                AbstractC4379a.z(abstractC4379a2, "Expected comma after the key-value pair", i13, null, 4, null);
                throw new C4025h();
            }
        }
        int i14 = this.f37498f + i10;
        this.f37498f = i14;
        return i14;
    }

    public final int P(ee.e eVar) {
        int i10;
        boolean zM;
        boolean zM2 = this.f37496d.M();
        while (true) {
            boolean z10 = true;
            if (!this.f37496d.f()) {
                if (zM2 && !this.f37494b.c().d()) {
                    u.g(this.f37496d, null, 1, null);
                    throw new C4025h();
                }
                r rVar = this.f37501i;
                if (rVar != null) {
                    return rVar.d();
                }
                return -1;
            }
            String strQ = Q();
            this.f37496d.m(':');
            i10 = w.i(eVar, this.f37494b, strQ);
            if (i10 == -3) {
                zM = false;
            } else {
                if (!this.f37500h.g() || !M(eVar, i10)) {
                    break;
                }
                zM = this.f37496d.M();
                z10 = false;
            }
            zM2 = z10 ? R(eVar, strQ) : zM;
        }
        r rVar2 = this.f37501i;
        if (rVar2 != null) {
            rVar2.c(i10);
        }
        return i10;
    }

    public final String Q() {
        return this.f37500h.q() ? this.f37496d.t() : this.f37496d.j();
    }

    public final boolean R(ee.e eVar, String str) {
        if (w.m(eVar, this.f37494b) || T(this.f37499g, str)) {
            this.f37496d.I(this.f37500h.q());
        } else {
            this.f37496d.f37519b.b();
            this.f37496d.A(str);
        }
        return this.f37496d.M();
    }

    public final void S(ee.e eVar) {
        while (j(eVar) != -1) {
        }
    }

    public final boolean T(a aVar, String str) {
        if (aVar == null || !AbstractC4862t.a(aVar.f37502a, str)) {
            return false;
        }
        aVar.f37502a = null;
        return true;
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    public InterfaceC4047c a(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        O oB = P.b(this.f37494b, descriptor);
        this.f37496d.f37519b.c(descriptor);
        this.f37496d.m(oB.begin);
        L();
        int i10 = b.f37503a[oB.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? new G(this.f37494b, oB, this.f37496d, descriptor, this.f37499g) : (this.f37495c == oB && this.f37494b.c().j()) ? this : new G(this.f37494b, oB, this.f37496d, descriptor, this.f37499g);
    }

    @Override // fe.InterfaceC4047c
    public AbstractC4771b b() {
        return this.f37497e;
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4047c
    public void c(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        if (descriptor.d() == 0 && w.m(descriptor, this.f37494b)) {
            S(descriptor);
        }
        if (this.f37496d.M() && !this.f37494b.c().d()) {
            u.f(this.f37496d, "");
            throw new C4025h();
        }
        this.f37496d.m(this.f37495c.end);
        this.f37496d.f37519b.b();
    }

    @Override // he.g
    public final AbstractC4304b d() {
        return this.f37494b;
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    public int f(ee.e enumDescriptor) {
        AbstractC4862t.e(enumDescriptor, "enumDescriptor");
        return w.j(enumDescriptor, this.f37494b, D(), " at path " + this.f37496d.f37519b.a());
    }

    @Override // he.g
    public he.h g() {
        return new E(this.f37494b.c(), this.f37496d).e();
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    public int h() {
        long jN = this.f37496d.n();
        int i10 = (int) jN;
        if (jN == i10) {
            return i10;
        }
        AbstractC4379a.z(this.f37496d, "Failed to parse int for input '" + jN + '\'', 0, null, 6, null);
        throw new C4025h();
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    public Void i() {
        return null;
    }

    @Override // fe.InterfaceC4047c
    public int j(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        int i10 = b.f37503a[this.f37495c.ordinal()];
        int iN = i10 != 2 ? i10 != 4 ? N() : P(descriptor) : O();
        if (this.f37495c != O.MAP) {
            this.f37496d.f37519b.g(iN);
        }
        return iN;
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    public long m() {
        return this.f37496d.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0157  */
    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object n(ce.InterfaceC3118a r12) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.G.n(ce.a):java.lang.Object");
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    public short t() {
        long jN = this.f37496d.n();
        short s10 = (short) jN;
        if (jN == s10) {
            return s10;
        }
        AbstractC4379a.z(this.f37496d, "Failed to parse short for input '" + jN + '\'', 0, null, 6, null);
        throw new C4025h();
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    public float u() {
        AbstractC4379a abstractC4379a = this.f37496d;
        String strS = abstractC4379a.s();
        try {
            float f10 = Float.parseFloat(strS);
            if (this.f37494b.c().b() || Math.abs(f10) <= Float.MAX_VALUE) {
                return f10;
            }
            u.j(this.f37496d, Float.valueOf(f10));
            throw new C4025h();
        } catch (IllegalArgumentException unused) {
            AbstractC4379a.z(abstractC4379a, "Failed to parse type 'float' for input '" + strS + '\'', 0, null, 6, null);
            throw new C4025h();
        }
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    public double w() {
        AbstractC4379a abstractC4379a = this.f37496d;
        String strS = abstractC4379a.s();
        try {
            double d10 = Double.parseDouble(strS);
            if (this.f37494b.c().b() || Math.abs(d10) <= Double.MAX_VALUE) {
                return d10;
            }
            u.j(this.f37496d, Double.valueOf(d10));
            throw new C4025h();
        } catch (IllegalArgumentException unused) {
            AbstractC4379a.z(abstractC4379a, "Failed to parse type 'double' for input '" + strS + '\'', 0, null, 6, null);
            throw new C4025h();
        }
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    public InterfaceC4049e x(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        return I.b(descriptor) ? new C4394p(this.f37496d, this.f37494b) : super.x(descriptor);
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    public boolean y() {
        return this.f37496d.h();
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    public char z() {
        String strS = this.f37496d.s();
        if (strS.length() == 1) {
            return strS.charAt(0);
        }
        AbstractC4379a.z(this.f37496d, "Expected single char, but got '" + strS + '\'', 0, null, 6, null);
        throw new C4025h();
    }
}
