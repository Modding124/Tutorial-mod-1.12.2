package Strikeboom.tutorialmod.entity.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCow - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelGlowingCow extends ModelBase {
    public ModelRenderer field_78148_b0;
    public ModelRenderer field_78148_b1;
    public ModelRenderer field_78146_d;
    public ModelRenderer field_78144_f;
    public ModelRenderer field_78149_c;
    public ModelRenderer field_78147_e;
    public ModelRenderer field_78150_a0;
    public ModelRenderer field_78150_a1;
    public ModelRenderer field_78150_a2;
    public ModelRenderer shape11;
    public ModelRenderer shape11_1;
    public ModelRenderer shape11_2;
    public ModelRenderer shape14;
    public ModelRenderer field_78148_b0_1;
    public ModelRenderer field_78146_d_1;
    public ModelRenderer field_78149_c_1;
    public ModelRenderer field_78150_a0_1;
    public ModelRenderer field_78144_f_1;
    public ModelRenderer field_78148_b1_1;
    public ModelRenderer field_78150_a1_1;
    public ModelRenderer field_78147_e_1;
    public ModelRenderer field_78150_a2_1;

    public ModelGlowingCow() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.field_78148_b1 = new ModelRenderer(this, 52, 0);
        this.field_78148_b1.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.field_78148_b1.addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1, 0.0F);
        this.setRotateAngle(field_78148_b1, 1.5707963705062866F, 0.0F, 0.0F);
        this.field_78150_a0_1 = new ModelRenderer(this, 0, 0);
        this.field_78150_a0_1.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.field_78150_a0_1.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6, 0.0F);
        this.field_78150_a1 = new ModelRenderer(this, 22, 0);
        this.field_78150_a1.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.field_78150_a1.addBox(-5.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
        this.field_78144_f_1 = new ModelRenderer(this, 0, 16);
        this.field_78144_f_1.setRotationPoint(4.0F, 12.0F, -6.0F);
        this.field_78144_f_1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_78147_e = new ModelRenderer(this, 0, 16);
        this.field_78147_e.setRotationPoint(-4.0F, 12.0F, -6.0F);
        this.field_78147_e.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.shape11 = new ModelRenderer(this, 51, 7);
        this.shape11.setRotationPoint(0.0F, -7.8F, 0.0F);
        this.shape11.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.field_78150_a1_1 = new ModelRenderer(this, 22, 0);
        this.field_78150_a1_1.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.field_78150_a1_1.addBox(-5.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
        this.field_78146_d = new ModelRenderer(this, 0, 16);
        this.field_78146_d.setRotationPoint(4.0F, 12.0F, 7.0F);
        this.field_78146_d.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_78149_c = new ModelRenderer(this, 0, 16);
        this.field_78149_c.setRotationPoint(-4.0F, 12.0F, 7.0F);
        this.field_78149_c.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_78150_a2 = new ModelRenderer(this, 22, 0);
        this.field_78150_a2.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.field_78150_a2.addBox(4.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
        this.field_78148_b1_1 = new ModelRenderer(this, 52, 0);
        this.field_78148_b1_1.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.field_78148_b1_1.addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1, 0.0F);
        this.setRotateAngle(field_78148_b1_1, 1.5707963705062866F, 0.0F, 0.0F);
        this.field_78144_f = new ModelRenderer(this, 0, 16);
        this.field_78144_f.setRotationPoint(4.0F, 12.0F, -6.0F);
        this.field_78144_f.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_78150_a0 = new ModelRenderer(this, 0, 0);
        this.field_78150_a0.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.field_78150_a0.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6, 0.0F);
        this.field_78148_b0 = new ModelRenderer(this, 18, 4);
        this.field_78148_b0.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.field_78148_b0.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(field_78148_b0, 1.5707963705062866F, 0.0F, 0.0F);
        this.shape14 = new ModelRenderer(this, 30, 15);
        this.shape14.setRotationPoint(-1.8F, -15.6F, -1.8F);
        this.shape14.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
        this.field_78150_a2_1 = new ModelRenderer(this, 22, 0);
        this.field_78150_a2_1.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.field_78150_a2_1.addBox(4.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
        this.field_78146_d_1 = new ModelRenderer(this, 0, 16);
        this.field_78146_d_1.setRotationPoint(4.0F, 12.0F, 7.0F);
        this.field_78146_d_1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_78149_c_1 = new ModelRenderer(this, 0, 16);
        this.field_78149_c_1.setRotationPoint(-4.0F, 12.0F, 7.0F);
        this.field_78149_c_1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.shape11_1 = new ModelRenderer(this, 51, 7);
        this.shape11_1.setRotationPoint(0.0F, -3.2F, 0.0F);
        this.shape11_1.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.field_78148_b0_1 = new ModelRenderer(this, 18, 4);
        this.field_78148_b0_1.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.field_78148_b0_1.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(field_78148_b0_1, 1.5707963705062866F, 0.0F, 0.0F);
        this.shape11_2 = new ModelRenderer(this, 51, 7);
        this.shape11_2.setRotationPoint(0.0F, -12.7F, 0.0F);
        this.shape11_2.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.field_78147_e_1 = new ModelRenderer(this, 0, 16);
        this.field_78147_e_1.setRotationPoint(-4.0F, 12.0F, -6.0F);
        this.field_78147_e_1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_78148_b1.render(f5);
        this.field_78150_a0_1.render(f5);
        this.field_78150_a1.render(f5);
        this.field_78144_f_1.render(f5);
        this.field_78147_e.render(f5);
        this.shape11.render(f5);
        this.field_78150_a1_1.render(f5);
        this.field_78146_d.render(f5);
        this.field_78149_c.render(f5);
        this.field_78150_a2.render(f5);
        this.field_78148_b1_1.render(f5);
        this.field_78144_f.render(f5);
        this.field_78150_a0.render(f5);
        this.field_78148_b0.render(f5);
        this.shape14.render(f5);
        this.field_78150_a2_1.render(f5);
        this.field_78146_d_1.render(f5);
        this.field_78149_c_1.render(f5);
        this.shape11_1.render(f5);
        this.field_78148_b0_1.render(f5);
        this.shape11_2.render(f5);
        this.field_78147_e_1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
