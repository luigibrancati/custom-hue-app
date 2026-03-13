package p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import h.AbstractC4262a;

/* JADX INFO: renamed from: p.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5339a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0556a f41896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f41897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionMenuView f41898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.appcompat.widget.a f41899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Y0.M f41901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41903h;

    /* JADX INFO: renamed from: p.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0556a implements Y0.N {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f41904a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f41905b;

        public C0556a() {
        }

        @Override // Y0.N
        public void a(View view) {
            this.f41904a = true;
        }

        @Override // Y0.N
        public void b(View view) {
            if (this.f41904a) {
                return;
            }
            AbstractC5339a abstractC5339a = AbstractC5339a.this;
            abstractC5339a.f41901f = null;
            AbstractC5339a.super.setVisibility(this.f41905b);
        }

        @Override // Y0.N
        public void c(View view) {
            AbstractC5339a.super.setVisibility(0);
            this.f41904a = false;
        }

        public C0556a d(Y0.M m10, int i10) {
            AbstractC5339a.this.f41901f = m10;
            this.f41905b = i10;
            return this;
        }
    }

    public AbstractC5339a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f41896a = new C0556a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC4262a.f35792a, typedValue, true) || typedValue.resourceId == 0) {
            this.f41897b = context;
        } else {
            this.f41897b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    public int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public Y0.M f(int i10, long j10) {
        Y0.M m10 = this.f41901f;
        if (m10 != null) {
            m10.c();
        }
        if (i10 != 0) {
            Y0.M mB = Y0.E.e(this).b(0.0f);
            mB.e(j10);
            mB.g(this.f41896a.d(mB, i10));
            return mB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        Y0.M mB2 = Y0.E.e(this).b(1.0f);
        mB2.e(j10);
        mB2.g(this.f41896a.d(mB2, i10));
        return mB2;
    }

    public int getAnimatedVisibility() {
        return this.f41901f != null ? this.f41896a.f41905b : getVisibility();
    }

    public int getContentHeight() {
        return this.f41900e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, h.j.f36046a, AbstractC4262a.f35794c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(h.j.f36091j, 0));
        typedArrayObtainStyledAttributes.recycle();
        androidx.appcompat.widget.a aVar = this.f41899d;
        if (aVar != null) {
            aVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f41903h = false;
        }
        if (!this.f41903h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f41903h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f41903h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f41902g = false;
        }
        if (!this.f41902g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f41902g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f41902g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i10);

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            Y0.M m10 = this.f41901f;
            if (m10 != null) {
                m10.c();
            }
            super.setVisibility(i10);
        }
    }
}
