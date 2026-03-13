package Q5;

import Od.C;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MethodChannel.Result f13930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f13932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13933e;

    public e(MethodChannel.Result flutterResult, boolean z10) {
        AbstractC4862t.e(flutterResult, "flutterResult");
        this.f13929a = "SpeechToTextPlugin";
        this.f13930b = flutterResult;
        this.f13931c = z10;
    }

    public final String a(Locale locale) {
        String displayName = locale.getDisplayName();
        AbstractC4862t.d(displayName, "getDisplayName(...)");
        String strK = C.K(displayName, ':', ' ', false, 4, null);
        return locale.getLanguage() + "_" + locale.getCountry() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + strK;
    }

    public final void b(List list) {
        Locale locale = Locale.getDefault();
        ArrayList arrayList = new ArrayList();
        AbstractC4862t.b(locale);
        arrayList.add(a(locale));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!AbstractC4862t.a(locale.toLanguageTag(), str)) {
                    Locale localeForLanguageTag = Locale.forLanguageTag(str);
                    AbstractC4862t.b(localeForLanguageTag);
                    arrayList.add(a(localeForLanguageTag));
                }
            }
        }
        this.f13930b.success(arrayList);
    }

    public final void c(String str) {
        if (this.f13931c) {
            Log.d(this.f13929a, str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(intent, "intent");
        c("Received extra language broadcast");
        Bundle resultExtras = getResultExtras(true);
        if (resultExtras.containsKey("android.speech.extra.LANGUAGE_PREFERENCE")) {
            this.f13933e = resultExtras.getString("android.speech.extra.LANGUAGE_PREFERENCE");
        }
        if (!resultExtras.containsKey("android.speech.extra.SUPPORTED_LANGUAGES")) {
            c("No extra supported languages");
            b(new ArrayList());
        } else {
            c("Extra supported languages");
            ArrayList<String> stringArrayList = resultExtras.getStringArrayList("android.speech.extra.SUPPORTED_LANGUAGES");
            this.f13932d = stringArrayList;
            b(stringArrayList);
        }
    }
}
