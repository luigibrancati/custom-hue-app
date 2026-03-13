package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C2715v extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K f22912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22913b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends C2715v {
        public a(String str) {
            super(str);
        }
    }

    public C2715v(String str) {
        super(str);
        this.f22912a = null;
    }

    public static C2715v b() {
        return new C2715v("Protocol message end-group tag did not match expected tag.");
    }

    public static C2715v c() {
        return new C2715v("Protocol message contained an invalid tag (zero).");
    }

    public static C2715v d() {
        return new C2715v("Protocol message had invalid UTF-8.");
    }

    public static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static C2715v f() {
        return new C2715v("CodedInputStream encountered a malformed varint.");
    }

    public static C2715v g() {
        return new C2715v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C2715v h() {
        return new C2715v("Failed to parse the message.");
    }

    public static C2715v i() {
        return new C2715v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static C2715v l() {
        return new C2715v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static C2715v m() {
        return new C2715v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean a() {
        return this.f22913b;
    }

    public void j() {
        this.f22913b = true;
    }

    public C2715v k(K k10) {
        this.f22912a = k10;
        return this;
    }

    public C2715v(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f22912a = null;
    }
}
