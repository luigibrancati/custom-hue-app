package x9;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import u9.w;
import w9.y;

/* JADX INFO: renamed from: x9.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C6334f extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6334f f47956a = new C6334f();

    /* JADX INFO: renamed from: x9.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47957a;

        static {
            int[] iArr = new int[C9.b.values().length];
            f47957a = iArr;
            try {
                iArr[C9.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47957a[C9.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47957a[C9.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47957a[C9.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47957a[C9.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47957a[C9.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private C6334f() {
    }

    @Override // u9.w
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public u9.j c(C9.a aVar) throws IOException {
        if (aVar instanceof C6335g) {
            return ((C6335g) aVar).x0();
        }
        C9.b bVarC = aVar.C();
        u9.j jVarH = h(aVar, bVarC);
        if (jVarH == null) {
            return g(aVar, bVarC);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.hasNext()) {
                String strNextName = jVarH instanceof u9.m ? aVar.nextName() : null;
                C9.b bVarC2 = aVar.C();
                u9.j jVarH2 = h(aVar, bVarC2);
                boolean z10 = jVarH2 != null;
                if (jVarH2 == null) {
                    jVarH2 = g(aVar, bVarC2);
                }
                if (jVarH instanceof u9.g) {
                    ((u9.g) jVarH).r(jVarH2);
                } else {
                    ((u9.m) jVarH).r(strNextName, jVarH2);
                }
                if (z10) {
                    arrayDeque.addLast(jVarH);
                    jVarH = jVarH2;
                }
            } else {
                if (jVarH instanceof u9.g) {
                    aVar.endArray();
                } else {
                    aVar.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return jVarH;
                }
                jVarH = (u9.j) arrayDeque.removeLast();
            }
        }
    }

    public final u9.j g(C9.a aVar, C9.b bVar) throws IOException {
        int i10 = a.f47957a[bVar.ordinal()];
        if (i10 == 3) {
            return new u9.o(aVar.nextString());
        }
        if (i10 == 4) {
            return new u9.o(new y(aVar.nextString()));
        }
        if (i10 == 5) {
            return new u9.o(Boolean.valueOf(aVar.nextBoolean()));
        }
        if (i10 == 6) {
            aVar.nextNull();
            return u9.l.f45471a;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    public final u9.j h(C9.a aVar, C9.b bVar) throws IOException {
        int i10 = a.f47957a[bVar.ordinal()];
        if (i10 == 1) {
            aVar.beginArray();
            return new u9.g();
        }
        if (i10 != 2) {
            return null;
        }
        aVar.beginObject();
        return new u9.m();
    }

    @Override // u9.w
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void e(C9.c cVar, u9.j jVar) throws IOException {
        if (jVar == null || jVar.l()) {
            cVar.C();
            return;
        }
        if (jVar.p()) {
            u9.o oVarF = jVar.f();
            if (oVarF.A()) {
                cVar.x0(oVarF.x());
                return;
            } else if (oVarF.y()) {
                cVar.G0(oVarF.c());
                return;
            } else {
                cVar.C0(oVarF.h());
                return;
            }
        }
        if (jVar.k()) {
            cVar.d();
            Iterator it = jVar.d().iterator();
            while (it.hasNext()) {
                e(cVar, (u9.j) it.next());
            }
            cVar.h();
            return;
        }
        if (!jVar.n()) {
            throw new IllegalArgumentException("Couldn't write " + jVar.getClass());
        }
        cVar.f();
        for (Map.Entry entry : jVar.e().s()) {
            cVar.q((String) entry.getKey());
            e(cVar, (u9.j) entry.getValue());
        }
        cVar.i();
    }
}
