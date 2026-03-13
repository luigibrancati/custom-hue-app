package i3;

import android.os.Bundle;
import i3.C4341b;
import j3.C4680b;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: i3.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4345f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4680b f37071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4341b.C0486b f37072b;

    /* JADX INFO: renamed from: i3.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(InterfaceC4348i interfaceC4348i);
    }

    /* JADX INFO: renamed from: i3.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        Bundle a();
    }

    public C4345f(C4680b impl) {
        AbstractC4862t.e(impl, "impl");
        this.f37071a = impl;
    }

    public final Bundle a(String key) {
        AbstractC4862t.e(key, "key");
        return this.f37071a.c(key);
    }

    public final b b(String key) {
        AbstractC4862t.e(key, "key");
        return this.f37071a.d(key);
    }

    public final void c(String key, b provider) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(provider, "provider");
        this.f37071a.j(key, provider);
    }

    public final void d(Class clazz) {
        AbstractC4862t.e(clazz, "clazz");
        if (!this.f37071a.e()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C4341b.C0486b c0486b = this.f37072b;
        if (c0486b == null) {
            c0486b = new C4341b.C0486b(this);
        }
        this.f37072b = c0486b;
        try {
            clazz.getDeclaredConstructor(null);
            C4341b.C0486b c0486b2 = this.f37072b;
            if (c0486b2 != null) {
                String name = clazz.getName();
                AbstractC4862t.d(name, "getName(...)");
                c0486b2.b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
