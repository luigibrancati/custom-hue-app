package X6;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C3190f2;
import com.google.android.gms.internal.measurement.C3209h3;
import com.google.android.gms.internal.measurement.C3272o3;
import com.google.android.gms.internal.measurement.EnumC3227j3;
import java.util.Collections;
import java.util.HashMap;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class E6 extends AbstractC2514v6 {
    public E6(R6 r62) {
        super(r62);
    }

    private final String k(String str) {
        String strX = this.f19261b.D0().x(str);
        if (TextUtils.isEmpty(strX)) {
            return (String) AbstractC2383f2.f18915r.b(null);
        }
        Uri uri = Uri.parse((String) AbstractC2383f2.f18915r.b(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strX).length() + 1 + String.valueOf(authority).length());
        sb2.append(strX);
        sb2.append(".");
        sb2.append(authority);
        builderBuildUpon.authority(sb2.toString());
        return builderBuildUpon.build().toString();
    }

    public static final boolean l(String str) {
        String str2 = (String) AbstractC2383f2.f18919t.b(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public final D6 i(String str) {
        F2 f2J0;
        R6 r62 = this.f19261b;
        F2 f2J02 = r62.F0().J0(str);
        D6 d62 = null;
        if (f2J02 == null || !f2J02.V()) {
            return new D6(k(str), Collections.EMPTY_MAP, EnumC2346a5.GOOGLE_ANALYTICS, null);
        }
        C3209h3 c3209h3E = C3272o3.E();
        c3209h3E.A(2);
        c3209h3E.z((EnumC3227j3) AbstractC6056k.l(EnumC3227j3.a(f2J02.M())));
        String strP0 = f2J02.p0();
        C3190f2 c3190f2W = r62.D0().w(str);
        if (c3190f2W == null || (f2J0 = r62.F0().J0(str)) == null || ((!c3190f2W.R() || c3190f2W.S().F() != 100) && !this.f18400a.C().P(str, f2J0.l0()) && (TextUtils.isEmpty(strP0) || Math.abs(strP0.hashCode() % 100) >= c3190f2W.S().F()))) {
            c3209h3E.B(3);
            return new D6(k(str), Collections.EMPTY_MAP, EnumC2346a5.GOOGLE_ANALYTICS, (C3272o3) c3209h3E.w());
        }
        String strO0 = f2J02.o0();
        c3209h3E.A(2);
        C3190f2 c3190f2W2 = r62.D0().w(f2J02.o0());
        if (c3190f2W2 == null || !c3190f2W2.R()) {
            this.f18400a.a().w().b("[sgtm] Missing sgtm_setting in remote config. appId", strO0);
            c3209h3E.B(4);
        } else {
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(f2J02.l0())) {
                map.put("x-gtm-server-preview", f2J02.l0());
            }
            String strG = c3190f2W2.S().G();
            EnumC3227j3 enumC3227j3A = EnumC3227j3.a(f2J02.M());
            if (enumC3227j3A != null && enumC3227j3A != EnumC3227j3.CLIENT_UPLOAD_ELIGIBLE) {
                c3209h3E.z(enumC3227j3A);
            } else if (l(f2J02.o0())) {
                c3209h3E.z(EnumC3227j3.PINNED_TO_SERVICE_UPLOAD);
            } else if (TextUtils.isEmpty(strG)) {
                c3209h3E.z(EnumC3227j3.MISSING_SGTM_SERVER_URL);
            } else {
                this.f18400a.a().w().b("[sgtm] Eligible for client side upload. appId", strO0);
                c3209h3E.A(3);
                c3209h3E.z(EnumC3227j3.CLIENT_UPLOAD_ELIGIBLE);
                d62 = new D6(strG, map, EnumC2346a5.SGTM_CLIENT, (C3272o3) c3209h3E.w());
            }
            c3190f2W2.S().D();
            c3190f2W2.S().E();
            C2416j3 c2416j3 = this.f18400a;
            c2416j3.c();
            if (TextUtils.isEmpty(strG)) {
                c3209h3E.B(6);
                c2416j3.a().w().b("[sgtm] Local service, missing sgtm_server_url", f2J02.o0());
            } else {
                c2416j3.a().w().b("[sgtm] Eligible for local service direct upload. appId", strO0);
                c3209h3E.A(5);
                c3209h3E.B(2);
                d62 = new D6(strG, map, EnumC2346a5.SGTM, (C3272o3) c3209h3E.w());
            }
        }
        return d62 != null ? d62 : new D6(k(str), Collections.EMPTY_MAP, EnumC2346a5.GOOGLE_ANALYTICS, (C3272o3) c3209h3E.w());
    }

    public final boolean j(String str, EnumC3227j3 enumC3227j3) {
        C3190f2 c3190f2W;
        h();
        return (enumC3227j3 != EnumC3227j3.CLIENT_UPLOAD_ELIGIBLE || l(str) || (c3190f2W = this.f19261b.D0().w(str)) == null || !c3190f2W.R() || c3190f2W.S().G().isEmpty()) ? false : true;
    }
}
