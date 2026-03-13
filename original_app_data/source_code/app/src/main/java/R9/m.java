package R9;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import o8.C5233c;
import o8.InterfaceC5234d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C5233c f14994b = C5233c.c(m.class).b(o8.q.k(C2111i.class)).b(o8.q.k(Context.class)).f(new o8.g() { // from class: R9.E
        @Override // o8.g
        public final Object a(InterfaceC5234d interfaceC5234d) {
            return new m((Context) interfaceC5234d.get(Context.class));
        }
    }).d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14995a;

    public m(Context context) {
        this.f14995a = context;
    }

    public synchronized String a() {
        String string = b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        b().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    public final SharedPreferences b() {
        return this.f14995a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
