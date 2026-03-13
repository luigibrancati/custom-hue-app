package gd;

import fc.AbstractC4040w;
import fc.C4034q;
import fd.m;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC4862t;
import md.C5053g;

/* JADX INFO: renamed from: gd.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4211c {
    public static final C4034q a(InputStream inputStream) throws IOException {
        m mVarR;
        AbstractC4862t.e(inputStream, "<this>");
        try {
            C4209a c4209aA = C4209a.f35616g.a(inputStream);
            if (c4209aA.h()) {
                C5053g c5053gD = C5053g.d();
                AbstractC4210b.a(c5053gD);
                mVarR = m.R(inputStream, c5053gD);
            } else {
                mVarR = null;
            }
            C4034q c4034qA = AbstractC4040w.a(mVarR, c4209aA);
            sc.c.a(inputStream, null);
            return c4034qA;
        } finally {
        }
    }
}
