package com.braze.enums;

import com.braze.enums.Month;
import com.braze.support.BrazeLogger;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;
import vc.InterfaceC6082a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/braze/enums/Month;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Month {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ Month[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final Month JANUARY = new Month("JANUARY", 0, 0);
    public static final Month FEBRUARY = new Month("FEBRUARY", 1, 1);
    public static final Month MARCH = new Month("MARCH", 2, 2);
    public static final Month APRIL = new Month("APRIL", 3, 3);
    public static final Month MAY = new Month("MAY", 4, 4);
    public static final Month JUNE = new Month("JUNE", 5, 5);
    public static final Month JULY = new Month("JULY", 6, 6);
    public static final Month AUGUST = new Month("AUGUST", 7, 7);
    public static final Month SEPTEMBER = new Month("SEPTEMBER", 8, 8);
    public static final Month OCTOBER = new Month("OCTOBER", 9, 9);
    public static final Month NOVEMBER = new Month("NOVEMBER", 10, 10);
    public static final Month DECEMBER = new Month("DECEMBER", 11, 11);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/braze/enums/Month$Companion;", "", "<init>", "()V", "getMonth", "Lcom/braze/enums/Month;", "value", "", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getMonth$lambda$2$lambda$1(int i10) {
            return "No month with value " + i10 + ", value must be in (0,11)";
        }

        public final Month getMonth(final int value) {
            Object next;
            Iterator<E> it = Month.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Month) next).getValue() == value) {
                    break;
                }
            }
            Month month = (Month) next;
            if (month != null) {
                return month;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: Y4.e
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Month.Companion.getMonth$lambda$2$lambda$1(value);
                }
            }, 6, (Object) null);
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Month[] $values() {
        return new Month[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
    }

    static {
        Month[] monthArr$values = $values();
        $VALUES = monthArr$values;
        $ENTRIES = AbstractC5277b.a(monthArr$values);
        INSTANCE = new Companion(null);
    }

    private Month(String str, int i10, int i11) {
        this.value = i11;
    }

    public static InterfaceC5276a getEntries() {
        return $ENTRIES;
    }

    public static Month valueOf(String str) {
        return (Month) Enum.valueOf(Month.class, str);
    }

    public static Month[] values() {
        return (Month[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
