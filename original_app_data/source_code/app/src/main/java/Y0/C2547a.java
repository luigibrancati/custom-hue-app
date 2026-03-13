package Y0;

import Z0.h;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: Y0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C2547a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f19635c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f19636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View.AccessibilityDelegate f19637b;

    /* JADX INFO: renamed from: Y0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0245a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2547a f19638a;

        public C0245a(C2547a c2547a) {
            this.f19638a = c2547a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f19638a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            Z0.i iVarB = this.f19638a.b(view);
            if (iVarB != null) {
                return (AccessibilityNodeProvider) iVarB.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f19638a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Z0.h hVarI0 = Z0.h.I0(accessibilityNodeInfo);
            hVarI0.z0(E.O(view));
            hVarI0.r0(E.J(view));
            hVarI0.w0(E.m(view));
            hVarI0.D0(E.C(view));
            this.f19638a.g(view, hVarI0);
            hVarI0.d(accessibilityNodeInfo.getText(), view);
            List listC = C2547a.c(view);
            for (int i10 = 0; i10 < listC.size(); i10++) {
                hVarI0.b((h.a) listC.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f19638a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f19638a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f19638a.j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f19638a.l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f19638a.m(view, accessibilityEvent);
        }
    }

    public C2547a() {
        this(f19635c);
    }

    public static List c(View view) {
        List list = (List) view.getTag(K0.d.f6668H);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f19636a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public Z0.i b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f19636a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new Z0.i(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate d() {
        return this.f19637b;
    }

    public final boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrQ = Z0.h.q(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; clickableSpanArrQ != null && i10 < clickableSpanArrQ.length; i10++) {
                if (clickableSpan.equals(clickableSpanArrQ[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f19636a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, Z0.h hVar) {
        this.f19636a.onInitializeAccessibilityNodeInfo(view, hVar.H0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f19636a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f19636a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) {
        List listC = c(view);
        boolean zPerformAccessibilityAction = false;
        int i11 = 0;
        while (true) {
            if (i11 >= listC.size()) {
                break;
            }
            h.a aVar = (h.a) listC.get(i11);
            if (aVar.b() == i10) {
                zPerformAccessibilityAction = aVar.d(view, bundle);
                break;
            }
            i11++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f19636a.performAccessibilityAction(view, i10, bundle);
        }
        return (zPerformAccessibilityAction || i10 != K0.d.f6676a || bundle == null) ? zPerformAccessibilityAction : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public final boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(K0.d.f6669I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void l(View view, int i10) {
        this.f19636a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f19636a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C2547a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f19636a = accessibilityDelegate;
        this.f19637b = new C0245a(this);
    }
}
