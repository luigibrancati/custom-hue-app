package Qc;

import Lc.a0;
import Lc.b0;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Annotation f14262b;

    public b(Annotation annotation) {
        AbstractC4862t.e(annotation, "annotation");
        this.f14262b = annotation;
    }

    @Override // Lc.a0
    public b0 b() {
        b0 NO_SOURCE_FILE = b0.f8747a;
        AbstractC4862t.d(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public final Annotation d() {
        return this.f14262b;
    }
}
