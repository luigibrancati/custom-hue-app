package n7;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n7.InterfaceC5145h;

/* JADX INFO: renamed from: n7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5138a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f40617a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f40618b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f40619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f40621e;

    /* JADX INFO: renamed from: n7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0537a implements InterfaceC5145h.a {
        public C0537a() {
        }

        @Override // n7.InterfaceC5145h.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC5145h interfaceC5145h, boolean z10) {
            if (!z10) {
                C5138a c5138a = C5138a.this;
                if (!c5138a.r(interfaceC5145h, c5138a.f40621e)) {
                    return;
                }
            } else if (!C5138a.this.g(interfaceC5145h)) {
                return;
            }
            C5138a.this.m();
        }
    }

    /* JADX INFO: renamed from: n7.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(Set set);
    }

    public void e(InterfaceC5145h interfaceC5145h) {
        this.f40617a.put(Integer.valueOf(interfaceC5145h.getId()), interfaceC5145h);
        if (interfaceC5145h.isChecked()) {
            g(interfaceC5145h);
        }
        interfaceC5145h.setInternalOnCheckedChangeListener(new C0537a());
    }

    public void f(int i10) {
        InterfaceC5145h interfaceC5145h = (InterfaceC5145h) this.f40617a.get(Integer.valueOf(i10));
        if (interfaceC5145h != null && g(interfaceC5145h)) {
            m();
        }
    }

    public final boolean g(InterfaceC5145h interfaceC5145h) {
        int id2 = interfaceC5145h.getId();
        if (this.f40618b.contains(Integer.valueOf(id2))) {
            return false;
        }
        InterfaceC5145h interfaceC5145h2 = (InterfaceC5145h) this.f40617a.get(Integer.valueOf(k()));
        if (interfaceC5145h2 != null) {
            r(interfaceC5145h2, false);
        }
        boolean zAdd = this.f40618b.add(Integer.valueOf(id2));
        if (!interfaceC5145h.isChecked()) {
            interfaceC5145h.setChecked(true);
        }
        return zAdd;
    }

    public void h() {
        boolean zIsEmpty = this.f40618b.isEmpty();
        Iterator it = this.f40617a.values().iterator();
        while (it.hasNext()) {
            r((InterfaceC5145h) it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        m();
    }

    public Set i() {
        return new HashSet(this.f40618b);
    }

    public List j(ViewGroup viewGroup) {
        Set setI = i();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof InterfaceC5145h) && setI.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int k() {
        if (!this.f40620d || this.f40618b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f40618b.iterator().next()).intValue();
    }

    public boolean l() {
        return this.f40620d;
    }

    public final void m() {
        b bVar = this.f40619c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    public void n(InterfaceC5145h interfaceC5145h) {
        interfaceC5145h.setInternalOnCheckedChangeListener(null);
        this.f40617a.remove(Integer.valueOf(interfaceC5145h.getId()));
        this.f40618b.remove(Integer.valueOf(interfaceC5145h.getId()));
    }

    public void o(b bVar) {
        this.f40619c = bVar;
    }

    public void p(boolean z10) {
        this.f40621e = z10;
    }

    public void q(boolean z10) {
        if (this.f40620d != z10) {
            this.f40620d = z10;
            h();
        }
    }

    public final boolean r(InterfaceC5145h interfaceC5145h, boolean z10) {
        int id2 = interfaceC5145h.getId();
        if (!this.f40618b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z10 && this.f40618b.size() == 1 && this.f40618b.contains(Integer.valueOf(id2))) {
            interfaceC5145h.setChecked(true);
            return false;
        }
        boolean zRemove = this.f40618b.remove(Integer.valueOf(id2));
        if (interfaceC5145h.isChecked()) {
            interfaceC5145h.setChecked(false);
        }
        return zRemove;
    }
}
