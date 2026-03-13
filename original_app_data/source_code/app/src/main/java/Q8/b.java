package Q8;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import h8.C4288f;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f14225c = {"*", FirebaseMessaging.INSTANCE_ID_SCOPE, "GCM", ""};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f14226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14227b;

    public b(C4288f c4288f) {
        this.f14226a = c4288f.m().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f14227b = b(c4288f);
    }

    public static String b(C4288f c4288f) {
        String strF = c4288f.r().f();
        if (strF != null) {
            return strF;
        }
        String strC = c4288f.r().c();
        if (!strC.startsWith("1:") && !strC.startsWith("2:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static String c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    public final String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    public String f() {
        synchronized (this.f14226a) {
            try {
                String strG = g();
                if (strG != null) {
                    return strG;
                }
                return h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String g() {
        String string;
        synchronized (this.f14226a) {
            string = this.f14226a.getString("|S|id", null);
        }
        return string;
    }

    public final String h() {
        synchronized (this.f14226a) {
            try {
                String string = this.f14226a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey publicKeyE = e(string);
                if (publicKeyE == null) {
                    return null;
                }
                return c(publicKeyE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String i() {
        synchronized (this.f14226a) {
            try {
                for (String str : f14225c) {
                    String string = this.f14226a.getString(a(this.f14227b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
