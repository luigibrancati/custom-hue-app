package Db;

import java.util.List;

/* JADX INFO: renamed from: Db.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC0767n extends InterfaceC0775w {

    /* JADX INFO: renamed from: Db.n$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC0768o {
        @Override // Db.AbstractC0768o
        public /* bridge */ /* synthetic */ InterfaceC0767n E() {
            return super.E();
        }
    }

    static a builder() {
        return new a();
    }

    default boolean a() {
        return false;
    }

    default long b() {
        return 0L;
    }

    default long c() {
        return 0L;
    }

    default boolean d() {
        return true;
    }

    List e();
}
