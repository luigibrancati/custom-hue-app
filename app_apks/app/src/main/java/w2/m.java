package w2;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f46132c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f46131b = str;
        this.f46132c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f46131b, mVar.f46131b) && Arrays.equals(this.f46132c, mVar.f46132c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f46131b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f46132c);
    }

    @Override // w2.i
    public String toString() {
        return this.f46121a + ": owner=" + this.f46131b;
    }
}
