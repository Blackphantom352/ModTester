// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modeloz_bird extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer right_wing;
	private final ModelRenderer left_wing;
	private final ModelRenderer head;
	private final ModelRenderer beak;
	private final ModelRenderer beak_top;
	private final ModelRenderer tail;
	private final ModelRenderer tail_middle_r1;
	private final ModelRenderer left_edge_r1;

	public Modeloz_bird() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(26, 1).addBox(-2.0F, -8.0F, -4.0F, 4.0F, 3.0F, 8.0F, 0.0F, false);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(-2.0F, 16.5F, 0.0F);
		right_wing.setTextureOffset(24, 19).addBox(-8.0F, -0.5F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		right_wing.setTextureOffset(0, 9).addBox(-17.0F, -0.5F, -4.0F, 9.0F, 1.0F, 8.0F, 0.0F, false);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(2.0F, 16.5F, 0.0F);
		left_wing.setTextureOffset(0, 18).addBox(0.0F, -0.5F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		left_wing.setTextureOffset(0, 0).addBox(8.0F, -0.5F, -4.0F, 9.0F, 1.0F, 8.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, -2.0F);
		head.setTextureOffset(22, 28).addBox(-1.5F, -8.0F, -5.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 3).addBox(-1.5F, -8.0F, -6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 4).addBox(1.25F, -7.0F, -6.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-1.25F, -7.0F, -6.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);

		beak = new ModelRenderer(this);
		beak.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(beak);
		beak.setTextureOffset(0, 5).addBox(-0.5F, -6.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		beak_top = new ModelRenderer(this);
		beak_top.setRotationPoint(0.0F, 0.0F, 0.0F);
		beak.addChild(beak_top);
		beak_top.setTextureOffset(0, 0).addBox(-1.0F, -8.0F, -8.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		beak_top.setTextureOffset(31, 31).addBox(-1.0F, -7.0F, -8.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		beak_top.setTextureOffset(0, 9).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 24.0F, 0.0F);
		tail.setTextureOffset(0, 27).addBox(-1.5F, -8.001F, 4.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);

		tail_middle_r1 = new ModelRenderer(this);
		tail_middle_r1.setRotationPoint(-4.0F, -5.0F, 4.0F);
		tail.addChild(tail_middle_r1);
		setRotationAngle(tail_middle_r1, 0.0F, -0.1571F, 0.0F);
		tail_middle_r1.setTextureOffset(12, 28).addBox(2.0449F, -3.0F, -0.5224F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		left_edge_r1 = new ModelRenderer(this);
		left_edge_r1.setRotationPoint(2.0F, -5.0F, 4.0F);
		tail.addChild(left_edge_r1);
		setRotationAngle(left_edge_r1, 0.0F, 0.1571F, 0.0F);
		left_edge_r1.setTextureOffset(28, 12).addBox(-2.0449F, -3.0F, -0.2224F, 2.0F, 1.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.right_wing.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_wing.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
	}
}