package le;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: le.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4997b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f40094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f40096d;

    public C4997b(PackageInfo packageInfo, boolean z10) {
        this(packageInfo.packageName, b(packageInfo.signatures), packageInfo.versionName, z10);
    }

    public static String a(Signature signature) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signature.toByteArray()), 10);
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("Platform does not supportSHA-512 hashing");
        }
    }

    public static Set b(Signature[] signatureArr) {
        HashSet hashSet = new HashSet();
        for (Signature signature : signatureArr) {
            hashSet.add(a(signature));
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C4997b)) {
            C4997b c4997b = (C4997b) obj;
            if (this.f40093a.equals(c4997b.f40093a) && this.f40095c.equals(c4997b.f40095c) && this.f40096d == c4997b.f40096d && this.f40094b.equals(c4997b.f40094b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f40093a.hashCode() * 92821) + this.f40095c.hashCode()) * 92821) + (this.f40096d.booleanValue() ? 1 : 0);
        Iterator it = this.f40094b.iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 92821) + ((String) it.next()).hashCode();
        }
        return iHashCode;
    }

    public C4997b(String str, Set set, String str2, boolean z10) {
        this.f40093a = str;
        this.f40094b = set;
        this.f40095c = str2;
        this.f40096d = Boolean.valueOf(z10);
    }
}
