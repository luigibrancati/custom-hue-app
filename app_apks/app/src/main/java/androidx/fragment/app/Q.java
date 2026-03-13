package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23124a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f23125b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f23126c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public M f23127d;

    public void A(M m10) {
        this.f23127d = m10;
    }

    public Bundle B(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.f23126c.put(str, bundle) : (Bundle) this.f23126c.remove(str);
    }

    public void a(ComponentCallbacksC2736q componentCallbacksC2736q) {
        if (this.f23124a.contains(componentCallbacksC2736q)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC2736q);
        }
        synchronized (this.f23124a) {
            this.f23124a.add(componentCallbacksC2736q);
        }
        componentCallbacksC2736q.mAdded = true;
    }

    public void b() {
        this.f23125b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.f23125b.get(str) != null;
    }

    public void d(int i10) {
        for (P p10 : this.f23125b.values()) {
            if (p10 != null) {
                p10.s(i10);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f23125b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (P p10 : this.f23125b.values()) {
                printWriter.print(str);
                if (p10 != null) {
                    ComponentCallbacksC2736q componentCallbacksC2736qK = p10.k();
                    printWriter.println(componentCallbacksC2736qK);
                    componentCallbacksC2736qK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f23124a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                ComponentCallbacksC2736q componentCallbacksC2736q = (ComponentCallbacksC2736q) this.f23124a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC2736q.toString());
            }
        }
    }

    public ComponentCallbacksC2736q f(String str) {
        P p10 = (P) this.f23125b.get(str);
        if (p10 != null) {
            return p10.k();
        }
        return null;
    }

    public ComponentCallbacksC2736q g(int i10) {
        for (int size = this.f23124a.size() - 1; size >= 0; size--) {
            ComponentCallbacksC2736q componentCallbacksC2736q = (ComponentCallbacksC2736q) this.f23124a.get(size);
            if (componentCallbacksC2736q != null && componentCallbacksC2736q.mFragmentId == i10) {
                return componentCallbacksC2736q;
            }
        }
        for (P p10 : this.f23125b.values()) {
            if (p10 != null) {
                ComponentCallbacksC2736q componentCallbacksC2736qK = p10.k();
                if (componentCallbacksC2736qK.mFragmentId == i10) {
                    return componentCallbacksC2736qK;
                }
            }
        }
        return null;
    }

    public ComponentCallbacksC2736q h(String str) {
        if (str != null) {
            for (int size = this.f23124a.size() - 1; size >= 0; size--) {
                ComponentCallbacksC2736q componentCallbacksC2736q = (ComponentCallbacksC2736q) this.f23124a.get(size);
                if (componentCallbacksC2736q != null && str.equals(componentCallbacksC2736q.mTag)) {
                    return componentCallbacksC2736q;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (P p10 : this.f23125b.values()) {
            if (p10 != null) {
                ComponentCallbacksC2736q componentCallbacksC2736qK = p10.k();
                if (str.equals(componentCallbacksC2736qK.mTag)) {
                    return componentCallbacksC2736qK;
                }
            }
        }
        return null;
    }

    public ComponentCallbacksC2736q i(String str) {
        ComponentCallbacksC2736q componentCallbacksC2736qFindFragmentByWho;
        for (P p10 : this.f23125b.values()) {
            if (p10 != null && (componentCallbacksC2736qFindFragmentByWho = p10.k().findFragmentByWho(str)) != null) {
                return componentCallbacksC2736qFindFragmentByWho;
            }
        }
        return null;
    }

    public int j(ComponentCallbacksC2736q componentCallbacksC2736q) {
        View view;
        View view2;
        ViewGroup viewGroup = componentCallbacksC2736q.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f23124a.indexOf(componentCallbacksC2736q);
        for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
            ComponentCallbacksC2736q componentCallbacksC2736q2 = (ComponentCallbacksC2736q) this.f23124a.get(i10);
            if (componentCallbacksC2736q2.mContainer == viewGroup && (view2 = componentCallbacksC2736q2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f23124a.size()) {
                return -1;
            }
            ComponentCallbacksC2736q componentCallbacksC2736q3 = (ComponentCallbacksC2736q) this.f23124a.get(iIndexOf);
            if (componentCallbacksC2736q3.mContainer == viewGroup && (view = componentCallbacksC2736q3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List k() {
        ArrayList arrayList = new ArrayList();
        for (P p10 : this.f23125b.values()) {
            if (p10 != null) {
                arrayList.add(p10);
            }
        }
        return arrayList;
    }

    public List l() {
        ArrayList arrayList = new ArrayList();
        for (P p10 : this.f23125b.values()) {
            if (p10 != null) {
                arrayList.add(p10.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public HashMap m() {
        return this.f23126c;
    }

    public P n(String str) {
        return (P) this.f23125b.get(str);
    }

    public List o() {
        ArrayList arrayList;
        if (this.f23124a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f23124a) {
            arrayList = new ArrayList(this.f23124a);
        }
        return arrayList;
    }

    public M p() {
        return this.f23127d;
    }

    public Bundle q(String str) {
        return (Bundle) this.f23126c.get(str);
    }

    public void r(P p10) {
        ComponentCallbacksC2736q componentCallbacksC2736qK = p10.k();
        if (c(componentCallbacksC2736qK.mWho)) {
            return;
        }
        this.f23125b.put(componentCallbacksC2736qK.mWho, p10);
        if (componentCallbacksC2736qK.mRetainInstanceChangedWhileDetached) {
            if (componentCallbacksC2736qK.mRetainInstance) {
                this.f23127d.e(componentCallbacksC2736qK);
            } else {
                this.f23127d.o(componentCallbacksC2736qK);
            }
            componentCallbacksC2736qK.mRetainInstanceChangedWhileDetached = false;
        }
        if (J.L0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + componentCallbacksC2736qK);
        }
    }

    public void s(P p10) {
        ComponentCallbacksC2736q componentCallbacksC2736qK = p10.k();
        if (componentCallbacksC2736qK.mRetainInstance) {
            this.f23127d.o(componentCallbacksC2736qK);
        }
        if (this.f23125b.get(componentCallbacksC2736qK.mWho) == p10 && ((P) this.f23125b.put(componentCallbacksC2736qK.mWho, null)) != null && J.L0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + componentCallbacksC2736qK);
        }
    }

    public void t() {
        Iterator it = this.f23124a.iterator();
        while (it.hasNext()) {
            P p10 = (P) this.f23125b.get(((ComponentCallbacksC2736q) it.next()).mWho);
            if (p10 != null) {
                p10.m();
            }
        }
        for (P p11 : this.f23125b.values()) {
            if (p11 != null) {
                p11.m();
                ComponentCallbacksC2736q componentCallbacksC2736qK = p11.k();
                if (componentCallbacksC2736qK.mRemoving && !componentCallbacksC2736qK.isInBackStack()) {
                    if (componentCallbacksC2736qK.mBeingSaved && !this.f23126c.containsKey(componentCallbacksC2736qK.mWho)) {
                        B(componentCallbacksC2736qK.mWho, p11.q());
                    }
                    s(p11);
                }
            }
        }
    }

    public void u(ComponentCallbacksC2736q componentCallbacksC2736q) {
        synchronized (this.f23124a) {
            this.f23124a.remove(componentCallbacksC2736q);
        }
        componentCallbacksC2736q.mAdded = false;
    }

    public void v() {
        this.f23125b.clear();
    }

    public void w(List list) {
        this.f23124a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                ComponentCallbacksC2736q componentCallbacksC2736qF = f(str);
                if (componentCallbacksC2736qF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (J.L0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + componentCallbacksC2736qF);
                }
                a(componentCallbacksC2736qF);
            }
        }
    }

    public void x(HashMap map) {
        this.f23126c.clear();
        this.f23126c.putAll(map);
    }

    public ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f23125b.size());
        for (P p10 : this.f23125b.values()) {
            if (p10 != null) {
                ComponentCallbacksC2736q componentCallbacksC2736qK = p10.k();
                B(componentCallbacksC2736qK.mWho, p10.q());
                arrayList.add(componentCallbacksC2736qK.mWho);
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Saved state of " + componentCallbacksC2736qK + ": " + componentCallbacksC2736qK.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    public ArrayList z() {
        synchronized (this.f23124a) {
            try {
                if (this.f23124a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f23124a.size());
                for (ComponentCallbacksC2736q componentCallbacksC2736q : this.f23124a) {
                    arrayList.add(componentCallbacksC2736q.mWho);
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + componentCallbacksC2736q.mWho + "): " + componentCallbacksC2736q);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
