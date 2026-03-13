package W1;

import G1.M;
import K7.AbstractC1081v;
import K7.AbstractC1083x;
import android.net.Uri;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1083x f17770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1081v f17771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f17776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f17778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f17779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f17780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f17781l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f17782a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC1081v.a f17783b = new AbstractC1081v.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17784c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f17785d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f17786e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f17787f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Uri f17788g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f17789h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f17790i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f17791j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f17792k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f17793l;

        public b m(String str, String str2) {
            this.f17782a.put(str, str2);
            return this;
        }

        public b n(W1.a aVar) {
            this.f17783b.a(aVar);
            return this;
        }

        public w o() {
            return new w(this);
        }

        public b p(int i10) {
            this.f17784c = i10;
            return this;
        }

        public b q(String str) {
            this.f17789h = str;
            return this;
        }

        public b r(String str) {
            this.f17792k = str;
            return this;
        }

        public b s(String str) {
            this.f17790i = str;
            return this;
        }

        public b t(String str) {
            this.f17786e = str;
            return this;
        }

        public b u(String str) {
            this.f17793l = str;
            return this;
        }

        public b v(String str) {
            this.f17791j = str;
            return this;
        }

        public b w(String str) {
            this.f17785d = str;
            return this;
        }

        public b x(String str) {
            this.f17787f = str;
            return this;
        }

        public b y(Uri uri) {
            this.f17788g = uri;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f17775f == wVar.f17775f && this.f17770a.equals(wVar.f17770a) && this.f17771b.equals(wVar.f17771b) && Objects.equals(this.f17773d, wVar.f17773d) && Objects.equals(this.f17772c, wVar.f17772c) && Objects.equals(this.f17774e, wVar.f17774e) && Objects.equals(this.f17781l, wVar.f17781l) && Objects.equals(this.f17776g, wVar.f17776g) && Objects.equals(this.f17779j, wVar.f17779j) && Objects.equals(this.f17780k, wVar.f17780k) && Objects.equals(this.f17777h, wVar.f17777h) && Objects.equals(this.f17778i, wVar.f17778i)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((217 + this.f17770a.hashCode()) * 31) + this.f17771b.hashCode()) * 31;
        String str = this.f17773d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17772c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17774e;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f17775f) * 31;
        String str4 = this.f17781l;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.f17776g;
        int iHashCode6 = (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.f17779j;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f17780k;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f17777h;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f17778i;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public w(b bVar) {
        this.f17770a = AbstractC1083x.c(bVar.f17782a);
        this.f17771b = bVar.f17783b.k();
        this.f17772c = (String) M.i(bVar.f17785d);
        this.f17773d = (String) M.i(bVar.f17786e);
        this.f17774e = (String) M.i(bVar.f17787f);
        this.f17776g = bVar.f17788g;
        this.f17777h = bVar.f17789h;
        this.f17775f = bVar.f17784c;
        this.f17778i = bVar.f17790i;
        this.f17779j = bVar.f17792k;
        this.f17780k = bVar.f17793l;
        this.f17781l = bVar.f17791j;
    }
}
