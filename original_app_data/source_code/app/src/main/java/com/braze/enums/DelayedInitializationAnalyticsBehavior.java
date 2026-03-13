package com.braze.enums;

import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.support.BrazeLogger;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;
import vc.InterfaceC6082a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/braze/enums/DelayedInitializationAnalyticsBehavior;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DROP", "QUEUE", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DelayedInitializationAnalyticsBehavior {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ DelayedInitializationAnalyticsBehavior[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final DelayedInitializationAnalyticsBehavior DROP = new DelayedInitializationAnalyticsBehavior("DROP", 0, "DROP");
    public static final DelayedInitializationAnalyticsBehavior QUEUE = new DelayedInitializationAnalyticsBehavior("QUEUE", 1, "QUEUE");
    private final String value;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/braze/enums/DelayedInitializationAnalyticsBehavior$Companion;", "", "<init>", "()V", "fromString", "Lcom/braze/enums/DelayedInitializationAnalyticsBehavior;", "behavior", "", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String fromString$lambda$1(String str) {
            return "No DelayedInitializationAnalyticsBehavior with value " + str + ". Defaulting to QUEUE";
        }

        public final DelayedInitializationAnalyticsBehavior fromString(final String behavior) {
            if (behavior == null) {
                return DelayedInitializationAnalyticsBehavior.QUEUE;
            }
            Locale US = Locale.US;
            AbstractC4862t.d(US, "US");
            String upperCase = behavior.toUpperCase(US);
            AbstractC4862t.d(upperCase, "toUpperCase(...)");
            Iterator<E> it = DelayedInitializationAnalyticsBehavior.getEntries().iterator();
            Object obj = null;
            boolean z10 = false;
            Object obj2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (AbstractC4862t.a(((DelayedInitializationAnalyticsBehavior) next).getValue(), upperCase)) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        obj2 = next;
                    }
                } else if (z10) {
                    obj = obj2;
                }
            }
            DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior = (DelayedInitializationAnalyticsBehavior) obj;
            if (delayedInitializationAnalyticsBehavior != null) {
                return delayedInitializationAnalyticsBehavior;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: Y4.c
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DelayedInitializationAnalyticsBehavior.Companion.fromString$lambda$1(behavior);
                }
            }, 6, (Object) null);
            return DelayedInitializationAnalyticsBehavior.QUEUE;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ DelayedInitializationAnalyticsBehavior[] $values() {
        return new DelayedInitializationAnalyticsBehavior[]{DROP, QUEUE};
    }

    static {
        DelayedInitializationAnalyticsBehavior[] delayedInitializationAnalyticsBehaviorArr$values = $values();
        $VALUES = delayedInitializationAnalyticsBehaviorArr$values;
        $ENTRIES = AbstractC5277b.a(delayedInitializationAnalyticsBehaviorArr$values);
        INSTANCE = new Companion(null);
    }

    private DelayedInitializationAnalyticsBehavior(String str, int i10, String str2) {
        this.value = str2;
    }

    public static InterfaceC5276a getEntries() {
        return $ENTRIES;
    }

    public static DelayedInitializationAnalyticsBehavior valueOf(String str) {
        return (DelayedInitializationAnalyticsBehavior) Enum.valueOf(DelayedInitializationAnalyticsBehavior.class, str);
    }

    public static DelayedInitializationAnalyticsBehavior[] values() {
        return (DelayedInitializationAnalyticsBehavior[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
