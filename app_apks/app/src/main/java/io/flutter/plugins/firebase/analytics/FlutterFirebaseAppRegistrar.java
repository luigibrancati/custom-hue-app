package io.flutter.plugins.firebase.analytics;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import gc.C4205s;
import java.util.List;
import kotlin.Metadata;
import o8.C5233c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/firebase/analytics/FlutterFirebaseAppRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lo8/c;", "getComponents", "()Ljava/util/List;", "firebase_analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FlutterFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5233c> getComponents() {
        return C4205s.d(j9.h.b(BuildConfig.LIBRARY_NAME, BuildConfig.LIBRARY_VERSION));
    }
}
