package io.flutter.plugins.sharedpreferences;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface SharedPreferencesListEncoder {
    List<String> decode(String str);

    String encode(List<String> list);
}
