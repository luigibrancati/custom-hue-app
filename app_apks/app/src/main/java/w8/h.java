package w8;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class h implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f46347g = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f46348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f46351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f46352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f46353f = new byte[16];

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f46354a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f46355b;

        public a(StringBuilder sb2) {
            this.f46355b = sb2;
        }

        @Override // w8.h.d
        public void a(InputStream inputStream, int i10) {
            if (this.f46354a) {
                this.f46354a = false;
            } else {
                this.f46355b.append(", ");
            }
            this.f46355b.append(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f46357c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46359b;

        public b(int i10, int i11) {
            this.f46358a = i10;
            this.f46359b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f46358a + ", length = " + this.f46359b + "]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class c extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f46361b;

        public /* synthetic */ c(h hVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            h.o(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f46361b;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            h.this.H(this.f46360a, bArr, i10, i11);
            this.f46360a = h.this.a0(this.f46360a + i11);
            this.f46361b -= i11;
            return i11;
        }

        public c(b bVar) {
            this.f46360a = h.this.a0(bVar.f46358a + 4);
            this.f46361b = bVar.f46359b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f46361b == 0) {
                return -1;
            }
            h.this.f46348a.seek(this.f46360a);
            int i10 = h.this.f46348a.read();
            this.f46360a = h.this.a0(this.f46360a + 1);
            this.f46361b--;
            return i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        void a(InputStream inputStream, int i10);
    }

    public h(File file) throws IOException {
        if (!file.exists()) {
            k(file);
        }
        this.f46348a = q(file);
        C();
    }

    public static int D(byte[] bArr, int i10) {
        return ((bArr[i10] & ForkServer.ERROR) << 24) + ((bArr[i10 + 1] & ForkServer.ERROR) << 16) + ((bArr[i10 + 2] & ForkServer.ERROR) << 8) + (bArr[i10 + 3] & ForkServer.ERROR);
    }

    public static void k(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileQ = q(file2);
        try {
            randomAccessFileQ.setLength(4096L);
            randomAccessFileQ.seek(0L);
            byte[] bArr = new byte[16];
            p0(bArr, RecognitionOptions.AZTEC, 0, 0, 0);
            randomAccessFileQ.write(bArr);
            randomAccessFileQ.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFileQ.close();
            throw th;
        }
    }

    public static void k0(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public static Object o(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static void p0(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            k0(bArr, i10, i11);
            i10 += 4;
        }
    }

    public static RandomAccessFile q(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    public final void C() throws IOException {
        this.f46348a.seek(0L);
        this.f46348a.readFully(this.f46353f);
        int iD = D(this.f46353f, 0);
        this.f46349b = iD;
        if (iD <= this.f46348a.length()) {
            this.f46350c = D(this.f46353f, 4);
            int iD2 = D(this.f46353f, 8);
            int iD3 = D(this.f46353f, 12);
            this.f46351d = u(iD2);
            this.f46352e = u(iD3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f46349b + ", Actual length: " + this.f46348a.length());
    }

    public final int F() {
        return this.f46349b - Y();
    }

    public synchronized void G() {
        try {
            if (m()) {
                throw new NoSuchElementException();
            }
            if (this.f46350c == 1) {
                h();
            } else {
                b bVar = this.f46351d;
                int iA0 = a0(bVar.f46358a + 4 + bVar.f46359b);
                H(iA0, this.f46353f, 0, 4);
                int iD = D(this.f46353f, 0);
                g0(this.f46349b, this.f46350c - 1, iA0, this.f46352e.f46358a);
                this.f46350c--;
                this.f46351d = new b(iA0, iD);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void H(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iA0 = a0(i10);
        int i13 = iA0 + i12;
        int i14 = this.f46349b;
        if (i13 <= i14) {
            this.f46348a.seek(iA0);
            this.f46348a.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iA0;
        this.f46348a.seek(iA0);
        this.f46348a.readFully(bArr, i11, i15);
        this.f46348a.seek(16L);
        this.f46348a.readFully(bArr, i11 + i15, i12 - i15);
    }

    public final void K(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iA0 = a0(i10);
        int i13 = iA0 + i12;
        int i14 = this.f46349b;
        if (i13 <= i14) {
            this.f46348a.seek(iA0);
            this.f46348a.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iA0;
        this.f46348a.seek(iA0);
        this.f46348a.write(bArr, i11, i15);
        this.f46348a.seek(16L);
        this.f46348a.write(bArr, i11 + i15, i12 - i15);
    }

    public final void S(int i10) throws IOException {
        this.f46348a.setLength(i10);
        this.f46348a.getChannel().force(true);
    }

    public int Y() {
        if (this.f46350c == 0) {
            return 16;
        }
        b bVar = this.f46352e;
        int i10 = bVar.f46358a;
        int i11 = this.f46351d.f46358a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f46359b + 16 : (((i10 + 4) + bVar.f46359b) + this.f46349b) - i11;
    }

    public final int a0(int i10) {
        int i11 = this.f46349b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f46348a.close();
    }

    public void f(byte[] bArr) {
        g(bArr, 0, bArr.length);
    }

    public synchronized void g(byte[] bArr, int i10, int i11) {
        int iA0;
        try {
            o(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            i(i11);
            boolean zM = m();
            if (zM) {
                iA0 = 16;
            } else {
                b bVar = this.f46352e;
                iA0 = a0(bVar.f46358a + 4 + bVar.f46359b);
            }
            b bVar2 = new b(iA0, i11);
            k0(this.f46353f, 0, i11);
            K(bVar2.f46358a, this.f46353f, 0, 4);
            K(bVar2.f46358a + 4, bArr, i10, i11);
            g0(this.f46349b, this.f46350c + 1, zM ? bVar2.f46358a : this.f46351d.f46358a, bVar2.f46358a);
            this.f46352e = bVar2;
            this.f46350c++;
            if (zM) {
                this.f46351d = bVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void g0(int i10, int i11, int i12, int i13) throws IOException {
        p0(this.f46353f, i10, i11, i12, i13);
        this.f46348a.seek(0L);
        this.f46348a.write(this.f46353f);
    }

    public synchronized void h() {
        try {
            g0(RecognitionOptions.AZTEC, 0, 0, 0);
            this.f46350c = 0;
            b bVar = b.f46357c;
            this.f46351d = bVar;
            this.f46352e = bVar;
            if (this.f46349b > 4096) {
                S(RecognitionOptions.AZTEC);
            }
            this.f46349b = RecognitionOptions.AZTEC;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void i(int i10) throws IOException {
        int i11 = i10 + 4;
        int iF = F();
        if (iF >= i11) {
            return;
        }
        int i12 = this.f46349b;
        do {
            iF += i12;
            i12 <<= 1;
        } while (iF < i11);
        S(i12);
        b bVar = this.f46352e;
        int iA0 = a0(bVar.f46358a + 4 + bVar.f46359b);
        if (iA0 < this.f46351d.f46358a) {
            FileChannel channel = this.f46348a.getChannel();
            channel.position(this.f46349b);
            long j10 = iA0 - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f46352e.f46358a;
        int i14 = this.f46351d.f46358a;
        if (i13 < i14) {
            int i15 = (this.f46349b + i13) - 16;
            g0(i12, this.f46350c, i14, i15);
            this.f46352e = new b(i15, this.f46352e.f46359b);
        } else {
            g0(i12, this.f46350c, i14, i13);
        }
        this.f46349b = i12;
    }

    public synchronized void j(d dVar) {
        int iA0 = this.f46351d.f46358a;
        for (int i10 = 0; i10 < this.f46350c; i10++) {
            b bVarU = u(iA0);
            dVar.a(new c(this, bVarU, null), bVarU.f46359b);
            iA0 = a0(bVarU.f46358a + 4 + bVarU.f46359b);
        }
    }

    public synchronized boolean m() {
        return this.f46350c == 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f46349b);
        sb2.append(", size=");
        sb2.append(this.f46350c);
        sb2.append(", first=");
        sb2.append(this.f46351d);
        sb2.append(", last=");
        sb2.append(this.f46352e);
        sb2.append(", element lengths=[");
        try {
            j(new a(sb2));
        } catch (IOException e10) {
            f46347g.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final b u(int i10) throws IOException {
        if (i10 == 0) {
            return b.f46357c;
        }
        this.f46348a.seek(i10);
        return new b(i10, this.f46348a.readInt());
    }
}
