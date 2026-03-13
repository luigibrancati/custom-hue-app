package c1;

import android.widget.ListView;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class f extends AbstractViewOnTouchListenerC2927a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ListView f25553s;

    public f(ListView listView) {
        super(listView);
        this.f25553s = listView;
    }

    @Override // c1.AbstractViewOnTouchListenerC2927a
    public boolean a(int i10) {
        return false;
    }

    @Override // c1.AbstractViewOnTouchListenerC2927a
    public boolean b(int i10) {
        ListView listView = this.f25553s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i11 = firstVisiblePosition + childCount;
        if (i10 > 0) {
            if (i11 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i10 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // c1.AbstractViewOnTouchListenerC2927a
    public void j(int i10, int i11) {
        this.f25553s.scrollListBy(i11);
    }
}
