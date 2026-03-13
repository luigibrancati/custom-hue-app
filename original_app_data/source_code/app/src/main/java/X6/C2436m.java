package X6;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2436m extends L3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f19092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f19093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC2428l f19094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f19095e;

    public C2436m(C2416j3 c2416j3) {
        super(c2416j3);
        this.f19094d = new InterfaceC2428l() { // from class: X6.k
            @Override // X6.InterfaceC2428l
            public final /* synthetic */ String f(String str, String str2) {
                return null;
            }
        };
    }

    public static final long n() {
        return ((Long) AbstractC2383f2.f18881e.b(null)).longValue();
    }

    public static final int o() {
        return Math.max(0, ((Integer) AbstractC2383f2.f18896j.b(null)).intValue());
    }

    public static final long p() {
        return ((Integer) AbstractC2383f2.f18902l.b(null)).intValue();
    }

    public static final long q() {
        return ((Long) AbstractC2383f2.f18853S.b(null)).longValue();
    }

    public static final long r() {
        return ((Long) AbstractC2383f2.f18843N.b(null)).longValue();
    }

    public final long A() {
        this.f18400a.c();
        return 133005L;
    }

    public final boolean B() {
        if (this.f19095e == null) {
            synchronized (this) {
                try {
                    if (this.f19095e == null) {
                        C2416j3 c2416j3 = this.f18400a;
                        ApplicationInfo applicationInfo = c2416j3.d().getApplicationInfo();
                        String strA = B6.m.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z10 = false;
                            if (str != null && str.equals(strA)) {
                                z10 = true;
                            }
                            this.f19095e = Boolean.valueOf(z10);
                        }
                        if (this.f19095e == null) {
                            this.f19095e = Boolean.TRUE;
                            c2416j3.a().o().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f19095e.booleanValue();
    }

    public final String C(String str, C2375e2 c2375e2) {
        return TextUtils.isEmpty(str) ? (String) c2375e2.b(null) : (String) c2375e2.b(this.f19094d.f(str, c2375e2.a()));
    }

    public final long D(String str, C2375e2 c2375e2) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c2375e2.b(null)).longValue();
        }
        String strF = this.f19094d.f(str, c2375e2.a());
        if (TextUtils.isEmpty(strF)) {
            return ((Long) c2375e2.b(null)).longValue();
        }
        try {
            return ((Long) c2375e2.b(Long.valueOf(Long.parseLong(strF)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c2375e2.b(null)).longValue();
        }
    }

    public final int E(String str, C2375e2 c2375e2) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c2375e2.b(null)).intValue();
        }
        String strF = this.f19094d.f(str, c2375e2.a());
        if (TextUtils.isEmpty(strF)) {
            return ((Integer) c2375e2.b(null)).intValue();
        }
        try {
            return ((Integer) c2375e2.b(Integer.valueOf(Integer.parseInt(strF)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c2375e2.b(null)).intValue();
        }
    }

    public final int F(String str, C2375e2 c2375e2, int i10, int i11) {
        return Math.max(Math.min(E(str, c2375e2), i11), i10);
    }

    public final double G(String str, C2375e2 c2375e2) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c2375e2.b(null)).doubleValue();
        }
        String strF = this.f19094d.f(str, c2375e2.a());
        if (TextUtils.isEmpty(strF)) {
            return ((Double) c2375e2.b(null)).doubleValue();
        }
        try {
            return ((Double) c2375e2.b(Double.valueOf(Double.parseDouble(strF)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c2375e2.b(null)).doubleValue();
        }
    }

    public final boolean H(String str, C2375e2 c2375e2) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c2375e2.b(null)).booleanValue();
        }
        String strF = this.f19094d.f(str, c2375e2.a());
        return TextUtils.isEmpty(strF) ? ((Boolean) c2375e2.b(null)).booleanValue() : ((Boolean) c2375e2.b(Boolean.valueOf("1".equals(strF)))).booleanValue();
    }

    public final Bundle I() {
        try {
            C2416j3 c2416j3 = this.f18400a;
            if (c2416j3.d().getPackageManager() == null) {
                c2416j3.a().o().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = D6.d.a(c2416j3.d()).c(c2416j3.d().getPackageName(), 128);
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            c2416j3.a().o().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f18400a.a().o().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    public final Boolean J(String str) {
        AbstractC6056k.f(str);
        Bundle bundleI = I();
        if (bundleI == null) {
            this.f18400a.a().o().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleI.containsKey(str)) {
            return Boolean.valueOf(bundleI.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List K(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            v6.AbstractC6056k.f(r4)
            android.os.Bundle r0 = r3.I()
            r1 = 0
            if (r0 != 0) goto L1d
            X6.j3 r4 = r3.f18400a
            X6.z2 r4 = r4.a()
            X6.x2 r4 = r4.o()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            X6.j3 r0 = r3.f18400a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.d()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r3 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r3
        L48:
            r4 = move-exception
            X6.j3 r3 = r3.f18400a
            X6.z2 r3 = r3.a()
            X6.x2 r3 = r3.o()
            java.lang.String r0 = "Failed to load string array from metadata: resource not found"
            r3.b(r0, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2436m.K(java.lang.String):java.util.List");
    }

    public final boolean L() {
        this.f18400a.c();
        Boolean boolJ = J("firebase_analytics_collection_deactivated");
        return boolJ != null && boolJ.booleanValue();
    }

    public final boolean M() {
        Boolean boolJ = J("google_analytics_adid_collection_enabled");
        return boolJ == null || boolJ.booleanValue();
    }

    public final boolean N() {
        Boolean boolJ = J("google_analytics_automatic_screen_reporting_enabled");
        return boolJ == null || boolJ.booleanValue();
    }

    public final P3 O(String str, boolean z10) {
        Object obj;
        AbstractC6056k.f(str);
        C2416j3 c2416j3 = this.f18400a;
        Bundle bundleI = I();
        if (bundleI == null) {
            c2416j3.a().o().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleI.get(str);
        }
        if (obj == null) {
            return P3.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return P3.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return P3.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return P3.POLICY;
        }
        c2416j3.a().r().b("Invalid manifest metadata for", str);
        return P3.UNINITIALIZED;
    }

    public final boolean P() {
        Boolean boolJ = J("google_analytics_sgtm_upload_enabled");
        if (boolJ == null) {
            return false;
        }
        return boolJ.booleanValue();
    }

    public final void Q(String str) {
        this.f19093c = str;
    }

    public final String R() {
        return this.f19093c;
    }

    public final String i() {
        return s("debug.firebase.analytics.app", "");
    }

    public final String j() {
        return s("debug.deferred.deeplink", "");
    }

    public final boolean k(String str) {
        return "1".equals(this.f19094d.f(str, "gaia_collection_enabled"));
    }

    public final boolean l(String str) {
        return "1".equals(this.f19094d.f(str, "measurement.event_sampling_enabled"));
    }

    public final boolean m() {
        if (this.f19092b == null) {
            Boolean boolJ = J("app_measurement_lite");
            this.f19092b = boolJ;
            if (boolJ == null) {
                this.f19092b = Boolean.FALSE;
            }
        }
        return this.f19092b.booleanValue() || !this.f18400a.G();
    }

    public final String s(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            AbstractC6056k.l(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.f18400a.a().o().b("Could not find SystemProperties class", e10);
            return "";
        } catch (IllegalAccessException e11) {
            this.f18400a.a().o().b("Could not access SystemProperties.get()", e11);
            return "";
        } catch (NoSuchMethodException e12) {
            this.f18400a.a().o().b("Could not find SystemProperties.get() method", e12);
            return "";
        } catch (InvocationTargetException e13) {
            this.f18400a.a().o().b("SystemProperties.get() threw an exception", e13);
            return "";
        }
    }

    public final void t(InterfaceC2428l interfaceC2428l) {
        this.f19094d = interfaceC2428l;
    }

    public final String u() {
        this.f18400a.c();
        return "FA";
    }

    public final int v() {
        return this.f18400a.C().V(201500000, true) ? 100 : 25;
    }

    public final int w(String str) {
        return F(str, AbstractC2383f2.f18865Y, 25, 100);
    }

    public final int x(String str, boolean z10) {
        if (z10) {
            return F(str, AbstractC2383f2.f18894i0, 100, 500);
        }
        return 500;
    }

    public final int y(String str, boolean z10) {
        return Math.max(x(str, z10), 256);
    }

    public final int z(String str) {
        return F(str, AbstractC2383f2.f18863X, 500, 2000);
    }
}
