package Ga;

import Ga.SavedWidgetConfig;
import android.content.Context;
import android.content.SharedPreferences;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import he.AbstractC4304b;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPluginKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f4674d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f4676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f4677c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public u(Context context) {
        AbstractC4862t.e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(SharedPreferencesPluginKt.SHARED_PREFERENCES_NAME, 0);
        AbstractC4862t.d(sharedPreferences, "getSharedPreferences(...)");
        this.f4675a = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("widgets_plugin_cache", 0);
        AbstractC4862t.d(sharedPreferences2, "getSharedPreferences(...)");
        this.f4676b = sharedPreferences2;
        this.f4677c = new n(sharedPreferences2.getBoolean("showWidgetLogs", false));
    }

    public static final WidgetItem k(String str, boolean z10, WidgetItem item) {
        AbstractC4862t.e(item, "item");
        return AbstractC4862t.a(item.getId(), str) ? WidgetItem.e(item, null, 0, null, null, null, z10, 31, null) : item;
    }

    public final void b(int i10) {
        String string = this.f4675a.getString("flutter.nativeWidgetConfiguration", null);
        if (string != null) {
            List listD = ((SavedWidgetConfig) AbstractC4304b.f36582d.a(SavedWidgetConfig.INSTANCE.serializer(), string)).getConfiguration().getItems();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listD) {
                if (((WidgetItem) obj).getNativeId() != i10) {
                    arrayList.add(obj);
                }
            }
            this.f4675a.edit().putString("flutter.nativeWidgetConfiguration", AbstractC4304b.f36582d.b(SavedWidgetConfig.INSTANCE.serializer(), new SavedWidgetConfig(new WidgetModel(arrayList)))).apply();
            this.f4677c.a("deleteWidgetItems -> nativeId: " + i10);
        }
    }

    public final WidgetItem c(String widgetItemId) {
        AbstractC4862t.e(widgetItemId, "widgetItemId");
        this.f4677c.a("getWidgetItem -> widgetItemId: " + widgetItemId);
        Object obj = null;
        String string = this.f4675a.getString("flutter.nativeWidgetConfiguration", null);
        if (string == null) {
            return null;
        }
        Iterator it = ((SavedWidgetConfig) AbstractC4304b.f36582d.a(SavedWidgetConfig.INSTANCE.serializer(), string)).getConfiguration().getItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (AbstractC4862t.a(((WidgetItem) next).getId(), widgetItemId)) {
                obj = next;
                break;
            }
        }
        return (WidgetItem) obj;
    }

    public final List d(int i10) {
        this.f4677c.a("getWidgetItems -> nativeId: " + i10);
        String string = this.f4675a.getString("flutter.nativeWidgetConfiguration", null);
        return string != null ? g(string, i10) : C4206t.k();
    }

    public final long e() {
        this.f4677c.a("retrieveAppCallBackHandle");
        return this.f4676b.getLong("appCallBackHandle", 0L);
    }

    public final long f() {
        this.f4677c.a("retrievePluginCallBackHandle");
        return this.f4676b.getLong("pluginCallbackHandle", 0L);
    }

    public final List g(String sharedWidgetData, int i10) {
        AbstractC4862t.e(sharedWidgetData, "sharedWidgetData");
        SavedWidgetConfig gVar = (SavedWidgetConfig) AbstractC4304b.f36582d.a(SavedWidgetConfig.INSTANCE.serializer(), sharedWidgetData);
        this.f4677c.a("retrieveWidgetModel -> result: " + gVar);
        List listD = gVar.getConfiguration().getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (((WidgetItem) obj).getNativeId() == i10) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void h(long j10) {
        this.f4677c.a("saveAppCallBackHandle -> value: " + j10);
        this.f4676b.edit().putLong("appCallBackHandle", j10).apply();
    }

    public final void i(long j10) {
        this.f4677c.a("savePluginCallBackHandle -> value: " + j10);
        this.f4676b.edit().putLong("pluginCallbackHandle", j10).apply();
    }

    public final void j(final String widgetItemId, final boolean z10) {
        AbstractC4862t.e(widgetItemId, "widgetItemId");
        this.f4677c.a("setShouldTurnOff -> widgetItemId: " + widgetItemId + ", shouldTurnOff: " + z10);
        String string = this.f4675a.getString("flutter.nativeWidgetConfiguration", null);
        if (string != null) {
            AbstractC4304b.a aVar = AbstractC4304b.f36582d;
            SavedWidgetConfig.Companion bVar = SavedWidgetConfig.INSTANCE;
            List listX0 = C4179C.X0(((SavedWidgetConfig) aVar.a(bVar.serializer(), string)).getConfiguration().getItems());
            listX0.replaceAll(new UnaryOperator() { // from class: Ga.t
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return u.k(widgetItemId, z10, (WidgetItem) obj);
                }
            });
            this.f4675a.edit().putString("flutter.nativeWidgetConfiguration", aVar.b(bVar.serializer(), new SavedWidgetConfig(new WidgetModel(listX0)))).apply();
        }
    }

    public final void l(int i10, int i11) {
        int i12;
        this.f4677c.a("updateWidgetWithNativeIdToId -> oldNativeId: " + i10 + " | newNativeId: " + i11);
        String string = this.f4675a.getString("flutter.nativeWidgetConfiguration", null);
        if (string != null) {
            List<WidgetItem> listD = ((SavedWidgetConfig) AbstractC4304b.f36582d.a(SavedWidgetConfig.INSTANCE.serializer(), string)).getConfiguration().getItems();
            ArrayList arrayList = new ArrayList(C4207u.v(listD, 10));
            for (WidgetItem widgetItemE : listD) {
                if (widgetItemE.getNativeId() != i10) {
                    i12 = i11;
                } else {
                    i12 = i11;
                    widgetItemE = WidgetItem.e(widgetItemE, null, i12, null, null, null, false, 61, null);
                }
                arrayList.add(widgetItemE);
                i11 = i12;
            }
            this.f4675a.edit().putString("flutter.nativeWidgetConfiguration", AbstractC4304b.f36582d.b(SavedWidgetConfig.INSTANCE.serializer(), new SavedWidgetConfig(new WidgetModel(arrayList)))).apply();
        }
    }
}
