package com.example.javasimpleapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class JavaSimpleAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(JavaSimpleAppApplication.class);
        builder.headless(false);
        ConfigurableApplicationContext context = builder.run(args);
    }

    @Override
    public void run(String... args) throws Exception {

        JFrame f = new JFrame("Test swing app");
        JButton b=new JButton("click");//creating instance of JButton
        b.setBounds(130,100,100, 40);//x axis, y axis, width, height

        f.add(b);//adding button in JFrame

        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible


    }
}
