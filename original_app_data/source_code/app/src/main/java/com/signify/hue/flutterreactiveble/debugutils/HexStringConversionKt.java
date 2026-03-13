package com.signify.hue.flutterreactiveble.debugutils;

import com.signify.hue.flutterreactiveble.debugutils.HexStringConversionKt;
import gc.C4204q;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.S;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toHexString", "", "", "reactive_ble_mobile_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class HexStringConversionKt {
    public static final String toHexString(byte[] bArr) {
        AbstractC4862t.e(bArr, "<this>");
        return C4204q.p0(bArr, "", null, null, 0, null, new l() { // from class: Ca.a
            @Override // vc.l
            public final Object invoke(Object obj) {
                return HexStringConversionKt.toHexString$lambda$0(((Byte) obj).byteValue());
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toHexString$lambda$0(byte b10) {
        S s10 = S.f39781a;
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        AbstractC4862t.d(str, "format(format, *args)");
        return str;
    }
}
