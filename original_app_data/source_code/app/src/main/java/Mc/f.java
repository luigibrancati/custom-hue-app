package Mc;

import Cd.E;
import Cd.M;
import Cd.u0;
import Ic.j;
import Lc.G;
import fc.AbstractC4040w;
import fc.C4034q;
import gc.C4206t;
import gc.Q;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import qd.C5515a;
import qd.C5516b;
import qd.u;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kd.f f9429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kd.f f9430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kd.f f9431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kd.f f9432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kd.f f9433e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ic.g f9434a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ic.g gVar) {
            super(1);
            this.f9434a = gVar;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(G module) {
            AbstractC4862t.e(module, "module");
            M mL = module.n().l(u0.INVARIANT, this.f9434a.W());
            AbstractC4862t.d(mL, "module.builtIns.getArray…ce.INVARIANT, stringType)");
            return mL;
        }
    }

    static {
        kd.f fVarS = kd.f.s("message");
        AbstractC4862t.d(fVarS, "identifier(\"message\")");
        f9429a = fVarS;
        kd.f fVarS2 = kd.f.s("replaceWith");
        AbstractC4862t.d(fVarS2, "identifier(\"replaceWith\")");
        f9430b = fVarS2;
        kd.f fVarS3 = kd.f.s("level");
        AbstractC4862t.d(fVarS3, "identifier(\"level\")");
        f9431c = fVarS3;
        kd.f fVarS4 = kd.f.s("expression");
        AbstractC4862t.d(fVarS4, "identifier(\"expression\")");
        f9432d = fVarS4;
        kd.f fVarS5 = kd.f.s("imports");
        AbstractC4862t.d(fVarS5, "identifier(\"imports\")");
        f9433e = fVarS5;
    }

    public static final c a(Ic.g gVar, String message, String replaceWith, String level) {
        AbstractC4862t.e(gVar, "<this>");
        AbstractC4862t.e(message, "message");
        AbstractC4862t.e(replaceWith, "replaceWith");
        AbstractC4862t.e(level, "level");
        j jVar = new j(gVar, j.a.f5747B, Q.l(AbstractC4040w.a(f9432d, new u(replaceWith)), AbstractC4040w.a(f9433e, new C5516b(C4206t.k(), new a(gVar)))));
        kd.c cVar = j.a.f5829y;
        C4034q c4034qA = AbstractC4040w.a(f9429a, new u(message));
        C4034q c4034qA2 = AbstractC4040w.a(f9430b, new C5515a(jVar));
        kd.f fVar = f9431c;
        kd.b bVarM = kd.b.m(j.a.f5745A);
        AbstractC4862t.d(bVarM, "topLevel(StandardNames.FqNames.deprecationLevel)");
        kd.f fVarS = kd.f.s(level);
        AbstractC4862t.d(fVarS, "identifier(level)");
        return new j(gVar, cVar, Q.l(c4034qA, c4034qA2, AbstractC4040w.a(fVar, new qd.j(bVarM, fVarS))));
    }

    public static /* synthetic */ c b(Ic.g gVar, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            str3 = "WARNING";
        }
        return a(gVar, str, str2, str3);
    }
}
