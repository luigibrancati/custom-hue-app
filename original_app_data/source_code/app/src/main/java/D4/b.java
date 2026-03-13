package D4;

import J4.m;
import M4.l;
import Od.F;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.ar.core.ImageMetadata;
import io.sentry.TransactionOptions;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f2244x = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f2250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f2251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f2252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f2253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q f2254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2256l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f2257m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f2258n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public E4.g f2259o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public E4.f f2260p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f2261q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f2262r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l f2263s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Boolean f2264t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f2265u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Long f2266v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public K4.f f2267w;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public b(String apiKey, int i10, int i11, String instanceName, boolean z10, g storageProvider, c loggerProvider, Integer num, String str, q qVar, int i12, boolean z11, d serverZone, String str2, E4.g gVar, E4.f fVar, long j10, g identifyInterceptStorageProvider, l identityStorageProvider, Boolean bool, String str3, Long l10, K4.f fVar2) {
        AbstractC4862t.e(apiKey, "apiKey");
        AbstractC4862t.e(instanceName, "instanceName");
        AbstractC4862t.e(storageProvider, "storageProvider");
        AbstractC4862t.e(loggerProvider, "loggerProvider");
        AbstractC4862t.e(serverZone, "serverZone");
        AbstractC4862t.e(identifyInterceptStorageProvider, "identifyInterceptStorageProvider");
        AbstractC4862t.e(identityStorageProvider, "identityStorageProvider");
        this.f2245a = apiKey;
        this.f2246b = i10;
        this.f2247c = i11;
        this.f2248d = instanceName;
        this.f2249e = z10;
        this.f2250f = storageProvider;
        this.f2251g = loggerProvider;
        this.f2252h = num;
        this.f2253i = str;
        this.f2254j = qVar;
        this.f2255k = i12;
        this.f2256l = z11;
        this.f2257m = serverZone;
        this.f2258n = str2;
        this.f2259o = gVar;
        this.f2260p = fVar;
        this.f2261q = j10;
        this.f2262r = identifyInterceptStorageProvider;
        this.f2263s = identityStorageProvider;
        this.f2264t = bool;
        this.f2265u = str3;
        this.f2266v = l10;
        this.f2267w = fVar2;
    }

    public final String a() {
        String strS = s();
        if (strS != null) {
            return strS;
        }
        d dVarT = t();
        d dVar = d.EU;
        return (dVarT == dVar && w()) ? "https://api.eu.amplitude.com/batch" : t() == dVar ? "https://api.eu.amplitude.com/2/httpapi" : w() ? "https://api2.amplitude.com/batch" : "https://api2.amplitude.com/2/httpapi";
    }

    public final String b() {
        return this.f2245a;
    }

    public abstract q c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract K4.f g();

    public abstract long h();

    public abstract g i();

    public abstract l j();

    public abstract E4.f k();

    public abstract String l();

    public abstract c m();

    public abstract Integer n();

    public abstract Boolean o();

    public abstract boolean p();

    public abstract String q();

    public abstract E4.g r();

    public abstract String s();

    public abstract d t();

    public abstract Long u();

    public abstract g v();

    public abstract boolean w();

    public final boolean x() {
        Integer numN = n();
        return numN == null || numN.intValue() > 0;
    }

    public final boolean y() {
        return !F.k0(this.f2245a) && f() > 0 && d() > 0 && x();
    }

    public abstract void z(Boolean bool);

    public /* synthetic */ b(String str, int i10, int i11, String str2, boolean z10, g gVar, c cVar, Integer num, String str3, q qVar, int i12, boolean z11, d dVar, String str4, E4.g gVar2, E4.f fVar, long j10, g gVar3, l lVar, Boolean bool, String str5, Long l10, K4.f fVar2, int i13, AbstractC4854k abstractC4854k) {
        this(str, (i13 & 2) != 0 ? 30 : i10, (i13 & 4) != 0 ? 30000 : i11, (i13 & 8) != 0 ? "$default_instance" : str2, (i13 & 16) != 0 ? false : z10, (i13 & 32) != 0 ? new m() : gVar, (i13 & 64) != 0 ? new J4.b() : cVar, (i13 & 128) != 0 ? null : num, (i13 & 256) != 0 ? null : str3, (i13 & 512) != 0 ? null : qVar, (i13 & RecognitionOptions.UPC_E) != 0 ? 5 : i12, (i13 & RecognitionOptions.PDF417) == 0 ? z11 : false, (i13 & RecognitionOptions.AZTEC) != 0 ? d.US : dVar, (i13 & 8192) != 0 ? null : str4, (i13 & 16384) != 0 ? null : gVar2, (i13 & 32768) != 0 ? null : fVar, (i13 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION : j10, (i13 & 131072) != 0 ? new m() : gVar3, (i13 & 262144) != 0 ? new M4.d() : lVar, (i13 & ImageMetadata.LENS_APERTURE) != 0 ? Boolean.FALSE : bool, (i13 & ImageMetadata.SHADING_MODE) != 0 ? null : str5, (i13 & 2097152) != 0 ? null : l10, (i13 & 4194304) != 0 ? null : fVar2);
    }
}
