package X6;

/* JADX INFO: renamed from: X6.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2444n {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzk;

    EnumC2444n(char c10) {
        this.zzk = c10;
    }

    public static EnumC2444n a(char c10) {
        for (EnumC2444n enumC2444n : values()) {
            if (enumC2444n.zzk == c10) {
                return enumC2444n;
            }
        }
        return UNSET;
    }

    public final /* synthetic */ char b() {
        return this.zzk;
    }
}
