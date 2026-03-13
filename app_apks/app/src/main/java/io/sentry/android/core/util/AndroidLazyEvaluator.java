package io.sentry.android.core.util;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidLazyEvaluator<T> {
    private final AndroidEvaluator<T> evaluator;
    private volatile T value = null;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface AndroidEvaluator<T> {
        T evaluate(Context context);
    }

    public AndroidLazyEvaluator(AndroidEvaluator<T> androidEvaluator) {
        this.evaluator = androidEvaluator;
    }

    public T getValue(Context context) {
        if (this.value == null) {
            synchronized (this) {
                try {
                    if (this.value == null) {
                        this.value = this.evaluator.evaluate(context);
                    }
                } finally {
                }
            }
        }
        return this.value;
    }

    public void resetValue() {
        synchronized (this) {
            this.value = null;
        }
    }

    public void setValue(T t10) {
        synchronized (this) {
            this.value = t10;
        }
    }
}
