package w2;

import D1.t;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: w2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6118a extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f46096e;

    public C6118a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f46093b = str;
        this.f46094c = str2;
        this.f46095d = i10;
        this.f46096e = bArr;
    }

    @Override // D1.u.a
    public void b(t.b bVar) {
        bVar.K(this.f46096e, this.f46095d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6118a.class == obj.getClass()) {
            C6118a c6118a = (C6118a) obj;
            if (this.f46095d == c6118a.f46095d && Objects.equals(this.f46093b, c6118a.f46093b) && Objects.equals(this.f46094c, c6118a.f46094c) && Arrays.equals(this.f46096e, c6118a.f46096e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (527 + this.f46095d) * 31;
        String str = this.f46093b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f46094c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f46096e);
    }

    @Override // w2.i
    public String toString() {
        return this.f46121a + ": mimeType=" + this.f46093b + ", description=" + this.f46094c;
    }
}
