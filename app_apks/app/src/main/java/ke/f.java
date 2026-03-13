package ke;

import android.net.Uri;
import android.util.Base64;
import java.security.SecureRandom;
import ke.h;
import ke.n;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static String a() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    public static InterfaceC4842d b(String str, String str2) {
        p.e(str, "jsonStr can not be null");
        JSONObject jSONObject = new JSONObject(str);
        if ("authorization".equals(str2)) {
            return g.c(jSONObject);
        }
        if ("end_session".equals(str2)) {
            return m.c(jSONObject);
        }
        throw new IllegalArgumentException("No AuthorizationManagementRequest found matching to this json schema");
    }

    public static String c(InterfaceC4842d interfaceC4842d) {
        if (interfaceC4842d instanceof g) {
            return "authorization";
        }
        if (interfaceC4842d instanceof m) {
            return "end_session";
        }
        return null;
    }

    public static AbstractC4843e d(InterfaceC4842d interfaceC4842d, Uri uri) {
        if (interfaceC4842d instanceof g) {
            return new h.b((g) interfaceC4842d).b(uri).a();
        }
        if (interfaceC4842d instanceof m) {
            return new n.b((m) interfaceC4842d).b(uri).a();
        }
        throw new IllegalArgumentException("Malformed request or uri");
    }
}
