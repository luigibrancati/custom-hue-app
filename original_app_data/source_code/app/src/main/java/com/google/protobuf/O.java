package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class O extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC3717g0 f32171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32172b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends O {
        public a(String str) {
            super(str);
        }
    }

    public O(String str) {
        super(str);
        this.f32171a = null;
    }

    public static O b() {
        return new O("Protocol message end-group tag did not match expected tag.");
    }

    public static O c() {
        return new O("Protocol message contained an invalid tag (zero).");
    }

    public static O d() {
        return new O("Protocol message had invalid UTF-8.");
    }

    public static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static O f() {
        return new O("CodedInputStream encountered a malformed varint.");
    }

    public static O g() {
        return new O("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static O h() {
        return new O("Failed to parse the message.");
    }

    public static O i() {
        return new O("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static O l() {
        return new O("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static O m() {
        return new O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean a() {
        return this.f32172b;
    }

    public void j() {
        this.f32172b = true;
    }

    public O k(InterfaceC3717g0 interfaceC3717g0) {
        this.f32171a = interfaceC3717g0;
        return this;
    }

    public O(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f32171a = null;
    }
}
