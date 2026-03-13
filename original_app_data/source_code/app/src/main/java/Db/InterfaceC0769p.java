package Db;

import java.util.Optional;

/* JADX INFO: renamed from: Db.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC0769p {

    /* JADX INFO: renamed from: Db.p$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC0770q {
        @Override // Db.AbstractC0770q
        public /* bridge */ /* synthetic */ InterfaceC0769p v() {
            return super.v();
        }
    }

    static a builder() {
        return new a();
    }

    String a();

    default boolean b() {
        return false;
    }

    default boolean c() {
        return false;
    }

    Optional d();

    double e();

    default boolean f() {
        return false;
    }
}
