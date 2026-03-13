package Be;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f848a = new d();

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        AbstractC4862t.e(record, "record");
        c cVar = c.f845a;
        String loggerName = record.getLoggerName();
        AbstractC4862t.d(loggerName, "getLoggerName(...)");
        int iB = e.b(record);
        String message = record.getMessage();
        AbstractC4862t.d(message, "getMessage(...)");
        cVar.a(loggerName, iB, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
