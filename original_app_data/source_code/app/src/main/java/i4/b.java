package i4;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public enum b {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);

    private final boolean readEnabled;
    private final boolean writeEnabled;

    b(boolean z10, boolean z11) {
        this.readEnabled = z10;
        this.writeEnabled = z11;
    }

    public final boolean b() {
        return this.readEnabled;
    }

    public final boolean j() {
        return this.writeEnabled;
    }
}
