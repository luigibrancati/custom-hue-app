package G;

import E.F0;
import E.J;
import I.c;
import I.d;
import I.e;
import L.I;
import fc.C4029l;
import fc.C4032o;
import fc.InterfaceC4028k;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4164b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f4165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f4166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f4167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f4168f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4028k f4169a = C4029l.b(new InterfaceC6082a() { // from class: G.a
        @Override // vc.InterfaceC6082a
        public final Object invoke() {
            return Integer.valueOf(b.b(this.f4163a));
        }
    });

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: G.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class C0065b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4170a;

        static {
            int[] iArr = new int[I.b.values().length];
            try {
                iArr[I.b.DYNAMIC_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I.b.FPS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I.b.VIDEO_STABILIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[I.b.IMAGE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f4170a = iArr;
        }
    }

    static {
        J HLG_10_BIT = J.f2796f;
        AbstractC4862t.d(HLG_10_BIT, "HLG_10_BIT");
        f4165c = new I.a(HLG_10_BIT);
        f4166d = new c(60, 60);
        f4167e = new e(e.b.PREVIEW);
        f4168f = new d(1);
    }

    public static final int b(b bVar) {
        return bVar.e(bVar.c());
    }

    public abstract I.b c();

    public boolean d(I cameraInfoInternal, F0 sessionConfig) {
        AbstractC4862t.e(cameraInfoInternal, "cameraInfoInternal");
        AbstractC4862t.e(sessionConfig, "sessionConfig");
        return true;
    }

    public final int e(I.b bVar) {
        int i10 = C0065b.f4170a[bVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new C4032o();
    }
}
