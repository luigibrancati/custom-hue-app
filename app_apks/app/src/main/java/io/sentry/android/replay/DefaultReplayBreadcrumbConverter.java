package io.sentry.android.replay;

import Od.C;
import Od.F;
import Od.H;
import Od.k;
import Od.o;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import gc.C4207u;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.ReplayBreadcrumbConverter;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryLogEvent;
import io.sentry.SentryOptions;
import io.sentry.SpanDataConvention;
import io.sentry.TypeCheckHint;
import io.sentry.protocol.Response;
import io.sentry.rrweb.RRWebBreadcrumbEvent;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.rrweb.RRWebSpanEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import io.sentry.util.network.NetworkBody;
import io.sentry.util.network.NetworkRequestData;
import io.sentry.util.network.ReplayNetworkRequestOrResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\f\u0010\u0011\u001a\u00020\u0012*\u00020\bH\u0002J\f\u0010\u0013\u001a\u00020\r*\u00020\rH\u0002J\f\u0010\u0014\u001a\u00020\u0015*\u00020\bH\u0002RN\u0010\u0006\u001aB\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \t*\u0004\u0018\u00010\n0\n \t* \u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \t*\u0004\u0018\u00010\n0\n\u0018\u00010\u000b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lio/sentry/android/replay/DefaultReplayBreadcrumbConverter;", "Lio/sentry/ReplayBreadcrumbConverter;", RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/SentryOptions;", "(Lio/sentry/SentryOptions;)V", "()V", "httpNetworkDetails", "", "Lio/sentry/Breadcrumb;", "kotlin.jvm.PlatformType", "Lio/sentry/util/network/NetworkRequestData;", "", "lastConnectivityState", "", "convert", "Lio/sentry/rrweb/RRWebEvent;", RRWebBreadcrumbEvent.EVENT_TAG, "isValidForRRWebSpan", "", "snakeToCamelCase", "toRRWebSpanEvent", "Lio/sentry/rrweb/RRWebSpanEvent;", "Companion", "ReplayBeforeBreadcrumbCallback", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class DefaultReplayBreadcrumbConverter implements ReplayBreadcrumbConverter {
    private static final int MAX_HTTP_NETWORK_DETAILS = 32;
    private static final HashSet<String> supportedNetworkData;
    private final Map<Breadcrumb, NetworkRequestData> httpNetworkDetails;
    private String lastConnectivityState;
    private SentryOptions options;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC4028k snakecasePattern$delegate = C4029l.a(EnumC4031n.NONE, DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2.INSTANCE);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR$\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/sentry/android/replay/DefaultReplayBreadcrumbConverter$Companion;", "", "<init>", "()V", "LOd/o;", "snakecasePattern$delegate", "Lfc/k;", "getSnakecasePattern", "()LOd/o;", "snakecasePattern", "", "MAX_HTTP_NETWORK_DETAILS", "I", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "supportedNetworkData", "Ljava/util/HashSet;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final o getSnakecasePattern() {
            return (o) DefaultReplayBreadcrumbConverter.snakecasePattern$delegate.getValue();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\bH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/sentry/android/replay/DefaultReplayBreadcrumbConverter$ReplayBeforeBreadcrumbCallback;", "Lio/sentry/SentryOptions$BeforeBreadcrumbCallback;", "delegate", "(Lio/sentry/android/replay/DefaultReplayBreadcrumbConverter;Lio/sentry/SentryOptions$BeforeBreadcrumbCallback;)V", "execute", "Lio/sentry/Breadcrumb;", RRWebBreadcrumbEvent.EVENT_TAG, "hint", "Lio/sentry/Hint;", "extractNetworkRequestDataFromHint", "Lio/sentry/util/network/NetworkRequestData;", "breadcrumbHint", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class ReplayBeforeBreadcrumbCallback implements SentryOptions.BeforeBreadcrumbCallback {
        private final SentryOptions.BeforeBreadcrumbCallback delegate;

        public ReplayBeforeBreadcrumbCallback(SentryOptions.BeforeBreadcrumbCallback beforeBreadcrumbCallback) {
            this.delegate = beforeBreadcrumbCallback;
        }

        private final NetworkRequestData extractNetworkRequestDataFromHint(Breadcrumb breadcrumb, Hint breadcrumbHint) {
            if (!AbstractC4862t.a(breadcrumb.getType(), "http") && !AbstractC4862t.a(breadcrumb.getCategory(), "http")) {
                return null;
            }
            Object obj = breadcrumbHint.get(TypeCheckHint.SENTRY_REPLAY_NETWORK_DETAILS);
            if (obj instanceof NetworkRequestData) {
                return (NetworkRequestData) obj;
            }
            return null;
        }

        @Override // io.sentry.SentryOptions.BeforeBreadcrumbCallback
        public Breadcrumb execute(Breadcrumb breadcrumb, Hint hint) {
            AbstractC4862t.e(breadcrumb, "breadcrumb");
            AbstractC4862t.e(hint, "hint");
            SentryOptions.BeforeBreadcrumbCallback beforeBreadcrumbCallback = this.delegate;
            if (beforeBreadcrumbCallback != null) {
                breadcrumb = beforeBreadcrumbCallback.execute(breadcrumb, hint);
            }
            if (breadcrumb != null) {
                DefaultReplayBreadcrumbConverter defaultReplayBreadcrumbConverter = DefaultReplayBreadcrumbConverter.this;
                NetworkRequestData networkRequestDataExtractNetworkRequestDataFromHint = extractNetworkRequestDataFromHint(breadcrumb, hint);
                if (networkRequestDataExtractNetworkRequestDataFromHint != null) {
                    Map map = defaultReplayBreadcrumbConverter.httpNetworkDetails;
                    AbstractC4862t.d(map, "access$getHttpNetworkDetails$p(...)");
                    map.put(breadcrumb, networkRequestDataExtractNetworkRequestDataFromHint);
                }
            }
            return breadcrumb;
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.DefaultReplayBreadcrumbConverter$snakeToCamelCase$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOd/k;", "it", "", "invoke", "(LOd/k;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends v implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // vc.l
        public final CharSequence invoke(k it) {
            AbstractC4862t.e(it, "it");
            String upperCase = String.valueOf(H.k1(it.getValue())).toUpperCase(Locale.ROOT);
            AbstractC4862t.d(upperCase, "toUpperCase(...)");
            return upperCase;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(Response.JsonKeys.STATUS_CODE);
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add(SpanDataConvention.HTTP_RESPONSE_CONTENT_LENGTH_KEY);
        hashSet.add("http.request_content_length");
        supportedNetworkData = hashSet;
    }

    public DefaultReplayBreadcrumbConverter() {
        this.httpNetworkDetails = Collections.synchronizedMap(new LinkedHashMap<Breadcrumb, NetworkRequestData>() { // from class: io.sentry.android.replay.DefaultReplayBreadcrumbConverter$httpNetworkDetails$1
            public /* bridge */ boolean containsKey(Breadcrumb breadcrumb) {
                return super.containsKey((Object) breadcrumb);
            }

            public /* bridge */ boolean containsValue(NetworkRequestData networkRequestData) {
                return super.containsValue((Object) networkRequestData);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<Breadcrumb, NetworkRequestData>> entrySet() {
                return getEntries();
            }

            public /* bridge */ NetworkRequestData get(Breadcrumb breadcrumb) {
                return (NetworkRequestData) super.get((Object) breadcrumb);
            }

            public /* bridge */ Set<Map.Entry<Breadcrumb, NetworkRequestData>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<Breadcrumb> getKeys() {
                return super.keySet();
            }

            public /* bridge */ NetworkRequestData getOrDefault(Breadcrumb breadcrumb, NetworkRequestData networkRequestData) {
                return (NetworkRequestData) super.getOrDefault((Object) breadcrumb, networkRequestData);
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<NetworkRequestData> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Breadcrumb> keySet() {
                return getKeys();
            }

            public /* bridge */ NetworkRequestData remove(Breadcrumb breadcrumb) {
                return (NetworkRequestData) super.remove((Object) breadcrumb);
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<Breadcrumb, NetworkRequestData> eldest) {
                return size() > 32;
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<NetworkRequestData> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (obj instanceof Breadcrumb) {
                    return containsKey((Breadcrumb) obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (obj instanceof NetworkRequestData) {
                    return containsValue((NetworkRequestData) obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ NetworkRequestData get(Object obj) {
                if (obj instanceof Breadcrumb) {
                    return get((Breadcrumb) obj);
                }
                return null;
            }

            public final /* bridge */ NetworkRequestData getOrDefault(Object obj, NetworkRequestData networkRequestData) {
                return !(obj instanceof Breadcrumb) ? networkRequestData : getOrDefault((Breadcrumb) obj, networkRequestData);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ NetworkRequestData remove(Object obj) {
                if (obj instanceof Breadcrumb) {
                    return remove((Breadcrumb) obj);
                }
                return null;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (obj instanceof Breadcrumb) {
                    return get((Breadcrumb) obj);
                }
                return null;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                return !(obj instanceof Breadcrumb) ? obj2 : getOrDefault((Breadcrumb) obj, (NetworkRequestData) obj2);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (obj instanceof Breadcrumb) {
                    return remove((Breadcrumb) obj);
                }
                return null;
            }

            public /* bridge */ boolean remove(Breadcrumb breadcrumb, NetworkRequestData networkRequestData) {
                return super.remove((Object) breadcrumb, (Object) networkRequestData);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if ((obj instanceof Breadcrumb) && (obj2 instanceof NetworkRequestData)) {
                    return remove((Breadcrumb) obj, (NetworkRequestData) obj2);
                }
                return false;
            }
        });
    }

    private final boolean isValidForRRWebSpan(Breadcrumb breadcrumb) {
        Object obj = breadcrumb.getData().get("url");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || str.length() == 0) {
            return false;
        }
        Map<String, Object> data = breadcrumb.getData();
        AbstractC4862t.d(data, "getData(...)");
        if (!data.containsKey(SpanDataConvention.HTTP_START_TIMESTAMP)) {
            return false;
        }
        Map<String, Object> data2 = breadcrumb.getData();
        AbstractC4862t.d(data2, "getData(...)");
        return data2.containsKey(SpanDataConvention.HTTP_END_TIMESTAMP);
    }

    private final String snakeToCamelCase(String str) {
        return INSTANCE.getSnakecasePattern().k(str, AnonymousClass1.INSTANCE);
    }

    private final RRWebSpanEvent toRRWebSpanEvent(Breadcrumb breadcrumb) {
        double dLongValue;
        double dLongValue2;
        Object obj = breadcrumb.getData().get(SpanDataConvention.HTTP_START_TIMESTAMP);
        Object obj2 = breadcrumb.getData().get(SpanDataConvention.HTTP_END_TIMESTAMP);
        RRWebSpanEvent rRWebSpanEvent = new RRWebSpanEvent();
        rRWebSpanEvent.setTimestamp(breadcrumb.getTimestamp().getTime());
        rRWebSpanEvent.setOp("resource.http");
        Object obj3 = breadcrumb.getData().get("url");
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        rRWebSpanEvent.setDescription((String) obj3);
        if (obj instanceof Double) {
            dLongValue = ((Number) obj).doubleValue();
        } else {
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Long");
            dLongValue = ((Long) obj).longValue();
        }
        rRWebSpanEvent.setStartTimestamp(dLongValue / 1000.0d);
        if (obj2 instanceof Double) {
            dLongValue2 = ((Number) obj2).doubleValue();
        } else {
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            dLongValue2 = ((Long) obj2).longValue();
        }
        rRWebSpanEvent.setEndTimestamp(dLongValue2 / 1000.0d);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NetworkRequestData networkRequestDataRemove = this.httpNetworkDetails.remove(breadcrumb);
        if (networkRequestDataRemove != null) {
            String method = networkRequestDataRemove.getMethod();
            if (method != null) {
                linkedHashMap.put("method", method);
            }
            Integer statusCode = networkRequestDataRemove.getStatusCode();
            if (statusCode != null) {
                linkedHashMap.put("statusCode", statusCode);
            }
            Long requestBodySize = networkRequestDataRemove.getRequestBodySize();
            if (requestBodySize != null) {
                linkedHashMap.put("requestBodySize", requestBodySize);
            }
            Long responseBodySize = networkRequestDataRemove.getResponseBodySize();
            if (responseBodySize != null) {
                linkedHashMap.put("responseBodySize", responseBodySize);
            }
            ReplayNetworkRequestOrResponse request = networkRequestDataRemove.getRequest();
            if (request != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Long size = request.getSize();
                if (size != null) {
                    linkedHashMap2.put(RRWebVideoEvent.JsonKeys.SIZE, size);
                }
                NetworkBody body = request.getBody();
                if (body != null) {
                    linkedHashMap2.put(SentryLogEvent.JsonKeys.BODY, body.getBody());
                    List<NetworkBody.NetworkBodyWarning> warnings = body.getWarnings();
                    if (warnings != null) {
                        AbstractC4862t.b(warnings);
                        ArrayList arrayList = new ArrayList(C4207u.v(warnings, 10));
                        Iterator<T> it = warnings.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((NetworkBody.NetworkBodyWarning) it.next()).getValue());
                        }
                        linkedHashMap2.put("warnings", arrayList);
                    }
                }
                Map<String, String> headers = request.getHeaders();
                AbstractC4862t.d(headers, "getHeaders(...)");
                if (!headers.isEmpty()) {
                    linkedHashMap2.put("headers", request.getHeaders());
                }
                if (!linkedHashMap2.isEmpty()) {
                    linkedHashMap.put(SentryBaseEvent.JsonKeys.REQUEST, linkedHashMap2);
                }
            }
            ReplayNetworkRequestOrResponse response = networkRequestDataRemove.getResponse();
            if (response != null) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                Long size2 = response.getSize();
                if (size2 != null) {
                    linkedHashMap3.put(RRWebVideoEvent.JsonKeys.SIZE, size2);
                }
                NetworkBody body2 = response.getBody();
                if (body2 != null) {
                    linkedHashMap3.put(SentryLogEvent.JsonKeys.BODY, body2.getBody());
                    List<NetworkBody.NetworkBodyWarning> warnings2 = body2.getWarnings();
                    if (warnings2 != null) {
                        AbstractC4862t.b(warnings2);
                        ArrayList arrayList2 = new ArrayList(C4207u.v(warnings2, 10));
                        Iterator<T> it2 = warnings2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((NetworkBody.NetworkBodyWarning) it2.next()).getValue());
                        }
                        linkedHashMap3.put("warnings", arrayList2);
                    }
                }
                Map<String, String> headers2 = response.getHeaders();
                AbstractC4862t.d(headers2, "getHeaders(...)");
                if (!headers2.isEmpty()) {
                    linkedHashMap3.put("headers", response.getHeaders());
                }
                if (!linkedHashMap3.isEmpty()) {
                    linkedHashMap.put(Response.TYPE, linkedHashMap3);
                }
            }
        }
        Map<String, Object> data = breadcrumb.getData();
        AbstractC4862t.d(data, "getData(...)");
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (supportedNetworkData.contains(key)) {
                AbstractC4862t.b(key);
                linkedHashMap.put(snakeToCamelCase(F.R0(C.L(key, "content_length", "body_size", false, 4, null), ".", null, 2, null)), value);
            }
        }
        rRWebSpanEvent.setData(linkedHashMap);
        return rRWebSpanEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022f  */
    @Override // io.sentry.ReplayBreadcrumbConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.rrweb.RRWebEvent convert(io.sentry.Breadcrumb r9) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.DefaultReplayBreadcrumbConverter.convert(io.sentry.Breadcrumb):io.sentry.rrweb.RRWebEvent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultReplayBreadcrumbConverter(SentryOptions options) {
        this();
        AbstractC4862t.e(options, "options");
        this.options = options;
        if (options == null) {
            return;
        }
        options.setBeforeBreadcrumb(new ReplayBeforeBreadcrumbCallback(options.getBeforeBreadcrumb()));
    }
}
