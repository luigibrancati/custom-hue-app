package X6;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import b0.C2777a;
import com.google.android.gms.internal.measurement.C3152b0;
import com.google.android.gms.internal.measurement.C3154b2;
import com.google.android.gms.internal.measurement.C3163c2;
import com.google.android.gms.internal.measurement.C3181e2;
import com.google.android.gms.internal.measurement.C3190f2;
import com.google.android.gms.internal.measurement.C3229j5;
import com.google.android.gms.internal.measurement.C3262n2;
import com.google.android.gms.internal.measurement.C3283p5;
import com.google.android.gms.internal.measurement.C3325u3;
import com.google.android.gms.internal.measurement.C3338w0;
import com.google.android.gms.internal.measurement.C3349x3;
import com.google.android.gms.internal.measurement.InterfaceC3311s7;
import com.google.android.gms.internal.measurement.N7;
import com.google.android.gms.internal.measurement.O7;
import io.sentry.ProfileChunk;
import io.sentry.ProfilingTraceData;
import io.sentry.SentryLockReason;
import io.sentry.TraceContext;
import io.sentry.protocol.App;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.a3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2344a3 extends C6 implements InterfaceC2428l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f18685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f18686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f18687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f18688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f18689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f18690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0.t f18691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC3311s7 f18692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f18693l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f18694m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f18695n;

    public C2344a3(R6 r62) {
        super(r62);
        this.f18685d = new C2777a();
        this.f18686e = new C2777a();
        this.f18687f = new C2777a();
        this.f18688g = new C2777a();
        this.f18689h = new C2777a();
        this.f18693l = new C2777a();
        this.f18694m = new C2777a();
        this.f18695n = new C2777a();
        this.f18690i = new C2777a();
        this.f18691j = new T2(this, 20);
        this.f18692k = new U2(this);
    }

    public static final Map u(C3190f2 c3190f2) {
        C2777a c2777a = new C2777a();
        if (c3190f2 != null) {
            for (C3262n2 c3262n2 : c3190f2.H()) {
                c2777a.put(c3262n2.D(), c3262n2.E());
            }
        }
        return c2777a;
    }

    public static final R3 v(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return R3.AD_STORAGE;
        }
        if (i11 == 2) {
            return R3.ANALYTICS_STORAGE;
        }
        if (i11 == 3) {
            return R3.AD_USER_DATA;
        }
        if (i11 != 4) {
            return null;
        }
        return R3.AD_PERSONALIZATION;
    }

    public final void A(String str) {
        h();
        this.f18694m.put(str, null);
    }

    public final void B(String str) {
        h();
        this.f18689h.remove(str);
    }

    public final boolean C(String str, byte[] bArr, String str2, String str3) {
        j();
        h();
        AbstractC6056k.f(str);
        C3181e2 c3181e2 = (C3181e2) t(str, bArr).q();
        r(str, c3181e2);
        s(str, (C3190f2) c3181e2.w());
        this.f18689h.put(str, (C3190f2) c3181e2.w());
        this.f18693l.put(str, c3181e2.G());
        this.f18694m.put(str, str2);
        this.f18695n.put(str, str3);
        this.f18685d.put(str, u((C3190f2) c3181e2.w()));
        this.f19261b.F0().Y(str, new ArrayList(c3181e2.C()));
        try {
            c3181e2.D();
            bArr = ((C3190f2) c3181e2.w()).b();
        } catch (RuntimeException e10) {
            this.f18400a.a().r().c("Unable to serialize reduced-size config. Storing full config instead. appId", C2542z2.x(str), e10);
        }
        C2515w c2515wF0 = this.f19261b.F0();
        AbstractC6056k.f(str);
        c2515wF0.h();
        c2515wF0.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (c2515wF0.u0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                c2515wF0.f18400a.a().o().b("Failed to update remote config (got 0). appId", C2542z2.x(str));
            }
        } catch (SQLiteException e11) {
            c2515wF0.f18400a.a().o().c("Error storing remote config. appId", C2542z2.x(str), e11);
        }
        c3181e2.E();
        this.f18689h.put(str, (C3190f2) c3181e2.w());
        return true;
    }

    public final boolean D(String str, String str2) {
        Boolean bool;
        h();
        q(str);
        if (H(str) && a7.N(str2)) {
            return true;
        }
        if (I(str) && a7.r0(str2)) {
            return true;
        }
        Map map = (Map) this.f18687f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean E(String str, String str2) {
        Boolean bool;
        h();
        q(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f18688g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final Set F(String str) {
        h();
        q(str);
        return (Set) this.f18686e.get(str);
    }

    public final int G(String str, String str2) {
        Integer num;
        h();
        q(str);
        Map map = (Map) this.f18690i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean H(String str) {
        return "1".equals(f(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean I(String str) {
        return "1".equals(f(str, "measurement.upload.blacklist_public"));
    }

    public final boolean J(String str) {
        h();
        q(str);
        Map map = this.f18686e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains(ProfilingTraceData.JsonKeys.DEVICE_MODEL) || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean K(String str) {
        h();
        q(str);
        Map map = this.f18686e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("os_version") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean L(String str) {
        h();
        q(str);
        Map map = this.f18686e;
        return map.get(str) != null && ((Set) map.get(str)).contains(TraceContext.JsonKeys.USER_ID);
    }

    public final boolean M(String str) {
        h();
        q(str);
        Map map = this.f18686e;
        return map.get(str) != null && ((Set) map.get(str)).contains("google_signals");
    }

    public final boolean N(String str) {
        h();
        q(str);
        Map map = this.f18686e;
        return map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id");
    }

    public final boolean O(String str) {
        h();
        q(str);
        Map map = this.f18686e;
        return map.get(str) != null && ((Set) map.get(str)).contains("enhanced_user_id");
    }

    public final boolean P(String str, R3 r32) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.Z1 z1R = R(str);
        if (z1R == null) {
            return false;
        }
        Iterator it = z1R.D().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.N1 n12 = (com.google.android.gms.internal.measurement.N1) it.next();
            if (r32 == v(n12.E())) {
                if (n12.F() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final R3 Q(String str, R3 r32) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.Z1 z1R = R(str);
        if (z1R == null) {
            return null;
        }
        for (com.google.android.gms.internal.measurement.P1 p12 : z1R.E()) {
            if (r32 == v(p12.E())) {
                return v(p12.F());
            }
        }
        return null;
    }

    public final com.google.android.gms.internal.measurement.Z1 R(String str) {
        h();
        q(str);
        C3190f2 c3190f2W = w(str);
        if (c3190f2W == null || !c3190f2W.P()) {
            return null;
        }
        return c3190f2W.Q();
    }

    public final boolean S(String str) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.Z1 z1R = R(str);
        return z1R == null || !z1R.G() || z1R.H();
    }

    public final SortedSet T(String str) {
        h();
        q(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.Z1 z1R = R(str);
        if (z1R != null) {
            Iterator it = z1R.F().iterator();
            while (it.hasNext()) {
                treeSet.add(((com.google.android.gms.internal.measurement.W1) it.next()).D());
            }
        }
        return treeSet;
    }

    @Override // X6.InterfaceC2428l
    public final String f(String str, String str2) {
        h();
        q(str);
        Map map = (Map) this.f18685d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // X6.C6
    public final boolean l() {
        return false;
    }

    public final P3 m(String str, R3 r32) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.Z1 z1R = R(str);
        if (z1R == null) {
            return P3.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.N1 n12 : z1R.I()) {
            if (v(n12.E()) == r32) {
                int iF = n12.F() - 1;
                return iF != 1 ? iF != 2 ? P3.UNINITIALIZED : P3.DENIED : P3.GRANTED;
            }
        }
        return P3.UNINITIALIZED;
    }

    public final boolean n(String str) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.Z1 z1R = R(str);
        if (z1R == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.N1 n12 : z1R.D()) {
            if (n12.E() == 3 && n12.G() == 3) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ C3152b0 o(String str) {
        j();
        AbstractC6056k.f(str);
        r rVarN0 = this.f19261b.F0().N0(str);
        if (rVarN0 == null) {
            return null;
        }
        this.f18400a.a().w().b("Populate EES config from database on cache miss. appId", str);
        s(str, t(str, rVarN0.f19176a));
        return (C3152b0) this.f18691j.k().get(str);
    }

    public final /* synthetic */ Map p() {
        return this.f18685d;
    }

    public final void q(String str) {
        j();
        h();
        AbstractC6056k.f(str);
        Map map = this.f18689h;
        if (map.get(str) == null) {
            r rVarN0 = this.f19261b.F0().N0(str);
            if (rVarN0 != null) {
                C3181e2 c3181e2 = (C3181e2) t(str, rVarN0.f19176a).q();
                r(str, c3181e2);
                this.f18685d.put(str, u((C3190f2) c3181e2.w()));
                map.put(str, (C3190f2) c3181e2.w());
                s(str, (C3190f2) c3181e2.w());
                this.f18693l.put(str, c3181e2.G());
                this.f18694m.put(str, rVarN0.f19177b);
                this.f18695n.put(str, rVarN0.f19178c);
                return;
            }
            this.f18685d.put(str, null);
            this.f18687f.put(str, null);
            this.f18686e.put(str, null);
            this.f18688g.put(str, null);
            map.put(str, null);
            this.f18693l.put(str, null);
            this.f18694m.put(str, null);
            this.f18695n.put(str, null);
            this.f18690i.put(str, null);
        }
    }

    public final void r(String str, C3181e2 c3181e2) {
        HashSet hashSet = new HashSet();
        C2777a c2777a = new C2777a();
        C2777a c2777a2 = new C2777a();
        C2777a c2777a3 = new C2777a();
        Iterator it = c3181e2.F().iterator();
        while (it.hasNext()) {
            hashSet.add(((C3154b2) it.next()).D());
        }
        for (int i10 = 0; i10 < c3181e2.z(); i10++) {
            C3163c2 c3163c2 = (C3163c2) c3181e2.A(i10).q();
            if (c3163c2.z().isEmpty()) {
                this.f18400a.a().r().a("EventConfig contained null event name");
            } else {
                String strZ = c3163c2.z();
                String strB = T3.b(c3163c2.z());
                if (!TextUtils.isEmpty(strB)) {
                    c3163c2.A(strB);
                    c3181e2.B(i10, c3163c2);
                }
                if (c3163c2.B() && c3163c2.C()) {
                    c2777a.put(strZ, Boolean.TRUE);
                }
                if (c3163c2.D() && c3163c2.E()) {
                    c2777a2.put(c3163c2.z(), Boolean.TRUE);
                }
                if (c3163c2.F()) {
                    if (c3163c2.G() < 2 || c3163c2.G() > 65535) {
                        this.f18400a.a().r().c("Invalid sampling rate. Event name, sample rate", c3163c2.z(), Integer.valueOf(c3163c2.G()));
                    } else {
                        c2777a3.put(c3163c2.z(), Integer.valueOf(c3163c2.G()));
                    }
                }
            }
        }
        this.f18686e.put(str, hashSet);
        this.f18687f.put(str, c2777a);
        this.f18688g.put(str, c2777a2);
        this.f18690i.put(str, c2777a3);
    }

    public final void s(final String str, C3190f2 c3190f2) {
        if (c3190f2.M() == 0) {
            this.f18691j.g(str);
            return;
        }
        C2416j3 c2416j3 = this.f18400a;
        c2416j3.a().w().b("EES programs found", Integer.valueOf(c3190f2.M()));
        C3349x3 c3349x3 = (C3349x3) c3190f2.L().get(0);
        try {
            C3152b0 c3152b0 = new C3152b0();
            c3152b0.a("internal.remoteConfig", new Callable() { // from class: X6.Z2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new C3283p5("internal.remoteConfig", new V2(this.f18667a, str));
                }
            });
            c3152b0.a("internal.appMetadata", new Callable() { // from class: X6.W2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    final C2344a3 c2344a3 = this.f18630a;
                    final String str2 = str;
                    return new O7("internal.appMetadata", new Callable() { // from class: X6.Y2
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            C2344a3 c2344a32 = c2344a3;
                            C2515w c2515wF0 = c2344a32.f19261b.F0();
                            String str3 = str2;
                            F2 f2J0 = c2515wF0.J0(str3);
                            HashMap map = new HashMap();
                            map.put("platform", ProfileChunk.PLATFORM_ANDROID);
                            map.put(SentryLockReason.JsonKeys.PACKAGE_NAME, str3);
                            c2344a32.f18400a.w().A();
                            map.put("gmp_version", 133005L);
                            if (f2J0 != null) {
                                String strD0 = f2J0.D0();
                                if (strD0 != null) {
                                    map.put(App.JsonKeys.APP_VERSION, strD0);
                                }
                                map.put("app_version_int", Long.valueOf(f2J0.F0()));
                                map.put("dynamite_version", Long.valueOf(f2J0.b()));
                            }
                            return map;
                        }
                    });
                }
            });
            c3152b0.a("internal.logger", new Callable() { // from class: X6.X2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new N7(this.f18649a.f18692k);
                }
            });
            c3152b0.f(c3349x3);
            this.f18691j.f(str, c3152b0);
            c2416j3.a().w().c("EES program loaded for appId, activities", str, Integer.valueOf(c3349x3.E().E()));
            Iterator it = c3349x3.E().D().iterator();
            while (it.hasNext()) {
                c2416j3.a().w().b("EES program activity", ((C3325u3) it.next()).D());
            }
        } catch (C3338w0 unused) {
            this.f18400a.a().o().b("Failed to load EES program. appId", str);
        }
    }

    public final C3190f2 t(String str, byte[] bArr) {
        if (bArr == null) {
            return C3190f2.U();
        }
        try {
            C3190f2 c3190f2 = (C3190f2) ((C3181e2) V6.W(C3190f2.T(), bArr)).w();
            this.f18400a.a().w().c("Parsed config. version, gmp_app_id", c3190f2.D() ? Long.valueOf(c3190f2.E()) : null, c3190f2.F() ? c3190f2.G() : null);
            return c3190f2;
        } catch (C3229j5 e10) {
            this.f18400a.a().r().c("Unable to merge remote config. appId", C2542z2.x(str), e10);
            return C3190f2.U();
        } catch (RuntimeException e11) {
            this.f18400a.a().r().c("Unable to merge remote config. appId", C2542z2.x(str), e11);
            return C3190f2.U();
        }
    }

    public final C3190f2 w(String str) {
        j();
        h();
        AbstractC6056k.f(str);
        q(str);
        return (C3190f2) this.f18689h.get(str);
    }

    public final String x(String str) {
        h();
        q(str);
        return (String) this.f18693l.get(str);
    }

    public final String y(String str) {
        h();
        return (String) this.f18694m.get(str);
    }

    public final String z(String str) {
        h();
        return (String) this.f18695n.get(str);
    }
}
