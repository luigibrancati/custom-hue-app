package E0;

import E0.b;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static float f3056l = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f3058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f3059c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3057a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3060d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f3061e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f3062f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f3063g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f3064h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3065i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3066j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3067k = false;

    public a(b bVar, c cVar) {
        this.f3058b = bVar;
        this.f3059c = cVar;
    }

    @Override // E0.b.a
    public void a(i iVar, float f10, boolean z10) {
        float f11 = f3056l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f3065i;
            if (i10 == -1) {
                this.f3065i = 0;
                this.f3064h[0] = f10;
                this.f3062f[0] = iVar.f3145c;
                this.f3063g[0] = -1;
                iVar.f3155m++;
                iVar.a(this.f3058b);
                this.f3057a++;
                if (this.f3067k) {
                    return;
                }
                int i11 = this.f3066j + 1;
                this.f3066j = i11;
                int[] iArr = this.f3062f;
                if (i11 >= iArr.length) {
                    this.f3067k = true;
                    this.f3066j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f3057a; i13++) {
                int i14 = this.f3062f[i10];
                int i15 = iVar.f3145c;
                if (i14 == i15) {
                    float[] fArr = this.f3064h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f3056l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f3065i) {
                            this.f3065i = this.f3063g[i10];
                        } else {
                            int[] iArr2 = this.f3063g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.c(this.f3058b);
                        }
                        if (this.f3067k) {
                            this.f3066j = i10;
                        }
                        iVar.f3155m--;
                        this.f3057a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f3063g[i10];
            }
            int length = this.f3066j;
            int i16 = length + 1;
            if (this.f3067k) {
                int[] iArr3 = this.f3062f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f3062f;
            if (length >= iArr4.length && this.f3057a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f3062f;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f3062f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f3060d * 2;
                this.f3060d = i18;
                this.f3067k = false;
                this.f3066j = length - 1;
                this.f3064h = Arrays.copyOf(this.f3064h, i18);
                this.f3062f = Arrays.copyOf(this.f3062f, this.f3060d);
                this.f3063g = Arrays.copyOf(this.f3063g, this.f3060d);
            }
            this.f3062f[length] = iVar.f3145c;
            this.f3064h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f3063g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f3063g[length] = this.f3065i;
                this.f3065i = length;
            }
            iVar.f3155m++;
            iVar.a(this.f3058b);
            this.f3057a++;
            if (!this.f3067k) {
                this.f3066j++;
            }
            int i19 = this.f3066j;
            int[] iArr8 = this.f3062f;
            if (i19 >= iArr8.length) {
                this.f3067k = true;
                this.f3066j = iArr8.length - 1;
            }
        }
    }

    @Override // E0.b.a
    public final void b(i iVar, float f10) {
        if (f10 == 0.0f) {
            e(iVar, true);
            return;
        }
        int i10 = this.f3065i;
        if (i10 == -1) {
            this.f3065i = 0;
            this.f3064h[0] = f10;
            this.f3062f[0] = iVar.f3145c;
            this.f3063g[0] = -1;
            iVar.f3155m++;
            iVar.a(this.f3058b);
            this.f3057a++;
            if (this.f3067k) {
                return;
            }
            int i11 = this.f3066j + 1;
            this.f3066j = i11;
            int[] iArr = this.f3062f;
            if (i11 >= iArr.length) {
                this.f3067k = true;
                this.f3066j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f3057a; i13++) {
            int i14 = this.f3062f[i10];
            int i15 = iVar.f3145c;
            if (i14 == i15) {
                this.f3064h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f3063g[i10];
        }
        int length = this.f3066j;
        int i16 = length + 1;
        if (this.f3067k) {
            int[] iArr2 = this.f3062f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f3062f;
        if (length >= iArr3.length && this.f3057a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f3062f;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f3062f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f3060d * 2;
            this.f3060d = i18;
            this.f3067k = false;
            this.f3066j = length - 1;
            this.f3064h = Arrays.copyOf(this.f3064h, i18);
            this.f3062f = Arrays.copyOf(this.f3062f, this.f3060d);
            this.f3063g = Arrays.copyOf(this.f3063g, this.f3060d);
        }
        this.f3062f[length] = iVar.f3145c;
        this.f3064h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f3063g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f3063g[length] = this.f3065i;
            this.f3065i = length;
        }
        iVar.f3155m++;
        iVar.a(this.f3058b);
        int i19 = this.f3057a + 1;
        this.f3057a = i19;
        if (!this.f3067k) {
            this.f3066j++;
        }
        int[] iArr7 = this.f3062f;
        if (i19 >= iArr7.length) {
            this.f3067k = true;
        }
        if (this.f3066j >= iArr7.length) {
            this.f3067k = true;
            this.f3066j = iArr7.length - 1;
        }
    }

    @Override // E0.b.a
    public i c(int i10) {
        int i11 = this.f3065i;
        for (int i12 = 0; i11 != -1 && i12 < this.f3057a; i12++) {
            if (i12 == i10) {
                return this.f3059c.f3077d[this.f3062f[i11]];
            }
            i11 = this.f3063g[i11];
        }
        return null;
    }

    @Override // E0.b.a
    public final void clear() {
        int i10 = this.f3065i;
        for (int i11 = 0; i10 != -1 && i11 < this.f3057a; i11++) {
            i iVar = this.f3059c.f3077d[this.f3062f[i10]];
            if (iVar != null) {
                iVar.c(this.f3058b);
            }
            i10 = this.f3063g[i10];
        }
        this.f3065i = -1;
        this.f3066j = -1;
        this.f3067k = false;
        this.f3057a = 0;
    }

    @Override // E0.b.a
    public final float d(i iVar) {
        int i10 = this.f3065i;
        for (int i11 = 0; i10 != -1 && i11 < this.f3057a; i11++) {
            if (this.f3062f[i10] == iVar.f3145c) {
                return this.f3064h[i10];
            }
            i10 = this.f3063g[i10];
        }
        return 0.0f;
    }

    @Override // E0.b.a
    public final float e(i iVar, boolean z10) {
        if (this.f3061e == iVar) {
            this.f3061e = null;
        }
        int i10 = this.f3065i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f3057a) {
            if (this.f3062f[i10] == iVar.f3145c) {
                if (i10 == this.f3065i) {
                    this.f3065i = this.f3063g[i10];
                } else {
                    int[] iArr = this.f3063g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.c(this.f3058b);
                }
                iVar.f3155m--;
                this.f3057a--;
                this.f3062f[i10] = -1;
                if (this.f3067k) {
                    this.f3066j = i10;
                }
                return this.f3064h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f3063g[i10];
        }
        return 0.0f;
    }

    @Override // E0.b.a
    public void f() {
        int i10 = this.f3065i;
        for (int i11 = 0; i10 != -1 && i11 < this.f3057a; i11++) {
            float[] fArr = this.f3064h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f3063g[i10];
        }
    }

    @Override // E0.b.a
    public boolean g(i iVar) {
        int i10 = this.f3065i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f3057a; i11++) {
            if (this.f3062f[i10] == iVar.f3145c) {
                return true;
            }
            i10 = this.f3063g[i10];
        }
        return false;
    }

    @Override // E0.b.a
    public int h() {
        return this.f3057a;
    }

    @Override // E0.b.a
    public float i(b bVar, boolean z10) {
        float fD = d(bVar.f3068a);
        e(bVar.f3068a, z10);
        b.a aVar = bVar.f3072e;
        int iH = aVar.h();
        for (int i10 = 0; i10 < iH; i10++) {
            i iVarC = aVar.c(i10);
            a(iVarC, aVar.d(iVarC) * fD, z10);
        }
        return fD;
    }

    @Override // E0.b.a
    public float j(int i10) {
        int i11 = this.f3065i;
        for (int i12 = 0; i11 != -1 && i12 < this.f3057a; i12++) {
            if (i12 == i10) {
                return this.f3064h[i11];
            }
            i11 = this.f3063g[i11];
        }
        return 0.0f;
    }

    @Override // E0.b.a
    public void k(float f10) {
        int i10 = this.f3065i;
        for (int i11 = 0; i10 != -1 && i11 < this.f3057a; i11++) {
            float[] fArr = this.f3064h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f3063g[i10];
        }
    }

    public String toString() {
        int i10 = this.f3065i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f3057a; i11++) {
            str = ((str + " -> ") + this.f3064h[i10] + " : ") + this.f3059c.f3077d[this.f3062f[i10]];
            i10 = this.f3063g[i10];
        }
        return str;
    }
}
