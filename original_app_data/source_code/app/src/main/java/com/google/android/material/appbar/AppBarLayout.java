package com.google.android.material.appbar;

import Y0.E;
import Z0.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c7.j;
import d1.AbstractC3806a;
import e7.AbstractC3946a;
import e7.AbstractC3947b;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AppBarLayout extends LinearLayout {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC3946a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f30376k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f30377l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public b f30378m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public WeakReference f30379n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public a f30380o;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static abstract class a {
            public abstract boolean a(AppBarLayout appBarLayout);
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class b extends AbstractC3806a {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f30381c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f30382d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f30383e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public float f30384f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public boolean f30385g;

            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public class a implements Parcelable.ClassLoaderCreator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public b createFromParcel(Parcel parcel) {
                    return new b(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            public b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f30381c = parcel.readByte() != 0;
                this.f30382d = parcel.readByte() != 0;
                this.f30383e = parcel.readInt();
                this.f30384f = parcel.readFloat();
                this.f30385g = parcel.readByte() != 0;
            }

            @Override // d1.AbstractC3806a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f30381c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f30382d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f30383e);
                parcel.writeFloat(this.f30384f);
                parcel.writeByte(this.f30385g ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            android.support.v4.media.session.a.a(view);
            return c0(coordinatorLayout, null, view2, view3, i10, i11);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            android.support.v4.media.session.a.a(view);
            d0(coordinatorLayout, null, view2, i10);
        }

        @Override // e7.AbstractC3946a
        public /* bridge */ /* synthetic */ boolean H(View view) {
            android.support.v4.media.session.a.a(view);
            return S(null);
        }

        @Override // e7.AbstractC3946a
        public /* bridge */ /* synthetic */ int K(View view) {
            android.support.v4.media.session.a.a(view);
            return T(null);
        }

        @Override // e7.AbstractC3946a
        public /* bridge */ /* synthetic */ int L(View view) {
            android.support.v4.media.session.a.a(view);
            return U(null);
        }

        @Override // e7.AbstractC3946a
        public int M() {
            return E() + this.f30376k;
        }

        @Override // e7.AbstractC3946a
        public /* bridge */ /* synthetic */ void N(CoordinatorLayout coordinatorLayout, View view) {
            android.support.v4.media.session.a.a(view);
            V(coordinatorLayout, null);
        }

        @Override // e7.AbstractC3946a
        public /* bridge */ /* synthetic */ int Q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            android.support.v4.media.session.a.a(view);
            return g0(coordinatorLayout, null, i10, i11, i12);
        }

        public boolean S(AppBarLayout appBarLayout) {
            a aVar = this.f30380o;
            if (aVar != null) {
                return aVar.a(appBarLayout);
            }
            WeakReference weakReference = this.f30379n;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        public int T(AppBarLayout appBarLayout) {
            throw null;
        }

        public int U(AppBarLayout appBarLayout) {
            throw null;
        }

        public void V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            h0(coordinatorLayout, appBarLayout);
            throw null;
        }

        public boolean W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            super.l(coordinatorLayout, appBarLayout, i10);
            throw null;
        }

        public boolean X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            throw null;
        }

        public void Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            if (i11 != 0 && i11 >= 0) {
                throw null;
            }
            throw null;
        }

        public void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                throw null;
            }
            if (i13 == 0) {
                i0(coordinatorLayout, appBarLayout);
            }
        }

        public void a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof b) {
                e0((b) parcelable, true);
                super.x(coordinatorLayout, appBarLayout, this.f30378m.a());
            } else {
                super.x(coordinatorLayout, appBarLayout, parcelable);
                this.f30378m = null;
            }
        }

        public Parcelable b0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableY = super.y(coordinatorLayout, appBarLayout);
            b bVarF0 = f0(parcelableY, appBarLayout);
            return bVarF0 == null ? parcelableY : bVarF0;
        }

        public boolean c0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            if ((i10 & 2) != 0) {
                throw null;
            }
            this.f30379n = null;
            this.f30377l = i11;
            return false;
        }

        public void d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            if (this.f30377l == 0 || i10 == 1) {
                h0(coordinatorLayout, appBarLayout);
                throw null;
            }
            this.f30379n = new WeakReference(view);
        }

        public void e0(b bVar, boolean z10) {
            if (this.f30378m == null || z10) {
                this.f30378m = bVar;
            }
        }

        public b f0(Parcelable parcelable, AppBarLayout appBarLayout) {
            E();
            throw null;
        }

        public int g0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12) {
            int iM = M();
            if (i11 == 0 || iM < i11 || iM > i12) {
                this.f30376k = 0;
            } else if (iM != S0.a.c(i10, i11, i12)) {
                throw null;
            }
            i0(coordinatorLayout, appBarLayout);
            return 0;
        }

        public final void h0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            throw null;
        }

        public final void i0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            E.Z(coordinatorLayout, h.a.f20126q.b());
            E.Z(coordinatorLayout, h.a.f20127r.b());
            throw null;
        }

        @Override // e7.C3948c, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            android.support.v4.media.session.a.a(view);
            return W(coordinatorLayout, null, i10);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            android.support.v4.media.session.a.a(view);
            return X(coordinatorLayout, null, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            android.support.v4.media.session.a.a(view);
            Y(coordinatorLayout, null, view2, i10, i11, iArr, i12);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            android.support.v4.media.session.a.a(view);
            Z(coordinatorLayout, null, view2, i10, i11, i12, i13, i14, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            android.support.v4.media.session.a.a(view);
            a0(coordinatorLayout, null, parcelable);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            android.support.v4.media.session.a.a(view);
            return b0(coordinatorLayout, null);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // e7.AbstractC3946a, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override // e7.C3948c
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // e7.C3948c
        public /* bridge */ /* synthetic */ boolean G(int i10) {
            return super.G(i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.W(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.X(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.Y(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.Z(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.a0(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable b0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.b0(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean c0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.c0(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.d0(coordinatorLayout, appBarLayout, view, i10);
        }

        @Override // e7.AbstractC3946a, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class ScrollingViewBehavior extends AbstractC3947b {
        public ScrollingViewBehavior() {
        }

        @Override // e7.AbstractC3947b
        public /* bridge */ /* synthetic */ View H(List list) {
            P(list);
            return null;
        }

        @Override // e7.AbstractC3947b
        public float J(View view) {
            return 0.0f;
        }

        @Override // e7.AbstractC3947b
        public int K(View view) {
            return super.K(view);
        }

        public AppBarLayout P(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
            }
            return null;
        }

        public final void Q(View view, View view2) {
            CoordinatorLayout.b bVarE = ((CoordinatorLayout.e) view2.getLayoutParams()).e();
            if (bVarE instanceof BaseBehavior) {
                E.R(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) bVarE).f30376k) + L()) - I(view2));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            Q(view, view2);
            R(view, view2);
            return false;
        }

        @Override // e7.C3948c, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.l(coordinatorLayout, view, i10);
        }

        @Override // e7.AbstractC3947b, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, view, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            P(coordinatorLayout.q(view));
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f26100P3);
            N(typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f26107Q3, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        public final void R(View view, View view2) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }
    }
}
