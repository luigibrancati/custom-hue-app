package g1;

import gc.C4205s;
import h1.C4267a;
import h1.C4268b;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: g1.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4100j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4100j f34942a = new C4100j();

    public final InterfaceC4099i a(InterfaceC4087W serializer, C4268b c4268b, List migrations, Rd.M scope, InterfaceC6082a produceFile) {
        AbstractC4862t.e(serializer, "serializer");
        AbstractC4862t.e(migrations, "migrations");
        AbstractC4862t.e(scope, "scope");
        AbstractC4862t.e(produceFile, "produceFile");
        return b(new C4114x(serializer, null, produceFile, 2, null), c4268b, migrations, scope);
    }

    public final InterfaceC4099i b(c0 storage, C4268b c4268b, List migrations, Rd.M scope) {
        AbstractC4862t.e(storage, "storage");
        AbstractC4862t.e(migrations, "migrations");
        AbstractC4862t.e(scope, "scope");
        InterfaceC4095e c4267a = c4268b;
        if (c4268b == null) {
            c4267a = new C4267a();
        }
        return new C4105o(storage, C4205s.d(C4098h.f34919a.b(migrations)), c4267a, scope);
    }
}
