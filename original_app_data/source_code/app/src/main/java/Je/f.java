package Je;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char f6497a = File.separatorChar;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f6498b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f6499c = System.lineSeparator();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f6500d = g.LF.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f6501e = g.CRLF.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f6502f = ThreadLocal.withInitial(new Supplier() { // from class: Je.d
        @Override // java.util.function.Supplier
        public final Object get() {
            return f.d();
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f6503g = d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ThreadLocal f6504h = ThreadLocal.withInitial(new Supplier() { // from class: Je.e
        @Override // java.util.function.Supplier
        public final Object get() {
            return f.f();
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final char[] f6505i = f();

    @Deprecated
    public f() {
    }

    public static /* synthetic */ void b(Oe.d dVar) {
        throw new IllegalArgumentException(String.format("Cannot read more than %,d into a byte array", Integer.MAX_VALUE));
    }

    public static byte[] d() {
        return e(8192);
    }

    public static byte[] e(int i10) {
        return new byte[i10];
    }

    public static char[] f() {
        return g(8192);
    }

    public static char[] g(int i10) {
        return new char[i10];
    }

    public static void h(Closeable closeable) {
        j(closeable, null);
    }

    public static void i(Closeable closeable) {
        j(closeable, null);
    }

    public static void j(Closeable closeable, Consumer consumer) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e10) {
                if (consumer != null) {
                    consumer.accept(e10);
                }
            }
        }
    }

    public static void k(InputStream inputStream) {
        h(inputStream);
    }

    public static void l(OutputStream outputStream) {
        h(outputStream);
    }

    public static void m(Reader reader) {
        h(reader);
    }

    public static int n(InputStream inputStream, OutputStream outputStream) {
        long jP = p(inputStream, outputStream);
        if (jP > 2147483647L) {
            return -1;
        }
        return (int) jP;
    }

    public static long o(InputStream inputStream, OutputStream outputStream, int i10) {
        return q(inputStream, outputStream, e(i10));
    }

    public static long p(InputStream inputStream, OutputStream outputStream) {
        return o(inputStream, outputStream, 8192);
    }

    public static long q(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        Objects.requireNonNull(inputStream, "inputStream");
        Objects.requireNonNull(outputStream, "outputStream");
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (-1 == i10) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static int r(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public static byte[] s(InputStream inputStream) {
        final Oe.e eVarK = Oe.e.i().k();
        try {
            Oe.d dVar = new Oe.d(Integer.MAX_VALUE, new Me.c() { // from class: Je.b
                @Override // Me.c
                public final void accept(Object obj) {
                    f.b((Oe.d) obj);
                }
            }, new Me.d() { // from class: Je.c
                @Override // Me.d
                public final Object apply(Object obj) {
                    return f.a(eVarK, (Oe.d) obj);
                }
            });
            try {
                n(inputStream, dVar);
                byte[] bArrB = eVarK.b();
                dVar.close();
                eVarK.close();
                return bArrB;
            } finally {
            }
        } catch (Throwable th) {
            if (eVarK != null) {
                try {
                    eVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static /* synthetic */ OutputStream a(Oe.e eVar, Oe.d dVar) {
        return eVar;
    }
}
