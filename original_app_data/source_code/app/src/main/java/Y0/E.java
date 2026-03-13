package Y0;

import Y0.C2547a;
import Z0.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f19584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f19585b = {K0.d.f6677b, K0.d.f6678c, K0.d.f6689n, K0.d.f6700y, K0.d.f6662B, K0.d.f6663C, K0.d.f6664D, K0.d.f6665E, K0.d.f6666F, K0.d.f6667G, K0.d.f6679d, K0.d.f6680e, K0.d.f6681f, K0.d.f6682g, K0.d.f6683h, K0.d.f6684i, K0.d.f6685j, K0.d.f6686k, K0.d.f6687l, K0.d.f6688m, K0.d.f6690o, K0.d.f6691p, K0.d.f6692q, K0.d.f6693r, K0.d.f6694s, K0.d.f6695t, K0.d.f6696u, K0.d.f6697v, K0.d.f6698w, K0.d.f6699x, K0.d.f6701z, K0.d.f6661A};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f19586c = new x() { // from class: Y0.D
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f19587d = new e();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends f {
        public a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // Y0.E.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(k.c(view));
        }

        @Override // Y0.E.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            k.f(view, bool.booleanValue());
        }

        @Override // Y0.E.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends f {
        public b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // Y0.E.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return k.a(view);
        }

        @Override // Y0.E.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            k.e(view, charSequence);
        }

        @Override // Y0.E.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends f {
        public c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // Y0.E.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return m.b(view);
        }

        @Override // Y0.E.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            m.c(view, charSequence);
        }

        @Override // Y0.E.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d extends f {
        public d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // Y0.E.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(k.b(view));
        }

        @Override // Y0.E.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            k.d(view, bool.booleanValue());
        }

        @Override // Y0.E.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class f19590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19591c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19592d;

        public f(int i10, Class cls, int i11) {
            this(i10, cls, 0, i11);
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= this.f19591c;
        }

        public abstract Object c(View view);

        public abstract void d(View view, Object obj);

        public Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f19589a);
            if (this.f19590b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                E.i(view);
                view.setTag(this.f19589a, obj);
                E.P(view, this.f19592d);
            }
        }

        public abstract boolean g(Object obj, Object obj2);

        public f(int i10, Class cls, int i11, int i12) {
            this.f19589a = i10;
            this.f19590b = cls;
            this.f19592d = i11;
            this.f19591c = i12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void b(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class h {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public S f19593a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f19594b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f19595c;

            public a(View view, w wVar) {
                this.f19594b = view;
                this.f19595c = wVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                S sW = S.w(windowInsets, view);
                this.f19593a = sW;
                return this.f19595c.a(view, sW).u();
            }
        }

        public static S a(View view, S s10, Rect rect) {
            WindowInsets windowInsetsU = s10.u();
            if (windowInsetsU != null) {
                return S.w(view.computeSystemWindowInsets(windowInsetsU, rect), view);
            }
            rect.setEmpty();
            return s10;
        }

        public static ColorStateList b(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode c(View view) {
            return view.getBackgroundTintMode();
        }

        public static float d(View view) {
            return view.getElevation();
        }

        public static String e(View view) {
            return view.getTransitionName();
        }

        public static float f(View view) {
            return view.getTranslationZ();
        }

        public static float g(View view) {
            return view.getZ();
        }

        public static boolean h(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void i(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void j(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void k(View view, float f10) {
            view.setElevation(f10);
        }

        public static void l(View view, w wVar) {
            a aVar = wVar != null ? new a(view, wVar) : null;
            if (view.getTag(K0.d.f6672L) != null) {
                return;
            }
            if (aVar != null) {
                view.setOnApplyWindowInsetsListener(aVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(K0.d.f6675O));
            }
        }

        public static void m(View view, String str) {
            view.setTransitionName(str);
        }

        public static void n(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void o(View view, float f10) {
            view.setZ(f10);
        }

        public static void p(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class i {
        public static S a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            S sV = S.v(rootWindowInsets);
            sV.s(sV);
            sV.d(view.getRootView());
            return sV;
        }

        public static void b(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class j {
        public static int a(View view) {
            return view.getImportantForAutofill();
        }

        public static void b(View view, int i10) {
            view.setImportantForAutofill(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class k {
        public static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void d(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void f(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class l {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class m {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static int A(View view) {
        return view.getPaddingStart();
    }

    public static S B(View view) {
        return i.a(view);
    }

    public static CharSequence C(View view) {
        return (CharSequence) x0().e(view);
    }

    public static String D(View view) {
        return h.e(view);
    }

    public static float E(View view) {
        return h.f(view);
    }

    public static int F(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float G(View view) {
        return h.g(view);
    }

    public static boolean H(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean I(View view) {
        return view.hasTransientState();
    }

    public static boolean J(View view) {
        Boolean bool = (Boolean) a().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean K(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean L(View view) {
        return view.isLaidOut();
    }

    public static boolean M(View view) {
        return h.h(view);
    }

    public static boolean N(View view) {
        return view.isPaddingRelative();
    }

    public static boolean O(View view) {
        Boolean bool = (Boolean) e0().e(view);
        return bool != null && bool.booleanValue();
    }

    public static void P(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = m(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : RecognitionOptions.PDF417);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(m(view));
                    o0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i10);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(m(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void Q(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void R(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static S S(View view, S s10) {
        WindowInsets windowInsetsU = s10.u();
        if (windowInsetsU != null) {
            WindowInsets windowInsetsA = g.a(view, windowInsetsU);
            if (!windowInsetsA.equals(windowInsetsU)) {
                return S.w(windowInsetsA, view);
            }
        }
        return s10;
    }

    public static void T(View view, Z0.h hVar) {
        view.onInitializeAccessibilityNodeInfo(hVar.H0());
    }

    public static f U() {
        return new b(K0.d.f6671K, CharSequence.class, 8, 28);
    }

    public static boolean V(View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    public static void W(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void X(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void Y(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    public static void Z(View view, int i10) {
        a0(i10, view);
        P(view, 0);
    }

    public static f a() {
        return new d(K0.d.f6670J, Boolean.class, 28);
    }

    public static void a0(int i10, View view) {
        List listN = n(view);
        for (int i11 = 0; i11 < listN.size(); i11++) {
            if (((h.a) listN.get(i11)).b() == i10) {
                listN.remove(i11);
                return;
            }
        }
    }

    public static int b(View view, CharSequence charSequence, Z0.k kVar) {
        int iO = o(view, charSequence);
        if (iO != -1) {
            c(view, new h.a(iO, charSequence, kVar));
        }
        return iO;
    }

    public static void b0(View view, h.a aVar, CharSequence charSequence, Z0.k kVar) {
        if (kVar == null && charSequence == null) {
            Z(view, aVar.b());
        } else {
            c(view, aVar.a(charSequence, kVar));
        }
    }

    public static void c(View view, h.a aVar) {
        i(view);
        a0(aVar.b(), view);
        n(view).add(aVar);
        P(view, 0);
    }

    public static void c0(View view) {
        g.b(view);
    }

    public static void d(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        b1.b.b((View) view.getParent(), viewGroup);
    }

    public static void d0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        l.b(view, context, iArr, attributeSet, typedArray, i10, i11);
    }

    public static M e(View view) {
        if (f19584a == null) {
            f19584a = new WeakHashMap();
        }
        M m10 = (M) f19584a.get(view);
        if (m10 != null) {
            return m10;
        }
        M m11 = new M(view);
        f19584a.put(view, m11);
        return m11;
    }

    public static f e0() {
        return new a(K0.d.f6673M, Boolean.class, 28);
    }

    public static S f(View view, S s10, Rect rect) {
        return h.a(view, s10, rect);
    }

    public static void f0(View view, C2547a c2547a) {
        if (c2547a == null && (l(view) instanceof C2547a.C0245a)) {
            c2547a = new C2547a();
        }
        o0(view);
        view.setAccessibilityDelegate(c2547a == null ? null : c2547a.d());
    }

    public static S g(View view, S s10) {
        WindowInsets windowInsetsU = s10.u();
        if (windowInsetsU != null) {
            WindowInsets windowInsetsA = m.a(view, windowInsetsU);
            if (!windowInsetsA.equals(windowInsetsU)) {
                return S.w(windowInsetsA, view);
            }
        }
        return s10;
    }

    public static void g0(View view, boolean z10) {
        a().f(view, Boolean.valueOf(z10));
    }

    public static boolean h(View view, KeyEvent keyEvent) {
        return false;
    }

    public static void h0(View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    public static void i(View view) {
        C2547a c2547aK = k(view);
        if (c2547aK == null) {
            c2547aK = new C2547a();
        }
        f0(view, c2547aK);
    }

    public static void i0(View view, CharSequence charSequence) {
        U().f(view, charSequence);
        if (charSequence != null) {
            f19587d.a(view);
        } else {
            f19587d.c(view);
        }
    }

    public static int j() {
        return View.generateViewId();
    }

    public static void j0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static C2547a k(View view) {
        View.AccessibilityDelegate accessibilityDelegateL = l(view);
        if (accessibilityDelegateL == null) {
            return null;
        }
        return accessibilityDelegateL instanceof C2547a.C0245a ? ((C2547a.C0245a) accessibilityDelegateL).f19638a : new C2547a(accessibilityDelegateL);
    }

    public static void k0(View view, ColorStateList colorStateList) {
        h.i(view, colorStateList);
    }

    public static View.AccessibilityDelegate l(View view) {
        return l.a(view);
    }

    public static void l0(View view, PorterDuff.Mode mode) {
        h.j(view, mode);
    }

    public static CharSequence m(View view) {
        return (CharSequence) U().e(view);
    }

    public static void m0(View view, float f10) {
        h.k(view, f10);
    }

    public static List n(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(K0.d.f6668H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(K0.d.f6668H, arrayList2);
        return arrayList2;
    }

    public static void n0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    public static int o(View view, CharSequence charSequence) {
        List listN = n(view);
        for (int i10 = 0; i10 < listN.size(); i10++) {
            if (TextUtils.equals(charSequence, ((h.a) listN.get(i10)).c())) {
                return ((h.a) listN.get(i10)).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f19585b;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < listN.size(); i14++) {
                z10 &= ((h.a) listN.get(i14)).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static void o0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static ColorStateList p(View view) {
        return h.b(view);
    }

    public static void p0(View view, int i10) {
        j.b(view, i10);
    }

    public static PorterDuff.Mode q(View view) {
        return h.c(view);
    }

    public static void q0(View view, w wVar) {
        h.l(view, wVar);
    }

    public static Display r(View view) {
        return view.getDisplay();
    }

    public static void r0(View view, int i10, int i11, int i12, int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static float s(View view) {
        return h.d(view);
    }

    public static void s0(View view, int i10, int i11) {
        i.b(view, i10, i11);
    }

    public static boolean t(View view) {
        return view.getFitsSystemWindows();
    }

    public static void t0(View view, CharSequence charSequence) {
        x0().f(view, charSequence);
    }

    public static int u(View view) {
        return view.getImportantForAccessibility();
    }

    public static void u0(View view, String str) {
        h.m(view, str);
    }

    public static int v(View view) {
        return j.a(view);
    }

    public static void v0(View view, float f10) {
        h.n(view, f10);
    }

    public static int w(View view) {
        return view.getLayoutDirection();
    }

    public static void w0(View view, float f10) {
        h.o(view, f10);
    }

    public static int x(View view) {
        return view.getMinimumHeight();
    }

    public static f x0() {
        return new c(K0.d.f6674N, CharSequence.class, 64, 30);
    }

    public static int y(View view) {
        return view.getMinimumWidth();
    }

    public static void y0(View view) {
        h.p(view);
    }

    public static int z(View view) {
        return view.getPaddingEnd();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakHashMap f19588a = new WeakHashMap();

        public void a(View view) {
            this.f19588a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                b(view);
            }
        }

        public final void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void c(View view) {
            this.f19588a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            d(view);
        }

        public final void d(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
