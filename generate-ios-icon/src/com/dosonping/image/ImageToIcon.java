package com.dosonping.image;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageToIcon {
	public static void main(String[] args) throws IOException {
		String fileName = "D:\\bmrb\\道桥养护app\\二期\\icon0115.png";
//		String targetFloat = "D:\\bmrb\\道桥养护app\\二期\\icon\\";
//		ImageToIcon.scaleIcons(fileName, targetFloat);
		String targetFloatIconSet = "D:\\bmrb\\道桥养护app\\二期\\icon\\iconset";
		ImageToIcon.scaleIconsForAppiconset(fileName, targetFloatIconSet);
		String targetFloatImageset = "D:\\bmrb\\道桥养护app\\二期\\icon\\imageset";
		ImageToIcon.scaleIconsForAppImageset(fileName, targetFloatImageset);
//		String fileName = "D:\\bmrb\\道桥养护app\\二期\\启动图片\\ios\\20481496.png";
//		String targetFloat = "D:\\bmrb\\道桥养护app\\二期\\splash\\";
//		ImageToIcon.cutIcons(fileName, targetFloat);
		
	}
	//剪切所有图标
	public static void cutIcons(String fileName, String targetFloat) throws IOException {
		System.out.println("开始生成欢迎屏幕图片....");
		//源图片大小：2048X1496
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-568h@2x.png", 640, 1136);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-667h@2x.png", 750, 1334);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Landscape-568h@2x.png", 1136, 640);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Landscape-667h@2x.png", 1334, 750);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Landscape@2x~ipad.png", 2048, 1496);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Landscape~ipad.png", 1024, 748);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Landscape7~ipad.png", 1024, 768);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Portrait~ipad.png", 768, 1004);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Portrait7~ipad.png", 768, 1024);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default.png", 320, 480);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default@2x.png", 640, 960);
		System.out.println("生成欢迎屏幕图片结束....");
	}
	public static void cutIconsHeight(String fileName, String targetFloat) throws IOException {
		
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-736h@3x.png", 1242, 2208);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-812h@3x.png", 1125, 2436);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Landscape-736h@3x.png", 2208, 1242);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Landscape-812h@3x.png", 2436, 1125);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Landscape7@2x~ipad.png", 2048, 1536);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Portrait@2x~ipad.png", 1536, 2008);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Portrait7@2x~ipad.png", 1536, 2048);
	}
	public static void cutIcon(String fileName, String targetFloat, String targetFileName, int width, int height) throws IOException {
		BufferedImage bufferedImage = ImageIO.read(new File(fileName));
		//图片宽高
		int imageWidth = bufferedImage.getWidth();
		int imageHeight = bufferedImage.getHeight();
		//图片中心坐标
		int centerWidth = imageWidth/2;
		int centerHeight = imageHeight/2;
		//起始点坐标
		int startX = centerWidth - width/2;
		int startY = centerHeight - height/2;
		BufferedImage subimage = bufferedImage.getSubimage(startX, startY, width, height);
		
		
		//BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//Graphics2D createGraphics = bi.createGraphics();
		//createGraphics.drawImage(scaledInstance, 0, 0, width, height, null);
		ImageIO.write(subimage, "png", new File(targetFloat + targetFileName));
	}
	//缩放所有图标
	public static void scaleIcons(String fileName, String targetFloat) throws IOException {


		System.out.println("开始生成图标...");
		ImageToIcon.generateIcon(fileName, targetFloat, "icon29.png", 29);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon40.png", 40);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon50.png", 50);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon57.png", 57);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon58.png", 58);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon60.png", 60);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon72.png", 72);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon76.png", 76);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon80.png", 80);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon87.png", 87);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon100.png", 100);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon114.png", 114);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon120.png", 120);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon144.png", 144);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon152.png", 152);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon180.png", 180);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon1024.png", 1024);
		System.out.println("生成图标完成...");
	}
	public static void scaleIconsForAppImageset(String fileName, String targetFloat) throws IOException {
		System.out.println("开始生成AppImageset图标...");
		ImageToIcon.generateIcon(fileName, targetFloat, "icon120.png", 120);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon180.png", 180);
		System.out.println("生成AppImageset图标完成...");
	}
	public static void scaleIconsForAppiconset(String fileName, String targetFloat) throws IOException {
		System.out.println("开始生成Appiconset图标...");
		ImageToIcon.generateIcon(fileName, targetFloat, "icon40.png", 40);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon58.png", 58);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon60.png", 60);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon80.png", 80);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon87.png", 87);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon120-1.png", 120);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon120.png", 120);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon180.png", 180);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon1024.png", 1024);
		System.out.println("生成Appiconset图标完成...");
	}
	
	//缩放单个图标
	public static void generateIcon(String fileName, String targetFloat, String targetFileName, int width) throws IOException {
		
		BufferedImage bufferedImage = ImageIO.read(new File(fileName));
		int height = width;
		Image scaledInstance = bufferedImage.getScaledInstance(width, height, Image.SCALE_DEFAULT);
		
		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D createGraphics = bi.createGraphics();
		createGraphics.drawImage(scaledInstance, 0, 0, width, height, null);
		ImageIO.write(bi, "png", new File(targetFloat + targetFileName));
	}

}
