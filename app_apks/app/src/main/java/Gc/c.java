package Gc;

import Fc.D;
import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4179C;
import gc.C4204q;
import gc.C4207u;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.v;
import uc.AbstractC6017a;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f4700a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map map) {
            super(0);
            this.f4700a = map;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            int iHashCode = 0;
            for (Map.Entry entry : this.f4700a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
            }
            return Integer.valueOf(iHashCode);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f4701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f4702b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends v implements l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f4703a = new a();

            public a() {
                super(1);
            }

            @Override // vc.l
            public final CharSequence invoke(Map.Entry entry) {
                String string;
                AbstractC4862t.e(entry, "entry");
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) value);
                    AbstractC4862t.d(string, "toString(this)");
                } else if (value instanceof char[]) {
                    string = Arrays.toString((char[]) value);
                    AbstractC4862t.d(string, "toString(this)");
                } else if (value instanceof byte[]) {
                    string = Arrays.toString((byte[]) value);
                    AbstractC4862t.d(string, "toString(this)");
                } else if (value instanceof short[]) {
                    string = Arrays.toString((short[]) value);
                    AbstractC4862t.d(string, "toString(this)");
                } else if (value instanceof int[]) {
                    string = Arrays.toString((int[]) value);
                    AbstractC4862t.d(string, "toString(this)");
                } else if (value instanceof float[]) {
                    string = Arrays.toString((float[]) value);
                    AbstractC4862t.d(string, "toString(this)");
                } else if (value instanceof long[]) {
                    string = Arrays.toString((long[]) value);
                    AbstractC4862t.d(string, "toString(this)");
                } else if (value instanceof double[]) {
                    string = Arrays.toString((double[]) value);
                    AbstractC4862t.d(string, "toString(this)");
                } else if (value instanceof Object[]) {
                    string = Arrays.toString((Object[]) value);
                    AbstractC4862t.d(string, "toString(this)");
                } else {
                    string = value.toString();
                }
                return str + '=' + string;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Class cls, Map map) {
            super(0);
            this.f4701a = cls;
            this.f4702b = map;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() throws IOException {
            Class cls = this.f4701a;
            Map map = this.f4702b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('@');
            sb2.append(cls.getCanonicalName());
            C4179C.n0(map.entrySet(), sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : a.f4703a);
            String string = sb2.toString();
            AbstractC4862t.d(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    public static final Object d(Class annotationClass, Map values, List methods) {
        AbstractC4862t.e(annotationClass, "annotationClass");
        AbstractC4862t.e(values, "values");
        AbstractC4862t.e(methods, "methods");
        InterfaceC4028k interfaceC4028kB = C4029l.b(new a(values));
        Object objNewProxyInstance = Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new Gc.b(annotationClass, values, C4029l.b(new b(annotationClass, values)), interfaceC4028kB, methods));
        AbstractC4862t.c(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }

    public static /* synthetic */ Object e(Class cls, Map map, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(C4207u.v(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return d(cls, map, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean f(java.lang.Class r5, java.util.List r6, java.util.Map r7, java.lang.Object r8) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Gc.c.f(java.lang.Class, java.util.List, java.util.Map, java.lang.Object):boolean");
    }

    public static final int g(InterfaceC4028k interfaceC4028k) {
        return ((Number) interfaceC4028k.getValue()).intValue();
    }

    public static final String h(InterfaceC4028k interfaceC4028k) {
        return (String) interfaceC4028k.getValue();
    }

    public static final Object i(Class annotationClass, Map values, InterfaceC4028k toString$delegate, InterfaceC4028k hashCode$delegate, List methods, Object obj, Method method, Object[] args) {
        AbstractC4862t.e(annotationClass, "$annotationClass");
        AbstractC4862t.e(values, "$values");
        AbstractC4862t.e(toString$delegate, "$toString$delegate");
        AbstractC4862t.e(hashCode$delegate, "$hashCode$delegate");
        AbstractC4862t.e(methods, "$methods");
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return annotationClass;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(g(hashCode$delegate));
                }
            } else if (name.equals("toString")) {
                return h(toString$delegate);
            }
        }
        if (AbstractC4862t.a(name, "equals") && args != null && args.length == 1) {
            AbstractC4862t.d(args, "args");
            return Boolean.valueOf(f(annotationClass, methods, values, C4204q.y0(args)));
        }
        if (values.containsKey(name)) {
            return values.get(name);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Method is not supported: ");
        sb2.append(method);
        sb2.append(" (args: ");
        if (args == null) {
            args = new Object[0];
        }
        sb2.append(C4204q.O0(args));
        sb2.append(')');
        throw new D(sb2.toString());
    }

    public static final Void j(int i10, String str, Class cls) {
        String strJ;
        Cc.d dVarB = AbstractC4862t.a(cls, Class.class) ? M.b(Cc.d.class) : (cls.isArray() && AbstractC4862t.a(cls.getComponentType(), Class.class)) ? M.b(Cc.d[].class) : AbstractC6017a.e(cls);
        if (AbstractC4862t.a(dVarB.j(), M.b(Object[].class).j())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dVarB.j());
            sb2.append('<');
            Class<?> componentType = AbstractC6017a.b(dVarB).getComponentType();
            AbstractC4862t.d(componentType, "kotlinClass.java.componentType");
            sb2.append(AbstractC6017a.e(componentType).j());
            sb2.append('>');
            strJ = sb2.toString();
        } else {
            strJ = dVarB.j();
        }
        throw new IllegalArgumentException("Argument #" + i10 + ' ' + str + " is not of the required type " + strJ);
    }

    public static final Object k(Object obj, Class cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof Cc.d) {
            obj = AbstractC6017a.b((Cc.d) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof Cc.d[]) {
                AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                Cc.d[] dVarArr = (Cc.d[]) obj;
                ArrayList arrayList = new ArrayList(dVarArr.length);
                for (Cc.d dVar : dVarArr) {
                    arrayList.add(AbstractC6017a.b(dVar));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
