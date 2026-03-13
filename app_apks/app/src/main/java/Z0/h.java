package Z0;

import Z0.k;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f20089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20090b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20091c = -1;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final a f20092A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final a f20093B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final a f20094C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final a f20095D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final a f20096E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final a f20097F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final a f20098G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final a f20099H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final a f20100I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final a f20101J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static final a f20102K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final a f20103L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public static final a f20104M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final a f20105N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final a f20106O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public static final a f20107P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public static final a f20108Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public static final a f20109R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final a f20110S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public static final a f20111T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public static final a f20112U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public static final a f20113V;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f20114e = new a(1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f20115f = new a(2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f20116g = new a(4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f20117h = new a(8, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f20118i = new a(16, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f20119j = new a(32, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f20120k = new a(64, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f20121l = new a(128, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f20122m = new a(256, (CharSequence) null, k.b.class);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f20123n = new a(512, (CharSequence) null, k.b.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f20124o = new a(RecognitionOptions.UPC_E, (CharSequence) null, k.c.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f20125p = new a(RecognitionOptions.PDF417, (CharSequence) null, k.c.class);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f20126q = new a(RecognitionOptions.AZTEC, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f20127r = new a(8192, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f20128s = new a(16384, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f20129t = new a(32768, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f20130u = new a(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f20131v = new a(131072, (CharSequence) null, k.g.class);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f20132w = new a(262144, null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f20133x = new a(ImageMetadata.LENS_APERTURE, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final a f20134y = new a(ImageMetadata.SHADING_MODE, null);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f20135z = new a(2097152, (CharSequence) null, k.h.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f20136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class f20138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final k f20139d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            f20092A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f20093B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, k.e.class);
            f20094C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f20095D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f20096E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f20097F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f20098G = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
            f20099H = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
            f20100I = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
            f20101J = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
            f20102K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f20103L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, k.f.class);
            f20104M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, k.d.class);
            f20105N = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
            f20106O = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
            f20107P = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD, R.id.accessibilityActionPressAndHold, null, null, null);
            f20108Q = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER, R.id.accessibilityActionImeEnter, null, null, null);
            f20109R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f20110S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f20111T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f20112U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f20113V = new a(i10 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a a(CharSequence charSequence, k kVar) {
            return new a(null, this.f20137b, charSequence, kVar, this.f20138c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f20136a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f20136a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f20139d == null) {
                return false;
            }
            Class cls = this.f20138c;
            k.a aVar = null;
            if (cls != null) {
                try {
                    k.a aVar2 = (k.a) cls.getDeclaredConstructor(null).newInstance(null);
                    try {
                        aVar2.a(bundle);
                        aVar = aVar2;
                    } catch (Exception e10) {
                        e = e10;
                        aVar = aVar2;
                        Class cls2 = this.f20138c;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
            return this.f20139d.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f20136a;
            return obj2 == null ? aVar.f20136a == null : obj2.equals(aVar.f20136a);
        }

        public int hashCode() {
            Object obj = this.f20136a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String strG = h.g(this.f20137b);
            if (strG.equals("ACTION_UNKNOWN") && c() != null) {
                strG = c().toString();
            }
            sb2.append(strG);
            return sb2.toString();
        }

        public a(int i10, CharSequence charSequence, k kVar) {
            this(null, i10, charSequence, kVar, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i10, CharSequence charSequence, Class cls) {
            this(null, i10, charSequence, null, cls);
        }

        public a(Object obj, int i10, CharSequence charSequence, k kVar, Class cls) {
            this.f20137b = i10;
            this.f20139d = kVar;
            if (obj == null) {
                this.f20136a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f20136a = obj;
            }
            this.f20138c = cls;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e {
        public static int b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getChecked();
        }

        public static int c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExpandedState();
        }

        public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getSupplementalDescription();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isFieldRequired();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f20140a;

        public f(Object obj) {
            this.f20140a = obj;
        }

        public static f a(int i10, int i11, boolean z10, int i12) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f20141a;

        public g(Object obj) {
            this.f20141a = obj;
        }

        public static g a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    public h(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f20089a = accessibilityNodeInfo;
    }

    public static h I0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new h(accessibilityNodeInfo);
    }

    public static h Y() {
        return I0(AccessibilityNodeInfo.obtain());
    }

    public static h Z(h hVar) {
        return I0(AccessibilityNodeInfo.obtain(hVar.f20089a));
    }

    public static h a0(View view) {
        return I0(AccessibilityNodeInfo.obtain(view));
    }

    public static String g(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case RecognitionOptions.UPC_E /* 1024 */:
                return "ACTION_NEXT_HTML_ELEMENT";
            case RecognitionOptions.PDF417 /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case RecognitionOptions.AZTEC /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case ImageMetadata.CONTROL_AE_ANTIBANDING_MODE /* 65536 */:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case ImageMetadata.LENS_APERTURE /* 524288 */:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static String v(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "FULL" : "PARTIAL" : "COLLAPSED" : "UNDEFINED";
    }

    public CharSequence A() {
        return Build.VERSION.SDK_INT >= 36 ? e.d(this.f20089a) : this.f20089a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
    }

    public void A0(boolean z10) {
        this.f20089a.setScrollable(z10);
    }

    public CharSequence B() {
        if (!F()) {
            return this.f20089a.getText();
        }
        List listE = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listE2 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listE3 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listE4 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f20089a.getText(), 0, this.f20089a.getText().length()));
        for (int i10 = 0; i10 < listE.size(); i10++) {
            spannableString.setSpan(new Z0.a(((Integer) listE4.get(i10)).intValue(), this, w().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listE.get(i10)).intValue(), ((Integer) listE2.get(i10)).intValue(), ((Integer) listE3.get(i10)).intValue());
        }
        return spannableString;
    }

    public void B0(boolean z10) {
        this.f20089a.setShowingHintText(z10);
    }

    public CharSequence C() {
        return this.f20089a.getTooltipText();
    }

    public void C0(View view, int i10) {
        this.f20091c = i10;
        this.f20089a.setSource(view, i10);
    }

    public String D() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.f20089a) : this.f20089a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void D0(CharSequence charSequence) {
        b.b(this.f20089a, charSequence);
    }

    public String E() {
        return this.f20089a.getViewIdResourceName();
    }

    public void E0(CharSequence charSequence) {
        this.f20089a.setText(charSequence);
    }

    public final boolean F() {
        return !e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public void F0(View view) {
        this.f20089a.setTraversalAfter(view);
    }

    public boolean G() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f20089a) : i(64);
    }

    public void G0(boolean z10) {
        this.f20089a.setVisibleToUser(z10);
    }

    public boolean H() {
        return this.f20089a.isCheckable();
    }

    public AccessibilityNodeInfo H0() {
        return this.f20089a;
    }

    public boolean I() {
        return this.f20089a.isChecked();
    }

    public boolean J() {
        return this.f20089a.isClickable();
    }

    public boolean K() {
        return this.f20089a.isContextClickable();
    }

    public boolean L() {
        return this.f20089a.isEnabled();
    }

    public boolean M() {
        return Build.VERSION.SDK_INT >= 36 ? e.e(this.f20089a) : this.f20089a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public boolean N() {
        return this.f20089a.isFocusable();
    }

    public boolean O() {
        return this.f20089a.isFocused();
    }

    public boolean P() {
        return i(67108864);
    }

    public boolean Q() {
        return this.f20089a.isImportantForAccessibility();
    }

    public boolean R() {
        return this.f20089a.isLongClickable();
    }

    public boolean S() {
        return this.f20089a.isPassword();
    }

    public boolean T() {
        return this.f20089a.isScrollable();
    }

    public boolean U() {
        return this.f20089a.isSelected();
    }

    public boolean V() {
        return this.f20089a.isShowingHintText();
    }

    public boolean W() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f20089a) : i(8388608);
    }

    public boolean X() {
        return this.f20089a.isVisibleToUser();
    }

    public void a(int i10) {
        this.f20089a.addAction(i10);
    }

    public void b(a aVar) {
        this.f20089a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f20136a);
    }

    public boolean b0(int i10, Bundle bundle) {
        return this.f20089a.performAction(i10, bundle);
    }

    public void c(View view, int i10) {
        this.f20089a.addChild(view, i10);
    }

    public void d0(boolean z10) {
        this.f20089a.setAccessibilityFocused(z10);
    }

    public final List e(String str) {
        ArrayList<Integer> integerArrayList = this.f20089a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f20089a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void e0(Rect rect) {
        this.f20089a.setBoundsInParent(rect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f20089a;
        if (accessibilityNodeInfo == null) {
            if (hVar.f20089a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(hVar.f20089a)) {
            return false;
        }
        return this.f20091c == hVar.f20091c && this.f20090b == hVar.f20090b;
    }

    public List f() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f20089a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public void f0(Rect rect) {
        this.f20089a.setBoundsInScreen(rect);
    }

    public void g0(boolean z10) {
        this.f20089a.setCheckable(z10);
    }

    public int h() {
        return this.f20089a.getActions();
    }

    public void h0(boolean z10) {
        this.f20089a.setChecked(z10);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f20089a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final boolean i(int i10) {
        Bundle bundleW = w();
        return bundleW != null && (bundleW.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public void i0(CharSequence charSequence) {
        this.f20089a.setClassName(charSequence);
    }

    public void j(Rect rect) {
        this.f20089a.getBoundsInParent(rect);
    }

    public void j0(boolean z10) {
        this.f20089a.setClickable(z10);
    }

    public void k(Rect rect) {
        this.f20089a.getBoundsInScreen(rect);
    }

    public void k0(Object obj) {
        this.f20089a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f20140a);
    }

    public void l(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f20089a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f20089a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void l0(Object obj) {
        this.f20089a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f20141a);
    }

    public int m() {
        return Build.VERSION.SDK_INT >= 36 ? e.b(this.f20089a) : this.f20089a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", this.f20089a.isChecked() ? 1 : 0);
    }

    public void m0(CharSequence charSequence) {
        this.f20089a.setContentDescription(charSequence);
    }

    public final String n() {
        int iM = m();
        return iM == 1 ? "TRUE" : iM == 2 ? "PARTIAL" : "FALSE";
    }

    public void n0(boolean z10) {
        this.f20089a.setEnabled(z10);
    }

    public int o() {
        return this.f20089a.getChildCount();
    }

    public void o0(CharSequence charSequence) {
        this.f20089a.setError(charSequence);
    }

    public CharSequence p() {
        return this.f20089a.getClassName();
    }

    public void p0(boolean z10) {
        this.f20089a.setFocusable(z10);
    }

    public void q0(boolean z10) {
        this.f20089a.setFocused(z10);
    }

    public CharSequence r() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f20089a) : this.f20089a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void r0(boolean z10) {
        this.f20089a.setHeading(z10);
    }

    public CharSequence s() {
        return this.f20089a.getContentDescription();
    }

    public void s0(CharSequence charSequence) {
        this.f20089a.setHintText(charSequence);
    }

    public CharSequence t() {
        return this.f20089a.getError();
    }

    public void t0(View view) {
        this.f20089a.setLabelFor(view);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        j(rect);
        sb2.append("; boundsInParent: " + rect);
        k(rect);
        sb2.append("; boundsInScreen: " + rect);
        l(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(y());
        sb2.append("; className: ");
        sb2.append(p());
        sb2.append("; text: ");
        sb2.append(B());
        sb2.append("; error: ");
        sb2.append(t());
        sb2.append("; maxTextLength: ");
        sb2.append(x());
        sb2.append("; stateDescription: ");
        sb2.append(z());
        sb2.append("; contentDescription: ");
        sb2.append(s());
        sb2.append("; supplementalDescription: ");
        sb2.append(A());
        sb2.append("; tooltipText: ");
        sb2.append(C());
        sb2.append("; viewIdResName: ");
        sb2.append(E());
        sb2.append("; uniqueId: ");
        sb2.append(D());
        sb2.append("; checkable: ");
        sb2.append(H());
        sb2.append("; checked: ");
        sb2.append(n());
        sb2.append("; fieldRequired: ");
        sb2.append(M());
        sb2.append("; focusable: ");
        sb2.append(N());
        sb2.append("; focused: ");
        sb2.append(O());
        sb2.append("; selected: ");
        sb2.append(U());
        sb2.append("; clickable: ");
        sb2.append(J());
        sb2.append("; longClickable: ");
        sb2.append(R());
        sb2.append("; contextClickable: ");
        sb2.append(K());
        sb2.append("; expandedState: ");
        sb2.append(v(u()));
        sb2.append("; enabled: ");
        sb2.append(L());
        sb2.append("; password: ");
        sb2.append(S());
        sb2.append("; scrollable: " + T());
        sb2.append("; containerTitle: ");
        sb2.append(r());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(P());
        sb2.append("; importantForAccessibility: ");
        sb2.append(Q());
        sb2.append("; visible: ");
        sb2.append(X());
        sb2.append("; isTextSelectable: ");
        sb2.append(W());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(G());
        sb2.append("; [");
        List listF = f();
        for (int i10 = 0; i10 < listF.size(); i10++) {
            a aVar = (a) listF.get(i10);
            String strG = g(aVar.b());
            if (strG.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strG = aVar.c().toString();
            }
            sb2.append(strG);
            if (i10 != listF.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public int u() {
        return Build.VERSION.SDK_INT >= 36 ? e.c(this.f20089a) : this.f20089a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
    }

    public void u0(int i10) {
        this.f20089a.setMaxTextLength(i10);
    }

    public void v0(CharSequence charSequence) {
        this.f20089a.setPackageName(charSequence);
    }

    public Bundle w() {
        return this.f20089a.getExtras();
    }

    public void w0(CharSequence charSequence) {
        this.f20089a.setPaneTitle(charSequence);
    }

    public int x() {
        return this.f20089a.getMaxTextLength();
    }

    public void x0(View view) {
        this.f20090b = -1;
        this.f20089a.setParent(view);
    }

    public CharSequence y() {
        return this.f20089a.getPackageName();
    }

    public void y0(View view, int i10) {
        this.f20090b = i10;
        this.f20089a.setParent(view, i10);
    }

    public CharSequence z() {
        return b.a(this.f20089a);
    }

    public void z0(boolean z10) {
        this.f20089a.setScreenReaderFocusable(z10);
    }

    public void c0() {
    }

    public void d(CharSequence charSequence, View view) {
    }
}
