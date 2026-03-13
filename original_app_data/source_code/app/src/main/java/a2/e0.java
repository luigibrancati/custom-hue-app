package a2;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface e0 {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Random f20750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f20751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f20752c;

        public a(int i10) {
            this(i10, new Random());
        }

        public static int[] h(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int iNextInt = random.nextInt(i12);
                iArr[i11] = iArr[iNextInt];
                iArr[iNextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override // a2.e0
        public e0 a(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f20751b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f20751b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f20750a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i13 - i14;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // a2.e0
        public int b(int i10) {
            int i11 = this.f20752c[i10] - 1;
            if (i11 >= 0) {
                return this.f20751b[i11];
            }
            return -1;
        }

        @Override // a2.e0
        public int c(int i10) {
            int i11 = this.f20752c[i10] + 1;
            int[] iArr = this.f20751b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // a2.e0
        public int d() {
            int[] iArr = this.f20751b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // a2.e0
        public e0 e() {
            return new a(0, new Random(this.f20750a.nextLong()));
        }

        @Override // a2.e0
        public int f() {
            int[] iArr = this.f20751b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // a2.e0
        public e0 g(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f20750a.nextInt(this.f20751b.length + 1);
                int i14 = i13 + 1;
                int iNextInt = this.f20750a.nextInt(i14);
                iArr2[i13] = iArr2[iNextInt];
                iArr2[iNextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f20751b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f20751b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f20750a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    int i18 = iArr4[i16];
                    iArr3[i12] = i18;
                    if (i18 >= i10) {
                        iArr3[i12] = i18 + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        @Override // a2.e0
        public int getLength() {
            return this.f20751b.length;
        }

        public a(int i10, Random random) {
            this(h(i10, random), random);
        }

        public a(int[] iArr, Random random) {
            this.f20751b = iArr;
            this.f20750a = random;
            this.f20752c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f20752c[iArr[i10]] = i10;
            }
        }
    }

    e0 a(int i10, int i11);

    int b(int i10);

    int c(int i10);

    int d();

    e0 e();

    int f();

    e0 g(int i10, int i11);

    int getLength();
}
