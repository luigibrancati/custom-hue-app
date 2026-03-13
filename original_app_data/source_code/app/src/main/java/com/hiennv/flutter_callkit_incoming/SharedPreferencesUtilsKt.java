package com.hiennv.flutter_callkit_incoming;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.type.TypeReference;
import com.hiennv.flutter_callkit_incoming.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\t\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\r\u0010\u0004\u001a'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000ej\b\u0012\u0004\u0012\u00020\u0005`\u000f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aC\u0010\u0015\u001a.\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00120\u000ej\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012`\u000f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0015\u0010\u0011\u001a)\u0010\u0018\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0019\u001a+\u0010\u001b\u001a\u0004\u0018\u00010\u00132\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001d\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010\u001f\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroid/content/Context;", "context", "Lfc/H;", "initInstance", "(Landroid/content/Context;)V", "Lcom/hiennv/flutter_callkit_incoming/Data;", "data", "", "isAccepted", "addCall", "(Landroid/content/Context;Lcom/hiennv/flutter_callkit_incoming/Data;Z)V", "removeCall", "(Landroid/content/Context;Lcom/hiennv/flutter_callkit_incoming/Data;)V", "removeAllCalls", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getDataActiveCalls", "(Landroid/content/Context;)Ljava/util/ArrayList;", "", "", "", "getDataActiveCallsForFlutter", "key", "value", "putString", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "defaultValue", "getString", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "remove", "(Landroid/content/Context;Ljava/lang/String;)V", "CALLKIT_PREFERENCES_FILE_NAME", "Ljava/lang/String;", "Landroid/content/SharedPreferences;", "prefs", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences$Editor;", "editor", "Landroid/content/SharedPreferences$Editor;", "flutter_callkit_incoming_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class SharedPreferencesUtilsKt {
    private static final String CALLKIT_PREFERENCES_FILE_NAME = "flutter_callkit_incoming";
    private static SharedPreferences.Editor editor;
    private static SharedPreferences prefs;

    public static final void addCall(Context context, Data data, boolean z10) {
        Object next;
        AbstractC4862t.e(data, "data");
        Object value = Utils.INSTANCE.getGsonInstance().readValue(getString(context, "ACTIVE_CALLS", "[]"), new TypeReference<ArrayList<Data>>() { // from class: com.hiennv.flutter_callkit_incoming.SharedPreferencesUtilsKt$addCall$arrayData$1
        });
        AbstractC4862t.d(value, "readValue(...)");
        ArrayList arrayList = (ArrayList) value;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (AbstractC4862t.a((Data) next, data)) {
                    break;
                }
            }
        }
        Data data2 = (Data) next;
        if (data2 != null) {
            data2.setAccepted(z10);
        } else {
            data.setAccepted(z10);
            arrayList.add(data);
        }
        putString(context, "ACTIVE_CALLS", Utils.INSTANCE.getGsonInstance().writeValueAsString(arrayList));
    }

    public static /* synthetic */ void addCall$default(Context context, Data data, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        addCall(context, data, z10);
    }

    public static final ArrayList<Data> getDataActiveCalls(Context context) {
        Object value = Utils.INSTANCE.getGsonInstance().readValue(getString(context, "ACTIVE_CALLS", "[]"), new TypeReference<ArrayList<Data>>() { // from class: com.hiennv.flutter_callkit_incoming.SharedPreferencesUtilsKt.getDataActiveCalls.1
        });
        AbstractC4862t.d(value, "readValue(...)");
        return (ArrayList) value;
    }

    public static final ArrayList<Map<String, Object>> getDataActiveCallsForFlutter(Context context) {
        Object value = Utils.INSTANCE.getGsonInstance().readValue(getString(context, "ACTIVE_CALLS", "[]"), new TypeReference<ArrayList<Map<String, ? extends Object>>>() { // from class: com.hiennv.flutter_callkit_incoming.SharedPreferencesUtilsKt.getDataActiveCallsForFlutter.1
        });
        AbstractC4862t.d(value, "readValue(...)");
        return (ArrayList) value;
    }

    public static final String getString(Context context, String key, String defaultValue) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(defaultValue, "defaultValue");
        if (context == null) {
            return null;
        }
        initInstance(context);
        SharedPreferences sharedPreferences = prefs;
        if (sharedPreferences != null) {
            return sharedPreferences.getString(key, defaultValue);
        }
        return null;
    }

    public static /* synthetic */ String getString$default(Context context, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        return getString(context, str, str2);
    }

    private static final void initInstance(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(CALLKIT_PREFERENCES_FILE_NAME, 0);
        prefs = sharedPreferences;
        editor = sharedPreferences != null ? sharedPreferences.edit() : null;
    }

    public static final void putString(Context context, String key, String str) {
        AbstractC4862t.e(key, "key");
        if (context == null) {
            return;
        }
        initInstance(context);
        SharedPreferences.Editor editor2 = editor;
        if (editor2 != null) {
            editor2.putString(key, str);
        }
        SharedPreferences.Editor editor3 = editor;
        if (editor3 != null) {
            editor3.commit();
        }
    }

    public static final void remove(Context context, String key) {
        AbstractC4862t.e(key, "key");
        if (context == null) {
            return;
        }
        initInstance(context);
        SharedPreferences.Editor editor2 = editor;
        if (editor2 != null) {
            editor2.remove(key);
        }
        SharedPreferences.Editor editor3 = editor;
        if (editor3 != null) {
            editor3.commit();
        }
    }

    public static final void removeAllCalls(Context context) {
        putString(context, "ACTIVE_CALLS", "[]");
        remove(context, "ACTIVE_CALLS");
    }

    public static final void removeCall(Context context, Data data) {
        AbstractC4862t.e(data, "data");
        String string = getString(context, "ACTIVE_CALLS", "[]");
        AbstractC4862t.b(string);
        Log.d(JsonFactory.FORMAT_NAME_JSON, string);
        Utils.Companion companion = Utils.INSTANCE;
        Object value = companion.getGsonInstance().readValue(string, new TypeReference<ArrayList<Data>>() { // from class: com.hiennv.flutter_callkit_incoming.SharedPreferencesUtilsKt$removeCall$arrayData$1
        });
        AbstractC4862t.d(value, "readValue(...)");
        ArrayList arrayList = (ArrayList) value;
        arrayList.remove(data);
        putString(context, "ACTIVE_CALLS", companion.getGsonInstance().writeValueAsString(arrayList));
    }
}
