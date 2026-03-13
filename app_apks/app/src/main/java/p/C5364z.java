package p;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.a;
import h.AbstractC4262a;
import j.AbstractC4666a;
import o.InterfaceC5183f;

/* JADX INFO: renamed from: p.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5364z extends Spinner {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f41996i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5342d f41997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f41998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractViewOnTouchListenerC5332K f41999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f42000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f42001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f42002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f42004h;

    /* JADX INFO: renamed from: p.z$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractViewOnTouchListenerC5332K {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ f f42005j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, f fVar) {
            super(view);
            this.f42005j = fVar;
        }

        @Override // p.AbstractViewOnTouchListenerC5332K
        public InterfaceC5183f b() {
            return this.f42005j;
        }

        @Override // p.AbstractViewOnTouchListenerC5332K
        public boolean c() {
            if (C5364z.this.getInternalPopup().a()) {
                return true;
            }
            C5364z.this.b();
            return true;
        }
    }

    /* JADX INFO: renamed from: p.z$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C5364z.this.getInternalPopup().a()) {
                C5364z.this.b();
            }
            ViewTreeObserver viewTreeObserver = C5364z.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: renamed from: p.z$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (X0.c.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* JADX INFO: renamed from: p.z$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements h, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.appcompat.app.a f42008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ListAdapter f42009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f42010c;

        public d() {
        }

        @Override // p.C5364z.h
        public boolean a() {
            androidx.appcompat.app.a aVar = this.f42008a;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        @Override // p.C5364z.h
        public int b() {
            return 0;
        }

        @Override // p.C5364z.h
        public void d(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // p.C5364z.h
        public void dismiss() {
            androidx.appcompat.app.a aVar = this.f42008a;
            if (aVar != null) {
                aVar.dismiss();
                this.f42008a = null;
            }
        }

        @Override // p.C5364z.h
        public CharSequence e() {
            return this.f42010c;
        }

        @Override // p.C5364z.h
        public Drawable f() {
            return null;
        }

        @Override // p.C5364z.h
        public void g(CharSequence charSequence) {
            this.f42010c = charSequence;
        }

        @Override // p.C5364z.h
        public void h(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // p.C5364z.h
        public void i(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // p.C5364z.h
        public void j(int i10, int i11) {
            if (this.f42009b == null) {
                return;
            }
            a.C0270a c0270a = new a.C0270a(C5364z.this.getPopupContext());
            CharSequence charSequence = this.f42010c;
            if (charSequence != null) {
                c0270a.k(charSequence);
            }
            androidx.appcompat.app.a aVarA = c0270a.j(this.f42009b, C5364z.this.getSelectedItemPosition(), this).a();
            this.f42008a = aVarA;
            ListView listViewR = aVarA.r();
            listViewR.setTextDirection(i10);
            listViewR.setTextAlignment(i11);
            this.f42008a.show();
        }

        @Override // p.C5364z.h
        public int k() {
            return 0;
        }

        @Override // p.C5364z.h
        public void l(ListAdapter listAdapter) {
            this.f42009b = listAdapter;
        }

        @Override // p.C5364z.h
        public void o(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5364z.this.setSelection(i10);
            if (C5364z.this.getOnItemClickListener() != null) {
                C5364z.this.performItemClick(null, i10, this.f42009b.getItemId(i10));
            }
            dismiss();
        }
    }

    /* JADX INFO: renamed from: p.z$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SpinnerAdapter f42012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ListAdapter f42013b;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f42012a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f42013b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f42013b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f42012a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f42012a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f42012a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f42012a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f42012a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f42013b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f42012a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f42012a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: p.z$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f extends C5333L implements h {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public CharSequence f42014G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public ListAdapter f42015H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public final Rect f42016I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f42017J;

        /* JADX INFO: renamed from: p.z$f$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C5364z f42019a;

            public a(C5364z c5364z) {
                this.f42019a = c5364z;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                C5364z.this.setSelection(i10);
                if (C5364z.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    C5364z.this.performItemClick(view, i10, fVar.f42015H.getItemId(i10));
                }
                f.this.dismiss();
            }
        }

        /* JADX INFO: renamed from: p.z$f$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.T(C5364z.this)) {
                    f.this.dismiss();
                } else {
                    f.this.R();
                    f.super.show();
                }
            }
        }

        /* JADX INFO: renamed from: p.z$f$c */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f42022a;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f42022a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C5364z.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f42022a);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f42016I = new Rect();
            C(C5364z.this);
            I(true);
            N(0);
            K(new a(C5364z.this));
        }

        public void R() {
            int i10;
            Drawable drawableF = f();
            if (drawableF != null) {
                drawableF.getPadding(C5364z.this.f42004h);
                i10 = c0.b(C5364z.this) ? C5364z.this.f42004h.right : -C5364z.this.f42004h.left;
            } else {
                Rect rect = C5364z.this.f42004h;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = C5364z.this.getPaddingLeft();
            int paddingRight = C5364z.this.getPaddingRight();
            int width = C5364z.this.getWidth();
            C5364z c5364z = C5364z.this;
            int i11 = c5364z.f42003g;
            if (i11 == -2) {
                int iA = c5364z.a((SpinnerAdapter) this.f42015H, f());
                int i12 = C5364z.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C5364z.this.f42004h;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (iA > i13) {
                    iA = i13;
                }
                E(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                E((width - paddingLeft) - paddingRight);
            } else {
                E(i11);
            }
            d(c0.b(C5364z.this) ? i10 + (((width - paddingRight) - y()) - S()) : i10 + paddingLeft + S());
        }

        public int S() {
            return this.f42017J;
        }

        public boolean T(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f42016I);
        }

        @Override // p.C5364z.h
        public CharSequence e() {
            return this.f42014G;
        }

        @Override // p.C5364z.h
        public void g(CharSequence charSequence) {
            this.f42014G = charSequence;
        }

        @Override // p.C5364z.h
        public void i(int i10) {
            this.f42017J = i10;
        }

        @Override // p.C5364z.h
        public void j(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            R();
            H(2);
            super.show();
            ListView listViewN = n();
            listViewN.setChoiceMode(1);
            listViewN.setTextDirection(i10);
            listViewN.setTextAlignment(i11);
            O(C5364z.this.getSelectedItemPosition());
            if (zA || (viewTreeObserver = C5364z.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            J(new c(bVar));
        }

        @Override // p.C5333L, p.C5364z.h
        public void l(ListAdapter listAdapter) {
            super.l(listAdapter);
            this.f42015H = listAdapter;
        }
    }

    /* JADX INFO: renamed from: p.z$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f42024a;

        /* JADX INFO: renamed from: p.z$g$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f42024a ? (byte) 1 : (byte) 0);
        }

        public g(Parcel parcel) {
            super(parcel);
            this.f42024a = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: renamed from: p.z$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface h {
        boolean a();

        int b();

        void d(int i10);

        void dismiss();

        CharSequence e();

        Drawable f();

        void g(CharSequence charSequence);

        void h(int i10);

        void i(int i10);

        void j(int i10, int i11);

        int k();

        void l(ListAdapter listAdapter);

        void o(Drawable drawable);
    }

    public C5364z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4262a.f35788G);
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f42004h);
        Rect rect = this.f42004h;
        return iMax2 + rect.left + rect.right;
    }

    public void b() {
        this.f42002f.j(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5342d c5342d = this.f41997a;
        if (c5342d != null) {
            c5342d.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        h hVar = this.f42002f;
        return hVar != null ? hVar.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        h hVar = this.f42002f;
        return hVar != null ? hVar.k() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f42002f != null ? this.f42003g : super.getDropDownWidth();
    }

    public final h getInternalPopup() {
        return this.f42002f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        h hVar = this.f42002f;
        return hVar != null ? hVar.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f41998b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        h hVar = this.f42002f;
        return hVar != null ? hVar.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5342d c5342d = this.f41997a;
        if (c5342d != null) {
            return c5342d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5342d c5342d = this.f41997a;
        if (c5342d != null) {
            return c5342d.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f42002f;
        if (hVar == null || !hVar.a()) {
            return;
        }
        this.f42002f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f42002f == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (!gVar.f42024a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        h hVar = this.f42002f;
        gVar.f42024a = hVar != null && hVar.a();
        return gVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC5332K abstractViewOnTouchListenerC5332K = this.f41999c;
        if (abstractViewOnTouchListenerC5332K == null || !abstractViewOnTouchListenerC5332K.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        h hVar = this.f42002f;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5342d c5342d = this.f41997a;
        if (c5342d != null) {
            c5342d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5342d c5342d = this.f41997a;
        if (c5342d != null) {
            c5342d.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        h hVar = this.f42002f;
        if (hVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            hVar.i(i10);
            this.f42002f.d(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        h hVar = this.f42002f;
        if (hVar != null) {
            hVar.h(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f42002f != null) {
            this.f42003g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f42002f;
        if (hVar != null) {
            hVar.o(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(AbstractC4666a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f42002f;
        if (hVar != null) {
            hVar.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5342d c5342d = this.f41997a;
        if (c5342d != null) {
            c5342d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5342d c5342d = this.f41997a;
        if (c5342d != null) {
            c5342d.j(mode);
        }
    }

    public C5364z(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f42001e) {
            this.f42000d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f42002f != null) {
            Context context = this.f41998b;
            if (context == null) {
                context = getContext();
            }
            this.f42002f.l(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public C5364z(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, p.z] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5364z(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C5364z.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
