package nc;

import com.fasterxml.jackson.core.JsonPointer;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static final f a(AbstractC5157a abstractC5157a) {
        return (f) abstractC5157a.getClass().getAnnotation(f.class);
    }

    public static final int b(AbstractC5157a abstractC5157a) {
        try {
            Field declaredField = abstractC5157a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC5157a);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement c(AbstractC5157a abstractC5157a) {
        String strC;
        AbstractC4862t.e(abstractC5157a, "<this>");
        f fVarA = a(abstractC5157a);
        if (fVarA == null || fVarA.v() < 1) {
            return null;
        }
        int iB = b(abstractC5157a);
        int i10 = iB < 0 ? -1 : fVarA.l()[iB];
        String strB = i.f40767a.b(abstractC5157a);
        if (strB == null) {
            strC = fVarA.c();
        } else {
            strC = strB + JsonPointer.SEPARATOR + fVarA.c();
        }
        return new StackTraceElement(strC, fVarA.m(), fVarA.f(), i10);
    }
}
