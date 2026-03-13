package Yb;

import Eb.p;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum h {
    COMPLETE;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Hb.c f19878a;

        public a(Hb.c cVar) {
            this.f19878a = cVar;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f19878a + "]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f19879a;

        public b(Throwable th) {
            this.f19879a = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return Lb.b.c(this.f19879a, ((b) obj).f19879a);
            }
            return false;
        }

        public int hashCode() {
            return this.f19879a.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f19879a + "]";
        }
    }

    public static boolean a(Object obj, p pVar) {
        if (obj == COMPLETE) {
            pVar.a();
            return true;
        }
        if (obj instanceof b) {
            pVar.onError(((b) obj).f19879a);
            return true;
        }
        pVar.c(obj);
        return false;
    }

    public static boolean b(Object obj, p pVar) {
        if (obj == COMPLETE) {
            pVar.a();
            return true;
        }
        if (obj instanceof b) {
            pVar.onError(((b) obj).f19879a);
            return true;
        }
        if (obj instanceof a) {
            pVar.b(((a) obj).f19878a);
            return false;
        }
        pVar.c(obj);
        return false;
    }

    public static Object j() {
        return COMPLETE;
    }

    public static Object p(Hb.c cVar) {
        return new a(cVar);
    }

    public static Object q(Throwable th) {
        return new b(th);
    }

    public static boolean u(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean v(Object obj) {
        return obj instanceof b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static Object s(Object obj) {
        return obj;
    }

    public static Object w(Object obj) {
        return obj;
    }
}
