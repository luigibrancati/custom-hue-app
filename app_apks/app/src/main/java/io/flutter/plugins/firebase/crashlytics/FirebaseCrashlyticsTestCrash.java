package io.flutter.plugins.firebase.crashlytics;

import androidx.annotation.Keep;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FirebaseCrashlyticsTestCrash extends RuntimeException {
    public FirebaseCrashlyticsTestCrash() {
        super("This is a test crash caused by calling .crash() in Dart.");
    }
}
