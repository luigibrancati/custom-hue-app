package ba;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25483b;

    public e(String str, String str2) {
        this.f25482a = str;
        this.f25483b = str2;
    }

    public final String a() {
        return this.f25482a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (Objects.equals(this.f25482a, eVar.f25482a) && Objects.equals(this.f25483b, eVar.f25483b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hashCode(this.f25482a) * 37) + Objects.hashCode(this.f25483b);
    }

    public final String toString() {
        return "[packageName=" + this.f25482a + ",libraryName=" + this.f25483b + "]";
    }
}
