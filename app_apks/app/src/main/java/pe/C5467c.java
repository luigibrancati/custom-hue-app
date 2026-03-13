package pe;

import Ae.h;
import Fe.A;
import Fe.AbstractC0849k;
import Fe.AbstractC0851m;
import Fe.AbstractC0852n;
import Fe.C0843e;
import Fe.C0846h;
import Fe.H;
import Fe.InterfaceC0844f;
import Fe.InterfaceC0845g;
import Fe.J;
import com.fasterxml.jackson.core.JsonFactory;
import fc.C4015H;
import gc.C4206t;
import gc.U;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.S;
import org.apache.tika.metadata.HttpHeaders;
import pe.C;
import pe.u;
import se.e;

/* JADX INFO: renamed from: pe.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5467c implements Closeable, Flushable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f42615g = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final se.e f42616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42621f;

    /* JADX INFO: renamed from: pe.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends D {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e.d f42622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f42623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f42624d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final InterfaceC0845g f42625e;

        /* JADX INFO: renamed from: pe.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0568a extends AbstractC0852n {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f42626b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0568a(J j10, a aVar) {
                super(j10);
                this.f42626b = aVar;
            }

            @Override // Fe.AbstractC0852n, Fe.J, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f42626b.d().close();
                super.close();
            }
        }

        public a(e.d snapshot, String str, String str2) {
            AbstractC4862t.e(snapshot, "snapshot");
            this.f42622b = snapshot;
            this.f42623c = str;
            this.f42624d = str2;
            this.f42625e = Fe.v.c(new C0568a(snapshot.b(1), this));
        }

        @Override // pe.D
        public long a() {
            String str = this.f42624d;
            if (str != null) {
                return qe.m.F(str, -1L);
            }
            return -1L;
        }

        @Override // pe.D
        public x b() {
            String str = this.f42623c;
            if (str != null) {
                return x.f42891e.a(str);
            }
            return null;
        }

        @Override // pe.D
        public InterfaceC0845g c() {
            return this.f42625e;
        }

        public final e.d d() {
            return this.f42622b;
        }
    }

    /* JADX INFO: renamed from: pe.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final boolean a(C c10) {
            AbstractC4862t.e(c10, "<this>");
            return d(c10.o()).contains("*");
        }

        public final String b(v url) {
            AbstractC4862t.e(url, "url");
            return C0846h.f4117d.d(url.toString()).G().x();
        }

        public final int c(InterfaceC0845g source) throws IOException {
            AbstractC4862t.e(source, "source");
            try {
                long jB0 = source.B0();
                String strZ = source.Z();
                if (jB0 >= 0 && jB0 <= 2147483647L && strZ.length() <= 0) {
                    return (int) jB0;
                }
                throw new IOException("expected an int but was \"" + jB0 + strZ + JsonFactory.DEFAULT_QUOTE_CHAR);
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final Set d(u uVar) {
            int size = uVar.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (Od.C.E("Vary", uVar.e(i10), true)) {
                    String strH = uVar.h(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(Od.C.F(S.f39781a));
                    }
                    Iterator it = Od.F.H0(strH, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(Od.F.e1((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? U.d() : treeSet;
        }

        public final u e(u uVar, u uVar2) {
            Set setD = d(uVar2);
            if (setD.isEmpty()) {
                return qe.p.f43478a;
            }
            u.a aVar = new u.a();
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strE = uVar.e(i10);
                if (setD.contains(strE)) {
                    aVar.a(strE, uVar.h(i10));
                }
            }
            return aVar.d();
        }

        public final u f(C c10) {
            AbstractC4862t.e(c10, "<this>");
            C C10 = c10.C();
            AbstractC4862t.b(C10);
            return e(C10.K().g(), c10.o());
        }

        public final boolean g(C cachedResponse, u cachedRequest, C5464A newRequest) {
            AbstractC4862t.e(cachedResponse, "cachedResponse");
            AbstractC4862t.e(cachedRequest, "cachedRequest");
            AbstractC4862t.e(newRequest, "newRequest");
            Set<String> setD = d(cachedResponse.o());
            if (setD != null && setD.isEmpty()) {
                return true;
            }
            for (String str : setD) {
                if (!AbstractC4862t.a(cachedRequest.k(str), newRequest.f(str))) {
                    return false;
                }
            }
            return true;
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: pe.c$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class d implements se.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e.b f42640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final H f42641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final H f42642c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f42643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C5467c f42644e;

        /* JADX INFO: renamed from: pe.c$d$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends AbstractC0851m {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C5467c f42645b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f42646c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C5467c c5467c, d dVar, H h10) {
                super(h10);
                this.f42645b = c5467c;
                this.f42646c = dVar;
            }

            @Override // Fe.AbstractC0851m, Fe.H, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
            public void close() {
                C5467c c5467c = this.f42645b;
                d dVar = this.f42646c;
                synchronized (c5467c) {
                    if (dVar.c()) {
                        return;
                    }
                    dVar.d(true);
                    c5467c.i(c5467c.d() + 1);
                    super.close();
                    this.f42646c.f42640a.b();
                }
            }
        }

        public d(C5467c c5467c, e.b editor) {
            AbstractC4862t.e(editor, "editor");
            this.f42644e = c5467c;
            this.f42640a = editor;
            H hF = editor.f(1);
            this.f42641b = hF;
            this.f42642c = new a(c5467c, this, hF);
        }

        @Override // se.c
        public H a() {
            return this.f42642c;
        }

        @Override // se.c
        public void abort() {
            C5467c c5467c = this.f42644e;
            synchronized (c5467c) {
                if (this.f42643d) {
                    return;
                }
                this.f42643d = true;
                c5467c.h(c5467c.c() + 1);
                qe.m.f(this.f42641b);
                try {
                    this.f42640a.a();
                } catch (IOException unused) {
                }
            }
        }

        public final boolean c() {
            return this.f42643d;
        }

        public final void d(boolean z10) {
            this.f42643d = z10;
        }
    }

    public C5467c(Fe.A directory, long j10, AbstractC0849k fileSystem, te.d taskRunner) {
        AbstractC4862t.e(directory, "directory");
        AbstractC4862t.e(fileSystem, "fileSystem");
        AbstractC4862t.e(taskRunner, "taskRunner");
        this.f42616a = new se.e(fileSystem, directory, 201105, 2, j10, taskRunner);
    }

    public final void a(e.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public final C b(C5464A request) {
        AbstractC4862t.e(request, "request");
        try {
            e.d dVarC = this.f42616a.C(f42615g.b(request.k()));
            if (dVarC == null) {
                return null;
            }
            try {
                C0569c c0569c = new C0569c(dVarC.b(0));
                C c10 = c0569c.c(dVarC);
                if (c0569c.a(request, c10)) {
                    return c10;
                }
                qe.m.f(c10.b());
                return null;
            } catch (IOException unused) {
                qe.m.f(dVarC);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final int c() {
        return this.f42618c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f42616a.close();
    }

    public final int d() {
        return this.f42617b;
    }

    public final se.c f(C response) {
        e.b bVarU;
        AbstractC4862t.e(response, "response");
        String strI = response.K().i();
        if (ve.f.a(response.K().i())) {
            try {
                g(response.K());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!AbstractC4862t.a(strI, "GET")) {
            return null;
        }
        b bVar = f42615g;
        if (bVar.a(response)) {
            return null;
        }
        C0569c c0569c = new C0569c(response);
        try {
            bVarU = se.e.u(this.f42616a, bVar.b(response.K().k()), 0L, 2, null);
            if (bVarU == null) {
                return null;
            }
            try {
                c0569c.e(bVarU);
                return new d(this, bVarU);
            } catch (IOException unused2) {
                a(bVarU);
                return null;
            }
        } catch (IOException unused3) {
            bVarU = null;
        }
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f42616a.flush();
    }

    public final void g(C5464A request) {
        AbstractC4862t.e(request, "request");
        this.f42616a.v0(f42615g.b(request.k()));
    }

    public final void h(int i10) {
        this.f42618c = i10;
    }

    public final void i(int i10) {
        this.f42617b = i10;
    }

    public final synchronized void j() {
        this.f42620e++;
    }

    public final synchronized void k(se.d cacheStrategy) {
        try {
            AbstractC4862t.e(cacheStrategy, "cacheStrategy");
            this.f42621f++;
            if (cacheStrategy.b() != null) {
                this.f42619d++;
            } else if (cacheStrategy.a() != null) {
                this.f42620e++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void m(C cached, C network) {
        e.b bVarA;
        AbstractC4862t.e(cached, "cached");
        AbstractC4862t.e(network, "network");
        C0569c c0569c = new C0569c(network);
        D dB = cached.b();
        AbstractC4862t.c(dB, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            bVarA = ((a) dB).d().a();
            if (bVarA == null) {
                return;
            }
            try {
                c0569c.e(bVarA);
                bVarA.b();
            } catch (IOException unused) {
                a(bVarA);
            }
        } catch (IOException unused2) {
            bVarA = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5467c(AbstractC0849k fileSystem, Fe.A directory, long j10) {
        this(directory, j10, fileSystem, te.d.f44940m);
        AbstractC4862t.e(fileSystem, "fileSystem");
        AbstractC4862t.e(directory, "directory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5467c(File directory, long j10) {
        this(AbstractC0849k.f4138b, A.a.d(Fe.A.f4048b, directory, false, 1, null), j10);
        AbstractC4862t.e(directory, "directory");
    }

    /* JADX INFO: renamed from: pe.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0569c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f42627k = new a(null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f42628l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f42629m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f42630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f42631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f42632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final z f42633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f42634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f42635f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final u f42636g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final t f42637h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f42638i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f42639j;

        /* JADX INFO: renamed from: pe.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {
            public /* synthetic */ a(AbstractC4854k abstractC4854k) {
                this();
            }

            public a() {
            }
        }

        static {
            StringBuilder sb2 = new StringBuilder();
            h.a aVar = Ae.h.f493a;
            sb2.append(aVar.g().g());
            sb2.append("-Sent-Millis");
            f42628l = sb2.toString();
            f42629m = aVar.g().g() + "-Received-Millis";
        }

        public C0569c(J rawSource) throws IOException {
            AbstractC4862t.e(rawSource, "rawSource");
            try {
                InterfaceC0845g interfaceC0845gC = Fe.v.c(rawSource);
                String strZ = interfaceC0845gC.Z();
                v vVarD = v.f42873j.d(strZ);
                if (vVarD == null) {
                    IOException iOException = new IOException("Cache corruption for " + strZ);
                    Ae.h.f493a.g().k("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f42630a = vVarD;
                this.f42632c = interfaceC0845gC.Z();
                u.a aVar = new u.a();
                int iC = C5467c.f42615g.c(interfaceC0845gC);
                for (int i10 = 0; i10 < iC; i10++) {
                    aVar.b(interfaceC0845gC.Z());
                }
                this.f42631b = aVar.d();
                ve.k kVarA = ve.k.f46058d.a(interfaceC0845gC.Z());
                this.f42633d = kVarA.f46059a;
                this.f42634e = kVarA.f46060b;
                this.f42635f = kVarA.f46061c;
                u.a aVar2 = new u.a();
                int iC2 = C5467c.f42615g.c(interfaceC0845gC);
                for (int i11 = 0; i11 < iC2; i11++) {
                    aVar2.b(interfaceC0845gC.Z());
                }
                String str = f42628l;
                String strE = aVar2.e(str);
                String str2 = f42629m;
                String strE2 = aVar2.e(str2);
                aVar2.g(str);
                aVar2.g(str2);
                this.f42638i = strE != null ? Long.parseLong(strE) : 0L;
                this.f42639j = strE2 != null ? Long.parseLong(strE2) : 0L;
                this.f42636g = aVar2.d();
                if (this.f42630a.i()) {
                    String strZ2 = interfaceC0845gC.Z();
                    if (strZ2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strZ2 + JsonFactory.DEFAULT_QUOTE_CHAR);
                    }
                    this.f42637h = t.f42862e.b(!interfaceC0845gC.z0() ? F.Companion.a(interfaceC0845gC.Z()) : F.SSL_3_0, i.f42735b.b(interfaceC0845gC.Z()), b(interfaceC0845gC), b(interfaceC0845gC));
                } else {
                    this.f42637h = null;
                }
                C4015H c4015h = C4015H.f34254a;
                sc.c.a(rawSource, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    sc.c.a(rawSource, th);
                    throw th2;
                }
            }
        }

        public final boolean a(C5464A request, C response) {
            AbstractC4862t.e(request, "request");
            AbstractC4862t.e(response, "response");
            return AbstractC4862t.a(this.f42630a, request.k()) && AbstractC4862t.a(this.f42632c, request.i()) && C5467c.f42615g.g(response, this.f42631b, request);
        }

        public final List b(InterfaceC0845g interfaceC0845g) throws IOException {
            int iC = C5467c.f42615g.c(interfaceC0845g);
            if (iC == -1) {
                return C4206t.k();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iC);
                for (int i10 = 0; i10 < iC; i10++) {
                    String strZ = interfaceC0845g.Z();
                    C0843e c0843e = new C0843e();
                    C0846h c0846hA = C0846h.f4117d.a(strZ);
                    if (c0846hA == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    c0843e.U(c0846hA);
                    arrayList.add(certificateFactory.generateCertificate(c0843e.b1()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final C c(e.d snapshot) {
            AbstractC4862t.e(snapshot, "snapshot");
            String strC = this.f42636g.c(HttpHeaders.CONTENT_TYPE);
            String strC2 = this.f42636g.c(HttpHeaders.CONTENT_LENGTH);
            return new C.a().q(new C5464A(this.f42630a, this.f42631b, this.f42632c, null, 8, null)).o(this.f42633d).e(this.f42634e).l(this.f42635f).j(this.f42636g).b(new a(snapshot, strC, strC2)).h(this.f42637h).r(this.f42638i).p(this.f42639j).c();
        }

        public final void d(InterfaceC0844f interfaceC0844f, List list) throws IOException {
            try {
                interfaceC0844f.l0(list.size()).writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = ((Certificate) it.next()).getEncoded();
                    C0846h.a aVar = C0846h.f4117d;
                    AbstractC4862t.b(encoded);
                    interfaceC0844f.T(C0846h.a.f(aVar, encoded, 0, 0, 3, null).a()).writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final void e(e.b editor) throws IOException {
            AbstractC4862t.e(editor, "editor");
            InterfaceC0844f interfaceC0844fB = Fe.v.b(editor.f(0));
            try {
                interfaceC0844fB.T(this.f42630a.toString()).writeByte(10);
                interfaceC0844fB.T(this.f42632c).writeByte(10);
                interfaceC0844fB.l0(this.f42631b.size()).writeByte(10);
                int size = this.f42631b.size();
                for (int i10 = 0; i10 < size; i10++) {
                    interfaceC0844fB.T(this.f42631b.e(i10)).T(": ").T(this.f42631b.h(i10)).writeByte(10);
                }
                interfaceC0844fB.T(new ve.k(this.f42633d, this.f42634e, this.f42635f).toString()).writeByte(10);
                interfaceC0844fB.l0(this.f42636g.size() + 2).writeByte(10);
                int size2 = this.f42636g.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    interfaceC0844fB.T(this.f42636g.e(i11)).T(": ").T(this.f42636g.h(i11)).writeByte(10);
                }
                interfaceC0844fB.T(f42628l).T(": ").l0(this.f42638i).writeByte(10);
                interfaceC0844fB.T(f42629m).T(": ").l0(this.f42639j).writeByte(10);
                if (this.f42630a.i()) {
                    interfaceC0844fB.writeByte(10);
                    t tVar = this.f42637h;
                    AbstractC4862t.b(tVar);
                    interfaceC0844fB.T(tVar.a().c()).writeByte(10);
                    d(interfaceC0844fB, this.f42637h.d());
                    d(interfaceC0844fB, this.f42637h.c());
                    interfaceC0844fB.T(this.f42637h.e().b()).writeByte(10);
                }
                C4015H c4015h = C4015H.f34254a;
                sc.c.a(interfaceC0844fB, null);
            } finally {
            }
        }

        public C0569c(C response) {
            AbstractC4862t.e(response, "response");
            this.f42630a = response.K().k();
            this.f42631b = C5467c.f42615g.f(response);
            this.f42632c = response.K().i();
            this.f42633d = response.G();
            this.f42634e = response.g();
            this.f42635f = response.u();
            this.f42636g = response.o();
            this.f42637h = response.j();
            this.f42638i = response.S();
            this.f42639j = response.H();
        }
    }
}
