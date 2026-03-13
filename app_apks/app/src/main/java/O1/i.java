package O1;

import G1.J;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10815d;

    public i(String str, long j10, long j11) {
        this.f10814c = str == null ? "" : str;
        this.f10812a = j10;
        this.f10813b = j11;
    }

    public i a(i iVar, String str) {
        String strC = c(str);
        i iVar2 = null;
        if (iVar != null && strC.equals(iVar.c(str))) {
            long j10 = this.f10813b;
            if (j10 != -1) {
                long j11 = this.f10812a;
                if (j11 + j10 == iVar.f10812a) {
                    long j12 = iVar.f10813b;
                    return new i(strC, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = iVar.f10813b;
            if (j13 != -1) {
                long j14 = iVar.f10812a;
                if (j14 + j13 == this.f10812a) {
                    iVar2 = new i(strC, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return iVar2;
    }

    public Uri b(String str) {
        return J.g(str, this.f10814c);
    }

    public String c(String str) {
        return J.f(str, this.f10814c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f10812a == iVar.f10812a && this.f10813b == iVar.f10813b && this.f10814c.equals(iVar.f10814c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f10815d == 0) {
            this.f10815d = ((((527 + ((int) this.f10812a)) * 31) + ((int) this.f10813b)) * 31) + this.f10814c.hashCode();
        }
        return this.f10815d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f10814c + ", start=" + this.f10812a + ", length=" + this.f10813b + ")";
    }
}
