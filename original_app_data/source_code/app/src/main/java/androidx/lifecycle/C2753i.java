package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC2754j;
import i3.C4345f;
import i3.InterfaceC4348i;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: androidx.lifecycle.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2753i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2753i f23457a = new C2753i();

    /* JADX INFO: renamed from: androidx.lifecycle.i$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements C4345f.a {
        @Override // i3.C4345f.a
        public void a(InterfaceC4348i owner) {
            AbstractC4862t.e(owner, "owner");
            if (!(owner instanceof Q)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
            }
            P viewModelStore = ((Q) owner).getViewModelStore();
            C4345f savedStateRegistry = owner.getSavedStateRegistry();
            Iterator it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                N nB = viewModelStore.b((String) it.next());
                if (nB != null) {
                    C2753i.a(nB, savedStateRegistry, owner.getLifecycle());
                }
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.d(a.class);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.i$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC2756l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC2754j f23458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4345f f23459b;

        public b(AbstractC2754j abstractC2754j, C4345f c4345f) {
            this.f23458a = abstractC2754j;
            this.f23459b = c4345f;
        }

        @Override // androidx.lifecycle.InterfaceC2756l
        public void d(InterfaceC2758n source, AbstractC2754j.a event) {
            AbstractC4862t.e(source, "source");
            AbstractC4862t.e(event, "event");
            if (event == AbstractC2754j.a.ON_START) {
                this.f23458a.c(this);
                this.f23459b.d(a.class);
            }
        }
    }

    public static final void a(N viewModel, C4345f registry, AbstractC2754j lifecycle) {
        AbstractC4862t.e(viewModel, "viewModel");
        AbstractC4862t.e(registry, "registry");
        AbstractC4862t.e(lifecycle, "lifecycle");
        E e10 = (E) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (e10 == null || e10.c()) {
            return;
        }
        e10.a(registry, lifecycle);
        f23457a.c(registry, lifecycle);
    }

    public static final E b(C4345f registry, AbstractC2754j lifecycle, String str, Bundle bundle) {
        AbstractC4862t.e(registry, "registry");
        AbstractC4862t.e(lifecycle, "lifecycle");
        AbstractC4862t.b(str);
        E e10 = new E(str, C.f23390c.a(registry.a(str), bundle));
        e10.a(registry, lifecycle);
        f23457a.c(registry, lifecycle);
        return e10;
    }

    public final void c(C4345f c4345f, AbstractC2754j abstractC2754j) {
        AbstractC2754j.b bVarB = abstractC2754j.b();
        if (bVarB == AbstractC2754j.b.INITIALIZED || bVarB.b(AbstractC2754j.b.STARTED)) {
            c4345f.d(a.class);
        } else {
            abstractC2754j.a(new b(abstractC2754j, c4345f));
        }
    }
}
