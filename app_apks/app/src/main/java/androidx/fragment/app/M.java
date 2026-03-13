package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.O;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class M extends androidx.lifecycle.N {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final O.c f23093i = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23097e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f23094b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f23095c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f23096d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23098f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23099g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23100h = false;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements O.c {
        @Override // androidx.lifecycle.O.c
        public androidx.lifecycle.N c(Class cls) {
            return new M(true);
        }
    }

    public M(boolean z10) {
        this.f23097e = z10;
    }

    public static M k(androidx.lifecycle.P p10) {
        return (M) new androidx.lifecycle.O(p10, f23093i).b(M.class);
    }

    @Override // androidx.lifecycle.N
    public void d() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f23098f = true;
    }

    public void e(ComponentCallbacksC2736q componentCallbacksC2736q) {
        if (this.f23100h) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f23094b.containsKey(componentCallbacksC2736q.mWho)) {
                return;
            }
            this.f23094b.put(componentCallbacksC2736q.mWho, componentCallbacksC2736q);
            if (J.L0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + componentCallbacksC2736q);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && M.class == obj.getClass()) {
            M m10 = (M) obj;
            if (this.f23094b.equals(m10.f23094b) && this.f23095c.equals(m10.f23095c) && this.f23096d.equals(m10.f23096d)) {
                return true;
            }
        }
        return false;
    }

    public void f(ComponentCallbacksC2736q componentCallbacksC2736q, boolean z10) {
        if (J.L0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + componentCallbacksC2736q);
        }
        h(componentCallbacksC2736q.mWho, z10);
    }

    public void g(String str, boolean z10) {
        if (J.L0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        h(str, z10);
    }

    public final void h(String str, boolean z10) {
        M m10 = (M) this.f23095c.get(str);
        if (m10 != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(m10.f23095c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m10.g((String) it.next(), true);
                }
            }
            m10.d();
            this.f23095c.remove(str);
        }
        androidx.lifecycle.P p10 = (androidx.lifecycle.P) this.f23096d.get(str);
        if (p10 != null) {
            p10.a();
            this.f23096d.remove(str);
        }
    }

    public int hashCode() {
        return (((this.f23094b.hashCode() * 31) + this.f23095c.hashCode()) * 31) + this.f23096d.hashCode();
    }

    public ComponentCallbacksC2736q i(String str) {
        return (ComponentCallbacksC2736q) this.f23094b.get(str);
    }

    public M j(ComponentCallbacksC2736q componentCallbacksC2736q) {
        M m10 = (M) this.f23095c.get(componentCallbacksC2736q.mWho);
        if (m10 != null) {
            return m10;
        }
        M m11 = new M(this.f23097e);
        this.f23095c.put(componentCallbacksC2736q.mWho, m11);
        return m11;
    }

    public Collection l() {
        return new ArrayList(this.f23094b.values());
    }

    public androidx.lifecycle.P m(ComponentCallbacksC2736q componentCallbacksC2736q) {
        androidx.lifecycle.P p10 = (androidx.lifecycle.P) this.f23096d.get(componentCallbacksC2736q.mWho);
        if (p10 != null) {
            return p10;
        }
        androidx.lifecycle.P p11 = new androidx.lifecycle.P();
        this.f23096d.put(componentCallbacksC2736q.mWho, p11);
        return p11;
    }

    public boolean n() {
        return this.f23098f;
    }

    public void o(ComponentCallbacksC2736q componentCallbacksC2736q) {
        if (this.f23100h) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f23094b.remove(componentCallbacksC2736q.mWho) == null || !J.L0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + componentCallbacksC2736q);
        }
    }

    public void p(boolean z10) {
        this.f23100h = z10;
    }

    public boolean q(ComponentCallbacksC2736q componentCallbacksC2736q) {
        if (this.f23094b.containsKey(componentCallbacksC2736q.mWho)) {
            return this.f23097e ? this.f23098f : !this.f23099g;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f23094b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f23095c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f23096d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
