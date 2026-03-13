package io.sentry.util;

import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.TypeCheckHint;
import io.sentry.hints.ApplyScopeData;
import io.sentry.hints.Backfillable;
import io.sentry.hints.Cached;
import io.sentry.hints.EventDropReason;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class HintUtils {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @FunctionalInterface
    public interface SentryConsumer<T> {
        void accept(T t10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @FunctionalInterface
    public interface SentryHintFallback {
        void accept(Object obj, Class<?> cls);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @FunctionalInterface
    public interface SentryNullableConsumer<T> {
        void accept(T t10);
    }

    private HintUtils() {
    }

    public static Hint createWithTypeCheckHint(Object obj) {
        Hint hint = new Hint();
        setTypeCheckHint(hint, obj);
        return hint;
    }

    public static EventDropReason getEventDropReason(Hint hint) {
        return (EventDropReason) hint.getAs(TypeCheckHint.SENTRY_EVENT_DROP_REASON, EventDropReason.class);
    }

    public static Object getSentrySdkHint(Hint hint) {
        return hint.get(TypeCheckHint.SENTRY_TYPE_CHECK_HINT);
    }

    public static boolean hasType(Hint hint, Class<?> cls) {
        return cls.isInstance(getSentrySdkHint(hint));
    }

    public static boolean isFromHybridSdk(Hint hint) {
        return Boolean.TRUE.equals(hint.getAs(TypeCheckHint.SENTRY_IS_FROM_HYBRID_SDK, Boolean.class));
    }

    public static <T> void runIfDoesNotHaveType(Hint hint, Class<T> cls, final SentryNullableConsumer<Object> sentryNullableConsumer) {
        runIfHasType(hint, cls, new SentryConsumer() { // from class: io.sentry.util.c
            @Override // io.sentry.util.HintUtils.SentryConsumer
            public final void accept(Object obj) {
                HintUtils.d(obj);
            }
        }, new SentryHintFallback() { // from class: io.sentry.util.d
            @Override // io.sentry.util.HintUtils.SentryHintFallback
            public final void accept(Object obj, Class cls2) {
                sentryNullableConsumer.accept(obj);
            }
        });
    }

    public static <T> void runIfHasType(Hint hint, Class<T> cls, SentryConsumer<T> sentryConsumer) {
        runIfHasType(hint, cls, sentryConsumer, new SentryHintFallback() { // from class: io.sentry.util.a
            @Override // io.sentry.util.HintUtils.SentryHintFallback
            public final void accept(Object obj, Class cls2) {
                HintUtils.c(obj, cls2);
            }
        });
    }

    public static <T> void runIfHasTypeLogIfNot(Hint hint, Class<T> cls, final ILogger iLogger, SentryConsumer<T> sentryConsumer) {
        runIfHasType(hint, cls, sentryConsumer, new SentryHintFallback() { // from class: io.sentry.util.b
            @Override // io.sentry.util.HintUtils.SentryHintFallback
            public final void accept(Object obj, Class cls2) {
                LogUtils.logNotInstanceOf(cls2, obj, iLogger);
            }
        });
    }

    public static void setEventDropReason(Hint hint, EventDropReason eventDropReason) {
        hint.set(TypeCheckHint.SENTRY_EVENT_DROP_REASON, eventDropReason);
    }

    public static void setIsFromHybridSdk(Hint hint, String str) {
        if (str.startsWith(TypeCheckHint.SENTRY_JAVASCRIPT_SDK_NAME) || str.startsWith(TypeCheckHint.SENTRY_DART_SDK_NAME) || str.startsWith(TypeCheckHint.SENTRY_DOTNET_SDK_NAME)) {
            hint.set(TypeCheckHint.SENTRY_IS_FROM_HYBRID_SDK, Boolean.TRUE);
        }
    }

    public static void setTypeCheckHint(Hint hint, Object obj) {
        hint.set(TypeCheckHint.SENTRY_TYPE_CHECK_HINT, obj);
    }

    public static boolean shouldApplyScopeData(Hint hint) {
        return !(hasType(hint, Cached.class) || hasType(hint, Backfillable.class)) || hasType(hint, ApplyScopeData.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void runIfHasType(Hint hint, Class<T> cls, SentryConsumer<T> sentryConsumer, SentryHintFallback sentryHintFallback) {
        Object sentrySdkHint = getSentrySdkHint(hint);
        if (!hasType(hint, cls) || sentrySdkHint == null) {
            sentryHintFallback.accept(sentrySdkHint, cls);
        } else {
            sentryConsumer.accept(sentrySdkHint);
        }
    }

    public static /* synthetic */ void d(Object obj) {
    }

    public static /* synthetic */ void c(Object obj, Class cls) {
    }
}
