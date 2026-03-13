package Od;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Od.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C1823c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1823c f12393a = new C1823c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f12394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f12395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f12396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f12397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f12398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f12399g;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC4862t.d(charsetForName, "forName(...)");
        f12394b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        AbstractC4862t.d(charsetForName2, "forName(...)");
        f12395c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        AbstractC4862t.d(charsetForName3, "forName(...)");
        f12396d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        AbstractC4862t.d(charsetForName4, "forName(...)");
        f12397e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        AbstractC4862t.d(charsetForName5, "forName(...)");
        f12398f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        AbstractC4862t.d(charsetForName6, "forName(...)");
        f12399g = charsetForName6;
    }
}
