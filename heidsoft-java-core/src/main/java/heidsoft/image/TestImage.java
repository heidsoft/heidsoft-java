package heidsoft.image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


/**
 * @program: heidsoft-java
 * @description: 测试图片写入中文乱码
 * @author: heidsoft
 * @create: 2018-10-25 21:43
 **/
public class TestImage {
    public static void main(String[] args) throws IOException {
        BufferedImage buffImg = ImageIO.read(new File("/root/1.png"));
        Graphics2D g = buffImg.createGraphics();
        Color color = new Color(206,255,22);
        Font f = new Font("宋体",Font.BOLD, 30);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g.setFont(f);
        g.setColor(color);
        FontMetrics fm = g.getFontMetrics(f);
        g.drawString("中31国你我他", 50, 50);
        ImageIO.write(buffImg, "png", new File("/root/test.png"));

    }
}
