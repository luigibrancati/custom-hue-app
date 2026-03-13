package t3;

import U0.d;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC2736q;
import androidx.fragment.app.V;
import java.util.ArrayList;
import java.util.List;
import t3.k;

/* JADX INFO: renamed from: t3.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5836e extends V {

    /* JADX INFO: renamed from: t3.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends k.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f44625a;

        public a(Rect rect) {
            this.f44625a = rect;
        }
    }

    /* JADX INFO: renamed from: t3.e$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f44630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f44631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f44632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f44633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f44634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f44635f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f44630a = obj;
            this.f44631b = arrayList;
            this.f44632c = obj2;
            this.f44633d = arrayList2;
            this.f44634e = obj3;
            this.f44635f = arrayList3;
        }

        @Override // t3.r, t3.k.h
        public void i(k kVar) {
            kVar.h0(this);
        }

        @Override // t3.r, t3.k.h
        public void l(k kVar) {
            Object obj = this.f44630a;
            if (obj != null) {
                C5836e.this.E(obj, this.f44631b, null);
            }
            Object obj2 = this.f44632c;
            if (obj2 != null) {
                C5836e.this.E(obj2, this.f44633d, null);
            }
            Object obj3 = this.f44634e;
            if (obj3 != null) {
                C5836e.this.E(obj3, this.f44635f, null);
            }
        }
    }

    /* JADX INFO: renamed from: t3.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0604e extends k.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f44639a;

        public C0604e(Rect rect) {
            this.f44639a = rect;
        }
    }

    public static /* synthetic */ void C(Runnable runnable, k kVar, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            kVar.cancel();
            runnable2.run();
        }
    }

    public static boolean D(k kVar) {
        return (V.l(kVar.J()) && V.l(kVar.K()) && V.l(kVar.L())) ? false : true;
    }

    @Override // androidx.fragment.app.V
    public void A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        v vVar = (v) obj;
        if (vVar != null) {
            vVar.M().clear();
            vVar.M().addAll(arrayList2);
            E(vVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.V
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        v vVar = new v();
        vVar.y0((k) obj);
        return vVar;
    }

    public void E(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        k kVar = (k) obj;
        int i10 = 0;
        if (kVar instanceof v) {
            v vVar = (v) kVar;
            int iB0 = vVar.B0();
            while (i10 < iB0) {
                E(vVar.A0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (D(kVar)) {
            return;
        }
        List listM = kVar.M();
        if (listM.size() == arrayList.size() && listM.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                kVar.i((View) arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                kVar.i0((View) arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.V
    public void a(Object obj, View view) {
        if (obj != null) {
            ((k) obj).i(view);
        }
    }

    @Override // androidx.fragment.app.V
    public void b(Object obj, ArrayList arrayList) {
        k kVar = (k) obj;
        if (kVar == null) {
            return;
        }
        int i10 = 0;
        if (kVar instanceof v) {
            v vVar = (v) kVar;
            int iB0 = vVar.B0();
            while (i10 < iB0) {
                b(vVar.A0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (D(kVar) || !V.l(kVar.M())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            kVar.i((View) arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.V
    public void c(Object obj) {
        ((u) obj).c();
    }

    @Override // androidx.fragment.app.V
    public void d(Object obj, Runnable runnable) {
        ((u) obj).k(runnable);
    }

    @Override // androidx.fragment.app.V
    public void e(ViewGroup viewGroup, Object obj) {
        s.a(viewGroup, (k) obj);
    }

    @Override // androidx.fragment.app.V
    public boolean g(Object obj) {
        return obj instanceof k;
    }

    @Override // androidx.fragment.app.V
    public Object h(Object obj) {
        if (obj != null) {
            return ((k) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.V
    public Object j(ViewGroup viewGroup, Object obj) {
        return s.b(viewGroup, (k) obj);
    }

    @Override // androidx.fragment.app.V
    public boolean m() {
        return true;
    }

    @Override // androidx.fragment.app.V
    public boolean n(Object obj) {
        boolean zR = ((k) obj).R();
        if (!zR) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zR;
    }

    @Override // androidx.fragment.app.V
    public Object o(Object obj, Object obj2, Object obj3) {
        k kVarI0 = (k) obj;
        k kVar = (k) obj2;
        k kVar2 = (k) obj3;
        if (kVarI0 != null && kVar != null) {
            kVarI0 = new v().y0(kVarI0).y0(kVar).I0(1);
        } else if (kVarI0 == null) {
            kVarI0 = kVar != null ? kVar : null;
        }
        if (kVar2 == null) {
            return kVarI0;
        }
        v vVar = new v();
        if (kVarI0 != null) {
            vVar.y0(kVarI0);
        }
        vVar.y0(kVar2);
        return vVar;
    }

    @Override // androidx.fragment.app.V
    public Object p(Object obj, Object obj2, Object obj3) {
        v vVar = new v();
        if (obj != null) {
            vVar.y0((k) obj);
        }
        if (obj2 != null) {
            vVar.y0((k) obj2);
        }
        if (obj3 != null) {
            vVar.y0((k) obj3);
        }
        return vVar;
    }

    @Override // androidx.fragment.app.V
    public void r(Object obj, View view, ArrayList arrayList) {
        ((k) obj).g(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.V
    public void s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((k) obj).g(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.V
    public void t(Object obj, float f10) {
        u uVar = (u) obj;
        if (uVar.isReady()) {
            long jF = (long) (f10 * uVar.f());
            if (jF == 0) {
                jF = 1;
            }
            if (jF == uVar.f()) {
                jF = uVar.f() - 1;
            }
            uVar.h(jF);
        }
    }

    @Override // androidx.fragment.app.V
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((k) obj).o0(new C0604e(rect));
        }
    }

    @Override // androidx.fragment.app.V
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((k) obj).o0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.V
    public void w(ComponentCallbacksC2736q componentCallbacksC2736q, Object obj, U0.d dVar, Runnable runnable) {
        x(componentCallbacksC2736q, obj, dVar, null, runnable);
    }

    @Override // androidx.fragment.app.V
    public void x(ComponentCallbacksC2736q componentCallbacksC2736q, Object obj, U0.d dVar, final Runnable runnable, final Runnable runnable2) {
        final k kVar = (k) obj;
        dVar.b(new d.a() { // from class: t3.d
            @Override // U0.d.a
            public final void onCancel() {
                C5836e.C(runnable, kVar, runnable2);
            }
        });
        kVar.g(new d(runnable2));
    }

    @Override // androidx.fragment.app.V
    public void z(Object obj, View view, ArrayList arrayList) {
        v vVar = (v) obj;
        List listM = vVar.M();
        listM.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            V.f(listM, (View) arrayList.get(i10));
        }
        listM.add(view);
        arrayList.add(view);
        b(vVar, arrayList);
    }

    /* JADX INFO: renamed from: t3.e$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements k.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f44627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f44628b;

        public b(View view, ArrayList arrayList) {
            this.f44627a = view;
            this.f44628b = arrayList;
        }

        @Override // t3.k.h
        public void i(k kVar) {
            kVar.h0(this);
            this.f44627a.setVisibility(8);
            int size = this.f44628b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f44628b.get(i10)).setVisibility(0);
            }
        }

        @Override // t3.k.h
        public void l(k kVar) {
            kVar.h0(this);
            kVar.g(this);
        }

        @Override // t3.k.h
        public void a(k kVar) {
        }

        @Override // t3.k.h
        public void d(k kVar) {
        }

        @Override // t3.k.h
        public void e(k kVar) {
        }
    }

    /* JADX INFO: renamed from: t3.e$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements k.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f44637a;

        public d(Runnable runnable) {
            this.f44637a = runnable;
        }

        @Override // t3.k.h
        public void i(k kVar) {
            this.f44637a.run();
        }

        @Override // t3.k.h
        public void a(k kVar) {
        }

        @Override // t3.k.h
        public void d(k kVar) {
        }

        @Override // t3.k.h
        public void e(k kVar) {
        }

        @Override // t3.k.h
        public void l(k kVar) {
        }
    }
}
