package Nc;

import Lc.InterfaceC1177e;
import Lc.Z;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10627a = new a();

        @Override // Nc.c
        public boolean a(InterfaceC1177e classDescriptor, Z functionDescriptor) {
            AbstractC4862t.e(classDescriptor, "classDescriptor");
            AbstractC4862t.e(functionDescriptor, "functionDescriptor");
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f10628a = new b();

        @Override // Nc.c
        public boolean a(InterfaceC1177e classDescriptor, Z functionDescriptor) {
            AbstractC4862t.e(classDescriptor, "classDescriptor");
            AbstractC4862t.e(functionDescriptor, "functionDescriptor");
            return !functionDescriptor.getAnnotations().K(d.a());
        }
    }

    boolean a(InterfaceC1177e interfaceC1177e, Z z10);
}
