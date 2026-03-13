package ue;

import fc.C4022e;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4862t;
import ue.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class t implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f45704a;

    public t(r routePlanner) {
        AbstractC4862t.e(routePlanner, "routePlanner");
        this.f45704a = routePlanner;
    }

    @Override // ue.f
    public l a() throws Throwable {
        r.b bVarD;
        IOException iOException = null;
        while (!b().c()) {
            try {
                bVarD = b().d();
            } catch (IOException e10) {
                if (iOException == null) {
                    iOException = e10;
                } else {
                    C4022e.a(iOException, e10);
                }
                if (!r.f(b(), null, 1, null)) {
                    throw iOException;
                }
            }
            if (!bVarD.isReady()) {
                r.a aVarG = bVarD.g();
                if (aVarG.f()) {
                    aVarG = bVarD.d();
                }
                r.b bVarA = aVarG.a();
                Throwable thB = aVarG.b();
                if (thB != null) {
                    throw thB;
                }
                if (bVarA != null) {
                    b().b().addFirst(bVarA);
                }
            }
            return bVarD.a();
        }
        throw new IOException("Canceled");
    }

    @Override // ue.f
    public r b() {
        return this.f45704a;
    }
}
