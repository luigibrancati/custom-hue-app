package v3;

import android.os.Parcelable;
import b0.C2777a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: v3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6037a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2777a f45757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2777a f45758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2777a f45759c;

    public AbstractC6037a(C2777a c2777a, C2777a c2777a2, C2777a c2777a3) {
        this.f45757a = c2777a;
        this.f45758b = c2777a2;
        this.f45759c = c2777a3;
    }

    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i10) {
        w(i10);
        A(bArr);
    }

    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i10) {
        w(i10);
        C(charSequence);
    }

    public abstract void E(int i10);

    public void F(int i10, int i11) {
        w(i11);
        E(i10);
    }

    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i10) {
        w(i10);
        G(parcelable);
    }

    public abstract void I(String str);

    public void J(String str, int i10) {
        w(i10);
        I(str);
    }

    public void K(c cVar, AbstractC6037a abstractC6037a) {
        try {
            e(cVar.getClass()).invoke(null, cVar, abstractC6037a);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (!(e13.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
            }
            throw ((RuntimeException) e13.getCause());
        }
    }

    public void L(c cVar) {
        if (cVar == null) {
            I(null);
            return;
        }
        N(cVar);
        AbstractC6037a abstractC6037aB = b();
        K(cVar, abstractC6037aB);
        abstractC6037aB.a();
    }

    public void M(c cVar, int i10) {
        w(i10);
        L(cVar);
    }

    public final void N(c cVar) {
        try {
            I(c(cVar.getClass()).getName());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e10);
        }
    }

    public abstract void a();

    public abstract AbstractC6037a b();

    public final Class c(Class cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.f45759c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f45759c.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method d(String str) throws NoSuchMethodException {
        Method method = (Method) this.f45757a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC6037a.class.getClassLoader()).getDeclaredMethod("read", AbstractC6037a.class);
        this.f45757a.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method e(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Method method = (Method) this.f45758b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsC = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsC.getDeclaredMethod("write", cls, AbstractC6037a.class);
        this.f45758b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h(boolean z10, int i10) {
        return !m(i10) ? z10 : g();
    }

    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i10) {
        return !m(i10) ? bArr : i();
    }

    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i10) {
        return !m(i10) ? charSequence : k();
    }

    public abstract boolean m(int i10);

    public c n(String str, AbstractC6037a abstractC6037a) {
        try {
            return (c) d(str).invoke(null, abstractC6037a);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public abstract int o();

    public int p(int i10, int i11) {
        return !m(i11) ? i10 : o();
    }

    public abstract Parcelable q();

    public Parcelable r(Parcelable parcelable, int i10) {
        return !m(i10) ? parcelable : q();
    }

    public abstract String s();

    public String t(String str, int i10) {
        return !m(i10) ? str : s();
    }

    public c u() {
        String strS = s();
        if (strS == null) {
            return null;
        }
        return n(strS, b());
    }

    public c v(c cVar, int i10) {
        return !m(i10) ? cVar : u();
    }

    public abstract void w(int i10);

    public abstract void y(boolean z10);

    public void z(boolean z10, int i10) {
        w(i10);
        y(z10);
    }

    public void x(boolean z10, boolean z11) {
    }
}
