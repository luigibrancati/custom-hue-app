package io.sentry.android.core;

import android.util.Log;
import io.sentry.ILogger;
import io.sentry.SentryLevel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidLogger implements ILogger {
    private final String tag;

    /* JADX INFO: renamed from: io.sentry.android.core.AndroidLogger$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$SentryLevel;

        static {
            int[] iArr = new int[SentryLevel.values().length];
            $SwitchMap$io$sentry$SentryLevel = iArr;
            try {
                iArr[SentryLevel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[SentryLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[SentryLevel.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[SentryLevel.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[SentryLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public AndroidLogger() {
        this("Sentry");
    }

    private int toLogcatLevel(SentryLevel sentryLevel) {
        int i10 = AnonymousClass1.$SwitchMap$io$sentry$SentryLevel[sentryLevel.ordinal()];
        if (i10 == 1) {
            return 4;
        }
        if (i10 != 2) {
            return i10 != 4 ? 3 : 7;
        }
        return 5;
    }

    @Override // io.sentry.ILogger
    public boolean isEnabled(SentryLevel sentryLevel) {
        return true;
    }

    @Override // io.sentry.ILogger
    public void log(SentryLevel sentryLevel, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(toLogcatLevel(sentryLevel), this.tag, str);
        } else {
            Log.println(toLogcatLevel(sentryLevel), this.tag, String.format(str, objArr));
        }
    }

    public AndroidLogger(String str) {
        this.tag = str;
    }

    @Override // io.sentry.ILogger
    public void log(SentryLevel sentryLevel, Throwable th, String str, Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            log(sentryLevel, String.format(str, objArr), th);
        } else {
            log(sentryLevel, str, th);
        }
    }

    @Override // io.sentry.ILogger
    public void log(SentryLevel sentryLevel, String str, Throwable th) {
        int i10 = AnonymousClass1.$SwitchMap$io$sentry$SentryLevel[sentryLevel.ordinal()];
        if (i10 == 1) {
            Log.i(this.tag, str, th);
            return;
        }
        if (i10 == 2) {
            Log.w(this.tag, str, th);
            return;
        }
        if (i10 == 3) {
            Log.e(this.tag, str, th);
        } else if (i10 != 4) {
            Log.d(this.tag, str, th);
        } else {
            Log.wtf(this.tag, str, th);
        }
    }
}
