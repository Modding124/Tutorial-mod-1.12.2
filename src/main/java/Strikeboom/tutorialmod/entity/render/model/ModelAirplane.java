package Strikeboom.tutorialmod.entity.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

public class ModelAirplane extends ModelBase {
    public ModelRenderer field_78103_a3;
    public ModelRenderer field_78103_a2;
    public ModelRenderer field_78103_a1;
    public ModelRenderer field_78103_a5;
    public ModelRenderer field_78103_a4;
    public ModelRenderer field_78103_a3_1;
    public ModelRenderer field_78103_a4_1;
    public ModelRenderer field_78103_a4_2;

    public ModelAirplane() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.field_78103_a4_2 = new ModelRenderer(this, 0, 35);
        this.field_78103_a4_2.setRotationPoint(7.0F, 0.5F, -9.0F);
        this.field_78103_a4_2.addBox(-14.0F, -7.0F, -1.0F, 28, 6, 2, 0.0F);
        this.setRotateAngle(field_78103_a4_2, 0.0F, 3.141592653589793F, 0.0F);
        this.field_78103_a3 = new ModelRenderer(this, 0, 27);
        this.field_78103_a3.setRotationPoint(15.0F, 4.0F, 0.0F);
        this.field_78103_a3.addBox(-8.0F, -7.0F, -1.0F, 16, 6, 2, 0.0F);
        this.setRotateAngle(field_78103_a3, 0.0F, 1.5707963705062866F, 0.0F);
        this.field_78103_a3_1 = new ModelRenderer(this, 0, 27);
        this.field_78103_a3_1.setRotationPoint(14.0F, -24.0F, 8.0F);
        this.field_78103_a3_1.addBox(0.0F, 0.0F, 0.0F, 16, 6, 2, 0.0F);
        this.setRotateAngle(field_78103_a3_1, 0.0F, 1.5707963267948966F, 0.0F);
        this.field_78103_a4_1 = new ModelRenderer(this, 0, 35);
        this.field_78103_a4_1.setRotationPoint(7.0F, 0.5F, 9.0F);
        this.field_78103_a4_1.addBox(-14.0F, -7.0F, -1.0F, 28, 6, 2, 0.0F);
        this.setRotateAngle(field_78103_a4_1, 0.0F, 3.141592653589793F, 0.0F);
        this.field_78103_a4 = new ModelRenderer(this, 0, 35);
        this.field_78103_a4.setRotationPoint(0.0F, 4.0F, -9.0F);
        this.field_78103_a4.addBox(-14.0F, -7.0F, -1.0F, 28, 6, 2, 0.0F);
        this.setRotateAngle(field_78103_a4, 0.0F, 3.1415927410125732F, 0.0F);
        this.field_78103_a5 = new ModelRenderer(this, 0, 43);
        this.field_78103_a5.setRotationPoint(0.0F, 4.0F, 9.0F);
        this.field_78103_a5.addBox(-14.0F, -7.0F, -1.0F, 28, 6, 2, 0.0F);
        this.field_78103_a1 = new ModelRenderer(this, 0, 0);
        this.field_78103_a1.setRotationPoint(0.0F, 3.0F, 1.0F);
        this.field_78103_a1.addBox(-14.0F, -9.0F, -3.0F, 28, 16, 3, 0.0F);
        this.setRotateAngle(field_78103_a1, 1.5707963705062866F, 0.0F, 0.0F);
        this.field_78103_a2 = new ModelRenderer(this, 0, 19);
        this.field_78103_a2.setRotationPoint(-15.0F, 4.0F, 4.0F);
        this.field_78103_a2.addBox(-13.0F, -7.0F, -1.0F, 18, 6, 2, 0.0F);
        this.setRotateAngle(field_78103_a2, 0.0F, 4.71238899230957F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_78103_a4_2.offsetX, this.field_78103_a4_2.offsetY, this.field_78103_a4_2.offsetZ);
        GlStateManager.translate(this.field_78103_a4_2.rotationPointX * f5, this.field_78103_a4_2.rotationPointY * f5, this.field_78103_a4_2.rotationPointZ * f5);
        GlStateManager.scale(0.5D, 3.5D, 1.0D);
        GlStateManager.translate(-this.field_78103_a4_2.offsetX, -this.field_78103_a4_2.offsetY, -this.field_78103_a4_2.offsetZ);
        GlStateManager.translate(-this.field_78103_a4_2.rotationPointX * f5, -this.field_78103_a4_2.rotationPointY * f5, -this.field_78103_a4_2.rotationPointZ * f5);
        this.field_78103_a4_2.render(f5);
        GlStateManager.popMatrix();
        this.field_78103_a3.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_78103_a3_1.offsetX, this.field_78103_a3_1.offsetY, this.field_78103_a3_1.offsetZ);
        GlStateManager.translate(this.field_78103_a3_1.rotationPointX * f5, this.field_78103_a3_1.rotationPointY * f5, this.field_78103_a3_1.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 3.5D, 1.0D);
        GlStateManager.translate(-this.field_78103_a3_1.offsetX, -this.field_78103_a3_1.offsetY, -this.field_78103_a3_1.offsetZ);
        GlStateManager.translate(-this.field_78103_a3_1.rotationPointX * f5, -this.field_78103_a3_1.rotationPointY * f5, -this.field_78103_a3_1.rotationPointZ * f5);
        this.field_78103_a3_1.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_78103_a4_1.offsetX, this.field_78103_a4_1.offsetY, this.field_78103_a4_1.offsetZ);
        GlStateManager.translate(this.field_78103_a4_1.rotationPointX * f5, this.field_78103_a4_1.rotationPointY * f5, this.field_78103_a4_1.rotationPointZ * f5);
        GlStateManager.scale(0.5D, 3.5D, 1.0D);
        GlStateManager.translate(-this.field_78103_a4_1.offsetX, -this.field_78103_a4_1.offsetY, -this.field_78103_a4_1.offsetZ);
        GlStateManager.translate(-this.field_78103_a4_1.rotationPointX * f5, -this.field_78103_a4_1.rotationPointY * f5, -this.field_78103_a4_1.rotationPointZ * f5);
        this.field_78103_a4_1.render(f5);
        GlStateManager.popMatrix();
        this.field_78103_a4.render(f5);
        this.field_78103_a5.render(f5);
        this.field_78103_a1.render(f5);
        this.field_78103_a2.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
