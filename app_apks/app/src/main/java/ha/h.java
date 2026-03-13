package ha;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f36417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f36418g;

    public h() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    public final String a() {
        return this.f36412a;
    }

    public final Integer b() {
        return this.f36417f;
    }

    public final String c() {
        return this.f36416e;
    }

    public final String d() {
        return this.f36414c;
    }

    public final boolean e() {
        return this.f36418g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC4862t.a(this.f36412a, hVar.f36412a) && AbstractC4862t.a(this.f36413b, hVar.f36413b) && AbstractC4862t.a(this.f36414c, hVar.f36414c) && AbstractC4862t.a(this.f36415d, hVar.f36415d) && AbstractC4862t.a(this.f36416e, hVar.f36416e) && AbstractC4862t.a(this.f36417f, hVar.f36417f) && this.f36418g == hVar.f36418g;
    }

    public final String f() {
        return this.f36415d;
    }

    public final String g() {
        return this.f36413b;
    }

    public int hashCode() {
        int iHashCode = ((((this.f36412a.hashCode() * 31) + this.f36413b.hashCode()) * 31) + this.f36414c.hashCode()) * 31;
        String str = this.f36415d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f36416e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f36417f;
        return ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.f36418g);
    }

    public String toString() {
        return "NotificationOptions(channelName=" + this.f36412a + ", title=" + this.f36413b + ", iconName=" + this.f36414c + ", subtitle=" + this.f36415d + ", description=" + this.f36416e + ", color=" + this.f36417f + ", onTapBringToFront=" + this.f36418g + ")";
    }

    public h(String channelName, String title, String iconName, String str, String str2, Integer num, boolean z10) {
        AbstractC4862t.e(channelName, "channelName");
        AbstractC4862t.e(title, "title");
        AbstractC4862t.e(iconName, "iconName");
        this.f36412a = channelName;
        this.f36413b = title;
        this.f36414c = iconName;
        this.f36415d = str;
        this.f36416e = str2;
        this.f36417f = num;
        this.f36418g = z10;
    }

    public /* synthetic */ h(String str, String str2, String str3, String str4, String str5, Integer num, boolean z10, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? "Location background service" : str, (i10 & 2) != 0 ? "Location background service running" : str2, (i10 & 4) != 0 ? "navigation_empty_icon" : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : num, (i10 & 64) != 0 ? false : z10);
    }
}
