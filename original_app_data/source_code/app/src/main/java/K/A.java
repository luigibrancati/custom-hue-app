package K;

import E.C0781c0;
import E.C0785e0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class A implements U.y {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {
        public abstract C0781c0.g a();

        public abstract U.z b();
    }

    public static void b(File file, byte[] bArr) throws C0785e0 {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new S.c().b(bArr));
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e10) {
            throw new C0785e0(1, "Failed to write to temp file", e10);
        }
    }

    @Override // U.y
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0781c0.h apply(a aVar) throws C0785e0 {
        U.z zVarB = aVar.b();
        aVar.a();
        File fileB = AbstractC0978u.b(null);
        b(fileB, (byte[]) zVarB.c());
        M.f fVarD = zVarB.d();
        Objects.requireNonNull(fVarD);
        AbstractC0978u.g(fileB, fVarD, null, zVarB.f());
        return new C0781c0.h(AbstractC0978u.f(fileB, null), 256);
    }
}
