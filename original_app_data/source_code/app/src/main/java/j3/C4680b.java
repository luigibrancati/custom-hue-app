package j3;

import android.os.Bundle;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.InterfaceC2756l;
import androidx.lifecycle.InterfaceC2758n;
import fc.AbstractC4040w;
import fc.C4015H;
import fc.C4034q;
import gc.Q;
import i3.AbstractC4342c;
import i3.AbstractC4349j;
import i3.C4345f;
import i3.InterfaceC4348i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: j3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4680b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f38966i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4348i f38967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC6082a f38968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4681c f38969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f38970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f38972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f38973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f38974h;

    /* JADX INFO: renamed from: j3.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public C4680b(InterfaceC4348i owner, InterfaceC6082a onAttach) {
        AbstractC4862t.e(owner, "owner");
        AbstractC4862t.e(onAttach, "onAttach");
        this.f38967a = owner;
        this.f38968b = onAttach;
        this.f38969c = new C4681c();
        this.f38970d = new LinkedHashMap();
        this.f38974h = true;
    }

    public static final void g(C4680b c4680b, InterfaceC2758n interfaceC2758n, AbstractC2754j.a event) {
        AbstractC4862t.e(interfaceC2758n, "<unused var>");
        AbstractC4862t.e(event, "event");
        if (event == AbstractC2754j.a.ON_START) {
            c4680b.f38974h = true;
        } else if (event == AbstractC2754j.a.ON_STOP) {
            c4680b.f38974h = false;
        }
    }

    public final Bundle c(String key) {
        AbstractC4862t.e(key, "key");
        if (!this.f38973g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.f38972f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleA = AbstractC4342c.a(bundle);
        Bundle bundleC = AbstractC4342c.b(bundleA, key) ? AbstractC4342c.c(bundleA, key) : null;
        AbstractC4349j.e(AbstractC4349j.a(bundle), key);
        if (AbstractC4342c.f(AbstractC4342c.a(bundle))) {
            this.f38972f = null;
        }
        return bundleC;
    }

    public final C4345f.b d(String key) {
        C4345f.b bVar;
        AbstractC4862t.e(key, "key");
        synchronized (this.f38969c) {
            Iterator it = this.f38970d.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                C4345f.b bVar2 = (C4345f.b) entry.getValue();
                if (AbstractC4862t.a(str, key)) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    public final boolean e() {
        return this.f38974h;
    }

    public final void f() {
        if (this.f38967a.getLifecycle().b() != AbstractC2754j.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f38971e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f38968b.invoke();
        this.f38967a.getLifecycle().a(new InterfaceC2756l() { // from class: j3.a
            @Override // androidx.lifecycle.InterfaceC2756l
            public final void d(InterfaceC2758n interfaceC2758n, AbstractC2754j.a aVar) {
                C4680b.g(this.f38965a, interfaceC2758n, aVar);
            }
        });
        this.f38971e = true;
    }

    public final void h(Bundle bundle) {
        if (!this.f38971e) {
            f();
        }
        if (this.f38967a.getLifecycle().b().b(AbstractC2754j.b.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + this.f38967a.getLifecycle().b()).toString());
        }
        if (this.f38973g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleC = null;
        if (bundle != null) {
            Bundle bundleA = AbstractC4342c.a(bundle);
            if (AbstractC4342c.b(bundleA, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundleC = AbstractC4342c.c(bundleA, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.f38972f = bundleC;
        this.f38973g = true;
    }

    public final void i(Bundle outBundle) {
        C4034q[] c4034qArr;
        AbstractC4862t.e(outBundle, "outBundle");
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
        Bundle bundleA2 = AbstractC4349j.a(bundleA);
        Bundle bundle = this.f38972f;
        if (bundle != null) {
            AbstractC4349j.b(bundleA2, bundle);
        }
        synchronized (this.f38969c) {
            try {
                for (Map.Entry entry2 : this.f38970d.entrySet()) {
                    AbstractC4349j.c(bundleA2, (String) entry2.getKey(), ((C4345f.b) entry2.getValue()).a());
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (AbstractC4342c.f(AbstractC4342c.a(bundleA))) {
            return;
        }
        AbstractC4349j.c(AbstractC4349j.a(outBundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleA);
    }

    public final void j(String key, C4345f.b provider) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(provider, "provider");
        synchronized (this.f38969c) {
            if (this.f38970d.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.f38970d.put(key, provider);
            C4015H c4015h = C4015H.f34254a;
        }
    }
}
