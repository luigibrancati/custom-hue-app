package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import io.sentry.util.Objects;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryExceptionFactory {
    private final SentryStackTraceFactory sentryStackTraceFactory;

    public SentryExceptionFactory(SentryStackTraceFactory sentryStackTraceFactory) {
        this.sentryStackTraceFactory = (SentryStackTraceFactory) Objects.requireNonNull(sentryStackTraceFactory, "The SentryStackTraceFactory is required.");
    }

    private SentryException getSentryException(Throwable th, Mechanism mechanism, Long l10, List<SentryStackFrame> list, boolean z10) {
        Package r42 = th.getClass().getPackage();
        String name = th.getClass().getName();
        SentryException sentryException = new SentryException();
        String message = th.getMessage();
        if (r42 != null) {
            name = name.replace(r42.getName() + ".", "");
        }
        String name2 = r42 != null ? r42.getName() : null;
        if (list != null && !list.isEmpty()) {
            SentryStackTrace sentryStackTrace = new SentryStackTrace(list);
            if (z10) {
                sentryStackTrace.setSnapshot(Boolean.TRUE);
            }
            sentryException.setStacktrace(sentryStackTrace);
        }
        sentryException.setThreadId(l10);
        sentryException.setType(name);
        sentryException.setMechanism(mechanism);
        sentryException.setModule(name2);
        sentryException.setValue(message);
        return sentryException;
    }

    public Deque<SentryException> extractExceptionQueue(Throwable th) {
        return extractExceptionQueueInternal(th, new AtomicInteger(-1), new HashSet<>(), new ArrayDeque(), null);
    }

    public Deque<SentryException> extractExceptionQueueInternal(Throwable th, AtomicInteger atomicInteger, HashSet<Throwable> hashSet, Deque<SentryException> deque, String str) {
        Mechanism mechanism;
        Thread threadCurrentThread;
        Throwable th2;
        boolean zIsSnapshot;
        Deque<SentryException> deque2 = deque;
        String str2 = str;
        int i10 = atomicInteger.get();
        Throwable cause = th;
        while (cause != null) {
            HashSet<Throwable> hashSet2 = hashSet;
            if (!hashSet2.add(cause)) {
                break;
            }
            if (str2 == null) {
                str2 = "chained";
            }
            int i11 = 0;
            if (cause instanceof ExceptionMechanismException) {
                ExceptionMechanismException exceptionMechanismException = (ExceptionMechanismException) cause;
                mechanism = exceptionMechanismException.getExceptionMechanism();
                Throwable throwable = exceptionMechanismException.getThrowable();
                threadCurrentThread = exceptionMechanismException.getThread();
                zIsSnapshot = exceptionMechanismException.isSnapshot();
                th2 = throwable;
            } else {
                mechanism = new Mechanism();
                threadCurrentThread = Thread.currentThread();
                th2 = cause;
                zIsSnapshot = false;
            }
            Mechanism mechanism2 = mechanism;
            deque2.addFirst(getSentryException(th2, mechanism2, Long.valueOf(threadCurrentThread.getId()), this.sentryStackTraceFactory.getStackFrames(th2.getStackTrace(), Boolean.FALSE.equals(mechanism2.isHandled())), zIsSnapshot));
            if (mechanism2.getType() == null) {
                mechanism2.setType(str2);
            }
            if (atomicInteger.get() >= 0) {
                mechanism2.setParentId(Integer.valueOf(i10));
            }
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            mechanism2.setExceptionId(Integer.valueOf(iIncrementAndGet));
            Throwable[] suppressed = th2.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                int length = suppressed.length;
                while (i11 < length) {
                    extractExceptionQueueInternal(suppressed[i11], atomicInteger, hashSet2, deque2, "suppressed");
                    i11++;
                    hashSet2 = hashSet;
                    deque2 = deque;
                }
            }
            cause = th2.getCause();
            str2 = null;
            deque2 = deque;
            i10 = iIncrementAndGet;
        }
        return deque;
    }

    public List<SentryException> getSentryExceptions(Throwable th) {
        return getSentryExceptions(extractExceptionQueue(th));
    }

    public List<SentryException> getSentryExceptionsFromThread(SentryThread sentryThread, Mechanism mechanism, Throwable th) {
        SentryStackTrace stacktrace = sentryThread.getStacktrace();
        if (stacktrace == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(getSentryException(th, mechanism, sentryThread.getId(), stacktrace.getFrames(), true));
        return arrayList;
    }

    private List<SentryException> getSentryExceptions(Deque<SentryException> deque) {
        return new ArrayList(deque);
    }
}
