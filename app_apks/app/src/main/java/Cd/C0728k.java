package Cd;

import Lc.InterfaceC1177e;
import Lc.d0;
import io.flutter.plugins.firebase.analytics.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import od.AbstractC5283e;

/* JADX INFO: renamed from: Cd.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C0728k extends AbstractC0719b implements e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1177e f1375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f1376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Collection f1377f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0728k(InterfaceC1177e interfaceC1177e, List list, Collection collection, Bd.n nVar) {
        super(nVar);
        if (interfaceC1177e == null) {
            t(0);
        }
        if (list == null) {
            t(1);
        }
        if (collection == null) {
            t(2);
        }
        if (nVar == null) {
            t(3);
        }
        this.f1375d = interfaceC1177e;
        this.f1376e = Collections.unmodifiableList(new ArrayList(list));
        this.f1377f = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void t(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = Constants.PARAMETERS;
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Cd.AbstractC0723f
    public Collection f() {
        Collection collection = this.f1377f;
        if (collection == null) {
            t(6);
        }
        return collection;
    }

    @Override // Cd.e0
    public List getParameters() {
        List list = this.f1376e;
        if (list == null) {
            t(4);
        }
        return list;
    }

    @Override // Cd.AbstractC0723f
    public Lc.d0 j() {
        d0.a aVar = d0.a.f8751a;
        if (aVar == null) {
            t(7);
        }
        return aVar;
    }

    @Override // Cd.e0
    public boolean r() {
        return true;
    }

    public String toString() {
        return AbstractC5283e.m(this.f1375d).b();
    }

    @Override // Cd.AbstractC0729l, Cd.e0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public InterfaceC1177e q() {
        InterfaceC1177e interfaceC1177e = this.f1375d;
        if (interfaceC1177e == null) {
            t(5);
        }
        return interfaceC1177e;
    }
}
