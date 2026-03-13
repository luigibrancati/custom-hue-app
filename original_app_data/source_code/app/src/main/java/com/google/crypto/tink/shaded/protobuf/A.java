package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class A extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q f31382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f31383b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends A {
        public a(String str) {
            super(str);
        }
    }

    public A(String str) {
        super(str);
        this.f31382a = null;
    }

    public static A b() {
        return new A("Protocol message end-group tag did not match expected tag.");
    }

    public static A c() {
        return new A("Protocol message contained an invalid tag (zero).");
    }

    public static A d() {
        return new A("Protocol message had invalid UTF-8.");
    }

    public static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static A f() {
        return new A("CodedInputStream encountered a malformed varint.");
    }

    public static A g() {
        return new A("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static A h() {
        return new A("Failed to parse the message.");
    }

    public static A i() {
        return new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static A l() {
        return new A("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public static A m() {
        return new A("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean a() {
        return this.f31383b;
    }

    public void j() {
        this.f31383b = true;
    }

    public A k(Q q10) {
        this.f31382a = q10;
        return this;
    }

    public A(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f31382a = null;
    }
}
