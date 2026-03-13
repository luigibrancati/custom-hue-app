package X6;

import android.content.pm.PackageManager;
import android.util.Pair;
import io.sentry.util.StringUtils;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import n6.C5134a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class W5 extends C6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f18632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K2 f18633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final K2 f18634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final K2 f18635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final K2 f18636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final K2 f18637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final K2 f18638j;

    public W5(R6 r62) {
        super(r62);
        this.f18632d = new HashMap();
        N2 n2X = this.f18400a.x();
        Objects.requireNonNull(n2X);
        this.f18633e = new K2(n2X, "last_delete_stale", 0L);
        N2 n2X2 = this.f18400a.x();
        Objects.requireNonNull(n2X2);
        this.f18634f = new K2(n2X2, "last_delete_stale_batch", 0L);
        N2 n2X3 = this.f18400a.x();
        Objects.requireNonNull(n2X3);
        this.f18635g = new K2(n2X3, "backoff", 0L);
        N2 n2X4 = this.f18400a.x();
        Objects.requireNonNull(n2X4);
        this.f18636h = new K2(n2X4, "last_upload", 0L);
        N2 n2X5 = this.f18400a.x();
        Objects.requireNonNull(n2X5);
        this.f18637i = new K2(n2X5, "last_upload_attempt", 0L);
        N2 n2X6 = this.f18400a.x();
        Objects.requireNonNull(n2X6);
        this.f18638j = new K2(n2X6, "midnight_offset", 0L);
    }

    @Override // X6.C6
    public final boolean l() {
        return false;
    }

    public final Pair m(String str, S3 s32) {
        return s32.o(R3.AD_STORAGE) ? n(str) : new Pair("", Boolean.FALSE);
    }

    public final Pair n(String str) {
        V5 v52;
        C5134a.C0536a c0536aA;
        h();
        C2416j3 c2416j3 = this.f18400a;
        long jC = c2416j3.e().c();
        V5 v53 = (V5) this.f18632d.get(str);
        if (v53 != null && jC < v53.f18626c) {
            return new Pair(v53.f18624a, Boolean.valueOf(v53.f18625b));
        }
        C5134a.b(true);
        long jD = c2416j3.w().D(str, AbstractC2383f2.f18872b) + jC;
        try {
            try {
                c0536aA = C5134a.a(c2416j3.d());
            } catch (PackageManager.NameNotFoundException unused) {
                c0536aA = null;
                if (v53 != null && jC < v53.f18626c + this.f18400a.w().D(str, AbstractC2383f2.f18875c)) {
                    return new Pair(v53.f18624a, Boolean.valueOf(v53.f18625b));
                }
            }
        } catch (Exception e10) {
            this.f18400a.a().v().b("Unable to get advertising id", e10);
            v52 = new V5("", false, jD);
        }
        if (c0536aA == null) {
            return new Pair(StringUtils.PROPER_NIL_UUID, Boolean.FALSE);
        }
        String strA = c0536aA.a();
        v52 = strA != null ? new V5(strA, c0536aA.b(), jD) : new V5("", c0536aA.b(), jD);
        this.f18632d.put(str, v52);
        C5134a.b(false);
        return new Pair(v52.f18624a, Boolean.valueOf(v52.f18625b));
    }

    public final String o(String str, boolean z10) {
        h();
        String str2 = z10 ? (String) n(str).first : StringUtils.PROPER_NIL_UUID;
        MessageDigest messageDigestC = a7.C();
        if (messageDigestC == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestC.digest(str2.getBytes())));
    }
}
