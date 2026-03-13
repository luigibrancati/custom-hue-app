package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.b;
import p.c0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.b implements e.b, j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public e f21723A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.appcompat.view.menu.e f21724p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f21725q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21726r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f21727s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public androidx.appcompat.widget.a f21728t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i.a f21729u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e.a f21730v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f21731w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f21732x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f21733y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f21734z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        boolean a();

        boolean b();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f21735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f21736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f21738d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f21739e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f21740f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f21735a = cVar.f21735a;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f21735a = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.f21723A;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f21730v;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int J(android.view.View r5, int r6, int r7, int r8, int r9) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r0 = (androidx.appcompat.widget.ActionMenuView.c) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L28
            boolean r9 = r9.s()
            if (r9 == 0) goto L28
            r9 = r2
            goto L29
        L28:
            r9 = r1
        L29:
            if (r7 <= 0) goto L4c
            r3 = 2
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4c
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L45
            int r4 = r4 + 1
        L45:
            if (r9 == 0) goto L4a
            if (r4 >= r3) goto L4a
            goto L4d
        L4a:
            r3 = r4
            goto L4d
        L4c:
            r3 = r1
        L4d:
            boolean r7 = r0.f21735a
            if (r7 != 0) goto L54
            if (r9 == 0) goto L54
            r1 = r2
        L54:
            r0.f21738d = r1
            r0.f21736b = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.J(android.view.View, int, int, int, int):int");
    }

    @Override // androidx.appcompat.widget.b
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.b
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.b
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c D() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f21735a = true;
        return cVarGenerateDefaultLayoutParams;
    }

    public boolean E(int i10) {
        boolean zA = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            zA = ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? zA : ((a) childAt2).b() | zA;
    }

    public boolean F() {
        androidx.appcompat.widget.a aVar = this.f21728t;
        return aVar != null && aVar.B();
    }

    public boolean G() {
        androidx.appcompat.widget.a aVar = this.f21728t;
        return aVar != null && aVar.D();
    }

    public boolean H() {
        androidx.appcompat.widget.a aVar = this.f21728t;
        return aVar != null && aVar.E();
    }

    public boolean I() {
        return this.f21727s;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    public final void K(int i10, int i11) {
        long j10;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        ?? r32;
        int i14;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i15 = size - paddingLeft;
        int i16 = this.f21733y;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = i16 + (i18 / i17);
        int childCount = getChildCount();
        int iMax = 0;
        int i20 = 0;
        boolean z12 = false;
        int i21 = 0;
        int iMax2 = 0;
        int i22 = 0;
        long j11 = 0;
        while (i20 < childCount) {
            View childAt = getChildAt(i20);
            int i23 = size2;
            if (childAt.getVisibility() == 8) {
                i14 = i19;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                i21++;
                if (z13) {
                    int i24 = this.f21734z;
                    z11 = z13;
                    r32 = 0;
                    childAt.setPadding(i24, 0, i24, 0);
                } else {
                    z11 = z13;
                    r32 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f21740f = r32;
                cVar.f21737c = r32;
                cVar.f21736b = r32;
                cVar.f21738d = r32;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r32;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r32;
                cVar.f21739e = z11 && ((ActionMenuItemView) childAt).s();
                int iJ = J(childAt, i19, cVar.f21735a ? 1 : i17, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iJ);
                i14 = i19;
                if (cVar.f21738d) {
                    i22++;
                }
                if (cVar.f21735a) {
                    z12 = true;
                }
                i17 -= iJ;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iJ == 1) {
                    j11 |= (long) (1 << i20);
                }
            }
            i20++;
            size2 = i23;
            i19 = i14;
        }
        int i25 = size2;
        int i26 = i19;
        char c10 = 2;
        boolean z14 = z12 && i21 == 2;
        boolean z15 = false;
        while (i22 > 0 && i17 > 0) {
            int i27 = Integer.MAX_VALUE;
            long j12 = 0;
            char c11 = c10;
            int i28 = 0;
            int i29 = 0;
            j10 = 1;
            while (i29 < childCount) {
                c cVar2 = (c) getChildAt(i29).getLayoutParams();
                boolean z16 = z14;
                if (cVar2.f21738d) {
                    int i30 = cVar2.f21736b;
                    if (i30 < i27) {
                        j12 = 1 << i29;
                        i27 = i30;
                        i28 = 1;
                    } else if (i30 == i27) {
                        j12 |= 1 << i29;
                        i28++;
                    }
                }
                i29++;
                z14 = z16;
            }
            boolean z17 = z14;
            j11 |= j12;
            if (i28 > i17) {
                break;
            }
            int i31 = i27 + 1;
            int i32 = 0;
            while (i32 < childCount) {
                View childAt2 = getChildAt(i32);
                c cVar3 = (c) childAt2.getLayoutParams();
                long j13 = 1 << i32;
                if ((j12 & j13) == 0) {
                    if (cVar3.f21736b == i31) {
                        j11 |= j13;
                    }
                    i13 = i32;
                } else {
                    if (!z17 || !cVar3.f21739e) {
                        i13 = i32;
                        z10 = true;
                    } else if (i17 == 1) {
                        int i33 = this.f21734z;
                        z10 = true;
                        i13 = i32;
                        childAt2.setPadding(i33 + i26, 0, i33, 0);
                    } else {
                        i13 = i32;
                        z10 = true;
                    }
                    cVar3.f21736b++;
                    cVar3.f21740f = z10;
                    i17--;
                }
                i32 = i13 + 1;
            }
            c10 = c11;
            z14 = z17;
            z15 = true;
        }
        j10 = 1;
        boolean z18 = !z12 && i21 == 1;
        if (i17 <= 0 || j11 == 0 || (i17 >= i21 - 1 && !z18 && iMax2 <= 1)) {
            i12 = 0;
        } else {
            float fBitCount = Long.bitCount(j11);
            if (z18) {
                i12 = 0;
            } else {
                if ((j11 & j10) != 0) {
                    i12 = 0;
                    if (!((c) getChildAt(0).getLayoutParams()).f21739e) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i12 = 0;
                }
                int i34 = childCount - 1;
                if ((j11 & ((long) (1 << i34))) != 0 && !((c) getChildAt(i34).getLayoutParams()).f21739e) {
                    fBitCount -= 0.5f;
                }
            }
            int i35 = fBitCount > 0.0f ? (int) ((i17 * i26) / fBitCount) : i12;
            boolean z19 = z15;
            for (int i36 = i12; i36 < childCount; i36++) {
                if ((j11 & ((long) (1 << i36))) != 0) {
                    View childAt3 = getChildAt(i36);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f21737c = i35;
                        cVar4.f21740f = true;
                        if (i36 == 0 && !cVar4.f21739e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i35) / 2;
                        }
                        z19 = true;
                    } else if (cVar4.f21735a) {
                        cVar4.f21737c = i35;
                        cVar4.f21740f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i35) / 2;
                        z19 = true;
                    } else {
                        if (i36 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i35 / 2;
                        }
                        if (i36 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i35 / 2;
                        }
                    }
                }
            }
            z15 = z19;
        }
        if (z15) {
            for (int i37 = i12; i37 < childCount; i37++) {
                View childAt4 = getChildAt(i37);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f21740f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f21736b * i26) + cVar5.f21737c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i15, mode != 1073741824 ? iMax : i25);
    }

    public androidx.appcompat.view.menu.e L() {
        return this.f21724p;
    }

    public void M(i.a aVar, e.a aVar2) {
        this.f21729u = aVar;
        this.f21730v = aVar2;
    }

    public boolean N() {
        androidx.appcompat.widget.a aVar = this.f21728t;
        return aVar != null && aVar.K();
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(androidx.appcompat.view.menu.e eVar) {
        this.f21724p = eVar;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean b(g gVar) {
        return this.f21724p.M(gVar, 0);
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f21724p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f21724p = eVar;
            eVar.S(new d());
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(context);
            this.f21728t = aVar;
            aVar.J(true);
            androidx.appcompat.widget.a aVar2 = this.f21728t;
            i.a bVar = this.f21729u;
            if (bVar == null) {
                bVar = new b();
            }
            aVar2.d(bVar);
            this.f21724p.c(this.f21728t, this.f21725q);
            this.f21728t.H(this);
        }
        return this.f21724p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f21728t.A();
    }

    public int getPopupTheme() {
        return this.f21726r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.f21728t;
        if (aVar != null) {
            aVar.f(false);
            if (this.f21728t.E()) {
                this.f21728t.B();
                this.f21728t.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f21731w) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean zB = c0.b(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f21735a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (E(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    E(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f21735a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f21735a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = i27 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i10, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = this.f21731w;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f21731w = z11;
        if (z10 != z11) {
            this.f21732x = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f21731w && (eVar = this.f21724p) != null && size != this.f21732x) {
            this.f21732x = size;
            eVar.L(true);
        }
        int childCount = getChildCount();
        if (this.f21731w && childCount > 0) {
            K(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            c cVar = (c) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f21728t.G(z10);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f21723A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f21728t.I(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f21727s = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f21726r != i10) {
            this.f21726r = i10;
            if (i10 == 0) {
                this.f21725q = getContext();
            } else {
                this.f21725q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.f21728t = aVar;
        aVar.H(this);
    }

    public void z() {
        androidx.appcompat.widget.a aVar = this.f21728t;
        if (aVar != null) {
            aVar.y();
        }
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f21733y = (int) (56.0f * f10);
        this.f21734z = (int) (f10 * 4.0f);
        this.f21725q = context;
        this.f21726r = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements i.a {
        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }
    }
}
