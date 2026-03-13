package X6;

import android.os.Bundle;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.k5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2426k5 extends AbstractC2399h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C2362c5 f19058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile C2362c5 f19059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2362c5 f19060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f19061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.C0 f19062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f19063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile C2362c5 f19064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C2362c5 f19065j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f19066k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f19067l;

    public C2426k5(C2416j3 c2416j3) {
        super(c2416j3);
        this.f19067l = new Object();
        this.f19061f = new ConcurrentHashMap();
    }

    public final /* synthetic */ void A(Bundle bundle, C2362c5 c2362c5, C2362c5 c2362c52, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        G(c2362c5, c2362c52, j10, true, this.f18400a.C().t(null, "screen_view", bundle, null, false));
    }

    public final /* synthetic */ void B(C2362c5 c2362c5, C2362c5 c2362c52, long j10, boolean z10, Bundle bundle) {
        G(c2362c5, c2362c52, j10, z10, null);
    }

    public final /* synthetic */ void C(C2362c5 c2362c5, boolean z10, long j10) {
        o(c2362c5, false, j10);
    }

    public final /* synthetic */ C2362c5 D() {
        return this.f19065j;
    }

    public final /* synthetic */ void E(C2362c5 c2362c5) {
        this.f19065j = null;
    }

    public final void F(String str, C2362c5 c2362c5, boolean z10) {
        C2362c5 c2362c52;
        C2362c5 c2362c53 = this.f19058c == null ? this.f19059d : this.f19058c;
        if (c2362c5.f18732b == null) {
            c2362c52 = new C2362c5(c2362c5.f18731a, str != null ? r(str, "Activity") : null, c2362c5.f18733c, c2362c5.f18735e, c2362c5.f18736f);
        } else {
            c2362c52 = c2362c5;
        }
        this.f19059d = this.f19058c;
        this.f19058c = c2362c52;
        C2416j3 c2416j3 = this.f18400a;
        c2416j3.b().t(new RunnableC2378e5(this, c2362c52, c2362c53, c2416j3.e().c(), z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(X6.C2362c5 r16, X6.C2362c5 r17, long r18, boolean r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2426k5.G(X6.c5, X6.c5, long, boolean, android.os.Bundle):void");
    }

    @Override // X6.AbstractC2399h2
    public final boolean m() {
        return false;
    }

    public final void o(C2362c5 c2362c5, boolean z10, long j10) {
        C2416j3 c2416j3 = this.f18400a;
        c2416j3.M().k(c2416j3.e().c());
        if (!c2416j3.z().f19106f.d(c2362c5 != null && c2362c5.f18734d, z10, j10) || c2362c5 == null) {
            return;
        }
        c2362c5.f18734d = false;
    }

    public final C2362c5 p(com.google.android.gms.internal.measurement.C0 c02) {
        AbstractC6056k.l(c02);
        Integer numValueOf = Integer.valueOf(c02.f29146a);
        Map map = this.f19061f;
        C2362c5 c2362c5 = (C2362c5) map.get(numValueOf);
        if (c2362c5 == null) {
            C2362c5 c2362c52 = new C2362c5(null, r(c02.f29147b, "Activity"), this.f18400a.C().p0());
            map.put(numValueOf, c2362c52);
            c2362c5 = c2362c52;
        }
        return this.f19064i != null ? this.f19064i : c2362c5;
    }

    public final C2362c5 q(boolean z10) {
        j();
        h();
        if (!z10) {
            return this.f19060e;
        }
        C2362c5 c2362c5 = this.f19060e;
        return c2362c5 != null ? c2362c5 : this.f19065j;
    }

    public final String r(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str3 = length > 0 ? strArrSplit[length - 1] : "";
        C2416j3 c2416j3 = this.f18400a;
        return str3.length() > c2416j3.w().x(null, false) ? str3.substring(0, c2416j3.w().x(null, false)) : str3;
    }

    public final void s(Bundle bundle, long j10) {
        synchronized (this.f19067l) {
            try {
                if (!this.f19066k) {
                    this.f18400a.a().t().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.f18400a.w().x(null, false))) {
                    this.f18400a.a().t().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.f18400a.w().x(null, false))) {
                    this.f18400a.a().t().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    com.google.android.gms.internal.measurement.C0 c02 = this.f19062g;
                    string2 = c02 != null ? r(c02.f29147b, "Activity") : "Activity";
                }
                C2362c5 c2362c5 = this.f19058c;
                if (this.f19063h && c2362c5 != null) {
                    this.f19063h = false;
                    boolean zEquals = Objects.equals(c2362c5.f18732b, string2);
                    boolean zEquals2 = Objects.equals(c2362c5.f18731a, string);
                    if (zEquals && zEquals2) {
                        this.f18400a.a().t().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                C2416j3 c2416j3 = this.f18400a;
                c2416j3.a().w().c("Logging screen view with name, class", string == null ? "null" : string, string2 == null ? "null" : string2);
                C2362c5 c2362c52 = this.f19058c == null ? this.f19059d : this.f19058c;
                C2362c5 c2362c53 = new C2362c5(string, string2, c2416j3.C().p0(), true, j10);
                this.f19058c = c2362c53;
                this.f19059d = c2362c52;
                this.f19064i = c2362c53;
                c2416j3.b().t(new RunnableC2370d5(this, bundle, c2362c53, c2362c52, c2416j3.e().c()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(com.google.android.gms.internal.measurement.C0 c02, String str, String str2) {
        C2416j3 c2416j3 = this.f18400a;
        if (!c2416j3.w().N()) {
            c2416j3.a().t().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C2362c5 c2362c5 = this.f19058c;
        if (c2362c5 == null) {
            c2416j3.a().t().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.f19061f;
        Integer numValueOf = Integer.valueOf(c02.f29146a);
        if (map.get(numValueOf) == null) {
            c2416j3.a().t().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = r(c02.f29147b, "Activity");
        }
        String str3 = c2362c5.f18732b;
        String str4 = c2362c5.f18731a;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            c2416j3.a().t().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > c2416j3.w().x(null, false))) {
            c2416j3.a().t().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > c2416j3.w().x(null, false))) {
            c2416j3.a().t().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        c2416j3.a().w().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        C2362c5 c2362c52 = new C2362c5(str, str2, c2416j3.C().p0());
        map.put(numValueOf, c2362c52);
        F(c02.f29147b, c2362c52, true);
    }

    public final C2362c5 u() {
        return this.f19058c;
    }

    public final void v(com.google.android.gms.internal.measurement.C0 c02, Bundle bundle) {
        Bundle bundle2;
        if (!this.f18400a.w().N() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f19061f.put(Integer.valueOf(c02.f29146a), new C2362c5(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void w(com.google.android.gms.internal.measurement.C0 c02) {
        Object obj = this.f19067l;
        synchronized (obj) {
            this.f19066k = true;
            if (!Objects.equals(c02, this.f19062g)) {
                synchronized (obj) {
                    this.f19062g = c02;
                    this.f19063h = false;
                    C2416j3 c2416j3 = this.f18400a;
                    if (c2416j3.w().N()) {
                        this.f19064i = null;
                        c2416j3.b().t(new RunnableC2418j5(this));
                    }
                }
            }
        }
        C2416j3 c2416j32 = this.f18400a;
        if (!c2416j32.w().N()) {
            this.f19058c = this.f19064i;
            c2416j32.b().t(new RunnableC2386f5(this));
            return;
        }
        F(c02.f29147b, p(c02), false);
        E0 e0M = this.f18400a.M();
        C2416j3 c2416j33 = e0M.f18400a;
        c2416j33.b().t(new RunnableC2365d0(e0M, c2416j33.e().c()));
    }

    public final void x(com.google.android.gms.internal.measurement.C0 c02) {
        synchronized (this.f19067l) {
            this.f19066k = false;
            this.f19063h = true;
        }
        C2416j3 c2416j3 = this.f18400a;
        long jC = c2416j3.e().c();
        if (!c2416j3.w().N()) {
            this.f19058c = null;
            c2416j3.b().t(new RunnableC2394g5(this, jC));
        } else {
            C2362c5 c2362c5P = p(c02);
            this.f19059d = this.f19058c;
            this.f19058c = null;
            c2416j3.b().t(new RunnableC2402h5(this, c2362c5P, jC));
        }
    }

    public final void y(com.google.android.gms.internal.measurement.C0 c02, Bundle bundle) {
        C2362c5 c2362c5;
        if (!this.f18400a.w().N() || bundle == null || (c2362c5 = (C2362c5) this.f19061f.get(Integer.valueOf(c02.f29146a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c2362c5.f18733c);
        bundle2.putString("name", c2362c5.f18731a);
        bundle2.putString("referrer_name", c2362c5.f18732b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void z(com.google.android.gms.internal.measurement.C0 c02) {
        synchronized (this.f19067l) {
            try {
                if (Objects.equals(this.f19062g, c02)) {
                    this.f19062g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f18400a.w().N()) {
            this.f19061f.remove(Integer.valueOf(c02.f29146a));
        }
    }
}
