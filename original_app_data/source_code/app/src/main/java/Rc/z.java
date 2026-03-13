package Rc;

import bd.InterfaceC2909a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z implements bd.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15104a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final z a(Type type) {
            AbstractC4862t.e(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new x(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) ? new k(type) : type instanceof WildcardType ? new C((WildcardType) type) : new n(type);
        }

        public a() {
        }
    }

    public abstract Type Q();

    public boolean equals(Object obj) {
        return (obj instanceof z) && AbstractC4862t.a(Q(), ((z) obj).Q());
    }

    public int hashCode() {
        return Q().hashCode();
    }

    @Override // bd.InterfaceC2912d
    public InterfaceC2909a j(kd.c fqName) {
        Object obj;
        AbstractC4862t.e(fqName, "fqName");
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            kd.b bVarC = ((InterfaceC2909a) next).c();
            if (AbstractC4862t.a(bVarC != null ? bVarC.b() : null, fqName)) {
                obj = next;
                break;
            }
        }
        return (InterfaceC2909a) obj;
    }

    public String toString() {
        return getClass().getName() + ": " + Q();
    }
}
