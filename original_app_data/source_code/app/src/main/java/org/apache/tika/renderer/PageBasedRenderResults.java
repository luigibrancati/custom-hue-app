package org.apache.tika.renderer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.metadata.TikaPagedText;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PageBasedRenderResults extends RenderResults {
    Map<Integer, List<RenderResult>> results;

    public PageBasedRenderResults(TemporaryResources temporaryResources) {
        super(temporaryResources);
        this.results = new HashMap();
    }

    @Override // org.apache.tika.renderer.RenderResults
    public void add(RenderResult renderResult) {
        Integer num = renderResult.getMetadata().getInt(TikaPagedText.PAGE_NUMBER);
        if (num != null) {
            List<RenderResult> arrayList = this.results.get(num);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.results.put(num, arrayList);
            }
            arrayList.add(renderResult);
        }
        super.add(renderResult);
    }

    public List<RenderResult> getPage(int i10) {
        return this.results.get(Integer.valueOf(i10));
    }
}
