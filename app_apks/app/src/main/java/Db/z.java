package Db;

import Db.y;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2657c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f2659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f2660c;

        public final boolean a(b bVar) {
            return Objects.equals(this.f2658a, bVar.f2658a) && Objects.equals(this.f2659b, bVar.f2659b) && Objects.equals(this.f2660c, bVar.f2660c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && a((b) obj);
        }

        public int hashCode() {
            int iHashCode = Objects.hashCode(this.f2658a) + 177573;
            int iHashCode2 = iHashCode + (iHashCode << 5) + Objects.hashCode(this.f2659b);
            return iHashCode2 + (iHashCode2 << 5) + Objects.hashCode(this.f2660c);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("PlaylistVariable{");
            if (this.f2658a != null) {
                sb2.append("name=");
                sb2.append(this.f2658a);
            }
            if (this.f2659b != null) {
                if (sb2.length() > 17) {
                    sb2.append(", ");
                }
                sb2.append("value=");
                sb2.append(this.f2659b);
            }
            if (this.f2660c != null) {
                if (sb2.length() > 17) {
                    sb2.append(", ");
                }
                sb2.append("importAttribute=");
                sb2.append(this.f2660c);
            }
            sb2.append("}");
            return sb2.toString();
        }

        public b(z zVar) {
            this.f2658a = zVar.f2655a;
            this.f2659b = zVar.f2656b;
            this.f2660c = zVar.f2657c;
        }
    }

    public z() {
        if (!(this instanceof y.a)) {
            throw new UnsupportedOperationException("Use: new PlaylistVariable.Builder()");
        }
    }

    public y d() {
        return new b();
    }

    public y.a e(String str) {
        Objects.requireNonNull(str, "importAttribute");
        this.f2657c = str;
        return (y.a) this;
    }

    public y.a f(String str) {
        Objects.requireNonNull(str, "name");
        this.f2655a = str;
        return (y.a) this;
    }

    public y.a g(String str) {
        Objects.requireNonNull(str, "value");
        this.f2656b = str;
        return (y.a) this;
    }
}
