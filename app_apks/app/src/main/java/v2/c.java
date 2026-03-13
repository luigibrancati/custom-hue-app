package v2;

import D1.t;
import D1.u;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f45754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45756c;

    public c(byte[] bArr, String str, String str2) {
        this.f45754a = bArr;
        this.f45755b = str;
        this.f45756c = str2;
    }

    @Override // D1.u.a
    public void b(t.b bVar) {
        String str = this.f45755b;
        if (str != null) {
            bVar.p0(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f45754a, ((c) obj).f45754a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f45754a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f45755b, this.f45756c, Integer.valueOf(this.f45754a.length));
    }
}
