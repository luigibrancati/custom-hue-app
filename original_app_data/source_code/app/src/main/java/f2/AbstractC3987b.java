package f2;

import G1.AbstractC0853a;
import android.os.SystemClock;
import e2.m;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: f2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3987b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f34123a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f34124b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f34125c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f34126d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f34127e = "time.android.com";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f34128f = 1000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static long f34129g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static long f34130h = -9223372036854775807L;

    /* JADX INFO: renamed from: f2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0439b {
        void a(IOException iOException);

        void b();
    }

    public static void h(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b11));
        }
        if (i10 != 0 && i10 <= 15) {
            if (j10 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i10);
        }
    }

    public static long i() {
        long j10;
        synchronized (f34124b) {
            try {
                j10 = f34125c ? f34126d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j10;
    }

    public static String j() {
        String str;
        synchronized (f34124b) {
            str = f34127e;
        }
        return str;
    }

    public static int k() {
        int i10;
        synchronized (f34124b) {
            i10 = f34128f;
        }
        return i10;
    }

    public static void l(m mVar, InterfaceC0439b interfaceC0439b) {
        if (m()) {
            if (interfaceC0439b != null) {
                interfaceC0439b.b();
            }
        } else {
            if (mVar == null) {
                mVar = new m("SntpClient");
            }
            mVar.n(new d(), new c(interfaceC0439b), 1);
        }
    }

    public static boolean m() {
        boolean z10;
        synchronized (f34124b) {
            try {
                if (f34130h != -9223372036854775807L && f34129g != -9223372036854775807L) {
                    f34125c = f34125c && SystemClock.elapsedRealtime() - f34130h < f34129g;
                }
                z10 = f34125c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public static long n() {
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(k());
            InetAddress[] allByName = InetAddress.getAllByName(j());
            int length = allByName.length;
            SocketTimeoutException socketTimeoutException = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i10], 123);
                bArr[0] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                q(bArr, 40, jCurrentTimeMillis);
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j10 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
                    byte b10 = bArr[0];
                    int i12 = bArr[1] & ForkServer.ERROR;
                    long jP = p(bArr, 24);
                    long jP2 = p(bArr, 32);
                    long jP3 = p(bArr, 40);
                    h((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i12, jP3);
                    long j11 = (j10 + (((jP2 - jP) + (jP3 - j10)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j11;
                } catch (SocketTimeoutException e10) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException = e10;
                    } else {
                        socketTimeoutException.addSuppressed(e10);
                    }
                    int i13 = i11 + 1;
                    if (i11 >= 10) {
                        throw ((SocketTimeoutException) AbstractC0853a.e(socketTimeoutException));
                    }
                    i10++;
                    i11 = i13;
                }
            }
            throw ((SocketTimeoutException) AbstractC0853a.e(socketTimeoutException));
        } finally {
        }
    }

    public static long o(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }

    public static long p(byte[] bArr, int i10) {
        long jO = o(bArr, i10);
        long jO2 = o(bArr, i10 + 4);
        if (jO == 0 && jO2 == 0) {
            return 0L;
        }
        return ((jO - 2208988800L) * 1000) + ((jO2 * 1000) / 4294967296L);
    }

    public static void q(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        bArr[i10] = (byte) (r2 >> 24);
        bArr[i10 + 1] = (byte) (r2 >> 16);
        bArr[i10 + 2] = (byte) (r2 >> 8);
        bArr[i10 + 3] = (byte) (j11 + 2208988800L);
        long j13 = (j12 * 4294967296L) / 1000;
        bArr[i10 + 4] = (byte) (j13 >> 24);
        bArr[i10 + 5] = (byte) (j13 >> 16);
        bArr[i10 + 6] = (byte) (j13 >> 8);
        bArr[i10 + 7] = (byte) (Math.random() * 255.0d);
    }

    /* JADX INFO: renamed from: f2.b$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements m.e {
        public d() {
        }

        @Override // e2.m.e
        public void load() {
            synchronized (AbstractC3987b.f34123a) {
                synchronized (AbstractC3987b.f34124b) {
                    if (AbstractC3987b.f34125c) {
                        return;
                    }
                    long jN = AbstractC3987b.n();
                    synchronized (AbstractC3987b.f34124b) {
                        long unused = AbstractC3987b.f34130h = SystemClock.elapsedRealtime();
                        long unused2 = AbstractC3987b.f34126d = jN;
                        boolean unused3 = AbstractC3987b.f34125c = true;
                    }
                }
            }
        }

        @Override // e2.m.e
        public void b() {
        }
    }

    /* JADX INFO: renamed from: f2.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements m.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0439b f34131a;

        public c(InterfaceC0439b interfaceC0439b) {
            this.f34131a = interfaceC0439b;
        }

        @Override // e2.m.b
        public m.c o(m.e eVar, long j10, long j11, IOException iOException, int i10) {
            InterfaceC0439b interfaceC0439b = this.f34131a;
            if (interfaceC0439b != null) {
                interfaceC0439b.a(iOException);
            }
            return m.f33634f;
        }

        @Override // e2.m.b
        public void w(m.e eVar, long j10, long j11) {
            if (this.f34131a != null) {
                if (AbstractC3987b.m()) {
                    this.f34131a.b();
                } else {
                    this.f34131a.a(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // e2.m.b
        public void t(m.e eVar, long j10, long j11, boolean z10) {
        }
    }
}
