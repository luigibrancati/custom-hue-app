package x9;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import u9.u;
import u9.v;
import u9.w;
import u9.x;
import w9.z;

/* JADX INFO: renamed from: x9.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6339k extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f47980c = g(u.DOUBLE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9.e f47981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f47982b;

    /* JADX INFO: renamed from: x9.k$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f47983a;

        public a(v vVar) {
            this.f47983a = vVar;
        }

        @Override // u9.x
        public w create(u9.e eVar, B9.a aVar) {
            a aVar2 = null;
            if (aVar.c() == Object.class) {
                return new C6339k(eVar, this.f47983a, aVar2);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: x9.k$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47984a;

        static {
            int[] iArr = new int[C9.b.values().length];
            f47984a = iArr;
            try {
                iArr[C9.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47984a[C9.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47984a[C9.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47984a[C9.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47984a[C9.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47984a[C9.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public /* synthetic */ C6339k(u9.e eVar, v vVar, a aVar) {
        this(eVar, vVar);
    }

    public static x f(v vVar) {
        return vVar == u.DOUBLE ? f47980c : g(vVar);
    }

    private static x g(v vVar) {
        return new a(vVar);
    }

    @Override // u9.w
    public Object c(C9.a aVar) throws IOException {
        C9.b bVarC = aVar.C();
        Object objI = i(aVar, bVarC);
        if (objI == null) {
            return h(aVar, bVarC);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.hasNext()) {
                String strNextName = objI instanceof Map ? aVar.nextName() : null;
                C9.b bVarC2 = aVar.C();
                Object objI2 = i(aVar, bVarC2);
                boolean z10 = objI2 != null;
                if (objI2 == null) {
                    objI2 = h(aVar, bVarC2);
                }
                if (objI instanceof List) {
                    ((List) objI).add(objI2);
                } else {
                    ((Map) objI).put(strNextName, objI2);
                }
                if (z10) {
                    arrayDeque.addLast(objI);
                    objI = objI2;
                }
            } else {
                if (objI instanceof List) {
                    aVar.endArray();
                } else {
                    aVar.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return objI;
                }
                objI = arrayDeque.removeLast();
            }
        }
    }

    @Override // u9.w
    public void e(C9.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.C();
            return;
        }
        w wVarL = this.f47981a.l(obj.getClass());
        if (!(wVarL instanceof C6339k)) {
            wVarL.e(cVar, obj);
        } else {
            cVar.f();
            cVar.i();
        }
    }

    public final Object h(C9.a aVar, C9.b bVar) throws IOException {
        int i10 = b.f47984a[bVar.ordinal()];
        if (i10 == 3) {
            return aVar.nextString();
        }
        if (i10 == 4) {
            return this.f47982b.a(aVar);
        }
        if (i10 == 5) {
            return Boolean.valueOf(aVar.nextBoolean());
        }
        if (i10 == 6) {
            aVar.nextNull();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    public final Object i(C9.a aVar, C9.b bVar) throws IOException {
        int i10 = b.f47984a[bVar.ordinal()];
        if (i10 == 1) {
            aVar.beginArray();
            return new ArrayList();
        }
        if (i10 != 2) {
            return null;
        }
        aVar.beginObject();
        return new z();
    }

    public C6339k(u9.e eVar, v vVar) {
        this.f47981a = eVar;
        this.f47982b = vVar;
    }
}
