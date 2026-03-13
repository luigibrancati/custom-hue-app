package u8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum I {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f45274id;

    I(int i10) {
        this.f45274id = i10;
    }

    public static I b(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int j() {
        return this.f45274id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f45274id);
    }
}
