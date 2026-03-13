package t3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import t3.k;

/* JADX INFO: renamed from: t3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5833b extends k {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final String[] f44587X = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Property f44588Y = new a(PointF.class, "topLeft");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final Property f44589Z = new C0603b(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final Property f44590k0 = new c(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final Property f44591l0 = new d(PointF.class, "topLeft");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final Property f44592m0 = new e(PointF.class, "position");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final t3.i f44593n0 = new t3.i();

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f44594W = false;

    /* JADX INFO: renamed from: t3.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* JADX INFO: renamed from: t3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0603b extends Property {
        public C0603b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    /* JADX INFO: renamed from: t3.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends Property {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            B.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: t3.b$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d extends Property {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            B.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: t3.b$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e extends Property {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            B.d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: t3.b$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f44595a;
        private final i mViewBounds;

        public f(i iVar) {
            this.f44595a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* JADX INFO: renamed from: t3.b$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g extends AnimatorListenerAdapter implements k.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f44597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f44598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f44599c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f44600d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f44601e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f44602f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f44603g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f44604h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f44605i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f44606j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f44607k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f44608l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f44609m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f44610n;

        public g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f44597a = view;
            this.f44598b = rect;
            this.f44599c = z10;
            this.f44600d = rect2;
            this.f44601e = z11;
            this.f44602f = i10;
            this.f44603g = i11;
            this.f44604h = i12;
            this.f44605i = i13;
            this.f44606j = i14;
            this.f44607k = i15;
            this.f44608l = i16;
            this.f44609m = i17;
        }

        @Override // t3.k.h
        public void a(k kVar) {
            this.f44610n = true;
        }

        @Override // t3.k.h
        public void d(k kVar) {
            Rect rect = (Rect) this.f44597a.getTag(AbstractC5839h.f44642b);
            this.f44597a.setTag(AbstractC5839h.f44642b, null);
            this.f44597a.setClipBounds(rect);
        }

        @Override // t3.k.h
        public void e(k kVar) {
            this.f44597a.setTag(AbstractC5839h.f44642b, this.f44597a.getClipBounds());
            this.f44597a.setClipBounds(this.f44601e ? null : this.f44600d);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f44610n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f44599c) {
                    rect = this.f44598b;
                }
            } else if (!this.f44601e) {
                rect = this.f44600d;
            }
            this.f44597a.setClipBounds(rect);
            if (z10) {
                B.d(this.f44597a, this.f44602f, this.f44603g, this.f44604h, this.f44605i);
            } else {
                B.d(this.f44597a, this.f44606j, this.f44607k, this.f44608l, this.f44609m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            int iMax = Math.max(this.f44604h - this.f44602f, this.f44608l - this.f44606j);
            int iMax2 = Math.max(this.f44605i - this.f44603g, this.f44609m - this.f44607k);
            int i10 = z10 ? this.f44606j : this.f44602f;
            int i11 = z10 ? this.f44607k : this.f44603g;
            B.d(this.f44597a, i10, i11, iMax + i10, iMax2 + i11);
            this.f44597a.setClipBounds(z10 ? this.f44600d : this.f44598b);
        }

        @Override // t3.k.h
        public void i(k kVar) {
        }

        @Override // t3.k.h
        public void l(k kVar) {
        }
    }

    /* JADX INFO: renamed from: t3.b$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class h extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f44611a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ViewGroup f44612b;

        public h(ViewGroup viewGroup) {
            this.f44612b = viewGroup;
        }

        @Override // t3.r, t3.k.h
        public void a(k kVar) {
            AbstractC5831A.a(this.f44612b, false);
            this.f44611a = true;
        }

        @Override // t3.r, t3.k.h
        public void d(k kVar) {
            AbstractC5831A.a(this.f44612b, true);
        }

        @Override // t3.r, t3.k.h
        public void e(k kVar) {
            AbstractC5831A.a(this.f44612b, false);
        }

        @Override // t3.r, t3.k.h
        public void i(k kVar) {
            if (!this.f44611a) {
                AbstractC5831A.a(this.f44612b, false);
            }
            kVar.h0(this);
        }
    }

    /* JADX INFO: renamed from: t3.b$i */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f44614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f44615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f44616d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final View f44617e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f44618f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f44619g;

        public i(View view) {
            this.f44617e = view;
        }

        public void a(PointF pointF) {
            this.f44615c = Math.round(pointF.x);
            this.f44616d = Math.round(pointF.y);
            int i10 = this.f44619g + 1;
            this.f44619g = i10;
            if (this.f44618f == i10) {
                b();
            }
        }

        public final void b() {
            B.d(this.f44617e, this.f44613a, this.f44614b, this.f44615c, this.f44616d);
            this.f44618f = 0;
            this.f44619g = 0;
        }

        public void c(PointF pointF) {
            this.f44613a = Math.round(pointF.x);
            this.f44614b = Math.round(pointF.y);
            int i10 = this.f44618f + 1;
            this.f44618f = i10;
            if (i10 == this.f44619g) {
                b();
            }
        }
    }

    @Override // t3.k
    public String[] O() {
        return f44587X;
    }

    @Override // t3.k
    public boolean R() {
        return true;
    }

    @Override // t3.k
    public void o(x xVar) {
        w0(xVar);
    }

    @Override // t3.k
    public void r(x xVar) {
        Rect rect;
        w0(xVar);
        if (!this.f44594W || (rect = (Rect) xVar.f44735b.getTag(AbstractC5839h.f44642b)) == null) {
            return;
        }
        xVar.f44734a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t3.k
    public Animator v(ViewGroup viewGroup, x xVar, x xVar2) {
        int i10;
        int i11;
        int i12;
        int i13;
        ObjectAnimator objectAnimatorA;
        int i14;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorC;
        if (xVar == null || xVar2 == null) {
            return null;
        }
        Map map = xVar.f44734a;
        Map map2 = xVar2.f44734a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = xVar2.f44735b;
        Rect rect2 = (Rect) xVar.f44734a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) xVar2.f44734a.get("android:changeBounds:bounds");
        int i15 = rect2.left;
        int i16 = rect3.left;
        int i17 = rect2.top;
        int i18 = rect3.top;
        int i19 = rect2.right;
        int i20 = rect3.right;
        int i21 = rect2.bottom;
        int i22 = rect3.bottom;
        int i23 = i19 - i15;
        int i24 = i21 - i17;
        int i25 = i20 - i16;
        int i26 = i22 - i18;
        Rect rect4 = (Rect) xVar.f44734a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) xVar2.f44734a.get("android:changeBounds:clip");
        if ((i23 == 0 || i24 == 0) && (i25 == 0 || i26 == 0)) {
            i10 = 0;
        } else {
            i10 = (i15 == i16 && i17 == i18) ? 0 : 1;
            if (i19 != i20 || i21 != i22) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        int i27 = i10;
        if (i27 <= 0) {
            return null;
        }
        if (this.f44594W) {
            B.d(view, i15, i17, Math.max(i23, i25) + i15, i17 + Math.max(i24, i26));
            if (i15 == i16 && i17 == i18) {
                objectAnimatorA = null;
                i11 = i22;
                i13 = i16;
                i12 = i20;
            } else {
                i11 = i22;
                i12 = i20;
                i13 = i16;
                objectAnimatorA = AbstractC5837f.a(view, f44592m0, E().a(i15, i17, i16, i18));
            }
            boolean z10 = rect4 == null;
            if (z10) {
                i14 = 0;
                rect = new Rect(0, 0, i23, i24);
            } else {
                i14 = 0;
                rect = rect4;
            }
            int i28 = rect5 == null ? 1 : i14;
            Rect rect6 = i28 != 0 ? new Rect(i14, i14, i25, i26) : rect5;
            if (rect.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f44593n0, rect, rect6);
                g gVar = new g(view, rect, z10, rect6, i28, i15, i17, i19, i21, i13, i18, i12, i11);
                objectAnimatorOfObject.addListener(gVar);
                g(gVar);
            }
            animatorC = w.c(objectAnimatorA, objectAnimatorOfObject);
        } else {
            B.d(view, i15, i17, i19, i21);
            if (i27 != 2) {
                animatorC = (i15 == i16 && i17 == i18) ? AbstractC5837f.a(view, f44590k0, E().a(i19, i21, i20, i22)) : AbstractC5837f.a(view, f44591l0, E().a(i15, i17, i16, i18));
            } else if (i23 == i25 && i24 == i26) {
                animatorC = AbstractC5837f.a(view, f44592m0, E().a(i15, i17, i16, i18));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorA2 = AbstractC5837f.a(iVar, f44588Y, E().a(i15, i17, i16, i18));
                ObjectAnimator objectAnimatorA3 = AbstractC5837f.a(iVar, f44589Z, E().a(i19, i21, i20, i22));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new f(iVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            AbstractC5831A.a(viewGroup4, true);
            G().g(new h(viewGroup4));
        }
        return animatorC;
    }

    public final void w0(x xVar) {
        View view = xVar.f44735b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        xVar.f44734a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        xVar.f44734a.put("android:changeBounds:parent", xVar.f44735b.getParent());
        if (this.f44594W) {
            xVar.f44734a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }
}
