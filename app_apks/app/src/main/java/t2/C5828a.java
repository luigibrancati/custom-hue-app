package t2;

import D1.o;
import D1.u;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: t2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5828a implements u.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f44555g = new o.b().y0("application/id3").P();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f44556h = new o.b().y0("application/x-scte35").P();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f44559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f44560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f44561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44562f;

    public C5828a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f44557a = str;
        this.f44558b = str2;
        this.f44559c = j10;
        this.f44560d = j11;
        this.f44561e = bArr;
    }

    @Override // D1.u.a
    public o a() {
        String str = this.f44557a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f44556h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f44555g;
            default:
                return null;
        }
    }

    @Override // D1.u.a
    public byte[] c() {
        if (a() != null) {
            return this.f44561e;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5828a.class == obj.getClass()) {
            C5828a c5828a = (C5828a) obj;
            if (this.f44559c == c5828a.f44559c && this.f44560d == c5828a.f44560d && Objects.equals(this.f44557a, c5828a.f44557a) && Objects.equals(this.f44558b, c5828a.f44558b) && Arrays.equals(this.f44561e, c5828a.f44561e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f44562f == 0) {
            String str = this.f44557a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f44558b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f44559c;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f44560d;
            this.f44562f = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f44561e);
        }
        return this.f44562f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f44557a + ", id=" + this.f44560d + ", durationMs=" + this.f44559c + ", value=" + this.f44558b;
    }
}
