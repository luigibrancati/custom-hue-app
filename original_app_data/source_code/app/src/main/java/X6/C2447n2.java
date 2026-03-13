package X6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.internal.measurement.C3213h7;
import com.google.android.gms.internal.measurement.G7;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.n2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2447n2 extends AbstractC2399h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f19110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f19111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f19113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f19114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f19115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f19116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f19117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f19118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f19119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f19120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f19121n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f19122o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f19123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f19124q;

    public C2447n2(C2416j3 c2416j3, long j10, long j11) {
        super(c2416j3);
        this.f19123p = 0L;
        this.f19124q = null;
        this.f19116i = j10;
        this.f19117j = j11;
    }

    @Override // X6.AbstractC2399h2
    public final boolean m() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(1:4)(17:79|6|(1:10)(2:11|(1:13))|83|14|(4:16|(1:18)(1:20)|77|21)|26|(2:28|(2:30|(2:32|(2:34|(2:36|(2:38|(1:40)(1:41))(1:42))(1:43))(1:44))(1:45))(1:46))(1:47)|48|81|49|(1:51)(1:52)|53|(1:55)|59|(2:62|(1:64)(4:65|(3:68|(1:86)(1:87)|66)|85|71))(1:71)|(2:73|74)(2:75|76))|5|26|(0)(0)|48|81|49|(0)(0)|53|(0)|59|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0199, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019a, code lost:
    
        r11.f18400a.a().o().c("Fetching Google App Id failed with exception. appId", X6.C2542z2.x(r1), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0187 A[Catch: IllegalStateException -> 0x0199, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0199, blocks: (B:49:0x016d, B:53:0x0183, B:55:0x0187), top: B:81:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0202  */
    @Override // X6.AbstractC2399h2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2447n2.n():void");
    }

    public final c7 o(String str) {
        long J10;
        String str2;
        String str3;
        String str4;
        long jMin;
        long j10;
        String str5;
        boolean z10;
        int i10;
        long j11;
        ApplicationInfo applicationInfoC;
        h();
        String strQ = q();
        String strR = r();
        j();
        String str6 = this.f19111d;
        j();
        long j12 = this.f19112e;
        j();
        AbstractC6056k.l(this.f19113f);
        String str7 = this.f19113f;
        C2416j3 c2416j3 = this.f18400a;
        c2416j3.w().A();
        j();
        h();
        long j13 = this.f19115h;
        if (j13 == 0) {
            a7 a7VarC = this.f18400a.C();
            Context contextD = c2416j3.d();
            String packageName = c2416j3.d().getPackageName();
            a7VarC.h();
            AbstractC6056k.l(contextD);
            AbstractC6056k.f(packageName);
            PackageManager packageManager = contextD.getPackageManager();
            MessageDigest messageDigestC = a7.C();
            long jD = -1;
            if (messageDigestC == null) {
                a7VarC.f18400a.a().o().a("Could not get MD5 instance");
                J10 = 0;
            } else {
                if (packageManager != null) {
                    try {
                        if (a7VarC.S(contextD, packageName)) {
                            J10 = 0;
                            jD = 0;
                        } else {
                            D6.c cVarA = D6.d.a(contextD);
                            C2416j3 c2416j32 = a7VarC.f18400a;
                            J10 = 0;
                            try {
                                Signature[] signatureArr = cVarA.e(c2416j32.d().getPackageName(), 64).signatures;
                                if (signatureArr == null || signatureArr.length <= 0) {
                                    c2416j32.a().r().a("Could not get signatures");
                                } else {
                                    jD = a7.D(messageDigestC.digest(signatureArr[0].toByteArray()));
                                }
                            } catch (PackageManager.NameNotFoundException e10) {
                                e = e10;
                                a7VarC.f18400a.a().o().b("Package name not found", e);
                                j13 = J10;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e11) {
                        e = e11;
                        J10 = 0;
                    }
                } else {
                    J10 = 0;
                }
                j13 = J10;
                this.f19115h = j13;
            }
            j13 = jD;
            this.f19115h = j13;
        } else {
            J10 = 0;
        }
        long j14 = j13;
        C2416j3 c2416j33 = this.f18400a;
        boolean zG = c2416j33.g();
        boolean z11 = !c2416j33.x().f18438s;
        h();
        if (c2416j33.g()) {
            G7.a();
            if (c2416j33.w().H(null, AbstractC2383f2.f18834I0)) {
                this.f18400a.a().w().a("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = c2416j33.d().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.f18400a.d());
                            if (objInvoke != null) {
                                try {
                                    str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                } catch (Exception unused) {
                                    this.f18400a.a().t().a("Failed to retrieve Firebase Instance Id");
                                    str2 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            this.f18400a.a().s().a("Failed to obtain Firebase Analytics instance");
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        C2416j3 c2416j34 = this.f18400a;
        long jA = c2416j34.x().f18425f.a();
        if (jA == J10) {
            jMin = c2416j34.f19005D;
            str3 = strQ;
            str4 = strR;
        } else {
            str3 = strQ;
            str4 = strR;
            jMin = Math.min(c2416j34.f19005D, jA);
        }
        j();
        int i11 = this.f19120m;
        C2416j3 c2416j35 = this.f18400a;
        boolean zM = c2416j35.w().M();
        N2 n2X = c2416j35.x();
        n2X.h();
        boolean z12 = n2X.p().getBoolean("deferred_analytics_collection", false);
        boolean z13 = c2416j35.w().O("google_analytics_default_allow_ad_personalization_signals", true) != P3.GRANTED;
        long j15 = this.f19116i;
        Boolean boolValueOf = Boolean.valueOf(z13);
        List list = this.f19118k;
        String strL = c2416j35.x().w().l();
        if (this.f19119l == null) {
            this.f19119l = c2416j35.C().l0();
        }
        String str8 = this.f19119l;
        if (c2416j35.x().w().o(R3.ANALYTICS_STORAGE)) {
            h();
            j10 = j15;
            if (this.f19123p != J10) {
                long jA2 = c2416j35.e().a() - this.f19123p;
                if (this.f19122o != null && jA2 > 86400000 && this.f19124q == null) {
                    p();
                }
            }
            if (this.f19122o == null) {
                p();
            }
            str5 = this.f19122o;
        } else {
            j10 = j15;
            str5 = null;
        }
        boolean zP = c2416j35.w().P();
        a7 a7VarC2 = c2416j35.C();
        String strQ2 = q();
        String str9 = str5;
        C2416j3 c2416j36 = a7VarC2.f18400a;
        if (c2416j36.d().getPackageManager() == null) {
            z10 = zP;
            j11 = J10;
        } else {
            try {
                z10 = zP;
                i10 = 0;
                try {
                    applicationInfoC = D6.d.a(c2416j36.d()).c(strQ2, 0);
                } catch (PackageManager.NameNotFoundException unused4) {
                    C2416j3 c2416j37 = a7VarC2.f18400a;
                    c2416j37.c();
                    c2416j37.a().u().b("PackageManager failed to find running app: app_id", strQ2);
                }
            } catch (PackageManager.NameNotFoundException unused5) {
                z10 = zP;
                i10 = 0;
            }
            int i12 = applicationInfoC != null ? applicationInfoC.targetSdkVersion : i10;
            j11 = i12;
        }
        C2416j3 c2416j38 = this.f18400a;
        int iB = c2416j38.x().w().b();
        String strE = c2416j38.x().u().e();
        C3213h7.a();
        C2436m c2436mW = c2416j38.w();
        C2375e2 c2375e2 = AbstractC2383f2.f18852R0;
        long j16 = j11;
        int I10 = c2436mW.H(null, c2375e2) ? c2416j38.C().I() : 0;
        C3213h7.a();
        if (c2416j38.w().H(null, c2375e2)) {
            J10 = c2416j38.C().J();
        }
        String strR2 = c2416j38.w().R();
        String strB = new C2382f1(c2416j38.w().O("google_analytics_default_allow_ad_personalization_signals", true)).b();
        C2416j3 c2416j39 = this.f18400a;
        return new c7(str3, str4, str6, j12, str7, 133005L, j14, str, zG, z11, str2, jMin, i11, zM, z12, boolValueOf, j10, list, strL, str8, str9, z10, j16, iB, strE, I10, J10, strR2, strB, c2416j39.f19005D, c2416j39.N().q().zza());
    }

    public final void p() {
        String str;
        h();
        C2416j3 c2416j3 = this.f18400a;
        if (c2416j3.x().w().o(R3.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            c2416j3.C().q0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            c2416j3.a().v().a("Analytics Storage consent is not granted");
            str = null;
        }
        c2416j3.a().v().a(String.format("Resetting session stitching token to %s", str == null ? "null" : "not null"));
        this.f19122o = str;
        this.f19123p = c2416j3.e().a();
    }

    public final String q() {
        j();
        AbstractC6056k.l(this.f19110c);
        return this.f19110c;
    }

    public final String r() {
        h();
        j();
        AbstractC6056k.l(this.f19121n);
        return this.f19121n;
    }

    public final String s() {
        j();
        AbstractC6056k.l(this.f19114g);
        return this.f19114g;
    }

    public final int t() {
        j();
        return this.f19112e;
    }

    public final long u() {
        return this.f19117j;
    }

    public final int v() {
        j();
        return this.f19120m;
    }

    public final List w() {
        return this.f19118k;
    }

    public final boolean x(String str) {
        String str2 = this.f19124q;
        boolean z10 = false;
        if (str2 != null && !str2.equals(str)) {
            z10 = true;
        }
        this.f19124q = str;
        return z10;
    }
}
