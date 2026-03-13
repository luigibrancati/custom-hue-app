package H;

import E.J;
import L.AbstractC1109l0;
import L.a1;
import L.s1;
import O.n;
import O7.e;
import android.util.Size;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f4783a = b.f4785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4784b = new C0080a();

    /* JADX INFO: renamed from: H.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0080a implements a {
        @Override // H.a
        public boolean b(a1 sessionConfig) {
            AbstractC4862t.e(sessionConfig, "sessionConfig");
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f4785a = new b();

        /* JADX INFO: renamed from: H.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0081a extends AbstractC1109l0 {
            public C0081a(Size size, int i10) {
                super(size, i10);
            }

            @Override // L.AbstractC1109l0
            public e o() {
                e eVarP = n.p(null);
                AbstractC4862t.d(eVarP, "immediateFuture(...)");
                return eVarP;
            }
        }

        public final a1.b a(s1 s1Var, Size resolution, J dynamicRange) {
            AbstractC4862t.e(s1Var, "<this>");
            AbstractC4862t.e(resolution, "resolution");
            AbstractC4862t.e(dynamicRange, "dynamicRange");
            C0081a c0081a = new C0081a(resolution, s1Var.getInputFormat());
            Class clsB = c.Companion.c(s1Var).b();
            if (clsB != null) {
                c0081a.p(clsB);
            }
            a1.b bVarM = a1.b.q(s1Var, resolution).m(c0081a, dynamicRange);
            AbstractC4862t.d(bVarM, "addSurface(...)");
            return bVarM;
        }
    }

    static a1.b a(s1 s1Var, Size size, J j10) {
        return f4783a.a(s1Var, size, j10);
    }

    boolean b(a1 a1Var);
}
