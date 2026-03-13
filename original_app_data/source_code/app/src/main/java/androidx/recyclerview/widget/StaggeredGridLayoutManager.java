package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.A.b {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public BitSet f24256B;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f24261G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f24262H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public e f24263I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f24264J;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int[] f24269O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f[] f24272t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l f24273u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public l f24274v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f24275w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f24276x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f24277y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f24271s = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f24278z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f24255A = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f24257C = -1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f24258D = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public d f24259E = new d();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f24260F = 2;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final Rect f24265K = new Rect();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final b f24266L = new b();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f24267M = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f24268N = true;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final Runnable f24270P = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.T1();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f24282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f24283d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f24284e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f24285f;

        public b() {
            c();
        }

        public void a() {
            this.f24281b = this.f24282c ? StaggeredGridLayoutManager.this.f24273u.i() : StaggeredGridLayoutManager.this.f24273u.m();
        }

        public void b(int i10) {
            if (this.f24282c) {
                this.f24281b = StaggeredGridLayoutManager.this.f24273u.i() - i10;
            } else {
                this.f24281b = StaggeredGridLayoutManager.this.f24273u.m() + i10;
            }
        }

        public void c() {
            this.f24280a = -1;
            this.f24281b = Integer.MIN_VALUE;
            this.f24282c = false;
            this.f24283d = false;
            this.f24284e = false;
            int[] iArr = this.f24285f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f24285f;
            if (iArr == null || iArr.length < length) {
                this.f24285f = new int[StaggeredGridLayoutManager.this.f24272t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f24285f[i10] = fVarArr[i10].p(Integer.MIN_VALUE);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends RecyclerView.q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public f f24287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f24288f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f24288f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int[] f24298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f24300f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List f24301g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f24302h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f24303i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f24304j;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        public void a() {
            this.f24298d = null;
            this.f24297c = 0;
            this.f24295a = -1;
            this.f24296b = -1;
        }

        public void b() {
            this.f24298d = null;
            this.f24297c = 0;
            this.f24299e = 0;
            this.f24300f = null;
            this.f24301g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f24295a);
            parcel.writeInt(this.f24296b);
            parcel.writeInt(this.f24297c);
            if (this.f24297c > 0) {
                parcel.writeIntArray(this.f24298d);
            }
            parcel.writeInt(this.f24299e);
            if (this.f24299e > 0) {
                parcel.writeIntArray(this.f24300f);
            }
            parcel.writeInt(this.f24302h ? 1 : 0);
            parcel.writeInt(this.f24303i ? 1 : 0);
            parcel.writeInt(this.f24304j ? 1 : 0);
            parcel.writeList(this.f24301g);
        }

        public e(Parcel parcel) {
            this.f24295a = parcel.readInt();
            this.f24296b = parcel.readInt();
            int i10 = parcel.readInt();
            this.f24297c = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.f24298d = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.f24299e = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.f24300f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f24302h = parcel.readInt() == 1;
            this.f24303i = parcel.readInt() == 1;
            this.f24304j = parcel.readInt() == 1;
            this.f24301g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f24297c = eVar.f24297c;
            this.f24295a = eVar.f24295a;
            this.f24296b = eVar.f24296b;
            this.f24298d = eVar.f24298d;
            this.f24299e = eVar.f24299e;
            this.f24300f = eVar.f24300f;
            this.f24302h = eVar.f24302h;
            this.f24303i = eVar.f24303i;
            this.f24304j = eVar.f24304j;
            this.f24301g = eVar.f24301g;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f24305a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24306b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24307c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24308d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f24309e;

        public f(int i10) {
            this.f24309e = i10;
        }

        public void a(View view) {
            c cVarN = n(view);
            cVarN.f24287e = this;
            this.f24305a.add(view);
            this.f24307c = Integer.MIN_VALUE;
            if (this.f24305a.size() == 1) {
                this.f24306b = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f24308d += StaggeredGridLayoutManager.this.f24273u.e(view);
            }
        }

        public void b(boolean z10, int i10) {
            int iL = z10 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || iL >= StaggeredGridLayoutManager.this.f24273u.i()) {
                if (z10 || iL <= StaggeredGridLayoutManager.this.f24273u.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        iL += i10;
                    }
                    this.f24307c = iL;
                    this.f24306b = iL;
                }
            }
        }

        public void c() {
            d.a aVarF;
            ArrayList arrayList = this.f24305a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f24307c = StaggeredGridLayoutManager.this.f24273u.d(view);
            if (cVarN.f24288f && (aVarF = StaggeredGridLayoutManager.this.f24259E.f(cVarN.a())) != null && aVarF.f24292b == 1) {
                this.f24307c += aVarF.a(this.f24309e);
            }
        }

        public void d() {
            d.a aVarF;
            View view = (View) this.f24305a.get(0);
            c cVarN = n(view);
            this.f24306b = StaggeredGridLayoutManager.this.f24273u.g(view);
            if (cVarN.f24288f && (aVarF = StaggeredGridLayoutManager.this.f24259E.f(cVarN.a())) != null && aVarF.f24292b == -1) {
                this.f24306b -= aVarF.a(this.f24309e);
            }
        }

        public void e() {
            this.f24305a.clear();
            q();
            this.f24308d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f24278z ? i(this.f24305a.size() - 1, -1, true) : i(0, this.f24305a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f24278z ? i(0, this.f24305a.size(), true) : i(this.f24305a.size() - 1, -1, true);
        }

        public int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int iM = StaggeredGridLayoutManager.this.f24273u.m();
            int i12 = StaggeredGridLayoutManager.this.f24273u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = (View) this.f24305a.get(i10);
                int iG = StaggeredGridLayoutManager.this.f24273u.g(view);
                int iD = StaggeredGridLayoutManager.this.f24273u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? iG >= i12 : iG > i12;
                if (!z12 ? iD > iM : iD >= iM) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (iG >= iM && iD <= i12) {
                            return StaggeredGridLayoutManager.this.i0(view);
                        }
                    } else {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.i0(view);
                        }
                        if (iG < iM || iD > i12) {
                            return StaggeredGridLayoutManager.this.i0(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        public int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f24308d;
        }

        public int k() {
            int i10 = this.f24307c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f24307c;
        }

        public int l(int i10) {
            int i11 = this.f24307c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f24305a.size() == 0) {
                return i10;
            }
            c();
            return this.f24307c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f24305a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f24305a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f24278z && staggeredGridLayoutManager.i0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f24278z && staggeredGridLayoutManager2.i0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f24305a.size();
            int i12 = 0;
            while (i12 < size2) {
                View view3 = (View) this.f24305a.get(i12);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f24278z && staggeredGridLayoutManager3.i0(view3) <= i10) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f24278z && staggeredGridLayoutManager4.i0(view3) >= i10) || !view3.hasFocusable()) {
                    break;
                }
                i12++;
                view = view3;
            }
            return view;
        }

        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        public int o() {
            int i10 = this.f24306b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f24306b;
        }

        public int p(int i10) {
            int i11 = this.f24306b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f24305a.size() == 0) {
                return i10;
            }
            d();
            return this.f24306b;
        }

        public void q() {
            this.f24306b = Integer.MIN_VALUE;
            this.f24307c = Integer.MIN_VALUE;
        }

        public void r(int i10) {
            int i11 = this.f24306b;
            if (i11 != Integer.MIN_VALUE) {
                this.f24306b = i11 + i10;
            }
            int i12 = this.f24307c;
            if (i12 != Integer.MIN_VALUE) {
                this.f24307c = i12 + i10;
            }
        }

        public void s() {
            int size = this.f24305a.size();
            View view = (View) this.f24305a.remove(size - 1);
            c cVarN = n(view);
            cVarN.f24287e = null;
            if (cVarN.c() || cVarN.b()) {
                this.f24308d -= StaggeredGridLayoutManager.this.f24273u.e(view);
            }
            if (size == 1) {
                this.f24306b = Integer.MIN_VALUE;
            }
            this.f24307c = Integer.MIN_VALUE;
        }

        public void t() {
            View view = (View) this.f24305a.remove(0);
            c cVarN = n(view);
            cVarN.f24287e = null;
            if (this.f24305a.size() == 0) {
                this.f24307c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f24308d -= StaggeredGridLayoutManager.this.f24273u.e(view);
            }
            this.f24306b = Integer.MIN_VALUE;
        }

        public void u(View view) {
            c cVarN = n(view);
            cVarN.f24287e = this;
            this.f24305a.add(0, view);
            this.f24306b = Integer.MIN_VALUE;
            if (this.f24305a.size() == 1) {
                this.f24307c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f24308d += StaggeredGridLayoutManager.this.f24273u.e(view);
            }
        }

        public void v(int i10) {
            this.f24306b = i10;
            this.f24307c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.p.d dVarJ0 = RecyclerView.p.j0(context, attributeSet, i10, i11);
        I2(dVarJ0.f24230a);
        K2(dVarJ0.f24231b);
        J2(dVarJ0.f24232c);
        this.f24277y = new i();
        b2();
    }

    private void F2() {
        if (this.f24275w == 1 || !u2()) {
            this.f24255A = this.f24278z;
        } else {
            this.f24255A = !this.f24278z;
        }
    }

    private int V1(RecyclerView.B b10) {
        if (K() == 0) {
            return 0;
        }
        return o.a(b10, this.f24273u, f2(!this.f24268N), e2(!this.f24268N), this, this.f24268N);
    }

    private int W1(RecyclerView.B b10) {
        if (K() == 0) {
            return 0;
        }
        return o.b(b10, this.f24273u, f2(!this.f24268N), e2(!this.f24268N), this, this.f24268N, this.f24255A);
    }

    private int X1(RecyclerView.B b10) {
        if (K() == 0) {
            return 0;
        }
        return o.c(b10, this.f24273u, f2(!this.f24268N), e2(!this.f24268N), this, this.f24268N);
    }

    private int Y1(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f24275w == 1) ? 1 : Integer.MIN_VALUE : this.f24275w == 0 ? 1 : Integer.MIN_VALUE : this.f24275w == 1 ? -1 : Integer.MIN_VALUE : this.f24275w == 0 ? -1 : Integer.MIN_VALUE : (this.f24275w != 1 && u2()) ? -1 : 1 : (this.f24275w != 1 && u2()) ? 1 : -1;
    }

    private void v2(View view, int i10, int i11, boolean z10) {
        k(view, this.f24265K);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f24265K;
        int iS2 = S2(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f24265K;
        int iS22 = S2(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10 ? I1(view, iS2, iS22, cVar) : G1(view, iS2, iS22, cVar)) {
            view.measure(iS2, iS22);
        }
    }

    public final void A2(View view) {
        for (int i10 = this.f24271s - 1; i10 >= 0; i10--) {
            this.f24272t[i10].u(view);
        }
    }

    public final void B2(RecyclerView.w wVar, i iVar) {
        if (!iVar.f24511a || iVar.f24519i) {
            return;
        }
        if (iVar.f24512b == 0) {
            if (iVar.f24515e == -1) {
                C2(wVar, iVar.f24517g);
                return;
            } else {
                D2(wVar, iVar.f24516f);
                return;
            }
        }
        if (iVar.f24515e != -1) {
            int iO2 = o2(iVar.f24517g) - iVar.f24517g;
            D2(wVar, iO2 < 0 ? iVar.f24516f : Math.min(iO2, iVar.f24512b) + iVar.f24516f);
        } else {
            int i10 = iVar.f24516f;
            int iN2 = i10 - n2(i10);
            C2(wVar, iN2 < 0 ? iVar.f24517g : iVar.f24517g - Math.min(iN2, iVar.f24512b));
        }
    }

    public final void C2(RecyclerView.w wVar, int i10) {
        for (int iK = K() - 1; iK >= 0; iK--) {
            View viewJ = J(iK);
            if (this.f24273u.g(viewJ) < i10 || this.f24273u.q(viewJ) < i10) {
                return;
            }
            c cVar = (c) viewJ.getLayoutParams();
            if (cVar.f24288f) {
                for (int i11 = 0; i11 < this.f24271s; i11++) {
                    if (this.f24272t[i11].f24305a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f24271s; i12++) {
                    this.f24272t[i12].s();
                }
            } else if (cVar.f24287e.f24305a.size() == 1) {
                return;
            } else {
                cVar.f24287e.s();
            }
            n1(viewJ, wVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void D0(int i10) {
        super.D0(i10);
        for (int i11 = 0; i11 < this.f24271s; i11++) {
            this.f24272t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void D1(Rect rect, int i10, int i11) {
        int iO;
        int iO2;
        int iF0 = f0() + g0();
        int iH0 = h0() + e0();
        if (this.f24275w == 1) {
            iO2 = RecyclerView.p.o(i11, rect.height() + iH0, c0());
            iO = RecyclerView.p.o(i10, (this.f24276x * this.f24271s) + iF0, d0());
        } else {
            iO = RecyclerView.p.o(i10, rect.width() + iF0, d0());
            iO2 = RecyclerView.p.o(i11, (this.f24276x * this.f24271s) + iH0, c0());
        }
        C1(iO, iO2);
    }

    public final void D2(RecyclerView.w wVar, int i10) {
        while (K() > 0) {
            View viewJ = J(0);
            if (this.f24273u.d(viewJ) > i10 || this.f24273u.p(viewJ) > i10) {
                return;
            }
            c cVar = (c) viewJ.getLayoutParams();
            if (cVar.f24288f) {
                for (int i11 = 0; i11 < this.f24271s; i11++) {
                    if (this.f24272t[i11].f24305a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f24271s; i12++) {
                    this.f24272t[i12].t();
                }
            } else if (cVar.f24287e.f24305a.size() == 1) {
                return;
            } else {
                cVar.f24287e.t();
            }
            n1(viewJ, wVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q E() {
        return this.f24275w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void E0(int i10) {
        super.E0(i10);
        for (int i11 = 0; i11 < this.f24271s; i11++) {
            this.f24272t[i11].r(i10);
        }
    }

    public final void E2() {
        if (this.f24274v.k() == 1073741824) {
            return;
        }
        int iK = K();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < iK; i10++) {
            View viewJ = J(i10);
            float fE = this.f24274v.e(viewJ);
            if (fE >= fMax) {
                if (((c) viewJ.getLayoutParams()).e()) {
                    fE = (fE * 1.0f) / this.f24271s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i11 = this.f24276x;
        int iRound = Math.round(fMax * this.f24271s);
        if (this.f24274v.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f24274v.n());
        }
        Q2(iRound);
        if (this.f24276x == i11) {
            return;
        }
        for (int i12 = 0; i12 < iK; i12++) {
            View viewJ2 = J(i12);
            c cVar = (c) viewJ2.getLayoutParams();
            if (!cVar.f24288f) {
                if (u2() && this.f24275w == 1) {
                    int i13 = this.f24271s;
                    int i14 = cVar.f24287e.f24309e;
                    viewJ2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f24276x) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f24287e.f24309e;
                    int i16 = this.f24276x * i15;
                    int i17 = i15 * i11;
                    if (this.f24275w == 1) {
                        viewJ2.offsetLeftAndRight(i16 - i17);
                    } else {
                        viewJ2.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void F0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.f24259E.b();
        for (int i10 = 0; i10 < this.f24271s; i10++) {
            this.f24272t[i10].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q G(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public int G2(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        if (K() == 0 || i10 == 0) {
            return 0;
        }
        z2(i10, b10);
        int iC2 = c2(wVar, this.f24277y, b10);
        if (this.f24277y.f24512b >= iC2) {
            i10 = i10 < 0 ? -iC2 : iC2;
        }
        this.f24273u.r(-i10);
        this.f24261G = this.f24255A;
        i iVar = this.f24277y;
        iVar.f24512b = 0;
        B2(wVar, iVar);
        return i10;
    }

    public final void H2(int i10) {
        i iVar = this.f24277y;
        iVar.f24515e = i10;
        iVar.f24514d = this.f24255A != (i10 == -1) ? -1 : 1;
    }

    public void I2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        h(null);
        if (i10 == this.f24275w) {
            return;
        }
        this.f24275w = i10;
        l lVar = this.f24273u;
        this.f24273u = this.f24274v;
        this.f24274v = lVar;
        u1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void J0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.J0(recyclerView, wVar);
        p1(this.f24270P);
        for (int i10 = 0; i10 < this.f24271s; i10++) {
            this.f24272t[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void J1(RecyclerView recyclerView, RecyclerView.B b10, int i10) {
        j jVar = new j(recyclerView.getContext());
        jVar.p(i10);
        K1(jVar);
    }

    public void J2(boolean z10) {
        h(null);
        e eVar = this.f24263I;
        if (eVar != null && eVar.f24302h != z10) {
            eVar.f24302h = z10;
        }
        this.f24278z = z10;
        u1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View K0(View view, int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        View viewC;
        View viewM;
        if (K() == 0 || (viewC = C(view)) == null) {
            return null;
        }
        F2();
        int iY1 = Y1(i10);
        if (iY1 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewC.getLayoutParams();
        boolean z10 = cVar.f24288f;
        f fVar = cVar.f24287e;
        int iL2 = iY1 == 1 ? l2() : k2();
        P2(iL2, b10);
        H2(iY1);
        i iVar = this.f24277y;
        iVar.f24513c = iVar.f24514d + iL2;
        iVar.f24512b = (int) (this.f24273u.n() * 0.33333334f);
        i iVar2 = this.f24277y;
        iVar2.f24518h = true;
        iVar2.f24511a = false;
        c2(wVar, iVar2, b10);
        this.f24261G = this.f24255A;
        if (!z10 && (viewM = fVar.m(iL2, iY1)) != null && viewM != viewC) {
            return viewM;
        }
        if (y2(iY1)) {
            for (int i11 = this.f24271s - 1; i11 >= 0; i11--) {
                View viewM2 = this.f24272t[i11].m(iL2, iY1);
                if (viewM2 != null && viewM2 != viewC) {
                    return viewM2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f24271s; i12++) {
                View viewM3 = this.f24272t[i12].m(iL2, iY1);
                if (viewM3 != null && viewM3 != viewC) {
                    return viewM3;
                }
            }
        }
        boolean z11 = (this.f24278z ^ true) == (iY1 == -1);
        if (!z10) {
            View viewD = D(z11 ? fVar.f() : fVar.g());
            if (viewD != null && viewD != viewC) {
                return viewD;
            }
        }
        if (y2(iY1)) {
            for (int i13 = this.f24271s - 1; i13 >= 0; i13--) {
                if (i13 != fVar.f24309e) {
                    View viewD2 = D(z11 ? this.f24272t[i13].f() : this.f24272t[i13].g());
                    if (viewD2 != null && viewD2 != viewC) {
                        return viewD2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f24271s; i14++) {
                View viewD3 = D(z11 ? this.f24272t[i14].f() : this.f24272t[i14].g());
                if (viewD3 != null && viewD3 != viewC) {
                    return viewD3;
                }
            }
        }
        return null;
    }

    public void K2(int i10) {
        h(null);
        if (i10 != this.f24271s) {
            t2();
            this.f24271s = i10;
            this.f24256B = new BitSet(this.f24271s);
            this.f24272t = new f[this.f24271s];
            for (int i11 = 0; i11 < this.f24271s; i11++) {
                this.f24272t[i11] = new f(i11);
            }
            u1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L0(AccessibilityEvent accessibilityEvent) {
        super.L0(accessibilityEvent);
        if (K() > 0) {
            View viewF2 = f2(false);
            View viewE2 = e2(false);
            if (viewF2 == null || viewE2 == null) {
                return;
            }
            int iI0 = i0(viewF2);
            int iI02 = i0(viewE2);
            if (iI0 < iI02) {
                accessibilityEvent.setFromIndex(iI0);
                accessibilityEvent.setToIndex(iI02);
            } else {
                accessibilityEvent.setFromIndex(iI02);
                accessibilityEvent.setToIndex(iI0);
            }
        }
    }

    public final void L2(int i10, int i11) {
        for (int i12 = 0; i12 < this.f24271s; i12++) {
            if (!this.f24272t[i12].f24305a.isEmpty()) {
                R2(this.f24272t[i12], i10, i11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean M1() {
        return this.f24263I == null;
    }

    public final boolean M2(RecyclerView.B b10, b bVar) {
        bVar.f24280a = this.f24261G ? h2(b10.b()) : d2(b10.b());
        bVar.f24281b = Integer.MIN_VALUE;
        return true;
    }

    public final void N1(View view) {
        for (int i10 = this.f24271s - 1; i10 >= 0; i10--) {
            this.f24272t[i10].a(view);
        }
    }

    public boolean N2(RecyclerView.B b10, b bVar) {
        int i10;
        if (!b10.e() && (i10 = this.f24257C) != -1) {
            if (i10 >= 0 && i10 < b10.b()) {
                e eVar = this.f24263I;
                if (eVar == null || eVar.f24295a == -1 || eVar.f24297c < 1) {
                    View viewD = D(this.f24257C);
                    if (viewD != null) {
                        bVar.f24280a = this.f24255A ? l2() : k2();
                        if (this.f24258D != Integer.MIN_VALUE) {
                            if (bVar.f24282c) {
                                bVar.f24281b = (this.f24273u.i() - this.f24258D) - this.f24273u.d(viewD);
                            } else {
                                bVar.f24281b = (this.f24273u.m() + this.f24258D) - this.f24273u.g(viewD);
                            }
                            return true;
                        }
                        if (this.f24273u.e(viewD) > this.f24273u.n()) {
                            bVar.f24281b = bVar.f24282c ? this.f24273u.i() : this.f24273u.m();
                            return true;
                        }
                        int iG = this.f24273u.g(viewD) - this.f24273u.m();
                        if (iG < 0) {
                            bVar.f24281b = -iG;
                            return true;
                        }
                        int i11 = this.f24273u.i() - this.f24273u.d(viewD);
                        if (i11 < 0) {
                            bVar.f24281b = i11;
                            return true;
                        }
                        bVar.f24281b = Integer.MIN_VALUE;
                    } else {
                        int i12 = this.f24257C;
                        bVar.f24280a = i12;
                        int i13 = this.f24258D;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f24282c = S1(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f24283d = true;
                    }
                } else {
                    bVar.f24281b = Integer.MIN_VALUE;
                    bVar.f24280a = this.f24257C;
                }
                return true;
            }
            this.f24257C = -1;
            this.f24258D = Integer.MIN_VALUE;
        }
        return false;
    }

    public final void O1(b bVar) {
        e eVar = this.f24263I;
        int i10 = eVar.f24297c;
        if (i10 > 0) {
            if (i10 == this.f24271s) {
                for (int i11 = 0; i11 < this.f24271s; i11++) {
                    this.f24272t[i11].e();
                    e eVar2 = this.f24263I;
                    int i12 = eVar2.f24298d[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += eVar2.f24303i ? this.f24273u.i() : this.f24273u.m();
                    }
                    this.f24272t[i11].v(i12);
                }
            } else {
                eVar.b();
                e eVar3 = this.f24263I;
                eVar3.f24295a = eVar3.f24296b;
            }
        }
        e eVar4 = this.f24263I;
        this.f24262H = eVar4.f24304j;
        J2(eVar4.f24302h);
        F2();
        e eVar5 = this.f24263I;
        int i13 = eVar5.f24295a;
        if (i13 != -1) {
            this.f24257C = i13;
            bVar.f24282c = eVar5.f24303i;
        } else {
            bVar.f24282c = this.f24255A;
        }
        if (eVar5.f24299e > 1) {
            d dVar = this.f24259E;
            dVar.f24289a = eVar5.f24300f;
            dVar.f24290b = eVar5.f24301g;
        }
    }

    public void O2(RecyclerView.B b10, b bVar) {
        if (N2(b10, bVar) || M2(b10, bVar)) {
            return;
        }
        bVar.a();
        bVar.f24280a = 0;
    }

    public boolean P1() {
        int iL = this.f24272t[0].l(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f24271s; i10++) {
            if (this.f24272t[i10].l(Integer.MIN_VALUE) != iL) {
                return false;
            }
        }
        return true;
    }

    public final void P2(int i10, RecyclerView.B b10) {
        int iN;
        int iN2;
        int iC;
        i iVar = this.f24277y;
        boolean z10 = false;
        iVar.f24512b = 0;
        iVar.f24513c = i10;
        if (!y0() || (iC = b10.c()) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.f24255A == (iC < i10)) {
                iN = this.f24273u.n();
                iN2 = 0;
            } else {
                iN2 = this.f24273u.n();
                iN = 0;
            }
        }
        if (N()) {
            this.f24277y.f24516f = this.f24273u.m() - iN2;
            this.f24277y.f24517g = this.f24273u.i() + iN;
        } else {
            this.f24277y.f24517g = this.f24273u.h() + iN;
            this.f24277y.f24516f = -iN2;
        }
        i iVar2 = this.f24277y;
        iVar2.f24518h = false;
        iVar2.f24511a = true;
        if (this.f24273u.k() == 0 && this.f24273u.h() == 0) {
            z10 = true;
        }
        iVar2.f24519i = z10;
    }

    public boolean Q1() {
        int iP = this.f24272t[0].p(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f24271s; i10++) {
            if (this.f24272t[i10].p(Integer.MIN_VALUE) != iP) {
                return false;
            }
        }
        return true;
    }

    public void Q2(int i10) {
        this.f24276x = i10 / this.f24271s;
        this.f24264J = View.MeasureSpec.makeMeasureSpec(i10, this.f24274v.k());
    }

    public final void R1(View view, c cVar, i iVar) {
        if (iVar.f24515e == 1) {
            if (cVar.f24288f) {
                N1(view);
                return;
            } else {
                cVar.f24287e.a(view);
                return;
            }
        }
        if (cVar.f24288f) {
            A2(view);
        } else {
            cVar.f24287e.u(view);
        }
    }

    public final void R2(f fVar, int i10, int i11) {
        int iJ = fVar.j();
        if (i10 == -1) {
            if (fVar.o() + iJ <= i11) {
                this.f24256B.set(fVar.f24309e, false);
            }
        } else if (fVar.k() - iJ >= i11) {
            this.f24256B.set(fVar.f24309e, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView recyclerView, int i10, int i11) {
        r2(i10, i11, 1);
    }

    public final int S1(int i10) {
        if (K() == 0) {
            return this.f24255A ? 1 : -1;
        }
        return (i10 < k2()) != this.f24255A ? -1 : 1;
    }

    public final int S2(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(RecyclerView recyclerView) {
        this.f24259E.b();
        u1();
    }

    public boolean T1() {
        int iK2;
        int iL2;
        if (K() == 0 || this.f24260F == 0 || !s0()) {
            return false;
        }
        if (this.f24255A) {
            iK2 = l2();
            iL2 = k2();
        } else {
            iK2 = k2();
            iL2 = l2();
        }
        if (iK2 == 0 && s2() != null) {
            this.f24259E.b();
            v1();
            u1();
            return true;
        }
        if (!this.f24267M) {
            return false;
        }
        int i10 = this.f24255A ? -1 : 1;
        int i11 = iL2 + 1;
        d.a aVarE = this.f24259E.e(iK2, i11, i10, true);
        if (aVarE == null) {
            this.f24267M = false;
            this.f24259E.d(i11);
            return false;
        }
        d.a aVarE2 = this.f24259E.e(iK2, aVarE.f24291a, i10 * (-1), true);
        if (aVarE2 == null) {
            this.f24259E.d(aVarE.f24291a);
        } else {
            this.f24259E.d(aVarE2.f24291a + 1);
        }
        v1();
        u1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView recyclerView, int i10, int i11, int i12) {
        r2(i10, i11, 8);
    }

    public final boolean U1(f fVar) {
        boolean z10;
        if (!this.f24255A) {
            if (fVar.o() > this.f24273u.m()) {
                z10 = fVar.n((View) fVar.f24305a.get(0)).f24288f;
                return !z10;
            }
            return false;
        }
        if (fVar.k() < this.f24273u.i()) {
            z10 = fVar.n((View) fVar.f24305a.get(r2.size() - 1)).f24288f;
            return !z10;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView, int i10, int i11) {
        r2(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        r2(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView.w wVar, RecyclerView.B b10) {
        x2(wVar, b10, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView.B b10) {
        super.Z0(b10);
        this.f24257C = -1;
        this.f24258D = Integer.MIN_VALUE;
        this.f24263I = null;
        this.f24266L.c();
    }

    public final d.a Z1(int i10) {
        d.a aVar = new d.a();
        aVar.f24293c = new int[this.f24271s];
        for (int i11 = 0; i11 < this.f24271s; i11++) {
            aVar.f24293c[i11] = i10 - this.f24272t[i11].l(i10);
        }
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public PointF a(int i10) {
        int iS1 = S1(i10);
        PointF pointF = new PointF();
        if (iS1 == 0) {
            return null;
        }
        if (this.f24275w == 0) {
            pointF.x = iS1;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iS1;
        return pointF;
    }

    public final d.a a2(int i10) {
        d.a aVar = new d.a();
        aVar.f24293c = new int[this.f24271s];
        for (int i11 = 0; i11 < this.f24271s; i11++) {
            aVar.f24293c[i11] = this.f24272t[i11].p(i10) - i10;
        }
        return aVar;
    }

    public final void b2() {
        this.f24273u = l.b(this, this.f24275w);
        this.f24274v = l.b(this, 1 - this.f24275w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$p, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final int c2(RecyclerView.w wVar, i iVar, RecyclerView.B b10) {
        f fVarQ2;
        int iP2;
        int iE;
        int iM;
        int iE2;
        ?? r02;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        ?? r82 = 0;
        staggeredGridLayoutManager.f24256B.set(0, staggeredGridLayoutManager.f24271s, true);
        int i10 = staggeredGridLayoutManager.f24277y.f24519i ? iVar.f24515e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : iVar.f24515e == 1 ? iVar.f24517g + iVar.f24512b : iVar.f24516f - iVar.f24512b;
        staggeredGridLayoutManager.L2(iVar.f24515e, i10);
        int i11 = staggeredGridLayoutManager.f24255A ? staggeredGridLayoutManager.f24273u.i() : staggeredGridLayoutManager.f24273u.m();
        boolean z10 = false;
        ?? r03 = staggeredGridLayoutManager;
        while (iVar.a(b10) && (r03.f24277y.f24519i || !r03.f24256B.isEmpty())) {
            View viewB = iVar.b(wVar);
            c cVar = (c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = r03.f24259E.g(iA);
            ?? r52 = iG == -1 ? 1 : r82;
            if (r52 != 0) {
                fVarQ2 = cVar.f24288f ? r03.f24272t[r82] : r03.q2(iVar);
                r03.f24259E.n(iA, fVarQ2);
            } else {
                fVarQ2 = r03.f24272t[iG];
            }
            f fVar = fVarQ2;
            cVar.f24287e = fVar;
            if (iVar.f24515e == 1) {
                r03.e(viewB);
            } else {
                r03.f(viewB, r82);
            }
            r03.w2(viewB, cVar, r82);
            if (iVar.f24515e == 1) {
                iE = cVar.f24288f ? r03.m2(i11) : fVar.l(i11);
                iP2 = r03.f24273u.e(viewB) + iE;
                if (r52 != 0 && cVar.f24288f) {
                    d.a aVarZ1 = r03.Z1(iE);
                    aVarZ1.f24292b = -1;
                    aVarZ1.f24291a = iA;
                    r03.f24259E.a(aVarZ1);
                }
            } else {
                iP2 = cVar.f24288f ? r03.p2(i11) : fVar.p(i11);
                iE = iP2 - r03.f24273u.e(viewB);
                if (r52 != 0 && cVar.f24288f) {
                    d.a aVarA2 = r03.a2(iP2);
                    aVarA2.f24292b = 1;
                    aVarA2.f24291a = iA;
                    r03.f24259E.a(aVarA2);
                }
            }
            if (cVar.f24288f && iVar.f24514d == -1) {
                if (r52 != 0) {
                    r03.f24267M = true;
                } else {
                    if (!(iVar.f24515e == 1 ? r03.P1() : r03.Q1())) {
                        d.a aVarF = r03.f24259E.f(iA);
                        if (aVarF != null) {
                            aVarF.f24294d = true;
                        }
                        r03.f24267M = true;
                    }
                }
            }
            r03.R1(viewB, cVar, iVar);
            if (r03.u2() && r03.f24275w == 1) {
                iE2 = cVar.f24288f ? r03.f24274v.i() : r03.f24274v.i() - (((r03.f24271s - 1) - fVar.f24309e) * r03.f24276x);
                iM = iE2 - r03.f24274v.e(viewB);
            } else {
                iM = cVar.f24288f ? r03.f24274v.m() : (fVar.f24309e * r03.f24276x) + r03.f24274v.m();
                iE2 = r03.f24274v.e(viewB) + iM;
            }
            int i12 = iE2;
            int i13 = iM;
            if (r03.f24275w == 1) {
                r03.A0(viewB, i13, iE, i12, iP2);
                r02 = this;
            } else {
                r03.A0(viewB, iE, i13, iP2, i12);
                r02 = r03;
            }
            if (cVar.f24288f) {
                r02.L2(r02.f24277y.f24515e, i10);
            } else {
                r02.R2(fVar, r02.f24277y.f24515e, i10);
            }
            r02.B2(wVar, r02.f24277y);
            if (r02.f24277y.f24518h && viewB.hasFocusable()) {
                if (cVar.f24288f) {
                    r02.f24256B.clear();
                } else {
                    r02.f24256B.set(fVar.f24309e, false);
                }
            }
            z10 = true;
            r82 = 0;
            r03 = r02;
        }
        if (!z10) {
            r03.B2(wVar, r03.f24277y);
        }
        int iM2 = r03.f24277y.f24515e == -1 ? r03.f24273u.m() - r03.p2(r03.f24273u.m()) : r03.m2(r03.f24273u.i()) - r03.f24273u.i();
        if (iM2 > 0) {
            return Math.min(iVar.f24512b, iM2);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f24263I = eVar;
            if (this.f24257C != -1) {
                eVar.a();
                this.f24263I.b();
            }
            u1();
        }
    }

    public final int d2(int i10) {
        int iK = K();
        for (int i11 = 0; i11 < iK; i11++) {
            int iI0 = i0(J(i11));
            if (iI0 >= 0 && iI0 < i10) {
                return iI0;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable e1() {
        int iP;
        int iM;
        int[] iArr;
        if (this.f24263I != null) {
            return new e(this.f24263I);
        }
        e eVar = new e();
        eVar.f24302h = this.f24278z;
        eVar.f24303i = this.f24261G;
        eVar.f24304j = this.f24262H;
        d dVar = this.f24259E;
        if (dVar == null || (iArr = dVar.f24289a) == null) {
            eVar.f24299e = 0;
        } else {
            eVar.f24300f = iArr;
            eVar.f24299e = iArr.length;
            eVar.f24301g = dVar.f24290b;
        }
        if (K() <= 0) {
            eVar.f24295a = -1;
            eVar.f24296b = -1;
            eVar.f24297c = 0;
            return eVar;
        }
        eVar.f24295a = this.f24261G ? l2() : k2();
        eVar.f24296b = g2();
        int i10 = this.f24271s;
        eVar.f24297c = i10;
        eVar.f24298d = new int[i10];
        for (int i11 = 0; i11 < this.f24271s; i11++) {
            if (this.f24261G) {
                iP = this.f24272t[i11].l(Integer.MIN_VALUE);
                if (iP != Integer.MIN_VALUE) {
                    iM = this.f24273u.i();
                    iP -= iM;
                }
            } else {
                iP = this.f24272t[i11].p(Integer.MIN_VALUE);
                if (iP != Integer.MIN_VALUE) {
                    iM = this.f24273u.m();
                    iP -= iM;
                }
            }
            eVar.f24298d[i11] = iP;
        }
        return eVar;
    }

    public View e2(boolean z10) {
        int iM = this.f24273u.m();
        int i10 = this.f24273u.i();
        View view = null;
        for (int iK = K() - 1; iK >= 0; iK--) {
            View viewJ = J(iK);
            int iG = this.f24273u.g(viewJ);
            int iD = this.f24273u.d(viewJ);
            if (iD > iM && iG < i10) {
                if (iD <= i10 || !z10) {
                    return viewJ;
                }
                if (view == null) {
                    view = viewJ;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(int i10) {
        if (i10 == 0) {
            T1();
        }
    }

    public View f2(boolean z10) {
        int iM = this.f24273u.m();
        int i10 = this.f24273u.i();
        int iK = K();
        View view = null;
        for (int i11 = 0; i11 < iK; i11++) {
            View viewJ = J(i11);
            int iG = this.f24273u.g(viewJ);
            if (this.f24273u.d(viewJ) > iM && iG < i10) {
                if (iG >= iM || !z10) {
                    return viewJ;
                }
                if (view == null) {
                    view = viewJ;
                }
            }
        }
        return view;
    }

    public int g2() {
        View viewE2 = this.f24255A ? e2(true) : f2(true);
        if (viewE2 == null) {
            return -1;
        }
        return i0(viewE2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h(String str) {
        if (this.f24263I == null) {
            super.h(str);
        }
    }

    public final int h2(int i10) {
        for (int iK = K() - 1; iK >= 0; iK--) {
            int iI0 = i0(J(iK));
            if (iI0 >= 0 && iI0 < i10) {
                return iI0;
            }
        }
        return 0;
    }

    public final void i2(RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int i10;
        int iM2 = m2(Integer.MIN_VALUE);
        if (iM2 != Integer.MIN_VALUE && (i10 = this.f24273u.i() - iM2) > 0) {
            int i11 = i10 - (-G2(-i10, wVar, b10));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f24273u.r(i11);
        }
    }

    public final void j2(RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int iM;
        int iP2 = p2(Integer.MAX_VALUE);
        if (iP2 != Integer.MAX_VALUE && (iM = iP2 - this.f24273u.m()) > 0) {
            int iG2 = iM - G2(iM, wVar, b10);
            if (!z10 || iG2 <= 0) {
                return;
            }
            this.f24273u.r(-iG2);
        }
    }

    public int k2() {
        if (K() == 0) {
            return 0;
        }
        return i0(J(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return this.f24275w == 0;
    }

    public int l2() {
        int iK = K();
        if (iK == 0) {
            return 0;
        }
        return i0(J(iK - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean m() {
        return this.f24275w == 1;
    }

    public final int m2(int i10) {
        int iL = this.f24272t[0].l(i10);
        for (int i11 = 1; i11 < this.f24271s; i11++) {
            int iL2 = this.f24272t[i11].l(i10);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean n(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    public final int n2(int i10) {
        int iP = this.f24272t[0].p(i10);
        for (int i11 = 1; i11 < this.f24271s; i11++) {
            int iP2 = this.f24272t[i11].p(i10);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    public final int o2(int i10) {
        int iL = this.f24272t[0].l(i10);
        for (int i11 = 1; i11 < this.f24271s; i11++) {
            int iL2 = this.f24272t[i11].l(i10);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p(int i10, int i11, RecyclerView.B b10, RecyclerView.p.c cVar) {
        int iL;
        int iP;
        if (this.f24275w != 0) {
            i10 = i11;
        }
        if (K() == 0 || i10 == 0) {
            return;
        }
        z2(i10, b10);
        int[] iArr = this.f24269O;
        if (iArr == null || iArr.length < this.f24271s) {
            this.f24269O = new int[this.f24271s];
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f24271s; i13++) {
            i iVar = this.f24277y;
            if (iVar.f24514d == -1) {
                iL = iVar.f24516f;
                iP = this.f24272t[i13].p(iL);
            } else {
                iL = this.f24272t[i13].l(iVar.f24517g);
                iP = this.f24277y.f24517g;
            }
            int i14 = iL - iP;
            if (i14 >= 0) {
                this.f24269O[i12] = i14;
                i12++;
            }
        }
        Arrays.sort(this.f24269O, 0, i12);
        for (int i15 = 0; i15 < i12 && this.f24277y.a(b10); i15++) {
            cVar.a(this.f24277y.f24513c, this.f24269O[i15]);
            i iVar2 = this.f24277y;
            iVar2.f24513c += iVar2.f24514d;
        }
    }

    public final int p2(int i10) {
        int iP = this.f24272t[0].p(i10);
        for (int i11 = 1; i11 < this.f24271s; i11++) {
            int iP2 = this.f24272t[i11].p(i10);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    public final f q2(i iVar) {
        int i10;
        int i11;
        int i12;
        if (y2(iVar.f24515e)) {
            i11 = this.f24271s - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f24271s;
            i11 = 0;
            i12 = 1;
        }
        f fVar = null;
        if (iVar.f24515e == 1) {
            int iM = this.f24273u.m();
            int i13 = Integer.MAX_VALUE;
            while (i11 != i10) {
                f fVar2 = this.f24272t[i11];
                int iL = fVar2.l(iM);
                if (iL < i13) {
                    fVar = fVar2;
                    i13 = iL;
                }
                i11 += i12;
            }
            return fVar;
        }
        int i14 = this.f24273u.i();
        int i15 = Integer.MIN_VALUE;
        while (i11 != i10) {
            f fVar3 = this.f24272t[i11];
            int iP = fVar3.p(i14);
            if (iP > i15) {
                fVar = fVar3;
                i15 = iP;
            }
            i11 += i12;
        }
        return fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.B b10) {
        return V1(b10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f24255A
            if (r0 == 0) goto L9
            int r0 = r6.l2()
            goto Ld
        L9:
            int r0 = r6.k2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f24259E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f24259E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f24259E
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f24259E
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f24259E
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            goto L57
        L45:
            boolean r7 = r6.f24255A
            if (r7 == 0) goto L4e
            int r7 = r6.k2()
            goto L52
        L4e:
            int r7 = r6.l2()
        L52:
            if (r3 > r7) goto L57
            r6.u1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r2(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.B b10) {
        return W1(b10);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View s2() {
        /*
            r12 = this;
            int r0 = r12.K()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f24271s
            r2.<init>(r3)
            int r3 = r12.f24271s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f24275w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.u2()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.f24255A
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.J(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f24287e
            int r9 = r9.f24309e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f24287e
            boolean r9 = r12.U1(r9)
            if (r9 == 0) goto L4b
            goto La1
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f24287e
            int r9 = r9.f24309e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f24288f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.J(r9)
            boolean r10 = r12.f24255A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.l r10 = r12.f24273u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.l r11 = r12.f24273u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            goto La1
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.l r10 = r12.f24273u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.l r11 = r12.f24273u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            goto La1
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f24287e
            int r8 = r8.f24309e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f24287e
            int r9 = r9.f24309e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
        La1:
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.s2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.B b10) {
        return X1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean t0() {
        return this.f24260F != 0;
    }

    public void t2() {
        this.f24259E.b();
        u1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.B b10) {
        return V1(b10);
    }

    public boolean u2() {
        return a0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.B b10) {
        return W1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.B b10) {
        return X1(b10);
    }

    public final void w2(View view, c cVar, boolean z10) {
        if (cVar.f24288f) {
            if (this.f24275w == 1) {
                v2(view, this.f24264J, RecyclerView.p.L(X(), Y(), h0() + e0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
                return;
            } else {
                v2(view, RecyclerView.p.L(p0(), q0(), f0() + g0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f24264J, z10);
                return;
            }
        }
        if (this.f24275w == 1) {
            v2(view, RecyclerView.p.L(this.f24276x, q0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.L(X(), Y(), h0() + e0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            v2(view, RecyclerView.p.L(p0(), q0(), f0() + g0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.L(this.f24276x, Y(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        return G2(i10, wVar, b10);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x2(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.B r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.x2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void y1(int i10) {
        e eVar = this.f24263I;
        if (eVar != null && eVar.f24295a != i10) {
            eVar.a();
        }
        this.f24257C = i10;
        this.f24258D = Integer.MIN_VALUE;
        u1();
    }

    public final boolean y2(int i10) {
        if (this.f24275w == 0) {
            return (i10 == -1) != this.f24255A;
        }
        return ((i10 == -1) == this.f24255A) == u2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        return G2(i10, wVar, b10);
    }

    public void z2(int i10, RecyclerView.B b10) {
        int iK2;
        int i11;
        if (i10 > 0) {
            iK2 = l2();
            i11 = 1;
        } else {
            iK2 = k2();
            i11 = -1;
        }
        this.f24277y.f24511a = true;
        P2(iK2, b10);
        H2(i11);
        i iVar = this.f24277y;
        iVar.f24513c = iK2 + iVar.f24514d;
        iVar.f24512b = Math.abs(i10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f24289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f24290b;

        public void a(a aVar) {
            if (this.f24290b == null) {
                this.f24290b = new ArrayList();
            }
            int size = this.f24290b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = (a) this.f24290b.get(i10);
                if (aVar2.f24291a == aVar.f24291a) {
                    this.f24290b.remove(i10);
                }
                if (aVar2.f24291a >= aVar.f24291a) {
                    this.f24290b.add(i10, aVar);
                    return;
                }
            }
            this.f24290b.add(aVar);
        }

        public void b() {
            int[] iArr = this.f24289a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f24290b = null;
        }

        public void c(int i10) {
            int[] iArr = this.f24289a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f24289a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f24289a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f24289a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i10) {
            List list = this.f24290b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f24290b.get(size)).f24291a >= i10) {
                        this.f24290b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public a e(int i10, int i11, int i12, boolean z10) {
            List list = this.f24290b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = (a) this.f24290b.get(i13);
                int i14 = aVar.f24291a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f24292b == i12 || (z10 && aVar.f24294d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i10) {
            List list = this.f24290b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f24290b.get(size);
                if (aVar.f24291a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        public int g(int i10) {
            int[] iArr = this.f24289a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        public int h(int i10) {
            int[] iArr = this.f24289a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f24289a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f24289a.length;
            }
            int iMin = Math.min(i11 + 1, this.f24289a.length);
            Arrays.fill(this.f24289a, i10, iMin, -1);
            return iMin;
        }

        public final int i(int i10) {
            if (this.f24290b == null) {
                return -1;
            }
            a aVarF = f(i10);
            if (aVarF != null) {
                this.f24290b.remove(aVarF);
            }
            int size = this.f24290b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (((a) this.f24290b.get(i11)).f24291a >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            a aVar = (a) this.f24290b.get(i11);
            this.f24290b.remove(i11);
            return aVar.f24291a;
        }

        public void j(int i10, int i11) {
            int[] iArr = this.f24289a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f24289a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f24289a, i10, i12, -1);
            l(i10, i11);
        }

        public void k(int i10, int i11) {
            int[] iArr = this.f24289a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f24289a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f24289a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        public final void l(int i10, int i11) {
            List list = this.f24290b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f24290b.get(size);
                int i12 = aVar.f24291a;
                if (i12 >= i10) {
                    aVar.f24291a = i12 + i11;
                }
            }
        }

        public final void m(int i10, int i11) {
            List list = this.f24290b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f24290b.get(size);
                int i13 = aVar.f24291a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f24290b.remove(size);
                    } else {
                        aVar.f24291a = i13 - i11;
                    }
                }
            }
        }

        public void n(int i10, f fVar) {
            c(i10);
            this.f24289a[i10] = fVar.f24309e;
        }

        public int o(int i10) {
            int length = this.f24289a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0308a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f24291a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f24292b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int[] f24293c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f24294d;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public class C0308a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a(Parcel parcel) {
                this.f24291a = parcel.readInt();
                this.f24292b = parcel.readInt();
                this.f24294d = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.f24293c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i10) {
                int[] iArr = this.f24293c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f24291a + ", mGapDir=" + this.f24292b + ", mHasUnwantedGapAfter=" + this.f24294d + ", mGapPerSpan=" + Arrays.toString(this.f24293c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f24291a);
                parcel.writeInt(this.f24292b);
                parcel.writeInt(this.f24294d ? 1 : 0);
                int[] iArr = this.f24293c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f24293c);
                }
            }

            public a() {
            }
        }
    }
}
