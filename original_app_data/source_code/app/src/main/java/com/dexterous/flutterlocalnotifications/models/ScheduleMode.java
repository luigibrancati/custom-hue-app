package com.dexterous.flutterlocalnotifications.models;

import androidx.annotation.Keep;
import java.lang.reflect.Type;
import u9.h;
import u9.i;
import u9.j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Keep
public enum ScheduleMode {
    alarmClock,
    exact,
    exactAllowWhileIdle,
    inexact,
    inexactAllowWhileIdle;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements i {
        @Override // u9.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ScheduleMode a(j jVar, Type type, h hVar) {
            try {
                return ScheduleMode.valueOf(jVar.h());
            } catch (Exception unused) {
                return jVar.c() ? ScheduleMode.exactAllowWhileIdle : ScheduleMode.exact;
            }
        }
    }

    public boolean useAlarmClock() {
        return this == alarmClock;
    }

    public boolean useAllowWhileIdle() {
        return this == exactAllowWhileIdle || this == inexactAllowWhileIdle;
    }

    public boolean useExactAlarm() {
        return this == exact || this == exactAllowWhileIdle;
    }
}
