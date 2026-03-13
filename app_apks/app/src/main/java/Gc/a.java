package Gc;

import Gc.e;
import gc.C4179C;
import gc.C4207u;
import gc.Q;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f4688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC0077a f4690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f4691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f4692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f4693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f4694g;

    /* JADX INFO: renamed from: Gc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum EnumC0077a {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b {
        JAVA,
        KOTLIN
    }

    public a(Class jClass, List parameterNames, EnumC0077a callMode, b origin, List methods) {
        AbstractC4862t.e(jClass, "jClass");
        AbstractC4862t.e(parameterNames, "parameterNames");
        AbstractC4862t.e(callMode, "callMode");
        AbstractC4862t.e(origin, "origin");
        AbstractC4862t.e(methods, "methods");
        this.f4688a = jClass;
        this.f4689b = parameterNames;
        this.f4690c = callMode;
        this.f4691d = methods;
        ArrayList arrayList = new ArrayList(C4207u.v(methods, 10));
        Iterator it = methods.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.f4692e = arrayList;
        List list = this.f4691d;
        ArrayList arrayList2 = new ArrayList(C4207u.v(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Class<?> it3 = ((Method) it2.next()).getReturnType();
            AbstractC4862t.d(it3, "it");
            Class<?> clsG = Rc.d.g(it3);
            if (clsG != null) {
                it3 = clsG;
            }
            arrayList2.add(it3);
        }
        this.f4693f = arrayList2;
        List list2 = this.f4691d;
        ArrayList arrayList3 = new ArrayList(C4207u.v(list2, 10));
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((Method) it4.next()).getDefaultValue());
        }
        this.f4694g = arrayList3;
        if (this.f4690c == EnumC0077a.POSITIONAL_CALL && origin == b.JAVA && !C4179C.z0(this.f4689b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // Gc.e
    public List a() {
        return this.f4692e;
    }

    public void b(Object[] objArr) {
        e.a.a(this, objArr);
    }

    public Void c() {
        return null;
    }

    @Override // Gc.e
    public Object call(Object[] args) {
        AbstractC4862t.e(args, "args");
        b(args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Object obj = args[i10];
            int i12 = i11 + 1;
            Object objK = (obj == null && this.f4690c == EnumC0077a.CALL_BY_NAME) ? this.f4694g.get(i11) : c.k(obj, (Class) this.f4693f.get(i11));
            if (objK == null) {
                c.j(i11, (String) this.f4689b.get(i11), (Class) this.f4693f.get(i11));
                throw null;
            }
            arrayList.add(objK);
            i10++;
            i11 = i12;
        }
        return c.d(this.f4688a, Q.s(C4179C.d1(this.f4689b, arrayList)), this.f4691d);
    }

    @Override // Gc.e
    public /* bridge */ /* synthetic */ Member getMember() {
        return (Member) c();
    }

    @Override // Gc.e
    public Type getReturnType() {
        return this.f4688a;
    }

    public /* synthetic */ a(Class cls, List list, EnumC0077a enumC0077a, b bVar, List list2, int i10, AbstractC4854k abstractC4854k) {
        if ((i10 & 16) != 0) {
            list2 = new ArrayList(C4207u.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(cls.getDeclaredMethod((String) it.next(), null));
            }
        }
        this(cls, list, enumC0077a, bVar, list2);
    }
}
