package u8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class K implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f45283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45285c;

    public K(String str, String str2, File file) {
        this.f45284b = str;
        this.f45285c = str2;
        this.f45283a = file;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte[] c() {
        /*
            r6 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1 = 0
            java.io.InputStream r6 = r6.h()     // Catch: java.io.IOException -> L60
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L21
            r2.<init>()     // Catch: java.lang.Throwable -> L21
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L23
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L23
            if (r6 != 0) goto L25
            r3.close()     // Catch: java.lang.Throwable -> L23
            r2.close()     // Catch: java.lang.Throwable -> L21
            if (r6 == 0) goto L20
            r6.close()     // Catch: java.io.IOException -> L60
        L20:
            return r1
        L21:
            r0 = move-exception
            goto L55
        L23:
            r0 = move-exception
            goto L4c
        L25:
            int r4 = r6.read(r0)     // Catch: java.lang.Throwable -> L30
            if (r4 <= 0) goto L32
            r5 = 0
            r3.write(r0, r5, r4)     // Catch: java.lang.Throwable -> L30
            goto L25
        L30:
            r0 = move-exception
            goto L43
        L32:
            r3.finish()     // Catch: java.lang.Throwable -> L30
            byte[] r0 = r2.toByteArray()     // Catch: java.lang.Throwable -> L30
            r3.close()     // Catch: java.lang.Throwable -> L23
            r2.close()     // Catch: java.lang.Throwable -> L21
            r6.close()     // Catch: java.io.IOException -> L60
            return r0
        L43:
            r3.close()     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Throwable -> L23
        L4b:
            throw r0     // Catch: java.lang.Throwable -> L23
        L4c:
            r2.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch: java.lang.Throwable -> L21
        L54:
            throw r0     // Catch: java.lang.Throwable -> L21
        L55:
            if (r6 == 0) goto L5f
            r6.close()     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r6 = move-exception
            r0.addSuppressed(r6)     // Catch: java.io.IOException -> L60
        L5f:
            throw r0     // Catch: java.io.IOException -> L60
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.K.c():byte[]");
    }

    @Override // u8.P
    public F.d.b a() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return F.d.b.a().b(bArrC).c(this.f45284b).a();
        }
        return null;
    }

    @Override // u8.P
    public String b() {
        return this.f45285c;
    }

    @Override // u8.P
    public InputStream h() {
        if (this.f45283a.exists() && this.f45283a.isFile()) {
            try {
                return new FileInputStream(this.f45283a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
