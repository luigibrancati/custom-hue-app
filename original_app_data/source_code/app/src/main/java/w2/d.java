package w2;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f46105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f46107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i[] f46108f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f46104b = str;
        this.f46105c = z10;
        this.f46106d = z11;
        this.f46107e = strArr;
        this.f46108f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f46105c == dVar.f46105c && this.f46106d == dVar.f46106d && Objects.equals(this.f46104b, dVar.f46104b) && Arrays.equals(this.f46107e, dVar.f46107e) && Arrays.equals(this.f46108f, dVar.f46108f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((527 + (this.f46105c ? 1 : 0)) * 31) + (this.f46106d ? 1 : 0)) * 31;
        String str = this.f46104b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
