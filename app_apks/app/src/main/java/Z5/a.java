package Z5;

import b6.InterfaceC2838g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements InterfaceC2838g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f20270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f20271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f20272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f20273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f20274h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20276b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f20269c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f20270d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f20271e = strA3;
        f20272f = Collections.unmodifiableSet(new HashSet(Arrays.asList(Y5.c.b("proto"), Y5.c.b("json"))));
        f20273g = new a(strA, null);
        f20274h = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f20275a = str;
        this.f20276b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // b6.InterfaceC2838g
    public Set a() {
        return f20272f;
    }

    public byte[] b() {
        String str = this.f20276b;
        if (str == null && this.f20275a == null) {
            return null;
        }
        String str2 = this.f20275a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f20276b;
    }

    public String e() {
        return this.f20275a;
    }

    @Override // b6.InterfaceC2837f
    public byte[] getExtras() {
        return b();
    }

    @Override // b6.InterfaceC2837f
    public String getName() {
        return "cct";
    }
}
