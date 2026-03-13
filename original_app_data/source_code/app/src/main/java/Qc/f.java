package Qc;

import Od.C;
import com.fasterxml.jackson.core.JsonPointer;
import dd.InterfaceC3913r;
import ed.C3979a;
import ed.C3980b;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements InterfaceC3913r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14265c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f14266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3979a f14267b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final f a(Class klass) throws InvocationTargetException {
            AbstractC4862t.e(klass, "klass");
            C3980b c3980b = new C3980b();
            c.f14263a.b(klass, c3980b);
            C3979a c3979aM = c3980b.m();
            AbstractC4854k abstractC4854k = null;
            if (c3979aM == null) {
                return null;
            }
            return new f(klass, c3979aM, abstractC4854k);
        }

        public a() {
        }
    }

    public /* synthetic */ f(Class cls, C3979a c3979a, AbstractC4854k abstractC4854k) {
        this(cls, c3979a);
    }

    @Override // dd.InterfaceC3913r
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        String name = this.f14266a.getName();
        AbstractC4862t.d(name, "klass.name");
        sb2.append(C.K(name, '.', JsonPointer.SEPARATOR, false, 4, null));
        sb2.append(".class");
        return sb2.toString();
    }

    @Override // dd.InterfaceC3913r
    public void b(InterfaceC3913r.d visitor, byte[] bArr) throws InvocationTargetException {
        AbstractC4862t.e(visitor, "visitor");
        c.f14263a.i(this.f14266a, visitor);
    }

    @Override // dd.InterfaceC3913r
    public kd.b c() {
        return Rc.d.a(this.f14266a);
    }

    @Override // dd.InterfaceC3913r
    public void d(InterfaceC3913r.c visitor, byte[] bArr) throws InvocationTargetException {
        AbstractC4862t.e(visitor, "visitor");
        c.f14263a.b(this.f14266a, visitor);
    }

    @Override // dd.InterfaceC3913r
    public C3979a e() {
        return this.f14267b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && AbstractC4862t.a(this.f14266a, ((f) obj).f14266a);
    }

    public final Class f() {
        return this.f14266a;
    }

    public int hashCode() {
        return this.f14266a.hashCode();
    }

    public String toString() {
        return f.class.getName() + ": " + this.f14266a;
    }

    public f(Class cls, C3979a c3979a) {
        this.f14266a = cls;
        this.f14267b = c3979a;
    }
}
