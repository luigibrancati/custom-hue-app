package androidx.camera.camera2;

import E.C0803n0;
import E.C0817v;
import E.C0821x;
import E.G;
import L.AbstractC1087a0;
import L.G;
import L.H;
import L.t1;
import P.m;
import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import java.util.Set;
import x.C6272x;
import x.J0;
import x.P0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class Camera2Config {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class DefaultProvider implements G.b {
        @Override // E.G.b
        public G getCameraXConfig() {
            return Camera2Config.c();
        }
    }

    public static /* synthetic */ t1 a(Context context) {
        return new P0(context);
    }

    public static /* synthetic */ L.G b(Context context, Object obj, Set set) throws C0803n0 {
        try {
            return new J0(context, obj, set);
        } catch (C0821x e10) {
            throw new C0803n0(e10);
        }
    }

    public static G c() {
        H.a aVar = new H.a() { // from class: v.a
            @Override // L.H.a
            public final H a(Context context, AbstractC1087a0 abstractC1087a0, C0817v c0817v, long j10, G g10, m mVar) {
                return new C6272x(context, abstractC1087a0, c0817v, j10, g10, mVar);
            }
        };
        G.a aVar2 = new G.a() { // from class: v.b
            @Override // L.G.a
            public final L.G a(Context context, Object obj, Set set) {
                return Camera2Config.b(context, obj, set);
            }
        };
        return new G.a().d(aVar).f(aVar2).k(new t1.c() { // from class: v.c
            @Override // L.t1.c
            public final t1 a(Context context) {
                return Camera2Config.a(context);
            }
        }).e(0).h(true).a();
    }
}
