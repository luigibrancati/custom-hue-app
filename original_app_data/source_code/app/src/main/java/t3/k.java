package t3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import b0.C2777a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m1.AbstractC5003b;
import m1.C5005d;
import m1.C5006e;
import m1.C5007f;
import t3.k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements Cloneable {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final Animator[] f44646R = new Animator[0];

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int[] f44647S = {2, 1, 3, 4};

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final AbstractC5838g f44648T = new a();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static ThreadLocal f44649V = new ThreadLocal();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public t f44655F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public e f44656G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public C2777a f44657H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f44659J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public g f44660P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f44661Q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f44681t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f44682u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h[] f44683v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f44662a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f44663b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f44664c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f44665d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f44666e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f44667f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f44668g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f44669h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f44670i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f44671j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f44672k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f44673l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f44674m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f44675n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f44676o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y f44677p = new y();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public y f44678q = new y();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v f44679r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f44680s = f44647S;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f44684w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f44685x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Animator[] f44686y = f44646R;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f44687z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f44650A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f44651B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public k f44652C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ArrayList f44653D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ArrayList f44654E = new ArrayList();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public AbstractC5838g f44658I = f44648T;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC5838g {
        @Override // t3.AbstractC5838g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2777a f44688a;

        public b(C2777a c2777a) {
            this.f44688a = c2777a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f44688a.remove(animator);
            k.this.f44685x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            k.this.f44685x.add(animator);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            k.this.y();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f44691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f44692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public x f44693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public WindowId f44694d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public k f44695e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Animator f44696f;

        public d(View view, String str, k kVar, WindowId windowId, x xVar, Animator animator) {
            this.f44691a = view;
            this.f44692b = str;
            this.f44693c = xVar;
            this.f44694d = windowId;
            this.f44695e = kVar;
            this.f44696f = animator;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class e {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f {
        public static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        public static void b(Animator animator, long j10) {
            ((AnimatorSet) animator).setCurrentPlayTime(j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class g extends r implements u, AbstractC5003b.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f44700d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f44701e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C5006e f44703g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Runnable f44706j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f44697a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f44698b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f44699c = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f44702f = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public X0.a[] f44704h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final z f44705i = new z();

        public g() {
        }

        public static /* synthetic */ void m(g gVar, AbstractC5003b abstractC5003b, boolean z10, float f10, float f11) {
            if (z10) {
                gVar.getClass();
                return;
            }
            if (f10 >= 1.0f) {
                k.this.c0(i.f44709b, false);
                return;
            }
            long jF = gVar.f();
            k kVarA0 = ((v) k.this).A0(0);
            k kVar = kVarA0.f44652C;
            kVarA0.f44652C = null;
            k.this.m0(-1L, gVar.f44697a);
            k.this.m0(jF, -1L);
            gVar.f44697a = jF;
            Runnable runnable = gVar.f44706j;
            if (runnable != null) {
                runnable.run();
            }
            k.this.f44654E.clear();
            if (kVar != null) {
                kVar.c0(i.f44709b, true);
            }
        }

        @Override // t3.r, t3.k.h
        public void a(k kVar) {
            this.f44701e = true;
        }

        @Override // t3.u
        public void c() {
            if (this.f44700d) {
                o();
                this.f44703g.s(f() + 1);
            } else {
                this.f44702f = 1;
                this.f44706j = null;
            }
        }

        @Override // t3.u
        public long f() {
            return k.this.N();
        }

        @Override // m1.AbstractC5003b.r
        public void g(AbstractC5003b abstractC5003b, float f10, float f11) {
            long jMax = Math.max(-1L, Math.min(f() + 1, Math.round(f10)));
            k.this.m0(jMax, this.f44697a);
            this.f44697a = jMax;
            n();
        }

        @Override // t3.u
        public void h(long j10) {
            if (this.f44703g != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j10 == this.f44697a || !isReady()) {
                return;
            }
            if (!this.f44701e) {
                if (j10 != 0 || this.f44697a <= 0) {
                    long jF = f();
                    if (j10 == jF && this.f44697a < jF) {
                        j10 = 1 + jF;
                    }
                } else {
                    j10 = -1;
                }
                long j11 = this.f44697a;
                if (j10 != j11) {
                    k.this.m0(j10, j11);
                    this.f44697a = j10;
                }
            }
            n();
            this.f44705i.a(AnimationUtils.currentAnimationTimeMillis(), j10);
        }

        @Override // t3.u
        public boolean isReady() {
            return this.f44700d;
        }

        @Override // t3.u
        public void k(Runnable runnable) {
            this.f44706j = runnable;
            if (!this.f44700d) {
                this.f44702f = 2;
            } else {
                o();
                this.f44703g.s(0.0f);
            }
        }

        public final void n() {
            ArrayList arrayList = this.f44699c;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f44699c.size();
            if (this.f44704h == null) {
                this.f44704h = new X0.a[size];
            }
            X0.a[] aVarArr = (X0.a[]) this.f44699c.toArray(this.f44704h);
            this.f44704h = null;
            for (int i10 = 0; i10 < size; i10++) {
                aVarArr[i10].accept(this);
                aVarArr[i10] = null;
            }
            this.f44704h = aVarArr;
        }

        public final void o() {
            if (this.f44703g != null) {
                return;
            }
            this.f44705i.a(AnimationUtils.currentAnimationTimeMillis(), this.f44697a);
            this.f44703g = new C5006e(new C5005d());
            C5007f c5007f = new C5007f();
            c5007f.d(1.0f);
            c5007f.f(200.0f);
            this.f44703g.v(c5007f);
            this.f44703g.m(this.f44697a);
            this.f44703g.c(this);
            this.f44703g.n(this.f44705i.b());
            this.f44703g.i(f() + 1);
            this.f44703g.j(-1.0f);
            this.f44703g.k(4.0f);
            this.f44703g.b(new AbstractC5003b.q() { // from class: t3.l
                @Override // m1.AbstractC5003b.q
                public final void a(AbstractC5003b abstractC5003b, boolean z10, float f10, float f11) {
                    k.g.m(this.f44713a, abstractC5003b, z10, f10, f11);
                }
            });
        }

        public void p() {
            long j10 = f() == 0 ? 1L : 0L;
            k.this.m0(j10, this.f44697a);
            this.f44697a = j10;
        }

        public void q() {
            this.f44700d = true;
            ArrayList arrayList = this.f44698b;
            if (arrayList != null) {
                this.f44698b = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((X0.a) arrayList.get(i10)).accept(this);
                }
            }
            n();
            int i11 = this.f44702f;
            if (i11 == 1) {
                this.f44702f = 0;
                c();
            } else if (i11 == 2) {
                this.f44702f = 0;
                k(this.f44706j);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface h {
        void a(k kVar);

        default void b(k kVar, boolean z10) {
            i(kVar);
        }

        void d(k kVar);

        void e(k kVar);

        void i(k kVar);

        default void j(k kVar, boolean z10) {
            l(kVar);
        }

        void l(k kVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f44708a = new i() { // from class: t3.m
            @Override // t3.k.i
            public final void d(k.h hVar, k kVar, boolean z10) {
                hVar.j(kVar, z10);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f44709b = new i() { // from class: t3.n
            @Override // t3.k.i
            public final void d(k.h hVar, k kVar, boolean z10) {
                hVar.b(kVar, z10);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f44710c = new i() { // from class: t3.o
            @Override // t3.k.i
            public final void d(k.h hVar, k kVar, boolean z10) {
                hVar.a(kVar);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f44711d = new i() { // from class: t3.p
            @Override // t3.k.i
            public final void d(k.h hVar, k kVar, boolean z10) {
                hVar.e(kVar);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final i f44712e = new i() { // from class: t3.q
            @Override // t3.k.i
            public final void d(k.h hVar, k kVar, boolean z10) {
                hVar.d(kVar);
            }
        };

        void d(h hVar, k kVar, boolean z10);
    }

    public static C2777a H() {
        C2777a c2777a = (C2777a) f44649V.get();
        if (c2777a != null) {
            return c2777a;
        }
        C2777a c2777a2 = new C2777a();
        f44649V.set(c2777a2);
        return c2777a2;
    }

    public static boolean U(x xVar, x xVar2, String str) {
        Object obj = xVar.f44734a.get(str);
        Object obj2 = xVar2.f44734a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void m(y yVar, View view, x xVar) {
        yVar.f44737a.put(view, xVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (yVar.f44738b.indexOfKey(id2) >= 0) {
                yVar.f44738b.put(id2, null);
            } else {
                yVar.f44738b.put(id2, view);
            }
        }
        String strD = Y0.E.D(view);
        if (strD != null) {
            if (yVar.f44740d.containsKey(strD)) {
                yVar.f44740d.put(strD, null);
            } else {
                yVar.f44740d.put(strD, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (yVar.f44739c.i(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    yVar.f44739c.m(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) yVar.f44739c.g(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    yVar.f44739c.m(itemIdAtPosition, null);
                }
            }
        }
    }

    public e A() {
        return this.f44656G;
    }

    public TimeInterpolator B() {
        return this.f44665d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r5 = r5.f44682u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r5 = r5.f44681t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return (t3.x) r5.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t3.x C(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            t3.v r0 = r5.f44679r
            if (r0 == 0) goto L9
            t3.x r5 = r0.C(r6, r7)
            return r5
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.f44681t
            goto L10
        Le:
            java.util.ArrayList r0 = r5.f44682u
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            t3.x r4 = (t3.x) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f44735b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r5 = r5.f44682u
            goto L36
        L34:
            java.util.ArrayList r5 = r5.f44681t
        L36:
            java.lang.Object r5 = r5.get(r3)
            t3.x r5 = (t3.x) r5
            return r5
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.k.C(android.view.View, boolean):t3.x");
    }

    public String D() {
        return this.f44662a;
    }

    public AbstractC5838g E() {
        return this.f44658I;
    }

    public t F() {
        return this.f44655F;
    }

    public final k G() {
        v vVar = this.f44679r;
        return vVar != null ? vVar.G() : this;
    }

    public long I() {
        return this.f44663b;
    }

    public List J() {
        return this.f44666e;
    }

    public List K() {
        return this.f44668g;
    }

    public List L() {
        return this.f44669h;
    }

    public List M() {
        return this.f44667f;
    }

    public final long N() {
        return this.f44659J;
    }

    public String[] O() {
        return null;
    }

    public x P(View view, boolean z10) {
        v vVar = this.f44679r;
        if (vVar != null) {
            return vVar.P(view, z10);
        }
        return (x) (z10 ? this.f44677p : this.f44678q).f44737a.get(view);
    }

    public boolean Q() {
        return !this.f44685x.isEmpty();
    }

    public boolean R() {
        return false;
    }

    public boolean S(x xVar, x xVar2) {
        if (xVar != null && xVar2 != null) {
            String[] strArrO = O();
            if (strArrO != null) {
                for (String str : strArrO) {
                    if (U(xVar, xVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = xVar.f44734a.keySet().iterator();
                while (it.hasNext()) {
                    if (U(xVar, xVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean T(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id2 = view.getId();
        ArrayList arrayList3 = this.f44670i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList arrayList4 = this.f44671j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f44672k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.f44672k.get(i10)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f44673l != null && Y0.E.D(view) != null && this.f44673l.contains(Y0.E.D(view))) {
            return false;
        }
        if ((this.f44666e.size() == 0 && this.f44667f.size() == 0 && (((arrayList = this.f44669h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f44668g) == null || arrayList2.isEmpty()))) || this.f44666e.contains(Integer.valueOf(id2)) || this.f44667f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f44668g;
        if (arrayList6 != null && arrayList6.contains(Y0.E.D(view))) {
            return true;
        }
        if (this.f44669h != null) {
            for (int i11 = 0; i11 < this.f44669h.size(); i11++) {
                if (((Class) this.f44669h.get(i11)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void V(C2777a c2777a, C2777a c2777a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) sparseArray.valueAt(i10);
            if (view2 != null && T(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && T(view)) {
                x xVar = (x) c2777a.get(view2);
                x xVar2 = (x) c2777a2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.f44681t.add(xVar);
                    this.f44682u.add(xVar2);
                    c2777a.remove(view2);
                    c2777a2.remove(view);
                }
            }
        }
    }

    public final void W(C2777a c2777a, C2777a c2777a2) {
        x xVar;
        for (int size = c2777a.size() - 1; size >= 0; size--) {
            View view = (View) c2777a.f(size);
            if (view != null && T(view) && (xVar = (x) c2777a2.remove(view)) != null && T(xVar.f44735b)) {
                this.f44681t.add((x) c2777a.h(size));
                this.f44682u.add(xVar);
            }
        }
    }

    public final void X(C2777a c2777a, C2777a c2777a2, b0.r rVar, b0.r rVar2) {
        View view;
        int iP = rVar.p();
        for (int i10 = 0; i10 < iP; i10++) {
            View view2 = (View) rVar.q(i10);
            if (view2 != null && T(view2) && (view = (View) rVar2.g(rVar.j(i10))) != null && T(view)) {
                x xVar = (x) c2777a.get(view2);
                x xVar2 = (x) c2777a2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.f44681t.add(xVar);
                    this.f44682u.add(xVar2);
                    c2777a.remove(view2);
                    c2777a2.remove(view);
                }
            }
        }
    }

    public final void Z(C2777a c2777a, C2777a c2777a2, C2777a c2777a3, C2777a c2777a4) {
        View view;
        int size = c2777a3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) c2777a3.j(i10);
            if (view2 != null && T(view2) && (view = (View) c2777a4.get((String) c2777a3.f(i10))) != null && T(view)) {
                x xVar = (x) c2777a.get(view2);
                x xVar2 = (x) c2777a2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.f44681t.add(xVar);
                    this.f44682u.add(xVar2);
                    c2777a.remove(view2);
                    c2777a2.remove(view);
                }
            }
        }
    }

    public final void a0(y yVar, y yVar2) {
        C2777a c2777a = new C2777a(yVar.f44737a);
        C2777a c2777a2 = new C2777a(yVar2.f44737a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f44680s;
            if (i10 >= iArr.length) {
                j(c2777a, c2777a2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                W(c2777a, c2777a2);
            } else if (i11 == 2) {
                Z(c2777a, c2777a2, yVar.f44740d, yVar2.f44740d);
            } else if (i11 == 3) {
                V(c2777a, c2777a2, yVar.f44738b, yVar2.f44738b);
            } else if (i11 == 4) {
                X(c2777a, c2777a2, yVar.f44739c, yVar2.f44739c);
            }
            i10++;
        }
    }

    public final void b0(k kVar, i iVar, boolean z10) {
        k kVar2 = this.f44652C;
        if (kVar2 != null) {
            kVar2.b0(kVar, iVar, z10);
        }
        ArrayList arrayList = this.f44653D;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f44653D.size();
        h[] hVarArr = this.f44683v;
        if (hVarArr == null) {
            hVarArr = new h[size];
        }
        this.f44683v = null;
        h[] hVarArr2 = (h[]) this.f44653D.toArray(hVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            iVar.d(hVarArr2[i10], kVar, z10);
            hVarArr2[i10] = null;
        }
        this.f44683v = hVarArr2;
    }

    public void c0(i iVar, boolean z10) {
        b0(this, iVar, z10);
    }

    public void cancel() {
        int size = this.f44685x.size();
        Animator[] animatorArr = (Animator[]) this.f44685x.toArray(this.f44686y);
        this.f44686y = f44646R;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.f44686y = animatorArr;
        c0(i.f44710c, false);
    }

    public void d0(View view) {
        if (this.f44651B) {
            return;
        }
        int size = this.f44685x.size();
        Animator[] animatorArr = (Animator[]) this.f44685x.toArray(this.f44686y);
        this.f44686y = f44646R;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.f44686y = animatorArr;
        c0(i.f44711d, false);
        this.f44650A = true;
    }

    public void e0(ViewGroup viewGroup) {
        d dVar;
        this.f44681t = new ArrayList();
        this.f44682u = new ArrayList();
        a0(this.f44677p, this.f44678q);
        C2777a c2777aH = H();
        int size = c2777aH.size();
        WindowId windowId = viewGroup.getWindowId();
        ArrayList arrayList = new ArrayList();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = (Animator) c2777aH.f(i10);
            if (animator != null && (dVar = (d) c2777aH.get(animator)) != null && dVar.f44691a != null && windowId.equals(dVar.f44694d)) {
                x xVar = dVar.f44693c;
                View view = dVar.f44691a;
                x xVarP = P(view, true);
                x xVarC = C(view, true);
                if (xVarP == null && xVarC == null) {
                    xVarC = (x) this.f44678q.f44737a.get(view);
                }
                if ((xVarP != null || xVarC != null) && dVar.f44695e.S(xVar, xVarC)) {
                    k kVar = dVar.f44695e;
                    if (kVar.G().f44660P != null) {
                        animator.cancel();
                        kVar.f44685x.remove(animator);
                        c2777aH.h(i10);
                        if (kVar.f44685x.size() == 0) {
                            arrayList.add(kVar);
                        }
                    } else if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        c2777aH.h(i10);
                    }
                }
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            k kVar2 = (k) arrayList.get(i11);
            kVar2.c0(i.f44710c, false);
            if (!kVar2.f44651B) {
                kVar2.f44651B = true;
                kVar2.c0(i.f44709b, false);
            }
        }
        w(viewGroup, this.f44677p, this.f44678q, this.f44681t, this.f44682u);
        if (this.f44660P == null) {
            l0();
        } else if (Build.VERSION.SDK_INT >= 34) {
            f0();
            this.f44660P.p();
            this.f44660P.q();
        }
    }

    public void f0() {
        C2777a c2777aH = H();
        this.f44659J = 0L;
        for (int i10 = 0; i10 < this.f44654E.size(); i10++) {
            Animator animator = (Animator) this.f44654E.get(i10);
            d dVar = (d) c2777aH.get(animator);
            if (animator != null && dVar != null) {
                if (z() >= 0) {
                    dVar.f44696f.setDuration(z());
                }
                if (I() >= 0) {
                    dVar.f44696f.setStartDelay(I() + dVar.f44696f.getStartDelay());
                }
                if (B() != null) {
                    dVar.f44696f.setInterpolator(B());
                }
                this.f44685x.add(animator);
                this.f44659J = Math.max(this.f44659J, f.a(animator));
            }
        }
        this.f44654E.clear();
    }

    public k g(h hVar) {
        if (this.f44653D == null) {
            this.f44653D = new ArrayList();
        }
        this.f44653D.add(hVar);
        return this;
    }

    public k h0(h hVar) {
        k kVar;
        ArrayList arrayList = this.f44653D;
        if (arrayList != null) {
            if (!arrayList.remove(hVar) && (kVar = this.f44652C) != null) {
                kVar.h0(hVar);
            }
            if (this.f44653D.size() == 0) {
                this.f44653D = null;
            }
        }
        return this;
    }

    public k i(View view) {
        this.f44667f.add(view);
        return this;
    }

    public k i0(View view) {
        this.f44667f.remove(view);
        return this;
    }

    public final void j(C2777a c2777a, C2777a c2777a2) {
        for (int i10 = 0; i10 < c2777a.size(); i10++) {
            x xVar = (x) c2777a.j(i10);
            if (T(xVar.f44735b)) {
                this.f44681t.add(xVar);
                this.f44682u.add(null);
            }
        }
        for (int i11 = 0; i11 < c2777a2.size(); i11++) {
            x xVar2 = (x) c2777a2.j(i11);
            if (T(xVar2.f44735b)) {
                this.f44682u.add(xVar2);
                this.f44681t.add(null);
            }
        }
    }

    public void j0(View view) {
        if (this.f44650A) {
            if (!this.f44651B) {
                int size = this.f44685x.size();
                Animator[] animatorArr = (Animator[]) this.f44685x.toArray(this.f44686y);
                this.f44686y = f44646R;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.f44686y = animatorArr;
                c0(i.f44712e, false);
            }
            this.f44650A = false;
        }
    }

    public final void k0(Animator animator, C2777a c2777a) {
        if (animator != null) {
            animator.addListener(new b(c2777a));
            n(animator);
        }
    }

    public void l0() {
        t0();
        C2777a c2777aH = H();
        for (Animator animator : this.f44654E) {
            if (c2777aH.containsKey(animator)) {
                t0();
                k0(animator, c2777aH);
            }
        }
        this.f44654E.clear();
        y();
    }

    public void m0(long j10, long j11) {
        long jN = N();
        int i10 = 0;
        boolean z10 = j10 < j11;
        if ((j11 < 0 && j10 >= 0) || (j11 > jN && j10 <= jN)) {
            this.f44651B = false;
            c0(i.f44708a, z10);
        }
        int size = this.f44685x.size();
        Animator[] animatorArr = (Animator[]) this.f44685x.toArray(this.f44686y);
        this.f44686y = f44646R;
        while (i10 < size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            f.b(animator, Math.min(Math.max(0L, j10), f.a(animator)));
            i10++;
            jN = jN;
        }
        long j12 = jN;
        this.f44686y = animatorArr;
        if ((j10 <= j12 || j11 > j12) && (j10 >= 0 || j11 < 0)) {
            return;
        }
        if (j10 > j12) {
            this.f44651B = true;
        }
        c0(i.f44709b, z10);
    }

    public void n(Animator animator) {
        if (animator == null) {
            y();
            return;
        }
        if (z() >= 0) {
            animator.setDuration(z());
        }
        if (I() >= 0) {
            animator.setStartDelay(I() + animator.getStartDelay());
        }
        if (B() != null) {
            animator.setInterpolator(B());
        }
        animator.addListener(new c());
        animator.start();
    }

    public k n0(long j10) {
        this.f44664c = j10;
        return this;
    }

    public abstract void o(x xVar);

    public void o0(e eVar) {
        this.f44656G = eVar;
    }

    public final void p(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList arrayList = this.f44670i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList arrayList2 = this.f44671j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f44672k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (((Class) this.f44672k.get(i10)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    x xVar = new x(view);
                    if (z10) {
                        r(xVar);
                    } else {
                        o(xVar);
                    }
                    xVar.f44736c.add(this);
                    q(xVar);
                    if (z10) {
                        m(this.f44677p, view, xVar);
                    } else {
                        m(this.f44678q, view, xVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f44674m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList arrayList5 = this.f44675n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f44676o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (((Class) this.f44676o.get(i11)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                p(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    public k p0(TimeInterpolator timeInterpolator) {
        this.f44665d = timeInterpolator;
        return this;
    }

    public void q(x xVar) {
        String[] strArrB;
        if (this.f44655F == null || xVar.f44734a.isEmpty() || (strArrB = this.f44655F.b()) == null) {
            return;
        }
        for (String str : strArrB) {
            if (!xVar.f44734a.containsKey(str)) {
                this.f44655F.a(xVar);
                return;
            }
        }
    }

    public void q0(AbstractC5838g abstractC5838g) {
        if (abstractC5838g == null) {
            this.f44658I = f44648T;
        } else {
            this.f44658I = abstractC5838g;
        }
    }

    public abstract void r(x xVar);

    public void r0(t tVar) {
        this.f44655F = tVar;
    }

    public void s(ViewGroup viewGroup, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C2777a c2777a;
        t(z10);
        if ((this.f44666e.size() > 0 || this.f44667f.size() > 0) && (((arrayList = this.f44668g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f44669h) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f44666e.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f44666e.get(i10)).intValue());
                if (viewFindViewById != null) {
                    x xVar = new x(viewFindViewById);
                    if (z10) {
                        r(xVar);
                    } else {
                        o(xVar);
                    }
                    xVar.f44736c.add(this);
                    q(xVar);
                    if (z10) {
                        m(this.f44677p, viewFindViewById, xVar);
                    } else {
                        m(this.f44678q, viewFindViewById, xVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f44667f.size(); i11++) {
                View view = (View) this.f44667f.get(i11);
                x xVar2 = new x(view);
                if (z10) {
                    r(xVar2);
                } else {
                    o(xVar2);
                }
                xVar2.f44736c.add(this);
                q(xVar2);
                if (z10) {
                    m(this.f44677p, view, xVar2);
                } else {
                    m(this.f44678q, view, xVar2);
                }
            }
        } else {
            p(viewGroup, z10);
        }
        if (z10 || (c2777a = this.f44657H) == null) {
            return;
        }
        int size = c2777a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add((View) this.f44677p.f44740d.remove((String) this.f44657H.f(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f44677p.f44740d.put((String) this.f44657H.j(i13), view2);
            }
        }
    }

    public k s0(long j10) {
        this.f44663b = j10;
        return this;
    }

    public void t(boolean z10) {
        if (z10) {
            this.f44677p.f44737a.clear();
            this.f44677p.f44738b.clear();
            this.f44677p.f44739c.a();
        } else {
            this.f44678q.f44737a.clear();
            this.f44678q.f44738b.clear();
            this.f44678q.f44739c.a();
        }
    }

    public void t0() {
        if (this.f44687z == 0) {
            c0(i.f44708a, false);
            this.f44651B = false;
        }
        this.f44687z++;
    }

    public String toString() {
        return u0("");
    }

    @Override // 
    /* JADX INFO: renamed from: u */
    public k clone() {
        try {
            k kVar = (k) super.clone();
            kVar.f44654E = new ArrayList();
            kVar.f44677p = new y();
            kVar.f44678q = new y();
            kVar.f44681t = null;
            kVar.f44682u = null;
            kVar.f44660P = null;
            kVar.f44652C = this;
            kVar.f44653D = null;
            return kVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String u0(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f44664c != -1) {
            sb2.append("dur(");
            sb2.append(this.f44664c);
            sb2.append(") ");
        }
        if (this.f44663b != -1) {
            sb2.append("dly(");
            sb2.append(this.f44663b);
            sb2.append(") ");
        }
        if (this.f44665d != null) {
            sb2.append("interp(");
            sb2.append(this.f44665d);
            sb2.append(") ");
        }
        if (this.f44666e.size() > 0 || this.f44667f.size() > 0) {
            sb2.append("tgts(");
            if (this.f44666e.size() > 0) {
                for (int i10 = 0; i10 < this.f44666e.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f44666e.get(i10));
                }
            }
            if (this.f44667f.size() > 0) {
                for (int i11 = 0; i11 < this.f44667f.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f44667f.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public Animator v(ViewGroup viewGroup, x xVar, x xVar2) {
        return null;
    }

    public void w(ViewGroup viewGroup, y yVar, y yVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorV;
        int i10;
        boolean z10;
        int i11;
        View view;
        x xVar;
        Animator animator;
        Animator animator2;
        x xVar2;
        C2777a c2777aH = H();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z11 = G().f44660P != null;
        long jMin = Long.MAX_VALUE;
        int i12 = 0;
        while (i12 < size) {
            x xVar3 = (x) arrayList.get(i12);
            x xVar4 = (x) arrayList2.get(i12);
            if (xVar3 != null && !xVar3.f44736c.contains(this)) {
                xVar3 = null;
            }
            if (xVar4 != null && !xVar4.f44736c.contains(this)) {
                xVar4 = null;
            }
            if (!(xVar3 == null && xVar4 == null) && ((xVar3 == null || xVar4 == null || S(xVar3, xVar4)) && (animatorV = v(viewGroup, xVar3, xVar4)) != null)) {
                if (xVar4 != null) {
                    View view2 = xVar4.f44735b;
                    String[] strArrO = O();
                    if (strArrO != null && strArrO.length > 0) {
                        xVar2 = new x(view2);
                        i10 = size;
                        z10 = z11;
                        x xVar5 = (x) yVar2.f44737a.get(view2);
                        i11 = i12;
                        if (xVar5 != null) {
                            int i13 = 0;
                            while (i13 < strArrO.length) {
                                Map map = xVar2.f44734a;
                                int i14 = i13;
                                String str = strArrO[i14];
                                map.put(str, xVar5.f44734a.get(str));
                                i13 = i14 + 1;
                                strArrO = strArrO;
                            }
                        }
                        int size2 = c2777aH.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                view = view2;
                                animator2 = animatorV;
                                break;
                            }
                            d dVar = (d) c2777aH.get((Animator) c2777aH.f(i15));
                            if (dVar.f44693c != null && dVar.f44691a == view2) {
                                view = view2;
                                if (dVar.f44692b.equals(D()) && dVar.f44693c.equals(xVar2)) {
                                    animator2 = null;
                                    break;
                                }
                            } else {
                                view = view2;
                            }
                            i15++;
                            view2 = view;
                        }
                    } else {
                        view = view2;
                        i10 = size;
                        z10 = z11;
                        i11 = i12;
                        animator2 = animatorV;
                        xVar2 = null;
                    }
                    x xVar6 = xVar2;
                    animator = animator2;
                    xVar = xVar6;
                } else {
                    i10 = size;
                    z10 = z11;
                    i11 = i12;
                    view = xVar3.f44735b;
                    xVar = null;
                    animator = animatorV;
                }
                if (animator != null) {
                    t tVar = this.f44655F;
                    if (tVar != null) {
                        long jC = tVar.c(viewGroup, this, xVar3, xVar4);
                        sparseIntArray.put(this.f44654E.size(), (int) jC);
                        jMin = Math.min(jC, jMin);
                    }
                    long j10 = jMin;
                    d dVar2 = new d(view, D(), this, viewGroup.getWindowId(), xVar, animator);
                    Object obj = animator;
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator);
                        obj = animatorSet;
                    }
                    c2777aH.put(obj, dVar2);
                    this.f44654E.add(obj);
                    jMin = j10;
                }
            } else {
                i10 = size;
                z10 = z11;
                i11 = i12;
            }
            i12 = i11 + 1;
            size = i10;
            z11 = z10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                d dVar3 = (d) c2777aH.get((Animator) this.f44654E.get(sparseIntArray.keyAt(i16)));
                dVar3.f44696f.setStartDelay((((long) sparseIntArray.valueAt(i16)) - jMin) + dVar3.f44696f.getStartDelay());
            }
        }
    }

    public u x() {
        g gVar = new g();
        this.f44660P = gVar;
        g(gVar);
        return this.f44660P;
    }

    public void y() {
        int i10 = this.f44687z - 1;
        this.f44687z = i10;
        if (i10 == 0) {
            c0(i.f44709b, false);
            for (int i11 = 0; i11 < this.f44677p.f44739c.p(); i11++) {
                View view = (View) this.f44677p.f44739c.q(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f44678q.f44739c.p(); i12++) {
                View view2 = (View) this.f44678q.f44739c.q(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f44651B = true;
        }
    }

    public long z() {
        return this.f44664c;
    }
}
