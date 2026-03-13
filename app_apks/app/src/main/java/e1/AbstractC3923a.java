package e1;

import Y0.C2547a;
import Y0.E;
import Z0.h;
import Z0.i;
import Z0.j;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import b0.K;
import com.google.ar.core.ImageMetadata;
import e1.AbstractC3924b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: e1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3923a extends C2547a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Rect f33530n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AbstractC3924b.a f33531o = new C0416a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AbstractC3924b.InterfaceC0417b f33532p = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f33537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f33538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f33539j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f33533d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f33534e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f33535f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f33536g = new int[2];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f33540k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f33541l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f33542m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0416a implements AbstractC3924b.a {
        @Override // e1.AbstractC3924b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h hVar, Rect rect) {
            hVar.j(rect);
        }
    }

    /* JADX INFO: renamed from: e1.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements AbstractC3924b.InterfaceC0417b {
        @Override // e1.AbstractC3924b.InterfaceC0417b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public h a(K k10, int i10) {
            return (h) k10.r(i10);
        }

        @Override // e1.AbstractC3924b.InterfaceC0417b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(K k10) {
            return k10.q();
        }
    }

    /* JADX INFO: renamed from: e1.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends i {
        public c() {
        }

        @Override // Z0.i
        public h b(int i10) {
            return h.Z(AbstractC3923a.this.H(i10));
        }

        @Override // Z0.i
        public h d(int i10) {
            int i11 = i10 == 2 ? AbstractC3923a.this.f33540k : AbstractC3923a.this.f33541l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // Z0.i
        public boolean f(int i10, int i11, Bundle bundle) {
            return AbstractC3923a.this.P(i10, i11, bundle);
        }
    }

    public AbstractC3923a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f33538i = view;
        this.f33537h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (E.u(view) == 0) {
            E.n0(view, 1);
        }
    }

    public static Rect D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i10 == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i10 == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    public static int F(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    public final int A() {
        return this.f33541l;
    }

    public abstract int B(float f10, float f11);

    public abstract void C(List list);

    public final boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f33538i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f33538i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    public final boolean G(int i10, Rect rect) {
        h hVar;
        K kY = y();
        int i11 = this.f33541l;
        h hVar2 = i11 == Integer.MIN_VALUE ? null : (h) kY.i(i11);
        if (i10 == 1 || i10 == 2) {
            hVar = (h) AbstractC3924b.d(kY, f33532p, f33531o, hVar2, i10, E.w(this.f33538i) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i12 = this.f33541l;
            if (i12 != Integer.MIN_VALUE) {
                z(i12, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f33538i, i10, rect2);
            }
            hVar = (h) AbstractC3924b.c(kY, f33532p, f33531o, hVar2, rect2, i10);
        }
        return T(hVar != null ? kY.m(kY.j(hVar)) : Integer.MIN_VALUE);
    }

    public h H(int i10) {
        return i10 == -1 ? u() : t(i10);
    }

    public final void I(boolean z10, int i10, Rect rect) {
        int i11 = this.f33541l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            G(i10, rect);
        }
    }

    public abstract boolean J(int i10, int i11, Bundle bundle);

    public abstract void M(h hVar);

    public abstract void N(int i10, h hVar);

    public abstract void O(int i10, boolean z10);

    public boolean P(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? Q(i10, i11, bundle) : R(i11, bundle);
    }

    public final boolean Q(int i10, int i11, Bundle bundle) {
        return i11 != 1 ? i11 != 2 ? i11 != 64 ? i11 != 128 ? J(i10, i11, bundle) : n(i10) : S(i10) : o(i10) : T(i10);
    }

    public final boolean R(int i10, Bundle bundle) {
        return E.V(this.f33538i, i10, bundle);
    }

    public final boolean S(int i10) {
        int i11;
        if (!this.f33537h.isEnabled() || !this.f33537h.isTouchExplorationEnabled() || (i11 = this.f33540k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            n(i11);
        }
        this.f33540k = i10;
        this.f33538i.invalidate();
        U(i10, 32768);
        return true;
    }

    public final boolean T(int i10) {
        int i11;
        if ((!this.f33538i.isFocused() && !this.f33538i.requestFocus()) || (i11 = this.f33541l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f33541l = i10;
        O(i10, true);
        U(i10, 8);
        return true;
    }

    public final boolean U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f33537h.isEnabled() || (parent = this.f33538i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f33538i, q(i10, i11));
    }

    public final void V(int i10) {
        int i11 = this.f33542m;
        if (i11 == i10) {
            return;
        }
        this.f33542m = i10;
        U(i10, 128);
        U(i11, 256);
    }

    @Override // Y0.C2547a
    public i b(View view) {
        if (this.f33539j == null) {
            this.f33539j = new c();
        }
        return this.f33539j;
    }

    @Override // Y0.C2547a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // Y0.C2547a
    public void g(View view, h hVar) {
        super.g(view, hVar);
        M(hVar);
    }

    public final boolean n(int i10) {
        if (this.f33540k != i10) {
            return false;
        }
        this.f33540k = Integer.MIN_VALUE;
        this.f33538i.invalidate();
        U(i10, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        return true;
    }

    public final boolean o(int i10) {
        if (this.f33541l != i10) {
            return false;
        }
        this.f33541l = Integer.MIN_VALUE;
        O(i10, false);
        U(i10, 8);
        return true;
    }

    public final boolean p() {
        int i10 = this.f33541l;
        return i10 != Integer.MIN_VALUE && J(i10, 16, null);
    }

    public final AccessibilityEvent q(int i10, int i11) {
        return i10 != -1 ? r(i10, i11) : s(i11);
    }

    public final AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        h hVarH = H(i10);
        accessibilityEventObtain.getText().add(hVarH.B());
        accessibilityEventObtain.setContentDescription(hVarH.s());
        accessibilityEventObtain.setScrollable(hVarH.T());
        accessibilityEventObtain.setPassword(hVarH.S());
        accessibilityEventObtain.setEnabled(hVarH.L());
        accessibilityEventObtain.setChecked(hVarH.I());
        L(i10, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(hVarH.p());
        j.c(accessibilityEventObtain, this.f33538i, i10);
        accessibilityEventObtain.setPackageName(this.f33538i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent s(int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        this.f33538i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    public final h t(int i10) {
        h hVarY = h.Y();
        hVarY.n0(true);
        hVarY.p0(true);
        hVarY.i0("android.view.View");
        Rect rect = f33530n;
        hVarY.e0(rect);
        hVarY.f0(rect);
        hVarY.x0(this.f33538i);
        N(i10, hVarY);
        if (hVarY.B() == null && hVarY.s() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        hVarY.j(this.f33534e);
        if (this.f33534e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iH = hVarY.h();
        if ((iH & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iH & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        hVarY.v0(this.f33538i.getContext().getPackageName());
        hVarY.C0(this.f33538i, i10);
        if (this.f33540k == i10) {
            hVarY.d0(true);
            hVarY.a(128);
        } else {
            hVarY.d0(false);
            hVarY.a(64);
        }
        boolean z10 = this.f33541l == i10;
        if (z10) {
            hVarY.a(2);
        } else if (hVarY.N()) {
            hVarY.a(1);
        }
        hVarY.q0(z10);
        this.f33538i.getLocationOnScreen(this.f33536g);
        hVarY.k(this.f33533d);
        if (this.f33533d.equals(rect)) {
            hVarY.j(this.f33533d);
            if (hVarY.f20090b != -1) {
                h hVarY2 = h.Y();
                for (int i11 = hVarY.f20090b; i11 != -1; i11 = hVarY2.f20090b) {
                    hVarY2.y0(this.f33538i, -1);
                    hVarY2.e0(f33530n);
                    N(i11, hVarY2);
                    hVarY2.j(this.f33534e);
                    Rect rect2 = this.f33533d;
                    Rect rect3 = this.f33534e;
                    rect2.offset(rect3.left, rect3.top);
                }
                hVarY2.c0();
            }
            this.f33533d.offset(this.f33536g[0] - this.f33538i.getScrollX(), this.f33536g[1] - this.f33538i.getScrollY());
        }
        if (this.f33538i.getLocalVisibleRect(this.f33535f)) {
            this.f33535f.offset(this.f33536g[0] - this.f33538i.getScrollX(), this.f33536g[1] - this.f33538i.getScrollY());
            if (this.f33533d.intersect(this.f33535f)) {
                hVarY.f0(this.f33533d);
                if (E(this.f33533d)) {
                    hVarY.G0(true);
                }
            }
        }
        return hVarY;
    }

    public final h u() {
        h hVarA0 = h.a0(this.f33538i);
        E.T(this.f33538i, hVarA0);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (hVarA0.o() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            hVarA0.c(this.f33538i, ((Integer) arrayList.get(i10)).intValue());
        }
        return hVarA0;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (this.f33537h.isEnabled() && this.f33537h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.f33542m == Integer.MIN_VALUE) {
                    return false;
                }
                V(Integer.MIN_VALUE);
                return true;
            }
            int iB = B(motionEvent.getX(), motionEvent.getY());
            V(iB);
            if (iB != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(android.view.KeyEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L5d
            int r0 = r7.getKeyCode()
            r3 = 61
            r4 = 0
            if (r0 == r3) goto L46
            r3 = 66
            if (r0 == r3) goto L36
            switch(r0) {
                case 19: goto L19;
                case 20: goto L19;
                case 21: goto L19;
                case 22: goto L19;
                case 23: goto L36;
                default: goto L18;
            }
        L18:
            goto L5d
        L19:
            boolean r3 = r7.hasNoModifiers()
            if (r3 == 0) goto L5d
            int r0 = F(r0)
            int r7 = r7.getRepeatCount()
            int r7 = r7 + r2
            r3 = r1
        L29:
            if (r1 >= r7) goto L35
            boolean r5 = r6.G(r0, r4)
            if (r5 == 0) goto L35
            int r1 = r1 + 1
            r3 = r2
            goto L29
        L35:
            return r3
        L36:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L5d
            int r7 = r7.getRepeatCount()
            if (r7 != 0) goto L5d
            r6.p()
            return r2
        L46:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L52
            r7 = 2
            boolean r6 = r6.G(r7, r4)
            return r6
        L52:
            boolean r7 = r7.hasModifiers(r2)
            if (r7 == 0) goto L5d
            boolean r6 = r6.G(r2, r4)
            return r6
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.AbstractC3923a.w(android.view.KeyEvent):boolean");
    }

    public final int x() {
        return this.f33540k;
    }

    public final K y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        K k10 = new K();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            k10.n(((Integer) arrayList.get(i10)).intValue(), t(((Integer) arrayList.get(i10)).intValue()));
        }
        return k10;
    }

    public final void z(int i10, Rect rect) {
        H(i10).j(rect);
    }

    public void K(AccessibilityEvent accessibilityEvent) {
    }

    public void L(int i10, AccessibilityEvent accessibilityEvent) {
    }
}
