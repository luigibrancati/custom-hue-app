package Bd;

import Od.F;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class f implements Bd.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f815d = F.a1(f.class.getCanonicalName(), ".", "");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Bd.n f816e = new a("NO_LOCKS", InterfaceC0023f.f825a, Bd.e.f814b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bd.k f817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0023f f818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f819c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends f {
        public a(String str, InterfaceC0023f interfaceC0023f, Bd.k kVar) {
            super(str, interfaceC0023f, kVar, null);
        }

        public static /* synthetic */ void j(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i10 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // Bd.f
        public o p(String str, Object obj) {
            if (str == null) {
                j(0);
            }
            o oVarA = o.a();
            if (oVarA == null) {
                j(1);
            }
            return oVarA;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends j {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f820d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, InterfaceC6082a interfaceC6082a, Object obj) {
            super(fVar, interfaceC6082a);
            this.f820d = obj;
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // Bd.f.h
        public o c(boolean z10) {
            o oVarD = o.d(this.f820d);
            if (oVarD == null) {
                a(0);
            }
            return oVarD;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ vc.l f822e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ vc.l f823f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f fVar, InterfaceC6082a interfaceC6082a, vc.l lVar, vc.l lVar2) {
            super(fVar, interfaceC6082a);
            this.f822e = lVar;
            this.f823f = lVar2;
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i10 != 2 ? 2 : 3];
            if (i10 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i10 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i10 == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        @Override // Bd.f.h
        public o c(boolean z10) {
            vc.l lVar = this.f822e;
            if (lVar == null) {
                o oVarC = super.c(z10);
                if (oVarC == null) {
                    a(0);
                }
                return oVarC;
            }
            o oVarD = o.d(lVar.invoke(Boolean.valueOf(z10)));
            if (oVarD == null) {
                a(1);
            }
            return oVarD;
        }

        @Override // Bd.f.i
        public void e(Object obj) {
            if (obj == null) {
                a(2);
            }
            this.f823f.invoke(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d extends e implements Bd.a {
        public /* synthetic */ d(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "computation";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i10 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // Bd.f.e, Bd.a
        public Object a(Object obj, InterfaceC6082a interfaceC6082a) {
            if (interfaceC6082a == null) {
                b(2);
            }
            Object objA = super.a(obj, interfaceC6082a);
            if (objA == null) {
                b(3);
            }
            return objA;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f fVar, ConcurrentMap concurrentMap) {
            super(fVar, concurrentMap, null);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e extends l implements Bd.b {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements vc.l {
            @Override // vc.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Object invoke(g gVar) {
                return gVar.f827b.invoke();
            }
        }

        public /* synthetic */ e(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i10 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public Object a(Object obj, InterfaceC6082a interfaceC6082a) {
            if (interfaceC6082a == null) {
                b(2);
            }
            return invoke(new g(obj, interfaceC6082a));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f fVar, ConcurrentMap concurrentMap) {
            super(fVar, concurrentMap, new a());
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    /* JADX INFO: renamed from: Bd.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0023f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InterfaceC0023f f825a = new a();

        /* JADX INFO: renamed from: Bd.f$f$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements InterfaceC0023f {
            public static /* synthetic */ void b(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // Bd.f.InterfaceC0023f
            public RuntimeException a(Throwable th) {
                if (th == null) {
                    b(0);
                }
                throw Md.c.b(th);
            }
        }

        RuntimeException a(Throwable th);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC6082a f827b;

        public g(Object obj, InterfaceC6082a interfaceC6082a) {
            this.f826a = obj;
            this.f827b = interfaceC6082a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f826a.equals(((g) obj).f826a);
        }

        public int hashCode() {
            return this.f826a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class i extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile Bd.l f831d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f fVar, InterfaceC6082a interfaceC6082a) {
            super(fVar, interfaceC6082a);
            if (fVar == null) {
                a(0);
            }
            if (interfaceC6082a == null) {
                a(1);
            }
            this.f831d = null;
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Bd.f.h
        public final void b(Object obj) {
            this.f831d = new Bd.l(obj);
            try {
                e(obj);
            } finally {
                this.f831d = null;
            }
        }

        public abstract void e(Object obj);

        @Override // Bd.f.h, vc.InterfaceC6082a
        public Object invoke() {
            Bd.l lVar = this.f831d;
            return (lVar == null || !lVar.b()) ? super.invoke() : lVar.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class j extends h implements Bd.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(f fVar, InterfaceC6082a interfaceC6082a) {
            super(fVar, interfaceC6082a);
            if (fVar == null) {
                a(0);
            }
            if (interfaceC6082a == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // Bd.f.h, vc.InterfaceC6082a
        public Object invoke() {
            Object objInvoke = super.invoke();
            if (objInvoke == null) {
                a(2);
            }
            return objInvoke;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class k extends i implements Bd.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(f fVar, InterfaceC6082a interfaceC6082a) {
            super(fVar, interfaceC6082a);
            if (fVar == null) {
                a(0);
            }
            if (interfaceC6082a == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // Bd.f.i, Bd.f.h, vc.InterfaceC6082a
        public Object invoke() {
            Object objInvoke = super.invoke();
            if (objInvoke == null) {
                a(2);
            }
            return objInvoke;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class l implements Bd.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConcurrentMap f833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final vc.l f834c;

        public l(f fVar, ConcurrentMap concurrentMap, vc.l lVar) {
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
            this.f832a = fVar;
            this.f833b = concurrentMap;
            this.f834c = lVar;
        }

        private static /* synthetic */ void b(int i10) {
            String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 == 3 || i10 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public final AssertionError c(Object obj, Object obj2) {
            AssertionError assertionError = (AssertionError) f.q(new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f832a));
            if (assertionError == null) {
                b(4);
            }
            return assertionError;
        }

        public o e(Object obj, boolean z10) {
            o oVarP = this.f832a.p("", obj);
            if (oVarP == null) {
                b(3);
            }
            return oVarP;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x003b, PHI: r0
          0x003e: PHI (r0v6 java.lang.Object) = (r0v5 java.lang.Object), (r0v13 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x0087, B:39:0x0095, B:40:0x0099, B:41:0x009a, B:42:0x00a4, B:43:0x00a5, B:44:0x00af, B:45:0x00b0, B:46:0x00b7, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:49:0x0018, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
        @Override // vc.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                r5 = this;
                java.util.concurrent.ConcurrentMap r0 = r5.f833b
                java.lang.Object r0 = r0.get(r6)
                if (r0 == 0) goto L11
                Bd.f$n r1 = Bd.f.n.COMPUTING
                if (r0 == r1) goto L11
                java.lang.Object r5 = Md.g.d(r0)
                return r5
            L11:
                Bd.f r0 = r5.f832a
                Bd.k r0 = r0.f817a
                r0.lock()
                java.util.concurrent.ConcurrentMap r0 = r5.f833b     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L3b
                Bd.f$n r1 = Bd.f.n.COMPUTING     // Catch: java.lang.Throwable -> L3b
                if (r0 != r1) goto L3e
                Bd.f$n r0 = Bd.f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L3b
                r2 = 1
                Bd.f$o r2 = r5.e(r6, r2)     // Catch: java.lang.Throwable -> L3b
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L3b
                if (r3 != 0) goto L3e
                java.lang.Object r6 = r2.b()     // Catch: java.lang.Throwable -> L3b
            L33:
                Bd.f r5 = r5.f832a
                Bd.k r5 = r5.f817a
                r5.unlock()
                return r6
            L3b:
                r6 = move-exception
                goto Lb8
            L3e:
                Bd.f$n r2 = Bd.f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L3b
                if (r0 != r2) goto L52
                r2 = 0
                Bd.f$o r2 = r5.e(r6, r2)     // Catch: java.lang.Throwable -> L3b
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L3b
                if (r3 != 0) goto L52
                java.lang.Object r6 = r2.b()     // Catch: java.lang.Throwable -> L3b
                goto L33
            L52:
                if (r0 == 0) goto L59
                java.lang.Object r6 = Md.g.d(r0)     // Catch: java.lang.Throwable -> L3b
                goto L33
            L59:
                r0 = 0
                java.util.concurrent.ConcurrentMap r2 = r5.f833b     // Catch: java.lang.Throwable -> L7e
                r2.put(r6, r1)     // Catch: java.lang.Throwable -> L7e
                vc.l r2 = r5.f834c     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r2 = r2.invoke(r6)     // Catch: java.lang.Throwable -> L7e
                java.util.concurrent.ConcurrentMap r3 = r5.f833b     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r4 = Md.g.b(r2)     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r3 = r3.put(r6, r4)     // Catch: java.lang.Throwable -> L7e
                if (r3 != r1) goto L79
                Bd.f r5 = r5.f832a
                Bd.k r5 = r5.f817a
                r5.unlock()
                return r2
            L79:
                java.lang.AssertionError r0 = r5.c(r6, r3)     // Catch: java.lang.Throwable -> L7e
                throw r0     // Catch: java.lang.Throwable -> L7e
            L7e:
                r1 = move-exception
                boolean r2 = Md.c.a(r1)     // Catch: java.lang.Throwable -> L3b
                if (r2 != 0) goto Lb0
                if (r1 == r0) goto La5
                java.util.concurrent.ConcurrentMap r0 = r5.f833b     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r2 = Md.g.c(r1)     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r0 = r0.put(r6, r2)     // Catch: java.lang.Throwable -> L3b
                Bd.f$n r2 = Bd.f.n.COMPUTING     // Catch: java.lang.Throwable -> L3b
                if (r0 == r2) goto L9a
                java.lang.AssertionError r6 = r5.c(r6, r0)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            L9a:
                Bd.f r6 = r5.f832a     // Catch: java.lang.Throwable -> L3b
                Bd.f$f r6 = Bd.f.k(r6)     // Catch: java.lang.Throwable -> L3b
                java.lang.RuntimeException r6 = r6.a(r1)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            La5:
                Bd.f r6 = r5.f832a     // Catch: java.lang.Throwable -> L3b
                Bd.f$f r6 = Bd.f.k(r6)     // Catch: java.lang.Throwable -> L3b
                java.lang.RuntimeException r6 = r6.a(r1)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            Lb0:
                java.util.concurrent.ConcurrentMap r0 = r5.f833b     // Catch: java.lang.Throwable -> L3b
                r0.remove(r6)     // Catch: java.lang.Throwable -> L3b
                java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch: java.lang.Throwable -> L3b
                throw r1     // Catch: java.lang.Throwable -> L3b
            Lb8:
                Bd.f r5 = r5.f832a
                Bd.k r5 = r5.f817a
                r5.unlock()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Bd.f.l.invoke(java.lang.Object):java.lang.Object");
        }

        @Override // Bd.h
        public boolean o(Object obj) {
            Object obj2 = this.f833b.get(obj);
            return (obj2 == null || obj2 == n.COMPUTING) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class m extends l implements Bd.g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(f fVar, ConcurrentMap concurrentMap, vc.l lVar) {
            super(fVar, concurrentMap, lVar);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // Bd.f.l, vc.l
        public Object invoke(Object obj) {
            Object objInvoke = super.invoke(obj);
            if (objInvoke == null) {
                b(3);
            }
            return objInvoke;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f836b;

        public o(Object obj, boolean z10) {
            this.f835a = obj;
            this.f836b = z10;
        }

        public static o a() {
            return new o(null, true);
        }

        public static o d(Object obj) {
            return new o(obj, false);
        }

        public Object b() {
            return this.f835a;
        }

        public boolean c() {
            return this.f836b;
        }

        public String toString() {
            return c() ? "FALL_THROUGH" : String.valueOf(this.f835a);
        }
    }

    public /* synthetic */ f(String str, InterfaceC0023f interfaceC0023f, Bd.k kVar, a aVar) {
        this(str, interfaceC0023f, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void j(int r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Bd.f.j(int):void");
    }

    public static ConcurrentMap m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    public static Throwable q(Throwable th) {
        if (th == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!stackTrace[i10].getClassName().startsWith(f815d)) {
                break;
            }
            i10++;
        }
        List listSubList = Arrays.asList(stackTrace).subList(i10, length);
        th.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
        return th;
    }

    @Override // Bd.n
    public Bd.a a() {
        return new d(this, m(), null);
    }

    @Override // Bd.n
    public Bd.h b(vc.l lVar) {
        if (lVar == null) {
            j(19);
        }
        Bd.h hVarO = o(lVar, m());
        if (hVarO == null) {
            j(20);
        }
        return hVarO;
    }

    @Override // Bd.n
    public Bd.i c(InterfaceC6082a interfaceC6082a, Object obj) {
        if (interfaceC6082a == null) {
            j(26);
        }
        if (obj == null) {
            j(27);
        }
        return new b(this, interfaceC6082a, obj);
    }

    @Override // Bd.n
    public Bd.b d() {
        return new e(this, m(), null);
    }

    @Override // Bd.n
    public Object e(InterfaceC6082a interfaceC6082a) {
        if (interfaceC6082a == null) {
            j(34);
        }
        this.f817a.lock();
        try {
            return interfaceC6082a.invoke();
        } finally {
        }
    }

    @Override // Bd.n
    public Bd.i f(InterfaceC6082a interfaceC6082a) {
        if (interfaceC6082a == null) {
            j(23);
        }
        return new j(this, interfaceC6082a);
    }

    @Override // Bd.n
    public Bd.g g(vc.l lVar) {
        if (lVar == null) {
            j(9);
        }
        Bd.g gVarN = n(lVar, m());
        if (gVarN == null) {
            j(10);
        }
        return gVarN;
    }

    @Override // Bd.n
    public Bd.j h(InterfaceC6082a interfaceC6082a) {
        if (interfaceC6082a == null) {
            j(30);
        }
        return new h(this, interfaceC6082a);
    }

    @Override // Bd.n
    public Bd.i i(InterfaceC6082a interfaceC6082a, vc.l lVar, vc.l lVar2) {
        if (interfaceC6082a == null) {
            j(28);
        }
        if (lVar2 == null) {
            j(29);
        }
        return new c(this, interfaceC6082a, lVar, lVar2);
    }

    public Bd.g n(vc.l lVar, ConcurrentMap concurrentMap) {
        if (lVar == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m(this, concurrentMap, lVar);
    }

    public Bd.h o(vc.l lVar, ConcurrentMap concurrentMap) {
        if (lVar == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l(this, concurrentMap, lVar);
    }

    public o p(String str, Object obj) {
        String str2;
        if (str == null) {
            j(35);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Recursion detected ");
        sb2.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) q(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f819c + ")";
    }

    public f(String str, InterfaceC0023f interfaceC0023f, Bd.k kVar) {
        if (str == null) {
            j(4);
        }
        if (interfaceC0023f == null) {
            j(5);
        }
        if (kVar == null) {
            j(6);
        }
        this.f817a = kVar;
        this.f818b = interfaceC0023f;
        this.f819c = str;
    }

    public f(String str) {
        this(str, (Runnable) null, (vc.l) null);
    }

    public f(String str, Runnable runnable, vc.l lVar) {
        this(str, InterfaceC0023f.f825a, Bd.k.f837a.a(runnable, lVar));
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class h implements Bd.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC6082a f829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile Object f830c;

        public h(f fVar, InterfaceC6082a interfaceC6082a) {
            if (fVar == null) {
                a(0);
            }
            if (interfaceC6082a == null) {
                a(1);
            }
            this.f830c = n.NOT_COMPUTED;
            this.f828a = fVar;
            this.f829b = interfaceC6082a;
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 == 2 || i10 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i10 != 2 && i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public o c(boolean z10) {
            o oVarP = this.f828a.p("in a lazy value", null);
            if (oVarP == null) {
                a(2);
            }
            return oVarP;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        @Override // vc.InterfaceC6082a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object invoke() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f830c
                boolean r1 = r0 instanceof Bd.f.n
                if (r1 != 0) goto Lb
                java.lang.Object r4 = Md.g.f(r0)
                return r4
            Lb:
                Bd.f r0 = r4.f828a
                Bd.k r0 = r0.f817a
                r0.lock()
                java.lang.Object r0 = r4.f830c     // Catch: java.lang.Throwable -> L24
                boolean r1 = r0 instanceof Bd.f.n     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L26
                java.lang.Object r0 = Md.g.f(r0)     // Catch: java.lang.Throwable -> L24
            L1c:
                Bd.f r4 = r4.f828a
                Bd.k r4 = r4.f817a
                r4.unlock()
                return r0
            L24:
                r0 = move-exception
                goto L85
            L26:
                Bd.f$n r1 = Bd.f.n.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r0 != r1) goto L3e
                Bd.f$n r2 = Bd.f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                r4.f830c = r2     // Catch: java.lang.Throwable -> L24
                r2 = 1
                Bd.f$o r2 = r4.c(r2)     // Catch: java.lang.Throwable -> L24
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L24
                if (r3 != 0) goto L3e
                java.lang.Object r0 = r2.b()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L3e:
                Bd.f$n r2 = Bd.f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                if (r0 != r2) goto L52
                r0 = 0
                Bd.f$o r0 = r4.c(r0)     // Catch: java.lang.Throwable -> L24
                boolean r2 = r0.c()     // Catch: java.lang.Throwable -> L24
                if (r2 != 0) goto L52
                java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L52:
                r4.f830c = r1     // Catch: java.lang.Throwable -> L24
                vc.a r0 = r4.f829b     // Catch: java.lang.Throwable -> L60
                java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L60
                r4.b(r0)     // Catch: java.lang.Throwable -> L60
                r4.f830c = r0     // Catch: java.lang.Throwable -> L60
                goto L1c
            L60:
                r0 = move-exception
                boolean r1 = Md.c.a(r0)     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L7e
                java.lang.Object r1 = r4.f830c     // Catch: java.lang.Throwable -> L24
                Bd.f$n r2 = Bd.f.n.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r1 != r2) goto L73
                java.lang.Object r1 = Md.g.c(r0)     // Catch: java.lang.Throwable -> L24
                r4.f830c = r1     // Catch: java.lang.Throwable -> L24
            L73:
                Bd.f r1 = r4.f828a     // Catch: java.lang.Throwable -> L24
                Bd.f$f r1 = Bd.f.k(r1)     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L7e:
                Bd.f$n r1 = Bd.f.n.NOT_COMPUTED     // Catch: java.lang.Throwable -> L24
                r4.f830c = r1     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L85:
                Bd.f r4 = r4.f828a
                Bd.k r4 = r4.f817a
                r4.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Bd.f.h.invoke():java.lang.Object");
        }

        public boolean m() {
            return (this.f830c == n.NOT_COMPUTED || this.f830c == n.COMPUTING) ? false : true;
        }

        public void b(Object obj) {
        }
    }
}
