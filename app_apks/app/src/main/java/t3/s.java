package t3;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import b0.C2777a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static k f44714c = new C5832a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ThreadLocal f44715d = new ThreadLocal();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ArrayList f44716e = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2777a f44717a = new C2777a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2777a f44718b = new C2777a();

    public static void a(ViewGroup viewGroup, k kVar) {
        if (f44716e.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f44716e.add(viewGroup);
        if (kVar == null) {
            kVar = f44714c;
        }
        k kVarClone = kVar.clone();
        e(viewGroup, kVarClone);
        j.b(viewGroup, null);
        d(viewGroup, kVarClone);
    }

    public static u b(ViewGroup viewGroup, k kVar) {
        if (f44716e.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!kVar.R()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f44716e.add(viewGroup);
        k kVarClone = kVar.clone();
        v vVar = new v();
        vVar.y0(kVarClone);
        e(viewGroup, vVar);
        j.b(viewGroup, null);
        d(viewGroup, vVar);
        viewGroup.invalidate();
        return vVar.x();
    }

    public static C2777a c() {
        C2777a c2777a;
        WeakReference weakReference = (WeakReference) f44715d.get();
        if (weakReference != null && (c2777a = (C2777a) weakReference.get()) != null) {
            return c2777a;
        }
        C2777a c2777a2 = new C2777a();
        f44715d.set(new WeakReference(c2777a2));
        return c2777a2;
    }

    public static void d(ViewGroup viewGroup, k kVar) {
        if (kVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(kVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void e(ViewGroup viewGroup, k kVar) {
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((k) it.next()).d0(viewGroup);
            }
        }
        if (kVar != null) {
            kVar.s(viewGroup, true);
        }
        j.a(viewGroup);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k f44719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewGroup f44720b;

        /* JADX INFO: renamed from: t3.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0605a extends r {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C2777a f44721a;

            public C0605a(C2777a c2777a) {
                this.f44721a = c2777a;
            }

            @Override // t3.r, t3.k.h
            public void i(k kVar) {
                ((ArrayList) this.f44721a.get(a.this.f44720b)).remove(kVar);
                kVar.h0(this);
            }
        }

        public a(k kVar, ViewGroup viewGroup) {
            this.f44719a = kVar;
            this.f44720b = viewGroup;
        }

        public final void a() {
            this.f44720b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f44720b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!s.f44716e.remove(this.f44720b)) {
                return true;
            }
            C2777a c2777aC = s.c();
            ArrayList arrayList = (ArrayList) c2777aC.get(this.f44720b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c2777aC.put(this.f44720b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f44719a);
            this.f44719a.g(new C0605a(c2777aC));
            this.f44719a.s(this.f44720b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).j0(this.f44720b);
                }
            }
            this.f44719a.e0(this.f44720b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            s.f44716e.remove(this.f44720b);
            ArrayList arrayList = (ArrayList) s.c().get(this.f44720b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).j0(this.f44720b);
                }
            }
            this.f44719a.t(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
