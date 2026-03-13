package ie;

import ee.k;
import fe.InterfaceC4047c;
import gc.Q;
import gc.U;
import gc.V;
import ge.AbstractC4222K;
import he.AbstractC4300C;
import he.AbstractC4302E;
import he.AbstractC4304b;
import he.C4298A;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ie.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4378B extends AbstractC4381c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4298A f37465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ee.e f37466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f37467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f37468k;

    public /* synthetic */ C4378B(AbstractC4304b abstractC4304b, C4298A c4298a, String str, ee.e eVar, int i10, AbstractC4854k abstractC4854k) {
        this(abstractC4304b, c4298a, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : eVar);
    }

    @Override // ie.AbstractC4381c, ge.z0, fe.InterfaceC4049e
    public boolean F() {
        return !this.f37468k && super.F();
    }

    public final he.h G0(String tag) {
        AbstractC4862t.e(tag, "tag");
        return (he.h) D0().get(tag);
    }

    @Override // ie.AbstractC4381c
    /* JADX INFO: renamed from: H0 */
    public C4298A D0() {
        return this.f37465h;
    }

    public final boolean I0(ee.e eVar, int i10) {
        boolean z10 = (d().c().j() || eVar.j(i10) || !eVar.h(i10).b()) ? false : true;
        this.f37468k = z10;
        return z10;
    }

    @Override // ie.AbstractC4381c, ge.z0, fe.InterfaceC4049e
    public InterfaceC4047c a(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        if (descriptor != this.f37466i) {
            return super.a(descriptor);
        }
        AbstractC4304b abstractC4304bD = d();
        he.h hVarP0 = p0();
        String strI = this.f37466i.i();
        if (hVarP0 instanceof C4298A) {
            return new C4378B(abstractC4304bD, (C4298A) hVarP0, C0(), this.f37466i);
        }
        throw u.e(-1, "Expected " + kotlin.jvm.internal.M.b(C4298A.class).l() + ", but had " + kotlin.jvm.internal.M.b(hVarP0.getClass()).l() + " as the serialized body of " + strI + " at element: " + l0(), hVarP0.toString());
    }

    @Override // ie.AbstractC4381c, ge.z0, fe.InterfaceC4047c
    public void c(ee.e descriptor) {
        Set setK;
        AbstractC4862t.e(descriptor, "descriptor");
        if (w.m(descriptor, d()) || (descriptor.f() instanceof ee.c)) {
            return;
        }
        w.n(descriptor, d());
        if (this.f37525g.o()) {
            Set setA = AbstractC4222K.a(descriptor);
            Map map = (Map) AbstractC4302E.a(d()).a(descriptor, w.g());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = U.d();
            }
            setK = V.k(setA, setKeySet);
        } else {
            setK = AbstractC4222K.a(descriptor);
        }
        for (String str : D0().keySet()) {
            if (!setK.contains(str) && !AbstractC4862t.a(str, C0())) {
                throw u.d(-1, "Encountered an unknown key '" + str + "' at element: " + l0() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) u.i(D0().toString(), 0, 1, null)));
            }
        }
    }

    @Override // ge.U
    public String i0(ee.e descriptor, int i10) {
        Object next;
        AbstractC4862t.e(descriptor, "descriptor");
        w.n(descriptor, d());
        String strE = descriptor.e(i10);
        if (!this.f37525g.o() || D0().keySet().contains(strE)) {
            return strE;
        }
        Map mapE = w.e(d(), descriptor);
        Iterator<T> it = D0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = (Integer) mapE.get((String) next);
            if (num != null && num.intValue() == i10) {
                break;
            }
        }
        String str = (String) next;
        return str != null ? str : strE;
    }

    @Override // fe.InterfaceC4047c
    public int j(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        while (this.f37467j < descriptor.d()) {
            int i10 = this.f37467j;
            this.f37467j = i10 + 1;
            String strC0 = c0(descriptor, i10);
            int i11 = this.f37467j - 1;
            this.f37468k = false;
            if (D0().containsKey(strC0) || I0(descriptor, i11)) {
                if (this.f37525g.g()) {
                    AbstractC4304b abstractC4304bD = d();
                    boolean zJ = descriptor.j(i11);
                    ee.e eVarH = descriptor.h(i11);
                    if (!zJ || eVarH.b() || !(G0(strC0) instanceof he.x)) {
                        if (AbstractC4862t.a(eVarH.f(), k.b.f33970a)) {
                            if (eVarH.b() && (G0(strC0) instanceof he.x)) {
                                return i11;
                            }
                            he.h hVarG0 = G0(strC0);
                            AbstractC4300C abstractC4300C = hVarG0 instanceof AbstractC4300C ? (AbstractC4300C) hVarG0 : null;
                            String strD = abstractC4300C != null ? he.i.d(abstractC4300C) : null;
                            if (strD == null) {
                                return i11;
                            }
                            int i12 = w.i(eVarH, abstractC4304bD, strD);
                            boolean z10 = !abstractC4304bD.c().j() && eVarH.b();
                            if (i12 != -3 || ((!zJ && !z10) || I0(descriptor, i11))) {
                            }
                        }
                    }
                }
                return i11;
            }
        }
        return -1;
    }

    @Override // ie.AbstractC4381c
    public he.h o0(String tag) {
        AbstractC4862t.e(tag, "tag");
        return (he.h) Q.j(D0(), tag);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4378B(AbstractC4304b json, C4298A value, String str, ee.e eVar) {
        super(json, value, str, null);
        AbstractC4862t.e(json, "json");
        AbstractC4862t.e(value, "value");
        this.f37465h = value;
        this.f37466i = eVar;
    }
}
