package io.sentry.flutter;

import fc.AbstractC4040w;
import gc.P;
import gc.Q;
import io.sentry.Breadcrumb;
import io.sentry.android.replay.DefaultReplayBreadcrumbConverter;
import io.sentry.protocol.Response;
import io.sentry.rrweb.RRWebBreadcrumbEvent;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebSpanEvent;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002¨\u0006\u0016"}, d2 = {"Lio/sentry/flutter/SentryFlutterReplayBreadcrumbConverter;", "Lio/sentry/android/replay/DefaultReplayBreadcrumbConverter;", "<init>", "()V", "convert", "Lio/sentry/rrweb/RRWebEvent;", RRWebBreadcrumbEvent.EVENT_TAG, "Lio/sentry/Breadcrumb;", "newRRWebBreadcrumb", "Lio/sentry/rrweb/RRWebBreadcrumbEvent;", "doubleTimestamp", "", "date", "Ljava/util/Date;", "timestamp", "", "convertNetworkBreadcrumb", "getTouchPathMessage", "", "maybePath", "", "Companion", "sentry_flutter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SentryFlutterReplayBreadcrumbConverter extends DefaultReplayBreadcrumbConverter {
    private static final Map<String, String> supportedNetworkData = Q.l(AbstractC4040w.a(Response.JsonKeys.STATUS_CODE, "statusCode"), AbstractC4040w.a("method", "method"), AbstractC4040w.a("response_body_size", "responseBodySize"), AbstractC4040w.a("request_body_size", "requestBodySize"));

    private final RRWebEvent convertNetworkBreadcrumb(Breadcrumb breadcrumb) {
        RRWebEvent rRWebEventConvert = super.convert(breadcrumb);
        RRWebEvent rRWebEvent = rRWebEventConvert;
        if (rRWebEventConvert == null) {
            rRWebEvent = rRWebEventConvert;
            if (breadcrumb.getData().containsKey("start_timestamp")) {
                rRWebEvent = rRWebEventConvert;
                if (breadcrumb.getData().containsKey("end_timestamp")) {
                    RRWebSpanEvent rRWebSpanEvent = new RRWebSpanEvent();
                    rRWebSpanEvent.setOp("resource.http");
                    rRWebSpanEvent.setTimestamp(breadcrumb.getTimestamp().getTime());
                    Object obj = breadcrumb.getData().get("url");
                    AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.String");
                    rRWebSpanEvent.setDescription((String) obj);
                    Object obj2 = breadcrumb.getData().get("start_timestamp");
                    AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                    rRWebSpanEvent.setStartTimestamp(doubleTimestamp(((Long) obj2).longValue()));
                    Object obj3 = breadcrumb.getData().get("end_timestamp");
                    AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                    rRWebSpanEvent.setEndTimestamp(doubleTimestamp(((Long) obj3).longValue()));
                    Map<String, Object> data = breadcrumb.getData();
                    AbstractC4862t.d(data, "getData(...)");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, Object> entry : data.entrySet()) {
                        if (supportedNetworkData.containsKey(entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(P.e(linkedHashMap.size()));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(supportedNetworkData.get((String) entry2.getKey()), entry2.getValue());
                    }
                    rRWebSpanEvent.setData(linkedHashMap2);
                    rRWebEvent = rRWebSpanEvent;
                }
            }
        }
        return rRWebEvent;
    }

    private final double doubleTimestamp(long timestamp) {
        return timestamp / 1000.0d;
    }

    private final String getTouchPathMessage(Object maybePath) {
        if (!(maybePath instanceof List)) {
            return null;
        }
        List list = (List) maybePath;
        if (list.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int iMin = Math.min(4, list.size());
        while (true) {
            iMin--;
            if (-1 >= iMin) {
                return sb2.toString();
            }
            Object obj = list.get(iMin);
            if (obj instanceof Map) {
                Map map = (Map) obj;
                Object obj2 = map.get("element");
                if (obj2 == null) {
                    obj2 = "?";
                }
                sb2.append(obj2);
                Object string = map.get("label");
                if (string == null) {
                    string = map.get("name");
                }
                if ((string instanceof String) && ((CharSequence) string).length() > 0) {
                    String str = (String) string;
                    if (str.length() > 20) {
                        StringBuilder sb3 = new StringBuilder();
                        String strSubstring = str.substring(0, 17);
                        AbstractC4862t.d(strSubstring, "substring(...)");
                        sb3.append(strSubstring);
                        sb3.append("...");
                        string = sb3.toString();
                    }
                    sb2.append("(");
                    sb2.append((String) string);
                    sb2.append(")");
                }
                if (iMin > 0) {
                    sb2.append(" > ");
                }
            }
        }
    }

    private final RRWebBreadcrumbEvent newRRWebBreadcrumb(Breadcrumb breadcrumb) {
        RRWebBreadcrumbEvent rRWebBreadcrumbEvent = new RRWebBreadcrumbEvent();
        rRWebBreadcrumbEvent.setCategory(breadcrumb.getCategory());
        rRWebBreadcrumbEvent.setLevel(breadcrumb.getLevel());
        rRWebBreadcrumbEvent.setData(breadcrumb.getData());
        rRWebBreadcrumbEvent.setTimestamp(breadcrumb.getTimestamp().getTime());
        Date timestamp = breadcrumb.getTimestamp();
        AbstractC4862t.d(timestamp, "getTimestamp(...)");
        rRWebBreadcrumbEvent.setBreadcrumbTimestamp(doubleTimestamp(timestamp));
        rRWebBreadcrumbEvent.setBreadcrumbType("default");
        return rRWebBreadcrumbEvent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.sentry.android.replay.DefaultReplayBreadcrumbConverter, io.sentry.ReplayBreadcrumbConverter
    public RRWebEvent convert(Breadcrumb breadcrumb) {
        AbstractC4862t.e(breadcrumb, "breadcrumb");
        String category = breadcrumb.getCategory();
        if (category == null) {
            return null;
        }
        switch (category.hashCode()) {
            case -2139323986:
                if (category.equals("ui.click")) {
                    RRWebBreadcrumbEvent rRWebBreadcrumbEventNewRRWebBreadcrumb = newRRWebBreadcrumb(breadcrumb);
                    rRWebBreadcrumbEventNewRRWebBreadcrumb.setCategory("ui.tap");
                    rRWebBreadcrumbEventNewRRWebBreadcrumb.setMessage(getTouchPathMessage(breadcrumb.getData().get("path")));
                    return rRWebBreadcrumbEventNewRRWebBreadcrumb;
                }
                break;
            case -252308533:
                if (category.equals("sentry.event")) {
                    return null;
                }
                break;
            case -152761521:
                if (category.equals("sentry.transaction")) {
                    return null;
                }
                break;
            case 3213448:
                if (category.equals("http")) {
                    return convertNetworkBreadcrumb(breadcrumb);
                }
                break;
            case 1862666772:
                if (category.equals("navigation")) {
                    if (breadcrumb.getData().containsKey("to") && (breadcrumb.getData().get("to") instanceof String)) {
                        return newRRWebBreadcrumb(breadcrumb);
                    }
                    return null;
                }
                break;
        }
        RRWebEvent rRWebEventConvert = super.convert(breadcrumb);
        if ((rRWebEventConvert instanceof RRWebBreadcrumbEvent) && AbstractC4862t.a(((RRWebBreadcrumbEvent) rRWebEventConvert).getCategory(), "navigation")) {
            return null;
        }
        return rRWebEventConvert;
    }

    private final double doubleTimestamp(Date date) {
        return doubleTimestamp(date.getTime());
    }
}
