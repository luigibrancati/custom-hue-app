package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import o.InterfaceC5183f;
import p.AbstractViewOnTouchListenerC5332K;
import p.C5324C;
import p.a0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C5324C implements j.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f21464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f21465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f21466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e.b f21467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AbstractViewOnTouchListenerC5332K f21468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f21469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f21470n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21471o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21472p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f21473q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21474r;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractViewOnTouchListenerC5332K {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // p.AbstractViewOnTouchListenerC5332K
        public InterfaceC5183f b() {
            b bVar = ActionMenuItemView.this.f21469m;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // p.AbstractViewOnTouchListenerC5332K
        public boolean c() {
            InterfaceC5183f interfaceC5183fB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f21467k;
            return bVar != null && bVar.b(actionMenuItemView.f21464h) && (interfaceC5183fB = b()) != null && interfaceC5183fB.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {
        public abstract InterfaceC5183f a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return s();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return s() && this.f21464h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(g gVar, int i10) {
        this.f21464h = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f21468l == null) {
            this.f21468l = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f21464h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f21467k;
        if (bVar != null) {
            bVar.b(this.f21464h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f21470n = t();
        u();
    }

    @Override // p.C5324C, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean zS = s();
        if (zS && (i12 = this.f21473q) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f21472p) : this.f21472p;
        if (mode != 1073741824 && this.f21472p > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zS || this.f21466j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f21466j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC5332K abstractViewOnTouchListenerC5332K;
        if (this.f21464h.hasSubMenu() && (abstractViewOnTouchListenerC5332K = this.f21468l) != null && abstractViewOnTouchListenerC5332K.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean s() {
        return !TextUtils.isEmpty(getText());
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f21471o != z10) {
            this.f21471o = z10;
            g gVar = this.f21464h;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f21466j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f21474r;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        u();
    }

    public void setItemInvoker(e.b bVar) {
        this.f21467k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f21473q = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f21469m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f21465i = charSequence;
        u();
    }

    public final boolean t() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void u() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f21465i);
        if (this.f21466j != null && (!this.f21464h.B() || (!this.f21470n && !this.f21471o))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f21465i : null);
        CharSequence contentDescription = this.f21464h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f21464h.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f21464h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            a0.a(this, z12 ? null : this.f21464h.getTitle());
        } else {
            a0.a(this, tooltipText);
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f21470n = t();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.j.f36151v, i10, 0);
        this.f21472p = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.j.f36156w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f21474r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f21473q = -1;
        setSaveEnabled(false);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }
}
