package io.sentry;

import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryThreadFactory {
    private final SentryStackTraceFactory sentryStackTraceFactory;

    public SentryThreadFactory(SentryStackTraceFactory sentryStackTraceFactory) {
        this.sentryStackTraceFactory = (SentryStackTraceFactory) Objects.requireNonNull(sentryStackTraceFactory, "The SentryStackTraceFactory is required.");
    }

    private SentryThread getSentryThread(boolean z10, StackTraceElement[] stackTraceElementArr, Thread thread, boolean z11) {
        List<SentryStackFrame> stackFrames;
        SentryThread sentryThread = new SentryThread();
        sentryThread.setName(thread.getName());
        sentryThread.setPriority(Integer.valueOf(thread.getPriority()));
        sentryThread.setId(Long.valueOf(thread.getId()));
        sentryThread.setDaemon(Boolean.valueOf(thread.isDaemon()));
        sentryThread.setState(thread.getState().name());
        sentryThread.setCrashed(Boolean.valueOf(z10));
        if (z11 && (stackFrames = this.sentryStackTraceFactory.getStackFrames(stackTraceElementArr, false)) != null && !stackFrames.isEmpty()) {
            SentryStackTrace sentryStackTrace = new SentryStackTrace(stackFrames);
            sentryStackTrace.setSnapshot(Boolean.TRUE);
            sentryThread.setStacktrace(sentryStackTrace);
        }
        return sentryThread;
    }

    public List<SentryThread> getCurrentThread(boolean z10) {
        HashMap map = new HashMap();
        Thread threadCurrentThread = Thread.currentThread();
        map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        return getCurrentThreads(map, null, false, z10);
    }

    public List<SentryThread> getCurrentThreads(List<Long> list, boolean z10, boolean z11) {
        return getCurrentThreads(Thread.getAllStackTraces(), list, z10, z11);
    }

    public List<SentryThread> getCurrentThreads(List<Long> list, boolean z10) {
        return getCurrentThreads(Thread.getAllStackTraces(), list, false, z10);
    }

    public List<SentryThread> getCurrentThreads(Map<Thread, StackTraceElement[]> map, List<Long> list, boolean z10, boolean z11) {
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
            Thread key = entry.getKey();
            arrayList.add(getSentryThread((key == threadCurrentThread && !z10) || !(list == null || !list.contains(Long.valueOf(key.getId())) || z10), entry.getValue(), entry.getKey(), z11));
        }
        return arrayList;
    }
}
