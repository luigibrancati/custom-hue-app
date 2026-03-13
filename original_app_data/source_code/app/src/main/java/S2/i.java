package S2;

import S2.j;
import Ud.AbstractC2315g;
import Ud.E;
import Ud.G;
import Ud.w;
import gc.C4199l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f15286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f15287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f15288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E f15289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4199l f15290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4199l f15291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f15292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f15294i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f15295j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Set f15296k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f15297l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15298m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15299n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15300o;

    public i() {
        w wVarA = G.a(j.b.f15302b);
        this.f15286a = wVarA;
        this.f15287b = AbstractC2315g.b(wVarA);
        w wVarA2 = G.a(new f());
        this.f15288c = wVarA2;
        this.f15289d = AbstractC2315g.b(wVarA2);
        this.f15290e = new C4199l();
        this.f15291f = new C4199l();
        this.f15295j = new LinkedHashSet();
        this.f15296k = new LinkedHashSet();
        this.f15297l = new LinkedHashSet();
    }

    public static /* synthetic */ e k(i iVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return iVar.j(i10);
    }

    public final void a(c dispatcher, e handler, int i10) {
        AbstractC4862t.e(dispatcher, "dispatcher");
        AbstractC4862t.e(handler, "handler");
        if (handler.k() != null) {
            throw new IllegalArgumentException(("Handler '" + handler + "' is already registered with a dispatcher").toString());
        }
        if (i10 == 0) {
            this.f15290e.addFirst(handler);
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("Unsupported priority value: " + i10);
            }
            this.f15291f.addFirst(handler);
        }
        handler.y(dispatcher);
        g();
    }

    public final void b(c dispatcher, h input, int i10) {
        AbstractC4862t.e(dispatcher, "dispatcher");
        AbstractC4862t.e(input, "input");
        if (input.h() == null) {
            (i10 != 0 ? i10 != 1 ? this.f15295j : this.f15296k : this.f15297l).add(input);
            input.l(dispatcher);
            input.e(dispatcher);
            input.g((f) this.f15289d.getValue());
            input.f(i10 != 0 ? i10 != 1 ? this.f15300o : this.f15298m : this.f15299n);
            return;
        }
        throw new IllegalArgumentException(("Input '" + input + "' is already added to dispatcher " + input.h() + '.').toString());
    }

    public final void c(h input, int i10) {
        AbstractC4862t.e(input, "input");
        if (AbstractC4862t.a(input, this.f15294i) && i10 == this.f15293h) {
            e eVarJ = this.f15292g;
            if (eVarJ == null) {
                eVarJ = j(i10);
            }
            this.f15292g = null;
            this.f15293h = 0;
            this.f15294i = null;
            if (i10 != -1) {
                if (i10 == 1 && eVarJ != null) {
                    eVarJ.e();
                }
            } else if (eVarJ != null) {
                eVarJ.a();
            }
            this.f15286a.setValue(j.b.f15302b);
        }
    }

    public final void d(h input, int i10, l lVar) {
        AbstractC4862t.e(input, "input");
        if (AbstractC4862t.a(input, this.f15294i) && i10 == this.f15293h) {
            e eVarJ = this.f15292g;
            if (eVarJ == null) {
                eVarJ = j(i10);
            }
            this.f15292g = null;
            this.f15293h = 0;
            this.f15294i = null;
            if (i10 != -1) {
                if (i10 == 1 && eVarJ != null) {
                    eVarJ.f();
                }
            } else if (eVarJ != null) {
                eVarJ.b();
            } else if (lVar != null) {
                lVar.a();
            }
            this.f15286a.setValue(j.b.f15302b);
        }
    }

    public final void e(h input, int i10, b event) {
        AbstractC4862t.e(input, "input");
        AbstractC4862t.e(event, "event");
        if (AbstractC4862t.a(input, this.f15294i) && i10 == this.f15293h) {
            e eVarJ = this.f15292g;
            if (eVarJ == null) {
                eVarJ = j(i10);
            }
            if (i10 != -1) {
                if (i10 == 1 && eVarJ != null) {
                    eVarJ.g(event);
                }
            } else if (eVarJ != null) {
                eVarJ.c(event);
            }
            this.f15286a.setValue(new j.c(event, i10));
        }
    }

    public final void f(h input, int i10, b bVar) {
        AbstractC4862t.e(input, "input");
        if (this.f15293h != 0) {
            return;
        }
        e eVarJ = j(i10);
        this.f15292g = eVarJ;
        this.f15293h = i10;
        this.f15294i = input;
        if (bVar != null) {
            if (i10 != -1) {
                if (i10 == 1 && eVarJ != null) {
                    eVarJ.h(bVar);
                }
            } else if (eVarJ != null) {
                eVarJ.d(bVar);
            }
            this.f15286a.setValue(new j.c(bVar, i10));
        }
    }

    public final void g() {
        boolean z10;
        boolean z11;
        C4199l<e> c4199l = this.f15290e;
        if (c4199l == null || !c4199l.isEmpty()) {
            for (e eVar : c4199l) {
                if (eVar.m() || eVar.n()) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        } else {
            z10 = false;
        }
        C4199l<e> c4199l2 = this.f15291f;
        if (c4199l2 == null || !c4199l2.isEmpty()) {
            for (e eVar2 : c4199l2) {
                if (eVar2.m() || eVar2.n()) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
        } else {
            z11 = false;
        }
        boolean z12 = z10 || z11;
        boolean z13 = this.f15299n != z10;
        boolean z14 = this.f15298m != z11;
        boolean z15 = this.f15300o != z12;
        if (z13) {
            Iterator it = this.f15297l.iterator();
            while (it.hasNext()) {
                ((h) it.next()).f(z10);
            }
        }
        if (z14) {
            Iterator it2 = this.f15296k.iterator();
            while (it2.hasNext()) {
                ((h) it2.next()).f(z11);
            }
        }
        if (z15) {
            Iterator it3 = this.f15295j.iterator();
            while (it3.hasNext()) {
                ((h) it3.next()).f(z12);
            }
        }
        this.f15299n = z10;
        this.f15298m = z11;
        this.f15300o = z12;
        e eVarK = this.f15292g;
        if (eVarK == null) {
            eVarK = k(this, 0, 1, null);
        }
        l(eVarK);
    }

    public final void h(e handler) {
        AbstractC4862t.e(handler, "handler");
        if (AbstractC4862t.a(handler, this.f15292g)) {
            int i10 = this.f15293h;
            if (i10 == -1) {
                handler.a();
            } else if (i10 == 1) {
                handler.e();
            }
            this.f15292g = null;
            this.f15293h = 0;
            this.f15294i = null;
        }
        this.f15290e.remove(handler);
        this.f15291f.remove(handler);
        handler.y(null);
        g();
    }

    public final List i() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.f15290e) {
            if (eVar.m() && !eVar.i().isEmpty()) {
                arrayList.addAll(eVar.i());
            }
        }
        for (e eVar2 : this.f15291f) {
            if (eVar2.m() && !eVar2.i().isEmpty()) {
                arrayList.addAll(eVar2.i());
            }
        }
        return arrayList;
    }

    public final e j(int i10) {
        Object next;
        Object next2;
        Object next3;
        Object obj = null;
        if (i10 == -1) {
            Iterator<E> it = this.f15290e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((e) next).m()) {
                    break;
                }
            }
            e eVar = (e) next;
            if (eVar != null) {
                return eVar;
            }
            Iterator<E> it2 = this.f15291f.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next4 = it2.next();
                if (((e) next4).m()) {
                    obj = next4;
                    break;
                }
            }
            return (e) obj;
        }
        if (i10 == 0) {
            Iterator<E> it3 = this.f15290e.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                e eVar2 = (e) next2;
                if (eVar2.m() || eVar2.n()) {
                    break;
                }
            }
            e eVar3 = (e) next2;
            if (eVar3 != null) {
                return eVar3;
            }
            for (Object obj2 : this.f15291f) {
                e eVar4 = (e) obj2;
                if (eVar4.m() || eVar4.n()) {
                    obj = obj2;
                    break;
                }
            }
            return (e) obj;
        }
        if (i10 != 1) {
            throw new IllegalStateException(("Unsupported direction: '" + i10 + "'.").toString());
        }
        Iterator<E> it4 = this.f15290e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
            if (((e) next3).n()) {
                break;
            }
        }
        e eVar5 = (e) next3;
        if (eVar5 != null) {
            return eVar5;
        }
        Iterator<E> it5 = this.f15291f.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            Object next5 = it5.next();
            if (((e) next5).n()) {
                obj = next5;
                break;
            }
        }
        return (e) obj;
    }

    public final void l(e eVar) {
        f fVar;
        e eVarK = this.f15292g;
        if (eVarK == null) {
            eVarK = k(this, 0, 1, null);
        }
        if (AbstractC4862t.a(eVarK, eVar)) {
            if (eVarK == null) {
                fVar = new f();
            } else {
                fVar = new f(eVarK.j(), i(), eVarK.l());
            }
            if (AbstractC4862t.a((f) this.f15288c.getValue(), fVar)) {
                return;
            }
            this.f15288c.setValue(fVar);
            Iterator it = this.f15297l.iterator();
            while (it.hasNext()) {
                ((h) it.next()).g(fVar);
            }
            Iterator it2 = this.f15296k.iterator();
            while (it2.hasNext()) {
                ((h) it2.next()).g(fVar);
            }
            Iterator it3 = this.f15295j.iterator();
            while (it3.hasNext()) {
                ((h) it3.next()).g(fVar);
            }
        }
    }
}
