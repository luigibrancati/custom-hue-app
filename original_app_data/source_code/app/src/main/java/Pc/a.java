package Pc;

import Lc.m0;
import Lc.n0;
import io.sentry.protocol.SentryStackFrame;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13291c = new a();

    public a() {
        super(SentryStackFrame.JsonKeys.PACKAGE, false);
    }

    @Override // Lc.n0
    public Integer a(n0 visibility) {
        AbstractC4862t.e(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        return m0.f8756a.b(visibility) ? 1 : -1;
    }

    @Override // Lc.n0
    public String b() {
        return "public/*package*/";
    }

    @Override // Lc.n0
    public n0 d() {
        return m0.g.f8765c;
    }
}
