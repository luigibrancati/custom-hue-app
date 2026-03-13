package hd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i {
    public static final boolean a(AbstractC4297a version) {
        AbstractC4862t.e(version, "version");
        return version.a() == 1 && version.b() >= 4;
    }

    public static final boolean b(AbstractC4297a version) {
        AbstractC4862t.e(version, "version");
        return a(version);
    }
}
