package O6;

import R9.AbstractC2105c;
import R9.C2109g;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import v6.C6053h;

/* JADX INFO: renamed from: O6.x5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1794x5 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static N5 f12040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final P5 f12041l = P5.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1746q5 f12044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R9.m f12045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Task f12046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Task f12047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f12048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f12050i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f12051j = new HashMap();

    public C1794x5(Context context, final R9.m mVar, InterfaceC1746q5 interfaceC1746q5, String str) {
        this.f12042a = context.getPackageName();
        this.f12043b = AbstractC2105c.a(context);
        this.f12045d = mVar;
        this.f12044c = interfaceC1746q5;
        K5.a();
        this.f12048g = str;
        this.f12046e = C2109g.a().b(new Callable() { // from class: O6.u5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f11964a.a();
            }
        });
        C2109g c2109gA = C2109g.a();
        mVar.getClass();
        this.f12047f = c2109gA.b(new Callable() { // from class: O6.v5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mVar.a();
            }
        });
        P5 p52 = f12041l;
        this.f12049h = p52.containsKey(str) ? DynamiteModule.c(context, (String) p52.get(str)) : -1;
    }

    public static synchronized N5 d() {
        try {
            N5 n52 = f12040k;
            if (n52 != null) {
                return n52;
            }
            U0.h hVarA = U0.e.a(Resources.getSystem().getConfiguration());
            C1725n5 c1725n5 = new C1725n5();
            for (int i10 = 0; i10 < hVarA.g(); i10++) {
                c1725n5.c(AbstractC2105c.b(hVarA.c(i10)));
            }
            N5 n5D = c1725n5.d();
            f12040k = n5D;
            return n5D;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ String a() {
        return C6053h.a().b(this.f12048g);
    }

    public final /* synthetic */ void b(InterfaceC1739p5 interfaceC1739p5, F3 f32, String str) {
        interfaceC1739p5.c(f32);
        String strB = interfaceC1739p5.b();
        K4 k42 = new K4();
        k42.b(this.f12042a);
        k42.c(this.f12043b);
        k42.h(d());
        k42.g(Boolean.TRUE);
        k42.l(strB);
        k42.j(str);
        k42.i(this.f12047f.q() ? (String) this.f12047f.m() : this.f12045d.a());
        k42.d(10);
        k42.k(Integer.valueOf(this.f12049h));
        interfaceC1739p5.d(k42);
        this.f12044c.a(interfaceC1739p5);
    }

    public final void c(H5 h52, final F3 f32) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f12050i.get(f32) != null && jElapsedRealtime - ((Long) this.f12050i.get(f32)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.f12050i.put(f32, Long.valueOf(jElapsedRealtime));
        int i10 = h52.f11306a;
        int i11 = h52.f11307b;
        int i12 = h52.f11308c;
        int i13 = h52.f11309d;
        int i14 = h52.f11310e;
        long j10 = h52.f11311f;
        int i15 = h52.f11312g;
        C1792x3 c1792x3 = new C1792x3();
        c1792x3.d(i10 != -1 ? i10 != 35 ? i10 != 842094169 ? i10 != 16 ? i10 != 17 ? EnumC1757s3.UNKNOWN_FORMAT : EnumC1757s3.NV21 : EnumC1757s3.NV16 : EnumC1757s3.YV12 : EnumC1757s3.YUV_420_888 : EnumC1757s3.BITMAP);
        c1792x3.f(i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? EnumC1799y3.ANDROID_MEDIA_IMAGE : EnumC1799y3.FILEPATH : EnumC1799y3.BYTEBUFFER : EnumC1799y3.BYTEARRAY : EnumC1799y3.BITMAP);
        c1792x3.c(Integer.valueOf(i12));
        c1792x3.e(Integer.valueOf(i13));
        c1792x3.g(Integer.valueOf(i14));
        c1792x3.b(Long.valueOf(j10));
        c1792x3.h(Integer.valueOf(i15));
        A3 a3J = c1792x3.j();
        G3 g32 = new G3();
        g32.d(a3J);
        final InterfaceC1739p5 interfaceC1739p5E = y5.e(g32);
        final String strB = this.f12046e.q() ? (String) this.f12046e.m() : C6053h.a().b(this.f12048g);
        C2109g.d().execute(new Runnable() { // from class: O6.w5
            @Override // java.lang.Runnable
            public final void run() {
                this.f12005a.b(interfaceC1739p5E, f32, strB);
            }
        });
    }
}
