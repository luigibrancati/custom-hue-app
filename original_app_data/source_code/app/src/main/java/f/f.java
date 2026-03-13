package f;

import Nd.q;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.InterfaceC2756l;
import androidx.lifecycle.InterfaceC2758n;
import com.google.ar.core.ImageMetadata;
import g.AbstractC4051a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.T;
import vc.InterfaceC6082a;
import zc.AbstractC6558c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f34080h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f34081a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f34082b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f34083c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f34084d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Map f34085e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f34086f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f34087g = new Bundle();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f.b f34088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC4051a f34089b;

        public a(f.b callback, AbstractC4051a contract) {
            AbstractC4862t.e(callback, "callback");
            AbstractC4862t.e(contract, "contract");
            this.f34088a = callback;
            this.f34089b = contract;
        }

        public final f.b a() {
            return this.f34088a;
        }

        public final AbstractC4051a b() {
            return this.f34089b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC2754j f34090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f34091b;

        public c(AbstractC2754j lifecycle) {
            AbstractC4862t.e(lifecycle, "lifecycle");
            this.f34090a = lifecycle;
            this.f34091b = new ArrayList();
        }

        public final void a(InterfaceC2756l observer) {
            AbstractC4862t.e(observer, "observer");
            this.f34090a.a(observer);
            this.f34091b.add(observer);
        }

        public final void b() {
            Iterator it = this.f34091b.iterator();
            while (it.hasNext()) {
                this.f34090a.c((InterfaceC2756l) it.next());
            }
            this.f34091b.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends f.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f34093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC4051a f34094c;

        public d(String str, AbstractC4051a abstractC4051a) {
            this.f34093b = str;
            this.f34094c = abstractC4051a;
        }

        @Override // f.c
        public void b(Object obj, androidx.core.app.c cVar) throws Exception {
            Object obj2 = f.this.f34082b.get(this.f34093b);
            AbstractC4051a abstractC4051a = this.f34094c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                f.this.f34084d.add(this.f34093b);
                try {
                    f.this.k(iIntValue, this.f34094c, obj, cVar);
                    return;
                } catch (Exception e10) {
                    f.this.f34084d.remove(this.f34093b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC4051a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // f.c
        public void c() {
            f.this.r(this.f34093b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends f.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f34096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC4051a f34097c;

        public e(String str, AbstractC4051a abstractC4051a) {
            this.f34096b = str;
            this.f34097c = abstractC4051a;
        }

        @Override // f.c
        public void b(Object obj, androidx.core.app.c cVar) throws Exception {
            Object obj2 = f.this.f34082b.get(this.f34096b);
            AbstractC4051a abstractC4051a = this.f34097c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                f.this.f34084d.add(this.f34096b);
                try {
                    f.this.k(iIntValue, this.f34097c, obj, cVar);
                    return;
                } catch (Exception e10) {
                    f.this.f34084d.remove(this.f34096b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC4051a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // f.c
        public void c() {
            f.this.r(this.f34096b);
        }
    }

    public static final Integer j() {
        return Integer.valueOf(AbstractC6558c.f48885a.d(2147418112) + ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
    }

    public static final void p(f fVar, String str, f.b bVar, AbstractC4051a abstractC4051a, InterfaceC2758n interfaceC2758n, AbstractC2754j.a event) {
        AbstractC4862t.e(interfaceC2758n, "<unused var>");
        AbstractC4862t.e(event, "event");
        if (AbstractC2754j.a.ON_START != event) {
            if (AbstractC2754j.a.ON_STOP == event) {
                fVar.f34085e.remove(str);
                return;
            } else {
                if (AbstractC2754j.a.ON_DESTROY == event) {
                    fVar.r(str);
                    return;
                }
                return;
            }
        }
        fVar.f34085e.put(str, new a(bVar, abstractC4051a));
        if (fVar.f34086f.containsKey(str)) {
            Object obj = fVar.f34086f.get(str);
            fVar.f34086f.remove(str);
            bVar.a(obj);
        }
        C3982a c3982a = (C3982a) U0.b.a(fVar.f34087g, str, C3982a.class);
        if (c3982a != null) {
            fVar.f34087g.remove(str);
            bVar.a(abstractC4051a.c(c3982a.b(), c3982a.a()));
        }
    }

    public final void e(int i10, String str) {
        this.f34081a.put(Integer.valueOf(i10), str);
        this.f34082b.put(str, Integer.valueOf(i10));
    }

    public final boolean f(int i10, int i11, Intent intent) {
        String str = (String) this.f34081a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        h(str, i11, intent, (a) this.f34085e.get(str));
        return true;
    }

    public final boolean g(int i10, Object obj) {
        String str = (String) this.f34081a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f34085e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f34087g.remove(str);
            this.f34086f.put(str, obj);
            return true;
        }
        f.b bVarA = aVar.a();
        AbstractC4862t.c(bVarA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f34084d.remove(str)) {
            return true;
        }
        bVarA.a(obj);
        return true;
    }

    public final void h(String str, int i10, Intent intent, a aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f34084d.contains(str)) {
            this.f34086f.remove(str);
            this.f34087g.putParcelable(str, new C3982a(i10, intent));
        } else {
            aVar.a().a(aVar.b().c(i10, intent));
            this.f34084d.remove(str);
        }
    }

    public final int i() {
        for (Number number : q.o(new InterfaceC6082a() { // from class: f.e
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return f.j();
            }
        })) {
            if (!this.f34081a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public abstract void k(int i10, AbstractC4051a abstractC4051a, Object obj, androidx.core.app.c cVar);

    public final void l(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f34084d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f34087g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.f34082b.containsKey(str)) {
                Integer num = (Integer) this.f34082b.remove(str);
                if (!this.f34087g.containsKey(str)) {
                    T.c(this.f34081a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i10);
            AbstractC4862t.d(num2, "get(...)");
            int iIntValue = num2.intValue();
            String str2 = stringArrayList.get(i10);
            AbstractC4862t.d(str2, "get(...)");
            e(iIntValue, str2);
        }
    }

    public final void m(Bundle outState) {
        AbstractC4862t.e(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f34082b.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f34082b.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f34084d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f34087g));
    }

    public final f.c n(final String key, InterfaceC2758n lifecycleOwner, final AbstractC4051a contract, final f.b callback) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(lifecycleOwner, "lifecycleOwner");
        AbstractC4862t.e(contract, "contract");
        AbstractC4862t.e(callback, "callback");
        AbstractC2754j lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b().b(AbstractC2754j.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        q(key);
        c cVar = (c) this.f34083c.get(key);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.a(new InterfaceC2756l() { // from class: f.d
            @Override // androidx.lifecycle.InterfaceC2756l
            public final void d(InterfaceC2758n interfaceC2758n, AbstractC2754j.a aVar) {
                f.p(this.f34076a, key, callback, contract, interfaceC2758n, aVar);
            }
        });
        this.f34083c.put(key, cVar);
        return new d(key, contract);
    }

    public final f.c o(String key, AbstractC4051a contract, f.b callback) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(contract, "contract");
        AbstractC4862t.e(callback, "callback");
        q(key);
        this.f34085e.put(key, new a(callback, contract));
        if (this.f34086f.containsKey(key)) {
            Object obj = this.f34086f.get(key);
            this.f34086f.remove(key);
            callback.a(obj);
        }
        C3982a c3982a = (C3982a) U0.b.a(this.f34087g, key, C3982a.class);
        if (c3982a != null) {
            this.f34087g.remove(key);
            callback.a(contract.c(c3982a.b(), c3982a.a()));
        }
        return new e(key, contract);
    }

    public final void q(String str) {
        if (((Integer) this.f34082b.get(str)) != null) {
            return;
        }
        e(i(), str);
    }

    public final void r(String key) {
        Integer num;
        AbstractC4862t.e(key, "key");
        if (!this.f34084d.contains(key) && (num = (Integer) this.f34082b.remove(key)) != null) {
            this.f34081a.remove(num);
        }
        this.f34085e.remove(key);
        if (this.f34086f.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.f34086f.get(key));
            this.f34086f.remove(key);
        }
        if (this.f34087g.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C3982a) U0.b.a(this.f34087g, key, C3982a.class)));
            this.f34087g.remove(key);
        }
        c cVar = (c) this.f34083c.get(key);
        if (cVar != null) {
            cVar.b();
            this.f34083c.remove(key);
        }
    }
}
