package Y0;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.InterfaceC2756l;
import androidx.lifecycle.InterfaceC2758n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: Y0.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C2561o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f19658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f19659b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f19660c = new HashMap();

    /* JADX INFO: renamed from: Y0.o$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC2754j f19661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC2756l f19662b;

        public a(AbstractC2754j abstractC2754j, InterfaceC2756l interfaceC2756l) {
            this.f19661a = abstractC2754j;
            this.f19662b = interfaceC2756l;
            abstractC2754j.a(interfaceC2756l);
        }

        public void a() {
            this.f19661a.c(this.f19662b);
            this.f19662b = null;
        }
    }

    public C2561o(Runnable runnable) {
        this.f19658a = runnable;
    }

    public static /* synthetic */ void a(C2561o c2561o, AbstractC2754j.b bVar, InterfaceC2563q interfaceC2563q, InterfaceC2758n interfaceC2758n, AbstractC2754j.a aVar) {
        c2561o.getClass();
        if (aVar == AbstractC2754j.a.p(bVar)) {
            c2561o.c(interfaceC2563q);
            return;
        }
        if (aVar == AbstractC2754j.a.ON_DESTROY) {
            c2561o.j(interfaceC2563q);
        } else if (aVar == AbstractC2754j.a.b(bVar)) {
            c2561o.f19659b.remove(interfaceC2563q);
            c2561o.f19658a.run();
        }
    }

    public static /* synthetic */ void b(C2561o c2561o, InterfaceC2563q interfaceC2563q, InterfaceC2758n interfaceC2758n, AbstractC2754j.a aVar) {
        c2561o.getClass();
        if (aVar == AbstractC2754j.a.ON_DESTROY) {
            c2561o.j(interfaceC2563q);
        }
    }

    public void c(InterfaceC2563q interfaceC2563q) {
        this.f19659b.add(interfaceC2563q);
        this.f19658a.run();
    }

    public void d(final InterfaceC2563q interfaceC2563q, InterfaceC2758n interfaceC2758n) {
        c(interfaceC2563q);
        AbstractC2754j lifecycle = interfaceC2758n.getLifecycle();
        a aVar = (a) this.f19660c.remove(interfaceC2563q);
        if (aVar != null) {
            aVar.a();
        }
        this.f19660c.put(interfaceC2563q, new a(lifecycle, new InterfaceC2756l() { // from class: Y0.n
            @Override // androidx.lifecycle.InterfaceC2756l
            public final void d(InterfaceC2758n interfaceC2758n2, AbstractC2754j.a aVar2) {
                C2561o.b(this.f19656a, interfaceC2563q, interfaceC2758n2, aVar2);
            }
        }));
    }

    public void e(final InterfaceC2563q interfaceC2563q, InterfaceC2758n interfaceC2758n, final AbstractC2754j.b bVar) {
        AbstractC2754j lifecycle = interfaceC2758n.getLifecycle();
        a aVar = (a) this.f19660c.remove(interfaceC2563q);
        if (aVar != null) {
            aVar.a();
        }
        this.f19660c.put(interfaceC2563q, new a(lifecycle, new InterfaceC2756l() { // from class: Y0.m
            @Override // androidx.lifecycle.InterfaceC2756l
            public final void d(InterfaceC2758n interfaceC2758n2, AbstractC2754j.a aVar2) {
                C2561o.a(this.f19653a, bVar, interfaceC2563q, interfaceC2758n2, aVar2);
            }
        }));
    }

    public void f(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f19659b.iterator();
        while (it.hasNext()) {
            ((InterfaceC2563q) it.next()).d(menu, menuInflater);
        }
    }

    public void g(Menu menu) {
        Iterator it = this.f19659b.iterator();
        while (it.hasNext()) {
            ((InterfaceC2563q) it.next()).a(menu);
        }
    }

    public boolean h(MenuItem menuItem) {
        Iterator it = this.f19659b.iterator();
        while (it.hasNext()) {
            if (((InterfaceC2563q) it.next()).c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i(Menu menu) {
        Iterator it = this.f19659b.iterator();
        while (it.hasNext()) {
            ((InterfaceC2563q) it.next()).b(menu);
        }
    }

    public void j(InterfaceC2563q interfaceC2563q) {
        this.f19659b.remove(interfaceC2563q);
        a aVar = (a) this.f19660c.remove(interfaceC2563q);
        if (aVar != null) {
            aVar.a();
        }
        this.f19658a.run();
    }
}
