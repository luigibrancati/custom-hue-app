package Pc;

import Lc.m0;
import Lc.n0;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f13292c = new b();

    public b() {
        super("protected_and_package", true);
    }

    @Override // Lc.n0
    public Integer a(n0 visibility) {
        AbstractC4862t.e(visibility, "visibility");
        if (AbstractC4862t.a(this, visibility)) {
            return 0;
        }
        if (visibility == m0.b.f8760c) {
            return null;
        }
        return m0.f8756a.b(visibility) ? 1 : -1;
    }

    @Override // Lc.n0
    public String b() {
        return "protected/*protected and package*/";
    }

    @Override // Lc.n0
    public n0 d() {
        return m0.g.f8765c;
    }
}
