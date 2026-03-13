package x9;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import u9.w;
import u9.x;
import w9.u;

/* JADX INFO: renamed from: x9.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6333e implements x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f47952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f47953d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f47954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f47955b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: x9.e$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements x {
        private b() {
        }

        @Override // u9.x
        public w create(u9.e eVar, B9.a aVar) {
            throw new AssertionError("Factory should not be used");
        }
    }

    static {
        f47952c = new b();
        f47953d = new b();
    }

    public C6333e(u uVar) {
        this.f47954a = uVar;
    }

    public static Object a(u uVar, Class cls) {
        return uVar.t(B9.a.a(cls)).a();
    }

    public static v9.b b(Class cls) {
        return (v9.b) cls.getAnnotation(v9.b.class);
    }

    public w c(u uVar, u9.e eVar, B9.a aVar, v9.b bVar, boolean z10) {
        w wVarCreate;
        Object objA = a(uVar, bVar.value());
        boolean zNullSafe = bVar.nullSafe();
        if (objA instanceof w) {
            wVarCreate = (w) objA;
        } else if (objA instanceof x) {
            x xVarE = (x) objA;
            if (z10) {
                xVarE = e(aVar.c(), xVarE);
            }
            wVarCreate = xVarE.create(eVar, aVar);
        } else {
            if (!(objA instanceof u9.i)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            C6342n c6342n = new C6342n(null, objA instanceof u9.i ? (u9.i) objA : null, eVar, aVar, z10 ? f47952c : f47953d, zNullSafe);
            zNullSafe = false;
            wVarCreate = c6342n;
        }
        return (wVarCreate == null || !zNullSafe) ? wVarCreate : wVarCreate.b();
    }

    @Override // u9.x
    public w create(u9.e eVar, B9.a aVar) {
        v9.b bVarB = b(aVar.c());
        if (bVarB == null) {
            return null;
        }
        return c(this.f47954a, eVar, aVar, bVarB, true);
    }

    public boolean d(B9.a aVar, x xVar) {
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(xVar);
        if (xVar == f47952c) {
            return true;
        }
        Class clsC = aVar.c();
        x xVar2 = (x) this.f47955b.get(clsC);
        if (xVar2 != null) {
            return xVar2 == xVar;
        }
        v9.b bVarB = b(clsC);
        if (bVarB == null) {
            return false;
        }
        Class clsValue = bVarB.value();
        return x.class.isAssignableFrom(clsValue) && e(clsC, (x) a(this.f47954a, clsValue)) == xVar;
    }

    public final x e(Class cls, x xVar) {
        x xVar2 = (x) this.f47955b.putIfAbsent(cls, xVar);
        return xVar2 != null ? xVar2 : xVar;
    }
}
