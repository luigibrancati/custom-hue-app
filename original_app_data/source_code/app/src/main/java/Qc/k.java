package Qc;

import Lc.G;
import dd.C3901f;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import yd.C6478k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14272c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6478k f14273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Qc.a f14274b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final k a(ClassLoader classLoader) {
            AbstractC4862t.e(classLoader, "classLoader");
            g gVar = new g(classLoader);
            C3901f.a aVar = C3901f.f33418b;
            ClassLoader classLoader2 = C4015H.class.getClassLoader();
            AbstractC4862t.d(classLoader2, "Unit::class.java.classLoader");
            C3901f.a.C0412a c0412aA = aVar.a(gVar, new g(classLoader2), new d(classLoader), "runtime module for " + classLoader, j.f14271b, l.f14275a);
            return new k(c0412aA.a().a(), new Qc.a(c0412aA.b(), gVar), null);
        }

        public a() {
        }
    }

    public /* synthetic */ k(C6478k c6478k, Qc.a aVar, AbstractC4854k abstractC4854k) {
        this(c6478k, aVar);
    }

    public final C6478k a() {
        return this.f14273a;
    }

    public final G b() {
        return this.f14273a.p();
    }

    public final Qc.a c() {
        return this.f14274b;
    }

    public k(C6478k c6478k, Qc.a aVar) {
        this.f14273a = c6478k;
        this.f14274b = aVar;
    }
}
