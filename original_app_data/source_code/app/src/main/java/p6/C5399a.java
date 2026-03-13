package p6;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONException;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: p6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5399a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lock f42213c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C5399a f42214d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lock f42215a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f42216b;

    public C5399a(Context context) {
        this.f42216b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C5399a a(Context context) {
        AbstractC6056k.l(context);
        Lock lock = f42213c;
        lock.lock();
        try {
            if (f42214d == null) {
                f42214d = new C5399a(context.getApplicationContext());
            }
            C5399a c5399a = f42214d;
            lock.unlock();
            return c5399a;
        } catch (Throwable th) {
            f42213c.unlock();
            throw th;
        }
    }

    public static final String d(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        sb2.append(str2);
        return sb2.toString();
    }

    public GoogleSignInAccount b() {
        String strC;
        String strC2 = c("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strC2) && (strC = c(d("googleSignInAccount", strC2))) != null) {
            try {
                return GoogleSignInAccount.v(strC);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String c(String str) {
        this.f42215a.lock();
        try {
            return this.f42216b.getString(str, null);
        } finally {
            this.f42215a.unlock();
        }
    }
}
