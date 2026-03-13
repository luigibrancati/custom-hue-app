package com.signify.hue.flutterreactiveble.channelhandlers;

import android.os.ParcelUuid;
import com.signify.hue.flutterreactiveble.model.ScanMode;
import io.sentry.protocol.Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/signify/hue/flutterreactiveble/channelhandlers/ScanParameters;", "", "filter", "", "Landroid/os/ParcelUuid;", "mode", "Lcom/signify/hue/flutterreactiveble/model/ScanMode;", "locationServiceIsMandatory", "", "<init>", "(Ljava/util/List;Lcom/signify/hue/flutterreactiveble/model/ScanMode;Z)V", "getFilter", "()Ljava/util/List;", "getMode", "()Lcom/signify/hue/flutterreactiveble/model/ScanMode;", "getLocationServiceIsMandatory", "()Z", "component1", "component2", "component3", "copy", "equals", Request.JsonKeys.OTHER, "hashCode", "", "toString", "", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class ScanParameters {
    private final List<ParcelUuid> filter;
    private final boolean locationServiceIsMandatory;
    private final ScanMode mode;

    public ScanParameters(List<ParcelUuid> filter, ScanMode mode, boolean z10) {
        AbstractC4862t.e(filter, "filter");
        AbstractC4862t.e(mode, "mode");
        this.filter = filter;
        this.mode = mode;
        this.locationServiceIsMandatory = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScanParameters copy$default(ScanParameters scanParameters, List list, ScanMode scanMode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = scanParameters.filter;
        }
        if ((i10 & 2) != 0) {
            scanMode = scanParameters.mode;
        }
        if ((i10 & 4) != 0) {
            z10 = scanParameters.locationServiceIsMandatory;
        }
        return scanParameters.copy(list, scanMode, z10);
    }

    public final List<ParcelUuid> component1() {
        return this.filter;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ScanMode getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getLocationServiceIsMandatory() {
        return this.locationServiceIsMandatory;
    }

    public final ScanParameters copy(List<ParcelUuid> filter, ScanMode mode, boolean locationServiceIsMandatory) {
        AbstractC4862t.e(filter, "filter");
        AbstractC4862t.e(mode, "mode");
        return new ScanParameters(filter, mode, locationServiceIsMandatory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScanParameters)) {
            return false;
        }
        ScanParameters scanParameters = (ScanParameters) other;
        return AbstractC4862t.a(this.filter, scanParameters.filter) && this.mode == scanParameters.mode && this.locationServiceIsMandatory == scanParameters.locationServiceIsMandatory;
    }

    public final List<ParcelUuid> getFilter() {
        return this.filter;
    }

    public final boolean getLocationServiceIsMandatory() {
        return this.locationServiceIsMandatory;
    }

    public final ScanMode getMode() {
        return this.mode;
    }

    public int hashCode() {
        return (((this.filter.hashCode() * 31) + this.mode.hashCode()) * 31) + Boolean.hashCode(this.locationServiceIsMandatory);
    }

    public String toString() {
        return "ScanParameters(filter=" + this.filter + ", mode=" + this.mode + ", locationServiceIsMandatory=" + this.locationServiceIsMandatory + ')';
    }
}
