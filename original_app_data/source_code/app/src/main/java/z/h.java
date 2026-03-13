package z;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f48670a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputConfiguration f48671a;

        public a(Object obj) {
            this.f48671a = (InputConfiguration) obj;
        }

        @Override // z.h.c
        public Object a() {
            return this.f48671a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f48671a, ((c) obj).a());
            }
            return false;
        }

        public int hashCode() {
            return this.f48671a.hashCode();
        }

        public String toString() {
            return this.f48671a.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends a {
        public b(Object obj) {
            super(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        Object a();
    }

    public h(c cVar) {
        this.f48670a = cVar;
    }

    public static h b(Object obj) {
        if (obj == null) {
            return null;
        }
        return new h(new b(obj));
    }

    public Object a() {
        return this.f48670a.a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f48670a.equals(((h) obj).f48670a);
        }
        return false;
    }

    public int hashCode() {
        return this.f48670a.hashCode();
    }

    public String toString() {
        return this.f48670a.toString();
    }
}
