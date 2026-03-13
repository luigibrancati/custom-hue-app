package j1;

import Rd.M;
import android.content.Context;
import g1.InterfaceC4099i;
import h1.C4268b;
import java.io.File;
import java.util.List;
import k1.C4784g;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import vc.l;
import yc.InterfaceC6461c;

/* JADX INFO: renamed from: j1.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4673e implements InterfaceC6461c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4268b f38927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f38928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M f38929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f38930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile InterfaceC4099i f38931f;

    public C4673e(String name, C4268b c4268b, l produceMigrations, M scope) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(produceMigrations, "produceMigrations");
        AbstractC4862t.e(scope, "scope");
        this.f38926a = name;
        this.f38927b = c4268b;
        this.f38928c = produceMigrations;
        this.f38929d = scope;
        this.f38930e = new Object();
    }

    public static final File c(Context context, C4673e c4673e) {
        AbstractC4862t.b(context);
        return AbstractC4671c.a(context, c4673e.f38926a);
    }

    @Override // yc.InterfaceC6461c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC4099i getValue(Context thisRef, Cc.l property) {
        InterfaceC4099i interfaceC4099i;
        AbstractC4862t.e(thisRef, "thisRef");
        AbstractC4862t.e(property, "property");
        InterfaceC4099i interfaceC4099i2 = this.f38931f;
        if (interfaceC4099i2 != null) {
            return interfaceC4099i2;
        }
        synchronized (this.f38930e) {
            try {
                if (this.f38931f == null) {
                    final Context applicationContext = thisRef.getApplicationContext();
                    C4784g c4784g = C4784g.f39197a;
                    C4268b c4268b = this.f38927b;
                    l lVar = this.f38928c;
                    AbstractC4862t.b(applicationContext);
                    this.f38931f = c4784g.c(c4268b, (List) lVar.invoke(applicationContext), this.f38929d, new InterfaceC6082a() { // from class: j1.d
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return C4673e.c(applicationContext, this);
                        }
                    });
                }
                interfaceC4099i = this.f38931f;
                AbstractC4862t.b(interfaceC4099i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4099i;
    }
}
