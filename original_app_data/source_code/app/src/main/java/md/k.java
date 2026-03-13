package md;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class k extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f40351a;

    public k(String str) {
        super(str);
        this.f40351a = null;
    }

    public static k b() {
        return new k("Protocol message end-group tag did not match expected tag.");
    }

    public static k c() {
        return new k("Protocol message contained an invalid tag (zero).");
    }

    public static k d() {
        return new k("Protocol message had invalid UTF-8.");
    }

    public static k e() {
        return new k("Protocol message tag had invalid wire type.");
    }

    public static k f() {
        return new k("CodedInputStream encountered a malformed varint.");
    }

    public static k g() {
        return new k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static k h() {
        return new k("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static k j() {
        return new k("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static k k() {
        return new k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public p a() {
        return this.f40351a;
    }

    public k i(p pVar) {
        this.f40351a = pVar;
        return this;
    }
}
