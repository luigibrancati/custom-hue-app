package i2;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f36857a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f36858b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f36859c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f36860d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f36861e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f36862f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f36863g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f36865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f36866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f36867d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f36868e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f36869f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f36870g;

        public a() {
        }

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!F.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f36864a = i11;
            this.f36865b = F.f36857a[3 - i12];
            int i15 = F.f36858b[i14];
            this.f36867d = i15;
            if (i11 == 2) {
                this.f36867d = i15 / 2;
            } else if (i11 == 0) {
                this.f36867d = i15 / 4;
            }
            int i16 = (i10 >>> 9) & 1;
            this.f36870g = F.k(i11, i12);
            if (i12 == 3) {
                int i17 = i11 == 3 ? F.f36859c[i13 - 1] : F.f36860d[i13 - 1];
                this.f36869f = i17;
                this.f36866c = (((i17 * 12) / this.f36867d) + i16) * 4;
            } else {
                if (i11 == 3) {
                    int i18 = i12 == 2 ? F.f36861e[i13 - 1] : F.f36862f[i13 - 1];
                    this.f36869f = i18;
                    this.f36866c = ((i18 * 144) / this.f36867d) + i16;
                } else {
                    int i19 = F.f36863g[i13 - 1];
                    this.f36869f = i19;
                    this.f36866c = (((i12 == 1 ? 72 : 144) * i19) / this.f36867d) + i16;
                }
            }
            this.f36868e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public a(a aVar) {
            this.f36864a = aVar.f36864a;
            this.f36865b = aVar.f36865b;
            this.f36866c = aVar.f36866c;
            this.f36867d = aVar.f36867d;
            this.f36868e = aVar.f36868e;
            this.f36869f = aVar.f36869f;
            this.f36870g = aVar.f36870g;
        }
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f36858b[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f36859c[i13 - 1] : f36860d[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? f36861e[i13 - 1] : f36862f[i13 - 1] : f36863g[i13 - 1];
        if (i11 == 3) {
            return ((i17 * 144) / i15) + i16;
        }
        return (((i12 == 1 ? 72 : 144) * i17) / i15) + i16;
    }

    public static int k(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static boolean l(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
