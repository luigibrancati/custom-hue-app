package Gc;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface e {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static void a(e eVar, Object[] args) {
            AbstractC4862t.e(args, "args");
            if (g.a(eVar) == args.length) {
                return;
            }
            throw new IllegalArgumentException("Callable expects " + g.a(eVar) + " arguments, but " + args.length + " were provided.");
        }
    }

    List a();

    Object call(Object[] objArr);

    Member getMember();

    Type getReturnType();
}
