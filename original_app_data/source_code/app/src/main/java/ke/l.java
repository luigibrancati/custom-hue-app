package ke;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.regex.Pattern;
import ne.C5176a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f39729a = Pattern.compile("^[0-9a-zA-Z\\-\\.\\_\\~]{43,128}$");

    public static void a(String str) {
        p.a(43 <= str.length(), "codeVerifier length is shorter than allowed by the PKCE specification");
        p.a(str.length() <= 128, "codeVerifier length is longer than allowed by the PKCE specification");
        p.a(f39729a.matcher(str).matches(), "codeVerifier string contains illegal characters");
    }

    public static String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes("ISO_8859_1"));
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (UnsupportedEncodingException e10) {
            C5176a.c("ISO-8859-1 encoding not supported on this device!", e10);
            throw new IllegalStateException("ISO-8859-1 encoding not supported", e10);
        } catch (NoSuchAlgorithmException e11) {
            C5176a.h("SHA-256 is not supported on this device! Using plain challenge", e11);
            return str;
        }
    }

    public static String c() {
        return d(new SecureRandom(), 64);
    }

    public static String d(SecureRandom secureRandom, int i10) {
        p.e(secureRandom, "entropySource cannot be null");
        p.a(32 <= i10, "entropyBytes is less than the minimum permitted");
        p.a(i10 <= 96, "entropyBytes is greater than the maximum permitted");
        byte[] bArr = new byte[i10];
        secureRandom.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    public static String e() {
        try {
            MessageDigest.getInstance("SHA-256");
            return "S256";
        } catch (NoSuchAlgorithmException unused) {
            return "plain";
        }
    }
}
