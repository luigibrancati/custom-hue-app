package s4;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX INFO: renamed from: s4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5717c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f44019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f44020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f44021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f44022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f44023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakReference f44024j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: s4.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Clickable = new a("Clickable", 0);

        static {
            a[] aVarArrA = a();
            $VALUES = aVarArrA;
            $ENTRIES = AbstractC5277b.a(aVarArrA);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{Clickable};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public C5717c(Object obj, String str, String str2, String str3, String str4, String source, String str5, boolean z10, boolean z11) {
        AbstractC4862t.e(source, "source");
        this.f44015a = obj;
        this.f44016b = str;
        this.f44017c = str2;
        this.f44018d = str3;
        this.f44019e = str4;
        this.f44020f = source;
        this.f44021g = str5;
        this.f44022h = z10;
        this.f44023i = z11;
        this.f44024j = new WeakReference(obj);
    }

    public final boolean a() {
        return this.f44023i;
    }

    public final boolean b() {
        return this.f44022h;
    }

    public final String c() {
        return this.f44016b;
    }

    public final String d() {
        return this.f44021g;
    }

    public final String e() {
        return this.f44017c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5717c)) {
            return false;
        }
        C5717c c5717c = (C5717c) obj;
        return AbstractC4862t.a(this.f44015a, c5717c.f44015a) && AbstractC4862t.a(this.f44016b, c5717c.f44016b) && AbstractC4862t.a(this.f44017c, c5717c.f44017c) && AbstractC4862t.a(this.f44018d, c5717c.f44018d) && AbstractC4862t.a(this.f44019e, c5717c.f44019e) && AbstractC4862t.a(this.f44020f, c5717c.f44020f) && AbstractC4862t.a(this.f44021g, c5717c.f44021g) && this.f44022h == c5717c.f44022h && this.f44023i == c5717c.f44023i;
    }

    public final String f() {
        return this.f44020f;
    }

    public final String g() {
        return this.f44018d;
    }

    public final String h() {
        return this.f44019e;
    }

    public int hashCode() {
        Object obj = this.f44015a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.f44016b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f44017c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f44018d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f44019e;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f44020f.hashCode()) * 31;
        String str5 = this.f44021g;
        return ((((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.f44022h)) * 31) + Boolean.hashCode(this.f44023i);
    }

    public final boolean i() {
        return this.f44022h && this.f44023i;
    }

    public String toString() {
        return "ViewTarget(_view=" + this.f44015a + ", className=" + this.f44016b + ", resourceName=" + this.f44017c + ", tag=" + this.f44018d + ", text=" + this.f44019e + ", source=" + this.f44020f + ", hierarchy=" + this.f44021g + ", ampIgnoreRageClick=" + this.f44022h + ", ampIgnoreDeadClick=" + this.f44023i + ')';
    }
}
