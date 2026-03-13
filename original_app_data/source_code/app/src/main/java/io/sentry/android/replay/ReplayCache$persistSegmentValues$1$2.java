package io.sentry.android.replay;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class ReplayCache$persistSegmentValues$1$2 extends v implements l {
    public static final ReplayCache$persistSegmentValues$1$2 INSTANCE = new ReplayCache$persistSegmentValues$1$2();

    public ReplayCache$persistSegmentValues$1$2() {
        super(1);
    }

    @Override // vc.l
    public final CharSequence invoke(Map.Entry<String, String> entry) {
        AbstractC4862t.e(entry, "<name for destructuring parameter 0>");
        return entry.getKey() + '=' + entry.getValue();
    }
}
