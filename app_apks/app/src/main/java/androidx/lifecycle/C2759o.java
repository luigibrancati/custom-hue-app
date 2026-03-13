package androidx.lifecycle;

import androidx.lifecycle.AbstractC2754j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import r.C5521a;
import r.C5522b;

/* JADX INFO: renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C2759o extends AbstractC2754j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f23465k = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5521a f23467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC2754j.b f23468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f23469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f23473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Ud.w f23474j;

    /* JADX INFO: renamed from: androidx.lifecycle.o$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final AbstractC2754j.b a(AbstractC2754j.b state1, AbstractC2754j.b bVar) {
            AbstractC4862t.e(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.o$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC2754j.b f23475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC2756l f23476b;

        public b(InterfaceC2757m interfaceC2757m, AbstractC2754j.b initialState) {
            AbstractC4862t.e(initialState, "initialState");
            AbstractC4862t.b(interfaceC2757m);
            this.f23476b = C2762s.f(interfaceC2757m);
            this.f23475a = initialState;
        }

        public final void a(InterfaceC2758n interfaceC2758n, AbstractC2754j.a event) {
            AbstractC4862t.e(event, "event");
            AbstractC2754j.b bVarJ = event.j();
            this.f23475a = C2759o.f23465k.a(this.f23475a, bVarJ);
            InterfaceC2756l interfaceC2756l = this.f23476b;
            AbstractC4862t.b(interfaceC2758n);
            interfaceC2756l.d(interfaceC2758n, event);
            this.f23475a = bVarJ;
        }

        public final AbstractC2754j.b b() {
            return this.f23475a;
        }
    }

    public C2759o(InterfaceC2758n interfaceC2758n, boolean z10) {
        this.f23466b = z10;
        this.f23467c = new C5521a();
        AbstractC2754j.b bVar = AbstractC2754j.b.INITIALIZED;
        this.f23468d = bVar;
        this.f23473i = new ArrayList();
        this.f23469e = new WeakReference(interfaceC2758n);
        this.f23474j = Ud.G.a(bVar);
    }

    @Override // androidx.lifecycle.AbstractC2754j
    public void a(InterfaceC2757m observer) {
        InterfaceC2758n interfaceC2758n;
        AbstractC4862t.e(observer, "observer");
        f("addObserver");
        AbstractC2754j.b bVar = this.f23468d;
        AbstractC2754j.b bVar2 = AbstractC2754j.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC2754j.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (((b) this.f23467c.k(observer, bVar3)) == null && (interfaceC2758n = (InterfaceC2758n) this.f23469e.get()) != null) {
            boolean z10 = this.f23470f != 0 || this.f23471g;
            AbstractC2754j.b bVarE = e(observer);
            this.f23470f++;
            while (bVar3.b().compareTo(bVarE) < 0 && this.f23467c.contains(observer)) {
                l(bVar3.b());
                AbstractC2754j.a aVarB = AbstractC2754j.a.Companion.b(bVar3.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(interfaceC2758n, aVarB);
                k();
                bVarE = e(observer);
            }
            if (!z10) {
                n();
            }
            this.f23470f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC2754j
    public AbstractC2754j.b b() {
        return this.f23468d;
    }

    @Override // androidx.lifecycle.AbstractC2754j
    public void c(InterfaceC2757m observer) {
        AbstractC4862t.e(observer, "observer");
        f("removeObserver");
        this.f23467c.l(observer);
    }

    public final void d(InterfaceC2758n interfaceC2758n) {
        Iterator itDescendingIterator = this.f23467c.descendingIterator();
        AbstractC4862t.d(itDescendingIterator, "descendingIterator(...)");
        while (itDescendingIterator.hasNext() && !this.f23472h) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            AbstractC4862t.b(entry);
            InterfaceC2757m interfaceC2757m = (InterfaceC2757m) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f23468d) > 0 && !this.f23472h && this.f23467c.contains(interfaceC2757m)) {
                AbstractC2754j.a aVarA = AbstractC2754j.a.Companion.a(bVar.b());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                l(aVarA.j());
                bVar.a(interfaceC2758n, aVarA);
                k();
            }
        }
    }

    public final AbstractC2754j.b e(InterfaceC2757m interfaceC2757m) {
        b bVar;
        Map.Entry entryN = this.f23467c.n(interfaceC2757m);
        AbstractC2754j.b bVar2 = null;
        AbstractC2754j.b bVarB = (entryN == null || (bVar = (b) entryN.getValue()) == null) ? null : bVar.b();
        if (!this.f23473i.isEmpty()) {
            bVar2 = (AbstractC2754j.b) this.f23473i.get(r0.size() - 1);
        }
        a aVar = f23465k;
        return aVar.a(aVar.a(this.f23468d, bVarB), bVar2);
    }

    public final void f(String str) {
        if (!this.f23466b || AbstractC2761q.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    public final void g(InterfaceC2758n interfaceC2758n) {
        C5522b.d dVarE = this.f23467c.e();
        AbstractC4862t.d(dVarE, "iteratorWithAdditions(...)");
        while (dVarE.hasNext() && !this.f23472h) {
            Map.Entry entry = (Map.Entry) dVarE.next();
            InterfaceC2757m interfaceC2757m = (InterfaceC2757m) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f23468d) < 0 && !this.f23472h && this.f23467c.contains(interfaceC2757m)) {
                l(bVar.b());
                AbstractC2754j.a aVarB = AbstractC2754j.a.Companion.b(bVar.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(interfaceC2758n, aVarB);
                k();
            }
        }
    }

    public void h(AbstractC2754j.a event) {
        AbstractC4862t.e(event, "event");
        f("handleLifecycleEvent");
        j(event.j());
    }

    public final boolean i() {
        if (this.f23467c.size() == 0) {
            return true;
        }
        Map.Entry entryC = this.f23467c.c();
        AbstractC4862t.b(entryC);
        AbstractC2754j.b bVarB = ((b) entryC.getValue()).b();
        Map.Entry entryF = this.f23467c.f();
        AbstractC4862t.b(entryF);
        AbstractC2754j.b bVarB2 = ((b) entryF.getValue()).b();
        return bVarB == bVarB2 && this.f23468d == bVarB2;
    }

    public final void j(AbstractC2754j.b bVar) {
        if (this.f23468d == bVar) {
            return;
        }
        AbstractC2760p.a((InterfaceC2758n) this.f23469e.get(), this.f23468d, bVar);
        this.f23468d = bVar;
        if (this.f23471g || this.f23470f != 0) {
            this.f23472h = true;
            return;
        }
        this.f23471g = true;
        n();
        this.f23471g = false;
        if (this.f23468d == AbstractC2754j.b.DESTROYED) {
            this.f23467c = new C5521a();
        }
    }

    public final void k() {
        this.f23473i.remove(r1.size() - 1);
    }

    public final void l(AbstractC2754j.b bVar) {
        this.f23473i.add(bVar);
    }

    public void m(AbstractC2754j.b state) {
        AbstractC4862t.e(state, "state");
        f("setCurrentState");
        j(state);
    }

    public final void n() {
        InterfaceC2758n interfaceC2758n = (InterfaceC2758n) this.f23469e.get();
        if (interfaceC2758n == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!i()) {
            this.f23472h = false;
            AbstractC2754j.b bVar = this.f23468d;
            Map.Entry entryC = this.f23467c.c();
            AbstractC4862t.b(entryC);
            if (bVar.compareTo(((b) entryC.getValue()).b()) < 0) {
                d(interfaceC2758n);
            }
            Map.Entry entryF = this.f23467c.f();
            if (!this.f23472h && entryF != null && this.f23468d.compareTo(((b) entryF.getValue()).b()) > 0) {
                g(interfaceC2758n);
            }
        }
        this.f23472h = false;
        this.f23474j.setValue(b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2759o(InterfaceC2758n provider) {
        this(provider, true);
        AbstractC4862t.e(provider, "provider");
    }
}
