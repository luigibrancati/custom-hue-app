package ie;

import fe.AbstractC4046b;
import fe.InterfaceC4048d;
import fe.InterfaceC4050f;
import he.AbstractC4304b;
import je.AbstractC4771b;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class H extends AbstractC4046b implements he.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4386h f37504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC4304b f37505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O f37506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final he.r[] f37507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC4771b f37508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final he.f f37509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f37511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f37512i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37513a;

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
            f37513a = iArr;
        }
    }

    public H(C4386h composer, AbstractC4304b json, O mode, he.r[] rVarArr) {
        AbstractC4862t.e(composer, "composer");
        AbstractC4862t.e(json, "json");
        AbstractC4862t.e(mode, "mode");
        this.f37504a = composer;
        this.f37505b = json;
        this.f37506c = mode;
        this.f37507d = rVarArr;
        this.f37508e = d().d();
        this.f37509f = d().c();
        int iOrdinal = mode.ordinal();
        if (rVarArr != null) {
            he.r rVar = rVarArr[iOrdinal];
            if (rVar == null && rVar == this) {
                return;
            }
            rVarArr[iOrdinal] = this;
        }
    }

    @Override // fe.AbstractC4046b, fe.InterfaceC4050f
    public void D(int i10) {
        if (this.f37510g) {
            G(String.valueOf(i10));
        } else {
            this.f37504a.i(i10);
        }
    }

    @Override // fe.AbstractC4046b, fe.InterfaceC4050f
    public void G(String value) {
        AbstractC4862t.e(value, "value");
        this.f37504a.n(value);
    }

    @Override // fe.AbstractC4046b
    public boolean H(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        int i11 = a.f37513a[this.f37506c.ordinal()];
        if (i11 != 1) {
            boolean z10 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (!this.f37504a.a()) {
                        this.f37504a.f(',');
                    }
                    this.f37504a.c();
                    G(w.h(descriptor, d(), i10));
                    this.f37504a.f(':');
                    this.f37504a.p();
                } else {
                    if (i10 == 0) {
                        this.f37510g = true;
                    }
                    if (i10 == 1) {
                        this.f37504a.f(',');
                        this.f37504a.p();
                        this.f37510g = false;
                    }
                }
            } else if (this.f37504a.a()) {
                this.f37510g = true;
                this.f37504a.c();
            } else {
                if (i10 % 2 == 0) {
                    this.f37504a.f(',');
                    this.f37504a.c();
                    z10 = true;
                } else {
                    this.f37504a.f(':');
                    this.f37504a.p();
                }
                this.f37510g = z10;
            }
        } else {
            if (!this.f37504a.a()) {
                this.f37504a.f(',');
            }
            this.f37504a.c();
        }
        return true;
    }

    public final void J(String str, String str2) {
        this.f37504a.c();
        G(str);
        this.f37504a.f(':');
        this.f37504a.p();
        G(str2);
    }

    @Override // fe.AbstractC4046b, fe.InterfaceC4050f
    public InterfaceC4048d a(ee.e descriptor) {
        he.r rVar;
        AbstractC4862t.e(descriptor, "descriptor");
        O oB = P.b(d(), descriptor);
        char c10 = oB.begin;
        if (c10 != 0) {
            this.f37504a.f(c10);
            this.f37504a.b();
        }
        String str = this.f37511h;
        if (str != null) {
            String strI = this.f37512i;
            if (strI == null) {
                strI = descriptor.i();
            }
            J(str, strI);
            this.f37511h = null;
            this.f37512i = null;
        }
        if (this.f37506c == oB) {
            return this;
        }
        he.r[] rVarArr = this.f37507d;
        return (rVarArr == null || (rVar = rVarArr[oB.ordinal()]) == null) ? new H(this.f37504a, d(), oB, this.f37507d) : rVar;
    }

    @Override // fe.InterfaceC4050f
    public AbstractC4771b b() {
        return this.f37508e;
    }

    @Override // fe.AbstractC4046b, fe.InterfaceC4048d
    public void c(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        if (this.f37506c.end != 0) {
            this.f37504a.q();
            this.f37504a.d();
            this.f37504a.f(this.f37506c.end);
        }
    }

    @Override // he.r
    public AbstractC4304b d() {
        return this.f37505b;
    }

    @Override // fe.AbstractC4046b, fe.InterfaceC4050f
    public void f(double d10) {
        if (this.f37510g) {
            G(String.valueOf(d10));
        } else {
            this.f37504a.g(d10);
        }
        if (!this.f37509f.b() && Math.abs(d10) > Double.MAX_VALUE) {
            throw u.b(Double.valueOf(d10), this.f37504a.f37533a.toString());
        }
    }

    @Override // fe.AbstractC4046b, fe.InterfaceC4050f
    public void g(byte b10) {
        if (this.f37510g) {
            G(String.valueOf((int) b10));
        } else {
            this.f37504a.e(b10);
        }
    }

    @Override // fe.AbstractC4046b, fe.InterfaceC4048d
    public boolean i(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return this.f37509f.i();
    }

    @Override // fe.AbstractC4046b, fe.InterfaceC4048d
    public void l(ee.e descriptor, int i10, ce.g serializer, Object obj) {
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(serializer, "serializer");
        if (obj != null || this.f37509f.j()) {
            super.l(descriptor, i10, serializer, obj);
        }
    }

    @Override // fe.AbstractC4046b, fe.InterfaceC4050f
    public void o(long j10) {
        if (this.f37510g) {
            G(String.valueOf(j10));
        } else {
            this.f37504a.j(j10);
        }
    }

    @Override // fe.AbstractC4046b, fe.InterfaceC4050f
    public void p(ee.e enumDescriptor, int i10) {
        AbstractC4862t.e(enumDescriptor, "enumDescriptor");
        G(enumDescriptor.e(i10));
    }

    @Override // fe.AbstractC4046b, fe.InterfaceC4050f
    public InterfaceC4050f q(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        if (I.b(descriptor)) {
            C4386h c4388j = this.f37504a;
            if (!(c4388j instanceof C4388j)) {
                c4388j = new C4388j(c4388j.f37533a, this.f37510g);
            }
            return new H(c4388j, d(), this.f37506c, (he.r[]) null);
        }
        if (I.a(descriptor)) {
            C4386h c4387i = this.f37504a;
            if (!(c4387i instanceof C4387i)) {
                c4387i = new C4387i(c4387i.f37533a, this.f37510g);
            }
            return new H(c4387i, d(), this.f37506c, (he.r[]) null);
        }
        if (this.f37511h == null) {
            return super.q(descriptor);
        }
        this.f37512i = descriptor.i();
        return this;
    }

    @Override // fe.AbstractC4046b, fe.InterfaceC4050f
    public void r() {
        this.f37504a.k("null");
    }

    @Override // fe.AbstractC4046b, fe.InterfaceC4050f
    public void s(short s10) {
        if (this.f37510g) {
            G(String.valueOf((int) s10));
        } else {
            this.f37504a.l(s10);
        }
    }

    @Override // fe.AbstractC4046b, fe.InterfaceC4050f
    public void u(boolean z10) {
        if (this.f37510g) {
            G(String.valueOf(z10));
        } else {
            this.f37504a.m(z10);
        }
    }

    @Override // fe.AbstractC4046b, fe.InterfaceC4050f
    public void w(float f10) {
        if (this.f37510g) {
            G(String.valueOf(f10));
        } else {
            this.f37504a.h(f10);
        }
        if (!this.f37509f.b() && Math.abs(f10) > Float.MAX_VALUE) {
            throw u.b(Float.valueOf(f10), this.f37504a.f37533a.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    @Override // fe.AbstractC4046b, fe.InterfaceC4050f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x(ce.g r4, java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.H.x(ce.g, java.lang.Object):void");
    }

    @Override // fe.AbstractC4046b, fe.InterfaceC4050f
    public void y(char c10) {
        G(String.valueOf(c10));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public H(InterfaceC4393o output, AbstractC4304b json, O mode, he.r[] modeReuseCache) {
        this(AbstractC4390l.a(output, json), json, mode, modeReuseCache);
        AbstractC4862t.e(output, "output");
        AbstractC4862t.e(json, "json");
        AbstractC4862t.e(mode, "mode");
        AbstractC4862t.e(modeReuseCache, "modeReuseCache");
    }
}
