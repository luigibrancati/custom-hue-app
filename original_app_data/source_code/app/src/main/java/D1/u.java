package D1;

import D1.t;
import G1.M;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f2099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2100b;

    public u(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    public u a(a... aVarArr) {
        return aVarArr.length == 0 ? this : new u(this.f2100b, (a[]) M.R0(this.f2099a, aVarArr));
    }

    public u b(u uVar) {
        return uVar == null ? this : a(uVar.f2099a);
    }

    public u c(long j10) {
        return this.f2100b == j10 ? this : new u(j10, this.f2099a);
    }

    public a d(int i10) {
        return this.f2099a[i10];
    }

    public int e() {
        return this.f2099a.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (Arrays.equals(this.f2099a, uVar.f2099a) && this.f2100b == uVar.f2100b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f2099a) * 31) + N7.i.c(this.f2100b);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f2099a));
        if (this.f2100b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f2100b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public u(long j10, a... aVarArr) {
        this.f2100b = j10;
        this.f2099a = aVarArr;
    }

    public u(List list) {
        this((a[]) list.toArray(new a[0]));
    }

    public u(long j10, List list) {
        this(j10, (a[]) list.toArray(new a[0]));
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        default o a() {
            return null;
        }

        default byte[] c() {
            return null;
        }

        default void b(t.b bVar) {
        }
    }
}
