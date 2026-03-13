package y1;

import androidx.lifecycle.N;
import androidx.lifecycle.O;
import kotlin.jvm.internal.AbstractC4862t;
import uc.AbstractC6017a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final N a(O.c factory, Cc.d modelClass, AbstractC6382a extras) {
        AbstractC4862t.e(factory, "factory");
        AbstractC4862t.e(modelClass, "modelClass");
        AbstractC4862t.e(extras, "extras");
        try {
            try {
                return factory.b(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return factory.a(AbstractC6017a.b(modelClass), extras);
            }
        } catch (AbstractMethodError unused2) {
            return factory.c(AbstractC6017a.b(modelClass));
        }
    }
}
