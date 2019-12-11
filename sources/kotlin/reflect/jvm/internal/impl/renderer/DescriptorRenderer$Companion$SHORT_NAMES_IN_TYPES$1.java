package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.C13145v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SHORT;

/* compiled from: DescriptorRenderer.kt */
final class DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1 extends C12881k implements Function1<DescriptorRendererOptions, C13145v> {
    public static final DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1 INSTANCE = new DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1();

    DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DescriptorRendererOptions) obj);
        return C13145v.f29587a;
    }

    public final void invoke(DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.setClassifierNamePolicy(SHORT.INSTANCE);
        descriptorRendererOptions.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
    }
}
