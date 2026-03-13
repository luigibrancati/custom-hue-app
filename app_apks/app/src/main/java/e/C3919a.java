package e;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: e.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3919a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f33518a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Context f33519b;

    public final void a(InterfaceC3920b listener) {
        AbstractC4862t.e(listener, "listener");
        Context context = this.f33519b;
        if (context != null) {
            listener.a(context);
        }
        this.f33518a.add(listener);
    }

    public final void b() {
        this.f33519b = null;
    }

    public final void c(Context context) {
        AbstractC4862t.e(context, "context");
        this.f33519b = context;
        Iterator it = this.f33518a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3920b) it.next()).a(context);
        }
    }

    public final Context d() {
        return this.f33519b;
    }

    public final void e(InterfaceC3920b listener) {
        AbstractC4862t.e(listener, "listener");
        this.f33518a.remove(listener);
    }
}
