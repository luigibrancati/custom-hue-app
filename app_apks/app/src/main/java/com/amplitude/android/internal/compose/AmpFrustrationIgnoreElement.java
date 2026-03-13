package com.amplitude.android.internal.compose;

import io.sentry.protocol.Request;
import kotlin.Metadata;
import v0.k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/amplitude/android/internal/compose/AmpFrustrationIgnoreElement;", "Lv0/k;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "getIgnoreRageClick", "()Z", "ignoreRageClick", "c", "getIgnoreDeadClick", "ignoreDeadClick", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AmpFrustrationIgnoreElement extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean ignoreRageClick;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean ignoreDeadClick;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmpFrustrationIgnoreElement)) {
            return false;
        }
        AmpFrustrationIgnoreElement ampFrustrationIgnoreElement = (AmpFrustrationIgnoreElement) other;
        return this.ignoreRageClick == ampFrustrationIgnoreElement.ignoreRageClick && this.ignoreDeadClick == ampFrustrationIgnoreElement.ignoreDeadClick;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.ignoreRageClick) * 31) + Boolean.hashCode(this.ignoreDeadClick);
    }

    public String toString() {
        return "AmpFrustrationIgnoreElement(ignoreRageClick=" + this.ignoreRageClick + ", ignoreDeadClick=" + this.ignoreDeadClick + ')';
    }
}
