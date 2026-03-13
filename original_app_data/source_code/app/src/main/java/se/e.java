package se;

import Ae.h;
import Fe.A;
import Fe.AbstractC0849k;
import Fe.AbstractC0850l;
import Fe.AbstractC0852n;
import Fe.H;
import Fe.InterfaceC0844f;
import Fe.InterfaceC0845g;
import Fe.J;
import Od.C;
import Od.F;
import Od.o;
import com.fasterxml.jackson.core.JsonFactory;
import fc.C4015H;
import fc.C4022e;
import fc.C4025h;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import qe.m;
import qe.p;
import te.AbstractC5884a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f44503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0849k f44506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f44507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A f44508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A f44509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A f44510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f44511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC0844f f44512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f44513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f44514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f44515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f44516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f44517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f44518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f44519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f44520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f44521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final te.c f44522t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0601e f44523u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f44498v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f44499w = "journal";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f44500x = "journal.tmp";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f44501y = "journal.bkp";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f44502z = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f44491A = "1";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final long f44492B = -1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final o f44493C = new o("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f44494D = "CLEAN";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f44495E = "DIRTY";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f44496F = "REMOVE";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f44497G = "READ";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f44524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f44525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f44526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e f44527d;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends v implements l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e f44528a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f44529b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, b bVar) {
                super(1);
                this.f44528a = eVar;
                this.f44529b = bVar;
            }

            public final void a(IOException it) {
                AbstractC4862t.e(it, "it");
                e eVar = this.f44528a;
                b bVar = this.f44529b;
                synchronized (eVar) {
                    bVar.c();
                    C4015H c4015h = C4015H.f34254a;
                }
            }

            @Override // vc.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((IOException) obj);
                return C4015H.f34254a;
            }
        }

        public b(e eVar, c entry) {
            AbstractC4862t.e(entry, "entry");
            this.f44527d = eVar;
            this.f44524a = entry;
            this.f44525b = entry.g() ? null : new boolean[eVar.H()];
        }

        public final void a() {
            e eVar = this.f44527d;
            synchronized (eVar) {
                try {
                    if (this.f44526c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (AbstractC4862t.a(this.f44524a.b(), this)) {
                        eVar.m(this, false);
                    }
                    this.f44526c = true;
                    C4015H c4015h = C4015H.f34254a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            e eVar = this.f44527d;
            synchronized (eVar) {
                try {
                    if (this.f44526c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (AbstractC4862t.a(this.f44524a.b(), this)) {
                        eVar.m(this, true);
                    }
                    this.f44526c = true;
                    C4015H c4015h = C4015H.f34254a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            if (AbstractC4862t.a(this.f44524a.b(), this)) {
                if (this.f44527d.f44516n) {
                    this.f44527d.m(this, false);
                } else {
                    this.f44524a.q(true);
                }
            }
        }

        public final c d() {
            return this.f44524a;
        }

        public final boolean[] e() {
            return this.f44525b;
        }

        public final H f(int i10) {
            e eVar = this.f44527d;
            synchronized (eVar) {
                if (this.f44526c) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!AbstractC4862t.a(this.f44524a.b(), this)) {
                    return Fe.v.a();
                }
                if (!this.f44524a.g()) {
                    boolean[] zArr = this.f44525b;
                    AbstractC4862t.b(zArr);
                    zArr[i10] = true;
                }
                try {
                    return new se.f(eVar.G().o((A) this.f44524a.c().get(i10)), new a(eVar, this));
                } catch (FileNotFoundException unused) {
                    return Fe.v.a();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f44530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f44531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f44532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f44533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f44534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f44535f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b f44536g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f44537h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f44538i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ e f44539j;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends AbstractC0852n {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f44540b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f44541c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f44542d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(J j10, e eVar, c cVar) {
                super(j10);
                this.f44541c = eVar;
                this.f44542d = cVar;
            }

            @Override // Fe.AbstractC0852n, Fe.J, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (this.f44540b) {
                    return;
                }
                this.f44540b = true;
                e eVar = this.f44541c;
                c cVar = this.f44542d;
                synchronized (eVar) {
                    try {
                        cVar.n(cVar.f() - 1);
                        if (cVar.f() == 0 && cVar.i()) {
                            eVar.x0(cVar);
                        }
                        C4015H c4015h = C4015H.f34254a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public c(e eVar, String key) {
            AbstractC4862t.e(key, "key");
            this.f44539j = eVar;
            this.f44530a = key;
            this.f44531b = new long[eVar.H()];
            this.f44532c = new ArrayList();
            this.f44533d = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            int iH = eVar.H();
            for (int i10 = 0; i10 < iH; i10++) {
                sb2.append(i10);
                List list = this.f44532c;
                A aF = this.f44539j.F();
                String string = sb2.toString();
                AbstractC4862t.d(string, "toString(...)");
                list.add(aF.x(string));
                sb2.append(".tmp");
                List list2 = this.f44533d;
                A aF2 = this.f44539j.F();
                String string2 = sb2.toString();
                AbstractC4862t.d(string2, "toString(...)");
                list2.add(aF2.x(string2));
                sb2.setLength(length);
            }
        }

        public final List a() {
            return this.f44532c;
        }

        public final b b() {
            return this.f44536g;
        }

        public final List c() {
            return this.f44533d;
        }

        public final String d() {
            return this.f44530a;
        }

        public final long[] e() {
            return this.f44531b;
        }

        public final int f() {
            return this.f44537h;
        }

        public final boolean g() {
            return this.f44534e;
        }

        public final long h() {
            return this.f44538i;
        }

        public final boolean i() {
            return this.f44535f;
        }

        public final Void j(List list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        public final J k(int i10) {
            J jQ = this.f44539j.G().q((A) this.f44532c.get(i10));
            if (this.f44539j.f44516n) {
                return jQ;
            }
            this.f44537h++;
            return new a(jQ, this.f44539j, this);
        }

        public final void l(b bVar) {
            this.f44536g = bVar;
        }

        public final void m(List strings) throws IOException {
            AbstractC4862t.e(strings, "strings");
            if (strings.size() != this.f44539j.H()) {
                j(strings);
                throw new C4025h();
            }
            try {
                int size = strings.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f44531b[i10] = Long.parseLong((String) strings.get(i10));
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new C4025h();
            }
        }

        public final void n(int i10) {
            this.f44537h = i10;
        }

        public final void o(boolean z10) {
            this.f44534e = z10;
        }

        public final void p(long j10) {
            this.f44538i = j10;
        }

        public final void q(boolean z10) {
            this.f44535f = z10;
        }

        public final d r() {
            e eVar = this.f44539j;
            if (p.f43482e && !Thread.holdsLock(eVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + eVar);
            }
            if (!this.f44534e) {
                return null;
            }
            if (!this.f44539j.f44516n && (this.f44536g != null || this.f44535f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f44531b.clone();
            try {
                int iH = this.f44539j.H();
                for (int i10 = 0; i10 < iH; i10++) {
                    arrayList.add(k(i10));
                }
                return new d(this.f44539j, this.f44530a, this.f44538i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m.f((J) it.next());
                }
                try {
                    this.f44539j.x0(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(InterfaceC0844f writer) {
            AbstractC4862t.e(writer, "writer");
            for (long j10 : this.f44531b) {
                writer.writeByte(32).l0(j10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class d implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f44543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f44544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f44545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f44546d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e f44547e;

        public d(e eVar, String key, long j10, List sources, long[] lengths) {
            AbstractC4862t.e(key, "key");
            AbstractC4862t.e(sources, "sources");
            AbstractC4862t.e(lengths, "lengths");
            this.f44547e = eVar;
            this.f44543a = key;
            this.f44544b = j10;
            this.f44545c = sources;
            this.f44546d = lengths;
        }

        public final b a() {
            return this.f44547e.q(this.f44543a, this.f44544b);
        }

        public final J b(int i10) {
            return (J) this.f44545c.get(i10);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator it = this.f44545c.iterator();
            while (it.hasNext()) {
                m.f((J) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: se.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0601e extends AbstractC5884a {
        public C0601e(String str) {
            super(str, false, 2, null);
        }

        @Override // te.AbstractC5884a
        public long f() {
            e eVar = e.this;
            synchronized (eVar) {
                if (!eVar.f44517o || eVar.D()) {
                    return -1L;
                }
                try {
                    eVar.G0();
                } catch (IOException unused) {
                    eVar.f44519q = true;
                }
                try {
                    if (eVar.S()) {
                        eVar.p0();
                        eVar.f44514l = 0;
                    }
                } catch (IOException unused2) {
                    eVar.f44520r = true;
                    InterfaceC0844f interfaceC0844f = eVar.f44512j;
                    if (interfaceC0844f != null) {
                        m.f(interfaceC0844f);
                    }
                    eVar.f44512j = Fe.v.b(Fe.v.a());
                }
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends AbstractC0850l {
        public f(AbstractC0849k abstractC0849k) {
            super(abstractC0849k);
        }

        @Override // Fe.AbstractC0850l, Fe.AbstractC0849k
        public H p(A file, boolean z10) {
            AbstractC4862t.e(file, "file");
            A aU = file.u();
            if (aU != null) {
                d(aU);
            }
            return super.p(file, z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends v implements l {
        public g() {
            super(1);
        }

        public final void a(IOException it) {
            AbstractC4862t.e(it, "it");
            e eVar = e.this;
            if (!p.f43482e || Thread.holdsLock(eVar)) {
                e.this.f44515m = true;
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + eVar);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((IOException) obj);
            return C4015H.f34254a;
        }
    }

    public e(AbstractC0849k fileSystem, A directory, int i10, int i11, long j10, te.d taskRunner) {
        AbstractC4862t.e(fileSystem, "fileSystem");
        AbstractC4862t.e(directory, "directory");
        AbstractC4862t.e(taskRunner, "taskRunner");
        this.f44503a = directory;
        this.f44504b = i10;
        this.f44505c = i11;
        this.f44506d = new f(fileSystem);
        this.f44507e = j10;
        this.f44513k = new LinkedHashMap(0, 0.75f, true);
        this.f44522t = taskRunner.k();
        this.f44523u = new C0601e(p.f43483f + " Cache");
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f44508f = directory.x(f44499w);
        this.f44509g = directory.x(f44500x);
        this.f44510h = directory.x(f44501y);
    }

    public static /* synthetic */ b u(e eVar, String str, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = f44492B;
        }
        return eVar.q(str, j10);
    }

    public final synchronized d C(String key) {
        AbstractC4862t.e(key, "key");
        K();
        k();
        J0(key);
        c cVar = (c) this.f44513k.get(key);
        if (cVar == null) {
            return null;
        }
        d dVarR = cVar.r();
        if (dVarR == null) {
            return null;
        }
        this.f44514l++;
        InterfaceC0844f interfaceC0844f = this.f44512j;
        AbstractC4862t.b(interfaceC0844f);
        interfaceC0844f.T(f44497G).writeByte(32).T(key).writeByte(10);
        if (S()) {
            te.c.m(this.f44522t, this.f44523u, 0L, 2, null);
        }
        return dVarR;
    }

    public final boolean C0() {
        for (c cVar : this.f44513k.values()) {
            if (!cVar.i()) {
                AbstractC4862t.b(cVar);
                x0(cVar);
                return true;
            }
        }
        return false;
    }

    public final boolean D() {
        return this.f44518p;
    }

    public final A F() {
        return this.f44503a;
    }

    public final AbstractC0849k G() {
        return this.f44506d;
    }

    public final void G0() {
        while (this.f44511i > this.f44507e) {
            if (!C0()) {
                return;
            }
        }
        this.f44519q = false;
    }

    public final int H() {
        return this.f44505c;
    }

    public final void J0(String str) {
        if (f44493C.i(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + JsonFactory.DEFAULT_QUOTE_CHAR).toString());
    }

    public final synchronized void K() {
        try {
            if (p.f43482e && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.f44517o) {
                return;
            }
            if (this.f44506d.j(this.f44510h)) {
                if (this.f44506d.j(this.f44508f)) {
                    this.f44506d.h(this.f44510h);
                } else {
                    this.f44506d.c(this.f44510h, this.f44508f);
                }
            }
            this.f44516n = m.z(this.f44506d, this.f44510h);
            if (this.f44506d.j(this.f44508f)) {
                try {
                    g0();
                    a0();
                    this.f44517o = true;
                    return;
                } catch (IOException e10) {
                    h.f493a.g().k("DiskLruCache " + this.f44503a + " is corrupt: " + e10.getMessage() + ", removing", 5, e10);
                    try {
                        o();
                        this.f44518p = false;
                        p0();
                        this.f44517o = true;
                    } catch (Throwable th) {
                        this.f44518p = false;
                        throw th;
                    }
                }
            }
            p0();
            this.f44517o = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean S() {
        int i10 = this.f44514l;
        return i10 >= 2000 && i10 >= this.f44513k.size();
    }

    public final InterfaceC0844f Y() {
        return Fe.v.b(new se.f(this.f44506d.a(this.f44508f), new g()));
    }

    public final void a0() {
        m.i(this.f44506d, this.f44509g);
        Iterator it = this.f44513k.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC4862t.d(next, "next(...)");
            c cVar = (c) next;
            int i10 = 0;
            if (cVar.b() == null) {
                int i11 = this.f44505c;
                while (i10 < i11) {
                    this.f44511i += cVar.e()[i10];
                    i10++;
                }
            } else {
                cVar.l(null);
                int i12 = this.f44505c;
                while (i10 < i12) {
                    m.i(this.f44506d, (A) cVar.a().get(i10));
                    m.i(this.f44506d, (A) cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        b bVarB;
        try {
            if (this.f44517o && !this.f44518p) {
                Collection collectionValues = this.f44513k.values();
                AbstractC4862t.d(collectionValues, "<get-values>(...)");
                for (c cVar : (c[]) collectionValues.toArray(new c[0])) {
                    if (cVar.b() != null && (bVarB = cVar.b()) != null) {
                        bVarB.c();
                    }
                }
                G0();
                InterfaceC0844f interfaceC0844f = this.f44512j;
                if (interfaceC0844f != null) {
                    m.f(interfaceC0844f);
                }
                this.f44512j = null;
                this.f44518p = true;
                return;
            }
            this.f44518p = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f44517o) {
            k();
            G0();
            InterfaceC0844f interfaceC0844f = this.f44512j;
            AbstractC4862t.b(interfaceC0844f);
            interfaceC0844f.flush();
        }
    }

    public final void g0() throws Throwable {
        InterfaceC0845g interfaceC0845gC = Fe.v.c(this.f44506d.q(this.f44508f));
        try {
            String strZ = interfaceC0845gC.Z();
            String strZ2 = interfaceC0845gC.Z();
            String strZ3 = interfaceC0845gC.Z();
            String strZ4 = interfaceC0845gC.Z();
            String strZ5 = interfaceC0845gC.Z();
            if (!AbstractC4862t.a(f44502z, strZ) || !AbstractC4862t.a(f44491A, strZ2) || !AbstractC4862t.a(String.valueOf(this.f44504b), strZ3) || !AbstractC4862t.a(String.valueOf(this.f44505c), strZ4) || strZ5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strZ + ", " + strZ2 + ", " + strZ4 + ", " + strZ5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    k0(interfaceC0845gC.Z());
                    i10++;
                } catch (EOFException unused) {
                    this.f44514l = i10 - this.f44513k.size();
                    if (interfaceC0845gC.z0()) {
                        InterfaceC0844f interfaceC0844f = this.f44512j;
                        if (interfaceC0844f != null) {
                            m.f(interfaceC0844f);
                        }
                        this.f44512j = Y();
                    } else {
                        p0();
                    }
                    C4015H c4015h = C4015H.f34254a;
                    if (interfaceC0845gC != null) {
                        try {
                            interfaceC0845gC.close();
                            th = null;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } else {
                        th = null;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (interfaceC0845gC != null) {
                try {
                    interfaceC0845gC.close();
                } catch (Throwable th3) {
                    C4022e.a(th, th3);
                }
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final synchronized void k() {
        if (this.f44518p) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void k0(String str) throws IOException {
        String strSubstring;
        int iH0 = F.h0(str, ' ', 0, false, 6, null);
        if (iH0 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iH0 + 1;
        int iH02 = F.h0(str, ' ', i10, false, 4, null);
        if (iH02 == -1) {
            strSubstring = str.substring(i10);
            AbstractC4862t.d(strSubstring, "substring(...)");
            String str2 = f44496F;
            if (iH0 == str2.length() && C.P(str, str2, false, 2, null)) {
                this.f44513k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iH02);
            AbstractC4862t.d(strSubstring, "substring(...)");
        }
        c cVar = (c) this.f44513k.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            this.f44513k.put(strSubstring, cVar);
        }
        if (iH02 != -1) {
            String str3 = f44494D;
            if (iH0 == str3.length() && C.P(str, str3, false, 2, null)) {
                String strSubstring2 = str.substring(iH02 + 1);
                AbstractC4862t.d(strSubstring2, "substring(...)");
                List listH0 = F.H0(strSubstring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(listH0);
                return;
            }
        }
        if (iH02 == -1) {
            String str4 = f44495E;
            if (iH0 == str4.length() && C.P(str, str4, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (iH02 == -1) {
            String str5 = f44497G;
            if (iH0 == str5.length() && C.P(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final synchronized void m(b editor, boolean z10) {
        AbstractC4862t.e(editor, "editor");
        c cVarD = editor.d();
        if (!AbstractC4862t.a(cVarD.b(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z10 && !cVarD.g()) {
            int i10 = this.f44505c;
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] zArrE = editor.e();
                AbstractC4862t.b(zArrE);
                if (!zArrE[i11]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!this.f44506d.j((A) cVarD.c().get(i11))) {
                    editor.a();
                    return;
                }
            }
        }
        int i12 = this.f44505c;
        for (int i13 = 0; i13 < i12; i13++) {
            A a10 = (A) cVarD.c().get(i13);
            if (!z10 || cVarD.i()) {
                m.i(this.f44506d, a10);
            } else if (this.f44506d.j(a10)) {
                A a11 = (A) cVarD.a().get(i13);
                this.f44506d.c(a10, a11);
                long j10 = cVarD.e()[i13];
                Long lC = this.f44506d.l(a11).c();
                long jLongValue = lC != null ? lC.longValue() : 0L;
                cVarD.e()[i13] = jLongValue;
                this.f44511i = (this.f44511i - j10) + jLongValue;
            }
        }
        cVarD.l(null);
        if (cVarD.i()) {
            x0(cVarD);
            return;
        }
        this.f44514l++;
        InterfaceC0844f interfaceC0844f = this.f44512j;
        AbstractC4862t.b(interfaceC0844f);
        if (cVarD.g() || z10) {
            cVarD.o(true);
            interfaceC0844f.T(f44494D).writeByte(32);
            interfaceC0844f.T(cVarD.d());
            cVarD.s(interfaceC0844f);
            interfaceC0844f.writeByte(10);
            if (z10) {
                long j11 = this.f44521s;
                this.f44521s = 1 + j11;
                cVarD.p(j11);
            }
        } else {
            this.f44513k.remove(cVarD.d());
            interfaceC0844f.T(f44496F).writeByte(32);
            interfaceC0844f.T(cVarD.d());
            interfaceC0844f.writeByte(10);
        }
        interfaceC0844f.flush();
        if (this.f44511i > this.f44507e || S()) {
            te.c.m(this.f44522t, this.f44523u, 0L, 2, null);
        }
    }

    public final void o() throws IOException {
        close();
        m.h(this.f44506d, this.f44503a);
    }

    public final synchronized void p0() {
        Throwable th;
        try {
            InterfaceC0844f interfaceC0844f = this.f44512j;
            if (interfaceC0844f != null) {
                interfaceC0844f.close();
            }
            InterfaceC0844f interfaceC0844fB = Fe.v.b(this.f44506d.p(this.f44509g, false));
            try {
                interfaceC0844fB.T(f44502z).writeByte(10);
                interfaceC0844fB.T(f44491A).writeByte(10);
                interfaceC0844fB.l0(this.f44504b).writeByte(10);
                interfaceC0844fB.l0(this.f44505c).writeByte(10);
                interfaceC0844fB.writeByte(10);
                for (c cVar : this.f44513k.values()) {
                    if (cVar.b() != null) {
                        interfaceC0844fB.T(f44495E).writeByte(32);
                        interfaceC0844fB.T(cVar.d());
                        interfaceC0844fB.writeByte(10);
                    } else {
                        interfaceC0844fB.T(f44494D).writeByte(32);
                        interfaceC0844fB.T(cVar.d());
                        cVar.s(interfaceC0844fB);
                        interfaceC0844fB.writeByte(10);
                    }
                }
                C4015H c4015h = C4015H.f34254a;
                if (interfaceC0844fB != null) {
                    try {
                        interfaceC0844fB.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    th = null;
                }
            } catch (Throwable th3) {
                if (interfaceC0844fB != null) {
                    try {
                        interfaceC0844fB.close();
                    } catch (Throwable th4) {
                        C4022e.a(th3, th4);
                    }
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            if (this.f44506d.j(this.f44508f)) {
                this.f44506d.c(this.f44508f, this.f44510h);
                this.f44506d.c(this.f44509g, this.f44508f);
                m.i(this.f44506d, this.f44510h);
            } else {
                this.f44506d.c(this.f44509g, this.f44508f);
            }
            InterfaceC0844f interfaceC0844f2 = this.f44512j;
            if (interfaceC0844f2 != null) {
                m.f(interfaceC0844f2);
            }
            this.f44512j = Y();
            this.f44515m = false;
            this.f44520r = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final synchronized b q(String key, long j10) {
        AbstractC4862t.e(key, "key");
        K();
        k();
        J0(key);
        c cVar = (c) this.f44513k.get(key);
        if (j10 != f44492B && (cVar == null || cVar.h() != j10)) {
            return null;
        }
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.f44519q && !this.f44520r) {
            InterfaceC0844f interfaceC0844f = this.f44512j;
            AbstractC4862t.b(interfaceC0844f);
            interfaceC0844f.T(f44495E).writeByte(32).T(key).writeByte(10);
            interfaceC0844f.flush();
            if (this.f44515m) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, key);
                this.f44513k.put(key, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.l(bVar);
            return bVar;
        }
        te.c.m(this.f44522t, this.f44523u, 0L, 2, null);
        return null;
    }

    public final synchronized boolean v0(String key) {
        AbstractC4862t.e(key, "key");
        K();
        k();
        J0(key);
        c cVar = (c) this.f44513k.get(key);
        if (cVar == null) {
            return false;
        }
        boolean zX0 = x0(cVar);
        if (zX0 && this.f44511i <= this.f44507e) {
            this.f44519q = false;
        }
        return zX0;
    }

    public final boolean x0(c entry) {
        InterfaceC0844f interfaceC0844f;
        AbstractC4862t.e(entry, "entry");
        if (!this.f44516n) {
            if (entry.f() > 0 && (interfaceC0844f = this.f44512j) != null) {
                interfaceC0844f.T(f44495E);
                interfaceC0844f.writeByte(32);
                interfaceC0844f.T(entry.d());
                interfaceC0844f.writeByte(10);
                interfaceC0844f.flush();
            }
            if (entry.f() > 0 || entry.b() != null) {
                entry.q(true);
                return true;
            }
        }
        b bVarB = entry.b();
        if (bVarB != null) {
            bVarB.c();
        }
        int i10 = this.f44505c;
        for (int i11 = 0; i11 < i10; i11++) {
            m.i(this.f44506d, (A) entry.a().get(i11));
            this.f44511i -= entry.e()[i11];
            entry.e()[i11] = 0;
        }
        this.f44514l++;
        InterfaceC0844f interfaceC0844f2 = this.f44512j;
        if (interfaceC0844f2 != null) {
            interfaceC0844f2.T(f44496F);
            interfaceC0844f2.writeByte(32);
            interfaceC0844f2.T(entry.d());
            interfaceC0844f2.writeByte(10);
        }
        this.f44513k.remove(entry.d());
        if (S()) {
            te.c.m(this.f44522t, this.f44523u, 0L, 2, null);
        }
        return true;
    }
}
