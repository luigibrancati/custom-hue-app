package androidx.recyclerview.widget;

import Y0.E;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class d extends p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f24329s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f24330h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f24331i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f24332j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f24333k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f24334l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f24335m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f24336n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f24337o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f24338p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f24339q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f24340r = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f24341a;

        public a(ArrayList arrayList) {
            this.f24341a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (j jVar : this.f24341a) {
                d.this.U(jVar.f24375a, jVar.f24376b, jVar.f24377c, jVar.f24378d, jVar.f24379e);
            }
            this.f24341a.clear();
            d.this.f24335m.remove(this.f24341a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f24343a;

        public b(ArrayList arrayList) {
            this.f24343a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f24343a.iterator();
            while (it.hasNext()) {
                d.this.T((i) it.next());
            }
            this.f24343a.clear();
            d.this.f24336n.remove(this.f24343a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f24345a;

        public c(ArrayList arrayList) {
            this.f24345a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f24345a.iterator();
            while (it.hasNext()) {
                d.this.S((RecyclerView.E) it.next());
            }
            this.f24345a.clear();
            d.this.f24334l.remove(this.f24345a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0310d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.E f24347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f24348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f24349c;

        public C0310d(RecyclerView.E e10, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f24347a = e10;
            this.f24348b = viewPropertyAnimator;
            this.f24349c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f24348b.setListener(null);
            this.f24349c.setAlpha(1.0f);
            d.this.H(this.f24347a);
            d.this.f24339q.remove(this.f24347a);
            d.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.I(this.f24347a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.E f24351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f24352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f24353c;

        public e(RecyclerView.E e10, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f24351a = e10;
            this.f24352b = view;
            this.f24353c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f24352b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f24353c.setListener(null);
            d.this.B(this.f24351a);
            d.this.f24337o.remove(this.f24351a);
            d.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.C(this.f24351a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.E f24355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f24356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f24357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f24358d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f24359e;

        public f(RecyclerView.E e10, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f24355a = e10;
            this.f24356b = i10;
            this.f24357c = view;
            this.f24358d = i11;
            this.f24359e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f24356b != 0) {
                this.f24357c.setTranslationX(0.0f);
            }
            if (this.f24358d != 0) {
                this.f24357c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f24359e.setListener(null);
            d.this.F(this.f24355a);
            d.this.f24338p.remove(this.f24355a);
            d.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.G(this.f24355a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f24361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f24362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f24363c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f24361a = iVar;
            this.f24362b = viewPropertyAnimator;
            this.f24363c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f24362b.setListener(null);
            this.f24363c.setAlpha(1.0f);
            this.f24363c.setTranslationX(0.0f);
            this.f24363c.setTranslationY(0.0f);
            d.this.D(this.f24361a.f24369a, true);
            d.this.f24340r.remove(this.f24361a.f24369a);
            d.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.E(this.f24361a.f24369a, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f24365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f24366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f24367c;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f24365a = iVar;
            this.f24366b = viewPropertyAnimator;
            this.f24367c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f24366b.setListener(null);
            this.f24367c.setAlpha(1.0f);
            this.f24367c.setTranslationX(0.0f);
            this.f24367c.setTranslationY(0.0f);
            d.this.D(this.f24365a.f24370b, false);
            d.this.f24340r.remove(this.f24365a.f24370b);
            d.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.E(this.f24365a.f24370b, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.E f24375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24379e;

        public j(RecyclerView.E e10, int i10, int i11, int i12, int i13) {
            this.f24375a = e10;
            this.f24376b = i10;
            this.f24377c = i11;
            this.f24378d = i12;
            this.f24379e = i13;
        }
    }

    @Override // androidx.recyclerview.widget.p
    public boolean A(RecyclerView.E e10) {
        b0(e10);
        this.f24330h.add(e10);
        return true;
    }

    public void S(RecyclerView.E e10) {
        View view = e10.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f24337o.add(e10);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(e10, view, viewPropertyAnimatorAnimate)).start();
    }

    public void T(i iVar) {
        RecyclerView.E e10 = iVar.f24369a;
        View view = e10 == null ? null : e10.itemView;
        RecyclerView.E e11 = iVar.f24370b;
        View view2 = e11 != null ? e11.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f24340r.add(iVar.f24369a);
            duration.translationX(iVar.f24373e - iVar.f24371c);
            duration.translationY(iVar.f24374f - iVar.f24372d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f24340r.add(iVar.f24370b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    public void U(RecyclerView.E e10, int i10, int i11, int i12, int i13) {
        View view = e10.itemView;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f24338p.add(e10);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(e10, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    public final void V(RecyclerView.E e10) {
        View view = e10.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f24339q.add(e10);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new C0310d(e10, viewPropertyAnimatorAnimate, view)).start();
    }

    public void W(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.E) list.get(size)).itemView.animate().cancel();
        }
    }

    public void X() {
        if (p()) {
            return;
        }
        i();
    }

    public final void Y(List list, RecyclerView.E e10) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (a0(iVar, e10) && iVar.f24369a == null && iVar.f24370b == null) {
                list.remove(iVar);
            }
        }
    }

    public final void Z(i iVar) {
        RecyclerView.E e10 = iVar.f24369a;
        if (e10 != null) {
            a0(iVar, e10);
        }
        RecyclerView.E e11 = iVar.f24370b;
        if (e11 != null) {
            a0(iVar, e11);
        }
    }

    public final boolean a0(i iVar, RecyclerView.E e10) {
        boolean z10 = false;
        if (iVar.f24370b == e10) {
            iVar.f24370b = null;
        } else {
            if (iVar.f24369a != e10) {
                return false;
            }
            iVar.f24369a = null;
            z10 = true;
        }
        e10.itemView.setAlpha(1.0f);
        e10.itemView.setTranslationX(0.0f);
        e10.itemView.setTranslationY(0.0f);
        D(e10, z10);
        return true;
    }

    public final void b0(RecyclerView.E e10) {
        if (f24329s == null) {
            f24329s = new ValueAnimator().getInterpolator();
        }
        e10.itemView.animate().setInterpolator(f24329s);
        j(e10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.E e10, List list) {
        return !list.isEmpty() || super.g(e10, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j(RecyclerView.E e10) {
        View view = e10.itemView;
        view.animate().cancel();
        int size = this.f24332j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f24332j.get(size)).f24375a == e10) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                F(e10);
                this.f24332j.remove(size);
            }
        }
        Y(this.f24333k, e10);
        if (this.f24330h.remove(e10)) {
            view.setAlpha(1.0f);
            H(e10);
        }
        if (this.f24331i.remove(e10)) {
            view.setAlpha(1.0f);
            B(e10);
        }
        for (int size2 = this.f24336n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f24336n.get(size2);
            Y(arrayList, e10);
            if (arrayList.isEmpty()) {
                this.f24336n.remove(size2);
            }
        }
        for (int size3 = this.f24335m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f24335m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f24375a == e10) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    F(e10);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f24335m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f24334l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f24334l.get(size5);
            if (arrayList3.remove(e10)) {
                view.setAlpha(1.0f);
                B(e10);
                if (arrayList3.isEmpty()) {
                    this.f24334l.remove(size5);
                }
            }
        }
        this.f24339q.remove(e10);
        this.f24337o.remove(e10);
        this.f24340r.remove(e10);
        this.f24338p.remove(e10);
        X();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        int size = this.f24332j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f24332j.get(size);
            View view = jVar.f24375a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            F(jVar.f24375a);
            this.f24332j.remove(size);
        }
        for (int size2 = this.f24330h.size() - 1; size2 >= 0; size2--) {
            H((RecyclerView.E) this.f24330h.get(size2));
            this.f24330h.remove(size2);
        }
        int size3 = this.f24331i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.E e10 = (RecyclerView.E) this.f24331i.get(size3);
            e10.itemView.setAlpha(1.0f);
            B(e10);
            this.f24331i.remove(size3);
        }
        for (int size4 = this.f24333k.size() - 1; size4 >= 0; size4--) {
            Z((i) this.f24333k.get(size4));
        }
        this.f24333k.clear();
        if (p()) {
            for (int size5 = this.f24335m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f24335m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f24375a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    F(jVar2.f24375a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f24335m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f24334l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f24334l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.E e11 = (RecyclerView.E) arrayList2.get(size8);
                    e11.itemView.setAlpha(1.0f);
                    B(e11);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f24334l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f24336n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f24336n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    Z((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f24336n.remove(arrayList3);
                    }
                }
            }
            W(this.f24339q);
            W(this.f24338p);
            W(this.f24337o);
            W(this.f24340r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return (this.f24331i.isEmpty() && this.f24333k.isEmpty() && this.f24332j.isEmpty() && this.f24330h.isEmpty() && this.f24338p.isEmpty() && this.f24339q.isEmpty() && this.f24337o.isEmpty() && this.f24340r.isEmpty() && this.f24335m.isEmpty() && this.f24334l.isEmpty() && this.f24336n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void v() {
        boolean zIsEmpty = this.f24330h.isEmpty();
        boolean zIsEmpty2 = this.f24332j.isEmpty();
        boolean zIsEmpty3 = this.f24333k.isEmpty();
        boolean zIsEmpty4 = this.f24331i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator it = this.f24330h.iterator();
        while (it.hasNext()) {
            V((RecyclerView.E) it.next());
        }
        this.f24330h.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f24332j);
            this.f24335m.add(arrayList);
            this.f24332j.clear();
            a aVar = new a(arrayList);
            if (zIsEmpty) {
                aVar.run();
            } else {
                E.Y(((j) arrayList.get(0)).f24375a.itemView, aVar, o());
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f24333k);
            this.f24336n.add(arrayList2);
            this.f24333k.clear();
            b bVar = new b(arrayList2);
            if (zIsEmpty) {
                bVar.run();
            } else {
                E.Y(((i) arrayList2.get(0)).f24369a.itemView, bVar, o());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.f24331i);
        this.f24334l.add(arrayList3);
        this.f24331i.clear();
        c cVar = new c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
        } else {
            E.Y(((RecyclerView.E) arrayList3.get(0)).itemView, cVar, (!zIsEmpty ? o() : 0L) + Math.max(!zIsEmpty2 ? n() : 0L, zIsEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.p
    public boolean x(RecyclerView.E e10) {
        b0(e10);
        e10.itemView.setAlpha(0.0f);
        this.f24331i.add(e10);
        return true;
    }

    @Override // androidx.recyclerview.widget.p
    public boolean y(RecyclerView.E e10, RecyclerView.E e11, int i10, int i11, int i12, int i13) {
        if (e10 == e11) {
            return z(e10, i10, i11, i12, i13);
        }
        float translationX = e10.itemView.getTranslationX();
        float translationY = e10.itemView.getTranslationY();
        float alpha = e10.itemView.getAlpha();
        b0(e10);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        e10.itemView.setTranslationX(translationX);
        e10.itemView.setTranslationY(translationY);
        e10.itemView.setAlpha(alpha);
        if (e11 != null) {
            b0(e11);
            e11.itemView.setTranslationX(-i14);
            e11.itemView.setTranslationY(-i15);
            e11.itemView.setAlpha(0.0f);
        }
        this.f24333k.add(new i(e10, e11, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.p
    public boolean z(RecyclerView.E e10, int i10, int i11, int i12, int i13) {
        View view = e10.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) e10.itemView.getTranslationY());
        b0(e10);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            F(e10);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f24332j.add(new j(e10, translationX, translationY, i12, i13));
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.E f24369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.E f24370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24372d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24373e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f24374f;

        public i(RecyclerView.E e10, RecyclerView.E e11) {
            this.f24369a = e10;
            this.f24370b = e11;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f24369a + ", newHolder=" + this.f24370b + ", fromX=" + this.f24371c + ", fromY=" + this.f24372d + ", toX=" + this.f24373e + ", toY=" + this.f24374f + '}';
        }

        public i(RecyclerView.E e10, RecyclerView.E e11, int i10, int i11, int i12, int i13) {
            this(e10, e11);
            this.f24371c = i10;
            this.f24372d = i11;
            this.f24373e = i12;
            this.f24374f = i13;
        }
    }
}
