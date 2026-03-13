package t7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import c7.AbstractC3079a;
import c7.i;
import c7.j;
import com.google.android.material.textfield.TextInputLayout;
import n7.AbstractC5144g;
import n7.l;
import p.C5333L;
import p.C5341c;
import u7.AbstractC5981a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class f extends C5341c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5333L f44807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f44808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f44809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f44810h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            f fVar = f.this;
            f.this.f(i10 < 0 ? fVar.f44807e.u() : fVar.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = f.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = f.this.f44807e.x();
                    i10 = f.this.f44807e.w();
                    j10 = f.this.f44807e.v();
                }
                onItemClickListener.onItemClick(f.this.f44807e.n(), view, i10, j10);
            }
            f.this.f44807e.dismiss();
        }
    }

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3079a.f25822a);
    }

    public final TextInputLayout d() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final int e() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutD = d();
        int i10 = 0;
        if (adapter == null || textInputLayoutD == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f44807e.w()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutD);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableF = this.f44807e.f();
        if (drawableF != null) {
            drawableF.getPadding(this.f44809g);
            Rect rect = this.f44809g;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutD.getEndIconView().getMeasuredWidth();
    }

    public final void f(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutD = d();
        return (textInputLayoutD == null || !textInputLayoutD.O()) ? super.getHint() : textInputLayoutD.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutD = d();
        if (textInputLayoutD != null && textInputLayoutD.O() && super.getHint() == null && AbstractC5144g.a()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), e()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f44807e.l(getAdapter());
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f44808f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f44807e.show();
        }
    }

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC5981a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f44809g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayH = l.h(context2, attributeSet, j.f26133U1, i10, i.f25977b, new int[0]);
        if (typedArrayH.hasValue(j.f26140V1) && typedArrayH.getInt(j.f26140V1, 0) == 0) {
            setKeyListener(null);
        }
        this.f44810h = typedArrayH.getResourceId(j.f26147W1, c7.g.f25951j);
        this.f44808f = (AccessibilityManager) context2.getSystemService("accessibility");
        C5333L c5333l = new C5333L(context2);
        this.f44807e = c5333l;
        c5333l.I(true);
        c5333l.C(this);
        c5333l.H(2);
        c5333l.l(getAdapter());
        c5333l.K(new a());
        if (typedArrayH.hasValue(j.f26154X1)) {
            setSimpleItems(typedArrayH.getResourceId(j.f26154X1, 0));
        }
        typedArrayH.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f44810h, strArr));
    }
}
