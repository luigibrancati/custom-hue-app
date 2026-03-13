package tb;

import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import com.google.android.filament.utils.IBLPrefilterContext;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4029l;
import fc.C4035r;
import fc.InterfaceC4028k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: tb.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5876e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4028k f44914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4028k f44915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f44916c;

    public C5876e(final Engine engine) {
        AbstractC4862t.e(engine, "engine");
        this.f44914a = C4029l.b(new InterfaceC6082a() { // from class: tb.b
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C5876e.d(engine);
            }
        });
        this.f44915b = C4029l.b(new InterfaceC6082a() { // from class: tb.c
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C5876e.f(this.f44912a);
            }
        });
        this.f44916c = C4029l.b(new InterfaceC6082a() { // from class: tb.d
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C5876e.k(this.f44913a);
            }
        });
    }

    public static final IBLPrefilterContext d(Engine engine) {
        return new IBLPrefilterContext(engine);
    }

    public static final IBLPrefilterContext.EquirectangularToCubemap f(C5876e c5876e) {
        return new IBLPrefilterContext.EquirectangularToCubemap(c5876e.g());
    }

    public static final IBLPrefilterContext.SpecularFilter k(C5876e c5876e) {
        return new IBLPrefilterContext.SpecularFilter(c5876e.g());
    }

    public final void e() {
        try {
            C4035r.a aVar = C4035r.f34274b;
            i().destroy();
            C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            C4035r.b(AbstractC4036s.a(th));
        }
        try {
            h().destroy();
            C4035r.b(C4015H.f34254a);
        } catch (Throwable th2) {
            C4035r.a aVar3 = C4035r.f34274b;
            C4035r.b(AbstractC4036s.a(th2));
        }
        try {
            g().destroy();
            C4035r.b(C4015H.f34254a);
        } catch (Throwable th3) {
            C4035r.a aVar4 = C4035r.f34274b;
            C4035r.b(AbstractC4036s.a(th3));
        }
    }

    public final IBLPrefilterContext g() {
        return (IBLPrefilterContext) this.f44914a.getValue();
    }

    public final IBLPrefilterContext.EquirectangularToCubemap h() {
        return (IBLPrefilterContext.EquirectangularToCubemap) this.f44915b.getValue();
    }

    public final IBLPrefilterContext.SpecularFilter i() {
        return (IBLPrefilterContext.SpecularFilter) this.f44916c.getValue();
    }

    public final Texture j(Texture skybox) {
        AbstractC4862t.e(skybox, "skybox");
        return i().run(skybox);
    }
}
