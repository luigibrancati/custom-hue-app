package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;
import fc.C4015H;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "a", "I", "c", "()I", "d", "(I)V", "maxClientId", "", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "clientNames", "Landroid/os/RemoteCallbackList;", "Landroidx/room/IMultiInstanceInvalidationCallback;", "Landroid/os/RemoteCallbackList;", "()Landroid/os/RemoteCallbackList;", "callbackList", "Landroidx/room/IMultiInstanceInvalidationService$Stub;", "Landroidx/room/IMultiInstanceInvalidationService$Stub;", "binder", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int maxClientId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Map clientNames = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final RemoteCallbackList callbackList = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final IMultiInstanceInvalidationService.Stub binder = new IMultiInstanceInvalidationService.Stub() { // from class: androidx.room.MultiInstanceInvalidationService$binder$1
        @Override // androidx.room.IMultiInstanceInvalidationService
        public int A4(IMultiInstanceInvalidationCallback callback, String name) {
            AbstractC4862t.e(callback, "callback");
            int i10 = 0;
            if (name == null) {
                return 0;
            }
            RemoteCallbackList callbackList = this.f24593a.getCallbackList();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f24593a;
            synchronized (callbackList) {
                try {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.getMaxClientId() + 1);
                    int maxClientId = multiInstanceInvalidationService.getMaxClientId();
                    if (multiInstanceInvalidationService.getCallbackList().register(callback, Integer.valueOf(maxClientId))) {
                        multiInstanceInvalidationService.getClientNames().put(Integer.valueOf(maxClientId), name);
                        i10 = maxClientId;
                    } else {
                        multiInstanceInvalidationService.d(multiInstanceInvalidationService.getMaxClientId() - 1);
                        multiInstanceInvalidationService.getMaxClientId();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i10;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void z3(int clientId, String[] tables) {
            AbstractC4862t.e(tables, "tables");
            RemoteCallbackList callbackList = this.f24593a.getCallbackList();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f24593a;
            synchronized (callbackList) {
                String str = (String) multiInstanceInvalidationService.getClientNames().get(Integer.valueOf(clientId));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.getCallbackList().beginBroadcast();
                for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.getCallbackList().getBroadcastCookie(i10);
                        AbstractC4862t.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.getClientNames().get(num);
                        if (clientId != iIntValue && AbstractC4862t.a(str, str2)) {
                            try {
                                ((IMultiInstanceInvalidationCallback) multiInstanceInvalidationService.getCallbackList().getBroadcastItem(i10)).V0(tables);
                                C4015H c4015h = C4015H.f34254a;
                            } catch (RemoteException e10) {
                                Log.w("ROOM", "Error invoking a remote callback", e10);
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.getCallbackList().finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.getCallbackList().finishBroadcast();
                C4015H c4015h2 = C4015H.f34254a;
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void z6(IMultiInstanceInvalidationCallback callback, int clientId) {
            AbstractC4862t.e(callback, "callback");
            RemoteCallbackList callbackList = this.f24593a.getCallbackList();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f24593a;
            synchronized (callbackList) {
                multiInstanceInvalidationService.getCallbackList().unregister(callback);
            }
        }
    };

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends RemoteCallbackList {
        public a() {
        }

        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(IMultiInstanceInvalidationCallback callback, Object cookie) {
            AbstractC4862t.e(callback, "callback");
            AbstractC4862t.e(cookie, "cookie");
            MultiInstanceInvalidationService.this.getClientNames().remove((Integer) cookie);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final RemoteCallbackList getCallbackList() {
        return this.callbackList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Map getClientNames() {
        return this.clientNames;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaxClientId() {
        return this.maxClientId;
    }

    public final void d(int i10) {
        this.maxClientId = i10;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC4862t.e(intent, "intent");
        return this.binder;
    }
}
