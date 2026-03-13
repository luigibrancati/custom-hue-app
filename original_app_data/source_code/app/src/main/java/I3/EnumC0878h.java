package I3;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: I3.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0878h implements Executor {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ EnumC0878h[] $VALUES;
    public static final EnumC0878h INSTANCE = new EnumC0878h("INSTANCE", 0);

    static {
        EnumC0878h[] enumC0878hArrA = a();
        $VALUES = enumC0878hArrA;
        $ENTRIES = AbstractC5277b.a(enumC0878hArrA);
    }

    public EnumC0878h(String str, int i10) {
    }

    public static final /* synthetic */ EnumC0878h[] a() {
        return new EnumC0878h[]{INSTANCE};
    }

    public static EnumC0878h valueOf(String str) {
        return (EnumC0878h) Enum.valueOf(EnumC0878h.class, str);
    }

    public static EnumC0878h[] values() {
        return (EnumC0878h[]) $VALUES.clone();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        AbstractC4862t.e(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
