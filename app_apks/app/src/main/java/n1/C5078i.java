package n1;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: n1.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5078i extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f40507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f40508b;

    /* JADX INFO: renamed from: n1.i$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f40509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f40510b = new AtomicInteger(0);

        public a(Object obj) {
            this.f40509a = obj;
        }

        public final void a() {
            this.f40510b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f40509a).afterTextChanged(editable);
        }

        public final boolean b(Object obj) {
            return obj instanceof AbstractC5074e;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f40509a).beforeTextChanged(charSequence, i10, i11, i12);
        }

        public final void c() {
            this.f40510b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f40510b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f40509a).onSpanAdded(spannable, obj, i10, i11);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
            if (this.f40510b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f40509a).onSpanChanged(spannable, obj, i10, i11, i12, i13);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f40510b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f40509a).onSpanRemoved(spannable, obj, i10, i11);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f40509a).onTextChanged(charSequence, i10, i11, i12);
        }
    }

    public C5078i(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f40508b = new ArrayList();
        X0.h.h(cls, "watcherClass cannot be null");
        this.f40507a = cls;
    }

    public static C5078i c(Class cls, CharSequence charSequence) {
        return new C5078i(cls, charSequence);
    }

    public void a() {
        b();
    }

    public final void b() {
        for (int i10 = 0; i10 < this.f40508b.size(); i10++) {
            ((a) this.f40508b.get(i10)).a();
        }
    }

    public void d() {
        i();
        e();
    }

    public final void e() {
        for (int i10 = 0; i10 < this.f40508b.size(); i10++) {
            ((a) this.f40508b.get(i10)).onTextChanged(this, 0, length(), length());
        }
    }

    public final a f(Object obj) {
        for (int i10 = 0; i10 < this.f40508b.size(); i10++) {
            a aVar = (a) this.f40508b.get(i10);
            if (aVar.f40509a == obj) {
                return aVar;
            }
        }
        return null;
    }

    public final boolean g(Class cls) {
        return this.f40507a == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public Object[] getSpans(int i10, int i11, Class cls) {
        if (!g(cls)) {
            return super.getSpans(i10, i11, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i10, i11, a.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, aVarArr.length);
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            objArr[i12] = aVarArr[i12].f40509a;
        }
        return objArr;
    }

    public final boolean h(Object obj) {
        return obj != null && g(obj.getClass());
    }

    public final void i() {
        for (int i10 = 0; i10 < this.f40508b.size(); i10++) {
            ((a) this.f40508b.get(i10)).c();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVarF;
        if (h(obj)) {
            aVarF = f(obj);
            if (aVarF != null) {
                obj = aVarF;
            }
        } else {
            aVarF = null;
        }
        super.removeSpan(obj);
        if (aVarF != null) {
            this.f40508b.remove(aVarF);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f40508b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return new C5078i(this.f40507a, this, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        b();
        super.replace(i10, i11, charSequence);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    public C5078i(Class cls, CharSequence charSequence, int i10, int i11) {
        super(charSequence, i10, i11);
        this.f40508b = new ArrayList();
        X0.h.h(cls, "watcherClass cannot be null");
        this.f40507a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        b();
        super.replace(i10, i11, charSequence, i12, i13);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }
}
