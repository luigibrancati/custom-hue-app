package B6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f670a = new Object();

    public static byte[] a(Context context, String str) {
        MessageDigest messageDigestB;
        PackageInfo packageInfoE = D6.d.a(context).e(str, 64);
        Signature[] signatureArr = packageInfoE.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (messageDigestB = b("SHA1")) == null) {
            return null;
        }
        return messageDigestB.digest(packageInfoE.signatures[0].toByteArray());
    }

    public static MessageDigest b(String str) {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
