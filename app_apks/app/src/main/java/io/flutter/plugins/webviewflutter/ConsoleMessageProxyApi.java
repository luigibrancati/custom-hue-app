package io.flutter.plugins.webviewflutter;

import android.webkit.ConsoleMessage;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ConsoleMessageProxyApi extends PigeonApiConsoleMessage {

    /* JADX INFO: renamed from: io.flutter.plugins.webviewflutter.ConsoleMessageProxyApi$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$webkit$ConsoleMessage$MessageLevel;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            $SwitchMap$android$webkit$ConsoleMessage$MessageLevel = iArr;
            try {
                iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public ConsoleMessageProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiConsoleMessage
    public ConsoleMessageLevel level(ConsoleMessage consoleMessage) {
        int i10 = AnonymousClass1.$SwitchMap$android$webkit$ConsoleMessage$MessageLevel[consoleMessage.messageLevel().ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? ConsoleMessageLevel.UNKNOWN : ConsoleMessageLevel.DEBUG : ConsoleMessageLevel.ERROR : ConsoleMessageLevel.WARNING : ConsoleMessageLevel.LOG : ConsoleMessageLevel.TIP;
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiConsoleMessage
    public long lineNumber(ConsoleMessage consoleMessage) {
        return consoleMessage.lineNumber();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiConsoleMessage
    public String message(ConsoleMessage consoleMessage) {
        return consoleMessage.message();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiConsoleMessage
    public String sourceId(ConsoleMessage consoleMessage) {
        return consoleMessage.sourceId();
    }
}
