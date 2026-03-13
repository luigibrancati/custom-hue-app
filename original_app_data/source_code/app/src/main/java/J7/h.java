package J7;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f6289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f6290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f6291d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f6292e;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f6293a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f6294b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public a f6295c;
        }

        public static boolean d(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof k ? !((k) obj).c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public final a a() {
            a aVar = new a();
            this.f6290c.f6295c = aVar;
            this.f6290c = aVar;
            return aVar;
        }

        public final b b(Object obj) {
            a().f6294b = obj;
            return this;
        }

        public b c(Object obj) {
            return b(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                boolean r0 = r6.f6291d
                boolean r1 = r6.f6292e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 32
                r2.<init>(r3)
                java.lang.String r3 = r6.f6288a
                r2.append(r3)
                r3 = 123(0x7b, float:1.72E-43)
                r2.append(r3)
                J7.h$b$a r6 = r6.f6289b
                J7.h$b$a r6 = r6.f6295c
                java.lang.String r3 = ""
            L1b:
                if (r6 == 0) goto L61
                java.lang.Object r4 = r6.f6294b
                if (r4 != 0) goto L24
                if (r0 != 0) goto L5e
                goto L2c
            L24:
                if (r1 == 0) goto L2c
                boolean r5 = d(r4)
                if (r5 != 0) goto L5e
            L2c:
                r2.append(r3)
                java.lang.String r3 = r6.f6293a
                if (r3 == 0) goto L3b
                r2.append(r3)
                r3 = 61
                r2.append(r3)
            L3b:
                if (r4 == 0) goto L59
                java.lang.Class r3 = r4.getClass()
                boolean r3 = r3.isArray()
                if (r3 == 0) goto L59
                java.lang.Object[] r3 = new java.lang.Object[]{r4}
                java.lang.String r3 = java.util.Arrays.deepToString(r3)
                int r4 = r3.length()
                r5 = 1
                int r4 = r4 - r5
                r2.append(r3, r5, r4)
                goto L5c
            L59:
                r2.append(r4)
            L5c:
                java.lang.String r3 = ", "
            L5e:
                J7.h$b$a r6 = r6.f6295c
                goto L1b
            L61:
                r6 = 125(0x7d, float:1.75E-43)
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: J7.h.b.toString():java.lang.String");
        }

        public b(String str) {
            a aVar = new a();
            this.f6289b = aVar;
            this.f6290c = aVar;
            this.f6291d = false;
            this.f6292e = false;
            this.f6288a = (String) n.j(str);
        }
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
