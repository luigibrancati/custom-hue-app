package v2;

import D1.t;
import D1.u;
import G1.AbstractC0853a;
import G1.t;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: v2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6036b implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f45752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45753f;

    public C6036b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        AbstractC0853a.a(i11 == -1 || i11 > 0);
        this.f45748a = i10;
        this.f45749b = str;
        this.f45750c = str2;
        this.f45751d = str3;
        this.f45752e = z10;
        this.f45753f = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C6036b d(Map map) {
        boolean z10;
        int i10;
        C6036b c6036b;
        String str;
        String str2;
        boolean zEquals;
        int i11;
        List list = (List) map.get("icy-br");
        boolean z11 = true;
        int i12 = -1;
        if (list != null) {
            String str3 = (String) list.get(0);
            try {
                i11 = Integer.parseInt(str3) * 1000;
                if (i11 > 0) {
                    z10 = true;
                } else {
                    try {
                        t.h("IcyHeaders", "Invalid bitrate: " + str3);
                        z10 = false;
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        t.h("IcyHeaders", "Invalid bitrate header: " + str3);
                        z10 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
            i10 = i11;
        } else {
            z10 = false;
            i10 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        String str4 = null;
        if (list2 != null) {
            String str5 = (String) list2.get(0);
            c6036b = null;
            str4 = str5;
            z10 = true;
        } else {
            c6036b = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str = (String) list3.get(0);
            z10 = true;
        } else {
            str = c6036b;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str2 = (String) list4.get(0);
            z10 = true;
        } else {
            str2 = c6036b;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str6 = (String) list6.get(0);
            try {
                int i13 = Integer.parseInt(str6);
                if (i13 > 0) {
                    i12 = i13;
                } else {
                    try {
                        t.h("IcyHeaders", "Invalid metadata interval: " + str6);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        t.h("IcyHeaders", "Invalid metadata interval: " + str6);
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        int i14 = i12;
        if (z10) {
            c6036b = new C6036b(i10, str4, str, str2, zEquals, i14);
        }
        return c6036b;
    }

    @Override // D1.u.a
    public void b(t.b bVar) {
        String str = this.f45750c;
        if (str != null) {
            bVar.m0(str);
        }
        String str2 = this.f45749b;
        if (str2 != null) {
            bVar.c0(str2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6036b.class == obj.getClass()) {
            C6036b c6036b = (C6036b) obj;
            if (this.f45748a == c6036b.f45748a && Objects.equals(this.f45749b, c6036b.f45749b) && Objects.equals(this.f45750c, c6036b.f45750c) && Objects.equals(this.f45751d, c6036b.f45751d) && this.f45752e == c6036b.f45752e && this.f45753f == c6036b.f45753f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (527 + this.f45748a) * 31;
        String str = this.f45749b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f45750c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f45751d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f45752e ? 1 : 0)) * 31) + this.f45753f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f45750c + "\", genre=\"" + this.f45749b + "\", bitrate=" + this.f45748a + ", metadataInterval=" + this.f45753f;
    }
}
