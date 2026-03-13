package com.braze.communication;

import Od.C;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static FilterInputStream a(HttpURLConnection httpURLConnection) throws com.braze.exceptions.a, IOException {
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode / 100 == 2) {
            return C.E("gzip", httpURLConnection.getContentEncoding(), true) ? new GZIPInputStream(httpURLConnection.getInputStream()) : new BufferedInputStream(httpURLConnection.getInputStream());
        }
        throw new com.braze.exceptions.a("Bad HTTP response code from Braze: [" + responseCode + "] to url: " + httpURLConnection.getURL());
    }
}
