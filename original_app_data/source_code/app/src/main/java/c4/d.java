package c4;

import Bc.k;
import Fe.C0846h;
import fc.C4032o;
import j4.AbstractC4689h;
import j4.C4683b;
import j4.C4684c;
import j4.EnumC4688g;
import kotlin.jvm.internal.AbstractC4862t;
import xc.C6361d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f25598a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0846h f25599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0846h f25600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0846h f25601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0846h f25602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0846h f25603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0846h f25604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0846h f25605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0846h f25606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0846h f25607j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25608a;

        static {
            int[] iArr = new int[EnumC4688g.values().length];
            iArr[EnumC4688g.FILL.ordinal()] = 1;
            iArr[EnumC4688g.FIT.ordinal()] = 2;
            f25608a = iArr;
        }
    }

    static {
        C0846h.a aVar = C0846h.f4117d;
        f25599b = aVar.d("GIF87a");
        f25600c = aVar.d("GIF89a");
        f25601d = aVar.d("RIFF");
        f25602e = aVar.d("WEBP");
        f25603f = aVar.d("VP8X");
        f25604g = aVar.d("ftyp");
        f25605h = aVar.d("msf1");
        f25606i = aVar.d("hevc");
        f25607j = aVar.d("hevx");
    }

    public static final int a(int i10, int i11, int i12, int i13, EnumC4688g scale) {
        AbstractC4862t.e(scale, "scale");
        int iE = k.e(Integer.highestOneBit(i10 / i12), 1);
        int iE2 = k.e(Integer.highestOneBit(i11 / i13), 1);
        int i14 = a.f25608a[scale.ordinal()];
        if (i14 == 1) {
            return Math.min(iE, iE2);
        }
        if (i14 == 2) {
            return Math.max(iE, iE2);
        }
        throw new C4032o();
    }

    public static final C4684c b(int i10, int i11, AbstractC4689h dstSize, EnumC4688g scale) {
        AbstractC4862t.e(dstSize, "dstSize");
        AbstractC4862t.e(scale, "scale");
        if (dstSize instanceof C4683b) {
            return new C4684c(i10, i11);
        }
        if (!(dstSize instanceof C4684c)) {
            throw new C4032o();
        }
        C4684c c4684c = (C4684c) dstSize;
        double d10 = d(i10, i11, c4684c.d(), c4684c.c(), scale);
        return new C4684c(C6361d.b(((double) i10) * d10), C6361d.b(d10 * ((double) i11)));
    }

    public static final double c(double d10, double d11, double d12, double d13, EnumC4688g scale) {
        AbstractC4862t.e(scale, "scale");
        double d14 = d12 / d10;
        double d15 = d13 / d11;
        int i10 = a.f25608a[scale.ordinal()];
        if (i10 == 1) {
            return Math.max(d14, d15);
        }
        if (i10 == 2) {
            return Math.min(d14, d15);
        }
        throw new C4032o();
    }

    public static final double d(int i10, int i11, int i12, int i13, EnumC4688g scale) {
        AbstractC4862t.e(scale, "scale");
        double d10 = ((double) i12) / ((double) i10);
        double d11 = ((double) i13) / ((double) i11);
        int i14 = a.f25608a[scale.ordinal()];
        if (i14 == 1) {
            return Math.max(d10, d11);
        }
        if (i14 == 2) {
            return Math.min(d10, d11);
        }
        throw new C4032o();
    }
}
