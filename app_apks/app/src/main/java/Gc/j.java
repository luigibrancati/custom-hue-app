package Gc;

import Gc.e;
import Gc.f;
import gc.C4202o;
import gc.C4205s;
import gc.C4206t;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f4723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f4725c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends j implements d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f4726d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Method unboxMethod, Object obj) {
            super(unboxMethod, C4206t.k(), null);
            AbstractC4862t.e(unboxMethod, "unboxMethod");
            this.f4726d = obj;
        }

        @Override // Gc.e
        public Object call(Object[] args) {
            AbstractC4862t.e(args, "args");
            c(args);
            return b(this.f4726d, args);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method unboxMethod) {
            super(unboxMethod, C4205s.d(unboxMethod.getDeclaringClass()), null);
            AbstractC4862t.e(unboxMethod, "unboxMethod");
        }

        @Override // Gc.e
        public Object call(Object[] args) {
            AbstractC4862t.e(args, "args");
            c(args);
            Object obj = args[0];
            f.d dVar = f.f4704e;
            return b(obj, args.length <= 1 ? new Object[0] : C4202o.u(args, 1, args.length));
        }
    }

    public /* synthetic */ j(Method method, List list, AbstractC4854k abstractC4854k) {
        this(method, list);
    }

    @Override // Gc.e
    public final List a() {
        return this.f4724b;
    }

    public final Object b(Object obj, Object[] args) {
        AbstractC4862t.e(args, "args");
        return this.f4723a.invoke(obj, Arrays.copyOf(args, args.length));
    }

    public void c(Object[] objArr) {
        e.a.a(this, objArr);
    }

    @Override // Gc.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Method getMember() {
        return null;
    }

    @Override // Gc.e
    public final Type getReturnType() {
        return this.f4725c;
    }

    public j(Method method, List list) {
        this.f4723a = method;
        this.f4724b = list;
        Class<?> returnType = method.getReturnType();
        AbstractC4862t.d(returnType, "unboxMethod.returnType");
        this.f4725c = returnType;
    }
}
