package q4;

import io.sentry.ProfilingTraceData;
import io.sentry.protocol.Geo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: q4.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5497m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f43258b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f43259c = C5497m.class.getName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f43260d = {Geo.JsonKeys.CITY, "country", "dma", "ip_address", "lat_lng", Geo.JsonKeys.REGION};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f43261e = {"adid", Geo.JsonKeys.CITY, "ip_address", "lat_lng"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f43262a = new HashSet();

    /* JADX INFO: renamed from: q4.m$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C5497m a() {
            C5497m c5497m = new C5497m();
            for (String str : C5497m.f43261e) {
                c5497m.t(str);
            }
            return c5497m;
        }

        public a() {
        }
    }

    public final boolean A() {
        return D("device_brand");
    }

    public final boolean B() {
        return D(ProfilingTraceData.JsonKeys.DEVICE_MANUFACTURER);
    }

    public final boolean C() {
        return D(ProfilingTraceData.JsonKeys.DEVICE_MODEL);
    }

    public final boolean D(String str) {
        return !this.f43262a.contains(str);
    }

    public final boolean E() {
        return D("ip_address");
    }

    public final boolean F() {
        return D("language");
    }

    public final boolean G() {
        return D("lat_lng");
    }

    public final boolean H() {
        return D("os_name");
    }

    public final boolean I() {
        return D("os_version");
    }

    public final boolean J() {
        return D("platform");
    }

    public final boolean K() {
        return D(ProfilingTraceData.JsonKeys.RELEASE);
    }

    public final C5497m c() {
        t("adid");
        return this;
    }

    public final C5497m d() {
        t("api_level");
        return this;
    }

    public final C5497m e() {
        t("app_set_id");
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC4862t.a(C5497m.class, obj.getClass())) {
            return AbstractC4862t.a(((C5497m) obj).f43262a, this.f43262a);
        }
        return false;
    }

    public final C5497m f() {
        t("carrier");
        return this;
    }

    public final C5497m g() {
        t(Geo.JsonKeys.CITY);
        return this;
    }

    public final C5497m h() {
        t("country");
        return this;
    }

    public final C5497m i() {
        t("device_brand");
        return this;
    }

    public final C5497m j() {
        t(ProfilingTraceData.JsonKeys.DEVICE_MANUFACTURER);
        return this;
    }

    public final C5497m k() {
        t(ProfilingTraceData.JsonKeys.DEVICE_MODEL);
        return this;
    }

    public final C5497m l() {
        t("dma");
        return this;
    }

    public final C5497m m() {
        t("ip_address");
        return this;
    }

    public final C5497m n() {
        t("language");
        return this;
    }

    public final C5497m o() {
        t("lat_lng");
        return this;
    }

    public final C5497m p() {
        t("os_name");
        return this;
    }

    public final C5497m q() {
        t("os_version");
        return this;
    }

    public final C5497m r() {
        t("platform");
        return this;
    }

    public final C5497m s() {
        t(Geo.JsonKeys.REGION);
        return this;
    }

    public final void t(String str) {
        this.f43262a.add(str);
    }

    public final C5497m u() {
        t(ProfilingTraceData.JsonKeys.RELEASE);
        return this;
    }

    public final C5497m v(C5497m other) {
        AbstractC4862t.e(other, "other");
        Iterator it = other.f43262a.iterator();
        while (it.hasNext()) {
            t((String) it.next());
        }
        return this;
    }

    public final boolean w() {
        return D("adid");
    }

    public final boolean x() {
        return D("app_set_id");
    }

    public final boolean y() {
        return D("carrier");
    }

    public final boolean z() {
        return D("country");
    }
}
