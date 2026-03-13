package T9;

import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.InterfaceC2757m;
import androidx.lifecycle.y;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import t6.InterfaceC5848f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface a extends Closeable, InterfaceC2757m, InterfaceC5848f {
    Task c0(Y9.a aVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @y(AbstractC2754j.a.ON_DESTROY)
    void close();
}
