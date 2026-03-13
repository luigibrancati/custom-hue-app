package yd;

import Lc.AbstractC1191t;
import Lc.AbstractC1192u;
import Lc.InterfaceC1174b;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: yd.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6464B {

    /* JADX INFO: renamed from: yd.B$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f48523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f48524c;

        static {
            int[] iArr = new int[fd.j.values().length];
            try {
                iArr[fd.j.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fd.j.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fd.j.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fd.j.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f48522a = iArr;
            int[] iArr2 = new int[InterfaceC1174b.a.values().length];
            try {
                iArr2[InterfaceC1174b.a.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InterfaceC1174b.a.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InterfaceC1174b.a.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InterfaceC1174b.a.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f48523b = iArr2;
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
            f48524c = iArr3;
        }
    }

    public static final AbstractC1192u a(C6463A c6463a, fd.x xVar) {
        AbstractC4862t.e(c6463a, "<this>");
        switch (xVar == null ? -1 : a.f48524c[xVar.ordinal()]) {
            case 1:
                AbstractC1192u INTERNAL = AbstractC1191t.f8774d;
                AbstractC4862t.d(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                AbstractC1192u PRIVATE = AbstractC1191t.f8771a;
                AbstractC4862t.d(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                AbstractC1192u PRIVATE_TO_THIS = AbstractC1191t.f8772b;
                AbstractC4862t.d(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                AbstractC1192u PROTECTED = AbstractC1191t.f8773c;
                AbstractC4862t.d(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                AbstractC1192u PUBLIC = AbstractC1191t.f8775e;
                AbstractC4862t.d(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                AbstractC1192u LOCAL = AbstractC1191t.f8776f;
                AbstractC4862t.d(LOCAL, "LOCAL");
                return LOCAL;
            default:
                AbstractC1192u PRIVATE2 = AbstractC1191t.f8771a;
                AbstractC4862t.d(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    public static final InterfaceC1174b.a b(C6463A c6463a, fd.j jVar) {
        AbstractC4862t.e(c6463a, "<this>");
        int i10 = jVar == null ? -1 : a.f48522a[jVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? InterfaceC1174b.a.DECLARATION : InterfaceC1174b.a.SYNTHESIZED : InterfaceC1174b.a.DELEGATION : InterfaceC1174b.a.FAKE_OVERRIDE : InterfaceC1174b.a.DECLARATION;
    }
}
