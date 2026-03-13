package d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: d.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3785D {
    private boolean isEnabled;
    private final List<a> eventHandlers = new ArrayList();
    private final CopyOnWriteArrayList<AutoCloseable> closeables = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d.D$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends S2.e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AbstractC3785D f32713h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f32714i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC3785D onBackPressedCallback, S2.g info) {
            super(info, onBackPressedCallback.isEnabled());
            AbstractC4862t.e(onBackPressedCallback, "onBackPressedCallback");
            AbstractC4862t.e(info, "info");
            this.f32713h = onBackPressedCallback;
            this.f32714i = true;
        }

        public final void A(boolean z10) {
            this.f32714i = z10;
            x(z10 && this.f32713h.isEnabled());
        }

        @Override // S2.e
        public void o() {
            this.f32713h.handleOnBackCancelled();
        }

        @Override // S2.e
        public void p() {
            this.f32713h.handleOnBackPressed();
        }

        @Override // S2.e
        public void q(S2.b event) {
            AbstractC4862t.e(event, "event");
            this.f32713h.handleOnBackProgressed(new C3794b(event));
        }

        @Override // S2.e
        public void r(S2.b event) {
            AbstractC4862t.e(event, "event");
            this.f32713h.handleOnBackStarted(new C3794b(event));
        }

        public final boolean z() {
            return this.f32714i;
        }
    }

    public AbstractC3785D(boolean z10) {
        this.isEnabled = z10;
    }

    public final void addCloseable$activity(AutoCloseable closeable) {
        AbstractC4862t.e(closeable, "closeable");
        this.closeables.add(closeable);
    }

    public final a createNavigationEventHandler$activity(S2.g info) {
        AbstractC4862t.e(info, "info");
        a aVar = new a(this, info);
        this.eventHandlers.add(aVar);
        return aVar;
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(C3794b backEvent) {
        AbstractC4862t.e(backEvent, "backEvent");
    }

    public void handleOnBackStarted(C3794b backEvent) {
        AbstractC4862t.e(backEvent, "backEvent");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() throws Exception {
        Iterator<AutoCloseable> it = this.closeables.iterator();
        AbstractC4862t.d(it, "iterator(...)");
        while (it.hasNext()) {
            AbstractC3782A.a(it.next());
        }
        this.closeables.clear();
        Iterator<a> it2 = this.eventHandlers.iterator();
        while (it2.hasNext()) {
            it2.next().w();
        }
        this.eventHandlers.clear();
    }

    public final void removeCloseable$activity(AutoCloseable closeable) {
        AbstractC4862t.e(closeable, "closeable");
        this.closeables.remove(closeable);
    }

    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
        for (a aVar : this.eventHandlers) {
            aVar.x(aVar.z() && z10);
        }
    }

    public void handleOnBackCancelled() {
    }
}
