package Q1;

import D1.u;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class t implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13510c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f13511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f13512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f13513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f13514d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f13515e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f13516f;

        public a(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f13511a = i10;
            this.f13512b = i11;
            this.f13513c = str;
            this.f13514d = str2;
            this.f13515e = str3;
            this.f13516f = str4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f13511a == aVar.f13511a && this.f13512b == aVar.f13512b && TextUtils.equals(this.f13513c, aVar.f13513c) && TextUtils.equals(this.f13514d, aVar.f13514d) && TextUtils.equals(this.f13515e, aVar.f13515e) && TextUtils.equals(this.f13516f, aVar.f13516f)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f13511a * 31) + this.f13512b) * 31;
            String str = this.f13513c;
            int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f13514d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f13515e;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f13516f;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public t(String str, String str2, List list) {
        this.f13508a = str;
        this.f13509b = str2;
        this.f13510c = Collections.unmodifiableList(new ArrayList(list));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.f13508a, tVar.f13508a) && TextUtils.equals(this.f13509b, tVar.f13509b) && this.f13510c.equals(tVar.f13510c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f13508a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f13509b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f13510c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f13508a != null) {
            str = " [" + this.f13508a + ", " + this.f13509b + "]";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
