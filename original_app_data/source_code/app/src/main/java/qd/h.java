package qd;

import Cd.E;
import Cd.M;
import Lc.G;
import gc.C4179C;
import gc.C4204q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f43439a = new h();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ E f43440a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(E e10) {
            super(1);
            this.f43440a = e10;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(G it) {
            AbstractC4862t.e(it, "it");
            return this.f43440a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ic.h f43441a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ic.h hVar) {
            super(1);
            this.f43441a = hVar;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(G module) {
            AbstractC4862t.e(module, "module");
            M mO = module.n().O(this.f43441a);
            AbstractC4862t.d(mO, "module.builtIns.getPrimi…KotlinType(componentType)");
            return mO;
        }
    }

    public final C5516b a(List value, E type) {
        AbstractC4862t.e(value, "value");
        AbstractC4862t.e(type, "type");
        return new C5516b(value, new a(type));
    }

    public final C5516b b(List list, Ic.h hVar) {
        List listV0 = C4179C.V0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listV0.iterator();
        while (it.hasNext()) {
            g gVarC = c(it.next());
            if (gVarC != null) {
                arrayList.add(gVarC);
            }
        }
        return new C5516b(arrayList, new b(hVar));
    }

    public final g c(Object obj) {
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new t(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new m(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new q(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new l(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new i(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C5517c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new u((String) obj);
        }
        if (obj instanceof byte[]) {
            return b(C4204q.I0((byte[]) obj), Ic.h.BYTE);
        }
        if (obj instanceof short[]) {
            return b(C4204q.P0((short[]) obj), Ic.h.SHORT);
        }
        if (obj instanceof int[]) {
            return b(C4204q.M0((int[]) obj), Ic.h.INT);
        }
        if (obj instanceof long[]) {
            return b(C4204q.N0((long[]) obj), Ic.h.LONG);
        }
        if (obj instanceof char[]) {
            return b(C4204q.J0((char[]) obj), Ic.h.CHAR);
        }
        if (obj instanceof float[]) {
            return b(C4204q.L0((float[]) obj), Ic.h.FLOAT);
        }
        if (obj instanceof double[]) {
            return b(C4204q.K0((double[]) obj), Ic.h.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return b(C4204q.Q0((boolean[]) obj), Ic.h.BOOLEAN);
        }
        if (obj == null) {
            return new r();
        }
        return null;
    }
}
