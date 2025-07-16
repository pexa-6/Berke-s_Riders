package net.mcreator.berkesriders.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.berkesriders.world.inventory.DragonTutorialGUI2Menu;
import net.mcreator.berkesriders.network.DragonTutorialGUI2ButtonMessage;
import net.mcreator.berkesriders.BerkesRidersMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DragonTutorialGUI2Screen extends AbstractContainerScreen<DragonTutorialGUI2Menu> {
	private final static HashMap<String, Object> guistate = DragonTutorialGUI2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_arrow_left;
	ImageButton imagebutton_arrow_right;

	public DragonTutorialGUI2Screen(DragonTutorialGUI2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 256;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("berkes_riders:textures/screens/dragon_tutorial_gui_2.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		imagebutton_arrow_left = new ImageButton(this.leftPos + 5, this.topPos + 146, 16, 16, 0, 0, 16, new ResourceLocation("berkes_riders:textures/screens/atlas/imagebutton_arrow_left.png"), 16, 32, e -> {
			if (true) {
				BerkesRidersMod.PACKET_HANDLER.sendToServer(new DragonTutorialGUI2ButtonMessage(0, x, y, z));
				DragonTutorialGUI2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_left", imagebutton_arrow_left);
		this.addRenderableWidget(imagebutton_arrow_left);
		imagebutton_arrow_right = new ImageButton(this.leftPos + 232, this.topPos + 145, 16, 16, 0, 0, 16, new ResourceLocation("berkes_riders:textures/screens/atlas/imagebutton_arrow_right.png"), 16, 32, e -> {
			if (true) {
				BerkesRidersMod.PACKET_HANDLER.sendToServer(new DragonTutorialGUI2ButtonMessage(1, x, y, z));
				DragonTutorialGUI2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_right", imagebutton_arrow_right);
		this.addRenderableWidget(imagebutton_arrow_right);
	}
}
