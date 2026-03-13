package b6;

import java.util.Arrays;

/* JADX INFO: renamed from: b6.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2839h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y5.c f25359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f25360b;

    public C2839h(Y5.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f25359a = cVar;
        this.f25360b = bArr;
    }

    public byte[] a() {
        return this.f25360b;
    }

    public Y5.c b() {
        return this.f25359a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2839h)) {
            return false;
        }
        C2839h c2839h = (C2839h) obj;
        if (this.f25359a.equals(c2839h.f25359a)) {
            return Arrays.equals(this.f25360b, c2839h.f25360b);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f25360b) ^ ((this.f25359a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f25359a + ", bytes=[...]}";
    }
}
