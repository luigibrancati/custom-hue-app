package K;

import E.C0781c0;
import E.C0785e0;
import android.net.Uri;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: K.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0978u {
    public static Uri a(File file, C0781c0.g gVar) {
        throw null;
    }

    public static File b(C0781c0.g gVar) {
        throw null;
    }

    public static boolean c(C0781c0.g gVar) {
        throw null;
    }

    public static boolean d(C0781c0.g gVar) {
        throw null;
    }

    public static boolean e(C0781c0.g gVar) {
        throw null;
    }

    public static Uri f(File file, C0781c0.g gVar) {
        Uri uriA = null;
        try {
            try {
                if (d(gVar)) {
                    uriA = a(file, gVar);
                } else if (e(gVar) || c(gVar)) {
                    throw null;
                }
                file.delete();
                return uriA;
            } catch (IOException unused) {
                throw new C0785e0(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th) {
            file.delete();
            throw th;
        }
    }

    public static void g(File file, M.f fVar, C0781c0.g gVar, int i10) {
        try {
            M.f fVarE = M.f.e(file);
            fVar.d(fVarE);
            if (fVarE.n() == 0 && i10 != 0) {
                fVarE.u(i10);
            }
            throw null;
        } catch (IOException e10) {
            throw new C0785e0(1, "Failed to update Exif data", e10);
        }
    }
}
