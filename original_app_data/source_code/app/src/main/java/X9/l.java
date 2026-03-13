package X9;

import N6.A7;
import N6.C1262b8;
import N6.C1269c2;
import N6.C1282d2;
import N6.C1308f2;
import N6.C1418n8;
import N6.C1449q0;
import N6.E7;
import N6.EnumC1249a8;
import N6.F7;
import N6.Ha;
import N6.L7;
import N6.Ra;
import N6.Sa;
import N6.Ua;
import N6.Va;
import N6.Y7;
import N6.Z7;
import R9.AbstractC2108f;
import R9.C2109g;
import R9.C2111i;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends AbstractC2108f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Z9.d f19406j = Z9.d.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f19407k = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T9.b f19408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f19409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Sa f19410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ua f19411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Z9.a f19412h = new Z9.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19413i;

    public l(C2111i c2111i, T9.b bVar, m mVar, Sa sa2) {
        AbstractC6056k.m(c2111i, "MlKitContext can not be null");
        AbstractC6056k.m(bVar, "BarcodeScannerOptions can not be null");
        this.f19408d = bVar;
        this.f19409e = mVar;
        this.f19410f = sa2;
        this.f19411g = Ua.a(c2111i.b());
    }

    @Override // R9.k
    public final synchronized void b() {
        this.f19413i = this.f19409e.b();
    }

    @Override // R9.k
    public final synchronized void d() {
        try {
            this.f19409e.zzb();
            f19407k = true;
            C1262b8 c1262b8 = new C1262b8();
            Y7 y72 = this.f19413i ? Y7.TYPE_THICK : Y7.TYPE_THIN;
            Sa sa2 = this.f19410f;
            c1262b8.e(y72);
            C1418n8 c1418n8 = new C1418n8();
            c1418n8.i(b.c(this.f19408d));
            c1262b8.g(c1418n8.j());
            sa2.d(Va.e(c1262b8), EnumC1249a8.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ Ha j(long j10, Z7 z72, C1449q0 c1449q0, C1449q0 c1449q02, Y9.a aVar) {
        C1418n8 c1418n8 = new C1418n8();
        L7 l72 = new L7();
        l72.c(Long.valueOf(j10));
        l72.d(z72);
        l72.e(Boolean.valueOf(f19407k));
        Boolean bool = Boolean.TRUE;
        l72.a(bool);
        l72.b(bool);
        c1418n8.h(l72.f());
        c1418n8.i(b.c(this.f19408d));
        c1418n8.e(c1449q0.g());
        c1418n8.f(c1449q02.g());
        int iG = aVar.g();
        int iC = f19406j.c(aVar);
        E7 e72 = new E7();
        e72.a(iG != -1 ? iG != 35 ? iG != 842094169 ? iG != 16 ? iG != 17 ? F7.UNKNOWN_FORMAT : F7.NV21 : F7.NV16 : F7.YV12 : F7.YUV_420_888 : F7.BITMAP);
        e72.b(Integer.valueOf(iC));
        c1418n8.g(e72.d());
        C1262b8 c1262b8 = new C1262b8();
        c1262b8.e(this.f19413i ? Y7.TYPE_THICK : Y7.TYPE_THIN);
        c1262b8.g(c1418n8.j());
        return Va.e(c1262b8);
    }

    public final /* synthetic */ Ha k(C1308f2 c1308f2, int i10, A7 a72) {
        C1262b8 c1262b8 = new C1262b8();
        c1262b8.e(this.f19413i ? Y7.TYPE_THICK : Y7.TYPE_THIN);
        C1269c2 c1269c2 = new C1269c2();
        c1269c2.a(Integer.valueOf(i10));
        c1269c2.c(c1308f2);
        c1269c2.b(a72);
        c1262b8.d(c1269c2.e());
        return Va.e(c1262b8);
    }

    @Override // R9.AbstractC2108f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized List i(Y9.a aVar) throws Throwable {
        l lVar;
        Y9.a aVar2;
        List listA;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            Z9.a aVar3 = this.f19412h;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar3.a(aVar);
            try {
                listA = this.f19409e.a(aVar);
                lVar = this;
                aVar2 = aVar;
            } catch (N9.a e10) {
                e = e10;
                lVar = this;
                aVar2 = aVar;
            }
            try {
                lVar.m(Z7.NO_ERROR, jElapsedRealtime, aVar2, listA);
                f19407k = false;
                return listA;
            } catch (N9.a e11) {
                e = e11;
                N9.a aVar4 = e;
                lVar.m(aVar4.a() == 14 ? Z7.MODEL_NOT_DOWNLOADED : Z7.UNKNOWN_ERROR, jElapsedRealtime, aVar2, null);
                throw aVar4;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
        throw th;
    }

    public final void m(final Z7 z72, long j10, final Y9.a aVar, List list) {
        final C1449q0 c1449q0 = new C1449q0();
        final C1449q0 c1449q02 = new C1449q0();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                V9.a aVar2 = (V9.a) it.next();
                c1449q0.e(b.a(aVar2.h()));
                c1449q02.e(b.b(aVar2.o()));
            }
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f19410f.f(new Ra() { // from class: X9.j
            @Override // N6.Ra
            public final Ha zza() {
                return this.f19399a.j(jElapsedRealtime, z72, c1449q0, c1449q02, aVar);
            }
        }, EnumC1249a8.ON_DEVICE_BARCODE_DETECT);
        C1282d2 c1282d2 = new C1282d2();
        c1282d2.e(z72);
        c1282d2.f(Boolean.valueOf(f19407k));
        c1282d2.g(b.c(this.f19408d));
        c1282d2.c(c1449q0.g());
        c1282d2.d(c1449q02.g());
        final C1308f2 c1308f2H = c1282d2.h();
        final k kVar = new k(this);
        final Sa sa2 = this.f19410f;
        final EnumC1249a8 enumC1249a8 = EnumC1249a8.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        C2109g.d().execute(new Runnable() { // from class: N6.Qa
            @Override // java.lang.Runnable
            public final void run() {
                sa2.h(enumC1249a8, c1308f2H, jElapsedRealtime, kVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f19411g.c(true != this.f19413i ? 24301 : 24302, z72.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }
}
