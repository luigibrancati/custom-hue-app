package androidx.appcompat.widget;

import Y0.E;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import h.j;
import p.W;
import p.c0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f21901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f21903i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f21904j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f21905k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21907m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21908n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21909o;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j(int r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
        Lb:
            if (r0 >= r10) goto L3d
            android.view.View r3 = r9.q(r0)
            int r1 = r3.getVisibility()
            r2 = 8
            if (r1 == r2) goto L36
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            androidx.appcompat.widget.b$a r1 = (androidx.appcompat.widget.b.a) r1
            int r2 = r1.width
            r5 = -1
            if (r2 != r5) goto L36
            int r8 = r1.height
            int r2 = r3.getMeasuredHeight()
            r1.height = r2
            r5 = 0
            r7 = 0
            r2 = r9
            r6 = r11
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r1.height = r8
            goto L38
        L36:
            r2 = r9
            r6 = r11
        L38:
            int r0 = r0 + 1
            r9 = r2
            r11 = r6
            goto Lb
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.j(int, int):void");
    }

    private void y(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void e(Canvas canvas) {
        int right;
        int left;
        int i10;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = c0.b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View viewQ = q(i11);
            if (viewQ != null && viewQ.getVisibility() != 8 && r(i11)) {
                a aVar = (a) viewQ.getLayoutParams();
                h(canvas, zB ? viewQ.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (viewQ.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f21906l);
            }
        }
        if (r(virtualChildCount)) {
            View viewQ2 = q(virtualChildCount - 1);
            if (viewQ2 != null) {
                a aVar2 = (a) viewQ2.getLayoutParams();
                if (zB) {
                    left = viewQ2.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i10 = this.f21906l;
                    right = left - i10;
                } else {
                    right = viewQ2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f21906l;
                right = left - i10;
            }
            h(canvas, right);
        }
    }

    public void f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View viewQ = q(i10);
            if (viewQ != null && viewQ.getVisibility() != 8 && r(i10)) {
                g(canvas, (viewQ.getTop() - ((LinearLayout.LayoutParams) ((a) viewQ.getLayoutParams())).topMargin) - this.f21907m);
            }
        }
        if (r(virtualChildCount)) {
            View viewQ2 = q(virtualChildCount - 1);
            g(canvas, viewQ2 == null ? (getHeight() - getPaddingBottom()) - this.f21907m : viewQ2.getBottom() + ((LinearLayout.LayoutParams) ((a) viewQ2.getLayoutParams())).bottomMargin);
        }
    }

    public void g(Canvas canvas, int i10) {
        this.f21905k.setBounds(getPaddingLeft() + this.f21909o, i10, (getWidth() - getPaddingRight()) - this.f21909o, this.f21907m + i10);
        this.f21905k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f21896b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f21896b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f21896b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f21897c;
        if (this.f21898d == 1 && (i10 = this.f21899e & 112) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f21900f) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f21900f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f21896b;
    }

    public Drawable getDividerDrawable() {
        return this.f21905k;
    }

    public int getDividerPadding() {
        return this.f21909o;
    }

    public int getDividerWidth() {
        return this.f21906l;
    }

    public int getGravity() {
        return this.f21899e;
    }

    public int getOrientation() {
        return this.f21898d;
    }

    public int getShowDividers() {
        return this.f21908n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f21901g;
    }

    public void h(Canvas canvas, int i10) {
        this.f21905k.setBounds(i10, getPaddingTop() + this.f21909o, this.f21906l + i10, (getHeight() - getPaddingBottom()) - this.f21909o);
        this.f21905k.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
        Lb:
            if (r0 >= r10) goto L3d
            android.view.View r3 = r9.q(r0)
            int r1 = r3.getVisibility()
            r2 = 8
            if (r1 == r2) goto L36
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            androidx.appcompat.widget.b$a r1 = (androidx.appcompat.widget.b.a) r1
            int r2 = r1.height
            r4 = -1
            if (r2 != r4) goto L36
            int r8 = r1.width
            int r2 = r3.getMeasuredWidth()
            r1.width = r2
            r5 = 0
            r7 = 0
            r2 = r9
            r4 = r11
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r1.width = r8
            goto L38
        L36:
            r2 = r9
            r4 = r11
        L38:
            int r0 = r0 + 1
            r9 = r2
            r11 = r4
            goto Lb
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.i(int, int):void");
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f21898d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public int n(View view, int i10) {
        return 0;
    }

    public int o(View view) {
        return 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f21905k == null) {
            return;
        }
        if (this.f21898d == 1) {
            f(canvas);
        } else {
            e(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f21898d == 1) {
            t(i10, i11, i12, i13);
        } else {
            s(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f21898d == 1) {
            x(i10, i11);
        } else {
            v(i10, i11);
        }
    }

    public int p(View view) {
        return 0;
    }

    public View q(int i10) {
        return getChildAt(i10);
    }

    public boolean r(int i10) {
        if (i10 == 0) {
            return (this.f21908n & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f21908n & 4) != 0;
        }
        if ((this.f21908n & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.s(int, int, int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f21895a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f21896b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f21905k) {
            return;
        }
        this.f21905k = drawable;
        if (drawable != null) {
            this.f21906l = drawable.getIntrinsicWidth();
            this.f21907m = drawable.getIntrinsicHeight();
        } else {
            this.f21906l = 0;
            this.f21907m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f21909o = i10;
    }

    public void setGravity(int i10) {
        if (this.f21899e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f21899e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f21899e;
        if ((8388615 & i12) != i11) {
            this.f21899e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f21902h = z10;
    }

    public void setOrientation(int i10) {
        if (this.f21898d != i10) {
            this.f21898d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f21908n) {
            requestLayout();
        }
        this.f21908n = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f21899e;
        if ((i12 & 112) != i11) {
            this.f21899e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f21901g = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(int r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            int r0 = r11.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r11.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r0
            int r1 = r11.getPaddingRight()
            int r14 = r14 - r1
            int r1 = r11.getVirtualChildCount()
            int r2 = r11.f21899e
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L35
            r4 = 80
            if (r3 == r4) goto L2a
            int r13 = r11.getPaddingTop()
            goto L41
        L2a:
            int r3 = r11.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r11.f21900f
            int r13 = r3 - r13
            goto L41
        L35:
            int r3 = r11.getPaddingTop()
            int r15 = r15 - r13
            int r13 = r11.f21900f
            int r15 = r15 - r13
            int r15 = r15 / 2
            int r13 = r3 + r15
        L41:
            r15 = 0
        L42:
            if (r15 >= r1) goto Lba
            android.view.View r4 = r11.q(r15)
            r9 = 1
            if (r4 != 0) goto L52
            int r3 = r11.w(r15)
            int r13 = r13 + r3
        L50:
            r3 = r11
            goto Lb7
        L52:
            int r3 = r4.getVisibility()
            r5 = 8
            if (r3 == r5) goto L50
            int r7 = r4.getMeasuredWidth()
            int r8 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            r10 = r3
            androidx.appcompat.widget.b$a r10 = (androidx.appcompat.widget.b.a) r10
            int r3 = r10.gravity
            if (r3 >= 0) goto L6e
            r3 = r2
        L6e:
            int r5 = r11.getLayoutDirection()
            int r3 = Y0.AbstractC2554h.b(r3, r5)
            r3 = r3 & 7
            if (r3 == r9) goto L88
            r5 = 5
            if (r3 == r5) goto L82
            int r3 = r10.leftMargin
            int r3 = r3 + r0
        L80:
            r5 = r3
            goto L93
        L82:
            int r3 = r12 - r7
            int r5 = r10.rightMargin
        L86:
            int r3 = r3 - r5
            goto L80
        L88:
            int r3 = r14 - r7
            int r3 = r3 / 2
            int r3 = r3 + r0
            int r5 = r10.leftMargin
            int r3 = r3 + r5
            int r5 = r10.rightMargin
            goto L86
        L93:
            boolean r3 = r11.r(r15)
            if (r3 == 0) goto L9c
            int r3 = r11.f21907m
            int r13 = r13 + r3
        L9c:
            int r3 = r10.topMargin
            int r13 = r13 + r3
            int r3 = r11.o(r4)
            int r6 = r13 + r3
            r3 = r11
            r3.y(r4, r5, r6, r7, r8)
            int r11 = r10.bottomMargin
            int r8 = r8 + r11
            int r11 = r3.p(r4)
            int r8 = r8 + r11
            int r13 = r13 + r8
            int r11 = r3.n(r4, r15)
            int r15 = r15 + r11
        Lb7:
            int r15 = r15 + r9
            r11 = r3
            goto L42
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.t(int, int, int, int):void");
    }

    public void u(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0461  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v(int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 1294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.v(int, int):void");
    }

    public int w(int i10) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x(int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 879
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.x(int, int):void");
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21895a = true;
        this.f21896b = -1;
        this.f21897c = 0;
        this.f21899e = 8388659;
        W wV = W.v(context, attributeSet, j.f36048a1, i10, 0);
        E.d0(this, context, j.f36048a1, attributeSet, wV.r(), i10, 0);
        int iK = wV.k(j.f36058c1, -1);
        if (iK >= 0) {
            setOrientation(iK);
        }
        int iK2 = wV.k(j.f36053b1, -1);
        if (iK2 >= 0) {
            setGravity(iK2);
        }
        boolean zA = wV.a(j.f36063d1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f21901g = wV.i(j.f36073f1, -1.0f);
        this.f21896b = wV.k(j.f36068e1, -1);
        this.f21902h = wV.a(j.f36088i1, false);
        setDividerDrawable(wV.g(j.f36078g1));
        this.f21908n = wV.k(j.f36093j1, 0);
        this.f21909o = wV.f(j.f36083h1, 0);
        wV.x();
    }
}
