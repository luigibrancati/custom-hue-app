package X6;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final A f18137f = new A((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f18140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumMap f18142e;

    public A(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(R3.class);
        this.f18142e = enumMap;
        enumMap.put(R3.AD_USER_DATA, S3.h(bool));
        this.f18138a = i10;
        this.f18139b = l();
        this.f18140c = bool2;
        this.f18141d = str;
    }

    public static A a(P3 p32, int i10) {
        EnumMap enumMap = new EnumMap(R3.class);
        enumMap.put(R3.AD_USER_DATA, p32);
        return new A(enumMap, -10, (Boolean) null, (String) null);
    }

    public static A g(String str) {
        if (str == null || str.length() <= 0) {
            return f18137f;
        }
        String[] strArrSplit = str.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(R3.class);
        R3[] r3ArrA = Q3.DMA.a();
        int length = r3ArrA.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put(r3ArrA[i12], S3.j(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new A(enumMap, i10, (Boolean) null, (String) null);
    }

    public static A h(Bundle bundle, int i10) {
        if (bundle == null) {
            return new A((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(R3.class);
        for (R3 r32 : Q3.DMA.a()) {
            enumMap.put(r32, S3.g(bundle.getString(r32.zze)));
        }
        return new A(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean i(Bundle bundle) {
        P3 p3G;
        if (bundle == null || (p3G = S3.g(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = p3G.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final int b() {
        return this.f18138a;
    }

    public final P3 c() {
        P3 p32 = (P3) this.f18142e.get(R3.AD_USER_DATA);
        return p32 == null ? P3.UNINITIALIZED : p32;
    }

    public final boolean d() {
        Iterator it = this.f18142e.values().iterator();
        while (it.hasNext()) {
            if (((P3) it.next()) != P3.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String e() {
        return this.f18139b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        if (this.f18139b.equalsIgnoreCase(a10.f18139b) && Objects.equals(this.f18140c, a10.f18140c)) {
            return Objects.equals(this.f18141d, a10.f18141d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f18142e.entrySet()) {
            String strI = S3.i((P3) entry.getValue());
            if (strI != null) {
                bundle.putString(((R3) entry.getKey()).zze, strI);
            }
        }
        Boolean bool = this.f18140c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f18141d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final int hashCode() {
        Boolean bool = this.f18140c;
        int i10 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f18141d;
        return this.f18139b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final Boolean j() {
        return this.f18140c;
    }

    public final String k() {
        return this.f18141d;
    }

    public final String l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18138a);
        for (R3 r32 : Q3.DMA.a()) {
            sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            sb2.append(S3.m((P3) this.f18142e.get(r32)));
        }
        return sb2.toString();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(S3.d(this.f18138a));
        for (R3 r32 : Q3.DMA.a()) {
            sb2.append(",");
            sb2.append(r32.zze);
            sb2.append("=");
            P3 p32 = (P3) this.f18142e.get(r32);
            if (p32 == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = p32.ordinal();
                if (iOrdinal == 0) {
                    sb2.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb2.append("denied");
                } else if (iOrdinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f18140c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f18141d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public A(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(R3.class);
        this.f18142e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f18138a = i10;
        this.f18139b = l();
        this.f18140c = bool;
        this.f18141d = str;
    }
}
