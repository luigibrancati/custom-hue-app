package P1;

import D1.AbstractC0747e;
import G1.AbstractC0853a;
import G1.C0865m;
import G1.InterfaceC0864l;
import G1.M;
import L1.B0;
import P1.A;
import P1.m;
import P1.t;
import a2.C2609B;
import a2.C2638y;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import e2.k;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: P1.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C1836g implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f12571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f12572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f12573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f12576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f12577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0865m f12578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e2.k f12579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final B0 f12580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final H f12581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UUID f12582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Looper f12583n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e f12584o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12585p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12586q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HandlerThread f12587r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f12588s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public J1.b f12589t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public m.a f12590u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f12591v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte[] f12592w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public A.a f12593x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public A.d f12594y;

    /* JADX INFO: renamed from: P1.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(Exception exc, boolean z10);

        void b();

        void c(C1836g c1836g);
    }

    /* JADX INFO: renamed from: P1.g$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(C1836g c1836g, int i10);

        void b(C1836g c1836g, int i10);
    }

    /* JADX INFO: renamed from: P1.g$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f12595a;

        public c(Looper looper) {
            super(looper);
        }

        public final boolean a(Message message, I i10) {
            d dVar = (d) message.obj;
            if (!dVar.f12598b) {
                return false;
            }
            int i11 = dVar.f12601e + 1;
            dVar.f12601e = i11;
            if (i11 > C1836g.this.f12579j.b(3)) {
                return false;
            }
            long jA = C1836g.this.f12579j.a(new k.c(new C2638y(dVar.f12597a, i10.f12563a, i10.f12564b, i10.f12565c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f12599c, i10.f12566d), new C2609B(3), i10.getCause() instanceof IOException ? (IOException) i10.getCause() : new f(i10.getCause()), dVar.f12601e));
            if (jA == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f12595a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), jA);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(C2638y.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f12595a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objB;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 1) {
                    objB = C1836g.this.f12581l.b(C1836g.this.f12582m, (A.d) dVar.f12600d);
                } else {
                    if (i10 != 2) {
                        throw new RuntimeException();
                    }
                    objB = C1836g.this.f12581l.a(C1836g.this.f12582m, (A.a) dVar.f12600d);
                }
            } catch (I e10) {
                boolean zA = a(message, e10);
                objB = e10;
                if (zA) {
                    return;
                }
            } catch (Exception e11) {
                G1.t.i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                objB = e11;
            }
            C1836g.this.f12579j.d(dVar.f12597a);
            synchronized (this) {
                try {
                    if (!this.f12595a) {
                        C1836g.this.f12584o.obtainMessage(message.what, Pair.create(dVar.f12600d, objB)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: P1.g$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f12597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f12598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f12599c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f12600d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12601e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f12597a = j10;
            this.f12598b = z10;
            this.f12599c = j11;
            this.f12600d = obj;
        }
    }

    /* JADX INFO: renamed from: P1.g$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 1) {
                C1836g.this.D(obj, obj2);
            } else {
                if (i10 != 2) {
                    return;
                }
                C1836g.this.x(obj, obj2);
            }
        }
    }

    /* JADX INFO: renamed from: P1.g$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public C1836g(UUID uuid, A a10, a aVar, b bVar, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap map, H h10, Looper looper, e2.k kVar, B0 b02) {
        if (i10 == 1 || i10 == 3) {
            AbstractC0853a.e(bArr);
        }
        this.f12582m = uuid;
        this.f12572c = aVar;
        this.f12573d = bVar;
        this.f12571b = a10;
        this.f12574e = i10;
        this.f12575f = z10;
        this.f12576g = z11;
        if (bArr != null) {
            this.f12592w = bArr;
            this.f12570a = null;
        } else {
            this.f12570a = Collections.unmodifiableList((List) AbstractC0853a.e(list));
        }
        this.f12577h = map;
        this.f12581l = h10;
        this.f12578i = new C0865m();
        this.f12579j = kVar;
        this.f12580k = b02;
        this.f12585p = 2;
        this.f12583n = looper;
        this.f12584o = new e(looper);
    }

    public void A(int i10) {
        if (i10 != 2) {
            return;
        }
        z();
    }

    public void B() {
        if (E()) {
            s(true);
        }
    }

    public void C(Exception exc, boolean z10) {
        w(exc, z10 ? 1 : 3);
    }

    public final void D(Object obj, Object obj2) {
        if (obj == this.f12594y) {
            if (this.f12585p == 2 || v()) {
                this.f12594y = null;
                if (obj2 instanceof Exception) {
                    this.f12572c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f12571b.e((byte[]) obj2);
                    this.f12572c.b();
                } catch (Exception e10) {
                    this.f12572c.a(e10, true);
                }
            }
        }
    }

    public final boolean E() {
        if (v()) {
            return true;
        }
        try {
            byte[] bArrC = this.f12571b.c();
            this.f12591v = bArrC;
            this.f12571b.g(bArrC, this.f12580k);
            this.f12589t = this.f12571b.i(this.f12591v);
            final int i10 = 3;
            this.f12585p = 3;
            r(new InterfaceC0864l() { // from class: P1.b
                @Override // G1.InterfaceC0864l
                public final void accept(Object obj) {
                    ((t.a) obj).k(i10);
                }
            });
            AbstractC0853a.e(this.f12591v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f12572c.c(this);
            return false;
        } catch (Exception | NoSuchMethodError e10) {
            if (x.d(e10)) {
                this.f12572c.c(this);
                return false;
            }
            w(e10, 1);
            return false;
        }
    }

    public final void F(byte[] bArr, int i10, boolean z10) {
        try {
            this.f12593x = this.f12571b.m(bArr, this.f12570a, i10, this.f12577h);
            ((c) M.i(this.f12588s)).b(2, AbstractC0853a.e(this.f12593x), z10);
        } catch (Exception | NoSuchMethodError e10) {
            y(e10, true);
        }
    }

    public void G() {
        this.f12594y = this.f12571b.b();
        ((c) M.i(this.f12588s)).b(1, AbstractC0853a.e(this.f12594y), true);
    }

    public final boolean H() {
        try {
            this.f12571b.d(this.f12591v, this.f12592w);
            return true;
        } catch (Exception | NoSuchMethodError e10) {
            w(e10, 1);
            return false;
        }
    }

    public final void I() {
        if (Thread.currentThread() != this.f12583n.getThread()) {
            G1.t.i("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f12583n.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // P1.m
    public final UUID a() {
        I();
        return this.f12582m;
    }

    @Override // P1.m
    public boolean b() {
        I();
        return this.f12575f;
    }

    @Override // P1.m
    public void c(t.a aVar) {
        I();
        int i10 = this.f12586q;
        if (i10 <= 0) {
            G1.t.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f12586q = i11;
        if (i11 == 0) {
            this.f12585p = 0;
            ((e) M.i(this.f12584o)).removeCallbacksAndMessages(null);
            ((c) M.i(this.f12588s)).c();
            this.f12588s = null;
            ((HandlerThread) M.i(this.f12587r)).quit();
            this.f12587r = null;
            this.f12589t = null;
            this.f12590u = null;
            this.f12593x = null;
            this.f12594y = null;
            byte[] bArr = this.f12591v;
            if (bArr != null) {
                this.f12571b.k(bArr);
                this.f12591v = null;
            }
        }
        if (aVar != null) {
            this.f12578i.f(aVar);
            if (this.f12578i.d(aVar) == 0) {
                aVar.m();
            }
        }
        this.f12573d.a(this, this.f12586q);
    }

    @Override // P1.m
    public void d(t.a aVar) {
        I();
        if (this.f12586q < 0) {
            G1.t.c("DefaultDrmSession", "Session reference count less than zero: " + this.f12586q);
            this.f12586q = 0;
        }
        if (aVar != null) {
            this.f12578i.c(aVar);
        }
        int i10 = this.f12586q + 1;
        this.f12586q = i10;
        if (i10 == 1) {
            AbstractC0853a.g(this.f12585p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f12587r = handlerThread;
            handlerThread.start();
            this.f12588s = new c(this.f12587r.getLooper());
            if (E()) {
                s(true);
            }
        } else if (aVar != null && v() && this.f12578i.d(aVar) == 1) {
            aVar.k(this.f12585p);
        }
        this.f12573d.b(this, this.f12586q);
    }

    @Override // P1.m
    public final m.a e() {
        I();
        if (this.f12585p == 1) {
            return this.f12590u;
        }
        return null;
    }

    @Override // P1.m
    public final J1.b f() {
        I();
        return this.f12589t;
    }

    @Override // P1.m
    public final int getState() {
        I();
        return this.f12585p;
    }

    @Override // P1.m
    public Map h() {
        I();
        byte[] bArr = this.f12591v;
        if (bArr == null) {
            return null;
        }
        return this.f12571b.a(bArr);
    }

    @Override // P1.m
    public boolean i(String str) {
        I();
        return this.f12571b.j((byte[]) AbstractC0853a.i(this.f12591v), str);
    }

    public final void r(InterfaceC0864l interfaceC0864l) {
        Iterator it = this.f12578i.e().iterator();
        while (it.hasNext()) {
            interfaceC0864l.accept((t.a) it.next());
        }
    }

    public final void s(boolean z10) {
        if (this.f12576g) {
            return;
        }
        byte[] bArr = (byte[]) M.i(this.f12591v);
        int i10 = this.f12574e;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.f12592w == null || H()) {
                    F(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            AbstractC0853a.e(this.f12592w);
            AbstractC0853a.e(this.f12591v);
            F(this.f12592w, 3, z10);
            return;
        }
        if (this.f12592w == null) {
            F(bArr, 1, z10);
            return;
        }
        if (this.f12585p == 4 || H()) {
            long jT = t();
            if (this.f12574e != 0 || jT > 60) {
                if (jT <= 0) {
                    w(new G(), 2);
                    return;
                } else {
                    this.f12585p = 4;
                    r(new InterfaceC0864l() { // from class: P1.f
                        @Override // G1.InterfaceC0864l
                        public final void accept(Object obj) {
                            ((t.a) obj).j();
                        }
                    });
                    return;
                }
            }
            G1.t.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jT);
            F(bArr, 2, z10);
        }
    }

    public final long t() {
        if (!AbstractC0747e.f1687d.equals(this.f12582m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) AbstractC0853a.e(K.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    public boolean u(byte[] bArr) {
        I();
        return Arrays.equals(this.f12591v, bArr);
    }

    public final boolean v() {
        int i10 = this.f12585p;
        return i10 == 3 || i10 == 4;
    }

    public final void w(final Throwable th, int i10) {
        this.f12590u = new m.a(th, x.b(th, i10));
        G1.t.d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            r(new InterfaceC0864l() { // from class: P1.e
                @Override // G1.InterfaceC0864l
                public final void accept(Object obj) {
                    ((t.a) obj).l((Exception) th);
                }
            });
        } else {
            if (!(th instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
            if (!x.e(th) && !x.d(th)) {
                throw ((Error) th);
            }
        }
        if (this.f12585p != 4) {
            this.f12585p = 1;
        }
    }

    public final void x(Object obj, Object obj2) {
        if (obj == this.f12593x && v()) {
            this.f12593x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                y((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f12574e == 3) {
                    this.f12571b.l((byte[]) M.i(this.f12592w), bArr);
                    r(new InterfaceC0864l() { // from class: P1.c
                        @Override // G1.InterfaceC0864l
                        public final void accept(Object obj3) {
                            ((t.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] bArrL = this.f12571b.l(this.f12591v, bArr);
                int i10 = this.f12574e;
                if ((i10 == 2 || (i10 == 0 && this.f12592w != null)) && bArrL != null && bArrL.length != 0) {
                    this.f12592w = bArrL;
                }
                this.f12585p = 4;
                r(new InterfaceC0864l() { // from class: P1.d
                    @Override // G1.InterfaceC0864l
                    public final void accept(Object obj3) {
                        ((t.a) obj3).h();
                    }
                });
            } catch (Exception | NoSuchMethodError e10) {
                y(e10, true);
            }
        }
    }

    public final void y(Throwable th, boolean z10) {
        if ((th instanceof NotProvisionedException) || x.d(th)) {
            this.f12572c.c(this);
        } else {
            w(th, z10 ? 1 : 2);
        }
    }

    public final void z() {
        if (this.f12574e == 0 && this.f12585p == 4) {
            M.i(this.f12591v);
            s(false);
        }
    }
}
