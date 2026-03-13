package d2;

import D1.D;
import D1.E;
import G1.M;
import K1.f1;
import K1.g1;
import a2.InterfaceC2611D;
import a2.n0;
import android.util.Pair;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class u extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f32969c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f32971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f32972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n0[] f32973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f32974e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[][][] f32975f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final n0 f32976g;

        public a(String[] strArr, int[] iArr, n0[] n0VarArr, int[] iArr2, int[][][] iArr3, n0 n0Var) {
            this.f32971b = strArr;
            this.f32972c = iArr;
            this.f32973d = n0VarArr;
            this.f32975f = iArr3;
            this.f32974e = iArr2;
            this.f32976g = n0Var;
            this.f32970a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f32973d[i10].b(i11).f1491a;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int iG = g(i10, i11, i14);
                if (iG == 4 || (z10 && iG == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int iMin = 16;
            String str = null;
            boolean z10 = false;
            int i13 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f32973d[i10].b(i11).a(iArr[i12]).f1805o;
                int i14 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !Objects.equals(str, str2);
                }
                iMin = Math.min(iMin, f1.s(this.f32975f[i10][i11][i12]));
                i12++;
                i13 = i14;
            }
            return z10 ? Math.min(iMin, this.f32974e[i10]) : iMin;
        }

        public int c(int i10, int i11, int i12) {
            return this.f32975f[i10][i11][i12];
        }

        public int d() {
            return this.f32970a;
        }

        public int e(int i10) {
            return this.f32972c[i10];
        }

        public n0 f(int i10) {
            return this.f32973d[i10];
        }

        public int g(int i10, int i11, int i12) {
            return f1.Q(c(i10, i11, i12));
        }

        public n0 h() {
            return this.f32976g;
        }
    }

    public static int l(f1[] f1VarArr, E e10, int[] iArr, boolean z10) {
        int length = f1VarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < f1VarArr.length; i11++) {
            f1 f1Var = f1VarArr[i11];
            int iMax = 0;
            for (int i12 = 0; i12 < e10.f1491a; i12++) {
                iMax = Math.max(iMax, f1.Q(f1Var.a(e10.a(i12))));
            }
            boolean z12 = iArr[i11] == 0;
            if (iMax > i10 || (iMax == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = iMax;
            }
        }
        return length;
    }

    public static int[] m(f1 f1Var, E e10) {
        int[] iArr = new int[e10.f1491a];
        for (int i10 = 0; i10 < e10.f1491a; i10++) {
            iArr[i10] = f1Var.a(e10.a(i10));
        }
        return iArr;
    }

    public static int[] n(f1[] f1VarArr) {
        int length = f1VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = f1VarArr[i10].K();
        }
        return iArr;
    }

    @Override // d2.x
    public final void h(Object obj) {
        this.f32969c = (a) obj;
    }

    @Override // d2.x
    public final y j(f1[] f1VarArr, n0 n0Var, InterfaceC2611D.b bVar, D d10) {
        int[] iArr = new int[f1VarArr.length + 1];
        int length = f1VarArr.length + 1;
        E[][] eArr = new E[length][];
        int[][][] iArr2 = new int[f1VarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = n0Var.f20863a;
            eArr[i10] = new E[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] iArrN = n(f1VarArr);
        for (int i12 = 0; i12 < n0Var.f20863a; i12++) {
            E eB = n0Var.b(i12);
            int iL = l(f1VarArr, eB, iArr, eB.f1493c == 5);
            int[] iArrM = iL == f1VarArr.length ? new int[eB.f1491a] : m(f1VarArr[iL], eB);
            int i13 = iArr[iL];
            eArr[iL][i13] = eB;
            iArr2[iL][i13] = iArrM;
            iArr[iL] = i13 + 1;
        }
        n0[] n0VarArr = new n0[f1VarArr.length];
        String[] strArr = new String[f1VarArr.length];
        int[] iArr3 = new int[f1VarArr.length];
        for (int i14 = 0; i14 < f1VarArr.length; i14++) {
            int i15 = iArr[i14];
            n0VarArr[i14] = new n0((E[]) M.S0(eArr[i14], i15));
            iArr2[i14] = (int[][]) M.S0(iArr2[i14], i15);
            strArr[i14] = f1VarArr[i14].getName();
            iArr3[i14] = f1VarArr[i14].f();
        }
        a aVar = new a(strArr, iArr3, n0VarArr, iArrN, iArr2, new n0((E[]) M.S0(eArr[f1VarArr.length], iArr[f1VarArr.length])));
        Pair pairO = o(aVar, iArr2, iArrN, bVar, d10);
        return new y((g1[]) pairO.first, (r[]) pairO.second, w.a(aVar, (v[]) pairO.second), aVar);
    }

    public abstract Pair o(a aVar, int[][][] iArr, int[] iArr2, InterfaceC2611D.b bVar, D d10);
}
