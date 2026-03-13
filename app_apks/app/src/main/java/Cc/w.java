package Cc;

import Od.C;
import fc.C4032o;
import gc.C4179C;
import gc.C4207u;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.InterfaceC4863u;
import uc.AbstractC6017a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1248a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1248a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class b extends AbstractC4860q implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f1249a = new b();

        public b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Class invoke(Class p02) {
            AbstractC4862t.e(p02, "p0");
            return p02.getComponentType();
        }
    }

    public static final Type c(p pVar, boolean z10) {
        f fVarA = pVar.a();
        if (fVarA instanceof q) {
            return new v((q) fVarA);
        }
        if (!(fVarA instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + pVar);
        }
        d dVar = (d) fVarA;
        Class clsC = z10 ? AbstractC6017a.c(dVar) : AbstractC6017a.b(dVar);
        List listB = pVar.b();
        if (listB.isEmpty()) {
            return clsC;
        }
        if (!clsC.isArray()) {
            return e(clsC, listB);
        }
        if (clsC.getComponentType().isPrimitive()) {
            return clsC;
        }
        r rVar = (r) C4179C.H0(listB);
        if (rVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + pVar);
        }
        s sVarA = rVar.a();
        p pVarB = rVar.b();
        int i10 = sVarA == null ? -1 : a.f1248a[sVarA.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return clsC;
        }
        if (i10 != 2 && i10 != 3) {
            throw new C4032o();
        }
        AbstractC4862t.b(pVarB);
        Type typeD = d(pVarB, false, 1, null);
        return typeD instanceof Class ? clsC : new Cc.a(typeD);
    }

    public static /* synthetic */ Type d(p pVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(pVar, z10);
    }

    public static final Type e(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(g((r) it.next()));
            }
            return new u(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(C4207u.v(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((r) it2.next()));
            }
            return new u(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeE = e(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(C4207u.v(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((r) it3.next()));
        }
        return new u(cls, typeE, arrayList3);
    }

    public static final Type f(p pVar) {
        Type typeC;
        AbstractC4862t.e(pVar, "<this>");
        return (!(pVar instanceof InterfaceC4863u) || (typeC = ((InterfaceC4863u) pVar).c()) == null) ? d(pVar, false, 1, null) : typeC;
    }

    public static final Type g(r rVar) {
        s sVarD = rVar.d();
        if (sVarD == null) {
            return x.f1250c.a();
        }
        p pVarC = rVar.c();
        AbstractC4862t.b(pVarC);
        int i10 = a.f1248a[sVarD.ordinal()];
        if (i10 == 1) {
            return new x(null, c(pVarC, true));
        }
        if (i10 == 2) {
            return c(pVarC, true);
        }
        if (i10 == 3) {
            return new x(c(pVarC, true), null);
        }
        throw new C4032o();
    }

    public static final String h(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            String name = cls.getName();
            AbstractC4862t.d(name, "getName(...)");
            return name;
        }
        Nd.h hVarN = Nd.q.n(type, b.f1249a);
        return ((Class) Nd.t.H(hVarN)).getName() + C.H("[]", Nd.t.w(hVarN));
    }
}
