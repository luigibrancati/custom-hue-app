package androidx.recyclerview.widget;

import Z0.h;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f24013I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f24014J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int[] f24015K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public View[] f24016L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final SparseIntArray f24017M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final SparseIntArray f24018N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public c f24019O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final Rect f24020P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f24021Q;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            return 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseIntArray f24024a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseIntArray f24025b = new SparseIntArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f24026c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f24027d = false;

        public static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        public int b(int i10, int i11) {
            if (!this.f24027d) {
                return d(i10, i11);
            }
            int i12 = this.f24025b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iD = d(i10, i11);
            this.f24025b.put(i10, iD);
            return iD;
        }

        public int c(int i10, int i11) {
            if (!this.f24026c) {
                return e(i10, i11);
            }
            int i12 = this.f24024a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iE = e(i10, i11);
            this.f24024a.put(i10, iE);
            return iE;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int iC;
            int iA;
            if (!this.f24027d || (iA = a(this.f24025b, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                iC = 0;
            } else {
                i12 = this.f24025b.get(iA);
                i13 = iA + 1;
                iC = c(iA, i11) + f(iA);
                if (iC == i11) {
                    i12++;
                    iC = 0;
                }
            }
            int iF = f(i10);
            while (i13 < i10) {
                int iF2 = f(i13);
                iC += iF2;
                if (iC == i11) {
                    i12++;
                    iC = 0;
                } else if (iC > i11) {
                    i12++;
                    iC = iF2;
                }
                i13++;
            }
            return iC + iF > i11 ? i12 + 1 : i12;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.f(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f24026c
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.f24024a
                int r2 = a(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.f24024a
                int r3 = r3.get(r2)
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = r1
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.e(int, int):int");
        }

        public abstract int f(int i10);

        public void g() {
            this.f24025b.clear();
        }

        public void h() {
            this.f24024a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f24013I = false;
        this.f24014J = -1;
        this.f24017M = new SparseIntArray();
        this.f24018N = new SparseIntArray();
        this.f24019O = new a();
        this.f24020P = new Rect();
        d3(RecyclerView.p.j0(context, attributeSet, i10, i11).f24231b);
    }

    public static int[] Q2(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void D1(Rect rect, int i10, int i11) {
        int iO;
        int iO2;
        if (this.f24015K == null) {
            super.D1(rect, i10, i11);
        }
        int iF0 = f0() + g0();
        int iH0 = h0() + e0();
        if (this.f24036s == 1) {
            iO2 = RecyclerView.p.o(i11, rect.height() + iH0, c0());
            int[] iArr = this.f24015K;
            iO = RecyclerView.p.o(i10, iArr[iArr.length - 1] + iF0, d0());
        } else {
            iO = RecyclerView.p.o(i10, rect.width() + iF0, d0());
            int[] iArr2 = this.f24015K;
            iO2 = RecyclerView.p.o(i11, iArr2[iArr2.length - 1] + iH0, c0());
        }
        C1(iO, iO2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q E() {
        return this.f24036s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void E2(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.E2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q G(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View K0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.B r27) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.K0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean M1() {
        return this.f24031D == null && !this.f24013I;
    }

    public final void N2(RecyclerView.w wVar, RecyclerView.B b10, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i12 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.f24016L[i11];
            b bVar = (b) view.getLayoutParams();
            int iZ2 = Z2(wVar, b10, i0(view));
            bVar.f24023f = iZ2;
            bVar.f24022e = i14;
            i14 += iZ2;
            i11 += i13;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int O(RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f24036s == 1) {
            return this.f24014J;
        }
        if (b10.b() < 1) {
            return 0;
        }
        return X2(wVar, b10, b10.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void O1(RecyclerView.B b10, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int iF = this.f24014J;
        for (int i10 = 0; i10 < this.f24014J && cVar.c(b10) && iF > 0; i10++) {
            int i11 = cVar.f24056d;
            cVar2.a(i11, Math.max(0, cVar.f24059g));
            iF -= this.f24019O.f(i11);
            cVar.f24056d += cVar.f24057e;
        }
    }

    public final void O2() {
        int iK = K();
        for (int i10 = 0; i10 < iK; i10++) {
            b bVar = (b) J(i10).getLayoutParams();
            int iA = bVar.a();
            this.f24017M.put(iA, bVar.f());
            this.f24018N.put(iA, bVar.e());
        }
    }

    public final void P2(int i10) {
        this.f24015K = Q2(this.f24015K, this.f24014J, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q0(RecyclerView.w wVar, RecyclerView.B b10, View view, Z0.h hVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.P0(view, hVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iX2 = X2(wVar, b10, bVar.a());
        if (this.f24036s == 0) {
            hVar.l0(h.g.a(bVar.e(), bVar.f(), iX2, 1, false, false));
        } else {
            hVar.l0(h.g.a(iX2, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    public final void R2() {
        this.f24017M.clear();
        this.f24018N.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView recyclerView, int i10, int i11) {
        this.f24019O.h();
        this.f24019O.g();
    }

    public final int S2(RecyclerView.B b10) {
        if (K() != 0 && b10.b() != 0) {
            U1();
            boolean zQ2 = q2();
            View viewZ1 = Z1(!zQ2, true);
            View viewY1 = Y1(!zQ2, true);
            if (viewZ1 != null && viewY1 != null) {
                int iB = this.f24019O.b(i0(viewZ1), this.f24014J);
                int iB2 = this.f24019O.b(i0(viewY1), this.f24014J);
                int iMax = this.f24041x ? Math.max(0, ((this.f24019O.b(b10.b() - 1, this.f24014J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zQ2) {
                    return Math.round((iMax * (Math.abs(this.f24038u.d(viewY1) - this.f24038u.g(viewZ1)) / ((this.f24019O.b(i0(viewY1), this.f24014J) - this.f24019O.b(i0(viewZ1), this.f24014J)) + 1))) + (this.f24038u.m() - this.f24038u.g(viewZ1)));
                }
                return iMax;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(RecyclerView recyclerView) {
        this.f24019O.h();
        this.f24019O.g();
    }

    public final int T2(RecyclerView.B b10) {
        if (K() != 0 && b10.b() != 0) {
            U1();
            View viewZ1 = Z1(!q2(), true);
            View viewY1 = Y1(!q2(), true);
            if (viewZ1 != null && viewY1 != null) {
                if (!q2()) {
                    return this.f24019O.b(b10.b() - 1, this.f24014J) + 1;
                }
                int iD = this.f24038u.d(viewY1) - this.f24038u.g(viewZ1);
                int iB = this.f24019O.b(i0(viewZ1), this.f24014J);
                return (int) ((iD / ((this.f24019O.b(i0(viewY1), this.f24014J) - iB) + 1)) * (this.f24019O.b(b10.b() - 1, this.f24014J) + 1));
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f24019O.h();
        this.f24019O.g();
    }

    public final void U2(RecyclerView.w wVar, RecyclerView.B b10, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int iY2 = Y2(wVar, b10, aVar.f24045b);
        if (z10) {
            while (iY2 > 0) {
                int i11 = aVar.f24045b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                aVar.f24045b = i12;
                iY2 = Y2(wVar, b10, i12);
            }
            return;
        }
        int iB = b10.b() - 1;
        int i13 = aVar.f24045b;
        while (i13 < iB) {
            int i14 = i13 + 1;
            int iY22 = Y2(wVar, b10, i14);
            if (iY22 <= iY2) {
                break;
            }
            i13 = i14;
            iY2 = iY22;
        }
        aVar.f24045b = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView, int i10, int i11) {
        this.f24019O.h();
        this.f24019O.g();
    }

    public final void V2() {
        View[] viewArr = this.f24016L;
        if (viewArr == null || viewArr.length != this.f24014J) {
            this.f24016L = new View[this.f24014J];
        }
    }

    public int W2(int i10, int i11) {
        if (this.f24036s != 1 || !p2()) {
            int[] iArr = this.f24015K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f24015K;
        int i12 = this.f24014J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f24019O.h();
        this.f24019O.g();
    }

    public final int X2(RecyclerView.w wVar, RecyclerView.B b10, int i10) {
        if (!b10.e()) {
            return this.f24019O.b(i10, this.f24014J);
        }
        int iF = wVar.f(i10);
        if (iF != -1) {
            return this.f24019O.b(iF, this.f24014J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView.w wVar, RecyclerView.B b10) {
        if (b10.e()) {
            O2();
        }
        super.Y0(wVar, b10);
        R2();
    }

    public final int Y2(RecyclerView.w wVar, RecyclerView.B b10, int i10) {
        if (!b10.e()) {
            return this.f24019O.c(i10, this.f24014J);
        }
        int i11 = this.f24018N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = wVar.f(i10);
        if (iF != -1) {
            return this.f24019O.c(iF, this.f24014J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView.B b10) {
        super.Z0(b10);
        this.f24013I = false;
    }

    public final int Z2(RecyclerView.w wVar, RecyclerView.B b10, int i10) {
        if (!b10.e()) {
            return this.f24019O.f(i10);
        }
        int i11 = this.f24017M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = wVar.f(i10);
        if (iF != -1) {
            return this.f24019O.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    public final void a3(float f10, int i10) {
        P2(Math.max(Math.round(f10 * this.f24014J), i10));
    }

    public final void b3(View view, int i10, boolean z10) {
        int iL;
        int iL2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f24235b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iW2 = W2(bVar.f24022e, bVar.f24023f);
        if (this.f24036s == 1) {
            iL2 = RecyclerView.p.L(iW2, i10, i12, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iL = RecyclerView.p.L(this.f24038u.n(), Y(), i11, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iL3 = RecyclerView.p.L(iW2, i10, i11, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iL4 = RecyclerView.p.L(this.f24038u.n(), q0(), i12, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iL = iL3;
            iL2 = iL4;
        }
        c3(view, iL2, iL, z10);
    }

    public final void c3(View view, int i10, int i11, boolean z10) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z10 ? I1(view, i10, i11, qVar) : G1(view, i10, i11, qVar)) {
            view.measure(i10, i11);
        }
    }

    public void d3(int i10) {
        if (i10 == this.f24014J) {
            return;
        }
        this.f24013I = true;
        if (i10 >= 1) {
            this.f24014J = i10;
            this.f24019O.h();
            u1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    public final void e3() {
        int iX;
        int iH0;
        if (o2() == 1) {
            iX = p0() - g0();
            iH0 = f0();
        } else {
            iX = X() - e0();
            iH0 = h0();
        }
        P2(iX - iH0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View i2(RecyclerView.w wVar, RecyclerView.B b10, boolean z10, boolean z11) {
        int i10;
        int iK;
        int iK2 = K();
        int i11 = 1;
        if (z11) {
            iK = K() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iK2;
            iK = 0;
        }
        int iB = b10.b();
        U1();
        int iM = this.f24038u.m();
        int i12 = this.f24038u.i();
        View view = null;
        View view2 = null;
        while (iK != i10) {
            View viewJ = J(iK);
            int iI0 = i0(viewJ);
            if (iI0 >= 0 && iI0 < iB && Y2(wVar, b10, iI0) == 0) {
                if (((RecyclerView.q) viewJ.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewJ;
                    }
                } else {
                    if (this.f24038u.g(viewJ) < i12 && this.f24038u.d(viewJ) >= iM) {
                        return viewJ;
                    }
                    if (view == null) {
                        view = viewJ;
                    }
                }
            }
            iK += i11;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int l0(RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f24036s == 0) {
            return this.f24014J;
        }
        if (b10.b() < 1) {
            return 0;
        }
        return X2(wVar, b10, b10.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean n(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void r2(RecyclerView.w wVar, RecyclerView.B b10, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int iF0;
        int iH0;
        int iF;
        int iF2;
        int i12;
        int iL;
        int iL2;
        View viewD;
        int iL3 = this.f24038u.l();
        boolean z10 = iL3 != 1073741824;
        int i13 = K() > 0 ? this.f24015K[this.f24014J] : 0;
        if (z10) {
            e3();
        }
        boolean z11 = cVar.f24057e == 1;
        int iY2 = this.f24014J;
        if (!z11) {
            iY2 = Y2(wVar, b10, cVar.f24056d) + Z2(wVar, b10, cVar.f24056d);
        }
        int i14 = 0;
        while (i14 < this.f24014J && cVar.c(b10) && iY2 > 0) {
            int i15 = cVar.f24056d;
            int iZ2 = Z2(wVar, b10, i15);
            if (iZ2 > this.f24014J) {
                throw new IllegalArgumentException("Item at position " + i15 + " requires " + iZ2 + " spans but GridLayoutManager has only " + this.f24014J + " spans.");
            }
            iY2 -= iZ2;
            if (iY2 < 0 || (viewD = cVar.d(wVar)) == null) {
                break;
            }
            this.f24016L[i14] = viewD;
            i14++;
        }
        if (i14 == 0) {
            bVar.f24050b = true;
            return;
        }
        N2(wVar, b10, i14, z11);
        float f10 = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            View view = this.f24016L[i17];
            if (cVar.f24064l == null) {
                if (z11) {
                    e(view);
                } else {
                    f(view, 0);
                }
            } else if (z11) {
                c(view);
            } else {
                d(view, 0);
            }
            k(view, this.f24020P);
            b3(view, iL3, false);
            int iE = this.f24038u.e(view);
            if (iE > i16) {
                i16 = iE;
            }
            float f11 = (this.f24038u.f(view) * 1.0f) / ((b) view.getLayoutParams()).f24023f;
            if (f11 > f10) {
                f10 = f11;
            }
        }
        if (z10) {
            a3(f10, i13);
            i16 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                View view2 = this.f24016L[i18];
                b3(view2, 1073741824, true);
                int iE2 = this.f24038u.e(view2);
                if (iE2 > i16) {
                    i16 = iE2;
                }
            }
        }
        for (int i19 = 0; i19 < i14; i19++) {
            View view3 = this.f24016L[i19];
            if (this.f24038u.e(view3) != i16) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.f24235b;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int iW2 = W2(bVar2.f24022e, bVar2.f24023f);
                if (this.f24036s == 1) {
                    iL2 = RecyclerView.p.L(iW2, 1073741824, i21, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    iL = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    iL = RecyclerView.p.L(iW2, 1073741824, i20, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    iL2 = iMakeMeasureSpec;
                }
                c3(view3, iL2, iL, true);
            }
        }
        bVar.f24049a = i16;
        if (this.f24036s == 1) {
            if (cVar.f24058f == -1) {
                iF2 = cVar.f24054b;
                i12 = iF2 - i16;
            } else {
                i12 = cVar.f24054b;
                iF2 = i12 + i16;
            }
            iH0 = i12;
            iF = 0;
            iF0 = 0;
        } else {
            if (cVar.f24058f == -1) {
                i11 = cVar.f24054b;
                i10 = i11 - i16;
            } else {
                i10 = cVar.f24054b;
                i11 = i10 + i16;
            }
            iF0 = i10;
            iH0 = 0;
            iF = i11;
            iF2 = 0;
        }
        for (int i22 = 0; i22 < i14; i22++) {
            View view4 = this.f24016L[i22];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.f24036s != 1) {
                iH0 = this.f24015K[bVar3.f24022e] + h0();
                iF2 = this.f24038u.f(view4) + iH0;
            } else if (p2()) {
                iF = f0() + this.f24015K[this.f24014J - bVar3.f24022e];
                iF0 = iF - this.f24038u.f(view4);
            } else {
                iF0 = this.f24015K[bVar3.f24022e] + f0();
                iF = this.f24038u.f(view4) + iF0;
            }
            int i23 = iF2;
            int i24 = iH0;
            int i25 = iF;
            int i26 = iF0;
            A0(view4, i26, i24, i25, i23);
            iF2 = i23;
            iF0 = i26;
            iF = i25;
            iH0 = i24;
            if (bVar3.c() || bVar3.b()) {
                bVar.f24051c = true;
            }
            bVar.f24052d = view4.hasFocusable() | bVar.f24052d;
        }
        Arrays.fill(this.f24016L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.B b10) {
        return this.f24021Q ? S2(b10) : super.s(b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.B b10) {
        return this.f24021Q ? T2(b10) : super.t(b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void t2(RecyclerView.w wVar, RecyclerView.B b10, LinearLayoutManager.a aVar, int i10) {
        super.t2(wVar, b10, aVar, i10);
        e3();
        if (b10.b() > 0 && !b10.e()) {
            U2(wVar, b10, aVar, i10);
        }
        V2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.B b10) {
        return this.f24021Q ? S2(b10) : super.v(b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.B b10) {
        return this.f24021Q ? T2(b10) : super.w(b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int x1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        e3();
        V2();
        return super.x1(i10, wVar, b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int z1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        e3();
        V2();
        return super.z1(i10, wVar, b10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends RecyclerView.q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24022e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f24023f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f24022e = -1;
            this.f24023f = 0;
        }

        public int e() {
            return this.f24022e;
        }

        public int f() {
            return this.f24023f;
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f24022e = -1;
            this.f24023f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f24022e = -1;
            this.f24023f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f24022e = -1;
            this.f24023f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.f24013I = false;
        this.f24014J = -1;
        this.f24017M = new SparseIntArray();
        this.f24018N = new SparseIntArray();
        this.f24019O = new a();
        this.f24020P = new Rect();
        d3(i10);
    }
}
