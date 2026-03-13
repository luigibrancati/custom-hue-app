package hd;

import kotlin.jvm.internal.AbstractC4862t;
import md.i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    public static final Object a(i.d dVar, i.f extension) {
        AbstractC4862t.e(dVar, "<this>");
        AbstractC4862t.e(extension, "extension");
        if (dVar.r(extension)) {
            return dVar.o(extension);
        }
        return null;
    }

    public static final Object b(i.d dVar, i.f extension, int i10) {
        AbstractC4862t.e(dVar, "<this>");
        AbstractC4862t.e(extension, "extension");
        if (i10 < dVar.q(extension)) {
            return dVar.p(extension, i10);
        }
        return null;
    }
}
