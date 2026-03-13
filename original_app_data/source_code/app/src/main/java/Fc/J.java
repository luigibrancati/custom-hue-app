package Fc;

import gc.C4204q;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class J {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3850a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Class it) {
            AbstractC4862t.d(it, "it");
            return Rc.d.b(it);
        }
    }

    public static final String b(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC4862t.d(parameterTypes, "parameterTypes");
        sb2.append(C4204q.q0(parameterTypes, "", "(", ")", 0, null, a.f3850a, 24, null));
        Class<?> returnType = method.getReturnType();
        AbstractC4862t.d(returnType, "returnType");
        sb2.append(Rc.d.b(returnType));
        return sb2.toString();
    }
}
