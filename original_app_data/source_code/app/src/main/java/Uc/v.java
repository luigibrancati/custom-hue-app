package Uc;

import Uc.w;
import fc.AbstractC4040w;
import fc.C4026i;
import fc.C4034q;
import gc.Q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kd.c f16944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kd.c f16945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kd.c f16946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f16947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kd.c[] f16948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D f16949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w f16950g;

    static {
        kd.c cVar = new kd.c("org.jspecify.nullness");
        f16944a = cVar;
        kd.c cVar2 = new kd.c("io.reactivex.rxjava3.annotations");
        f16945b = cVar2;
        kd.c cVar3 = new kd.c("org.checkerframework.checker.nullness.compatqual");
        f16946c = cVar3;
        String strB = cVar2.b();
        AbstractC4862t.d(strB, "RXJAVA3_ANNOTATIONS_PACKAGE.asString()");
        f16947d = strB;
        f16948e = new kd.c[]{new kd.c(strB + ".Nullable"), new kd.c(strB + ".NonNull")};
        kd.c cVar4 = new kd.c("org.jetbrains.annotations");
        w.a aVar = w.f16951d;
        C4034q c4034qA = AbstractC4040w.a(cVar4, aVar.a());
        C4034q c4034qA2 = AbstractC4040w.a(new kd.c("androidx.annotation"), aVar.a());
        C4034q c4034qA3 = AbstractC4040w.a(new kd.c("android.support.annotation"), aVar.a());
        C4034q c4034qA4 = AbstractC4040w.a(new kd.c("android.annotation"), aVar.a());
        C4034q c4034qA5 = AbstractC4040w.a(new kd.c("com.android.annotations"), aVar.a());
        C4034q c4034qA6 = AbstractC4040w.a(new kd.c("org.eclipse.jdt.annotation"), aVar.a());
        C4034q c4034qA7 = AbstractC4040w.a(new kd.c("org.checkerframework.checker.nullness.qual"), aVar.a());
        C4034q c4034qA8 = AbstractC4040w.a(cVar3, aVar.a());
        C4034q c4034qA9 = AbstractC4040w.a(new kd.c("javax.annotation"), aVar.a());
        C4034q c4034qA10 = AbstractC4040w.a(new kd.c("edu.umd.cs.findbugs.annotations"), aVar.a());
        C4034q c4034qA11 = AbstractC4040w.a(new kd.c("io.reactivex.annotations"), aVar.a());
        kd.c cVar5 = new kd.c("androidx.annotation.RecentlyNullable");
        G g10 = G.WARN;
        C4034q c4034qA12 = AbstractC4040w.a(cVar5, new w(g10, null, null, 4, null));
        C4034q c4034qA13 = AbstractC4040w.a(new kd.c("androidx.annotation.RecentlyNonNull"), new w(g10, null, null, 4, null));
        C4034q c4034qA14 = AbstractC4040w.a(new kd.c("lombok"), aVar.a());
        C4026i c4026i = new C4026i(1, 9);
        G g11 = G.STRICT;
        f16949f = new E(Q.l(c4034qA, c4034qA2, c4034qA3, c4034qA4, c4034qA5, c4034qA6, c4034qA7, c4034qA8, c4034qA9, c4034qA10, c4034qA11, c4034qA12, c4034qA13, c4034qA14, AbstractC4040w.a(cVar, new w(g10, c4026i, g11)), AbstractC4040w.a(cVar2, new w(g10, new C4026i(1, 8), g11))));
        f16950g = new w(g10, null, null, 4, null);
    }

    public static final z a(C4026i configuredKotlinVersion) {
        AbstractC4862t.e(configuredKotlinVersion, "configuredKotlinVersion");
        w wVar = f16950g;
        G gC = (wVar.d() == null || wVar.d().compareTo(configuredKotlinVersion) > 0) ? wVar.c() : wVar.b();
        return new z(gC, c(gC), null, 4, null);
    }

    public static /* synthetic */ z b(C4026i c4026i, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4026i = C4026i.f34265f;
        }
        return a(c4026i);
    }

    public static final G c(G globalReportLevel) {
        AbstractC4862t.e(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == G.WARN) {
            return null;
        }
        return globalReportLevel;
    }

    public static final G d(kd.c annotationFqName) {
        AbstractC4862t.e(annotationFqName, "annotationFqName");
        return h(annotationFqName, D.f16876a.a(), null, 4, null);
    }

    public static final kd.c e() {
        return f16944a;
    }

    public static final kd.c[] f() {
        return f16948e;
    }

    public static final G g(kd.c annotation, D configuredReportLevels, C4026i configuredKotlinVersion) {
        AbstractC4862t.e(annotation, "annotation");
        AbstractC4862t.e(configuredReportLevels, "configuredReportLevels");
        AbstractC4862t.e(configuredKotlinVersion, "configuredKotlinVersion");
        G g10 = (G) configuredReportLevels.a(annotation);
        if (g10 != null) {
            return g10;
        }
        w wVar = (w) f16949f.a(annotation);
        return wVar == null ? G.IGNORE : (wVar.d() == null || wVar.d().compareTo(configuredKotlinVersion) > 0) ? wVar.c() : wVar.b();
    }

    public static /* synthetic */ G h(kd.c cVar, D d10, C4026i c4026i, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            c4026i = new C4026i(1, 7, 20);
        }
        return g(cVar, d10, c4026i);
    }
}
