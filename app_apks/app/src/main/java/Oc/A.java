package Oc;

import Lc.P;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12152a = a.f12153a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f12153a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lc.F f12154b = new Lc.F("PackageViewDescriptorFactory");

        public final Lc.F a() {
            return f12154b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f12155b = new b();

        @Override // Oc.A
        public P a(x module, kd.c fqName, Bd.n storageManager) {
            AbstractC4862t.e(module, "module");
            AbstractC4862t.e(fqName, "fqName");
            AbstractC4862t.e(storageManager, "storageManager");
            return new r(module, fqName, storageManager);
        }
    }

    P a(x xVar, kd.c cVar, Bd.n nVar);
}
