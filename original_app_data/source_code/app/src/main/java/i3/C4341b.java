package i3;

import android.os.Bundle;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.InterfaceC2756l;
import androidx.lifecycle.InterfaceC2758n;
import fc.AbstractC4040w;
import fc.C4034q;
import gc.C4179C;
import gc.Q;
import i3.C4345f;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: i3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4341b implements InterfaceC2756l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f37068b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4348i f37069a;

    /* JADX INFO: renamed from: i3.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: i3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0486b implements C4345f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f37070a;

        public C0486b(C4345f registry) {
            AbstractC4862t.e(registry, "registry");
            this.f37070a = new LinkedHashSet();
            registry.c("androidx.savedstate.Restarter", this);
        }

        @Override // i3.C4345f.b
        public Bundle a() {
            C4034q[] c4034qArr;
            Map mapI = Q.i();
            if (mapI.isEmpty()) {
                c4034qArr = new C4034q[0];
            } else {
                ArrayList arrayList = new ArrayList(mapI.size());
                for (Map.Entry entry : mapI.entrySet()) {
                    arrayList.add(AbstractC4040w.a((String) entry.getKey(), entry.getValue()));
                }
                c4034qArr = (C4034q[]) arrayList.toArray(new C4034q[0]);
            }
            Bundle bundleA = U0.c.a((C4034q[]) Arrays.copyOf(c4034qArr, c4034qArr.length));
            AbstractC4349j.d(AbstractC4349j.a(bundleA), "classes_to_restore", C4179C.V0(this.f37070a));
            return bundleA;
        }

        public final void b(String className) {
            AbstractC4862t.e(className, "className");
            this.f37070a.add(className);
        }
    }

    public C4341b(InterfaceC4348i owner) {
        AbstractC4862t.e(owner, "owner");
        this.f37069a = owner;
    }

    public final void a(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, C4341b.class.getClassLoader()).asSubclass(C4345f.a.class);
            AbstractC4862t.b(clsAsSubclass);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    AbstractC4862t.b(objNewInstance);
                    ((C4345f.a) objNewInstance).a(this.f37069a);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.InterfaceC2756l
    public void d(InterfaceC2758n source, AbstractC2754j.a event) {
        AbstractC4862t.e(source, "source");
        AbstractC4862t.e(event, "event");
        if (event != AbstractC2754j.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().c(this);
        Bundle bundleA = this.f37069a.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        List listE = AbstractC4342c.e(AbstractC4342c.a(bundleA), "classes_to_restore");
        if (listE == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            a((String) it.next());
        }
    }
}
