package B7;

/* JADX INFO: renamed from: B7.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0714w extends RuntimeException {
    public C0714w(String str) {
        super(str);
    }

    public C0714w(String str, Throwable th) {
        super("Failed to initialize FileStorage", th);
    }
}
