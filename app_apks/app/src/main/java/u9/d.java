package u9;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f45409d = new d("", "", false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f45410e = new d("\n", "  ", true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45413c;

    public d(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f45411a = str;
        this.f45412b = str2;
        this.f45413c = z10;
    }

    public String a() {
        return this.f45412b;
    }

    public String b() {
        return this.f45411a;
    }

    public boolean c() {
        return this.f45413c;
    }
}
