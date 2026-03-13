package com.signify.hue.flutterreactiveble.model;

import ka.N;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lka/N$a;", "Lcom/signify/hue/flutterreactiveble/model/ConnectionState;", "toConnectionState", "(Lka/N$a;)Lcom/signify/hue/flutterreactiveble/model/ConnectionState;", "reactive_ble_mobile_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ConnectionStateKt {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ConnectionState toConnectionState(N.a aVar) {
        AbstractC4862t.e(aVar, "<this>");
        String strName = aVar.name();
        switch (strName.hashCode()) {
            case -2087582999:
                if (strName.equals("CONNECTED")) {
                    return ConnectionState.CONNECTED;
                }
                break;
            case -1052098138:
                if (strName.equals("DISCONNECTING")) {
                    return ConnectionState.DISCONNECTING;
                }
                break;
            case -290559304:
                if (strName.equals("CONNECTING")) {
                    return ConnectionState.CONNECTING;
                }
                break;
            case 935892539:
                if (strName.equals("DISCONNECTED")) {
                    return ConnectionState.DISCONNECTED;
                }
                break;
        }
        return ConnectionState.UNKNOWN;
    }
}
