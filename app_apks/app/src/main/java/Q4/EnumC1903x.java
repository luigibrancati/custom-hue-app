package Q4;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Q4.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1903x {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ EnumC1903x[] $VALUES;
    private final String typeString;
    public static final EnumC1903x general = new EnumC1903x("general", 0, "TaskException");
    public static final EnumC1903x fileSystem = new EnumC1903x("fileSystem", 1, "TaskFileSystemException");
    public static final EnumC1903x url = new EnumC1903x("url", 2, "TaskUrlException");
    public static final EnumC1903x connection = new EnumC1903x("connection", 3, "TaskConnectionException");
    public static final EnumC1903x resume = new EnumC1903x("resume", 4, "TaskResumeException");
    public static final EnumC1903x httpResponse = new EnumC1903x("httpResponse", 5, "TaskHttpException");

    static {
        EnumC1903x[] enumC1903xArrA = a();
        $VALUES = enumC1903xArrA;
        $ENTRIES = AbstractC5277b.a(enumC1903xArrA);
    }

    public EnumC1903x(String str, int i10, String str2) {
        this.typeString = str2;
    }

    public static final /* synthetic */ EnumC1903x[] a() {
        return new EnumC1903x[]{general, fileSystem, url, connection, resume, httpResponse};
    }

    public static EnumC1903x valueOf(String str) {
        return (EnumC1903x) Enum.valueOf(EnumC1903x.class, str);
    }

    public static EnumC1903x[] values() {
        return (EnumC1903x[]) $VALUES.clone();
    }

    public final String b() {
        return this.typeString;
    }
}
