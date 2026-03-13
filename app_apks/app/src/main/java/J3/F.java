package J3;

import I3.AbstractC0890u;
import I3.EnumC0879i;
import android.text.TextUtils;
import fc.C4015H;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class F extends I3.K {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f5958j = AbstractC0890u.i("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f5959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC0879i f5961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f5962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f5963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f5964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f5965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public I3.y f5967i;

    public F(g0 g0Var, List list) {
        this(g0Var, null, EnumC0879i.KEEP, list, null);
    }

    public static /* synthetic */ C4015H a(F f10) {
        f10.getClass();
        R3.h.b(f10);
        return C4015H.f34254a;
    }

    public static boolean j(F f10, Set set) {
        set.addAll(f10.d());
        Set setM = m(f10);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (setM.contains((String) it.next())) {
                return true;
            }
        }
        List listF = f10.f();
        if (listF != null && !listF.isEmpty()) {
            Iterator it2 = listF.iterator();
            while (it2.hasNext()) {
                if (j((F) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(f10.d());
        return false;
    }

    public static Set m(F f10) {
        HashSet hashSet = new HashSet();
        List listF = f10.f();
        if (listF != null && !listF.isEmpty()) {
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((F) it.next()).d());
            }
        }
        return hashSet;
    }

    public I3.y b() {
        if (this.f5966h) {
            AbstractC0890u.e().k(f5958j, "Already enqueued work ids (" + TextUtils.join(", ", this.f5963e) + ")");
        } else {
            this.f5967i = I3.C.c(this.f5959a.j().n(), "EnqueueRunnable_" + c().name(), this.f5959a.r().c(), new InterfaceC6082a() { // from class: J3.E
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return F.a(this.f5957a);
                }
            });
        }
        return this.f5967i;
    }

    public EnumC0879i c() {
        return this.f5961c;
    }

    public List d() {
        return this.f5963e;
    }

    public String e() {
        return this.f5960b;
    }

    public List f() {
        return this.f5965g;
    }

    public List g() {
        return this.f5962d;
    }

    public g0 h() {
        return this.f5959a;
    }

    public boolean i() {
        return j(this, new HashSet());
    }

    public boolean k() {
        return this.f5966h;
    }

    public void l() {
        this.f5966h = true;
    }

    public F(g0 g0Var, String str, EnumC0879i enumC0879i, List list, List list2) {
        this.f5959a = g0Var;
        this.f5960b = str;
        this.f5961c = enumC0879i;
        this.f5962d = list;
        this.f5965g = list2;
        this.f5963e = new ArrayList(list.size());
        this.f5964f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f5964f.addAll(((F) it.next()).f5964f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (enumC0879i == EnumC0879i.REPLACE && ((I3.N) list.get(i10)).d().h() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String strB = ((I3.N) list.get(i10)).b();
            this.f5963e.add(strB);
            this.f5964f.add(strB);
        }
    }
}
