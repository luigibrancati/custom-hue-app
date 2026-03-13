package X2;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import lc.InterfaceC4988e;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18097a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: X2.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0242a extends v implements l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f18098a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0242a(Context context) {
                super(1);
                this.f18098a = context;
            }

            @Override // vc.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(Context it) {
                AbstractC4862t.e(it, "it");
                return new c(this.f18098a);
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final b a(Context context) {
            AbstractC4862t.e(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            U2.a aVar = U2.a.f16592a;
            sb2.append(aVar.a());
            Log.d("MeasurementManager", sb2.toString());
            if (aVar.a() >= 5) {
                return new f(context);
            }
            if (aVar.b() >= 9) {
                return (b) U2.b.f16595a.a(context, "MeasurementManager", new C0242a(context));
            }
            return null;
        }

        public a() {
        }
    }

    public abstract Object a(X2.a aVar, InterfaceC4988e interfaceC4988e);

    public abstract Object b(InterfaceC4988e interfaceC4988e);

    public abstract Object c(i iVar, InterfaceC4988e interfaceC4988e);

    public abstract Object d(Uri uri, InputEvent inputEvent, InterfaceC4988e interfaceC4988e);

    public abstract Object e(Uri uri, InterfaceC4988e interfaceC4988e);

    public abstract Object f(j jVar, InterfaceC4988e interfaceC4988e);

    public abstract Object g(k kVar, InterfaceC4988e interfaceC4988e);
}
