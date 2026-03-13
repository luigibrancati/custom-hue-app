package E3;

import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements D3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0046a f3246a = new C0046a(null);

    /* JADX INFO: renamed from: E3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0046a {
        public /* synthetic */ C0046a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final D3.a a(WindowLayoutComponent component, z3.d adapter) {
            AbstractC4862t.e(component, "component");
            AbstractC4862t.e(adapter, "adapter");
            int iA = z3.e.f48718a.a();
            return iA >= 9 ? new g(component, adapter) : iA >= 6 ? new f(component, adapter) : iA >= 2 ? new e(component, adapter) : iA == 1 ? new d(component, adapter) : new c();
        }

        public C0046a() {
        }
    }
}
