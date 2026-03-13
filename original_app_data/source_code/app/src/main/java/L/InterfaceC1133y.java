package L;

import M.h;
import android.hardware.camera2.CaptureResult;

/* JADX INFO: renamed from: L.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1133y {

    /* JADX INFO: renamed from: L.y$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC1133y {
        public static InterfaceC1133y k() {
            return new a();
        }

        @Override // L.InterfaceC1133y
        public EnumC1131x b() {
            return EnumC1131x.UNKNOWN;
        }

        @Override // L.InterfaceC1133y
        public k1 c() {
            return k1.b();
        }

        @Override // L.InterfaceC1133y
        public EnumC1127v d() {
            return EnumC1127v.UNKNOWN;
        }

        @Override // L.InterfaceC1133y
        public CaptureResult e() {
            return null;
        }

        @Override // L.InterfaceC1133y
        public r f() {
            return r.UNKNOWN;
        }

        @Override // L.InterfaceC1133y
        public EnumC1125u g() {
            return EnumC1125u.UNKNOWN;
        }

        @Override // L.InterfaceC1133y
        public long getTimestamp() {
            return -1L;
        }

        @Override // L.InterfaceC1133y
        public EnumC1129w h() {
            return EnumC1129w.UNKNOWN;
        }

        @Override // L.InterfaceC1133y
        public EnumC1123t i() {
            return EnumC1123t.UNKNOWN;
        }

        @Override // L.InterfaceC1133y
        public EnumC1121s j() {
            return EnumC1121s.UNKNOWN;
        }
    }

    default void a(h.b bVar) {
        bVar.g(b());
    }

    EnumC1131x b();

    k1 c();

    EnumC1127v d();

    default CaptureResult e() {
        return null;
    }

    r f();

    EnumC1125u g();

    long getTimestamp();

    EnumC1129w h();

    EnumC1123t i();

    EnumC1121s j();
}
