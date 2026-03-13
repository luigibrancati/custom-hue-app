package lc;

import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4989f;
import lc.InterfaceC4992i;
import vc.p;

/* JADX INFO: renamed from: lc.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4992i {

    /* JADX INFO: renamed from: lc.i$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static InterfaceC4992i b(InterfaceC4992i interfaceC4992i, InterfaceC4992i context) {
            AbstractC4862t.e(context, "context");
            return context == C4993j.f40088a ? interfaceC4992i : (InterfaceC4992i) context.fold(interfaceC4992i, new p() { // from class: lc.h
                @Override // vc.p
                public final Object invoke(Object obj, Object obj2) {
                    return InterfaceC4992i.a.c((InterfaceC4992i) obj, (InterfaceC4992i.b) obj2);
                }
            });
        }

        public static InterfaceC4992i c(InterfaceC4992i acc, b element) {
            AbstractC4862t.e(acc, "acc");
            AbstractC4862t.e(element, "element");
            InterfaceC4992i interfaceC4992iMinusKey = acc.minusKey(element.getKey());
            C4993j c4993j = C4993j.f40088a;
            if (interfaceC4992iMinusKey == c4993j) {
                return element;
            }
            InterfaceC4989f.b bVar = InterfaceC4989f.f40086j0;
            InterfaceC4989f interfaceC4989f = (InterfaceC4989f) interfaceC4992iMinusKey.get(bVar);
            if (interfaceC4989f == null) {
                return new C4987d(interfaceC4992iMinusKey, element);
            }
            InterfaceC4992i interfaceC4992iMinusKey2 = interfaceC4992iMinusKey.minusKey(bVar);
            return interfaceC4992iMinusKey2 == c4993j ? new C4987d(element, interfaceC4989f) : new C4987d(new C4987d(interfaceC4992iMinusKey2, element), interfaceC4989f);
        }
    }

    /* JADX INFO: renamed from: lc.i$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b extends InterfaceC4992i {

        /* JADX INFO: renamed from: lc.i$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {
            public static Object a(b bVar, Object obj, p operation) {
                AbstractC4862t.e(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            public static b b(b bVar, c key) {
                AbstractC4862t.e(key, "key");
                if (!AbstractC4862t.a(bVar.getKey(), key)) {
                    return null;
                }
                AbstractC4862t.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static InterfaceC4992i c(b bVar, c key) {
                AbstractC4862t.e(key, "key");
                return AbstractC4862t.a(bVar.getKey(), key) ? C4993j.f40088a : bVar;
            }

            public static InterfaceC4992i d(b bVar, InterfaceC4992i context) {
                AbstractC4862t.e(context, "context");
                return a.b(bVar, context);
            }
        }

        @Override // lc.InterfaceC4992i
        b get(c cVar);

        c getKey();
    }

    /* JADX INFO: renamed from: lc.i$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
    }

    Object fold(Object obj, p pVar);

    b get(c cVar);

    InterfaceC4992i minusKey(c cVar);

    InterfaceC4992i plus(InterfaceC4992i interfaceC4992i);
}
