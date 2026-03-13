package com.hiennv.flutter_callkit_incoming;

import android.os.Bundle;
import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/CallkitEventCallback;", "", "Lcom/hiennv/flutter_callkit_incoming/CallkitEventCallback$CallEvent;", "event", "Landroid/os/Bundle;", "callData", "Lfc/H;", "onCallEvent", "(Lcom/hiennv/flutter_callkit_incoming/CallkitEventCallback$CallEvent;Landroid/os/Bundle;)V", "CallEvent", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CallkitEventCallback {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/CallkitEventCallback$CallEvent;", "", "<init>", "(Ljava/lang/String;I)V", "ACCEPT", "DECLINE", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CallEvent {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ CallEvent[] $VALUES;
        public static final CallEvent ACCEPT = new CallEvent("ACCEPT", 0);
        public static final CallEvent DECLINE = new CallEvent("DECLINE", 1);

        private static final /* synthetic */ CallEvent[] $values() {
            return new CallEvent[]{ACCEPT, DECLINE};
        }

        static {
            CallEvent[] callEventArr$values = $values();
            $VALUES = callEventArr$values;
            $ENTRIES = AbstractC5277b.a(callEventArr$values);
        }

        private CallEvent(String str, int i10) {
        }

        public static InterfaceC5276a getEntries() {
            return $ENTRIES;
        }

        public static CallEvent valueOf(String str) {
            return (CallEvent) Enum.valueOf(CallEvent.class, str);
        }

        public static CallEvent[] values() {
            return (CallEvent[]) $VALUES.clone();
        }
    }

    void onCallEvent(CallEvent event, Bundle callData);
}
