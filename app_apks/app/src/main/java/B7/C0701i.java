package B7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import z7.C6531c;
import z7.C6535g;

/* JADX INFO: renamed from: B7.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0701i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6535g f743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0696d f744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0700h f746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PackageInfo f747e;

    public C0701i(Context context, C6535g c6535g, C0696d c0696d) {
        C0700h c0700h = new C0700h(new C6531c(c6535g));
        this.f743a = c6535g;
        this.f744b = c0696d;
        this.f745c = context;
        this.f746d = c0700h;
    }

    public static X509Certificate e(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e10) {
            Log.e("SplitCompat", "Cannot decode certificate.", e10);
            return null;
        }
    }

    public final boolean a(File[] fileArr) {
        long longVersionCode = d().getLongVersionCode();
        AssetManager assetManager = (AssetManager) AbstractC0717z.c(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            this.f746d.b(assetManager, fileArr[length]);
        } while (longVersionCode == this.f746d.a());
        return false;
    }

    public final boolean b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.f743a.g(((Intent) it.next()).getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
    
        android.util.Log.e("SplitCompat", "Downloaded split " + r5 + " is not signed.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(java.io.File[] r12) {
        /*
            r11 = this;
            java.lang.String r0 = " is not signed."
            java.lang.String r1 = "Downloaded split "
            android.content.pm.PackageInfo r11 = r11.d()
            r2 = 0
            r3 = 0
            if (r11 == 0) goto L2a
            android.content.pm.Signature[] r4 = r11.signatures
            if (r4 != 0) goto L11
            goto L2a
        L11:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.pm.Signature[] r11 = r11.signatures
            int r4 = r11.length
            r5 = r3
        L1a:
            if (r5 >= r4) goto L2a
            r6 = r11[r5]
            java.security.cert.X509Certificate r6 = e(r6)
            if (r6 == 0) goto L27
            r2.add(r6)
        L27:
            int r5 = r5 + 1
            goto L1a
        L2a:
            java.lang.String r11 = "SplitCompat"
            if (r2 == 0) goto Lbf
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L36
            goto Lbf
        L36:
            int r4 = r12.length
        L37:
            int r4 = r4 + (-1)
            if (r4 < 0) goto Lbd
            r5 = r12[r4]
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Exception -> L5c
            java.security.cert.X509Certificate[][] r6 = B7.U.a(r5)     // Catch: java.lang.Exception -> L9b
            if (r6 == 0) goto L85
            int r7 = r6.length     // Catch: java.lang.Exception -> L5c
            if (r7 == 0) goto L85
            r7 = r6[r3]     // Catch: java.lang.Exception -> L5c
            int r7 = r7.length     // Catch: java.lang.Exception -> L5c
            if (r7 != 0) goto L50
            goto L85
        L50:
            boolean r5 = r2.isEmpty()     // Catch: java.lang.Exception -> L5c
            if (r5 == 0) goto L5e
            java.lang.String r12 = "No certificates found for app."
            android.util.Log.e(r11, r12)     // Catch: java.lang.Exception -> L5c
            goto Lb1
        L5c:
            r12 = move-exception
            goto Lb7
        L5e:
            java.util.Iterator r5 = r2.iterator()     // Catch: java.lang.Exception -> L5c
        L62:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Exception -> L5c
            if (r7 == 0) goto L37
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Exception -> L5c
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7     // Catch: java.lang.Exception -> L5c
            int r8 = r6.length     // Catch: java.lang.Exception -> L5c
            r9 = r3
        L70:
            if (r9 >= r8) goto L7f
            r10 = r6[r9]     // Catch: java.lang.Exception -> L5c
            r10 = r10[r3]     // Catch: java.lang.Exception -> L5c
            boolean r10 = r10.equals(r7)     // Catch: java.lang.Exception -> L5c
            if (r10 != 0) goto L62
            int r9 = r9 + 1
            goto L70
        L7f:
            java.lang.String r12 = "There's an app certificate that doesn't sign the split."
            android.util.Log.i(r11, r12)     // Catch: java.lang.Exception -> L5c
            goto Lb1
        L85:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5c
            r12.<init>()     // Catch: java.lang.Exception -> L5c
            r12.append(r1)     // Catch: java.lang.Exception -> L5c
            r12.append(r5)     // Catch: java.lang.Exception -> L5c
            r12.append(r0)     // Catch: java.lang.Exception -> L5c
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Exception -> L5c
            android.util.Log.e(r11, r12)     // Catch: java.lang.Exception -> L5c
            goto Lb1
        L9b:
            r12 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5c
            r2.<init>()     // Catch: java.lang.Exception -> L5c
            r2.append(r1)     // Catch: java.lang.Exception -> L5c
            r2.append(r5)     // Catch: java.lang.Exception -> L5c
            r2.append(r0)     // Catch: java.lang.Exception -> L5c
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L5c
            android.util.Log.e(r11, r0, r12)     // Catch: java.lang.Exception -> L5c
        Lb1:
            java.lang.String r12 = "Split verification failure."
            android.util.Log.e(r11, r12)     // Catch: java.lang.Exception -> L5c
            return r3
        Lb7:
            java.lang.String r0 = "Split verification error."
            android.util.Log.e(r11, r0, r12)
            return r3
        Lbd:
            r11 = 1
            return r11
        Lbf:
            java.lang.String r12 = "No app certificates found."
            android.util.Log.e(r11, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: B7.C0701i.c(java.io.File[]):boolean");
    }

    public final PackageInfo d() {
        if (this.f747e == null) {
            try {
                this.f747e = this.f745c.getPackageManager().getPackageInfo(this.f745c.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.f747e;
    }
}
