package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC3661h f31385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3669p f31386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Q f31387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile AbstractC3661h f31388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f31389e;

    public void a(Q q10) {
        if (this.f31387c != null) {
            return;
        }
        synchronized (this) {
            if (this.f31387c != null) {
                return;
            }
            try {
                if (this.f31385a != null) {
                    this.f31387c = (Q) q10.getParserForType().b(this.f31385a, this.f31386b);
                    this.f31388d = this.f31385a;
                } else {
                    this.f31387c = q10;
                    this.f31388d = AbstractC3661h.f31448b;
                }
            } catch (A unused) {
                this.f31389e = true;
                this.f31387c = q10;
                this.f31388d = AbstractC3661h.f31448b;
            }
        }
    }

    public int b() {
        if (this.f31388d != null) {
            return this.f31388d.size();
        }
        AbstractC3661h abstractC3661h = this.f31385a;
        if (abstractC3661h != null) {
            return abstractC3661h.size();
        }
        if (this.f31387c != null) {
            return this.f31387c.getSerializedSize();
        }
        return 0;
    }

    public Q c(Q q10) {
        a(q10);
        return this.f31387c;
    }

    public AbstractC3661h d() {
        if (this.f31388d != null) {
            return this.f31388d;
        }
        AbstractC3661h abstractC3661h = this.f31385a;
        if (abstractC3661h != null) {
            return abstractC3661h;
        }
        synchronized (this) {
            try {
                if (this.f31388d != null) {
                    return this.f31388d;
                }
                if (this.f31387c == null) {
                    this.f31388d = AbstractC3661h.f31448b;
                } else {
                    this.f31388d = this.f31387c.toByteString();
                }
                return this.f31388d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        Q q10 = this.f31387c;
        Q q11 = d10.f31387c;
        return (q10 == null && q11 == null) ? d().equals(d10.d()) : (q10 == null || q11 == null) ? q10 != null ? q10.equals(d10.c(q10.getDefaultInstanceForType())) : c(q11.getDefaultInstanceForType()).equals(q11) : q10.equals(q11);
    }

    public int hashCode() {
        return 1;
    }
}
