package androidx.media3.exoplayer.rtsp;

import G1.AbstractC0853a;
import K7.AbstractC1081v;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.media3.exoplayer.rtsp.g;
import e2.m;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f23797g = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f23798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2.m f23799b = new e2.m("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f23800c = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0304g f23801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Socket f23802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f23803f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void l(byte[] bArr);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f23805a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23806b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f23807c;

        public static byte[] d(byte b10, DataInputStream dataInputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {b10, dataInputStream.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] == 13 && bArr[1] == 10) {
                    return byteArrayOutputStream.toByteArray();
                }
                bArr[0] = bArr[1];
                byte b11 = dataInputStream.readByte();
                bArr[1] = b11;
                byteArrayOutputStream.write(b11);
            }
        }

        public final AbstractC1081v a(byte[] bArr) {
            AbstractC0853a.g(this.f23806b == 3);
            if (bArr.length <= 0 || bArr[bArr.length - 1] != 10) {
                throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
            }
            this.f23805a.add((bArr.length <= 1 || bArr[bArr.length + (-2)] != 13) ? new String(bArr, 0, bArr.length - 1, g.f23797g) : new String(bArr, 0, bArr.length - 2, g.f23797g));
            AbstractC1081v abstractC1081vV = AbstractC1081v.v(this.f23805a);
            e();
            return abstractC1081vV;
        }

        public final AbstractC1081v b(byte[] bArr) {
            AbstractC0853a.a(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, g.f23797g);
            this.f23805a.add(str);
            int i10 = this.f23806b;
            if (i10 == 1) {
                if (!h.f(str)) {
                    return null;
                }
                this.f23806b = 2;
                return null;
            }
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            long jG = h.g(str);
            if (jG != -1) {
                this.f23807c = jG;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f23807c > 0) {
                this.f23806b = 3;
                return null;
            }
            AbstractC1081v abstractC1081vV = AbstractC1081v.v(this.f23805a);
            e();
            return abstractC1081vV;
        }

        public AbstractC1081v c(byte b10, DataInputStream dataInputStream) throws IOException {
            AbstractC1081v abstractC1081vB = b(d(b10, dataInputStream));
            while (abstractC1081vB == null) {
                if (this.f23806b == 3) {
                    long j10 = this.f23807c;
                    if (j10 <= 0) {
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    int iE = N7.g.e(j10);
                    AbstractC0853a.g(iE != -1);
                    byte[] bArr = new byte[iE];
                    dataInputStream.readFully(bArr, 0, iE);
                    abstractC1081vB = a(bArr);
                } else {
                    abstractC1081vB = b(d(dataInputStream.readByte(), dataInputStream));
                }
            }
            return abstractC1081vB;
        }

        public final void e() {
            this.f23805a.clear();
            this.f23806b = 1;
            this.f23807c = 0L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class f implements m.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataInputStream f23808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f23809b = new e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f23810c;

        public f(InputStream inputStream) {
            this.f23808a = new DataInputStream(inputStream);
        }

        public final void a() throws IOException {
            int unsignedByte = this.f23808a.readUnsignedByte();
            int unsignedShort = this.f23808a.readUnsignedShort();
            byte[] bArr = new byte[unsignedShort];
            this.f23808a.readFully(bArr, 0, unsignedShort);
            b bVar = (b) g.this.f23800c.get(Integer.valueOf(unsignedByte));
            if (bVar == null || g.this.f23803f) {
                return;
            }
            bVar.l(bArr);
        }

        @Override // e2.m.e
        public void b() {
            this.f23810c = true;
        }

        public final void c(byte b10) {
            if (g.this.f23803f) {
                return;
            }
            g.this.f23798a.c(this.f23809b.c(b10, this.f23808a));
        }

        @Override // e2.m.e
        public void load() throws IOException {
            while (!this.f23810c) {
                byte b10 = this.f23808a.readByte();
                if (b10 == 36) {
                    a();
                } else {
                    c(b10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class C0304g implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputStream f23812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HandlerThread f23813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f23814c;

        public C0304g(OutputStream outputStream) {
            this.f23812a = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.f23813b = handlerThread;
            handlerThread.start();
            this.f23814c = new Handler(handlerThread.getLooper());
        }

        public static /* synthetic */ void a(C0304g c0304g, byte[] bArr, List list) {
            c0304g.getClass();
            try {
                c0304g.f23812a.write(bArr);
            } catch (Exception e10) {
                if (g.this.f23803f) {
                    return;
                }
                g.this.f23798a.b(list, e10);
            }
        }

        public void b(final List list) {
            final byte[] bArrB = h.b(list);
            this.f23814c.post(new Runnable() { // from class: W1.p
                @Override // java.lang.Runnable
                public final void run() {
                    g.C0304g.a(this.f17748a, bArrB, list);
                }
            });
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Handler handler = this.f23814c;
            final HandlerThread handlerThread = this.f23813b;
            Objects.requireNonNull(handlerThread);
            handler.post(new Runnable() { // from class: W1.o
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quit();
                }
            });
            try {
                this.f23813b.join();
            } catch (InterruptedException unused) {
                this.f23813b.interrupt();
            }
        }
    }

    public g(d dVar) {
        this.f23798a = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f23803f) {
            return;
        }
        try {
            C0304g c0304g = this.f23801d;
            if (c0304g != null) {
                c0304g.close();
            }
            this.f23799b.l();
            Socket socket = this.f23802e;
            if (socket != null) {
                socket.close();
            }
            this.f23803f = true;
        } catch (Throwable th) {
            this.f23803f = true;
            throw th;
        }
    }

    public void d(Socket socket) {
        this.f23802e = socket;
        this.f23801d = new C0304g(socket.getOutputStream());
        this.f23799b.n(new f(socket.getInputStream()), new c(), 0);
    }

    public void f(int i10, b bVar) {
        this.f23800c.put(Integer.valueOf(i10), bVar);
    }

    public void g(List list) {
        AbstractC0853a.i(this.f23801d);
        this.f23801d.b(list);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        void c(List list);

        default void a(Exception exc) {
        }

        default void b(List list, Exception exc) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class c implements m.b {
        public c() {
        }

        @Override // e2.m.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public m.c o(f fVar, long j10, long j11, IOException iOException, int i10) {
            if (!g.this.f23803f) {
                g.this.f23798a.a(iOException);
            }
            return e2.m.f33634f;
        }

        @Override // e2.m.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void w(f fVar, long j10, long j11) {
        }

        @Override // e2.m.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void t(f fVar, long j10, long j11, boolean z10) {
        }
    }
}
