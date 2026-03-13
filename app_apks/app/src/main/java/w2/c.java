package w2;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f46101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f46102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i[] f46103g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f46098b = str;
        this.f46099c = i10;
        this.f46100d = i11;
        this.f46101e = j10;
        this.f46102f = j11;
        this.f46103g = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f46099c == cVar.f46099c && this.f46100d == cVar.f46100d && this.f46101e == cVar.f46101e && this.f46102f == cVar.f46102f && Objects.equals(this.f46098b, cVar.f46098b) && Arrays.equals(this.f46103g, cVar.f46103g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f46099c) * 31) + this.f46100d) * 31) + ((int) this.f46101e)) * 31) + ((int) this.f46102f)) * 31;
        String str = this.f46098b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
