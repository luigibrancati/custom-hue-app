package io.flutter.plugin.localization;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class LocalizationPlugin {
    private final Context context;
    private final LocalizationChannel localizationChannel;

    @SuppressLint({"AppBundleLocaleChanges", "DiscouragedApi"})
    final LocalizationChannel.LocalizationMessageHandler localizationMessageHandler;

    public LocalizationPlugin(Context context, LocalizationChannel localizationChannel) {
        LocalizationChannel.LocalizationMessageHandler localizationMessageHandler = new LocalizationChannel.LocalizationMessageHandler() { // from class: io.flutter.plugin.localization.LocalizationPlugin.1
            @Override // io.flutter.embedding.engine.systemchannels.LocalizationChannel.LocalizationMessageHandler
            public String getStringResource(String str, String str2) {
                Context contextCreateConfigurationContext = LocalizationPlugin.this.context;
                if (str2 != null) {
                    Locale localeLocaleFromString = LocalizationPlugin.localeFromString(str2);
                    Configuration configuration = new Configuration(LocalizationPlugin.this.context.getResources().getConfiguration());
                    configuration.setLocale(localeLocaleFromString);
                    contextCreateConfigurationContext = LocalizationPlugin.this.context.createConfigurationContext(configuration);
                }
                int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, "string", LocalizationPlugin.this.context.getPackageName());
                if (identifier != 0) {
                    return contextCreateConfigurationContext.getResources().getString(identifier);
                }
                return null;
            }
        };
        this.localizationMessageHandler = localizationMessageHandler;
        this.context = context;
        this.localizationChannel = localizationChannel;
        localizationChannel.setLocalizationMessageHandler(localizationMessageHandler);
    }

    public static Locale localeFromString(String str) {
        Locale.Builder builder = new Locale.Builder();
        String[] strArrSplit = str.replace('_', '-').split("-");
        builder.setLanguage(strArrSplit[0]);
        int i10 = 1;
        if (strArrSplit.length > 1 && strArrSplit[1].length() == 4) {
            builder.setScript(strArrSplit[1]);
            i10 = 2;
        }
        if (strArrSplit.length > i10 && strArrSplit[i10].length() >= 2 && strArrSplit[i10].length() <= 3) {
            builder.setRegion(strArrSplit[i10]);
        }
        return builder.build();
    }

    public Locale resolveNativeLocale(List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        LocaleList locales = this.context.getResources().getConfiguration().getLocales();
        int size = locales.size();
        for (int i10 = 0; i10 < size; i10++) {
            Locale locale = locales.get(i10);
            String language = locale.getLanguage();
            if (!locale.getScript().isEmpty()) {
                language = language + "-" + locale.getScript();
            }
            if (!locale.getCountry().isEmpty()) {
                language = language + "-" + locale.getCountry();
            }
            arrayList.add(new Locale.LanguageRange(language));
            arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
            arrayList.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
        }
        Locale localeLookup = Locale.lookup(arrayList, list);
        return localeLookup != null ? localeLookup : list.get(0);
    }

    public void sendLocalesToFlutter(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(locales.get(i10));
        }
        this.localizationChannel.sendLocales(arrayList);
    }
}
