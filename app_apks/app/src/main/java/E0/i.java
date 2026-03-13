package E0;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f3142o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3144b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f3148f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f3152j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3145c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3146d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3147e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3149g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f3150h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f3151i = new float[9];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b[] f3153k = new b[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3154l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3155m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HashSet f3156n = null;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f3152j = aVar;
    }

    public static void b() {
        f3142o++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f3154l;
            if (i10 >= i11) {
                b[] bVarArr = this.f3153k;
                if (i11 >= bVarArr.length) {
                    this.f3153k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f3153k;
                int i12 = this.f3154l;
                bVarArr2[i12] = bVar;
                this.f3154l = i12 + 1;
                return;
            }
            if (this.f3153k[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void c(b bVar) {
        int i10 = this.f3154l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f3153k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f3153k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f3154l--;
                return;
            }
            i11++;
        }
    }

    public void d() {
        this.f3144b = null;
        this.f3152j = a.UNKNOWN;
        this.f3147e = 0;
        this.f3145c = -1;
        this.f3146d = -1;
        this.f3148f = 0.0f;
        this.f3149g = false;
        int i10 = this.f3154l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f3153k[i11] = null;
        }
        this.f3154l = 0;
        this.f3155m = 0;
        this.f3143a = false;
        Arrays.fill(this.f3151i, 0.0f);
    }

    public void e(d dVar, float f10) {
        this.f3148f = f10;
        this.f3149g = true;
        int i10 = this.f3154l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f3153k[i11].B(dVar, this, false);
        }
        this.f3154l = 0;
    }

    public void f(a aVar, String str) {
        this.f3152j = aVar;
    }

    public final void g(b bVar) {
        int i10 = this.f3154l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f3153k[i11].C(bVar, false);
        }
        this.f3154l = 0;
    }

    public String toString() {
        if (this.f3144b != null) {
            return "" + this.f3144b;
        }
        return "" + this.f3145c;
    }
}
