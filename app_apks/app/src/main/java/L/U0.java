package L;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f7946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f7947c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7948a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Set f7949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set f7950c;

        public U0 a() {
            return new U0(this.f7948a, this.f7949b, this.f7950c);
        }

        public b b(Set set) {
            this.f7950c = new HashSet(set);
            return this;
        }

        public b c(Set set) {
            this.f7949b = new HashSet(set);
            return this;
        }

        public b d(boolean z10) {
            this.f7948a = z10;
            return this;
        }
    }

    public static U0 b() {
        return new b().d(true).a();
    }

    public boolean a(Class cls, boolean z10) {
        if (this.f7946b.contains(cls)) {
            return true;
        }
        return !this.f7947c.contains(cls) && this.f7945a && z10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof U0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        U0 u02 = (U0) obj;
        return this.f7945a == u02.f7945a && Objects.equals(this.f7946b, u02.f7946b) && Objects.equals(this.f7947c, u02.f7947c);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f7945a), this.f7946b, this.f7947c);
    }

    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f7945a + ", forceEnabledQuirks=" + this.f7946b + ", forceDisabledQuirks=" + this.f7947c + '}';
    }

    public U0(boolean z10, Set set, Set set2) {
        this.f7945a = z10;
        this.f7946b = set == null ? Collections.EMPTY_SET : new HashSet(set);
        this.f7947c = set2 == null ? Collections.EMPTY_SET : new HashSet(set2);
    }
}
