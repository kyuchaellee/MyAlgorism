package controller;

import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet(name = "PicServlet", value = "/pic1")
public class PicServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("image/jpg");

        BufferedImage image =
                new BufferedImage(400,300,BufferedImage.TYPE_INT_RGB);

        //붓
        Graphics graphics = image.getGraphics();
        //물감
        graphics.setColor(Color.pink);
        graphics.fillRect(0,0,400,300);
        int[] arr = new int[6];
        graphics.setColor(Color.black);

        for(int i = 0; i<6;i++){

        int value =(int)(Math.random()*45)+1;
        int count = 0;

        for(int j = 0; j<i;j++){
            if(value==arr[j]){
                count += 1;
                break;
            }
        }

        if(count == 0) {
            arr[i] = value;
            Font plainFont = new Font("Serif", Font.BOLD, 20);
            graphics.setFont(plainFont);

            graphics.drawString("" + value, (i * 50) + 10, 140);
        }else{
            i--;
        }

        }
        OutputStream os = response.getOutputStream();

        ImageIO.write(image,"gif",os);
    }

}
