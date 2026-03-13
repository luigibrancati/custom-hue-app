package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import h.AbstractC4262a;
import p.W;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements j.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f21479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f21480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RadioButton f21481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f21482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CheckBox f21483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f21484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f21485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f21486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f21487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f21488j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21489k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f21490l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21491m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f21492n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21493o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayoutInflater f21494p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f21495q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4262a.f35782A);
    }

    private LayoutInflater getInflater() {
        if (this.f21494p == null) {
            this.f21494p = LayoutInflater.from(getContext());
        }
        return this.f21494p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f21485g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f21486h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21486h.getLayoutParams();
        rect.top += this.f21486h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view, int i10) {
        LinearLayout linearLayout = this.f21487i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(g gVar, int i10) {
        this.f21479a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return false;
    }

    public final void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(h.g.f35915h, (ViewGroup) this, false);
        this.f21483e = checkBox;
        a(checkBox);
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(h.g.f35916i, (ViewGroup) this, false);
        this.f21480b = imageView;
        b(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(h.g.f35918k, (ViewGroup) this, false);
        this.f21481c = radioButton;
        a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f21479a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f21479a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f21484f.setText(this.f21479a.h());
        }
        if (this.f21484f.getVisibility() != i10) {
            this.f21484f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f21488j);
        TextView textView = (TextView) findViewById(h.f.f35878B);
        this.f21482d = textView;
        int i10 = this.f21489k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f21490l, i10);
        }
        this.f21484f = (TextView) findViewById(h.f.f35903v);
        ImageView imageView = (ImageView) findViewById(h.f.f35906y);
        this.f21485g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f21492n);
        }
        this.f21486h = (ImageView) findViewById(h.f.f35898q);
        this.f21487i = (LinearLayout) findViewById(h.f.f35893l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f21480b != null && this.f21491m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f21480b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f21481c == null && this.f21483e == null) {
            return;
        }
        if (this.f21479a.m()) {
            if (this.f21481c == null) {
                g();
            }
            compoundButton = this.f21481c;
            view = this.f21483e;
        } else {
            if (this.f21483e == null) {
                e();
            }
            compoundButton = this.f21483e;
            view = this.f21481c;
        }
        if (z10) {
            compoundButton.setChecked(this.f21479a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f21483e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f21481c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f21479a.m()) {
            if (this.f21481c == null) {
                g();
            }
            compoundButton = this.f21481c;
        } else {
            if (this.f21483e == null) {
                e();
            }
            compoundButton = this.f21483e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f21495q = z10;
        this.f21491m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f21486h;
        if (imageView != null) {
            imageView.setVisibility((this.f21493o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f21479a.z() || this.f21495q;
        if (z10 || this.f21491m) {
            ImageView imageView = this.f21480b;
            if (imageView == null && drawable == null && !this.f21491m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f21491m) {
                this.f21480b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f21480b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f21480b.getVisibility() != 0) {
                this.f21480b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f21482d.getVisibility() != 8) {
                this.f21482d.setVisibility(8);
            }
        } else {
            this.f21482d.setText(charSequence);
            if (this.f21482d.getVisibility() != 0) {
                this.f21482d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        W wV = W.v(getContext(), attributeSet, h.j.f36020T1, i10, 0);
        this.f21488j = wV.g(h.j.f36028V1);
        this.f21489k = wV.n(h.j.f36024U1, -1);
        this.f21491m = wV.a(h.j.f36032W1, false);
        this.f21490l = context;
        this.f21492n = wV.g(h.j.f36036X1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC4262a.f35815x, 0);
        this.f21493o = typedArrayObtainStyledAttributes.hasValue(0);
        wV.x();
        typedArrayObtainStyledAttributes.recycle();
    }
}
