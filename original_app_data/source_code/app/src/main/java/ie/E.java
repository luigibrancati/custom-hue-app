package ie;

import fc.AbstractC4019b;
import fc.AbstractC4020c;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4018a;
import fc.C4025h;
import he.AbstractC4300C;
import he.C4298A;
import he.C4305c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC4379a f37476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f37477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f37478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37479d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.k implements vc.q {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f37480k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f37481l;

        public a(InterfaceC4988e interfaceC4988e) {
            super(3, interfaceC4988e);
        }

        @Override // vc.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC4020c abstractC4020c, C4015H c4015h, InterfaceC4988e interfaceC4988e) {
            a aVar = E.this.new a(interfaceC4988e);
            aVar.f37481l = abstractC4020c;
            return aVar.invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC4020c abstractC4020c = (AbstractC4020c) this.f37481l;
            Object objF = C5046c.f();
            int i10 = this.f37480k;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                byte bF = E.this.f37476a.F();
                if (bF == 1) {
                    return E.this.j(true);
                }
                if (bF == 0) {
                    return E.this.j(false);
                }
                if (bF != 6) {
                    if (bF == 8) {
                        return E.this.f();
                    }
                    AbstractC4379a.z(E.this.f37476a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new C4025h();
                }
                E e10 = E.this;
                this.f37481l = nc.l.a(abstractC4020c);
                this.f37480k = 1;
                obj = e10.i(abstractC4020c, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return (he.h) obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f37483j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f37484k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f37485l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f37486m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f37487n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f37488o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public byte f37489p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f37490q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f37492s;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f37490q = obj;
            this.f37492s |= Integer.MIN_VALUE;
            return E.this.i(null, this);
        }
    }

    public E(he.f configuration, AbstractC4379a lexer) {
        AbstractC4862t.e(configuration, "configuration");
        AbstractC4862t.e(lexer, "lexer");
        this.f37476a = lexer;
        this.f37477b = configuration.q();
        this.f37478c = configuration.d();
    }

    public final he.h e() {
        byte bF = this.f37476a.F();
        if (bF == 1) {
            return j(true);
        }
        if (bF == 0) {
            return j(false);
        }
        if (bF == 6) {
            int i10 = this.f37479d + 1;
            this.f37479d = i10;
            this.f37479d--;
            return i10 == 200 ? g() : h();
        }
        if (bF == 8) {
            return f();
        }
        AbstractC4379a.z(this.f37476a, "Cannot read Json element because of unexpected " + AbstractC4380b.c(bF), 0, null, 6, null);
        throw new C4025h();
    }

    public final he.h f() {
        byte bK = this.f37476a.k();
        if (this.f37476a.F() == 4) {
            AbstractC4379a.z(this.f37476a, "Unexpected leading comma", 0, null, 6, null);
            throw new C4025h();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f37476a.f()) {
            arrayList.add(e());
            bK = this.f37476a.k();
            if (bK != 4) {
                AbstractC4379a abstractC4379a = this.f37476a;
                boolean z10 = bK == 9;
                int i10 = abstractC4379a.f37518a;
                if (!z10) {
                    AbstractC4379a.z(abstractC4379a, "Expected end of the array or comma", i10, null, 4, null);
                    throw new C4025h();
                }
            }
        }
        if (bK == 8) {
            this.f37476a.l((byte) 9);
        } else if (bK == 4) {
            if (!this.f37478c) {
                u.f(this.f37476a, "array");
                throw new C4025h();
            }
            this.f37476a.l((byte) 9);
        }
        return new C4305c(arrayList);
    }

    public final he.h g() {
        return (he.h) AbstractC4019b.b(new C4018a(new a(null)), C4015H.f34254a);
    }

    public final he.h h() {
        byte bL = this.f37476a.l((byte) 6);
        if (this.f37476a.F() == 4) {
            AbstractC4379a.z(this.f37476a, "Unexpected leading comma", 0, null, 6, null);
            throw new C4025h();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.f37476a.f()) {
                break;
            }
            String strS = this.f37477b ? this.f37476a.s() : this.f37476a.q();
            this.f37476a.l((byte) 5);
            linkedHashMap.put(strS, e());
            bL = this.f37476a.k();
            if (bL != 4) {
                if (bL != 7) {
                    AbstractC4379a.z(this.f37476a, "Expected end of the object or comma", 0, null, 6, null);
                    throw new C4025h();
                }
            }
        }
        if (bL == 6) {
            this.f37476a.l((byte) 7);
        } else if (bL == 4) {
            if (!this.f37478c) {
                u.g(this.f37476a, null, 1, null);
                throw new C4025h();
            }
            this.f37476a.l((byte) 7);
        }
        return new C4298A(linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a6 -> B:27:0x00ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(fc.AbstractC4020c r21, lc.InterfaceC4988e r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.E.i(fc.c, lc.e):java.lang.Object");
    }

    public final AbstractC4300C j(boolean z10) {
        String strS = (this.f37477b || !z10) ? this.f37476a.s() : this.f37476a.q();
        return (z10 || !AbstractC4862t.a(strS, "null")) ? new he.t(strS, z10, null, 4, null) : he.x.INSTANCE;
    }
}
