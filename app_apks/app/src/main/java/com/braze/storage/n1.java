package com.braze.storage;

import android.content.Context;
import com.braze.support.StringUtils;
import fc.C4029l;
import fc.InterfaceC4028k;
import g1.InterfaceC4099i;
import gc.C4205s;
import i1.C4317b;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends DataStoreProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l1 f28503b = new l1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f28504c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4028k f28505a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(final Context context, final String str, final String str2) {
        super(context);
        AbstractC4862t.e(context, "context");
        this.f28505a = C4029l.b(new InterfaceC6082a() { // from class: r5.X1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.n1.a(context, str, str2);
            }
        });
    }

    public static final String a(Context context, String str, String str2) {
        return StringUtils.getCacheFileSuffix(context, str, str2);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        return createOrGetDataStore(C4205s.d(new C4317b(getContext(), "com.appboy.storage.appboy_event_storage" + ((String) this.f28505a.getValue()), null, null, new m1(), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28504c;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.events" + ((String) this.f28505a.getValue());
    }
}
