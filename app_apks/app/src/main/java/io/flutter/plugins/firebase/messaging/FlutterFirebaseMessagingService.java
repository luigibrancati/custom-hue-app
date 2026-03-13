package io.flutter.plugins.firebase.messaging;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.T;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        FlutterFirebaseTokenLiveData.getInstance().postToken(str);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(T t10) {
    }
}
