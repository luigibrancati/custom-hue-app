package N6;

import R9.AbstractC2105c;
import R9.C2109g;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import v6.C6053h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Sa {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static AbstractC1487t0 f10053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AbstractC1513v0 f10054l = AbstractC1513v0.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia f10057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R9.m f10058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Task f10059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Task f10060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f10061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f10063i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f10064j = new HashMap();

    public Sa(Context context, final R9.m mVar, Ia ia2, String str) {
        this.f10055a = context.getPackageName();
        this.f10056b = AbstractC2105c.a(context);
        this.f10058d = mVar;
        this.f10057c = ia2;
        C1317fb.a();
        this.f10061g = str;
        this.f10059e = C2109g.a().b(new Callable() { // from class: N6.Oa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9986a.b();
            }
        });
        C2109g c2109gA = C2109g.a();
        Objects.requireNonNull(mVar);
        this.f10060f = c2109gA.b(new Callable() { // from class: N6.Pa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mVar.a();
            }
        });
        AbstractC1513v0 abstractC1513v0 = f10054l;
        this.f10062h = abstractC1513v0.containsKey(str) ? DynamiteModule.c(context, (String) abstractC1513v0.get(str)) : -1;
    }

    public static long a(List list, double d10) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d10 / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    public static synchronized AbstractC1487t0 i() {
        try {
            AbstractC1487t0 abstractC1487t0 = f10053k;
            if (abstractC1487t0 != null) {
                return abstractC1487t0;
            }
            U0.h hVarA = U0.e.a(Resources.getSystem().getConfiguration());
            C1449q0 c1449q0 = new C1449q0();
            for (int i10 = 0; i10 < hVarA.g(); i10++) {
                c1449q0.e(AbstractC2105c.b(hVarA.c(i10)));
            }
            AbstractC1487t0 abstractC1487t0G = c1449q0.g();
            f10053k = abstractC1487t0G;
            return abstractC1487t0G;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ String b() {
        return C6053h.a().b(this.f10061g);
    }

    public final /* synthetic */ void c(Ha ha2, EnumC1249a8 enumC1249a8, String str) {
        ha2.b(enumC1249a8);
        String strC = ha2.c();
        C1290da c1290da = new C1290da();
        c1290da.b(this.f10055a);
        c1290da.c(this.f10056b);
        c1290da.h(i());
        c1290da.g(Boolean.TRUE);
        c1290da.l(strC);
        c1290da.j(str);
        c1290da.i(this.f10060f.q() ? (String) this.f10060f.m() : this.f10058d.a());
        c1290da.d(10);
        c1290da.k(Integer.valueOf(this.f10062h));
        ha2.d(c1290da);
        this.f10057c.a(ha2);
    }

    public final void d(Ha ha2, EnumC1249a8 enumC1249a8) {
        e(ha2, enumC1249a8, j());
    }

    public final void e(final Ha ha2, final EnumC1249a8 enumC1249a8, final String str) {
        C2109g.d().execute(new Runnable() { // from class: N6.Ma
            @Override // java.lang.Runnable
            public final void run() {
                this.f9952a.c(ha2, enumC1249a8, str);
            }
        });
    }

    public final void f(Ra ra2, EnumC1249a8 enumC1249a8) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(enumC1249a8, jElapsedRealtime, 30L)) {
            this.f10063i.put(enumC1249a8, Long.valueOf(jElapsedRealtime));
            e(ra2.zza(), enumC1249a8, j());
        }
    }

    public final /* synthetic */ void g(EnumC1249a8 enumC1249a8, X9.k kVar) {
        InterfaceC1565z0 interfaceC1565z0 = (InterfaceC1565z0) this.f10064j.get(enumC1249a8);
        if (interfaceC1565z0 != null) {
            for (Object obj : interfaceC1565z0.l()) {
                ArrayList arrayList = new ArrayList(interfaceC1565z0.a(obj));
                Collections.sort(arrayList);
                C1559y7 c1559y7 = new C1559y7();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                c1559y7.a(Long.valueOf(jLongValue / ((long) arrayList.size())));
                c1559y7.c(Long.valueOf(a(arrayList, 100.0d)));
                c1559y7.f(Long.valueOf(a(arrayList, 75.0d)));
                c1559y7.d(Long.valueOf(a(arrayList, 50.0d)));
                c1559y7.b(Long.valueOf(a(arrayList, 25.0d)));
                c1559y7.e(Long.valueOf(a(arrayList, 0.0d)));
                e(kVar.a(obj, arrayList.size(), c1559y7.g()), enumC1249a8, j());
            }
            this.f10064j.remove(enumC1249a8);
        }
    }

    public final /* synthetic */ void h(final EnumC1249a8 enumC1249a8, Object obj, long j10, final X9.k kVar) {
        if (!this.f10064j.containsKey(enumC1249a8)) {
            this.f10064j.put(enumC1249a8, W.z());
        }
        ((InterfaceC1565z0) this.f10064j.get(enumC1249a8)).x(obj, Long.valueOf(j10));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(enumC1249a8, jElapsedRealtime, 30L)) {
            this.f10063i.put(enumC1249a8, Long.valueOf(jElapsedRealtime));
            C2109g.d().execute(new Runnable() { // from class: N6.Na
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9971a.g(enumC1249a8, kVar);
                }
            });
        }
    }

    public final String j() {
        if (this.f10059e.q()) {
            return (String) this.f10059e.m();
        }
        return C6053h.a().b(this.f10061g);
    }

    public final boolean k(EnumC1249a8 enumC1249a8, long j10, long j11) {
        return this.f10063i.get(enumC1249a8) == null || j10 - ((Long) this.f10063i.get(enumC1249a8)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
