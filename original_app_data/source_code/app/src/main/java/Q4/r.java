package Q4;

import Od.C1823c;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5158b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class r extends com.bbflight.background_downloader.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b0 context) {
        super(context);
        AbstractC4862t.e(context, "context");
    }

    @Override // com.bbflight.background_downloader.l
    public Object D(HttpURLConnection httpURLConnection, InterfaceC4988e interfaceC4988e) throws IOException {
        O(AbstractC5158b.c(httpURLConnection.getResponseCode()));
        Integer numW = w();
        AbstractC4862t.b(numW);
        int iIntValue = numW.intValue();
        if (200 > iIntValue || iIntValue >= 207) {
            Log.i("TaskRunner", "Response code " + httpURLConnection.getResponseCode() + " for taskId " + z().getTaskId());
            String strE = E(httpURLConnection);
            EnumC1903x enumC1903x = EnumC1903x.httpResponse;
            int responseCode = httpURLConnection.getResponseCode();
            String responseMessage = (strE == null || strE.length() <= 0) ? httpURLConnection.getResponseMessage() : strE;
            AbstractC4862t.b(responseMessage);
            U(new Y(enumC1903x, responseCode, responseMessage));
            Integer numW2 = w();
            if (numW2 == null || numW2.intValue() != 404) {
                return g0.failed;
            }
            N(strE);
            return g0.notFound;
        }
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        AbstractC4862t.d(headerFields, "getHeaderFields(...)");
        o(headerFields);
        Map<String, List<String>> headerFields2 = httpURLConnection.getHeaderFields();
        AbstractC4862t.d(headerFields2, "getHeaderFields(...)");
        n(headerFields2);
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            AbstractC4862t.d(inputStream, "getInputStream(...)");
            N(sc.o.d(new BufferedReader(new InputStreamReader(inputStream, C1823c.f12394b), 8192)));
            return g0.complete;
        } catch (Exception e10) {
            Log.i("TaskRunner", "Could not read response content: " + e10);
            this.U(new Y(EnumC1903x.connection, 0, "Could not read response content: " + e10, 2, null));
            return g0.failed;
        }
    }
}
