package Md;

import io.sentry.protocol.SentryThread;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC0144b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f9450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean[] f9451b;

        public a(l lVar, boolean[] zArr) {
            this.f9450a = lVar;
            this.f9451b = zArr;
        }

        @Override // Md.b.AbstractC0144b, Md.b.d
        public boolean c(Object obj) {
            if (((Boolean) this.f9450a.invoke(obj)).booleanValue()) {
                this.f9451b[0] = true;
            }
            return !this.f9451b[0];
        }

        @Override // Md.b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean a() {
            return Boolean.valueOf(this.f9451b[0]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        Iterable a(Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        Object a();

        void b(Object obj);

        boolean c(Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface e {
        boolean a(Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f9452a;

        public f() {
            this(new HashSet());
        }

        public static /* synthetic */ void b(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        @Override // Md.b.e
        public boolean a(Object obj) {
            return this.f9452a.add(obj);
        }

        public f(Set set) {
            if (set == null) {
                b(0);
            }
            this.f9452a = set;
        }
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = SentryThread.JsonKeys.CURRENT;
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i10) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Object b(Collection collection, c cVar, d dVar) {
        if (collection == null) {
            a(4);
        }
        if (cVar == null) {
            a(5);
        }
        if (dVar == null) {
            a(6);
        }
        return c(collection, cVar, new f(), dVar);
    }

    public static Object c(Collection collection, c cVar, e eVar, d dVar) {
        if (collection == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        if (eVar == null) {
            a(2);
        }
        if (dVar == null) {
            a(3);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d(it.next(), cVar, eVar, dVar);
        }
        return dVar.a();
    }

    public static void d(Object obj, c cVar, e eVar, d dVar) {
        if (obj == null) {
            a(22);
        }
        if (cVar == null) {
            a(23);
        }
        if (eVar == null) {
            a(24);
        }
        if (dVar == null) {
            a(25);
        }
        if (eVar.a(obj) && dVar.c(obj)) {
            Iterator it = cVar.a(obj).iterator();
            while (it.hasNext()) {
                d(it.next(), cVar, eVar, dVar);
            }
            dVar.b(obj);
        }
    }

    public static Boolean e(Collection collection, c cVar, l lVar) {
        if (collection == null) {
            a(7);
        }
        if (cVar == null) {
            a(8);
        }
        if (lVar == null) {
            a(9);
        }
        return (Boolean) b(collection, cVar, new a(lVar, new boolean[1]));
    }

    /* JADX INFO: renamed from: Md.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class AbstractC0144b implements d {
        @Override // Md.b.d
        public boolean c(Object obj) {
            return true;
        }

        @Override // Md.b.d
        public void b(Object obj) {
        }
    }
}
