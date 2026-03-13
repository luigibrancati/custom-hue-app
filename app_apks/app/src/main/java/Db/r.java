package Db;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum r {
    AUDIO,
    VIDEO,
    SUBTITLES,
    CLOSED_CAPTIONS;

    private static final String CLOSED_CAPTIONS_STRING = "CLOSED-CAPTIONS";

    public static r b(String str) {
        return CLOSED_CAPTIONS_STRING.equals(str) ? CLOSED_CAPTIONS : valueOf(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this == CLOSED_CAPTIONS ? CLOSED_CAPTIONS_STRING : super.toString();
    }
}
