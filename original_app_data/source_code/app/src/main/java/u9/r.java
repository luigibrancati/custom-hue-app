package u9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r {
    private static final /* synthetic */ r[] $VALUES;
    public static final r DEFAULT;
    public static final r STRING;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a extends r {
        public a(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        r rVar = new r("STRING", 1) { // from class: u9.r.b
            {
                a aVar2 = null;
            }
        };
        STRING = rVar;
        $VALUES = new r[]{aVar, rVar};
    }

    public r(String str, int i10) {
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public /* synthetic */ r(String str, int i10, a aVar) {
        this(str, i10);
    }
}
