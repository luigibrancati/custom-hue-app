package C3;

import C3.n;
import Ud.InterfaceC2313e;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;
import fc.C4029l;
import fc.InterfaceC4028k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import vc.InterfaceC6082a;
import y3.AbstractC6395e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1127a = a.f1128a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f1129b = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f1128a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f1130c = M.b(n.class).l();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final InterfaceC4028k f1131d = C4029l.b(new InterfaceC6082a() { // from class: C3.m
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return n.a.b();
            }
        });

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static o f1132e = b.f1100a;

        public static final D3.a b() {
            WindowLayoutComponent windowLayoutComponentL;
            try {
                ClassLoader classLoader = n.class.getClassLoader();
                l lVar = classLoader != null ? new l(classLoader, new z3.d(classLoader)) : null;
                if (lVar == null || (windowLayoutComponentL = lVar.l()) == null) {
                    return null;
                }
                return E3.a.f3246a.a(windowLayoutComponentL, new z3.d(classLoader));
            } catch (Throwable unused) {
                if (f1129b) {
                    Log.d(f1130c, "Failed to load WindowExtensions");
                }
                return null;
            }
        }

        public final D3.a c() {
            return (D3.a) f1131d.getValue();
        }

        public final n d(Context context) {
            AbstractC4862t.e(context, "context");
            D3.a aVarC = c();
            if (aVarC == null) {
                aVarC = androidx.window.layout.adapter.sidecar.b.f24694c.a(context);
            }
            return f1132e.a(new r(new w(null, 1, 0 == true ? 1 : 0), aVarC, AbstractC6395e.f48383b.a()));
        }
    }

    InterfaceC2313e a(Activity activity);
}
