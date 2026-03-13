package lc;

import fc.C4015H;
import fc.C4035r;
import kotlin.jvm.internal.AbstractC4862t;
import mc.C5045b;
import vc.p;

/* JADX INFO: renamed from: lc.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4990g {
    public static final void a(p pVar, Object obj, InterfaceC4988e completion) {
        AbstractC4862t.e(pVar, "<this>");
        AbstractC4862t.e(completion, "completion");
        C5045b.c(C5045b.a(pVar, obj, completion)).resumeWith(C4035r.b(C4015H.f34254a));
    }
}
