package s6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: s6.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5789h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C5789h f44165c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f44167b;

    public C5789h(Context context) {
        this.f44166a = context.getApplicationContext();
    }

    public static C5789h a(Context context) {
        AbstractC6056k.l(context);
        synchronized (C5789h.class) {
            try {
                if (f44165c == null) {
                    AbstractC5807z.a(context);
                    f44165c = new C5789h(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f44165c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean d(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r11 == 0) goto L28
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.android.vending"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1b
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            android.content.pm.ApplicationInfo r11 = r10.applicationInfo
            if (r11 != 0) goto L21
        L1f:
            r11 = r0
            goto L28
        L21:
            int r11 = r11.flags
            r11 = r11 & 129(0x81, float:1.81E-43)
            if (r11 == 0) goto L1f
            r11 = r1
        L28:
            if (r11 == 0) goto L2d
            J6.i r2 = s6.AbstractC5806y.f44183c     // Catch: java.lang.IllegalArgumentException -> La4
            goto L2f
        L2d:
            J6.i r2 = s6.AbstractC5806y.f44182b     // Catch: java.lang.IllegalArgumentException -> La4
        L2f:
            java.lang.Object r3 = B6.a.f670a     // Catch: java.lang.IllegalArgumentException -> La4
            J6.r.a(r1)     // Catch: java.lang.IllegalArgumentException -> La4
            android.content.pm.SigningInfo r3 = r10.signingInfo     // Catch: java.lang.IllegalArgumentException -> La4
            if (r3 == 0) goto L65
            boolean r4 = r3.hasMultipleSigners()     // Catch: java.lang.IllegalArgumentException -> La4
            if (r4 != 0) goto L65
            android.content.pm.Signature[] r4 = r3.getSigningCertificateHistory()     // Catch: java.lang.IllegalArgumentException -> La4
            if (r4 != 0) goto L45
            goto L65
        L45:
            J6.m r4 = J6.i.f6273b     // Catch: java.lang.IllegalArgumentException -> La4
            J6.e r4 = new J6.e     // Catch: java.lang.IllegalArgumentException -> La4
            r4.<init>()     // Catch: java.lang.IllegalArgumentException -> La4
            android.content.pm.Signature[] r3 = r3.getSigningCertificateHistory()     // Catch: java.lang.IllegalArgumentException -> La4
            int r5 = r3.length     // Catch: java.lang.IllegalArgumentException -> La4
            r6 = r0
        L52:
            if (r6 >= r5) goto L60
            r7 = r3[r6]     // Catch: java.lang.IllegalArgumentException -> La4
            byte[] r7 = r7.toByteArray()     // Catch: java.lang.IllegalArgumentException -> La4
            r4.b(r7)     // Catch: java.lang.IllegalArgumentException -> La4
            int r6 = r6 + 1
            goto L52
        L60:
            J6.i r3 = r4.c()     // Catch: java.lang.IllegalArgumentException -> La4
            goto L69
        L65:
            J6.i r3 = J6.i.l()     // Catch: java.lang.IllegalArgumentException -> La4
        L69:
            boolean r4 = r3.isEmpty()     // Catch: java.lang.IllegalArgumentException -> La4
            if (r4 != 0) goto L9c
            J6.i r3 = r3.h()     // Catch: java.lang.IllegalArgumentException -> La4
            int r4 = r3.size()     // Catch: java.lang.IllegalArgumentException -> La4
            r5 = r0
        L78:
            if (r5 >= r4) goto L9b
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.IllegalArgumentException -> La4
            byte[] r6 = (byte[]) r6     // Catch: java.lang.IllegalArgumentException -> La4
            J6.m r7 = r2.listIterator(r0)     // Catch: java.lang.IllegalArgumentException -> La4
        L84:
            boolean r8 = r7.hasNext()     // Catch: java.lang.IllegalArgumentException -> La4
            int r9 = r5 + 1
            if (r8 == 0) goto L99
            java.lang.Object r8 = r7.next()     // Catch: java.lang.IllegalArgumentException -> La4
            byte[] r8 = (byte[]) r8     // Catch: java.lang.IllegalArgumentException -> La4
            boolean r8 = java.util.Arrays.equals(r6, r8)     // Catch: java.lang.IllegalArgumentException -> La4
            if (r8 == 0) goto L84
            return r1
        L99:
            r5 = r9
            goto L78
        L9b:
            return r0
        L9c:
            java.lang.String r2 = "Unable to obtain package certificate history."
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> La4
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> La4
            throw r3     // Catch: java.lang.IllegalArgumentException -> La4
        La4:
            java.lang.String r2 = "GoogleSignatureVerifier"
            java.lang.String r3 = "package info is not set correctly"
            android.util.Log.i(r2, r3)
            if (r11 == 0) goto Lb4
            s6.u[] r11 = s6.AbstractC5806y.f44181a
            s6.u r10 = f(r10, r11)
            goto Lc0
        Lb4:
            s6.u[] r11 = s6.AbstractC5806y.f44181a
            r11 = r11[r0]
            s6.u[] r11 = new s6.AbstractBinderC5802u[]{r11}
            s6.u r10 = f(r10, r11)
        Lc0:
            if (r10 == 0) goto Lc3
            return r1
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.C5789h.d(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static AbstractBinderC5802u f(PackageInfo packageInfo, AbstractBinderC5802u... abstractBinderC5802uArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            BinderC5803v binderC5803v = new BinderC5803v(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < abstractBinderC5802uArr.length; i10++) {
                if (abstractBinderC5802uArr[i10].equals(binderC5803v)) {
                    return abstractBinderC5802uArr[i10];
                }
            }
        }
        return null;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (d(packageInfo, false)) {
            return true;
        }
        if (d(packageInfo, true)) {
            if (AbstractC5788g.e(this.f44166a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i10) {
        C5780J c5780jC;
        int length;
        String[] packagesForUid = this.f44166a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c5780jC = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    AbstractC6056k.l(c5780jC);
                    break;
                }
                c5780jC = e(packagesForUid[i11], false, false);
                if (c5780jC.f44139a) {
                    break;
                }
                i11++;
            }
        } else {
            c5780jC = C5780J.c("no pkgs");
        }
        c5780jC.e();
        return c5780jC.f44139a;
    }

    public final C5780J e(String str, boolean z10, boolean z11) {
        C5780J c5780jC;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return C5780J.c("null pkg");
        }
        if (str.equals(this.f44167b)) {
            return C5780J.b();
        }
        AbstractBinderC5805x abstractBinderC5805x = AbstractC5807z.f44184a;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            AbstractC5807z.b();
        } catch (RemoteException | DynamiteModule.a e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
        if (AbstractC5807z.f44190g.i()) {
            C5777G c5777g = new C5777G(null);
            c5777g.a(str);
            c5777g.b(AbstractC5788g.e(this.f44166a));
            c5777g.c(true);
            c5780jC = AbstractC5807z.c(c5777g.d());
        } else {
            try {
                PackageInfo packageInfo = this.f44166a.getPackageManager().getPackageInfo(str, 134217792);
                boolean zE = AbstractC5788g.e(this.f44166a);
                if (packageInfo == null) {
                    c5780jC = C5780J.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        c5780jC = C5780J.c("single cert required");
                    } else {
                        BinderC5803v binderC5803v = new BinderC5803v(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        C5780J c5780jD = AbstractC5807z.d(str2, binderC5803v, zE, false);
                        c5780jC = (!c5780jD.f44139a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !AbstractC5807z.d(str2, binderC5803v, false, true).f44139a) ? c5780jD : C5780J.c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e11) {
                return C5780J.d("no pkg ".concat(str), e11);
            }
        }
        if (c5780jC.f44139a) {
            this.f44167b = str;
        }
        return c5780jC;
    }
}
