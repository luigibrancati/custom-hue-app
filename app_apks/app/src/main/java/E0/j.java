package E0;

import E0.b;
import io.sentry.MeasurementUnit;
import java.util.Arrays;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class j implements b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static float f3157n = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3158a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3159b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3160c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f3161d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f3162e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f3163f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f3164g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f3165h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f3166i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3167j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3168k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f3169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f3170m;

    public j(b bVar, c cVar) {
        this.f3169l = bVar;
        this.f3170m = cVar;
        clear();
    }

    @Override // E0.b.a
    public void a(i iVar, float f10, boolean z10) {
        float f11 = f3157n;
        if (f10 <= (-f11) || f10 >= f11) {
            int iP = p(iVar);
            if (iP == -1) {
                b(iVar, f10);
                return;
            }
            float[] fArr = this.f3164g;
            float f12 = fArr[iP] + f10;
            fArr[iP] = f12;
            float f13 = f3157n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iP] = 0.0f;
            e(iVar, z10);
        }
    }

    @Override // E0.b.a
    public void b(i iVar, float f10) {
        float f11 = f3157n;
        if (f10 > (-f11) && f10 < f11) {
            e(iVar, true);
            return;
        }
        if (this.f3167j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f3168k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f3164g[iP] = f10;
            return;
        }
        if (this.f3167j + 1 >= this.f3159b) {
            o();
        }
        int i10 = this.f3167j;
        int i11 = this.f3168k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f3163f[i11];
            int i15 = iVar.f3145c;
            if (i14 == i15) {
                this.f3164g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f3166i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // E0.b.a
    public i c(int i10) {
        int i11 = this.f3167j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f3168k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f3170m.f3077d[this.f3163f[i12]];
            }
            i12 = this.f3166i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // E0.b.a
    public void clear() {
        int i10 = this.f3167j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarC = c(i11);
            if (iVarC != null) {
                iVarC.c(this.f3169l);
            }
        }
        for (int i12 = 0; i12 < this.f3159b; i12++) {
            this.f3163f[i12] = -1;
            this.f3162e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f3160c; i13++) {
            this.f3161d[i13] = -1;
        }
        this.f3167j = 0;
        this.f3168k = -1;
    }

    @Override // E0.b.a
    public float d(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f3164g[iP];
        }
        return 0.0f;
    }

    @Override // E0.b.a
    public float e(i iVar, boolean z10) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f3164g[iP];
        if (this.f3168k == iP) {
            this.f3168k = this.f3166i[iP];
        }
        this.f3163f[iP] = -1;
        int[] iArr = this.f3165h;
        int i10 = iArr[iP];
        if (i10 != -1) {
            int[] iArr2 = this.f3166i;
            iArr2[i10] = iArr2[iP];
        }
        int i11 = this.f3166i[iP];
        if (i11 != -1) {
            iArr[i11] = iArr[iP];
        }
        this.f3167j--;
        iVar.f3155m--;
        if (z10) {
            iVar.c(this.f3169l);
        }
        return f10;
    }

    @Override // E0.b.a
    public void f() {
        int i10 = this.f3167j;
        int i11 = this.f3168k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f3164g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f3166i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // E0.b.a
    public boolean g(i iVar) {
        return p(iVar) != -1;
    }

    @Override // E0.b.a
    public int h() {
        return this.f3167j;
    }

    @Override // E0.b.a
    public float i(b bVar, boolean z10) {
        float fD = d(bVar.f3068a);
        e(bVar.f3068a, z10);
        j jVar = (j) bVar.f3072e;
        int iH = jVar.h();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iH) {
            int i12 = jVar.f3163f[i11];
            if (i12 != -1) {
                a(this.f3170m.f3077d[i12], jVar.f3164g[i11] * fD, z10);
                i10++;
            }
            i11++;
        }
        return fD;
    }

    @Override // E0.b.a
    public float j(int i10) {
        int i11 = this.f3167j;
        int i12 = this.f3168k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f3164g[i12];
            }
            i12 = this.f3166i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // E0.b.a
    public void k(float f10) {
        int i10 = this.f3167j;
        int i11 = this.f3168k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f3164g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f3166i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public final void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f3145c % this.f3160c;
        int[] iArr2 = this.f3161d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f3162e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f3162e[i10] = -1;
    }

    public final void m(int i10, i iVar, float f10) {
        this.f3163f[i10] = iVar.f3145c;
        this.f3164g[i10] = f10;
        this.f3165h[i10] = -1;
        this.f3166i[i10] = -1;
        iVar.a(this.f3169l);
        iVar.f3155m++;
        this.f3167j++;
    }

    public final int n() {
        for (int i10 = 0; i10 < this.f3159b; i10++) {
            if (this.f3163f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    public final void o() {
        int i10 = this.f3159b * 2;
        this.f3163f = Arrays.copyOf(this.f3163f, i10);
        this.f3164g = Arrays.copyOf(this.f3164g, i10);
        this.f3165h = Arrays.copyOf(this.f3165h, i10);
        this.f3166i = Arrays.copyOf(this.f3166i, i10);
        this.f3162e = Arrays.copyOf(this.f3162e, i10);
        for (int i11 = this.f3159b; i11 < i10; i11++) {
            this.f3163f[i11] = -1;
            this.f3162e[i11] = -1;
        }
        this.f3159b = i10;
    }

    public int p(i iVar) {
        if (this.f3167j == 0) {
            return -1;
        }
        int i10 = iVar.f3145c;
        int i11 = this.f3161d[i10 % this.f3160c];
        if (i11 == -1) {
            return -1;
        }
        if (this.f3163f[i11] == i10) {
            return i11;
        }
        do {
            i11 = this.f3162e[i11];
            if (i11 == -1) {
                break;
            }
        } while (this.f3163f[i11] != i10);
        if (i11 != -1 && this.f3163f[i11] == i10) {
            return i11;
        }
        return -1;
    }

    public final void q(int i10, i iVar, float f10) {
        int iN = n();
        m(iN, iVar, f10);
        if (i10 != -1) {
            this.f3165h[iN] = i10;
            int[] iArr = this.f3166i;
            iArr[iN] = iArr[i10];
            iArr[i10] = iN;
        } else {
            this.f3165h[iN] = -1;
            if (this.f3167j > 0) {
                this.f3166i[iN] = this.f3168k;
                this.f3168k = iN;
            } else {
                this.f3166i[iN] = -1;
            }
        }
        int i11 = this.f3166i[iN];
        if (i11 != -1) {
            this.f3165h[i11] = iN;
        }
        l(iVar, iN);
    }

    public final void r(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f3145c;
        int i12 = i11 % this.f3160c;
        int[] iArr2 = this.f3161d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f3163f[i13] == i11) {
            int[] iArr3 = this.f3162e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f3162e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f3163f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f3163f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f3167j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarC = c(i11);
            if (iVarC != null) {
                String str2 = str + iVarC + " = " + j(i11) + StringUtils.SPACE;
                int iP = p(iVarC);
                String str3 = str2 + "[p: ";
                String str4 = (this.f3165h[iP] != -1 ? str3 + this.f3170m.f3077d[this.f3163f[this.f3165h[iP]]] : str3 + MeasurementUnit.NONE) + ", n: ";
                str = (this.f3166i[iP] != -1 ? str4 + this.f3170m.f3077d[this.f3163f[this.f3166i[iP]]] : str4 + MeasurementUnit.NONE) + "]";
            }
        }
        return str + " }";
    }
}
