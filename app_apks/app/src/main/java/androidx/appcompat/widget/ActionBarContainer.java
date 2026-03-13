package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.ar.core.ImageMetadata;
import h.f;
import h.j;
import p.C5340b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f21662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f21663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f21664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f21665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f21666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f21667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21670j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C5340b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f36046a);
        this.f21665e = typedArrayObtainStyledAttributes.getDrawable(j.f36051b);
        this.f21666f = typedArrayObtainStyledAttributes.getDrawable(j.f36061d);
        this.f21670j = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f36091j, -1);
        boolean z10 = true;
        if (getId() == f.f35905x) {
            this.f21668h = true;
            this.f21667g = typedArrayObtainStyledAttributes.getDrawable(j.f36056c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f21668h ? this.f21665e != null || this.f21666f != null : this.f21667g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f21665e;
        if (drawable != null && drawable.isStateful()) {
            this.f21665e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f21666f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f21666f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f21667g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f21667g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f21662b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f21665e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f21666f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f21667g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f21663c = findViewById(f.f35882a);
        this.f21664d = findViewById(f.f35887f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f21661a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r0
      0x0048: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00a5, B:33:0x00a9, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f21662b
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L13
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L13
            r1 = r9
            goto L14
        L13:
            r1 = r0
        L14:
            if (r5 == 0) goto L33
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L33
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L33:
            boolean r6 = r4.f21668h
            if (r6 == 0) goto L4b
            android.graphics.drawable.Drawable r5 = r4.f21667g
            if (r5 == 0) goto L48
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto Lbe
        L48:
            r9 = r0
            goto Lbe
        L4b:
            android.graphics.drawable.Drawable r6 = r4.f21665e
            if (r6 == 0) goto La3
            android.view.View r6 = r4.f21663c
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L75
            android.graphics.drawable.Drawable r6 = r4.f21665e
            android.view.View r7 = r4.f21663c
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f21663c
            int r8 = r8.getTop()
            android.view.View r0 = r4.f21663c
            int r0 = r0.getRight()
            android.view.View r2 = r4.f21663c
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto La2
        L75:
            android.view.View r6 = r4.f21664d
            if (r6 == 0) goto L9d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L9d
            android.graphics.drawable.Drawable r6 = r4.f21665e
            android.view.View r7 = r4.f21664d
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f21664d
            int r8 = r8.getTop()
            android.view.View r0 = r4.f21664d
            int r0 = r0.getRight()
            android.view.View r2 = r4.f21664d
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto La2
        L9d:
            android.graphics.drawable.Drawable r6 = r4.f21665e
            r6.setBounds(r0, r0, r0, r0)
        La2:
            r0 = r9
        La3:
            r4.f21669i = r1
            if (r1 == 0) goto L48
            android.graphics.drawable.Drawable r6 = r4.f21666f
            if (r6 == 0) goto L48
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        Lbe:
            if (r9 == 0) goto Lc3
            r4.invalidate()
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (this.f21663c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f21670j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f21663c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f21662b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f21663c) ? a(this.f21663c) : !b(this.f21664d) ? a(this.f21664d) : 0) + a(this.f21662b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f21665e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f21665e);
        }
        this.f21665e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f21663c;
            if (view != null) {
                this.f21665e.setBounds(view.getLeft(), this.f21663c.getTop(), this.f21663c.getRight(), this.f21663c.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f21668h ? !(this.f21665e != null || this.f21666f != null) : this.f21667g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f21667g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f21667g);
        }
        this.f21667g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f21668h && (drawable2 = this.f21667g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f21668h ? !(this.f21665e != null || this.f21666f != null) : this.f21667g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f21666f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f21666f);
        }
        this.f21666f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f21669i && (drawable2 = this.f21666f) != null) {
                drawable2.setBounds(this.f21662b.getLeft(), this.f21662b.getTop(), this.f21662b.getRight(), this.f21662b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f21668h ? !(this.f21665e != null || this.f21666f != null) : this.f21667g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(c cVar) {
        View view = this.f21662b;
        if (view != null) {
            removeView(view);
        }
        this.f21662b = cVar;
    }

    public void setTransitioning(boolean z10) {
        this.f21661a = z10;
        setDescendantFocusability(z10 ? ImageMetadata.HOT_PIXEL_MODE : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f21665e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f21666f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f21667g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f21665e && !this.f21668h) {
            return true;
        }
        if (drawable == this.f21666f && this.f21669i) {
            return true;
        }
        return (drawable == this.f21667g && this.f21668h) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
