package androidx.datastore.core;

import io.sentry.SentryLockReason;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0086 J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0086 J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0086 J\u0011\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0086 ¨\u0006\f"}, d2 = {"Landroidx/datastore/core/NativeSharedCounter;", "", "<init>", "()V", "nativeTruncateFile", "", "fd", "nativeCreateSharedCounter", "", "nativeGetCounterValue", SentryLockReason.JsonKeys.ADDRESS, "nativeIncrementAndGetCounterValue", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int fd2);

    public final native int nativeGetCounterValue(long address);

    public final native int nativeIncrementAndGetCounterValue(long address);

    public final native int nativeTruncateFile(int fd2);
}
