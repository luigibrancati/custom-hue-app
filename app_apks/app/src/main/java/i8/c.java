package i8;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l8.InterfaceC4964a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O8.b f37318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f37320c = null;

    public c(Context context, O8.b bVar, String str) {
        this.f37318a = bVar;
        this.f37319b = str;
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C4367b.b((Map) it.next()));
        }
        return arrayList;
    }

    public final void a(InterfaceC4964a.c cVar) {
        ((InterfaceC4964a) this.f37318a.get()).d(cVar);
    }

    public final void b(List list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i10 = i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4367b c4367b = (C4367b) it.next();
            while (arrayDeque.size() >= i10) {
                k(((InterfaceC4964a.c) arrayDeque.pollFirst()).f39906b);
            }
            InterfaceC4964a.c cVarF = c4367b.f(this.f37319b);
            a(cVarF);
            arrayDeque.offer(cVarF);
        }
    }

    public final boolean d(List list, C4367b c4367b) {
        String strC = c4367b.c();
        String strE = c4367b.e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4367b c4367b2 = (C4367b) it.next();
            if (c4367b2.c().equals(strC) && c4367b2.e().equals(strE)) {
                return true;
            }
        }
        return false;
    }

    public List e() throws C4366a {
        o();
        List listF = f();
        ArrayList arrayList = new ArrayList();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(C4367b.a((InterfaceC4964a.c) it.next()));
        }
        return arrayList;
    }

    public final List f() {
        return ((InterfaceC4964a) this.f37318a.get()).f(this.f37319b, "");
    }

    public final ArrayList g(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4367b c4367b = (C4367b) it.next();
            if (!d(list2, c4367b)) {
                arrayList.add(c4367b);
            }
        }
        return arrayList;
    }

    public final ArrayList h(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4367b c4367b = (C4367b) it.next();
            if (!d(list2, c4367b)) {
                arrayList.add(c4367b.f(this.f37319b));
            }
        }
        return arrayList;
    }

    public final int i() {
        if (this.f37320c == null) {
            this.f37320c = Integer.valueOf(((InterfaceC4964a) this.f37318a.get()).e(this.f37319b));
        }
        return this.f37320c.intValue();
    }

    public void j() throws C4366a {
        o();
        l(f());
    }

    public final void k(String str) {
        ((InterfaceC4964a) this.f37318a.get()).clearConditionalUserProperty(str, null, null);
    }

    public final void l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            k(((InterfaceC4964a.c) it.next()).f39906b);
        }
    }

    public void m(List list) throws C4366a {
        o();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        n(c(list));
    }

    public final void n(List list) throws C4366a {
        if (list.isEmpty()) {
            j();
            return;
        }
        List listE = e();
        l(h(listE, list));
        b(g(list, listE));
    }

    public final void o() throws C4366a {
        if (this.f37318a.get() == null) {
            throw new C4366a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
