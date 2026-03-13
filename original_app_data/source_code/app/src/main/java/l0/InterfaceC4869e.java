package l0;

import androidx.compose.ui.node.NodeCoordinator;
import v0.InterfaceC6028c;
import vc.p;

/* JADX INFO: renamed from: l0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4869e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39822a = a.f39823b;

    /* JADX INFO: renamed from: l0.e$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b extends InterfaceC4869e {
        @Override // l0.InterfaceC4869e
        default Object a(Object obj, p pVar) {
            return pVar.invoke(obj, this);
        }
    }

    /* JADX INFO: renamed from: l0.e$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c implements InterfaceC6028c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f39825b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f39827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f39828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public NodeCoordinator f39829f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f39830g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f39824a = this;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f39826c = -1;

        @Override // v0.InterfaceC6028c
        public final c a() {
            return this.f39824a;
        }

        public final int b() {
            return this.f39826c;
        }

        public final c c() {
            return this.f39828e;
        }

        public final NodeCoordinator d() {
            return this.f39829f;
        }

        public final int e() {
            return this.f39825b;
        }

        public final c f() {
            return this.f39827d;
        }

        public final boolean g() {
            return this.f39830g;
        }

        public final void h(int i10) {
            this.f39826c = i10;
        }

        public void i(NodeCoordinator nodeCoordinator) {
            this.f39829f = nodeCoordinator;
        }
    }

    Object a(Object obj, p pVar);

    default InterfaceC4869e b(InterfaceC4869e interfaceC4869e) {
        return interfaceC4869e == f39822a ? this : new C4866b(this, interfaceC4869e);
    }

    /* JADX INFO: renamed from: l0.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC4869e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a f39823b = new a();

        public String toString() {
            return "Modifier";
        }

        @Override // l0.InterfaceC4869e
        public InterfaceC4869e b(InterfaceC4869e interfaceC4869e) {
            return interfaceC4869e;
        }

        @Override // l0.InterfaceC4869e
        public Object a(Object obj, p pVar) {
            return obj;
        }
    }
}
