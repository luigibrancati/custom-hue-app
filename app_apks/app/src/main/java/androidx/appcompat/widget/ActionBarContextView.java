package androidx.appcompat.widget;

import Y0.E;
import Y0.M;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import h.AbstractC4262a;
import h.f;
import h.g;
import h.j;
import n.AbstractC5057b;
import p.AbstractC5339a;
import p.W;
import p.c0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC5339a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f21671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f21672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f21673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f21674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f21675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f21676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f21677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f21678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f21679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f21681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f21682t;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC5057b f21683a;

        public a(AbstractC5057b abstractC5057b) {
            this.f21683a = abstractC5057b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21683a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    @Override // p.AbstractC5339a
    public /* bridge */ /* synthetic */ M f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f21673k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // p.AbstractC5339a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // p.AbstractC5339a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f21672j;
    }

    public CharSequence getTitle() {
        return this.f21671i;
    }

    public void h(AbstractC5057b abstractC5057b) {
        View view = this.f21673k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f21682t, (ViewGroup) this, false);
            this.f21673k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f21673k);
        }
        View viewFindViewById = this.f21673k.findViewById(f.f35890i);
        this.f21674l = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(abstractC5057b));
        e eVar = (e) abstractC5057b.e();
        androidx.appcompat.widget.a aVar = this.f41899d;
        if (aVar != null) {
            aVar.y();
        }
        androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(getContext());
        this.f41899d = aVar2;
        aVar2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f41899d, this.f41897b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f41899d.o(this);
        this.f41898c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f41898c, layoutParams);
    }

    public final void i() {
        if (this.f21676n == null) {
            LayoutInflater.from(getContext()).inflate(g.f35908a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f21676n = linearLayout;
            this.f21677o = (TextView) linearLayout.findViewById(f.f35886e);
            this.f21678p = (TextView) this.f21676n.findViewById(f.f35885d);
            if (this.f21679q != 0) {
                this.f21677o.setTextAppearance(getContext(), this.f21679q);
            }
            if (this.f21680r != 0) {
                this.f21678p.setTextAppearance(getContext(), this.f21680r);
            }
        }
        this.f21677o.setText(this.f21671i);
        this.f21678p.setText(this.f21672j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f21671i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f21672j);
        this.f21678p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f21676n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f21676n.getParent() == null) {
            addView(this.f21676n);
        }
    }

    public boolean j() {
        return this.f21681s;
    }

    public void k() {
        removeAllViews();
        this.f21675m = null;
        this.f41898c = null;
        this.f41899d = null;
        View view = this.f21674l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        androidx.appcompat.widget.a aVar = this.f41899d;
        if (aVar != null) {
            return aVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.f41899d;
        if (aVar != null) {
            aVar.B();
            this.f41899d.C();
        }
    }

    @Override // p.AbstractC5339a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zB = c0.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f21673k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f21673k.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = AbstractC5339a.d(paddingRight, i14, zB);
            paddingRight = AbstractC5339a.d(iD + e(this.f21673k, iD, paddingTop, paddingTop2, zB), i15, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f21676n;
        if (linearLayout != null && this.f21675m == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f21676n, iE, paddingTop, paddingTop2, zB);
        }
        View view2 = this.f21675m;
        if (view2 != null) {
            e(view2, iE, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f41898c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f41900e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f21673k;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f21673k.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f41898c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f41898c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f21676n;
        if (linearLayout != null && this.f21675m == null) {
            if (this.f21681s) {
                this.f21676n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f21676n.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f21676n.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f21675m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f21675m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f41900e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // p.AbstractC5339a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // p.AbstractC5339a
    public void setContentHeight(int i10) {
        this.f41900e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f21675m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f21675m = view;
        if (view != null && (linearLayout = this.f21676n) != null) {
            removeView(linearLayout);
            this.f21676n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f21672j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f21671i = charSequence;
        i();
        E.i0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f21681s) {
            requestLayout();
        }
        this.f21681s = z10;
    }

    @Override // p.AbstractC5339a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4262a.f35798g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        W wV = W.v(context, attributeSet, j.f36166y, i10, 0);
        setBackground(wV.g(j.f36171z));
        this.f21679q = wV.n(j.f35954D, 0);
        this.f21680r = wV.n(j.f35950C, 0);
        this.f41900e = wV.m(j.f35946B, 0);
        this.f21682t = wV.n(j.f35941A, g.f35911d);
        wV.x();
    }
}
