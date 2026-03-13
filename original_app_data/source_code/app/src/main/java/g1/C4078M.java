package g1;

import gc.C4205s;
import h1.C4267a;
import h1.C4268b;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: g1.M, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4078M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4078M f34858a = new C4078M();

    public static final InterfaceC4069D c(Rd.M m10, File it) {
        AbstractC4862t.e(it, "it");
        return new C4076K(m10.getCoroutineContext(), it);
    }

    public final InterfaceC4099i b(InterfaceC4087W serializer, C4268b c4268b, List migrations, final Rd.M scope, InterfaceC6082a produceFile) {
        AbstractC4862t.e(serializer, "serializer");
        AbstractC4862t.e(migrations, "migrations");
        AbstractC4862t.e(scope, "scope");
        AbstractC4862t.e(produceFile, "produceFile");
        C4114x c4114x = new C4114x(serializer, new vc.l() { // from class: g1.L
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C4078M.c(scope, (File) obj);
            }
        }, produceFile);
        List listD = C4205s.d(C4098h.f34919a.b(migrations));
        InterfaceC4095e c4267a = c4268b;
        if (c4268b == null) {
            c4267a = new C4267a();
        }
        return new C4105o(c4114x, listD, c4267a, scope);
    }
}
