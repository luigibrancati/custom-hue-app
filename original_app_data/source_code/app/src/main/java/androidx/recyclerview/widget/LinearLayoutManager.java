package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements h.InterfaceC0312h, RecyclerView.A.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f24028A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f24029B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f24030C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public d f24031D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final a f24032E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final b f24033F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f24034G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int[] f24035H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f24036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c f24037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l f24038u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f24039v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f24040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f24041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f24042y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f24043z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l f24044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f24047d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f24048e;

        public a() {
            e();
        }

        public void a() {
            this.f24046c = this.f24047d ? this.f24044a.i() : this.f24044a.m();
        }

        public void b(View view, int i10) {
            if (this.f24047d) {
                this.f24046c = this.f24044a.d(view) + this.f24044a.o();
            } else {
                this.f24046c = this.f24044a.g(view);
            }
            this.f24045b = i10;
        }

        public void c(View view, int i10) {
            int iO = this.f24044a.o();
            if (iO >= 0) {
                b(view, i10);
                return;
            }
            this.f24045b = i10;
            if (this.f24047d) {
                int i11 = (this.f24044a.i() - iO) - this.f24044a.d(view);
                this.f24046c = this.f24044a.i() - i11;
                if (i11 > 0) {
                    int iE = this.f24046c - this.f24044a.e(view);
                    int iM = this.f24044a.m();
                    int iMin = iE - (iM + Math.min(this.f24044a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f24046c += Math.min(i11, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f24044a.g(view);
            int iM2 = iG - this.f24044a.m();
            this.f24046c = iG;
            if (iM2 > 0) {
                int i12 = (this.f24044a.i() - Math.min(0, (this.f24044a.i() - iO) - this.f24044a.d(view))) - (iG + this.f24044a.e(view));
                if (i12 < 0) {
                    this.f24046c -= Math.min(iM2, -i12);
                }
            }
        }

        public boolean d(View view, RecyclerView.B b10) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < b10.b();
        }

        public void e() {
            this.f24045b = -1;
            this.f24046c = Integer.MIN_VALUE;
            this.f24047d = false;
            this.f24048e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f24045b + ", mCoordinate=" + this.f24046c + ", mLayoutFromEnd=" + this.f24047d + ", mValid=" + this.f24048e + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f24050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f24051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f24052d;

        public void a() {
            this.f24049a = 0;
            this.f24050b = false;
            this.f24051c = false;
            this.f24052d = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24055c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24056d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24057e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f24058f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f24059g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f24063k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f24065m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f24053a = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f24060h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f24061i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f24062j = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List f24064l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.f24056d = -1;
            } else {
                this.f24056d = ((RecyclerView.q) viewF.getLayoutParams()).a();
            }
        }

        public boolean c(RecyclerView.B b10) {
            int i10 = this.f24056d;
            return i10 >= 0 && i10 < b10.b();
        }

        public View d(RecyclerView.w wVar) {
            if (this.f24064l != null) {
                return e();
            }
            View viewO = wVar.o(this.f24056d);
            this.f24056d += this.f24057e;
            return viewO;
        }

        public final View e() {
            int size = this.f24064l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((RecyclerView.E) this.f24064l.get(i10)).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f24056d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View f(View view) {
            int iA;
            int size = this.f24064l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = ((RecyclerView.E) this.f24064l.get(i11)).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (iA = (qVar.a() - this.f24056d) * this.f24057e) >= 0 && iA < i10) {
                    if (iA == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i10 = iA;
                }
            }
            return view2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f24068c;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        public boolean a() {
            return this.f24066a >= 0;
        }

        public void b() {
            this.f24066a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f24066a);
            parcel.writeInt(this.f24067b);
            parcel.writeInt(this.f24068c ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.f24066a = parcel.readInt();
            this.f24067b = parcel.readInt();
            this.f24068c = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f24066a = dVar.f24066a;
            this.f24067b = dVar.f24067b;
            this.f24068c = dVar.f24068c;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public int A2(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        if (K() == 0 || i10 == 0) {
            return 0;
        }
        U1();
        this.f24037t.f24053a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        I2(i11, iAbs, true, b10);
        c cVar = this.f24037t;
        int iV1 = cVar.f24059g + V1(wVar, cVar, b10, false);
        if (iV1 < 0) {
            return 0;
        }
        if (iAbs > iV1) {
            i10 = i11 * iV1;
        }
        this.f24038u.r(-i10);
        this.f24037t.f24063k = i10;
        return i10;
    }

    public void B2(int i10, int i11) {
        this.f24028A = i10;
        this.f24029B = i11;
        d dVar = this.f24031D;
        if (dVar != null) {
            dVar.b();
        }
        u1();
    }

    public void C2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        h(null);
        if (i10 != this.f24036s || this.f24038u == null) {
            l lVarB = l.b(this, i10);
            this.f24038u = lVarB;
            this.f24032E.f24044a = lVarB;
            this.f24036s = i10;
            u1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View D(int i10) {
        int iK = K();
        if (iK == 0) {
            return null;
        }
        int iI0 = i10 - i0(J(0));
        if (iI0 >= 0 && iI0 < iK) {
            View viewJ = J(iI0);
            if (i0(viewJ) == i10) {
                return viewJ;
            }
        }
        return super.D(i10);
    }

    public void D2(boolean z10) {
        h(null);
        if (z10 == this.f24040w) {
            return;
        }
        this.f24040w = z10;
        u1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q E() {
        return new RecyclerView.q(-2, -2);
    }

    public void E2(boolean z10) {
        h(null);
        if (this.f24042y == z10) {
            return;
        }
        this.f24042y = z10;
        u1();
    }

    public final boolean F2(RecyclerView.w wVar, RecyclerView.B b10, a aVar) {
        View viewI2;
        boolean z10 = false;
        if (K() == 0) {
            return false;
        }
        View viewW = W();
        if (viewW != null && aVar.d(viewW, b10)) {
            aVar.c(viewW, i0(viewW));
            return true;
        }
        boolean z11 = this.f24039v;
        boolean z12 = this.f24042y;
        if (z11 != z12 || (viewI2 = i2(wVar, b10, aVar.f24047d, z12)) == null) {
            return false;
        }
        aVar.b(viewI2, i0(viewI2));
        if (!b10.e() && M1()) {
            int iG = this.f24038u.g(viewI2);
            int iD = this.f24038u.d(viewI2);
            int iM = this.f24038u.m();
            int i10 = this.f24038u.i();
            boolean z13 = iD <= iM && iG < iM;
            if (iG >= i10 && iD > i10) {
                z10 = true;
            }
            if (z13 || z10) {
                if (aVar.f24047d) {
                    iM = i10;
                }
                aVar.f24046c = iM;
            }
        }
        return true;
    }

    public final boolean G2(RecyclerView.B b10, a aVar) {
        int i10;
        if (!b10.e() && (i10 = this.f24028A) != -1) {
            if (i10 >= 0 && i10 < b10.b()) {
                aVar.f24045b = this.f24028A;
                d dVar = this.f24031D;
                if (dVar != null && dVar.a()) {
                    boolean z10 = this.f24031D.f24068c;
                    aVar.f24047d = z10;
                    if (z10) {
                        aVar.f24046c = this.f24038u.i() - this.f24031D.f24067b;
                    } else {
                        aVar.f24046c = this.f24038u.m() + this.f24031D.f24067b;
                    }
                    return true;
                }
                if (this.f24029B != Integer.MIN_VALUE) {
                    boolean z11 = this.f24041x;
                    aVar.f24047d = z11;
                    if (z11) {
                        aVar.f24046c = this.f24038u.i() - this.f24029B;
                    } else {
                        aVar.f24046c = this.f24038u.m() + this.f24029B;
                    }
                    return true;
                }
                View viewD = D(this.f24028A);
                if (viewD == null) {
                    if (K() > 0) {
                        aVar.f24047d = (this.f24028A < i0(J(0))) == this.f24041x;
                    }
                    aVar.a();
                } else {
                    if (this.f24038u.e(viewD) > this.f24038u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f24038u.g(viewD) - this.f24038u.m() < 0) {
                        aVar.f24046c = this.f24038u.m();
                        aVar.f24047d = false;
                        return true;
                    }
                    if (this.f24038u.i() - this.f24038u.d(viewD) < 0) {
                        aVar.f24046c = this.f24038u.i();
                        aVar.f24047d = true;
                        return true;
                    }
                    aVar.f24046c = aVar.f24047d ? this.f24038u.d(viewD) + this.f24038u.o() : this.f24038u.g(viewD);
                }
                return true;
            }
            this.f24028A = -1;
            this.f24029B = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean H1() {
        return (Y() == 1073741824 || q0() == 1073741824 || !r0()) ? false : true;
    }

    public final void H2(RecyclerView.w wVar, RecyclerView.B b10, a aVar) {
        if (G2(b10, aVar) || F2(wVar, b10, aVar)) {
            return;
        }
        aVar.a();
        aVar.f24045b = this.f24042y ? b10.b() - 1 : 0;
    }

    public final void I2(int i10, int i11, boolean z10, RecyclerView.B b10) {
        int iM;
        this.f24037t.f24065m = y2();
        this.f24037t.f24058f = i10;
        int[] iArr = this.f24035H;
        iArr[0] = 0;
        iArr[1] = 0;
        N1(b10, iArr);
        int iMax = Math.max(0, this.f24035H[0]);
        int iMax2 = Math.max(0, this.f24035H[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f24037t;
        int i12 = z11 ? iMax2 : iMax;
        cVar.f24060h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.f24061i = iMax;
        if (z11) {
            cVar.f24060h = i12 + this.f24038u.j();
            View viewL2 = l2();
            c cVar2 = this.f24037t;
            cVar2.f24057e = this.f24041x ? -1 : 1;
            int iI0 = i0(viewL2);
            c cVar3 = this.f24037t;
            cVar2.f24056d = iI0 + cVar3.f24057e;
            cVar3.f24054b = this.f24038u.d(viewL2);
            iM = this.f24038u.d(viewL2) - this.f24038u.i();
        } else {
            View viewM2 = m2();
            this.f24037t.f24060h += this.f24038u.m();
            c cVar4 = this.f24037t;
            cVar4.f24057e = this.f24041x ? 1 : -1;
            int iI02 = i0(viewM2);
            c cVar5 = this.f24037t;
            cVar4.f24056d = iI02 + cVar5.f24057e;
            cVar5.f24054b = this.f24038u.g(viewM2);
            iM = (-this.f24038u.g(viewM2)) + this.f24038u.m();
        }
        c cVar6 = this.f24037t;
        cVar6.f24055c = i11;
        if (z10) {
            cVar6.f24055c = i11 - iM;
        }
        cVar6.f24059g = iM;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void J0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.J0(recyclerView, wVar);
        if (this.f24030C) {
            l1(wVar);
            wVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void J1(RecyclerView recyclerView, RecyclerView.B b10, int i10) {
        j jVar = new j(recyclerView.getContext());
        jVar.p(i10);
        K1(jVar);
    }

    public final void J2(int i10, int i11) {
        this.f24037t.f24055c = this.f24038u.i() - i11;
        c cVar = this.f24037t;
        cVar.f24057e = this.f24041x ? -1 : 1;
        cVar.f24056d = i10;
        cVar.f24058f = 1;
        cVar.f24054b = i11;
        cVar.f24059g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View K0(View view, int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        int iS1;
        z2();
        if (K() == 0 || (iS1 = S1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        U1();
        I2(iS1, (int) (this.f24038u.n() * 0.33333334f), false, b10);
        c cVar = this.f24037t;
        cVar.f24059g = Integer.MIN_VALUE;
        cVar.f24053a = false;
        V1(wVar, cVar, b10, true);
        View viewH2 = iS1 == -1 ? h2() : g2();
        View viewM2 = iS1 == -1 ? m2() : l2();
        if (!viewM2.hasFocusable()) {
            return viewH2;
        }
        if (viewH2 == null) {
            return null;
        }
        return viewM2;
    }

    public final void K2(a aVar) {
        J2(aVar.f24045b, aVar.f24046c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L0(AccessibilityEvent accessibilityEvent) {
        super.L0(accessibilityEvent);
        if (K() > 0) {
            accessibilityEvent.setFromIndex(a2());
            accessibilityEvent.setToIndex(d2());
        }
    }

    public final void L2(int i10, int i11) {
        this.f24037t.f24055c = i11 - this.f24038u.m();
        c cVar = this.f24037t;
        cVar.f24056d = i10;
        cVar.f24057e = this.f24041x ? 1 : -1;
        cVar.f24058f = -1;
        cVar.f24054b = i11;
        cVar.f24059g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean M1() {
        return this.f24031D == null && this.f24039v == this.f24042y;
    }

    public final void M2(a aVar) {
        L2(aVar.f24045b, aVar.f24046c);
    }

    public void N1(RecyclerView.B b10, int[] iArr) {
        int i10;
        int iN2 = n2(b10);
        if (this.f24037t.f24058f == -1) {
            i10 = 0;
        } else {
            i10 = iN2;
            iN2 = 0;
        }
        iArr[0] = iN2;
        iArr[1] = i10;
    }

    public void O1(RecyclerView.B b10, c cVar, RecyclerView.p.c cVar2) {
        int i10 = cVar.f24056d;
        if (i10 < 0 || i10 >= b10.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f24059g));
    }

    public final int P1(RecyclerView.B b10) {
        if (K() == 0) {
            return 0;
        }
        U1();
        return o.a(b10, this.f24038u, Z1(!this.f24043z, true), Y1(!this.f24043z, true), this, this.f24043z);
    }

    public final int Q1(RecyclerView.B b10) {
        if (K() == 0) {
            return 0;
        }
        U1();
        return o.b(b10, this.f24038u, Z1(!this.f24043z, true), Y1(!this.f24043z, true), this, this.f24043z, this.f24041x);
    }

    public final int R1(RecyclerView.B b10) {
        if (K() == 0) {
            return 0;
        }
        U1();
        return o.c(b10, this.f24038u, Z1(!this.f24043z, true), Y1(!this.f24043z, true), this, this.f24043z);
    }

    public int S1(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f24036s == 1) ? 1 : Integer.MIN_VALUE : this.f24036s == 0 ? 1 : Integer.MIN_VALUE : this.f24036s == 1 ? -1 : Integer.MIN_VALUE : this.f24036s == 0 ? -1 : Integer.MIN_VALUE : (this.f24036s != 1 && p2()) ? -1 : 1 : (this.f24036s != 1 && p2()) ? 1 : -1;
    }

    public c T1() {
        return new c();
    }

    public void U1() {
        if (this.f24037t == null) {
            this.f24037t = T1();
        }
    }

    public int V1(RecyclerView.w wVar, c cVar, RecyclerView.B b10, boolean z10) {
        int i10 = cVar.f24055c;
        int i11 = cVar.f24059g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f24059g = i11 + i10;
            }
            u2(wVar, cVar);
        }
        int i12 = cVar.f24055c + cVar.f24060h;
        b bVar = this.f24033F;
        while (true) {
            if ((!cVar.f24065m && i12 <= 0) || !cVar.c(b10)) {
                break;
            }
            bVar.a();
            r2(wVar, b10, cVar, bVar);
            if (!bVar.f24050b) {
                cVar.f24054b += bVar.f24049a * cVar.f24058f;
                if (!bVar.f24051c || cVar.f24064l != null || !b10.e()) {
                    int i13 = cVar.f24055c;
                    int i14 = bVar.f24049a;
                    cVar.f24055c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f24059g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f24049a;
                    cVar.f24059g = i16;
                    int i17 = cVar.f24055c;
                    if (i17 < 0) {
                        cVar.f24059g = i16 + i17;
                    }
                    u2(wVar, cVar);
                }
                if (z10 && bVar.f24052d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f24055c;
    }

    public int W1() {
        View viewF2 = f2(0, K(), true, false);
        if (viewF2 == null) {
            return -1;
        }
        return i0(viewF2);
    }

    public final View X1() {
        return e2(0, K());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView.w wVar, RecyclerView.B b10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iJ2;
        int i14;
        View viewD;
        int iG;
        int i15;
        int i16 = -1;
        if (!(this.f24031D == null && this.f24028A == -1) && b10.b() == 0) {
            l1(wVar);
            return;
        }
        d dVar = this.f24031D;
        if (dVar != null && dVar.a()) {
            this.f24028A = this.f24031D.f24066a;
        }
        U1();
        this.f24037t.f24053a = false;
        z2();
        View viewW = W();
        a aVar = this.f24032E;
        if (!aVar.f24048e || this.f24028A != -1 || this.f24031D != null) {
            aVar.e();
            a aVar2 = this.f24032E;
            aVar2.f24047d = this.f24041x ^ this.f24042y;
            H2(wVar, b10, aVar2);
            this.f24032E.f24048e = true;
        } else if (viewW != null && (this.f24038u.g(viewW) >= this.f24038u.i() || this.f24038u.d(viewW) <= this.f24038u.m())) {
            this.f24032E.c(viewW, i0(viewW));
        }
        c cVar = this.f24037t;
        cVar.f24058f = cVar.f24063k >= 0 ? 1 : -1;
        int[] iArr = this.f24035H;
        iArr[0] = 0;
        iArr[1] = 0;
        N1(b10, iArr);
        int iMax = Math.max(0, this.f24035H[0]) + this.f24038u.m();
        int iMax2 = Math.max(0, this.f24035H[1]) + this.f24038u.j();
        if (b10.e() && (i14 = this.f24028A) != -1 && this.f24029B != Integer.MIN_VALUE && (viewD = D(i14)) != null) {
            if (this.f24041x) {
                i15 = this.f24038u.i() - this.f24038u.d(viewD);
                iG = this.f24029B;
            } else {
                iG = this.f24038u.g(viewD) - this.f24038u.m();
                i15 = this.f24029B;
            }
            int i17 = i15 - iG;
            if (i17 > 0) {
                iMax += i17;
            } else {
                iMax2 -= i17;
            }
        }
        a aVar3 = this.f24032E;
        if (!aVar3.f24047d ? !this.f24041x : this.f24041x) {
            i16 = 1;
        }
        t2(wVar, b10, aVar3, i16);
        x(wVar);
        this.f24037t.f24065m = y2();
        this.f24037t.f24062j = b10.e();
        this.f24037t.f24061i = 0;
        a aVar4 = this.f24032E;
        if (aVar4.f24047d) {
            M2(aVar4);
            c cVar2 = this.f24037t;
            cVar2.f24060h = iMax;
            V1(wVar, cVar2, b10, false);
            c cVar3 = this.f24037t;
            i11 = cVar3.f24054b;
            int i18 = cVar3.f24056d;
            int i19 = cVar3.f24055c;
            if (i19 > 0) {
                iMax2 += i19;
            }
            K2(this.f24032E);
            c cVar4 = this.f24037t;
            cVar4.f24060h = iMax2;
            cVar4.f24056d += cVar4.f24057e;
            V1(wVar, cVar4, b10, false);
            c cVar5 = this.f24037t;
            i10 = cVar5.f24054b;
            int i20 = cVar5.f24055c;
            if (i20 > 0) {
                L2(i18, i11);
                c cVar6 = this.f24037t;
                cVar6.f24060h = i20;
                V1(wVar, cVar6, b10, false);
                i11 = this.f24037t.f24054b;
            }
        } else {
            K2(aVar4);
            c cVar7 = this.f24037t;
            cVar7.f24060h = iMax2;
            V1(wVar, cVar7, b10, false);
            c cVar8 = this.f24037t;
            i10 = cVar8.f24054b;
            int i21 = cVar8.f24056d;
            int i22 = cVar8.f24055c;
            if (i22 > 0) {
                iMax += i22;
            }
            M2(this.f24032E);
            c cVar9 = this.f24037t;
            cVar9.f24060h = iMax;
            cVar9.f24056d += cVar9.f24057e;
            V1(wVar, cVar9, b10, false);
            c cVar10 = this.f24037t;
            i11 = cVar10.f24054b;
            int i23 = cVar10.f24055c;
            if (i23 > 0) {
                J2(i21, i10);
                c cVar11 = this.f24037t;
                cVar11.f24060h = i23;
                V1(wVar, cVar11, b10, false);
                i10 = this.f24037t.f24054b;
            }
        }
        if (K() > 0) {
            if (this.f24041x ^ this.f24042y) {
                int iJ22 = j2(i10, wVar, b10, true);
                i12 = i11 + iJ22;
                i13 = i10 + iJ22;
                iJ2 = k2(i12, wVar, b10, false);
            } else {
                int iK2 = k2(i11, wVar, b10, true);
                i12 = i11 + iK2;
                i13 = i10 + iK2;
                iJ2 = j2(i13, wVar, b10, false);
            }
            i11 = i12 + iJ2;
            i10 = i13 + iJ2;
        }
        s2(wVar, b10, i11, i10);
        if (b10.e()) {
            this.f24032E.e();
        } else {
            this.f24038u.s();
        }
        this.f24039v = this.f24042y;
    }

    public View Y1(boolean z10, boolean z11) {
        return this.f24041x ? f2(0, K(), z10, z11) : f2(K() - 1, -1, z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView.B b10) {
        super.Z0(b10);
        this.f24031D = null;
        this.f24028A = -1;
        this.f24029B = Integer.MIN_VALUE;
        this.f24032E.e();
    }

    public View Z1(boolean z10, boolean z11) {
        return this.f24041x ? f2(K() - 1, -1, z10, z11) : f2(0, K(), z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public PointF a(int i10) {
        if (K() == 0) {
            return null;
        }
        int i11 = (i10 < i0(J(0))) != this.f24041x ? -1 : 1;
        return this.f24036s == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    public int a2() {
        View viewF2 = f2(0, K(), false, true);
        if (viewF2 == null) {
            return -1;
        }
        return i0(viewF2);
    }

    @Override // androidx.recyclerview.widget.h.InterfaceC0312h
    public void b(View view, View view2, int i10, int i11) {
        h("Cannot drop a view during a scroll or layout calculation");
        U1();
        z2();
        int iI0 = i0(view);
        int iI02 = i0(view2);
        byte b10 = iI0 < iI02 ? (byte) 1 : (byte) -1;
        if (this.f24041x) {
            if (b10 == 1) {
                B2(iI02, this.f24038u.i() - (this.f24038u.g(view2) + this.f24038u.e(view)));
                return;
            } else {
                B2(iI02, this.f24038u.i() - this.f24038u.d(view2));
                return;
            }
        }
        if (b10 == -1) {
            B2(iI02, this.f24038u.g(view2));
        } else {
            B2(iI02, this.f24038u.d(view2) - this.f24038u.e(view));
        }
    }

    public int b2() {
        View viewF2 = f2(K() - 1, -1, true, false);
        if (viewF2 == null) {
            return -1;
        }
        return i0(viewF2);
    }

    public final View c2() {
        return e2(K() - 1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f24031D = dVar;
            if (this.f24028A != -1) {
                dVar.b();
            }
            u1();
        }
    }

    public int d2() {
        View viewF2 = f2(K() - 1, -1, false, true);
        if (viewF2 == null) {
            return -1;
        }
        return i0(viewF2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable e1() {
        if (this.f24031D != null) {
            return new d(this.f24031D);
        }
        d dVar = new d();
        if (K() <= 0) {
            dVar.b();
            return dVar;
        }
        U1();
        boolean z10 = this.f24039v ^ this.f24041x;
        dVar.f24068c = z10;
        if (z10) {
            View viewL2 = l2();
            dVar.f24067b = this.f24038u.i() - this.f24038u.d(viewL2);
            dVar.f24066a = i0(viewL2);
            return dVar;
        }
        View viewM2 = m2();
        dVar.f24066a = i0(viewM2);
        dVar.f24067b = this.f24038u.g(viewM2) - this.f24038u.m();
        return dVar;
    }

    public View e2(int i10, int i11) {
        int i12;
        int i13;
        U1();
        if (i11 <= i10 && i11 >= i10) {
            return J(i10);
        }
        if (this.f24038u.g(J(i10)) < this.f24038u.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f24036s == 0 ? this.f24214e.a(i10, i11, i12, i13) : this.f24215f.a(i10, i11, i12, i13);
    }

    public View f2(int i10, int i11, boolean z10, boolean z11) {
        U1();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.f24036s == 0 ? this.f24214e.a(i10, i11, i12, i13) : this.f24215f.a(i10, i11, i12, i13);
    }

    public final View g2() {
        return this.f24041x ? X1() : c2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h(String str) {
        if (this.f24031D == null) {
            super.h(str);
        }
    }

    public final View h2() {
        return this.f24041x ? c2() : X1();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View i2(androidx.recyclerview.widget.RecyclerView.w r17, androidx.recyclerview.widget.RecyclerView.B r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.U1()
            int r1 = r0.K()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.K()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            androidx.recyclerview.widget.l r7 = r0.f24038u
            int r7 = r7.m()
            androidx.recyclerview.widget.l r8 = r0.f24038u
            int r8 = r8.i()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.J(r1)
            int r13 = r0.i0(r12)
            androidx.recyclerview.widget.l r14 = r0.f24038u
            int r14 = r14.g(r12)
            androidx.recyclerview.widget.l r15 = r0.f24038u
            int r15 = r15.d(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$q r13 = (androidx.recyclerview.widget.RecyclerView.q) r13
            boolean r13 = r13.c()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = r3
            goto L5c
        L5b:
            r13 = r2
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = r3
            goto L63
        L62:
            r14 = r2
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            return r9
        L7d:
            if (r10 == 0) goto L80
            return r10
        L80:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.i2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B, boolean, boolean):android.view.View");
    }

    public final int j2(int i10, RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int i11;
        int i12 = this.f24038u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -A2(-i12, wVar, b10);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f24038u.i() - i14) <= 0) {
            return i13;
        }
        this.f24038u.r(i11);
        return i11 + i13;
    }

    public final int k2(int i10, RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int iM;
        int iM2 = i10 - this.f24038u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i11 = -A2(iM2, wVar, b10);
        int i12 = i10 + i11;
        if (!z10 || (iM = i12 - this.f24038u.m()) <= 0) {
            return i11;
        }
        this.f24038u.r(-iM);
        return i11 - iM;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return this.f24036s == 0;
    }

    public final View l2() {
        return J(this.f24041x ? 0 : K() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean m() {
        return this.f24036s == 1;
    }

    public final View m2() {
        return J(this.f24041x ? K() - 1 : 0);
    }

    public int n2(RecyclerView.B b10) {
        if (b10.d()) {
            return this.f24038u.n();
        }
        return 0;
    }

    public int o2() {
        return this.f24036s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p(int i10, int i11, RecyclerView.B b10, RecyclerView.p.c cVar) {
        if (this.f24036s != 0) {
            i10 = i11;
        }
        if (K() == 0 || i10 == 0) {
            return;
        }
        U1();
        I2(i10 > 0 ? 1 : -1, Math.abs(i10), true, b10);
        O1(b10, this.f24037t, cVar);
    }

    public boolean p2() {
        return a0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void q(int i10, RecyclerView.p.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.f24031D;
        if (dVar == null || !dVar.a()) {
            z2();
            z10 = this.f24041x;
            i11 = this.f24028A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.f24031D;
            z10 = dVar2.f24068c;
            i11 = dVar2.f24066a;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.f24034G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    public boolean q2() {
        return this.f24043z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.B b10) {
        return P1(b10);
    }

    public void r2(RecyclerView.w wVar, RecyclerView.B b10, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iF0;
        int iF;
        int i14;
        int i15;
        View viewD = cVar.d(wVar);
        if (viewD == null) {
            bVar.f24050b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) viewD.getLayoutParams();
        if (cVar.f24064l == null) {
            if (this.f24041x == (cVar.f24058f == -1)) {
                e(viewD);
            } else {
                f(viewD, 0);
            }
        } else {
            if (this.f24041x == (cVar.f24058f == -1)) {
                c(viewD);
            } else {
                d(viewD, 0);
            }
        }
        B0(viewD, 0, 0);
        bVar.f24049a = this.f24038u.e(viewD);
        if (this.f24036s == 1) {
            if (p2()) {
                iF = p0() - g0();
                iF0 = iF - this.f24038u.f(viewD);
            } else {
                iF0 = f0();
                iF = this.f24038u.f(viewD) + iF0;
            }
            if (cVar.f24058f == -1) {
                i15 = cVar.f24054b;
                i14 = i15 - bVar.f24049a;
            } else {
                i14 = cVar.f24054b;
                i15 = bVar.f24049a + i14;
            }
            int i16 = iF0;
            i13 = i14;
            i12 = i16;
            i11 = i15;
            i10 = iF;
        } else {
            int iH0 = h0();
            int iF2 = this.f24038u.f(viewD) + iH0;
            if (cVar.f24058f == -1) {
                int i17 = cVar.f24054b;
                i12 = i17 - bVar.f24049a;
                i10 = i17;
                i11 = iF2;
            } else {
                int i18 = cVar.f24054b;
                i10 = bVar.f24049a + i18;
                i11 = iF2;
                i12 = i18;
            }
            i13 = iH0;
        }
        A0(viewD, i12, i13, i10, i11);
        if (qVar.c() || qVar.b()) {
            bVar.f24051c = true;
        }
        bVar.f24052d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.B b10) {
        return Q1(b10);
    }

    public final void s2(RecyclerView.w wVar, RecyclerView.B b10, int i10, int i11) {
        if (!b10.g() || K() == 0 || b10.e() || !M1()) {
            return;
        }
        List listK = wVar.k();
        int size = listK.size();
        int iI0 = i0(J(0));
        int iE = 0;
        int iE2 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.E e10 = (RecyclerView.E) listK.get(i12);
            if (!e10.isRemoved()) {
                if ((e10.getLayoutPosition() < iI0) != this.f24041x) {
                    iE += this.f24038u.e(e10.itemView);
                } else {
                    iE2 += this.f24038u.e(e10.itemView);
                }
            }
        }
        this.f24037t.f24064l = listK;
        if (iE > 0) {
            L2(i0(m2()), i10);
            c cVar = this.f24037t;
            cVar.f24060h = iE;
            cVar.f24055c = 0;
            cVar.a();
            V1(wVar, this.f24037t, b10, false);
        }
        if (iE2 > 0) {
            J2(i0(l2()), i11);
            c cVar2 = this.f24037t;
            cVar2.f24060h = iE2;
            cVar2.f24055c = 0;
            cVar2.a();
            V1(wVar, this.f24037t, b10, false);
        }
        this.f24037t.f24064l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.B b10) {
        return R1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean t0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.B b10) {
        return P1(b10);
    }

    public final void u2(RecyclerView.w wVar, c cVar) {
        if (!cVar.f24053a || cVar.f24065m) {
            return;
        }
        int i10 = cVar.f24059g;
        int i11 = cVar.f24061i;
        if (cVar.f24058f == -1) {
            w2(wVar, i10, i11);
        } else {
            x2(wVar, i10, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.B b10) {
        return Q1(b10);
    }

    public final void v2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                o1(i10, wVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                o1(i12, wVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.B b10) {
        return R1(b10);
    }

    public final void w2(RecyclerView.w wVar, int i10, int i11) {
        int iK = K();
        if (i10 < 0) {
            return;
        }
        int iH = (this.f24038u.h() - i10) + i11;
        if (this.f24041x) {
            for (int i12 = 0; i12 < iK; i12++) {
                View viewJ = J(i12);
                if (this.f24038u.g(viewJ) < iH || this.f24038u.q(viewJ) < iH) {
                    v2(wVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = iK - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View viewJ2 = J(i14);
            if (this.f24038u.g(viewJ2) < iH || this.f24038u.q(viewJ2) < iH) {
                v2(wVar, i13, i14);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f24036s == 1) {
            return 0;
        }
        return A2(i10, wVar, b10);
    }

    public final void x2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int iK = K();
        if (!this.f24041x) {
            for (int i13 = 0; i13 < iK; i13++) {
                View viewJ = J(i13);
                if (this.f24038u.d(viewJ) > i12 || this.f24038u.p(viewJ) > i12) {
                    v2(wVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = iK - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View viewJ2 = J(i15);
            if (this.f24038u.d(viewJ2) > i12 || this.f24038u.p(viewJ2) > i12) {
                v2(wVar, i14, i15);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void y1(int i10) {
        this.f24028A = i10;
        this.f24029B = Integer.MIN_VALUE;
        d dVar = this.f24031D;
        if (dVar != null) {
            dVar.b();
        }
        u1();
    }

    public boolean y2() {
        return this.f24038u.k() == 0 && this.f24038u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f24036s == 0) {
            return 0;
        }
        return A2(i10, wVar, b10);
    }

    public final void z2() {
        if (this.f24036s == 1 || !p2()) {
            this.f24041x = this.f24040w;
        } else {
            this.f24041x = !this.f24040w;
        }
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.f24036s = 1;
        this.f24040w = false;
        this.f24041x = false;
        this.f24042y = false;
        this.f24043z = true;
        this.f24028A = -1;
        this.f24029B = Integer.MIN_VALUE;
        this.f24031D = null;
        this.f24032E = new a();
        this.f24033F = new b();
        this.f24034G = 2;
        this.f24035H = new int[2];
        C2(i10);
        D2(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f24036s = 1;
        this.f24040w = false;
        this.f24041x = false;
        this.f24042y = false;
        this.f24043z = true;
        this.f24028A = -1;
        this.f24029B = Integer.MIN_VALUE;
        this.f24031D = null;
        this.f24032E = new a();
        this.f24033F = new b();
        this.f24034G = 2;
        this.f24035H = new int[2];
        RecyclerView.p.d dVarJ0 = RecyclerView.p.j0(context, attributeSet, i10, i11);
        C2(dVarJ0.f24230a);
        D2(dVarJ0.f24232c);
        E2(dVarJ0.f24233d);
    }

    public void t2(RecyclerView.w wVar, RecyclerView.B b10, a aVar, int i10) {
    }
}
