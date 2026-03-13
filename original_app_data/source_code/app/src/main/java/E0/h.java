package E0;

import E0.b;
import java.util.Arrays;
import java.util.Comparator;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class h extends E0.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i[] f3133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i[] f3134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f3136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f3137l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f3145c - iVar2.f3145c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i f3139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h f3140b;

        public b(h hVar) {
            this.f3140b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f3139a.f3143a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.f3151i[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f3139a.f3151i[i10] = f12;
                    } else {
                        this.f3139a.f3151i[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f3139a.f3151i;
                float f13 = fArr[i11] + (iVar.f3151i[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f3139a.f3151i[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f3139a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f3139a = iVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f3139a.f3145c - ((i) obj).f3145c;
        }

        public final boolean j() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f3139a.f3151i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean p(i iVar) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = iVar.f3151i[i10];
                float f11 = this.f3139a.f3151i[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        public void q() {
            Arrays.fill(this.f3139a.f3151i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f3139a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f3139a.f3151i[i10] + StringUtils.SPACE;
                }
            }
            return str + "] " + this.f3139a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f3132g = 128;
        this.f3133h = new i[128];
        this.f3134i = new i[128];
        this.f3135j = 0;
        this.f3136k = new b(this);
        this.f3137l = cVar;
    }

    @Override // E0.b
    public void C(E0.b bVar, boolean z10) {
        i iVar = bVar.f3068a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f3072e;
        int iH = aVar.h();
        for (int i10 = 0; i10 < iH; i10++) {
            i iVarC = aVar.c(i10);
            float fJ = aVar.j(i10);
            this.f3136k.b(iVarC);
            if (this.f3136k.a(iVar, fJ)) {
                F(iVarC);
            }
            this.f3069b += bVar.f3069b * fJ;
        }
        G(iVar);
    }

    public final void F(i iVar) {
        int i10;
        int i11 = this.f3135j + 1;
        i[] iVarArr = this.f3133h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f3133h = iVarArr2;
            this.f3134i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f3133h;
        int i12 = this.f3135j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f3135j = i13;
        if (i13 > 1 && iVarArr3[i12].f3145c > iVar.f3145c) {
            int i14 = 0;
            while (true) {
                i10 = this.f3135j;
                if (i14 >= i10) {
                    break;
                }
                this.f3134i[i14] = this.f3133h[i14];
                i14++;
            }
            Arrays.sort(this.f3134i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f3135j; i15++) {
                this.f3133h[i15] = this.f3134i[i15];
            }
        }
        iVar.f3143a = true;
        iVar.a(this);
    }

    public final void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f3135j) {
            if (this.f3133h[i10] == iVar) {
                while (true) {
                    int i11 = this.f3135j;
                    if (i10 >= i11 - 1) {
                        this.f3135j = i11 - 1;
                        iVar.f3143a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f3133h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // E0.b, E0.d.a
    public void a(i iVar) {
        this.f3136k.b(iVar);
        this.f3136k.q();
        iVar.f3151i[iVar.f3147e] = 1.0f;
        F(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // E0.b, E0.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public E0.i b(E0.d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.f3135j
            if (r0 >= r2) goto L32
            E0.i[] r2 = r4.f3133h
            r2 = r2[r0]
            int r3 = r2.f3145c
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            E0.h$b r3 = r4.f3136k
            r3.b(r2)
            if (r1 != r5) goto L22
            E0.h$b r2 = r4.f3136k
            boolean r2 = r2.j()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            E0.h$b r2 = r4.f3136k
            E0.i[] r3 = r4.f3133h
            r3 = r3[r1]
            boolean r2 = r2.p(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r4 = 0
            return r4
        L36:
            E0.i[] r4 = r4.f3133h
            r4 = r4[r1]
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.h.b(E0.d, boolean[]):E0.i");
    }

    @Override // E0.b, E0.d.a
    public void clear() {
        this.f3135j = 0;
        this.f3069b = 0.0f;
    }

    @Override // E0.b
    public String toString() {
        String str = " goal -> (" + this.f3069b + ") : ";
        for (int i10 = 0; i10 < this.f3135j; i10++) {
            this.f3136k.b(this.f3133h[i10]);
            str = str + this.f3136k + StringUtils.SPACE;
        }
        return str;
    }
}
