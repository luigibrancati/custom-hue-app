package k1;

import Rd.M;
import g1.C4100j;
import g1.C4114x;
import g1.InterfaceC4099i;
import g1.c0;
import h1.C4268b;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: k1.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4784g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4784g f39197a = new C4784g();

    public static final File d(InterfaceC6082a interfaceC6082a) {
        File file = (File) interfaceC6082a.invoke();
        if (AbstractC4862t.a(sc.l.o(file), "preferences_pb")) {
            File absoluteFile = file.getAbsoluteFile();
            AbstractC4862t.d(absoluteFile, "getAbsoluteFile(...)");
            return absoluteFile;
        }
        throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
    }

    public final InterfaceC4099i b(c0 storage, C4268b c4268b, List migrations, M scope) {
        AbstractC4862t.e(storage, "storage");
        AbstractC4862t.e(migrations, "migrations");
        AbstractC4862t.e(scope, "scope");
        return new C4782e(C4100j.f34942a.b(storage, c4268b, migrations, scope));
    }

    public final InterfaceC4099i c(C4268b c4268b, List migrations, M scope, final InterfaceC6082a produceFile) {
        AbstractC4862t.e(migrations, "migrations");
        AbstractC4862t.e(scope, "scope");
        AbstractC4862t.e(produceFile, "produceFile");
        return new C4782e(b(new C4114x(C4787j.f39199a, null, new InterfaceC6082a() { // from class: k1.f
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C4784g.d(produceFile);
            }
        }, 2, null), c4268b, migrations, scope));
    }
}
