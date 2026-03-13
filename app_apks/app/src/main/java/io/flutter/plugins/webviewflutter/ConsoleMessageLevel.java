package io.flutter.plugins.webviewflutter;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lio/flutter/plugins/webviewflutter/ConsoleMessageLevel;", "", "raw", "", "<init>", "(Ljava/lang/String;II)V", "getRaw", "()I", "DEBUG", "ERROR", "LOG", "TIP", "WARNING", "UNKNOWN", "Companion", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsoleMessageLevel {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ ConsoleMessageLevel[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int raw;
    public static final ConsoleMessageLevel DEBUG = new ConsoleMessageLevel("DEBUG", 0, 0);
    public static final ConsoleMessageLevel ERROR = new ConsoleMessageLevel("ERROR", 1, 1);
    public static final ConsoleMessageLevel LOG = new ConsoleMessageLevel("LOG", 2, 2);
    public static final ConsoleMessageLevel TIP = new ConsoleMessageLevel("TIP", 3, 3);
    public static final ConsoleMessageLevel WARNING = new ConsoleMessageLevel("WARNING", 4, 4);
    public static final ConsoleMessageLevel UNKNOWN = new ConsoleMessageLevel("UNKNOWN", 5, 5);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/webviewflutter/ConsoleMessageLevel$Companion;", "", "<init>", "()V", "ofRaw", "Lio/flutter/plugins/webviewflutter/ConsoleMessageLevel;", "raw", "", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final ConsoleMessageLevel ofRaw(int raw) {
            for (ConsoleMessageLevel consoleMessageLevel : ConsoleMessageLevel.values()) {
                if (consoleMessageLevel.getRaw() == raw) {
                    return consoleMessageLevel;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ConsoleMessageLevel[] $values() {
        return new ConsoleMessageLevel[]{DEBUG, ERROR, LOG, TIP, WARNING, UNKNOWN};
    }

    static {
        ConsoleMessageLevel[] consoleMessageLevelArr$values = $values();
        $VALUES = consoleMessageLevelArr$values;
        $ENTRIES = AbstractC5277b.a(consoleMessageLevelArr$values);
        INSTANCE = new Companion(null);
    }

    private ConsoleMessageLevel(String str, int i10, int i11) {
        this.raw = i11;
    }

    public static InterfaceC5276a getEntries() {
        return $ENTRIES;
    }

    public static ConsoleMessageLevel valueOf(String str) {
        return (ConsoleMessageLevel) Enum.valueOf(ConsoleMessageLevel.class, str);
    }

    public static ConsoleMessageLevel[] values() {
        return (ConsoleMessageLevel[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
