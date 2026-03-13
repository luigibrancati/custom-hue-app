package b7;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: b7.O, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2866O implements InterfaceC2869c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collection f25412a;

    public C2866O(Collection collection) {
        this.f25412a = collection;
    }

    @Override // b7.InterfaceC2869c
    public final /* bridge */ /* synthetic */ Object a(Task task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f25412a);
        return Tasks.e(arrayList);
    }
}
