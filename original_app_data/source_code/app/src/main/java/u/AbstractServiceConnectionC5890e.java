package u;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;

/* JADX INFO: renamed from: u.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceConnectionC5890e implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f45013a;

    /* JADX INFO: renamed from: u.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC5888c {
        public a(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
            super(iCustomTabsService, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, AbstractC5888c abstractC5888c);

    public void b(Context context) {
        this.f45013a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f45013a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        a(componentName, new a(ICustomTabsService.Stub.asInterface(iBinder), componentName, this.f45013a));
    }
}
