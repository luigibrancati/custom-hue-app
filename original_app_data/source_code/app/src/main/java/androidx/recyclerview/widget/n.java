package androidx.recyclerview.widget;

import Y0.C2547a;
import Y0.E;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class n extends C2547a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f24535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f24536e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends C2547a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n f24537d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map f24538e = new WeakHashMap();

        public a(n nVar) {
            this.f24537d = nVar;
        }

        @Override // Y0.C2547a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            C2547a c2547a = (C2547a) this.f24538e.get(view);
            return c2547a != null ? c2547a.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // Y0.C2547a
        public Z0.i b(View view) {
            C2547a c2547a = (C2547a) this.f24538e.get(view);
            return c2547a != null ? c2547a.b(view) : super.b(view);
        }

        @Override // Y0.C2547a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            C2547a c2547a = (C2547a) this.f24538e.get(view);
            if (c2547a != null) {
                c2547a.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // Y0.C2547a
        public void g(View view, Z0.h hVar) {
            if (this.f24537d.o() || this.f24537d.f24535d.getLayoutManager() == null) {
                super.g(view, hVar);
                return;
            }
            this.f24537d.f24535d.getLayoutManager().P0(view, hVar);
            C2547a c2547a = (C2547a) this.f24538e.get(view);
            if (c2547a != null) {
                c2547a.g(view, hVar);
            } else {
                super.g(view, hVar);
            }
        }

        @Override // Y0.C2547a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            C2547a c2547a = (C2547a) this.f24538e.get(view);
            if (c2547a != null) {
                c2547a.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // Y0.C2547a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C2547a c2547a = (C2547a) this.f24538e.get(viewGroup);
            return c2547a != null ? c2547a.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // Y0.C2547a
        public boolean j(View view, int i10, Bundle bundle) {
            if (this.f24537d.o() || this.f24537d.f24535d.getLayoutManager() == null) {
                return super.j(view, i10, bundle);
            }
            C2547a c2547a = (C2547a) this.f24538e.get(view);
            if (c2547a != null) {
                if (c2547a.j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.j(view, i10, bundle)) {
                return true;
            }
            return this.f24537d.f24535d.getLayoutManager().j1(view, i10, bundle);
        }

        @Override // Y0.C2547a
        public void l(View view, int i10) {
            C2547a c2547a = (C2547a) this.f24538e.get(view);
            if (c2547a != null) {
                c2547a.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        @Override // Y0.C2547a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            C2547a c2547a = (C2547a) this.f24538e.get(view);
            if (c2547a != null) {
                c2547a.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public C2547a n(View view) {
            return (C2547a) this.f24538e.remove(view);
        }

        public void o(View view) {
            C2547a c2547aK = E.k(view);
            if (c2547aK == null || c2547aK == this) {
                return;
            }
            this.f24538e.put(view, c2547aK);
        }
    }

    public n(RecyclerView recyclerView) {
        this.f24535d = recyclerView;
        C2547a c2547aN = n();
        if (c2547aN == null || !(c2547aN instanceof a)) {
            this.f24536e = new a(this);
        } else {
            this.f24536e = (a) c2547aN;
        }
    }

    @Override // Y0.C2547a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().L0(accessibilityEvent);
        }
    }

    @Override // Y0.C2547a
    public void g(View view, Z0.h hVar) {
        super.g(view, hVar);
        if (o() || this.f24535d.getLayoutManager() == null) {
            return;
        }
        this.f24535d.getLayoutManager().N0(hVar);
    }

    @Override // Y0.C2547a
    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f24535d.getLayoutManager() == null) {
            return false;
        }
        return this.f24535d.getLayoutManager().h1(i10, bundle);
    }

    public C2547a n() {
        return this.f24536e;
    }

    public boolean o() {
        return this.f24535d.o0();
    }
}
