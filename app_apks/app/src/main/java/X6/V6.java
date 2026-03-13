package X6;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C3151b;
import com.google.android.gms.internal.measurement.C3182e3;
import com.google.android.gms.internal.measurement.C3200g3;
import com.google.android.gms.internal.measurement.C3213h7;
import com.google.android.gms.internal.measurement.C3272o3;
import com.google.android.gms.internal.measurement.C3281p3;
import com.google.android.gms.internal.measurement.C3290q3;
import com.google.android.gms.internal.measurement.C3332v2;
import com.google.android.gms.internal.measurement.C3355y1;
import com.google.android.gms.internal.measurement.C3364z2;
import com.google.android.gms.internal.measurement.u7;
import io.sentry.ProfilingTraceData;
import io.sentry.protocol.App;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.apache.tika.metadata.TikaCoreProperties;
import org.webrtc.WebrtcBuildVersion;
import v6.AbstractC6056k;
import w6.b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class V6 extends C6 {
    public V6(R6 r62) {
        super(r62);
    }

    public static final String A(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public static final Object B(com.google.android.gms.internal.measurement.R2 r22) {
        if (r22.F()) {
            return r22.G();
        }
        if (r22.H()) {
            return Long.valueOf(r22.I());
        }
        if (r22.L()) {
            return Double.valueOf(r22.M());
        }
        if (r22.O() > 0) {
            return Y(r22.N());
        }
        return null;
    }

    public static final void C(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                z(builder, str3, string, set);
            }
        }
    }

    public static final void D(StringBuilder sb2, int i10, String str, C3182e3 c3182e3) {
        if (c3182e3 == null) {
            return;
        }
        y(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (c3182e3.G() != 0) {
            y(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : c3182e3.F()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (c3182e3.E() != 0) {
            y(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : c3182e3.D()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (c3182e3.I() != 0) {
            y(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.L2 l22 : c3182e3.H()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l22.D() ? Integer.valueOf(l22.E()) : null);
                sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                sb2.append(l22.F() ? Long.valueOf(l22.G()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (c3182e3.K() != 0) {
            y(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (C3200g3 c3200g3 : c3182e3.J()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c3200g3.D() ? Integer.valueOf(c3200g3.E()) : null);
                sb2.append(": [");
                Iterator it = c3200g3.F().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        y(sb2, 3);
        sb2.append("}\n");
    }

    public static final void E(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        y(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void F(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.E1 e12) {
        if (e12 == null) {
            return;
        }
        y(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (e12.D()) {
            int iO = e12.O();
            E(sb2, i10, "comparison_type", iO != 1 ? iO != 2 ? iO != 3 ? iO != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (e12.E()) {
            E(sb2, i10, "match_as_float", Boolean.valueOf(e12.F()));
        }
        if (e12.G()) {
            E(sb2, i10, "comparison_value", e12.H());
        }
        if (e12.I()) {
            E(sb2, i10, "min_comparison_value", e12.J());
        }
        if (e12.K()) {
            E(sb2, i10, "max_comparison_value", e12.L());
        }
        y(sb2, i10);
        sb2.append("}\n");
    }

    public static boolean O(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean P(List list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static List Q(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static com.google.android.gms.internal.measurement.B5 W(com.google.android.gms.internal.measurement.B5 b52, byte[] bArr) {
        com.google.android.gms.internal.measurement.N4 n4A = com.google.android.gms.internal.measurement.N4.a();
        return n4A != null ? b52.J0(bArr, n4A) : b52.Y(bArr);
    }

    public static int X(com.google.android.gms.internal.measurement.Y2 y22, String str) {
        for (int i10 = 0; i10 < y22.g1(); i10++) {
            if (str.equals(y22.h1(i10).F())) {
                return i10;
            }
        }
        return -1;
    }

    public static Bundle[] Y(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.R2 r22 = (com.google.android.gms.internal.measurement.R2) it.next();
            if (r22 != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.R2 r23 : r22.N()) {
                    if (r23.F()) {
                        bundle.putString(r23.E(), r23.G());
                    } else if (r23.H()) {
                        bundle.putLong(r23.E(), r23.I());
                    } else if (r23.L()) {
                        bundle.putDouble(r23.E(), r23.M());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void o(com.google.android.gms.internal.measurement.M2 m22, String str, Object obj) {
        List listZ = m22.z();
        int i10 = 0;
        while (true) {
            if (i10 >= listZ.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.R2) listZ.get(i10)).E())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.Q2 q2P = com.google.android.gms.internal.measurement.R2.P();
        q2P.A(str);
        q2P.E(((Long) obj).longValue());
        if (i10 >= 0) {
            m22.D(i10, q2P);
        } else {
            m22.F(q2P);
        }
    }

    public static final boolean p(I i10, c7 c7Var) {
        AbstractC6056k.l(i10);
        AbstractC6056k.l(c7Var);
        return !TextUtils.isEmpty(c7Var.f18744b);
    }

    public static final Bundle q(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.R2 r22 = (com.google.android.gms.internal.measurement.R2) it.next();
            String strE = r22.E();
            if (r22.L()) {
                bundle.putDouble(strE, r22.M());
            } else if (r22.J()) {
                bundle.putFloat(strE, r22.K());
            } else if (r22.F()) {
                bundle.putString(strE, r22.G());
            } else if (r22.H()) {
                bundle.putLong(strE, r22.I());
            }
        }
        return bundle;
    }

    public static final com.google.android.gms.internal.measurement.R2 r(com.google.android.gms.internal.measurement.N2 n22, String str) {
        for (com.google.android.gms.internal.measurement.R2 r22 : n22.D()) {
            if (r22.E().equals(str)) {
                return r22;
            }
        }
        return null;
    }

    public static final Map s(com.google.android.gms.internal.measurement.N2 n22, String... strArr) {
        Object objB;
        HashMap map = new HashMap();
        for (com.google.android.gms.internal.measurement.R2 r22 : n22.D()) {
            if (Arrays.asList(strArr).contains(r22.E()) && (objB = B(r22)) != null) {
                map.put(r22.E(), objB);
            }
        }
        return map;
    }

    public static final Map t(com.google.android.gms.internal.measurement.N2 n22, String str) {
        Object objB;
        HashMap map = new HashMap();
        for (com.google.android.gms.internal.measurement.R2 r22 : n22.D()) {
            if (r22.E().startsWith("gad_") && (objB = B(r22)) != null) {
                map.put(r22.E(), objB);
            }
        }
        return map;
    }

    public static final Object u(com.google.android.gms.internal.measurement.N2 n22, String str) {
        com.google.android.gms.internal.measurement.R2 r2R = r(n22, str);
        if (r2R == null) {
            return null;
        }
        return B(r2R);
    }

    public static final Object v(com.google.android.gms.internal.measurement.N2 n22, String str, Object obj) {
        Object objU = u(n22, str);
        return objU == null ? obj : objU;
    }

    public static final void y(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    public static final void z(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public final void G(C3281p3 c3281p3, Object obj) {
        AbstractC6056k.l(obj);
        c3281p3.C();
        c3281p3.E();
        c3281p3.G();
        if (obj instanceof String) {
            c3281p3.B((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c3281p3.D(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c3281p3.F(((Double) obj).doubleValue());
        } else {
            this.f18400a.a().o().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void H(com.google.android.gms.internal.measurement.Q2 q22, Object obj) {
        AbstractC6056k.l(obj);
        q22.D();
        q22.F();
        q22.H();
        q22.L();
        if (obj instanceof String) {
            q22.C((String) obj);
            return;
        }
        if (obj instanceof Long) {
            q22.E(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            q22.G(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.f18400a.a().o().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.Q2 q2P = com.google.android.gms.internal.measurement.R2.P();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.Q2 q2P2 = com.google.android.gms.internal.measurement.R2.P();
                    q2P2.A(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        q2P2.E(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        q2P2.C((String) obj2);
                    } else if (obj2 instanceof Double) {
                        q2P2.G(((Double) obj2).doubleValue());
                    }
                    q2P.J(q2P2);
                }
                if (q2P.I() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.R2) q2P.w());
                }
            }
        }
        q22.K(arrayList);
    }

    public final C2482r6 I(String str, com.google.android.gms.internal.measurement.Y2 y22, com.google.android.gms.internal.measurement.M2 m22, String str2) {
        int iIndexOf;
        C3213h7.a();
        C2416j3 c2416j3 = this.f18400a;
        if (!c2416j3.w().H(str, AbstractC2383f2.f18850Q0)) {
            return null;
        }
        long jA = c2416j3.e().a();
        Set setOf = Set.of((Object[]) c2416j3.w().C(str, AbstractC2383f2.f18924v0).split(","));
        R6 r62 = this.f19261b;
        E6 e6C0 = r62.C0();
        String strX = e6C0.f19261b.D0().x(str);
        Uri.Builder builder = new Uri.Builder();
        C2416j3 c2416j32 = e6C0.f18400a;
        builder.scheme(c2416j32.w().C(str, AbstractC2383f2.f18910o0));
        if (TextUtils.isEmpty(strX)) {
            builder.authority(c2416j32.w().C(str, AbstractC2383f2.f18912p0));
        } else {
            String strC = c2416j32.w().C(str, AbstractC2383f2.f18912p0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strX).length() + 1 + String.valueOf(strC).length());
            sb2.append(strX);
            sb2.append(".");
            sb2.append(strC);
            builder.authority(sb2.toString());
        }
        builder.path(c2416j32.w().C(str, AbstractC2383f2.f18914q0));
        z(builder, "gmp_app_id", y22.w0(), setOf);
        c2416j3.w().A();
        z(builder, "gmp_version", String.valueOf(133005L), setOf);
        String strU = y22.U();
        C2436m c2436mW = c2416j3.w();
        C2375e2 c2375e2 = AbstractC2383f2.f18856T0;
        if (c2436mW.H(str, c2375e2) && r62.D0().N(str)) {
            strU = "";
        }
        z(builder, "app_instance_id", strU, setOf);
        z(builder, "rdid", y22.O(), setOf);
        z(builder, "bundle_id", y22.J(), setOf);
        String strJ = m22.J();
        String strA = T3.a(strJ);
        if (true != TextUtils.isEmpty(strA)) {
            strJ = strA;
        }
        z(builder, "app_event_name", strJ, setOf);
        z(builder, App.JsonKeys.APP_VERSION, String.valueOf(y22.C0()), setOf);
        String strC2 = y22.C();
        if (c2416j3.w().H(str, c2375e2) && r62.D0().K(str) && !TextUtils.isEmpty(strC2) && (iIndexOf = strC2.indexOf(".")) != -1) {
            strC2 = strC2.substring(0, iIndexOf);
        }
        z(builder, "os_version", strC2, setOf);
        z(builder, "timestamp", String.valueOf(m22.M()), setOf);
        if (y22.R()) {
            z(builder, "lat", "1", setOf);
        }
        z(builder, "privacy_sandbox_version", String.valueOf(y22.i0()), setOf);
        z(builder, "trigger_uri_source", "1", setOf);
        z(builder, "trigger_uri_timestamp", String.valueOf(jA), setOf);
        z(builder, "request_uuid", str2, setOf);
        List<com.google.android.gms.internal.measurement.R2> listZ = m22.z();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.R2 r22 : listZ) {
            String strE = r22.E();
            if (r22.L()) {
                bundle.putString(strE, String.valueOf(r22.M()));
            } else if (r22.J()) {
                bundle.putString(strE, String.valueOf(r22.K()));
            } else if (r22.F()) {
                bundle.putString(strE, r22.G());
            } else if (r22.H()) {
                bundle.putString(strE, String.valueOf(r22.I()));
            }
        }
        C(builder, c2416j3.w().C(str, AbstractC2383f2.f18922u0).split("\\|"), bundle, setOf);
        List<C3290q3> listF1 = y22.f1();
        Bundle bundle2 = new Bundle();
        for (C3290q3 c3290q3 : listF1) {
            String strF = c3290q3.F();
            if (c3290q3.M()) {
                bundle2.putString(strF, String.valueOf(c3290q3.N()));
            } else if (c3290q3.K()) {
                bundle2.putString(strF, String.valueOf(c3290q3.L()));
            } else if (c3290q3.G()) {
                bundle2.putString(strF, c3290q3.H());
            } else if (c3290q3.I()) {
                bundle2.putString(strF, String.valueOf(c3290q3.J()));
            }
        }
        C(builder, c2416j3.w().C(str, AbstractC2383f2.f18920t0).split("\\|"), bundle2, setOf);
        z(builder, "dma", true != y22.d0() ? WebrtcBuildVersion.maint_version : "1", setOf);
        if (!y22.f0().isEmpty()) {
            z(builder, "dma_cps", y22.f0(), setOf);
        }
        if (y22.m0()) {
            C3332v2 c3332v2N0 = y22.n0();
            if (!c3332v2N0.O().isEmpty()) {
                z(builder, "dl_gclid", c3332v2N0.O(), setOf);
            }
            if (!c3332v2N0.Q().isEmpty()) {
                z(builder, "dl_gbraid", c3332v2N0.Q(), setOf);
            }
            if (!c3332v2N0.S().isEmpty()) {
                z(builder, "dl_gs", c3332v2N0.S(), setOf);
            }
            if (c3332v2N0.U() > 0) {
                z(builder, "dl_ss_ts", String.valueOf(c3332v2N0.U()), setOf);
            }
            if (!c3332v2N0.W().isEmpty()) {
                z(builder, "mr_gclid", c3332v2N0.W(), setOf);
            }
            if (!c3332v2N0.Z().isEmpty()) {
                z(builder, "mr_gbraid", c3332v2N0.Z(), setOf);
            }
            if (!c3332v2N0.b0().isEmpty()) {
                z(builder, "mr_gs", c3332v2N0.b0(), setOf);
            }
            if (c3332v2N0.d0() > 0) {
                z(builder, "mr_click_ts", String.valueOf(c3332v2N0.d0()), setOf);
            }
        }
        return new C2482r6(builder.build().toString(), jA, 1);
    }

    public final com.google.android.gms.internal.measurement.N2 J(D d10) {
        com.google.android.gms.internal.measurement.M2 m2N = com.google.android.gms.internal.measurement.N2.N();
        m2N.P(d10.f18199e);
        G g10 = d10.f18200f;
        F f10 = new F(g10);
        while (f10.hasNext()) {
            String next = f10.next();
            com.google.android.gms.internal.measurement.Q2 q2P = com.google.android.gms.internal.measurement.R2.P();
            q2P.A(next);
            Object objD = g10.d(next);
            AbstractC6056k.l(objD);
            H(q2P, objD);
            m2N.F(q2P);
        }
        String str = d10.f18197c;
        if (!TextUtils.isEmpty(str) && g10.d("_o") == null) {
            com.google.android.gms.internal.measurement.Q2 q2P2 = com.google.android.gms.internal.measurement.R2.P();
            q2P2.A("_o");
            q2P2.C(str);
            m2N.E((com.google.android.gms.internal.measurement.R2) q2P2.w());
        }
        return (com.google.android.gms.internal.measurement.N2) m2N.w();
    }

    public final String K(com.google.android.gms.internal.measurement.X2 x22) {
        C3364z2 c3364z2A1;
        if (x22 == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        if (x22.I()) {
            E(sb2, 0, "upload_subdomain", x22.J());
        }
        if (x22.G()) {
            E(sb2, 0, "sgtm_join_id", x22.H());
        }
        for (com.google.android.gms.internal.measurement.Z2 z22 : x22.D()) {
            if (z22 != null) {
                y(sb2, 1);
                sb2.append("bundle {\n");
                if (z22.e0()) {
                    E(sb2, 1, "protocol_version", Integer.valueOf(z22.h1()));
                }
                u7.a();
                C2416j3 c2416j3 = this.f18400a;
                if (c2416j3.w().H(z22.D(), AbstractC2383f2.f18844N0) && z22.N0()) {
                    E(sb2, 1, "session_stitching_token", z22.O0());
                }
                E(sb2, 1, "platform", z22.B2());
                if (z22.F()) {
                    E(sb2, 1, "gmp_version", Long.valueOf(z22.G()));
                }
                if (z22.H()) {
                    E(sb2, 1, "uploading_gmp_version", Long.valueOf(z22.I()));
                }
                if (z22.H0()) {
                    E(sb2, 1, "dynamite_version", Long.valueOf(z22.I0()));
                }
                if (z22.a0()) {
                    E(sb2, 1, "config_version", Long.valueOf(z22.b0()));
                }
                E(sb2, 1, "gmp_app_id", z22.S());
                E(sb2, 1, "app_id", z22.D());
                E(sb2, 1, App.JsonKeys.APP_VERSION, z22.E());
                if (z22.X()) {
                    E(sb2, 1, "app_version_major", Integer.valueOf(z22.Z()));
                }
                E(sb2, 1, "firebase_instance_id", z22.W());
                if (z22.N()) {
                    E(sb2, 1, "dev_cert_hash", Long.valueOf(z22.O()));
                }
                E(sb2, 1, "app_store", z22.H2());
                if (z22.r2()) {
                    E(sb2, 1, "upload_timestamp_millis", Long.valueOf(z22.s2()));
                }
                if (z22.t2()) {
                    E(sb2, 1, "start_timestamp_millis", Long.valueOf(z22.u2()));
                }
                if (z22.v2()) {
                    E(sb2, 1, "end_timestamp_millis", Long.valueOf(z22.w2()));
                }
                if (z22.x2()) {
                    E(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(z22.y2()));
                }
                if (z22.z2()) {
                    E(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(z22.A2()));
                }
                E(sb2, 1, "app_instance_id", z22.M());
                E(sb2, 1, "resettable_device_id", z22.J());
                E(sb2, 1, "ds_id", z22.d0());
                if (z22.K()) {
                    E(sb2, 1, "limited_ad_tracking", Boolean.valueOf(z22.L()));
                }
                E(sb2, 1, "os_version", z22.C2());
                E(sb2, 1, ProfilingTraceData.JsonKeys.DEVICE_MODEL, z22.D2());
                E(sb2, 1, "user_default_language", z22.E2());
                if (z22.F2()) {
                    E(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(z22.G2()));
                }
                if (z22.P()) {
                    E(sb2, 1, "bundle_sequential_index", Integer.valueOf(z22.Q()));
                }
                if (z22.b1()) {
                    E(sb2, 1, "delivery_index", Integer.valueOf(z22.c1()));
                }
                if (z22.T()) {
                    E(sb2, 1, "service_upload", Boolean.valueOf(z22.U()));
                }
                E(sb2, 1, "health_monitor", z22.R());
                if (z22.F0()) {
                    E(sb2, 1, "retry_counter", Integer.valueOf(z22.G0()));
                }
                if (z22.K0()) {
                    E(sb2, 1, "consent_signals", z22.L0());
                }
                if (z22.U0()) {
                    E(sb2, 1, "is_dma_region", Boolean.valueOf(z22.V0()));
                }
                if (z22.W0()) {
                    E(sb2, 1, "core_platform_services", z22.X0());
                }
                if (z22.S0()) {
                    E(sb2, 1, "consent_diagnostics", z22.T0());
                }
                if (z22.P0()) {
                    E(sb2, 1, "target_os_version", Long.valueOf(z22.Q0()));
                }
                C3213h7.a();
                if (c2416j3.w().H(z22.D(), AbstractC2383f2.f18850Q0)) {
                    E(sb2, 1, "ad_services_version", Integer.valueOf(z22.Y0()));
                    if (z22.Z0() && (c3364z2A1 = z22.a1()) != null) {
                        y(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        E(sb2, 2, "eligible", Boolean.valueOf(c3364z2A1.D()));
                        E(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(c3364z2A1.E()));
                        E(sb2, 2, "pre_r", Boolean.valueOf(c3364z2A1.F()));
                        E(sb2, 2, "r_extensions_too_old", Boolean.valueOf(c3364z2A1.G()));
                        E(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(c3364z2A1.H()));
                        E(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(c3364z2A1.I()));
                        E(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(c3364z2A1.J()));
                        y(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                if (z22.d1()) {
                    C3332v2 c3332v2E1 = z22.e1();
                    y(sb2, 2);
                    sb2.append("ad_campaign_info {\n");
                    if (c3332v2E1.N()) {
                        E(sb2, 2, "deep_link_gclid", c3332v2E1.O());
                    }
                    if (c3332v2E1.P()) {
                        E(sb2, 2, "deep_link_gbraid", c3332v2E1.Q());
                    }
                    if (c3332v2E1.R()) {
                        E(sb2, 2, "deep_link_gad_source", c3332v2E1.S());
                    }
                    if (c3332v2E1.T()) {
                        E(sb2, 2, "deep_link_session_millis", Long.valueOf(c3332v2E1.U()));
                    }
                    if (c3332v2E1.V()) {
                        E(sb2, 2, "market_referrer_gclid", c3332v2E1.W());
                    }
                    if (c3332v2E1.X()) {
                        E(sb2, 2, "market_referrer_gbraid", c3332v2E1.Z());
                    }
                    if (c3332v2E1.a0()) {
                        E(sb2, 2, "market_referrer_gad_source", c3332v2E1.b0());
                    }
                    if (c3332v2E1.c0()) {
                        E(sb2, 2, "market_referrer_click_millis", Long.valueOf(c3332v2E1.d0()));
                    }
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                if (z22.f0()) {
                    E(sb2, 1, "batching_timestamp_millis", Long.valueOf(z22.g0()));
                }
                if (z22.f1()) {
                    C3272o3 c3272o3G1 = z22.g1();
                    y(sb2, 2);
                    sb2.append("sgtm_diagnostics {\n");
                    int I10 = c3272o3G1.I();
                    E(sb2, 2, "upload_type", I10 != 1 ? I10 != 2 ? I10 != 3 ? I10 != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    E(sb2, 2, "client_upload_eligibility", c3272o3G1.D().name());
                    int iJ = c3272o3G1.J();
                    E(sb2, 2, "service_upload_eligibility", iJ != 1 ? iJ != 2 ? iJ != 3 ? iJ != 4 ? iJ != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                if (z22.h0()) {
                    com.google.android.gms.internal.measurement.J2 j2I0 = z22.i0();
                    y(sb2, 2);
                    sb2.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.G2 g22 : j2I0.D()) {
                        y(sb2, 3);
                        sb2.append("limited_data_modes {\n");
                        int iF = g22.F();
                        E(sb2, 3, "type", iF != 1 ? iF != 2 ? iF != 3 ? iF != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int iG = g22.G();
                        E(sb2, 3, "mode", iG != 1 ? iG != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        y(sb2, 3);
                        sb2.append("}\n");
                    }
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                List<C3290q3> listO2 = z22.o2();
                if (listO2 != null) {
                    for (C3290q3 c3290q3 : listO2) {
                        if (c3290q3 != null) {
                            y(sb2, 2);
                            sb2.append("user_property {\n");
                            E(sb2, 2, "set_timestamp_millis", c3290q3.D() ? Long.valueOf(c3290q3.E()) : null);
                            E(sb2, 2, "name", c2416j3.D().c(c3290q3.F()));
                            E(sb2, 2, "string_value", c3290q3.H());
                            E(sb2, 2, "int_value", c3290q3.I() ? Long.valueOf(c3290q3.J()) : null);
                            E(sb2, 2, "double_value", c3290q3.M() ? Double.valueOf(c3290q3.N()) : null);
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.B2> listV = z22.V();
                if (listV != null) {
                    for (com.google.android.gms.internal.measurement.B2 b22 : listV) {
                        if (b22 != null) {
                            y(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (b22.D()) {
                                E(sb2, 2, "audience_id", Integer.valueOf(b22.E()));
                            }
                            if (b22.I()) {
                                E(sb2, 2, "new_audience", Boolean.valueOf(b22.J()));
                            }
                            D(sb2, 2, "current_data", b22.F());
                            if (b22.G()) {
                                D(sb2, 2, "previous_data", b22.H());
                            }
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.N2> listI2 = z22.i2();
                if (listI2 != null) {
                    for (com.google.android.gms.internal.measurement.N2 n22 : listI2) {
                        if (n22 != null) {
                            y(sb2, 2);
                            sb2.append("event {\n");
                            E(sb2, 2, "name", c2416j3.D().a(n22.G()));
                            if (n22.H()) {
                                E(sb2, 2, "timestamp_millis", Long.valueOf(n22.I()));
                            }
                            if (n22.J()) {
                                E(sb2, 2, "previous_timestamp_millis", Long.valueOf(n22.K()));
                            }
                            if (n22.L()) {
                                E(sb2, 2, "count", Integer.valueOf(n22.M()));
                            }
                            if (n22.E() != 0) {
                                w(sb2, 2, n22.D());
                            }
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                y(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("} // End-of-batch\n");
        return sb2.toString();
    }

    public final String L(C3355y1 c3355y1) {
        if (c3355y1 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (c3355y1.D()) {
            E(sb2, 0, "filter_id", Integer.valueOf(c3355y1.E()));
        }
        E(sb2, 0, "event_name", this.f18400a.D().a(c3355y1.F()));
        String strA = A(c3355y1.L(), c3355y1.M(), c3355y1.O());
        if (!strA.isEmpty()) {
            E(sb2, 0, "filter_type", strA);
        }
        if (c3355y1.J()) {
            F(sb2, 1, "event_count_filter", c3355y1.K());
        }
        if (c3355y1.H() > 0) {
            sb2.append("  filters {\n");
            Iterator it = c3355y1.G().iterator();
            while (it.hasNext()) {
                x(sb2, 2, (com.google.android.gms.internal.measurement.A1) it.next());
            }
        }
        y(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    public final String M(com.google.android.gms.internal.measurement.G1 g12) {
        if (g12 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (g12.D()) {
            E(sb2, 0, "filter_id", Integer.valueOf(g12.E()));
        }
        E(sb2, 0, "property_name", this.f18400a.D().c(g12.F()));
        String strA = A(g12.H(), g12.I(), g12.K());
        if (!strA.isEmpty()) {
            E(sb2, 0, "filter_type", strA);
        }
        x(sb2, 1, g12.G());
        sb2.append("}\n");
        return sb2.toString();
    }

    public final Parcelable N(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
            } catch (b.a unused) {
                this.f18400a.a().o().a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final List R(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f18400a.a().r().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.f18400a.a().r().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    public final boolean S(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.f18400a.e().a() - j10) > j11;
    }

    public final long T(byte[] bArr) {
        AbstractC6056k.l(bArr);
        C2416j3 c2416j3 = this.f18400a;
        c2416j3.C().h();
        MessageDigest messageDigestC = a7.C();
        if (messageDigestC != null) {
            return a7.D(messageDigestC.digest(bArr));
        }
        c2416j3.a().o().a("Failed to get MD5");
        return 0L;
    }

    public final long U(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return T(str.getBytes(Charset.forName("UTF-8")));
    }

    public final byte[] V(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.f18400a.a().o().b("Failed to gzip content", e10);
            throw e10;
        }
    }

    public final Map Z(Bundle bundle, boolean z10) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(Z((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Object obj2 = arrayList2.get(i10);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(Z((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(Z((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    @Override // X6.C6
    public final boolean l() {
        return false;
    }

    public final I m(C3151b c3151b) {
        Object obj;
        Bundle bundleN = n(c3151b.f(), true);
        String string = (!bundleN.containsKey("_o") || (obj = bundleN.get("_o")) == null) ? App.TYPE : obj.toString();
        String strB = T3.b(c3151b.b());
        if (strB == null) {
            strB = c3151b.b();
        }
        return new I(strB, new G(bundleN), string, c3151b.a());
    }

    public final Bundle n(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(n((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public final void w(StringBuilder sb2, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.R2 r22 = (com.google.android.gms.internal.measurement.R2) it.next();
            if (r22 != null) {
                y(sb2, i11);
                sb2.append("param {\n");
                E(sb2, i11, "name", r22.D() ? this.f18400a.D().b(r22.E()) : null);
                E(sb2, i11, "string_value", r22.F() ? r22.G() : null);
                E(sb2, i11, "int_value", r22.H() ? Long.valueOf(r22.I()) : null);
                E(sb2, i11, "double_value", r22.L() ? Double.valueOf(r22.M()) : null);
                if (r22.O() > 0) {
                    w(sb2, i11, r22.N());
                }
                y(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    public final void x(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.A1 a12) {
        String str;
        if (a12 == null) {
            return;
        }
        y(sb2, i10);
        sb2.append("filter {\n");
        if (a12.H()) {
            E(sb2, i10, "complement", Boolean.valueOf(a12.I()));
        }
        if (a12.J()) {
            E(sb2, i10, "param_name", this.f18400a.D().b(a12.K()));
        }
        if (a12.D()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.K1 k1E = a12.E();
            if (k1E != null) {
                y(sb2, i11);
                sb2.append("string_filter {\n");
                if (k1E.D()) {
                    switch (k1E.M()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    E(sb2, i11, "match_type", str);
                }
                if (k1E.E()) {
                    E(sb2, i11, "expression", k1E.F());
                }
                if (k1E.G()) {
                    E(sb2, i11, "case_sensitive", Boolean.valueOf(k1E.H()));
                }
                if (k1E.J() > 0) {
                    y(sb2, i10 + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : k1E.I()) {
                        y(sb2, i10 + 3);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                y(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (a12.F()) {
            F(sb2, i10 + 1, "number_filter", a12.G());
        }
        y(sb2, i10);
        sb2.append("}\n");
    }
}
