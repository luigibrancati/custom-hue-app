package t3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import t3.k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class H extends k {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final String[] f44568X = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f44569W = 3;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AnimatorListenerAdapter implements k.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f44570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ViewGroup f44572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f44573d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f44574e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f44575f = false;

        public a(View view, int i10, boolean z10) {
            this.f44570a = view;
            this.f44571b = i10;
            this.f44572c = (ViewGroup) view.getParent();
            this.f44573d = z10;
            f(true);
        }

        public final void c() {
            if (!this.f44575f) {
                B.f(this.f44570a, this.f44571b);
                ViewGroup viewGroup = this.f44572c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        @Override // t3.k.h
        public void d(k kVar) {
            f(true);
            if (this.f44575f) {
                return;
            }
            B.f(this.f44570a, 0);
        }

        @Override // t3.k.h
        public void e(k kVar) {
            f(false);
            if (this.f44575f) {
                return;
            }
            B.f(this.f44570a, this.f44571b);
        }

        public final void f(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f44573d || this.f44574e == z10 || (viewGroup = this.f44572c) == null) {
                return;
            }
            this.f44574e = z10;
            AbstractC5831A.a(viewGroup, z10);
        }

        @Override // t3.k.h
        public void i(k kVar) {
            kVar.h0(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f44575f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            c();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                B.f(this.f44570a, 0);
                ViewGroup viewGroup = this.f44572c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // t3.k.h
        public void a(k kVar) {
        }

        @Override // t3.k.h
        public void l(k kVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends AnimatorListenerAdapter implements k.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f44576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f44577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f44578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f44579d = true;

        public b(ViewGroup viewGroup, View view, View view2) {
            this.f44576a = viewGroup;
            this.f44577b = view;
            this.f44578c = view2;
        }

        @Override // t3.k.h
        public void a(k kVar) {
            if (this.f44579d) {
                c();
            }
        }

        public final void c() {
            this.f44578c.setTag(AbstractC5839h.f44641a, null);
            this.f44576a.getOverlay().remove(this.f44577b);
            this.f44579d = false;
        }

        @Override // t3.k.h
        public void i(k kVar) {
            kVar.h0(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f44576a.getOverlay().remove(this.f44577b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f44577b.getParent() == null) {
                Y0.E.d(this.f44576a, this.f44577b);
            } else {
                H.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                this.f44578c.setTag(AbstractC5839h.f44641a, this.f44577b);
                Y0.E.d(this.f44576a, this.f44577b);
                this.f44579d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            c();
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

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f44581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f44582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f44583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f44584d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ViewGroup f44585e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ViewGroup f44586f;
    }

    private void w0(x xVar) {
        xVar.f44734a.put("android:visibility:visibility", Integer.valueOf(xVar.f44735b.getVisibility()));
        xVar.f44734a.put("android:visibility:parent", xVar.f44735b.getParent());
        int[] iArr = new int[2];
        xVar.f44735b.getLocationOnScreen(iArr);
        xVar.f44734a.put("android:visibility:screenLocation", iArr);
    }

    public Animator A0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[PHI: r2
      0x0069: PHI (r2v3 android.view.View) = 
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v6 android.view.View)
     binds: [B:26:0x003e, B:31:0x004d, B:37:0x0076, B:39:0x0079, B:41:0x007f, B:43:0x0083, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator B0(android.view.ViewGroup r10, t3.x r11, int r12, t3.x r13, int r14) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.H.B0(android.view.ViewGroup, t3.x, int, t3.x, int):android.animation.Animator");
    }

    public void C0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f44569W = i10;
    }

    @Override // t3.k
    public String[] O() {
        return f44568X;
    }

    @Override // t3.k
    public boolean S(x xVar, x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar != null && xVar2 != null && xVar2.f44734a.containsKey("android:visibility:visibility") != xVar.f44734a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarX0 = x0(xVar, xVar2);
        return cVarX0.f44581a && (cVarX0.f44583c == 0 || cVarX0.f44584d == 0);
    }

    @Override // t3.k
    public void o(x xVar) {
        w0(xVar);
    }

    @Override // t3.k
    public void r(x xVar) {
        w0(xVar);
    }

    @Override // t3.k
    public Animator v(ViewGroup viewGroup, x xVar, x xVar2) {
        c cVarX0 = x0(xVar, xVar2);
        if (!cVarX0.f44581a) {
            return null;
        }
        if (cVarX0.f44585e == null && cVarX0.f44586f == null) {
            return null;
        }
        return cVarX0.f44582b ? z0(viewGroup, xVar, cVarX0.f44583c, xVar2, cVarX0.f44584d) : B0(viewGroup, xVar, cVarX0.f44583c, xVar2, cVarX0.f44584d);
    }

    public final c x0(x xVar, x xVar2) {
        c cVar = new c();
        cVar.f44581a = false;
        cVar.f44582b = false;
        if (xVar == null || !xVar.f44734a.containsKey("android:visibility:visibility")) {
            cVar.f44583c = -1;
            cVar.f44585e = null;
        } else {
            cVar.f44583c = ((Integer) xVar.f44734a.get("android:visibility:visibility")).intValue();
            cVar.f44585e = (ViewGroup) xVar.f44734a.get("android:visibility:parent");
        }
        if (xVar2 == null || !xVar2.f44734a.containsKey("android:visibility:visibility")) {
            cVar.f44584d = -1;
            cVar.f44586f = null;
        } else {
            cVar.f44584d = ((Integer) xVar2.f44734a.get("android:visibility:visibility")).intValue();
            cVar.f44586f = (ViewGroup) xVar2.f44734a.get("android:visibility:parent");
        }
        if (xVar != null && xVar2 != null) {
            int i10 = cVar.f44583c;
            int i11 = cVar.f44584d;
            if (i10 != i11 || cVar.f44585e != cVar.f44586f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        cVar.f44582b = false;
                        cVar.f44581a = true;
                        return cVar;
                    }
                    if (i11 == 0) {
                        cVar.f44582b = true;
                        cVar.f44581a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f44586f == null) {
                        cVar.f44582b = false;
                        cVar.f44581a = true;
                        return cVar;
                    }
                    if (cVar.f44585e == null) {
                        cVar.f44582b = true;
                        cVar.f44581a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (xVar == null && cVar.f44584d == 0) {
                cVar.f44582b = true;
                cVar.f44581a = true;
                return cVar;
            }
            if (xVar2 == null && cVar.f44583c == 0) {
                cVar.f44582b = false;
                cVar.f44581a = true;
            }
        }
        return cVar;
    }

    public Animator y0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        return null;
    }

    public Animator z0(ViewGroup viewGroup, x xVar, int i10, x xVar2, int i11) {
        if ((this.f44569W & 1) != 1 || xVar2 == null) {
            return null;
        }
        if (xVar == null) {
            View view = (View) xVar2.f44735b.getParent();
            if (x0(C(view, false), P(view, false)).f44581a) {
                return null;
            }
        }
        return y0(viewGroup, xVar2.f44735b, xVar, xVar2);
    }
}
