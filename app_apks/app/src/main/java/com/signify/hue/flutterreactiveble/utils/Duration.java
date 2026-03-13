package com.signify.hue.flutterreactiveble.utils;

import io.sentry.protocol.Request;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/signify/hue/flutterreactiveble/utils/Duration;", "", "value", "", "unit", "Ljava/util/concurrent/TimeUnit;", "<init>", "(JLjava/util/concurrent/TimeUnit;)V", "getValue", "()J", "getUnit", "()Ljava/util/concurrent/TimeUnit;", "component1", "component2", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toString", "", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Duration {
    private final TimeUnit unit;
    private final long value;

    public Duration(long j10, TimeUnit unit) {
        AbstractC4862t.e(unit, "unit");
        this.value = j10;
        this.unit = unit;
    }

    public static /* synthetic */ Duration copy$default(Duration duration, long j10, TimeUnit timeUnit, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = duration.value;
        }
        if ((i10 & 2) != 0) {
            timeUnit = duration.unit;
        }
        return duration.copy(j10, timeUnit);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TimeUnit getUnit() {
        return this.unit;
    }

    public final Duration copy(long value, TimeUnit unit) {
        AbstractC4862t.e(unit, "unit");
        return new Duration(value, unit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) other;
        return this.value == duration.value && this.unit == duration.unit;
    }

    public final TimeUnit getUnit() {
        return this.unit;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return (Long.hashCode(this.value) * 31) + this.unit.hashCode();
    }

    public String toString() {
        return "Duration(value=" + this.value + ", unit=" + this.unit + ')';
    }
}
