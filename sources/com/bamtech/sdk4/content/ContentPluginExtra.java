package com.bamtech.sdk4.content;

import com.bamtech.sdk4.plugin.PluginExtra;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/ContentPluginExtra;", "Lcom/bamtech/sdk4/plugin/PluginExtra;", "converter", "Lcom/bamtech/sdk4/content/GraphQlResponseConverter;", "(Lcom/bamtech/sdk4/content/GraphQlResponseConverter;)V", "getConverter$plugin_content", "()Lcom/bamtech/sdk4/content/GraphQlResponseConverter;", "plugin-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ContentPlugin.kt */
public final class ContentPluginExtra implements PluginExtra {
    private final GraphQlResponseConverter converter;

    public ContentPluginExtra(GraphQlResponseConverter graphQlResponseConverter) {
        this.converter = graphQlResponseConverter;
    }

    public final GraphQlResponseConverter getConverter$plugin_content() {
        return this.converter;
    }
}
