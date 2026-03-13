package I1;

import G1.AbstractC0853a;
import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class y extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f5524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DatagramPacket f5525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f5526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatagramSocket f5527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MulticastSocket f5528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InetAddress f5529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5531m;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends g {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public y() {
        this(2000);
    }

    public int c() {
        DatagramSocket datagramSocket = this.f5527i;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // I1.f
    public void close() {
        this.f5526h = null;
        MulticastSocket multicastSocket = this.f5528j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) AbstractC0853a.e(this.f5529k));
            } catch (IOException unused) {
            }
            this.f5528j = null;
        }
        DatagramSocket datagramSocket = this.f5527i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f5527i = null;
        }
        this.f5529k = null;
        this.f5531m = 0;
        if (this.f5530l) {
            this.f5530l = false;
            u();
        }
    }

    @Override // I1.f
    public long f(j jVar) throws a {
        Uri uri = jVar.f5437a;
        this.f5526h = uri;
        String str = (String) AbstractC0853a.e(uri.getHost());
        int port = this.f5526h.getPort();
        v(jVar);
        try {
            this.f5529k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f5529k, port);
            if (this.f5529k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f5528j = multicastSocket;
                multicastSocket.joinGroup(this.f5529k);
                this.f5527i = this.f5528j;
            } else {
                this.f5527i = new DatagramSocket(inetSocketAddress);
            }
            this.f5527i.setSoTimeout(this.f5523e);
            this.f5530l = true;
            w(jVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, 2001);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        }
    }

    @Override // I1.f
    public Uri getUri() {
        return this.f5526h;
    }

    @Override // D1.InterfaceC0749g
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        if (this.f5531m == 0) {
            try {
                ((DatagramSocket) AbstractC0853a.e(this.f5527i)).receive(this.f5525g);
                int length = this.f5525g.getLength();
                this.f5531m = length;
                t(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = this.f5525g.getLength();
        int i12 = this.f5531m;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f5524f, length2 - i12, bArr, i10, iMin);
        this.f5531m -= iMin;
        return iMin;
    }

    public y(int i10) {
        this(i10, 8000);
    }

    public y(int i10, int i11) {
        super(true);
        this.f5523e = i11;
        byte[] bArr = new byte[i10];
        this.f5524f = bArr;
        this.f5525g = new DatagramPacket(bArr, 0, i10);
    }
}
