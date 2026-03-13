package x9;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u9.q;
import u9.s;
import u9.w;
import u9.x;
import w9.B;
import w9.D;
import w9.E;
import w9.G;
import w9.u;
import w9.v;
import z9.AbstractC6553a;

/* JADX INFO: renamed from: x9.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6340l implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f47985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u9.c f47986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f47987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C6333e f47988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f47989e;

    /* JADX INFO: renamed from: x9.l$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends w {
        public a() {
        }

        @Override // u9.w
        public Object c(C9.a aVar) throws IOException {
            aVar.skipValue();
            return null;
        }

        @Override // u9.w
        public void e(C9.c cVar, Object obj) throws IOException {
            cVar.C();
        }

        public String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }
    }

    /* JADX INFO: renamed from: x9.l$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f47991d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Method f47992e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ w f47993f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ w f47994g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f47995h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f47996i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Field field, boolean z10, Method method, w wVar, w wVar2, boolean z11, boolean z12) {
            super(str, field);
            this.f47991d = z10;
            this.f47992e = method;
            this.f47993f = wVar;
            this.f47994g = wVar2;
            this.f47995h = z11;
            this.f47996i = z12;
        }

        @Override // x9.C6340l.d
        public void a(C9.a aVar, int i10, Object[] objArr) {
            Object objC = this.f47994g.c(aVar);
            if (objC != null || !this.f47995h) {
                objArr[i10] = objC;
                return;
            }
            throw new u9.n("null is not allowed as value for record component '" + this.f48001c + "' of primitive type; at path " + aVar.getPath());
        }

        @Override // x9.C6340l.d
        public void b(C9.a aVar, Object obj) throws IllegalAccessException {
            Object objC = this.f47994g.c(aVar);
            if (objC == null && this.f47995h) {
                return;
            }
            if (this.f47991d) {
                C6340l.b(obj, this.f48000b);
            } else if (this.f47996i) {
                throw new u9.k("Cannot set value of 'static final' " + AbstractC6553a.g(this.f48000b, false));
            }
            this.f48000b.set(obj, objC);
        }

        @Override // x9.C6340l.d
        public void c(C9.c cVar, Object obj) throws IllegalAccessException {
            Object objInvoke;
            if (this.f47991d) {
                Method method = this.f47992e;
                if (method == null) {
                    C6340l.b(obj, this.f48000b);
                } else {
                    C6340l.b(obj, method);
                }
            }
            Method method2 = this.f47992e;
            if (method2 != null) {
                try {
                    objInvoke = method2.invoke(obj, null);
                } catch (InvocationTargetException e10) {
                    throw new u9.k("Accessor " + AbstractC6553a.g(this.f47992e, false) + " threw exception", e10.getCause());
                }
            } else {
                objInvoke = this.f48000b.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            cVar.q(this.f47999a);
            this.f47993f.e(cVar, objInvoke);
        }
    }

    /* JADX INFO: renamed from: x9.l$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f47998a;

        public c(f fVar) {
            this.f47998a = fVar;
        }

        @Override // u9.w
        public Object c(C9.a aVar) throws IOException {
            if (aVar.C() == C9.b.NULL) {
                aVar.nextNull();
                return null;
            }
            Object objF = f();
            Map map = this.f47998a.f48004a;
            try {
                aVar.beginObject();
                while (aVar.hasNext()) {
                    d dVar = (d) map.get(aVar.nextName());
                    if (dVar == null) {
                        aVar.skipValue();
                    } else {
                        h(objF, aVar, dVar);
                    }
                }
                aVar.endObject();
                return g(objF);
            } catch (IllegalAccessException e10) {
                throw AbstractC6553a.e(e10);
            } catch (IllegalStateException e11) {
                throw new q(e11);
            }
        }

        @Override // u9.w
        public void e(C9.c cVar, Object obj) throws IOException {
            if (obj == null) {
                cVar.C();
                return;
            }
            cVar.f();
            try {
                Iterator it = this.f47998a.f48005b.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).c(cVar, obj);
                }
                cVar.i();
            } catch (IllegalAccessException e10) {
                throw AbstractC6553a.e(e10);
            }
        }

        public abstract Object f();

        public abstract Object g(Object obj);

        public abstract void h(Object obj, C9.a aVar, d dVar);
    }

    /* JADX INFO: renamed from: x9.l$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f48000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f48001c;

        public d(String str, Field field) {
            this.f47999a = str;
            this.f48000b = field;
            this.f48001c = field.getName();
        }

        public abstract void a(C9.a aVar, int i10, Object[] objArr);

        public abstract void b(C9.a aVar, Object obj);

        public abstract void c(C9.c cVar, Object obj);
    }

    /* JADX INFO: renamed from: x9.l$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f48003c = new f(Collections.EMPTY_MAP, Collections.EMPTY_LIST);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f48004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f48005b;

        public f(Map map, List list) {
            this.f48004a = map;
            this.f48005b = list;
        }
    }

    /* JADX INFO: renamed from: x9.l$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Map f48006e = k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Constructor f48007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object[] f48008c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map f48009d;

        public g(Class cls, f fVar, boolean z10) {
            super(fVar);
            this.f48009d = new HashMap();
            Constructor constructorI = AbstractC6553a.i(cls);
            this.f48007b = constructorI;
            if (z10) {
                C6340l.b(null, constructorI);
            } else {
                AbstractC6553a.o(constructorI);
            }
            String[] strArrK = AbstractC6553a.k(cls);
            for (int i10 = 0; i10 < strArrK.length; i10++) {
                this.f48009d.put(strArrK[i10], Integer.valueOf(i10));
            }
            Class<?>[] parameterTypes = this.f48007b.getParameterTypes();
            this.f48008c = new Object[parameterTypes.length];
            for (int i11 = 0; i11 < parameterTypes.length; i11++) {
                this.f48008c[i11] = f48006e.get(parameterTypes[i11]);
            }
        }

        public static Map k() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        @Override // x9.C6340l.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object[] f() {
            return (Object[]) this.f48008c.clone();
        }

        @Override // x9.C6340l.c
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Object g(Object[] objArr) {
            try {
                return this.f48007b.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                throw AbstractC6553a.e(e10);
            } catch (IllegalArgumentException | InstantiationException e11) {
                throw new RuntimeException("Failed to invoke constructor '" + AbstractC6553a.c(this.f48007b) + "' with args " + Arrays.toString(objArr), e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke constructor '" + AbstractC6553a.c(this.f48007b) + "' with args " + Arrays.toString(objArr), e12.getCause());
            }
        }

        @Override // x9.C6340l.c
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void h(Object[] objArr, C9.a aVar, d dVar) {
            Integer num = (Integer) this.f48009d.get(dVar.f48001c);
            if (num != null) {
                dVar.a(aVar, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC6553a.c(this.f48007b) + "' for field with name '" + dVar.f48001c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public C6340l(u uVar, u9.c cVar, v vVar, C6333e c6333e, List list) {
        this.f47985a = uVar;
        this.f47986b = cVar;
        this.f47987c = vVar;
        this.f47988d = c6333e;
        this.f47989e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (E.a(accessibleObject, obj)) {
            return;
        }
        throw new u9.k(AbstractC6553a.g(accessibleObject, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    public static IllegalArgumentException d(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + AbstractC6553a.f(field) + " and " + AbstractC6553a.f(field2) + "\nSee " + G.a("duplicate-fields"));
    }

    public final d c(u9.e eVar, Field field, Method method, String str, B9.a aVar, boolean z10, boolean z11) {
        boolean z12;
        w c6343o;
        boolean zA = D.a(aVar.c());
        int modifiers = field.getModifiers();
        boolean z13 = false;
        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
            z12 = false;
            z13 = true;
        } else {
            z12 = false;
        }
        v9.b bVar = (v9.b) field.getAnnotation(v9.b.class);
        w wVarC = bVar != null ? this.f47988d.c(this.f47985a, eVar, aVar, bVar, false) : null;
        boolean z14 = wVarC == null ? z12 : true;
        if (wVarC == null) {
            wVarC = eVar.k(aVar);
        }
        w wVar = wVarC;
        if (z10) {
            c6343o = z14 ? wVar : new C6343o(eVar, wVar, aVar.d());
        } else {
            c6343o = wVar;
        }
        return new b(str, field, z11, method, c6343o, wVar, zA, z13);
    }

    @Override // u9.x
    public w create(u9.e eVar, B9.a aVar) {
        Class clsC = aVar.c();
        if (!Object.class.isAssignableFrom(clsC)) {
            return null;
        }
        if (AbstractC6553a.l(clsC)) {
            return new a();
        }
        s sVarB = E.b(this.f47989e, clsC);
        if (sVarB != s.BLOCK_ALL) {
            boolean z10 = sVarB == s.BLOCK_INACCESSIBLE;
            return AbstractC6553a.m(clsC) ? new g(clsC, e(eVar, aVar, clsC, z10, true), z10) : new e(this.f47985a.t(aVar), e(eVar, aVar, clsC, z10, false));
        }
        throw new u9.k("ReflectionAccessFilter does not permit using reflection for " + clsC + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final x9.C6340l.f e(u9.e r20, B9.a r21, java.lang.Class r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.C6340l.e(u9.e, B9.a, java.lang.Class, boolean, boolean):x9.l$f");
    }

    public final List f(Field field) {
        v9.c cVar = (v9.c) field.getAnnotation(v9.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f47986b.a(field));
        }
        String strValue = cVar.value();
        String[] strArrAlternate = cVar.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        Collections.addAll(arrayList, strArrAlternate);
        return arrayList;
    }

    public final boolean g(Field field, boolean z10) {
        return !this.f47987c.g(field, z10);
    }

    /* JADX INFO: renamed from: x9.l$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final B f48002b;

        public e(B b10, f fVar) {
            super(fVar);
            this.f48002b = b10;
        }

        @Override // x9.C6340l.c
        public Object f() {
            return this.f48002b.a();
        }

        @Override // x9.C6340l.c
        public void h(Object obj, C9.a aVar, d dVar) {
            dVar.b(aVar, obj);
        }

        @Override // x9.C6340l.c
        public Object g(Object obj) {
            return obj;
        }
    }
}
