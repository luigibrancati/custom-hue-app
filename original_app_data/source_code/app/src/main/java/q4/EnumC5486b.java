package q4;

import gc.U;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: q4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5486b {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ EnumC5486b[] $VALUES;
    private static final Set<EnumC5486b> ALL;
    public static final EnumC5486b APP_LIFECYCLES;
    public static final a Companion;
    public static final EnumC5486b DEEP_LINKS;
    public static final EnumC5486b ELEMENT_INTERACTIONS;
    public static final EnumC5486b FRUSTRATION_INTERACTIONS;
    private static final Set<EnumC5486b> REQUIRES_ACTIVITY_CALLBACKS;
    public static final EnumC5486b SCREEN_VIEWS;
    public static final EnumC5486b SESSIONS;

    /* JADX INFO: renamed from: q4.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Set a() {
            return EnumC5486b.REQUIRES_ACTIVITY_CALLBACKS;
        }

        public a() {
        }
    }

    static {
        EnumC5486b enumC5486b = new EnumC5486b("SESSIONS", 0);
        SESSIONS = enumC5486b;
        EnumC5486b enumC5486b2 = new EnumC5486b("APP_LIFECYCLES", 1);
        APP_LIFECYCLES = enumC5486b2;
        EnumC5486b enumC5486b3 = new EnumC5486b("DEEP_LINKS", 2);
        DEEP_LINKS = enumC5486b3;
        EnumC5486b enumC5486b4 = new EnumC5486b("SCREEN_VIEWS", 3);
        SCREEN_VIEWS = enumC5486b4;
        EnumC5486b enumC5486b5 = new EnumC5486b("ELEMENT_INTERACTIONS", 4);
        ELEMENT_INTERACTIONS = enumC5486b5;
        EnumC5486b enumC5486b6 = new EnumC5486b("FRUSTRATION_INTERACTIONS", 5);
        FRUSTRATION_INTERACTIONS = enumC5486b6;
        EnumC5486b[] enumC5486bArrA = a();
        $VALUES = enumC5486bArrA;
        $ENTRIES = AbstractC5277b.a(enumC5486bArrA);
        Companion = new a(null);
        ALL = U.h(enumC5486b, enumC5486b2, enumC5486b3, enumC5486b4, enumC5486b5, enumC5486b6);
        REQUIRES_ACTIVITY_CALLBACKS = U.h(enumC5486b2, enumC5486b4, enumC5486b5, enumC5486b3);
    }

    public EnumC5486b(String str, int i10) {
    }

    public static final /* synthetic */ EnumC5486b[] a() {
        return new EnumC5486b[]{SESSIONS, APP_LIFECYCLES, DEEP_LINKS, SCREEN_VIEWS, ELEMENT_INTERACTIONS, FRUSTRATION_INTERACTIONS};
    }

    public static EnumC5486b valueOf(String str) {
        return (EnumC5486b) Enum.valueOf(EnumC5486b.class, str);
    }

    public static EnumC5486b[] values() {
        return (EnumC5486b[]) $VALUES.clone();
    }
}
