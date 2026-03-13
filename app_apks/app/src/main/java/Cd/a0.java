package Cd;

import gc.C4179C;
import gc.C4205s;
import gc.C4206t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends Jd.e implements Iterable, InterfaceC6184a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1311b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f1312c = new a0(C4206t.k());

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends Jd.s {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        @Override // Jd.s
        public int b(ConcurrentHashMap concurrentHashMap, Cc.d kClass, vc.l compute) {
            int iIntValue;
            AbstractC4862t.e(concurrentHashMap, "<this>");
            AbstractC4862t.e(kClass, "kClass");
            AbstractC4862t.e(compute, "compute");
            Integer num = (Integer) concurrentHashMap.get(kClass);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(kClass);
                    if (num2 == null) {
                        Object objInvoke = compute.invoke(kClass);
                        concurrentHashMap.putIfAbsent(kClass, Integer.valueOf(((Number) objInvoke).intValue()));
                        num2 = (Integer) objInvoke;
                    }
                    AbstractC4862t.d(num2, "this[kClass] ?: compute(…putIfAbsent(kClass, it) }");
                    iIntValue = num2.intValue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iIntValue;
        }

        public final a0 g(List attributes) {
            AbstractC4862t.e(attributes, "attributes");
            return attributes.isEmpty() ? h() : new a0(attributes, null);
        }

        public final a0 h() {
            return a0.f1312c;
        }

        public a() {
        }
    }

    public /* synthetic */ a0(List list, AbstractC4854k abstractC4854k) {
        this(list);
    }

    @Override // Jd.a
    public Jd.s d() {
        return f1311b;
    }

    public final a0 h(a0 other) {
        AbstractC4862t.e(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f1311b.e().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Y y10 = (Y) c().get(iIntValue);
            Y y11 = (Y) other.c().get(iIntValue);
            Md.a.a(arrayList, y10 == null ? y11 != null ? y11.a(y10) : null : y10.a(y11));
        }
        return f1311b.g(arrayList);
    }

    public final boolean k(Y attribute) {
        AbstractC4862t.e(attribute, "attribute");
        return c().get(f1311b.d(attribute.b())) != null;
    }

    public final a0 l(a0 other) {
        AbstractC4862t.e(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f1311b.e().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Y y10 = (Y) c().get(iIntValue);
            Y y11 = (Y) other.c().get(iIntValue);
            Md.a.a(arrayList, y10 == null ? y11 != null ? y11.c(y10) : null : y10.c(y11));
        }
        return f1311b.g(arrayList);
    }

    public final a0 n(Y attribute) {
        AbstractC4862t.e(attribute, "attribute");
        if (k(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new a0(attribute);
        }
        return f1311b.g(C4179C.D0(C4179C.V0(this), attribute));
    }

    public final a0 p(Y attribute) {
        AbstractC4862t.e(attribute, "attribute");
        if (!isEmpty()) {
            Jd.c cVarC = c();
            ArrayList arrayList = new ArrayList();
            for (Object obj : cVarC) {
                if (!AbstractC4862t.a((Y) obj, attribute)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() != c().c()) {
                return f1311b.g(arrayList);
            }
        }
        return this;
    }

    public a0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Y y10 = (Y) it.next();
            e(y10.b(), y10);
        }
    }

    public a0(Y y10) {
        this(C4205s.d(y10));
    }
}
