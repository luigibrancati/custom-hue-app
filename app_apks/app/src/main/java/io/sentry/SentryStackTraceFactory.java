package io.sentry;

import io.sentry.protocol.SentryStackFrame;
import io.sentry.util.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryStackTraceFactory {
    private static final int STACKTRACE_FRAME_LIMIT = 100;
    private final SentryOptions options;

    public SentryStackTraceFactory(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public static /* synthetic */ boolean b(SentryStackFrame sentryStackFrame) {
        String module = sentryStackFrame.getModule();
        boolean z10 = false;
        if (module != null && (module.startsWith("sun.") || module.startsWith("java.") || module.startsWith("android.") || module.startsWith("com.android."))) {
            z10 = true;
        }
        return !z10;
    }

    public static Boolean isInApp(String str, List<String> list, List<String> list2) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = list2.iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public List<SentryStackFrame> getInAppCallStack(Throwable th) {
        List<SentryStackFrame> stackFrames = getStackFrames(th.getStackTrace(), false);
        if (stackFrames == null) {
            return Collections.EMPTY_LIST;
        }
        List<SentryStackFrame> listFilterListEntries = CollectionUtils.filterListEntries(stackFrames, new CollectionUtils.Predicate() { // from class: io.sentry.C0
            @Override // io.sentry.util.CollectionUtils.Predicate
            public final boolean test(Object obj) {
                return Boolean.TRUE.equals(((SentryStackFrame) obj).isInApp());
            }
        });
        return !listFilterListEntries.isEmpty() ? listFilterListEntries : CollectionUtils.filterListEntries(stackFrames, new CollectionUtils.Predicate() { // from class: io.sentry.D0
            @Override // io.sentry.util.CollectionUtils.Predicate
            public final boolean test(Object obj) {
                return SentryStackTraceFactory.b((SentryStackFrame) obj);
            }
        });
    }

    public List<SentryStackFrame> getStackFrames(StackTraceElement[] stackTraceElementArr, boolean z10) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z10 || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    SentryStackFrame sentryStackFrame = new SentryStackFrame();
                    sentryStackFrame.setInApp(isInApp(className));
                    sentryStackFrame.setModule(className);
                    sentryStackFrame.setFunction(stackTraceElement.getMethodName());
                    sentryStackFrame.setFilename(stackTraceElement.getFileName());
                    if (stackTraceElement.getLineNumber() >= 0) {
                        sentryStackFrame.setLineno(Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                    sentryStackFrame.setNative(Boolean.valueOf(stackTraceElement.isNativeMethod()));
                    arrayList.add(sentryStackFrame);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public List<SentryStackFrame> getInAppCallStack() {
        return getInAppCallStack(new Exception());
    }

    public Boolean isInApp(String str) {
        return isInApp(str, this.options.getInAppIncludes(), this.options.getInAppExcludes());
    }
}
