package md;

import java.io.IOException;
import java.io.InputStream;
import md.AbstractC5047a;

/* JADX INFO: renamed from: md.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5048b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5053g f40288a = C5053g.c();

    public final p d(p pVar) throws k {
        if (pVar == null || pVar.isInitialized()) {
            return pVar;
        }
        throw e(pVar).a().i(pVar);
    }

    public final v e(p pVar) {
        return pVar instanceof AbstractC5047a ? ((AbstractC5047a) pVar).b() : new v(pVar);
    }

    @Override // md.r
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p a(InputStream inputStream, C5053g c5053g) {
        return d(h(inputStream, c5053g));
    }

    @Override // md.r
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public p b(InputStream inputStream, C5053g c5053g) {
        return d(i(inputStream, c5053g));
    }

    public p h(InputStream inputStream, C5053g c5053g) throws k {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return i(new AbstractC5047a.AbstractC0530a.C0531a(inputStream, C5051e.A(i10, inputStream)), c5053g);
        } catch (IOException e10) {
            throw new k(e10.getMessage());
        }
    }

    public p i(InputStream inputStream, C5053g c5053g) throws k {
        C5051e c5051eG = C5051e.g(inputStream);
        p pVar = (p) c(c5051eG, c5053g);
        try {
            c5051eG.a(0);
            return pVar;
        } catch (k e10) {
            throw e10.i(pVar);
        }
    }
}
