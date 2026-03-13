package xe;

import Fe.C0843e;
import Fe.C0846h;
import Fe.InterfaceC0845g;
import Fe.J;
import Fe.K;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import qe.p;
import xe.e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f48246e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f48247f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0845g f48248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f48250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e.a f48251d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Logger a() {
            return i.f48247f;
        }

        public final int b(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        void a(boolean z10, int i10, InterfaceC0845g interfaceC0845g, int i11);

        void b(boolean z10, int i10, int i11, List list);

        void c(int i10, long j10);

        void e(boolean z10, n nVar);

        void f(int i10, int i11, List list);

        void i();

        void j(int i10, xe.b bVar, C0846h c0846h);

        void k(int i10, xe.b bVar);

        void l(boolean z10, int i10, int i11);

        void n(int i10, int i11, int i12, boolean z10);
    }

    static {
        Logger logger = Logger.getLogger(f.class.getName());
        AbstractC4862t.d(logger, "getLogger(...)");
        f48247f = logger;
    }

    public i(InterfaceC0845g source, boolean z10) {
        AbstractC4862t.e(source, "source");
        this.f48248a = source;
        this.f48249b = z10;
        b bVar = new b(source);
        this.f48250c = bVar;
        this.f48251d = new e.a(bVar, RecognitionOptions.AZTEC, 0, 4, null);
    }

    public final boolean b(boolean z10, c handler) throws Exception {
        AbstractC4862t.e(handler, "handler");
        try {
            this.f48248a.j0(9L);
            int iD = qe.m.D(this.f48248a);
            if (iD > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iD);
            }
            int iB = qe.m.b(this.f48248a.readByte(), 255);
            int iB2 = qe.m.b(this.f48248a.readByte(), 255);
            int i10 = this.f48248a.readInt() & Integer.MAX_VALUE;
            if (iB != 8) {
                Logger logger = f48247f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(f.f48153a.c(true, i10, iD, iB, iB2));
                }
            }
            if (z10 && iB != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + f.f48153a.b(iB));
            }
            switch (iB) {
                case 0:
                    d(handler, iD, iB2, i10);
                    return true;
                case 1:
                    h(handler, iD, iB2, i10);
                    return true;
                case 2:
                    k(handler, iD, iB2, i10);
                    return true;
                case 3:
                    o(handler, iD, iB2, i10);
                    return true;
                case 4:
                    q(handler, iD, iB2, i10);
                    return true;
                case 5:
                    m(handler, iD, iB2, i10);
                    return true;
                case 6:
                    i(handler, iD, iB2, i10);
                    return true;
                case 7:
                    f(handler, iD, iB2, i10);
                    return true;
                case 8:
                    u(handler, iD, iB2, i10);
                    return true;
                default:
                    this.f48248a.skip(iD);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void c(c handler) throws IOException {
        AbstractC4862t.e(handler, "handler");
        if (this.f48249b) {
            if (!b(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        InterfaceC0845g interfaceC0845g = this.f48248a;
        C0846h c0846h = f.f48154b;
        C0846h c0846hQ0 = interfaceC0845g.q0(c0846h.size());
        Logger logger = f48247f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(p.h("<< CONNECTION " + c0846hQ0.x(), new Object[0]));
        }
        if (AbstractC4862t.a(c0846h, c0846hQ0)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + c0846hQ0.R());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f48248a.close();
    }

    public final void d(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iB = (i11 & 8) != 0 ? qe.m.b(this.f48248a.readByte(), 255) : 0;
        cVar.a(z10, i12, this.f48248a, f48246e.b(i10, i11, iB));
        this.f48248a.skip(iB);
    }

    public final void f(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i13 = this.f48248a.readInt();
        int i14 = this.f48248a.readInt();
        int i15 = i10 - 8;
        xe.b bVarA = xe.b.Companion.a(i14);
        if (bVarA == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i14);
        }
        C0846h c0846hQ0 = C0846h.f4118e;
        if (i15 > 0) {
            c0846hQ0 = this.f48248a.q0(i15);
        }
        cVar.j(i13, bVarA, c0846hQ0);
    }

    public final List g(int i10, int i11, int i12, int i13) throws IOException {
        this.f48250c.d(i10);
        b bVar = this.f48250c;
        bVar.f(bVar.a());
        this.f48250c.g(i11);
        this.f48250c.c(i12);
        this.f48250c.h(i13);
        this.f48251d.k();
        return this.f48251d.e();
    }

    public final void h(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        int iB = (i11 & 8) != 0 ? qe.m.b(this.f48248a.readByte(), 255) : 0;
        if ((i11 & 32) != 0) {
            j(cVar, i12);
            i10 -= 5;
        }
        cVar.b(z10, i12, -1, g(f48246e.b(i10, i11, iB), iB, i11, i12));
    }

    public final void i(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.l((i11 & 1) != 0, this.f48248a.readInt(), this.f48248a.readInt());
    }

    public final void j(c cVar, int i10) {
        int i11 = this.f48248a.readInt();
        cVar.n(i10, i11 & Integer.MAX_VALUE, qe.m.b(this.f48248a.readByte(), 255) + 1, (Integer.MIN_VALUE & i11) != 0);
    }

    public final void k(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 == 5) {
            if (i12 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            j(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        }
    }

    public final void m(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iB = (i11 & 8) != 0 ? qe.m.b(this.f48248a.readByte(), 255) : 0;
        cVar.f(i12, this.f48248a.readInt() & Integer.MAX_VALUE, g(f48246e.b(i10 - 4, i11, iB), iB, i11, i12));
    }

    public final void o(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        }
        if (i12 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i13 = this.f48248a.readInt();
        xe.b bVarA = xe.b.Companion.a(i13);
        if (bVarA != null) {
            cVar.k(i12, bVarA);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i13);
    }

    public final void q(c cVar, int i10, int i11, int i12) throws IOException {
        int i13;
        if (i12 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i11 & 1) != 0) {
            if (i10 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.i();
            return;
        }
        if (i10 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i10);
        }
        n nVar = new n();
        Bc.d dVarN = Bc.k.n(Bc.k.p(0, i10), 6);
        int iC = dVarN.c();
        int iD = dVarN.d();
        int iE = dVarN.e();
        if ((iE > 0 && iC <= iD) || (iE < 0 && iD <= iC)) {
            while (true) {
                int iC2 = qe.m.c(this.f48248a.readShort(), 65535);
                i13 = this.f48248a.readInt();
                if (iC2 != 2) {
                    if (iC2 == 3) {
                        iC2 = 4;
                    } else if (iC2 != 4) {
                        if (iC2 == 5 && (i13 < 16384 || i13 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i13 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iC2 = 7;
                    }
                } else if (i13 != 0 && i13 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                nVar.h(iC2, i13);
                if (iC == iD) {
                    break;
                } else {
                    iC += iE;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i13);
        }
        cVar.e(false, nVar);
    }

    public final void u(c cVar, int i10, int i11, int i12) throws Exception {
        int i13;
        try {
            if (i10 != 4) {
                throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
            }
            try {
                long jD = qe.m.d(this.f48248a.readInt(), 2147483647L);
                if (jD == 0) {
                    throw new IOException("windowSizeIncrement was 0");
                }
                Logger logger = f48247f;
                if (logger.isLoggable(Level.FINE)) {
                    i13 = i12;
                    logger.fine(f.f48153a.d(true, i12, i10, jD));
                } else {
                    i13 = i12;
                }
                cVar.c(i13, jD);
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                f48247f.fine(f.f48153a.c(true, i12, i10, 8, i11));
                throw exc;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0845g f48252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f48253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f48254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f48255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f48256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f48257f;

        public b(InterfaceC0845g source) {
            AbstractC4862t.e(source, "source");
            this.f48252a = source;
        }

        @Override // Fe.J
        public long V0(C0843e sink, long j10) throws IOException {
            AbstractC4862t.e(sink, "sink");
            while (true) {
                int i10 = this.f48256e;
                if (i10 != 0) {
                    long jV0 = this.f48252a.V0(sink, Math.min(j10, i10));
                    if (jV0 == -1) {
                        return -1L;
                    }
                    this.f48256e -= (int) jV0;
                    return jV0;
                }
                this.f48252a.skip(this.f48257f);
                this.f48257f = 0;
                if ((this.f48254c & 4) != 0) {
                    return -1L;
                }
                b();
            }
        }

        public final int a() {
            return this.f48256e;
        }

        public final void b() throws IOException {
            int i10 = this.f48255d;
            int iD = qe.m.D(this.f48252a);
            this.f48256e = iD;
            this.f48253b = iD;
            int iB = qe.m.b(this.f48252a.readByte(), 255);
            this.f48254c = qe.m.b(this.f48252a.readByte(), 255);
            a aVar = i.f48246e;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(f.f48153a.c(true, this.f48255d, this.f48253b, iB, this.f48254c));
            }
            int i11 = this.f48252a.readInt() & Integer.MAX_VALUE;
            this.f48255d = i11;
            if (iB == 9) {
                if (i11 != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iB + " != TYPE_CONTINUATION");
            }
        }

        public final void c(int i10) {
            this.f48254c = i10;
        }

        public final void d(int i10) {
            this.f48256e = i10;
        }

        public final void f(int i10) {
            this.f48253b = i10;
        }

        public final void g(int i10) {
            this.f48257f = i10;
        }

        public final void h(int i10) {
            this.f48255d = i10;
        }

        @Override // Fe.J
        public K n() {
            return this.f48252a.n();
        }

        @Override // Fe.J, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
