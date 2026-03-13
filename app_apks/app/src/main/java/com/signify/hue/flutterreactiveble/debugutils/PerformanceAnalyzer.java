package com.signify.hue.flutterreactiveble.debugutils;

import fc.C4034q;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/signify/hue/flutterreactiveble/debugutils/PerformanceAnalyzer;", "", "<init>", "()V", "", "startTime", "Lfc/H;", "start", "(J)V", "endTime", "end", "timeElapsed", "()J", "Lfc/q;", "timer", "Lfc/q;", "getTimer", "()Lfc/q;", "setTimer", "(Lfc/q;)V", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PerformanceAnalyzer {
    public static final PerformanceAnalyzer INSTANCE = new PerformanceAnalyzer();
    private static C4034q timer = new C4034q(0L, 0L);

    private PerformanceAnalyzer() {
    }

    public final void end(long endTime) {
        timer = C4034q.d(timer, null, Long.valueOf(endTime), 1, null);
    }

    public final C4034q getTimer() {
        return timer;
    }

    public final void setTimer(C4034q c4034q) {
        AbstractC4862t.e(c4034q, "<set-?>");
        timer = c4034q;
    }

    public final void start(long startTime) {
        timer = C4034q.d(timer, Long.valueOf(startTime), null, 2, null);
    }

    public final long timeElapsed() {
        return ((Number) timer.f()).longValue() - ((Number) timer.e()).longValue();
    }
}
