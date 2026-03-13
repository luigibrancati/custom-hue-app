package u8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Q {
    public static void a(InputStream inputStream, File file) throws Throwable {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i10 = inputStream.read(bArr);
                    if (i10 <= 0) {
                        gZIPOutputStream2.finish();
                        C5992i.g(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i10);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    C5992i.g(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void b(File file, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            P p10 = (P) it.next();
            InputStream inputStreamH = null;
            try {
                inputStreamH = p10.h();
                if (inputStreamH != null) {
                    a(inputStreamH, new File(file, p10.b()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                C5992i.g(null);
                throw th;
            }
            C5992i.g(inputStreamH);
        }
    }
}
