package yd;

import Cd.u0;
import Lc.EnumC1178f;
import fc.C4032o;
import fd.c;
import fd.q;
import fd.s;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: yd.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6463A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6463A f48513a = new C6463A();

    /* JADX INFO: renamed from: yd.A$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f48515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f48516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f48517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f48518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f48519f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f48520g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f48521h;

        static {
            int[] iArr = new int[fd.k.values().length];
            try {
                iArr[fd.k.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fd.k.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fd.k.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fd.k.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f48514a = iArr;
            int[] iArr2 = new int[Lc.D.values().length];
            try {
                iArr2[Lc.D.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Lc.D.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Lc.D.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Lc.D.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f48515b = iArr2;
            int[] iArr3 = new int[fd.x.values().length];
            try {
                iArr3[fd.x.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[fd.x.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[fd.x.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[fd.x.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[fd.x.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[fd.x.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f48516c = iArr3;
            int[] iArr4 = new int[c.EnumC0446c.values().length];
            try {
                iArr4[c.EnumC0446c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[c.EnumC0446c.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[c.EnumC0446c.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[c.EnumC0446c.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[c.EnumC0446c.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[c.EnumC0446c.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[c.EnumC0446c.COMPANION_OBJECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            f48517d = iArr4;
            int[] iArr5 = new int[EnumC1178f.values().length];
            try {
                iArr5[EnumC1178f.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[EnumC1178f.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[EnumC1178f.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[EnumC1178f.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[EnumC1178f.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[EnumC1178f.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            f48518e = iArr5;
            int[] iArr6 = new int[s.c.values().length];
            try {
                iArr6[s.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[s.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[s.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            f48519f = iArr6;
            int[] iArr7 = new int[q.b.c.values().length];
            try {
                iArr7[q.b.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[q.b.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[q.b.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[q.b.c.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            f48520g = iArr7;
            int[] iArr8 = new int[u0.values().length];
            try {
                iArr8[u0.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[u0.OUT_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[u0.INVARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            f48521h = iArr8;
        }
    }

    public final EnumC1178f a(c.EnumC0446c enumC0446c) {
        switch (enumC0446c == null ? -1 : a.f48517d[enumC0446c.ordinal()]) {
            case 1:
                return EnumC1178f.CLASS;
            case 2:
                return EnumC1178f.INTERFACE;
            case 3:
                return EnumC1178f.ENUM_CLASS;
            case 4:
                return EnumC1178f.ENUM_ENTRY;
            case 5:
                return EnumC1178f.ANNOTATION_CLASS;
            case 6:
            case 7:
                return EnumC1178f.OBJECT;
            default:
                return EnumC1178f.CLASS;
        }
    }

    public final Lc.D b(fd.k kVar) {
        int i10 = kVar == null ? -1 : a.f48514a[kVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Lc.D.FINAL : Lc.D.SEALED : Lc.D.ABSTRACT : Lc.D.OPEN : Lc.D.FINAL;
    }

    public final u0 c(q.b.c projection) {
        AbstractC4862t.e(projection, "projection");
        int i10 = a.f48520g[projection.ordinal()];
        if (i10 == 1) {
            return u0.IN_VARIANCE;
        }
        if (i10 == 2) {
            return u0.OUT_VARIANCE;
        }
        if (i10 == 3) {
            return u0.INVARIANT;
        }
        if (i10 != 4) {
            throw new C4032o();
        }
        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
    }

    public final u0 d(s.c variance) {
        AbstractC4862t.e(variance, "variance");
        int i10 = a.f48519f[variance.ordinal()];
        if (i10 == 1) {
            return u0.IN_VARIANCE;
        }
        if (i10 == 2) {
            return u0.OUT_VARIANCE;
        }
        if (i10 == 3) {
            return u0.INVARIANT;
        }
        throw new C4032o();
    }
}
