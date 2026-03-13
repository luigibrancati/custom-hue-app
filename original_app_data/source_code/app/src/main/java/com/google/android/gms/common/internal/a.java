package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import s6.C5783b;
import s6.C5785d;
import v6.AbstractC6050e;
import v6.AbstractC6056k;
import v6.C6049d;
import v6.C6057l;
import v6.M;
import v6.N;
import v6.S;
import v6.X;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C5783b f29041A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f29042B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public volatile N f29043C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public AtomicInteger f29044D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f29046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f29047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f29049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile String f29050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public X f29051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f29052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Looper f29053i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC6050e f29054j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.gms.common.a f29055k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f29056l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f29057m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f29058n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IGmsServiceBroker f29059o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f29060p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public IInterface f29061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f29062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i f29063s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f29064t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC0356a f29065u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f29066v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f29067w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f29068x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile String f29069y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile D6.a f29070z;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final C5785d[] f29040F = new C5785d[0];

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String[] f29039E = {"service_esmobile", "service_googleme"};

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0356a {
        void K(Bundle bundle);

        void X(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void D(C5783b c5783b);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        void a(C5783b c5783b);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f29071a;

        public d(a aVar) {
            Objects.requireNonNull(aVar);
            this.f29071a = aVar;
        }

        @Override // com.google.android.gms.common.internal.a.c
        public final void a(C5783b c5783b) {
            if (c5783b.l()) {
                a aVar = this.f29071a;
                aVar.j(null, aVar.B());
            } else {
                a aVar2 = this.f29071a;
                if (aVar2.e0() != null) {
                    aVar2.e0().D(c5783b);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, Looper looper, int i10, InterfaceC0356a interfaceC0356a, b bVar, String str) {
        AbstractC6050e abstractC6050eA = AbstractC6050e.a(context);
        com.google.android.gms.common.a aVarF = com.google.android.gms.common.a.f();
        AbstractC6056k.l(interfaceC0356a);
        AbstractC6056k.l(bVar);
        this(context, looper, abstractC6050eA, aVarF, i10, interfaceC0356a, bVar, str);
    }

    public String A() {
        return null;
    }

    public Set B() {
        return Collections.EMPTY_SET;
    }

    public final IInterface C() {
        IInterface iInterface;
        synchronized (this.f29057m) {
            try {
                if (this.f29064t == 5) {
                    throw new DeadObjectException();
                }
                q();
                iInterface = this.f29061q;
                AbstractC6056k.m(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String D();

    public abstract String E();

    public String F() {
        return "com.google.android.gms";
    }

    public C6049d G() {
        N n10 = this.f29043C;
        if (n10 == null) {
            return null;
        }
        return n10.f45796d;
    }

    public boolean H() {
        return m() >= 211700000;
    }

    public boolean I() {
        return this.f29043C != null;
    }

    public void J(IInterface iInterface) {
        this.f29047c = System.currentTimeMillis();
    }

    public void K(C5783b c5783b) {
        this.f29048d = c5783b.e();
        this.f29049e = System.currentTimeMillis();
    }

    public void L(int i10) {
        this.f29045a = i10;
        this.f29046b = System.currentTimeMillis();
    }

    public void M(int i10, IBinder iBinder, Bundle bundle, int i11) {
        j jVar = new j(this, i10, iBinder, bundle);
        Handler handler = this.f29056l;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, jVar));
    }

    public boolean N() {
        return false;
    }

    public void O(D6.a aVar) {
        this.f29070z = aVar;
    }

    public void P(String str) {
        this.f29069y = str;
    }

    public void Q(int i10) {
        int i11 = this.f29044D.get();
        Handler handler = this.f29056l;
        handler.sendMessage(handler.obtainMessage(6, i11, i10));
    }

    public void R(c cVar, int i10, PendingIntent pendingIntent) {
        AbstractC6056k.m(cVar, "Connection progress callbacks cannot be null.");
        this.f29060p = cVar;
        int i11 = this.f29044D.get();
        Handler handler = this.f29056l;
        handler.sendMessage(handler.obtainMessage(3, i11, i10, pendingIntent));
    }

    public boolean S() {
        return false;
    }

    public final String T() {
        String str = this.f29068x;
        return str == null ? this.f29052h.getClass().getName() : str;
    }

    public final void U(int i10, Bundle bundle, int i11) {
        k kVar = new k(this, i10, bundle);
        Handler handler = this.f29056l;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, kVar));
    }

    public final /* synthetic */ void V(N n10) {
        this.f29043C = n10;
        if (S()) {
            C6049d c6049d = n10.f45796d;
            C6057l.b().c(c6049d == null ? null : c6049d.l());
        }
    }

    public final /* synthetic */ void W(int i10, IInterface iInterface) {
        i0(i10, null);
    }

    public final /* synthetic */ boolean X(int i10, int i11, IInterface iInterface) {
        synchronized (this.f29057m) {
            try {
                if (this.f29064t != i10) {
                    return false;
                }
                i0(i11, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void Y(int i10) {
        int i11;
        int i12;
        synchronized (this.f29057m) {
            i11 = this.f29064t;
        }
        if (i11 == 3) {
            this.f29042B = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = this.f29056l;
        handler.sendMessage(handler.obtainMessage(i12, this.f29044D.get(), 16));
    }

    public final /* synthetic */ boolean Z() {
        if (this.f29042B || TextUtils.isEmpty(D()) || TextUtils.isEmpty(A())) {
            return false;
        }
        try {
            Class.forName(D());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public void a(String str) {
        this.f29050f = str;
        k();
    }

    public final /* synthetic */ Object a0() {
        return this.f29058n;
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f29057m) {
            int i10 = this.f29064t;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public final /* synthetic */ void b0(IGmsServiceBroker iGmsServiceBroker) {
        this.f29059o = iGmsServiceBroker;
    }

    public String c() {
        X x10;
        if (!isConnected() || (x10 = this.f29051g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return x10.b();
    }

    public final /* synthetic */ ArrayList c0() {
        return this.f29062r;
    }

    public void d(c cVar) {
        AbstractC6056k.m(cVar, "Connection progress callbacks cannot be null.");
        this.f29060p = cVar;
        i0(2, null);
    }

    public final /* synthetic */ InterfaceC0356a d0() {
        return this.f29065u;
    }

    public boolean e() {
        return true;
    }

    public final /* synthetic */ b e0() {
        return this.f29066v;
    }

    public final /* synthetic */ C5783b f0() {
        return this.f29041A;
    }

    public final /* synthetic */ void g0(C5783b c5783b) {
        this.f29041A = c5783b;
    }

    public boolean h() {
        return false;
    }

    public final /* synthetic */ boolean h0() {
        return this.f29042B;
    }

    public final void i0(int i10, IInterface iInterface) {
        X x10;
        AbstractC6056k.a((i10 == 4) == (iInterface != null));
        synchronized (this.f29057m) {
            try {
                this.f29064t = i10;
                this.f29061q = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    i iVar = this.f29063s;
                    if (iVar != null) {
                        AbstractC6050e abstractC6050e = this.f29054j;
                        String strA = this.f29051g.a();
                        AbstractC6056k.l(strA);
                        abstractC6050e.d(strA, this.f29051g.b(), 4225, iVar, T(), this.f29051g.c());
                        this.f29063s = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    i iVar2 = this.f29063s;
                    if (iVar2 != null && (x10 = this.f29051g) != null) {
                        String strA2 = x10.a();
                        String strB = x10.b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strA2).length() + 70 + String.valueOf(strB).length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(strA2);
                        sb2.append(" on ");
                        sb2.append(strB);
                        Log.e("GmsClient", sb2.toString());
                        AbstractC6050e abstractC6050e2 = this.f29054j;
                        String strA3 = this.f29051g.a();
                        AbstractC6056k.l(strA3);
                        abstractC6050e2.d(strA3, this.f29051g.b(), 4225, iVar2, T(), this.f29051g.c());
                        this.f29044D.incrementAndGet();
                    }
                    i iVar3 = new i(this, this.f29044D.get());
                    this.f29063s = iVar3;
                    X x11 = (this.f29064t != 3 || A() == null) ? new X(F(), E(), false, 4225, H()) : new X(x().getPackageName(), A(), true, 4225, false);
                    this.f29051g = x11;
                    if (x11.c() && m() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f29051g.a())));
                    }
                    AbstractC6050e abstractC6050e3 = this.f29054j;
                    String strA4 = this.f29051g.a();
                    AbstractC6056k.l(strA4);
                    C5783b c5783bC = abstractC6050e3.c(new S(strA4, this.f29051g.b(), 4225, this.f29051g.c()), iVar3, T(), v());
                    if (!c5783bC.l()) {
                        String strA5 = this.f29051g.a();
                        String strB2 = this.f29051g.b();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(strA5).length() + 34 + String.valueOf(strB2).length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(strA5);
                        sb3.append(" on ");
                        sb3.append(strB2);
                        Log.w("GmsClient", sb3.toString());
                        int iE = c5783bC.e() == -1 ? 16 : c5783bC.e();
                        if (c5783bC.h() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", c5783bC.h());
                        }
                        U(iE, bundle, this.f29044D.get());
                    }
                } else if (i10 == 4) {
                    AbstractC6056k.l(iInterface);
                    J(iInterface);
                }
            } finally {
            }
        }
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.f29057m) {
            z10 = this.f29064t == 4;
        }
        return z10;
    }

    public void j(IAccountAccessor iAccountAccessor, Set set) {
        AttributionSource attributionSourceA;
        Bundle bundleZ = z();
        String attributionTag = (this.f29070z == null || (attributionSourceA = this.f29070z.a()) == null || attributionSourceA.getAttributionTag() == null) ? this.f29069y : attributionSourceA.getAttributionTag();
        String str = attributionTag;
        int i10 = this.f29067w;
        int i11 = com.google.android.gms.common.a.f29014a;
        Scope[] scopeArr = com.google.android.gms.common.internal.b.f29072o;
        Bundle bundle = new Bundle();
        C5785d[] c5785dArr = com.google.android.gms.common.internal.b.f29073p;
        com.google.android.gms.common.internal.b bVar = new com.google.android.gms.common.internal.b(6, i10, i11, null, null, scopeArr, bundle, null, c5785dArr, c5785dArr, true, 0, false, str);
        bVar.f29077d = this.f29052h.getPackageName();
        bVar.f29080g = bundleZ;
        if (set != null) {
            bVar.f29079f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (h()) {
            Account accountT = t();
            if (accountT == null) {
                accountT = new Account("<<default account>>", "com.google");
            }
            bVar.f29081h = accountT;
            if (iAccountAccessor != null) {
                bVar.f29078e = iAccountAccessor.asBinder();
            }
        } else if (N()) {
            bVar.f29081h = t();
        }
        bVar.f29082i = f29040F;
        bVar.f29083j = u();
        if (S()) {
            bVar.f29086m = true;
        }
        try {
            try {
                synchronized (this.f29058n) {
                    try {
                        IGmsServiceBroker iGmsServiceBroker = this.f29059o;
                        if (iGmsServiceBroker != null) {
                            iGmsServiceBroker.M2(new zzd(this, this.f29044D.get()), bVar);
                        } else {
                            Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                        }
                    } finally {
                    }
                }
            } catch (DeadObjectException e10) {
                Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
                Q(3);
            } catch (SecurityException e11) {
                throw e11;
            }
        } catch (RemoteException | RuntimeException e12) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e12);
            M(8, null, null, this.f29044D.get());
        }
    }

    public void k() {
        this.f29044D.incrementAndGet();
        ArrayList arrayList = this.f29062r;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((M) arrayList.get(i10)).d();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f29058n) {
            this.f29059o = null;
        }
        i0(1, null);
    }

    public void l(e eVar) {
        eVar.a();
    }

    public abstract int m();

    public final C5785d[] n() {
        N n10 = this.f29043C;
        if (n10 == null) {
            return null;
        }
        return n10.f45794b;
    }

    public String o() {
        return this.f29050f;
    }

    public void p() {
        int iH = this.f29055k.h(this.f29052h, m());
        if (iH == 0) {
            d(new d(this));
        } else {
            i0(1, null);
            R(new d(this), iH, null);
        }
    }

    public final void q() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public abstract IInterface r(IBinder iBinder);

    public boolean s() {
        return false;
    }

    public Account t() {
        return null;
    }

    public C5785d[] u() {
        return f29040F;
    }

    public Executor v() {
        return null;
    }

    public Bundle w() {
        return null;
    }

    public final Context x() {
        return this.f29052h;
    }

    public int y() {
        return this.f29067w;
    }

    public Bundle z() {
        return new Bundle();
    }

    public a(Context context, Looper looper, AbstractC6050e abstractC6050e, com.google.android.gms.common.a aVar, int i10, InterfaceC0356a interfaceC0356a, b bVar, String str) {
        this.f29050f = null;
        this.f29057m = new Object();
        this.f29058n = new Object();
        this.f29062r = new ArrayList();
        this.f29064t = 1;
        this.f29041A = null;
        this.f29042B = false;
        this.f29043C = null;
        this.f29044D = new AtomicInteger(0);
        AbstractC6056k.m(context, "Context must not be null");
        this.f29052h = context;
        AbstractC6056k.m(looper, "Looper must not be null");
        this.f29053i = looper;
        AbstractC6056k.m(abstractC6050e, "Supervisor must not be null");
        this.f29054j = abstractC6050e;
        AbstractC6056k.m(aVar, "API availability must not be null");
        this.f29055k = aVar;
        this.f29056l = new h(this, looper);
        this.f29067w = i10;
        this.f29065u = interfaceC0356a;
        this.f29066v = bVar;
        this.f29068x = str;
    }
}
