package Yc;

import bd.InterfaceC2922n;
import bd.w;
import gc.C4206t;
import gc.U;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19892a = new a();

        @Override // Yc.b
        public Set a() {
            return U.d();
        }

        @Override // Yc.b
        public InterfaceC2922n b(kd.f name) {
            AbstractC4862t.e(name, "name");
            return null;
        }

        @Override // Yc.b
        public Set d() {
            return U.d();
        }

        @Override // Yc.b
        public Set e() {
            return U.d();
        }

        @Override // Yc.b
        public w f(kd.f name) {
            AbstractC4862t.e(name, "name");
            return null;
        }

        @Override // Yc.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public List c(kd.f name) {
            AbstractC4862t.e(name, "name");
            return C4206t.k();
        }
    }

    Set a();

    InterfaceC2922n b(kd.f fVar);

    Collection c(kd.f fVar);

    Set d();

    Set e();

    w f(kd.f fVar);
}
