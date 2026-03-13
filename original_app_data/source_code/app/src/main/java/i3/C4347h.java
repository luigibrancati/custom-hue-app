package i3;

import android.os.Bundle;
import fc.C4015H;
import i3.C4347h;
import j3.C4680b;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: i3.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4347h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f37074c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4680b f37075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4345f f37076b;

    /* JADX INFO: renamed from: i3.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static final C4015H c(InterfaceC4348i interfaceC4348i) {
            interfaceC4348i.getLifecycle().a(new C4341b(interfaceC4348i));
            return C4015H.f34254a;
        }

        public final C4347h b(final InterfaceC4348i owner) {
            AbstractC4862t.e(owner, "owner");
            return new C4347h(new C4680b(owner, new InterfaceC6082a() { // from class: i3.g
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return C4347h.a.c(owner);
                }
            }), null);
        }

        public a() {
        }
    }

    public /* synthetic */ C4347h(C4680b c4680b, AbstractC4854k abstractC4854k) {
        this(c4680b);
    }

    public static final C4347h a(InterfaceC4348i interfaceC4348i) {
        return f37074c.b(interfaceC4348i);
    }

    public final C4345f b() {
        return this.f37076b;
    }

    public final void c() {
        this.f37075a.f();
    }

    public final void d(Bundle bundle) {
        this.f37075a.h(bundle);
    }

    public final void e(Bundle outBundle) {
        AbstractC4862t.e(outBundle, "outBundle");
        this.f37075a.i(outBundle);
    }

    public C4347h(C4680b c4680b) {
        this.f37075a = c4680b;
        this.f37076b = new C4345f(c4680b);
    }
}
