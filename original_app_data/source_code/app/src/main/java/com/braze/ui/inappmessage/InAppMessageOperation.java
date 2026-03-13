package com.braze.ui.inappmessage;

import androidx.annotation.Keep;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageOperation;", "", "<init>", "(Ljava/lang/String;I)V", "DISPLAY_NOW", "DISPLAY_LATER", "DISCARD", "REENQUEUE", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InAppMessageOperation {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ InAppMessageOperation[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final InAppMessageOperation DISPLAY_NOW = new InAppMessageOperation("DISPLAY_NOW", 0);
    public static final InAppMessageOperation DISPLAY_LATER = new InAppMessageOperation("DISPLAY_LATER", 1);
    public static final InAppMessageOperation DISCARD = new InAppMessageOperation("DISCARD", 2);
    public static final InAppMessageOperation REENQUEUE = new InAppMessageOperation("REENQUEUE", 3);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageOperation$Companion;", "", "<init>", "()V", "fromValue", "Lcom/braze/ui/inappmessage/InAppMessageOperation;", "value", "", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final InAppMessageOperation fromValue(String value) {
            Object upperCase;
            Iterator<E> it = InAppMessageOperation.getEntries().iterator();
            while (true) {
                upperCase = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String strName = ((InAppMessageOperation) next).name();
                if (value != null) {
                    Locale US = Locale.US;
                    AbstractC4862t.d(US, "US");
                    upperCase = value.toUpperCase(US);
                    AbstractC4862t.d(upperCase, "toUpperCase(...)");
                }
                if (AbstractC4862t.a(strName, upperCase)) {
                    upperCase = next;
                    break;
                }
            }
            return (InAppMessageOperation) upperCase;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ InAppMessageOperation[] $values() {
        return new InAppMessageOperation[]{DISPLAY_NOW, DISPLAY_LATER, DISCARD, REENQUEUE};
    }

    static {
        InAppMessageOperation[] inAppMessageOperationArr$values = $values();
        $VALUES = inAppMessageOperationArr$values;
        $ENTRIES = AbstractC5277b.a(inAppMessageOperationArr$values);
        INSTANCE = new Companion(null);
    }

    private InAppMessageOperation(String str, int i10) {
    }

    public static InterfaceC5276a getEntries() {
        return $ENTRIES;
    }

    public static InAppMessageOperation valueOf(String str) {
        return (InAppMessageOperation) Enum.valueOf(InAppMessageOperation.class, str);
    }

    public static InAppMessageOperation[] values() {
        return (InAppMessageOperation[]) $VALUES.clone();
    }
}
