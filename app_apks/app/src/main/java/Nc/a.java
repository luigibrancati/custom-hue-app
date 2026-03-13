package Nc;

import Lc.InterfaceC1177e;
import gc.C4206t;
import java.util.Collection;
import kd.f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: Nc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0154a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0154a f10626a = new C0154a();

        @Override // Nc.a
        public Collection b(f name, InterfaceC1177e classDescriptor) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(classDescriptor, "classDescriptor");
            return C4206t.k();
        }

        @Override // Nc.a
        public Collection c(InterfaceC1177e classDescriptor) {
            AbstractC4862t.e(classDescriptor, "classDescriptor");
            return C4206t.k();
        }

        @Override // Nc.a
        public Collection d(InterfaceC1177e classDescriptor) {
            AbstractC4862t.e(classDescriptor, "classDescriptor");
            return C4206t.k();
        }

        @Override // Nc.a
        public Collection e(InterfaceC1177e classDescriptor) {
            AbstractC4862t.e(classDescriptor, "classDescriptor");
            return C4206t.k();
        }
    }

    Collection b(f fVar, InterfaceC1177e interfaceC1177e);

    Collection c(InterfaceC1177e interfaceC1177e);

    Collection d(InterfaceC1177e interfaceC1177e);

    Collection e(InterfaceC1177e interfaceC1177e);
}
